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
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.obeonetwork.dsl.cinematic.CinematicPackage;
import org.obeonetwork.dsl.cinematic.Package;
import org.obeonetwork.dsl.cinematic.flow.Flow;
import org.obeonetwork.dsl.cinematic.parts.CinematicViewsRepository;
import org.obeonetwork.dsl.cinematic.parts.Package_PropertiesEditionPart;
import org.obeonetwork.dsl.cinematic.view.ViewContainer;
import org.obeonetwork.dsl.environment.EnvironmentPackage;

/**
 * 
 * @generated
 */
public class PackagePackage_PropertiesEditionComponent extends
		SinglePartPropertiesEditingComponent {

	/**
	 * @generated
	 */

	public static String PACKAGE__PART = "Package"; //$NON-NLS-1$

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
	 * Default constructor
	 * 
	 * @generated
	 */
	public PackagePackage_PropertiesEditionComponent(
			final PropertiesEditingContext editingContext,
			final EObject package_, final String editing_mode) {
		super(editingContext, package_, editing_mode);
		this.parts = new String[] { PACKAGE__PART };
		this.repositoryKey = CinematicViewsRepository.class;
		this.partKey = CinematicViewsRepository.Package_.class;
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

			final Package package_ = (Package) elt;
			final Package_PropertiesEditionPart package_Part = (Package_PropertiesEditionPart) this.editingPart;
			// init values
			if (this.isAccessible(CinematicViewsRepository.Package_.Properties.description)) {
				package_Part.setDescription(EEFConverterUtil.convertToString(
						EcorePackage.Literals.ESTRING,
						package_.getDescription()));
			}

			if (this.isAccessible(CinematicViewsRepository.Package_.Properties.name)) {
				package_Part.setName(EEFConverterUtil.convertToString(
						EcorePackage.Literals.ESTRING, package_.getName()));
			}

			if (this.isAccessible(CinematicViewsRepository.Package_.Properties.flows)) {
				this.flowsSettings = new ReferencesTableSettings(package_,
						CinematicPackage.eINSTANCE.getAbstractPackage_Flows());
				package_Part.initFlows(this.flowsSettings);
			}
			if (this.isAccessible(CinematicViewsRepository.Package_.Properties.viewContainers)) {
				this.viewContainersSettings = new ReferencesTableSettings(
						package_,
						CinematicPackage.eINSTANCE
								.getAbstractPackage_ViewContainers());
				package_Part.initViewContainers(this.viewContainersSettings);
			}
			if (this.isAccessible(CinematicViewsRepository.Package_.Properties.subPackages)) {
				this.subPackagesSettings = new ReferencesTableSettings(
						package_,
						CinematicPackage.eINSTANCE
								.getAbstractPackage_SubPackages());
				package_Part.initSubPackages(this.subPackagesSettings);
			}
			// init filters

			if (this.isAccessible(CinematicViewsRepository.Package_.Properties.flows)) {
				package_Part.addFilterToFlows(new ViewerFilter() {
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
			if (this.isAccessible(CinematicViewsRepository.Package_.Properties.viewContainers)) {
				package_Part.addFilterToViewContainers(new ViewerFilter() {
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
			if (this.isAccessible(CinematicViewsRepository.Package_.Properties.subPackages)) {
				package_Part.addFilterToSubPackages(new ViewerFilter() {
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
		if (editorKey == CinematicViewsRepository.Package_.Properties.description) {
			return EnvironmentPackage.eINSTANCE.getObeoDSMObject_Description();
		}
		if (editorKey == CinematicViewsRepository.Package_.Properties.name) {
			return CinematicPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == CinematicViewsRepository.Package_.Properties.flows) {
			return CinematicPackage.eINSTANCE.getAbstractPackage_Flows();
		}
		if (editorKey == CinematicViewsRepository.Package_.Properties.viewContainers) {
			return CinematicPackage.eINSTANCE
					.getAbstractPackage_ViewContainers();
		}
		if (editorKey == CinematicViewsRepository.Package_.Properties.subPackages) {
			return CinematicPackage.eINSTANCE.getAbstractPackage_SubPackages();
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
		final Package package_ = (Package) this.semanticObject;
		if (CinematicViewsRepository.Package_.Properties.description == event
				.getAffectedEditor()) {
			package_.setDescription((java.lang.String) EEFConverterUtil
					.createFromString(EcorePackage.Literals.ESTRING,
							(String) event.getNewValue()));
		}
		if (CinematicViewsRepository.Package_.Properties.name == event
				.getAffectedEditor()) {
			package_.setName((java.lang.String) EEFConverterUtil
					.createFromString(EcorePackage.Literals.ESTRING,
							(String) event.getNewValue()));
		}
		if (CinematicViewsRepository.Package_.Properties.flows == event
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
		if (CinematicViewsRepository.Package_.Properties.viewContainers == event
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
		if (CinematicViewsRepository.Package_.Properties.subPackages == event
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
						(Package) event.getNewValue());
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
			final Package_PropertiesEditionPart package_Part = (Package_PropertiesEditionPart) this.editingPart;
			if (EnvironmentPackage.eINSTANCE.getObeoDSMObject_Description()
					.equals(msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (package_Part != null)
					&& this.isAccessible(CinematicViewsRepository.Package_.Properties.description)) {
				if (msg.getNewValue() != null) {
					package_Part.setDescription(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					package_Part.setDescription("");
				}
			}
			if (CinematicPackage.eINSTANCE.getNamedElement_Name().equals(
					msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (package_Part != null)
					&& this.isAccessible(CinematicViewsRepository.Package_.Properties.name)) {
				if (msg.getNewValue() != null) {
					package_Part.setName(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					package_Part.setName("");
				}
			}
			if (CinematicPackage.eINSTANCE.getAbstractPackage_Flows().equals(
					msg.getFeature())
					&& this.isAccessible(CinematicViewsRepository.Package_.Properties.flows)) {
				package_Part.updateFlows();
			}
			if (CinematicPackage.eINSTANCE.getAbstractPackage_ViewContainers()
					.equals(msg.getFeature())
					&& this.isAccessible(CinematicViewsRepository.Package_.Properties.viewContainers)) {
				package_Part.updateViewContainers();
			}
			if (CinematicPackage.eINSTANCE.getAbstractPackage_SubPackages()
					.equals(msg.getFeature())
					&& this.isAccessible(CinematicViewsRepository.Package_.Properties.subPackages)) {
				package_Part.updateSubPackages();
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
				CinematicPackage.eINSTANCE.getAbstractPackage_SubPackages());
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
				if (CinematicViewsRepository.Package_.Properties.description == event
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
				if (CinematicViewsRepository.Package_.Properties.name == event
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
