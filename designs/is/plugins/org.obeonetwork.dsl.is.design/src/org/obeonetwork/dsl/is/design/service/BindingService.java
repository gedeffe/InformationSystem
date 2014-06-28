package org.obeonetwork.dsl.is.design.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.ui.business.api.session.UserSession;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.obeonetwork.dsl.entity.Block;
import org.obeonetwork.dsl.entity.Entity;
import org.obeonetwork.dsl.entity.Root;
import org.obeonetwork.dsl.environment.BindingInfo;
import org.obeonetwork.dsl.environment.BindingRegistry;
import org.obeonetwork.dsl.environment.BoundableElement;
import org.obeonetwork.dsl.environment.EnvironmentFactory;
import org.obeonetwork.dsl.environment.StructuredType;
import org.obeonetwork.dsl.environment.Type;
import org.obeonetwork.dsl.environment.bindingdialect.DBindingEditor;
import org.obeonetwork.dsl.soa.Category;
import org.obeonetwork.dsl.soa.DTORegistry;
import org.obeonetwork.dsl.soa.ServiceDTO;
import org.obeonetwork.dsl.soa.System;

public class BindingService {

	private static final String BINDING_EDITOR_DESCRIPTION_NAME = "Binding Details";

	public BindingInfo openBindingEditor(final BindingInfo bindingInfo) {
		DBindingEditor editor = null;

		final Session session = SessionManager.INSTANCE.getSession(bindingInfo);

		// Find an editor to open
		final Collection<DRepresentation> representations = DialectManager.INSTANCE
				.getRepresentations(bindingInfo, session);
		for (final DRepresentation representation : representations) {
			if (representation instanceof DBindingEditor) {
				editor = (DBindingEditor) representation;
				break;
			}
		}

		// Create an editor if needed
		if (editor == null) {
			final RepresentationDescription representationDescription = this
					.getBindingEditorRepresentation(session);
			if (representationDescription != null) {
				final DRepresentation representation = DialectManager.INSTANCE
						.createRepresentation(
								this.computeBindingEditorName(bindingInfo),
								bindingInfo, representationDescription,
								session, new NullProgressMonitor());
				if ((representation != null)
						&& (representation instanceof DBindingEditor)) {
					editor = (DBindingEditor) representation;
				}
			}
		}
		// Open the editor
		if (editor != null) {
			UserSession.from(session).openRepresentation(
					new StructuredSelection(editor));
		}

		return bindingInfo;
	}

	public String computeBindingEditorName(final BindingInfo bindingInfo) {
		String name = "Binding ";
		name += this.getBoundElementName(bindingInfo.getLeft());
		name += " - ";
		name += this.getBoundElementName(bindingInfo.getRight());
		return name;
	}

	private String getBoundElementName(final EObject object) {
		if ((object != null) && (object instanceof StructuredType)) {
			return ((StructuredType) object).getName();
		}
		return null;
	}

	private RepresentationDescription getBindingEditorRepresentation(
			final Session session) {
		for (final Viewpoint vp : session.getSelectedViewpoints(true)) {
			for (final RepresentationDescription representationDescription : vp
					.getOwnedRepresentations()) {
				if (representationDescription.getName().equals(
						BINDING_EDITOR_DESCRIPTION_NAME)) {
					return representationDescription;
				}
			}
		}
		return null;
	}

	public BindingInfo reconnectBindingTarget(final BindingInfo bindingInfo,
			final BoundableElement oldTarget, final BoundableElement newTarget) {
		if (bindingInfo.getLeft().equals(oldTarget)) {
			bindingInfo.setLeft(newTarget);
		} else if (bindingInfo.getRight().equals(oldTarget)) {
			bindingInfo.setRight(newTarget);
		}

		return bindingInfo;
	}

	public boolean checkIfReconnectBindingIsPossible(final Category category,
			final BindingInfo bindingInfo, final EObject firstElement,
			final EObject secondElement) {
		// Get opposite side
		final EObject opposite = this.getBindingOpposite(bindingInfo,
				firstElement);

		final Collection<StructuredType> dtos = this
				.getDTOAndChildrenDTOs(category);
		if (dtos.contains(opposite)) {
			// Reconnection is possible on any dto or entity (not yet bound)
			return !this.getBoundElementsWithTarget(category, opposite)
					.contains(secondElement);
		} else {
			// Reconnection is possible only on main dtos (not yet bound)
			return dtos.contains(secondElement)
					&& !this.getBoundElementsWithTarget(category, opposite)
							.contains(secondElement);
		}
	}

	public BindingInfo changeBindingTarget(final BindingInfo bindingInfo,
			final BoundableElement firstElement,
			final BoundableElement secondElement) {
		if (bindingInfo.getLeft().equals(firstElement)) {
			bindingInfo.setRight(secondElement);
		} else if (bindingInfo.getRight().equals(firstElement)) {
			bindingInfo.setLeft(secondElement);
		}

		return bindingInfo;
	}

	public Collection<StructuredType> getAllBindableElementsFor(
			final Category category, final EObject target) {
		if (target instanceof ServiceDTO) {
			return this.internalGetAllBindableElementsFor(category,
					(ServiceDTO) target);
		} else if (target instanceof Entity) {
			return this.internalGetAllBindableElementsFor(category,
					(Entity) target);
		}
		return Collections.emptyList();
	}

	public Collection<StructuredType> internalGetAllBindableElementsFor(
			final Category category, final ServiceDTO dto) {
		// Get all DTOs in category and direct sub categories
		final Collection<StructuredType> dtos = this
				.getDTOAndChildrenDTOs(category);

		if (dtos.contains(dto)) {
			return this.getAllBindableElements(dto);
		} else {
			return dtos;
		}
	}

	public Collection<StructuredType> internalGetAllBindableElementsFor(
			final Category category, final Entity entity) {
		return this.getDTOAndChildrenDTOs(category);
	}

	public Collection<StructuredType> getAllBindableElements(
			final ServiceDTO dto) {
		// Collect all entities and dtos
		final Collection<StructuredType> bindableElements = new ArrayList<StructuredType>();

		// First, get all semantic resources in session
		final Collection<Resource> semanticResources = EcoreService
				.getAllSemanticResourcesInSession(dto);

		for (final Resource resource : semanticResources) {
			final TreeIterator<EObject> iterator = EcoreUtil.getAllContents(
					resource, true);
			while (iterator.hasNext()) {
				final EObject eObject = iterator.next();
				if ((eObject instanceof ServiceDTO)
						|| (eObject instanceof Entity)) {
					if (!eObject.equals(dto)) {
						bindableElements.add((StructuredType) eObject);
					}
				} else if (!((eObject instanceof Root)
						|| (eObject instanceof Block)
						|| (eObject instanceof org.obeonetwork.dsl.overview.Root)
						|| (eObject instanceof System)
						|| (eObject instanceof DTORegistry) || (eObject instanceof Category))) {
					iterator.prune();
				}
			}
		}

		return bindableElements;
	}

	public EObject getBindingOpposite(final BindingInfo bindingInfo,
			final EObject opposite) {
		if (bindingInfo.getLeft().equals(opposite)) {
			return bindingInfo.getRight();
		} else if (bindingInfo.getRight().equals(opposite)) {
			return bindingInfo.getLeft();
		}
		return null;
	}

	public Collection<BindingInfo> getRelatedBindingInfos(
			final Category category) {
		final List<BindingInfo> results = new ArrayList<BindingInfo>();

		// Collect all DTOs in this category and its direct sub-categories
		final Collection<StructuredType> dtos = this
				.getDTOAndChildrenDTOs(category);

		// Check every BindingInfo instance
		final BindingRegistry registry = this
				.getGlobalBindingRegistry(category);
		for (final BindingInfo bindingInfo : registry.getBindingInfos()) {
			if (dtos.contains(bindingInfo.getLeft())
					|| dtos.contains(bindingInfo.getRight())) {
				results.add(bindingInfo);
			}
		}

		return results;
	}

	public Collection<ServiceDTO> getBoundExternalDTOs(final Category category) {
		final List<ServiceDTO> results = new ArrayList<ServiceDTO>();

		// Collect all DTOs in this category and its direct sub-categories
		final Collection<StructuredType> dtos = this
				.getDTOAndChildrenDTOs(category);

		for (final BindingInfo bi : this.getGlobalBindingRegistry(category)
				.getBindingInfos()) {
			if (dtos.contains(bi.getLeft()) && !dtos.contains(bi.getRight())
					&& (bi.getRight() instanceof ServiceDTO)) {
				results.add((ServiceDTO) bi.getRight());
			} else if (dtos.contains(bi.getRight())
					&& !dtos.contains(bi.getLeft())
					&& (bi.getLeft() instanceof ServiceDTO)) {
				results.add((ServiceDTO) bi.getLeft());
			}
		}

		return results;
	}

	public Collection<EObject> getBoundElementsWithTarget(
			final Category category, final EObject target) {
		final Collection<EObject> results = new HashSet<EObject>();
		for (final BindingInfo bindingInfo : this
				.getRelatedBindingInfos(category)) {
			if (bindingInfo.getLeft().equals(target)) {
				results.add(bindingInfo.getRight());
			} else if (bindingInfo.getRight().equals(target)) {
				results.add(bindingInfo.getLeft());
			}
		}
		return results;
	}

	public Collection<Entity> getBoundEntities(final Category category) {
		final List<Entity> results = new ArrayList<Entity>();

		// Get the binding infos to consider
		final Collection<BindingInfo> bindingInfos = this
				.getRelatedBindingInfos(category);

		for (final BindingInfo bindingInfo : bindingInfos) {
			if (bindingInfo.getLeft() instanceof Entity) {
				results.add((Entity) bindingInfo.getLeft());
			}
			if (bindingInfo.getRight() instanceof Entity) {
				results.add((Entity) bindingInfo.getRight());
			}
		}

		return results;
	}

	public Collection<ServiceDTO> getBoundOwnDTOs(final Category category) {
		final List<ServiceDTO> results = new ArrayList<ServiceDTO>();

		for (final ServiceDTO serviceDTO : this.getBoundDTO(this
				.getGlobalBindingRegistry(category))) {
			if (category.getTypes().contains(serviceDTO)) {
				results.add(serviceDTO);
			}
		}

		return results;
	}

	private Collection<ServiceDTO> getBoundDTO(final BindingRegistry registry) {
		final Set<ServiceDTO> dtos = new HashSet<ServiceDTO>();
		for (final BindingInfo bindingInfo : registry.getBindingInfos()) {
			if (bindingInfo.getLeft() instanceof ServiceDTO) {
				dtos.add((ServiceDTO) bindingInfo.getLeft());
			}
			if (bindingInfo.getRight() instanceof ServiceDTO) {
				dtos.add((ServiceDTO) bindingInfo.getRight());
			}
		}
		return dtos;
	}

	public Collection<StructuredType> getDTOAndChildrenDTOs(
			final Category category) {
		final List<StructuredType> dtos = new ArrayList<StructuredType>();
		dtos.addAll(this.getDTOs(category));
		for (final Category subCategory : category.getOwnedCategories()) {
			dtos.addAll(this.getDTOs(subCategory));
		}
		return dtos;
	}

	private Collection<ServiceDTO> getDTOs(final Category category) {
		final List<ServiceDTO> dtos = new ArrayList<ServiceDTO>();
		for (final Type type : category.getTypes()) {
			if (type instanceof ServiceDTO) {
				dtos.add((ServiceDTO) type);
			}
		}
		return dtos;
	}

	public BindingRegistry getGlobalBindingRegistry(final ServiceDTO dto) {
		return this.getGlobalBindingRegistry((Category) dto.eContainer());
	}

	public BindingRegistry getGlobalBindingRegistry(final Category category) {
		final System system = this.getContainingSystem(category);
		if (system.getBindingRegistries().isEmpty()) {
			final BindingRegistry bindingRegistry = EnvironmentFactory.eINSTANCE
					.createBindingRegistry();
			system.getBindingRegistries().add(bindingRegistry);
			system.eResource().getContents().add(bindingRegistry);
			return bindingRegistry;
		} else {
			return system.getBindingRegistries().get(0);
		}
	}

	private System getContainingSystem(final EObject object) {
		final EObject container = object.eContainer();
		if (container != null) {
			if (container instanceof System) {
				return (System) container;
			} else {
				return this.getContainingSystem(container);
			}
		}
		return null;
	}
}
