/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.cinematic.components;

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
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.obeonetwork.dsl.cinematic.CinematicPackage;
import org.obeonetwork.dsl.cinematic.CinematicRoot;
import org.obeonetwork.dsl.cinematic.flow.Flow;
import org.obeonetwork.dsl.cinematic.parts.CinematicRootPropertiesEditionPart;
import org.obeonetwork.dsl.cinematic.parts.CinematicViewsRepository;
import org.obeonetwork.dsl.cinematic.toolkits.Toolkit;
import org.obeonetwork.dsl.cinematic.toolkits.ToolkitsPackage;
import org.obeonetwork.dsl.cinematic.view.ViewContainer;
import org.obeonetwork.dsl.environment.EnvironmentPackage;

/**
 * 
 * @generated
 */
public class CinematicRootCinematicRootPropertiesEditionComponent extends
		SinglePartPropertiesEditingComponent {

	/**
	 * @generated
	 */
	public static String CINEMATICROOT_PART = "CinematicRoot"; //$NON-NLS-1$

	/**
	 * Settings for flows ReferencesTable
	 */
	protected ReferencesTableSettings flowsSettings;

	/**
	 * Settings for viewContainers ReferencesTable
	 */
	protected ReferencesTableSettings viewContainersSettings;

	/**
	 * Settings for subPackages ReferencesTable
	 */
	protected ReferencesTableSettings subPackagesSettings;

	/**
	 * Settings for toolkits ReferencesTable
	 */
	private ReferencesTableSettings toolkitsSettings;

	/**
	 * Default constructor
	 * 
	 * @generated
	 */
	public CinematicRootCinematicRootPropertiesEditionComponent(
			final PropertiesEditingContext editingContext,
			final EObject cinematicRoot, final String editing_mode) {
		super(editingContext, cinematicRoot, editing_mode);
		this.parts = new String[] { CINEMATICROOT_PART };
		this.repositoryKey = CinematicViewsRepository.class;
		this.partKey = CinematicViewsRepository.CinematicRoot.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object,
	 *      int, org.eclipse.emf.ecore.EObject,
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * @generated
	 */
	@Override
	public void initPart(final Object key, final int kind, final EObject elt,
			final ResourceSet allResource) {
		this.setInitializing(true);
		if ((this.editingPart != null) && (key == this.partKey)) {
			this.editingPart.setContext(elt, allResource);

			final CinematicRoot cinematicRoot = (CinematicRoot) elt;
			final CinematicRootPropertiesEditionPart cinematicRootPart = (CinematicRootPropertiesEditionPart) this.editingPart;
			// init values
			if (this.isAccessible(CinematicViewsRepository.CinematicRoot.Properties.description)) {
				cinematicRootPart.setDescription(EEFConverterUtil
						.convertToString(EcorePackage.Literals.ESTRING,
								cinematicRoot.getDescription()));
			}

			if (this.isAccessible(CinematicViewsRepository.CinematicRoot.Properties.name)) {
				cinematicRootPart
						.setName(EEFConverterUtil.convertToString(
								EcorePackage.Literals.ESTRING,
								cinematicRoot.getName()));
			}

			if (this.isAccessible(CinematicViewsRepository.CinematicRoot.Properties.flows)) {
				this.flowsSettings = new ReferencesTableSettings(cinematicRoot,
						CinematicPackage.eINSTANCE.getAbstractPackage_Flows());
				cinematicRootPart.initFlows(this.flowsSettings);
			}
			if (this.isAccessible(CinematicViewsRepository.CinematicRoot.Properties.viewContainers)) {
				this.viewContainersSettings = new ReferencesTableSettings(
						cinematicRoot,
						CinematicPackage.eINSTANCE
								.getAbstractPackage_ViewContainers());
				cinematicRootPart
						.initViewContainers(this.viewContainersSettings);
			}
			if (this.isAccessible(CinematicViewsRepository.CinematicRoot.Properties.subPackages)) {
				this.subPackagesSettings = new ReferencesTableSettings(
						cinematicRoot,
						CinematicPackage.eINSTANCE
								.getAbstractPackage_SubPackages());
				cinematicRootPart.initSubPackages(this.subPackagesSettings);
			}
			if (this.isAccessible(CinematicViewsRepository.CinematicRoot.Properties.toolkits)) {
				this.toolkitsSettings = new ReferencesTableSettings(
						cinematicRoot,
						CinematicPackage.eINSTANCE.getCinematicRoot_Toolkits());
				cinematicRootPart.initToolkits(this.toolkitsSettings);
			}
			// init filters

			if (this.isAccessible(CinematicViewsRepository.CinematicRoot.Properties.flows)) {
				cinematicRootPart.addFilterToFlows(new ViewerFilter() {
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
								.equals("")) || (element instanceof Flow); //$NON-NLS-1$ 
					}

				});
			}
			if (this.isAccessible(CinematicViewsRepository.CinematicRoot.Properties.viewContainers)) {
				cinematicRootPart.addFilterToViewContainers(new ViewerFilter() {
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
								.equals("")) || (element instanceof ViewContainer); //$NON-NLS-1$ 
					}

				});
			}
			if (this.isAccessible(CinematicViewsRepository.CinematicRoot.Properties.subPackages)) {
				cinematicRootPart.addFilterToSubPackages(new ViewerFilter() {
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
								.equals("")) || (element instanceof Package); //$NON-NLS-1$ 
					}

				});
			}
			if (this.isAccessible(CinematicViewsRepository.CinematicRoot.Properties.toolkits)) {
				cinematicRootPart.addFilterToToolkits(new EObjectFilter(
						ToolkitsPackage.Literals.TOOLKIT));
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
		if (editorKey == CinematicViewsRepository.CinematicRoot.Properties.description) {
			return EnvironmentPackage.eINSTANCE.getObeoDSMObject_Description();
		}
		if (editorKey == CinematicViewsRepository.CinematicRoot.Properties.name) {
			return CinematicPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == CinematicViewsRepository.CinematicRoot.Properties.flows) {
			return CinematicPackage.eINSTANCE.getAbstractPackage_Flows();
		}
		if (editorKey == CinematicViewsRepository.CinematicRoot.Properties.viewContainers) {
			return CinematicPackage.eINSTANCE
					.getAbstractPackage_ViewContainers();
		}
		if (editorKey == CinematicViewsRepository.CinematicRoot.Properties.subPackages) {
			return CinematicPackage.eINSTANCE.getAbstractPackage_SubPackages();
		}
		if (editorKey == CinematicViewsRepository.CinematicRoot.Properties.toolkits) {
			return CinematicPackage.eINSTANCE.getCinematicRoot_Toolkits();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * @generated
	 */
	@Override
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		final CinematicRoot cinematicRoot = (CinematicRoot) this.semanticObject;
		if (CinematicViewsRepository.CinematicRoot.Properties.description == event
				.getAffectedEditor()) {
			cinematicRoot.setDescription((java.lang.String) EEFConverterUtil
					.createFromString(EcorePackage.Literals.ESTRING,
							(String) event.getNewValue()));
		}
		if (CinematicViewsRepository.CinematicRoot.Properties.name == event
				.getAffectedEditor()) {
			cinematicRoot.setName((java.lang.String) EEFConverterUtil
					.createFromString(EcorePackage.Literals.ESTRING,
							(String) event.getNewValue()));
		}
		if (CinematicViewsRepository.CinematicRoot.Properties.flows == event
				.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				final EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(
						this.editingContext, this, this.flowsSettings,
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
				this.flowsSettings.removeFromReference((EObject) event
						.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				this.flowsSettings.move(event.getNewIndex(),
						(Flow) event.getNewValue());
			}
		}
		if (CinematicViewsRepository.CinematicRoot.Properties.viewContainers == event
				.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				final EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(
						this.editingContext, this, this.viewContainersSettings,
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
				this.viewContainersSettings.removeFromReference((EObject) event
						.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				this.viewContainersSettings.move(event.getNewIndex(),
						(ViewContainer) event.getNewValue());
			}
		}
		if (CinematicViewsRepository.CinematicRoot.Properties.subPackages == event
				.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				final EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(
						this.editingContext, this, this.subPackagesSettings,
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
				this.subPackagesSettings.removeFromReference((EObject) event
						.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				this.subPackagesSettings.move(event.getNewIndex(),
						(org.obeonetwork.dsl.cinematic.Package) event
								.getNewValue());
			}
		}
		if (CinematicViewsRepository.CinematicRoot.Properties.toolkits == event
				.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Toolkit) {
					this.toolkitsSettings.addToReference((EObject) event
							.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				this.toolkitsSettings.removeFromReference((EObject) event
						.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				this.toolkitsSettings.move(event.getNewIndex(),
						(Toolkit) event.getNewValue());
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
			final CinematicRootPropertiesEditionPart cinematicRootPart = (CinematicRootPropertiesEditionPart) this.editingPart;
			if (EnvironmentPackage.eINSTANCE.getObeoDSMObject_Description()
					.equals(msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (cinematicRootPart != null)
					&& this.isAccessible(CinematicViewsRepository.CinematicRoot.Properties.description)) {
				if (msg.getNewValue() != null) {
					cinematicRootPart.setDescription(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					cinematicRootPart.setDescription("");
				}
			}
			if (CinematicPackage.eINSTANCE.getNamedElement_Name().equals(
					msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (cinematicRootPart != null)
					&& this.isAccessible(CinematicViewsRepository.CinematicRoot.Properties.name)) {
				if (msg.getNewValue() != null) {
					cinematicRootPart.setName(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					cinematicRootPart.setName("");
				}
			}
			if (CinematicPackage.eINSTANCE.getAbstractPackage_Flows().equals(
					msg.getFeature())
					&& this.isAccessible(CinematicViewsRepository.CinematicRoot.Properties.flows)) {
				cinematicRootPart.updateFlows();
			}
			if (CinematicPackage.eINSTANCE.getAbstractPackage_ViewContainers()
					.equals(msg.getFeature())
					&& this.isAccessible(CinematicViewsRepository.CinematicRoot.Properties.viewContainers)) {
				cinematicRootPart.updateViewContainers();
			}
			if (CinematicPackage.eINSTANCE.getAbstractPackage_SubPackages()
					.equals(msg.getFeature())
					&& this.isAccessible(CinematicViewsRepository.CinematicRoot.Properties.subPackages)) {
				cinematicRootPart.updateSubPackages();
			}
			if (CinematicPackage.eINSTANCE.getCinematicRoot_Toolkits().equals(
					msg.getFeature())
					&& this.isAccessible(CinematicViewsRepository.CinematicRoot.Properties.toolkits)) {
				cinematicRootPart.updateToolkits();
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
				EnvironmentPackage.eINSTANCE.getObeoDSMObject_Description(),
				CinematicPackage.eINSTANCE.getNamedElement_Name(),
				CinematicPackage.eINSTANCE.getAbstractPackage_Flows(),
				CinematicPackage.eINSTANCE.getAbstractPackage_ViewContainers(),
				CinematicPackage.eINSTANCE.getAbstractPackage_SubPackages(),
				CinematicPackage.eINSTANCE.getCinematicRoot_Toolkits());
		return new NotificationFilter[] { filter, };
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * @generated
	 */
	@Override
	public Diagnostic validateValue(final IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (CinematicViewsRepository.CinematicRoot.Properties.description == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(EnvironmentPackage.eINSTANCE
										.getObeoDSMObject_Description()
										.getEAttributeType(), (String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							EnvironmentPackage.eINSTANCE
									.getObeoDSMObject_Description()
									.getEAttributeType(), newValue);
				}
				if (CinematicViewsRepository.CinematicRoot.Properties.name == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(CinematicPackage.eINSTANCE
										.getNamedElement_Name()
										.getEAttributeType(), (String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							CinematicPackage.eINSTANCE.getNamedElement_Name()
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
