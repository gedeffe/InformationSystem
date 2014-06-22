/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.requirement.components;

// Start of user code for imports
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectStrictFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.obeonetwork.dsl.requirement.Category;
import org.obeonetwork.dsl.requirement.Requirement;
import org.obeonetwork.dsl.requirement.RequirementPackage;
import org.obeonetwork.dsl.requirement.parts.CategoryPropertiesEditionPart;
import org.obeonetwork.dsl.requirement.parts.RequirementViewsRepository;

// End of user code

/**
 * 
 * 
 */
public class CategoryPropertiesEditionComponent extends
		SinglePartPropertiesEditingComponent {

	public static String CATEGORY_PART = "Category"; //$NON-NLS-1$

	/**
	 * Settings for requirements ReferencesTable
	 */
	protected ReferencesTableSettings requirementsSettings;

	/**
	 * Settings for subCategories ReferencesTable
	 */
	protected ReferencesTableSettings subCategoriesSettings;

	/**
	 * Settings for referencedObject ReferencesTable
	 */
	private ReferencesTableSettings referencedObjectSettings;

	/**
	 * Default constructor
	 * 
	 */
	public CategoryPropertiesEditionComponent(
			final PropertiesEditingContext editingContext,
			final EObject category, final String editing_mode) {
		super(editingContext, category, editing_mode);
		this.parts = new String[] { CATEGORY_PART };
		this.repositoryKey = RequirementViewsRepository.class;
		this.partKey = RequirementViewsRepository.Category.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object,
	 *      int, org.eclipse.emf.ecore.EObject,
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(final Object key, final int kind, final EObject elt,
			final ResourceSet allResource) {
		this.setInitializing(true);
		if ((this.editingPart != null) && (key == this.partKey)) {
			this.editingPart.setContext(elt, allResource);

			final Category category = (Category) elt;
			final CategoryPropertiesEditionPart categoryPart = (CategoryPropertiesEditionPart) this.editingPart;
			// init values
			if (this.isAccessible(RequirementViewsRepository.Category.Category_.id)) {
				categoryPart.setId(EEFConverterUtil.convertToString(
						EcorePackage.Literals.ESTRING, category.getId()));
			}

			if (this.isAccessible(RequirementViewsRepository.Category.Category_.name)) {
				categoryPart.setName(EEFConverterUtil.convertToString(
						EcorePackage.Literals.ESTRING, category.getName()));
			}

			if (this.isAccessible(RequirementViewsRepository.Category.Category_.requirements)) {
				this.requirementsSettings = new ReferencesTableSettings(
						category,
						RequirementPackage.eINSTANCE.getCategory_Requirements());
				categoryPart.initRequirements(this.requirementsSettings);
			}
			if (this.isAccessible(RequirementViewsRepository.Category.Category_.subCategories)) {
				this.subCategoriesSettings = new ReferencesTableSettings(
						category,
						RequirementPackage.eINSTANCE
								.getCategory_SubCategories());
				categoryPart.initSubCategories(this.subCategoriesSettings);
			}
			if (this.isAccessible(RequirementViewsRepository.Category.Category_.referencedObject)) {
				this.referencedObjectSettings = new ReferencesTableSettings(
						category,
						RequirementPackage.eINSTANCE
								.getCategory_ReferencedObject());
				categoryPart
						.initReferencedObject(this.referencedObjectSettings);
			}
			// init filters

			if (this.isAccessible(RequirementViewsRepository.Category.Category_.requirements)) {
				categoryPart.addFilterToRequirements(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
					 *      java.lang.Object, java.lang.Object)
					 */
					@Override
					public boolean select(final Viewer viewer,
							final Object parentElement, final Object element) {
						return ((element instanceof String) && element
								.equals("")) || (element instanceof Requirement); //$NON-NLS-1$ 
					}

				});
				// Start of user code for additional businessfilters for
				// requirements
				// End of user code
			}
			if (this.isAccessible(RequirementViewsRepository.Category.Category_.subCategories)) {
				categoryPart.addFilterToSubCategories(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
					 *      java.lang.Object, java.lang.Object)
					 */
					@Override
					public boolean select(final Viewer viewer,
							final Object parentElement, final Object element) {
						return ((element instanceof String) && element
								.equals("")) || (element instanceof Category); //$NON-NLS-1$ 
					}

				});
				// Start of user code for additional businessfilters for
				// subCategories
				// End of user code
			}
			if (this.isAccessible(RequirementViewsRepository.Category.Category_.referencedObject)) {
				categoryPart.addFilterToReferencedObject(new ViewerFilter() {

					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
					 *      java.lang.Object, java.lang.Object)
					 */
					@Override
					public boolean select(final Viewer viewer,
							final Object parentElement, final Object element) {
						if (element instanceof EObject) {
							return (!categoryPart
									.isContainedInReferencedObjectTable((EObject) element));
						}
						return (element instanceof String)
								&& element.equals("");
					}

				});
				categoryPart
						.addFilterToReferencedObject(new EObjectStrictFilter(
								EcorePackage.Literals.EOBJECT));
				// Start of user code for additional businessfilters for
				// referencedObject
				// End of user code
			}
			// init values for referenced views

			// init filters for referenced views

		}
		this.setInitializing(false);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	@Override
	public EStructuralFeature associatedFeature(final Object editorKey) {
		if (editorKey == RequirementViewsRepository.Category.Category_.id) {
			return RequirementPackage.eINSTANCE.getCategory_Id();
		}
		if (editorKey == RequirementViewsRepository.Category.Category_.name) {
			return RequirementPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == RequirementViewsRepository.Category.Category_.requirements) {
			return RequirementPackage.eINSTANCE.getCategory_Requirements();
		}
		if (editorKey == RequirementViewsRepository.Category.Category_.subCategories) {
			return RequirementPackage.eINSTANCE.getCategory_SubCategories();
		}
		if (editorKey == RequirementViewsRepository.Category.Category_.referencedObject) {
			return RequirementPackage.eINSTANCE.getCategory_ReferencedObject();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	@Override
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		final Category category = (Category) this.semanticObject;
		if (RequirementViewsRepository.Category.Category_.id == event
				.getAffectedEditor()) {
			category.setId((java.lang.String) EEFConverterUtil
					.createFromString(EcorePackage.Literals.ESTRING,
							(String) event.getNewValue()));
		}
		if (RequirementViewsRepository.Category.Category_.name == event
				.getAffectedEditor()) {
			category.setName((java.lang.String) EEFConverterUtil
					.createFromString(EcorePackage.Literals.ESTRING,
							(String) event.getNewValue()));
		}
		if (RequirementViewsRepository.Category.Category_.requirements == event
				.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				final EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(
						this.editingContext, this, this.requirementsSettings,
						this.editingContext.getAdapterFactory());
				final PropertiesEditingProvider provider = (PropertiesEditingProvider) this.editingContext
						.getAdapterFactory().adapt(this.semanticObject,
								PropertiesEditingProvider.class);
				if (provider != null) {
					final PropertiesEditingPolicy policy = provider
							.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				final EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
						this.editingContext, this,
						(EObject) event.getNewValue(),
						this.editingContext.getAdapterFactory());
				final PropertiesEditingProvider provider = (PropertiesEditingProvider) this.editingContext
						.getAdapterFactory().adapt(
								(EObject) event.getNewValue(),
								PropertiesEditingProvider.class);
				if (provider != null) {
					final PropertiesEditingPolicy editionPolicy = provider
							.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				this.requirementsSettings.removeFromReference((EObject) event
						.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				this.requirementsSettings.move(event.getNewIndex(),
						(Requirement) event.getNewValue());
			}
		}
		if (RequirementViewsRepository.Category.Category_.subCategories == event
				.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				final EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(
						this.editingContext, this, this.subCategoriesSettings,
						this.editingContext.getAdapterFactory());
				final PropertiesEditingProvider provider = (PropertiesEditingProvider) this.editingContext
						.getAdapterFactory().adapt(this.semanticObject,
								PropertiesEditingProvider.class);
				if (provider != null) {
					final PropertiesEditingPolicy policy = provider
							.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				final EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
						this.editingContext, this,
						(EObject) event.getNewValue(),
						this.editingContext.getAdapterFactory());
				final PropertiesEditingProvider provider = (PropertiesEditingProvider) this.editingContext
						.getAdapterFactory().adapt(
								(EObject) event.getNewValue(),
								PropertiesEditingProvider.class);
				if (provider != null) {
					final PropertiesEditingPolicy editionPolicy = provider
							.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				this.subCategoriesSettings.removeFromReference((EObject) event
						.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				this.subCategoriesSettings.move(event.getNewIndex(),
						(Category) event.getNewValue());
			}
		}
		if (RequirementViewsRepository.Category.Category_.referencedObject == event
				.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				this.referencedObjectSettings
						.setToReference((List<EObject>) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void updatePart(final Notification msg) {
		super.updatePart(msg);
		if (this.editingPart.isVisible()) {
			final CategoryPropertiesEditionPart categoryPart = (CategoryPropertiesEditionPart) this.editingPart;
			if (RequirementPackage.eINSTANCE.getCategory_Id().equals(
					msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (categoryPart != null)
					&& this.isAccessible(RequirementViewsRepository.Category.Category_.id)) {
				if (msg.getNewValue() != null) {
					categoryPart.setId(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					categoryPart.setId("");
				}
			}
			if (RequirementPackage.eINSTANCE.getNamedElement_Name().equals(
					msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (categoryPart != null)
					&& this.isAccessible(RequirementViewsRepository.Category.Category_.name)) {
				if (msg.getNewValue() != null) {
					categoryPart.setName(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					categoryPart.setName("");
				}
			}
			if (RequirementPackage.eINSTANCE.getCategory_Requirements().equals(
					msg.getFeature())
					&& this.isAccessible(RequirementViewsRepository.Category.Category_.requirements)) {
				categoryPart.updateRequirements();
			}
			if (RequirementPackage.eINSTANCE.getCategory_SubCategories()
					.equals(msg.getFeature())
					&& this.isAccessible(RequirementViewsRepository.Category.Category_.subCategories)) {
				categoryPart.updateSubCategories();
			}
			if (RequirementPackage.eINSTANCE.getCategory_ReferencedObject()
					.equals(msg.getFeature())
					&& this.isAccessible(RequirementViewsRepository.Category.Category_.referencedObject)) {
				categoryPart.updateReferencedObject();
			}

		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		final NotificationFilter filter = new EStructuralFeatureNotificationFilter(
				RequirementPackage.eINSTANCE.getCategory_Id(),
				RequirementPackage.eINSTANCE.getNamedElement_Name(),
				RequirementPackage.eINSTANCE.getCategory_Requirements(),
				RequirementPackage.eINSTANCE.getCategory_SubCategories(),
				RequirementPackage.eINSTANCE.getCategory_ReferencedObject());
		return new NotificationFilter[] { filter, };
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(final IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (RequirementViewsRepository.Category.Category_.id == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(RequirementPackage.eINSTANCE
										.getCategory_Id().getEAttributeType(),
										(String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							RequirementPackage.eINSTANCE.getCategory_Id()
									.getEAttributeType(), newValue);
				}
				if (RequirementViewsRepository.Category.Category_.name == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(RequirementPackage.eINSTANCE
										.getNamedElement_Name()
										.getEAttributeType(), (String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							RequirementPackage.eINSTANCE.getNamedElement_Name()
									.getEAttributeType(), newValue);
				}
			} catch (final IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (final WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
