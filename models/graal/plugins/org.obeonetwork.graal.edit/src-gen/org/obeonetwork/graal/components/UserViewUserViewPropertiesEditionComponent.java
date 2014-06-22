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
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.obeonetwork.dsl.environment.EnvironmentPackage;
import org.obeonetwork.graal.GraalPackage;
import org.obeonetwork.graal.Transition;
import org.obeonetwork.graal.UserView;
import org.obeonetwork.graal.parts.GraalViewsRepository;
import org.obeonetwork.graal.parts.UserViewPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class UserViewUserViewPropertiesEditionComponent extends
		SinglePartPropertiesEditingComponent {

	public static String USERVIEW_PART = "UserView"; //$NON-NLS-1$

	/**
	 * Settings for outgoingTransitions ReferencesTable
	 */
	private ReferencesTableSettings outgoingTransitionsSettings;

	/**
	 * Settings for incomingTransitions ReferencesTable
	 */
	private ReferencesTableSettings incomingTransitionsSettings;

	/**
	 * Default constructor
	 * 
	 */
	public UserViewUserViewPropertiesEditionComponent(
			final PropertiesEditingContext editingContext,
			final EObject userView, final String editing_mode) {
		super(editingContext, userView, editing_mode);
		this.parts = new String[] { USERVIEW_PART };
		this.repositoryKey = GraalViewsRepository.class;
		this.partKey = GraalViewsRepository.UserView.class;
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

			final UserView userView = (UserView) elt;
			final UserViewPropertiesEditionPart userViewPart = (UserViewPropertiesEditionPart) this.editingPart;
			// init values
			if (this.isAccessible(GraalViewsRepository.UserView.Properties.description)) {
				userViewPart.setDescription(EcoreUtil.convertToString(
						EcorePackage.Literals.ESTRING,
						userView.getDescription()));
			}
			if (this.isAccessible(GraalViewsRepository.UserView.Properties.name)) {
				userViewPart.setName(EEFConverterUtil.convertToString(
						EcorePackage.Literals.ESTRING, userView.getName()));
			}

			if (this.isAccessible(GraalViewsRepository.UserView.Properties.outgoingTransitions)) {
				this.outgoingTransitionsSettings = new ReferencesTableSettings(
						userView,
						GraalPackage.eINSTANCE.getNode_OutgoingTransitions());
				userViewPart
						.initOutgoingTransitions(this.outgoingTransitionsSettings);
			}
			if (this.isAccessible(GraalViewsRepository.UserView.Properties.incomingTransitions)) {
				this.incomingTransitionsSettings = new ReferencesTableSettings(
						userView,
						GraalPackage.eINSTANCE.getNode_IncomingTransitions());
				userViewPart
						.initIncomingTransitions(this.incomingTransitionsSettings);
			}
			// init filters

			if (this.isAccessible(GraalViewsRepository.UserView.Properties.outgoingTransitions)) {
				userViewPart.addFilterToOutgoingTransitions(new EObjectFilter(
						GraalPackage.Literals.TRANSITION));
				// Start of user code for additional businessfilters for
				// outgoingTransitions
				// End of user code
			}
			if (this.isAccessible(GraalViewsRepository.UserView.Properties.incomingTransitions)) {
				userViewPart.addFilterToIncomingTransitions(new EObjectFilter(
						GraalPackage.Literals.TRANSITION));
				// Start of user code for additional businessfilters for
				// incomingTransitions
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
		if (editorKey == GraalViewsRepository.UserView.Properties.description) {
			return EnvironmentPackage.eINSTANCE.getObeoDSMObject_Description();
		}
		if (editorKey == GraalViewsRepository.UserView.Properties.name) {
			return GraalPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == GraalViewsRepository.UserView.Properties.outgoingTransitions) {
			return GraalPackage.eINSTANCE.getNode_OutgoingTransitions();
		}
		if (editorKey == GraalViewsRepository.UserView.Properties.incomingTransitions) {
			return GraalPackage.eINSTANCE.getNode_IncomingTransitions();
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
		final UserView userView = (UserView) this.semanticObject;
		if (GraalViewsRepository.UserView.Properties.description == event
				.getAffectedEditor()) {
			userView.setDescription((java.lang.String) EEFConverterUtil
					.createFromString(EcorePackage.Literals.ESTRING,
							(String) event.getNewValue()));
		}
		if (GraalViewsRepository.UserView.Properties.name == event
				.getAffectedEditor()) {
			userView.setName((java.lang.String) EEFConverterUtil
					.createFromString(EcorePackage.Literals.ESTRING,
							(String) event.getNewValue()));
		}
		if (GraalViewsRepository.UserView.Properties.outgoingTransitions == event
				.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Transition) {
					this.outgoingTransitionsSettings
							.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				this.outgoingTransitionsSettings
						.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				this.outgoingTransitionsSettings.move(event.getNewIndex(),
						(Transition) event.getNewValue());
			}
		}
		if (GraalViewsRepository.UserView.Properties.incomingTransitions == event
				.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Transition) {
					this.incomingTransitionsSettings
							.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				this.incomingTransitionsSettings
						.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				this.incomingTransitionsSettings.move(event.getNewIndex(),
						(Transition) event.getNewValue());
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
			final UserViewPropertiesEditionPart userViewPart = (UserViewPropertiesEditionPart) this.editingPart;
			if (EnvironmentPackage.eINSTANCE.getObeoDSMObject_Description()
					.equals(msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (userViewPart != null)
					&& this.isAccessible(GraalViewsRepository.UserView.Properties.description)) {
				if (msg.getNewValue() != null) {
					userViewPart.setDescription(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					userViewPart.setDescription("");
				}
			}
			if (GraalPackage.eINSTANCE.getNamedElement_Name().equals(
					msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (userViewPart != null)
					&& this.isAccessible(GraalViewsRepository.UserView.Properties.name)) {
				if (msg.getNewValue() != null) {
					userViewPart.setName(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					userViewPart.setName("");
				}
			}
			if (GraalPackage.eINSTANCE.getNode_OutgoingTransitions().equals(
					msg.getFeature())
					&& this.isAccessible(GraalViewsRepository.UserView.Properties.outgoingTransitions)) {
				userViewPart.updateOutgoingTransitions();
			}
			if (GraalPackage.eINSTANCE.getNode_IncomingTransitions().equals(
					msg.getFeature())
					&& this.isAccessible(GraalViewsRepository.UserView.Properties.incomingTransitions)) {
				userViewPart.updateIncomingTransitions();
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
				GraalPackage.eINSTANCE.getNamedElement_Name(),
				GraalPackage.eINSTANCE.getNode_OutgoingTransitions(),
				GraalPackage.eINSTANCE.getNode_IncomingTransitions());
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
				if (GraalViewsRepository.UserView.Properties.description == event
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
				if (GraalViewsRepository.UserView.Properties.name == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(GraalPackage.eINSTANCE
										.getNamedElement_Name()
										.getEAttributeType(), (String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							GraalPackage.eINSTANCE.getNamedElement_Name()
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
