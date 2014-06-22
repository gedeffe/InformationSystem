/**
 * Generated with Acceleo
 */
package org.obeonetwork.graal.components;

// Start of user code for imports
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
import org.obeonetwork.dsl.environment.EnvironmentPackage;
import org.obeonetwork.graal.Activity;
import org.obeonetwork.graal.GraalPackage;
import org.obeonetwork.graal.Loop;
import org.obeonetwork.graal.parts.GraalViewsRepository;
import org.obeonetwork.graal.parts.LoopPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class LoopLoopPropertiesEditionComponent extends
		SinglePartPropertiesEditingComponent {

	public static String LOOP_PART = "Loop"; //$NON-NLS-1$

	/**
	 * Settings for subActivities ReferencesTable
	 */
	protected ReferencesTableSettings subActivitiesSettings;

	/**
	 * Default constructor
	 * 
	 */
	public LoopLoopPropertiesEditionComponent(
			final PropertiesEditingContext editingContext, final EObject loop,
			final String editing_mode) {
		super(editingContext, loop, editing_mode);
		this.parts = new String[] { LOOP_PART };
		this.repositoryKey = GraalViewsRepository.class;
		this.partKey = GraalViewsRepository.Loop.class;
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

			final Loop loop = (Loop) elt;
			final LoopPropertiesEditionPart loopPart = (LoopPropertiesEditionPart) this.editingPart;
			// init values
			if (this.isAccessible(GraalViewsRepository.Loop.Properties.description)) {
				loopPart.setDescription(EcoreUtil.convertToString(
						EcorePackage.Literals.ESTRING, loop.getDescription()));
			}
			if (this.isAccessible(GraalViewsRepository.Loop.Properties.subActivities)) {
				this.subActivitiesSettings = new ReferencesTableSettings(loop,
						GraalPackage.eINSTANCE.getActivity_SubActivities());
				loopPart.initSubActivities(this.subActivitiesSettings);
			}
			if (this.isAccessible(GraalViewsRepository.Loop.Properties.lowerBound)) {
				loopPart.setLowerBound(EEFConverterUtil.convertToString(
						EcorePackage.Literals.EINT, loop.getLowerBound()));
			}

			if (this.isAccessible(GraalViewsRepository.Loop.Properties.upperBound)) {
				loopPart.setUpperBound(EEFConverterUtil.convertToString(
						EcorePackage.Literals.EINT, loop.getUpperBound()));
			}

			// init filters

			if (this.isAccessible(GraalViewsRepository.Loop.Properties.subActivities)) {
				loopPart.addFilterToSubActivities(new ViewerFilter() {
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
								.equals("")) || (element instanceof Activity); //$NON-NLS-1$ 
					}

				});
				// Start of user code for additional businessfilters for
				// subActivities
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
		if (editorKey == GraalViewsRepository.Loop.Properties.description) {
			return EnvironmentPackage.eINSTANCE.getObeoDSMObject_Description();
		}
		if (editorKey == GraalViewsRepository.Loop.Properties.subActivities) {
			return GraalPackage.eINSTANCE.getActivity_SubActivities();
		}
		if (editorKey == GraalViewsRepository.Loop.Properties.lowerBound) {
			return GraalPackage.eINSTANCE.getLoop_LowerBound();
		}
		if (editorKey == GraalViewsRepository.Loop.Properties.upperBound) {
			return GraalPackage.eINSTANCE.getLoop_UpperBound();
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
		final Loop loop = (Loop) this.semanticObject;
		if (GraalViewsRepository.Loop.Properties.description == event
				.getAffectedEditor()) {
			loop.setDescription((java.lang.String) EEFConverterUtil
					.createFromString(EcorePackage.Literals.ESTRING,
							(String) event.getNewValue()));
		}
		if (GraalViewsRepository.Loop.Properties.subActivities == event
				.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				final EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(
						this.editingContext, this, this.subActivitiesSettings,
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
				this.subActivitiesSettings.removeFromReference((EObject) event
						.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				this.subActivitiesSettings.move(event.getNewIndex(),
						(Activity) event.getNewValue());
			}
		}
		if (GraalViewsRepository.Loop.Properties.lowerBound == event
				.getAffectedEditor()) {
			loop.setLowerBound((EEFConverterUtil.createIntFromString(
					EcorePackage.Literals.EINT, (String) event.getNewValue())));
		}
		if (GraalViewsRepository.Loop.Properties.upperBound == event
				.getAffectedEditor()) {
			loop.setUpperBound((EEFConverterUtil.createIntFromString(
					EcorePackage.Literals.EINT, (String) event.getNewValue())));
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
			final LoopPropertiesEditionPart loopPart = (LoopPropertiesEditionPart) this.editingPart;
			if (EnvironmentPackage.eINSTANCE.getObeoDSMObject_Description()
					.equals(msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (loopPart != null)
					&& this.isAccessible(GraalViewsRepository.Loop.Properties.description)) {
				if (msg.getNewValue() != null) {
					loopPart.setDescription(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					loopPart.setDescription("");
				}
			}
			if (GraalPackage.eINSTANCE.getActivity_SubActivities().equals(
					msg.getFeature())
					&& this.isAccessible(GraalViewsRepository.Loop.Properties.subActivities)) {
				loopPart.updateSubActivities();
			}
			if (GraalPackage.eINSTANCE.getLoop_LowerBound().equals(
					msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (loopPart != null)
					&& this.isAccessible(GraalViewsRepository.Loop.Properties.lowerBound)) {
				if (msg.getNewValue() != null) {
					loopPart.setLowerBound(EcoreUtil.convertToString(
							EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					loopPart.setLowerBound("");
				}
			}
			if (GraalPackage.eINSTANCE.getLoop_UpperBound().equals(
					msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (loopPart != null)
					&& this.isAccessible(GraalViewsRepository.Loop.Properties.upperBound)) {
				if (msg.getNewValue() != null) {
					loopPart.setUpperBound(EcoreUtil.convertToString(
							EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					loopPart.setUpperBound("");
				}
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
				GraalPackage.eINSTANCE.getActivity_SubActivities(),
				GraalPackage.eINSTANCE.getLoop_LowerBound(),
				GraalPackage.eINSTANCE.getLoop_UpperBound());
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
				if (GraalViewsRepository.Loop.Properties.description == event
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
				if (GraalViewsRepository.Loop.Properties.lowerBound == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(GraalPackage.eINSTANCE
										.getLoop_LowerBound()
										.getEAttributeType(), (String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							GraalPackage.eINSTANCE.getLoop_LowerBound()
									.getEAttributeType(), newValue);
				}
				if (GraalViewsRepository.Loop.Properties.upperBound == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(GraalPackage.eINSTANCE
										.getLoop_UpperBound()
										.getEAttributeType(), (String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							GraalPackage.eINSTANCE.getLoop_UpperBound()
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
