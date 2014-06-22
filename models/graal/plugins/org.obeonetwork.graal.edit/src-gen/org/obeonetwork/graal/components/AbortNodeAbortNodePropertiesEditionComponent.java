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
import org.obeonetwork.graal.AbortNode;
import org.obeonetwork.graal.GraalPackage;
import org.obeonetwork.graal.Transition;
import org.obeonetwork.graal.parts.AbortNodePropertiesEditionPart;
import org.obeonetwork.graal.parts.GraalViewsRepository;

// End of user code

/**
 * 
 * 
 */
public class AbortNodeAbortNodePropertiesEditionComponent extends
		SinglePartPropertiesEditingComponent {

	public static String ABORTNODE_PART = "AbortNode"; //$NON-NLS-1$

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
	public AbortNodeAbortNodePropertiesEditionComponent(
			final PropertiesEditingContext editingContext,
			final EObject abortNode, final String editing_mode) {
		super(editingContext, abortNode, editing_mode);
		this.parts = new String[] { ABORTNODE_PART };
		this.repositoryKey = GraalViewsRepository.class;
		this.partKey = GraalViewsRepository.AbortNode.class;
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

			final AbortNode abortNode = (AbortNode) elt;
			final AbortNodePropertiesEditionPart abortNodePart = (AbortNodePropertiesEditionPart) this.editingPart;
			// init values
			if (this.isAccessible(GraalViewsRepository.AbortNode.Properties.description)) {
				abortNodePart.setDescription(EcoreUtil.convertToString(
						EcorePackage.Literals.ESTRING,
						abortNode.getDescription()));
			}
			if (this.isAccessible(GraalViewsRepository.AbortNode.Properties.outgoingTransitions)) {
				this.outgoingTransitionsSettings = new ReferencesTableSettings(
						abortNode,
						GraalPackage.eINSTANCE.getNode_OutgoingTransitions());
				abortNodePart
						.initOutgoingTransitions(this.outgoingTransitionsSettings);
			}
			if (this.isAccessible(GraalViewsRepository.AbortNode.Properties.incomingTransitions)) {
				this.incomingTransitionsSettings = new ReferencesTableSettings(
						abortNode,
						GraalPackage.eINSTANCE.getNode_IncomingTransitions());
				abortNodePart
						.initIncomingTransitions(this.incomingTransitionsSettings);
			}
			// init filters

			if (this.isAccessible(GraalViewsRepository.AbortNode.Properties.outgoingTransitions)) {
				abortNodePart.addFilterToOutgoingTransitions(new EObjectFilter(
						GraalPackage.Literals.TRANSITION));
				// Start of user code for additional businessfilters for
				// outgoingTransitions
				// End of user code
			}
			if (this.isAccessible(GraalViewsRepository.AbortNode.Properties.incomingTransitions)) {
				abortNodePart.addFilterToIncomingTransitions(new EObjectFilter(
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
		if (editorKey == GraalViewsRepository.AbortNode.Properties.description) {
			return EnvironmentPackage.eINSTANCE.getObeoDSMObject_Description();
		}
		if (editorKey == GraalViewsRepository.AbortNode.Properties.outgoingTransitions) {
			return GraalPackage.eINSTANCE.getNode_OutgoingTransitions();
		}
		if (editorKey == GraalViewsRepository.AbortNode.Properties.incomingTransitions) {
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
		final AbortNode abortNode = (AbortNode) this.semanticObject;
		if (GraalViewsRepository.AbortNode.Properties.description == event
				.getAffectedEditor()) {
			abortNode.setDescription((java.lang.String) EEFConverterUtil
					.createFromString(EcorePackage.Literals.ESTRING,
							(String) event.getNewValue()));
		}
		if (GraalViewsRepository.AbortNode.Properties.outgoingTransitions == event
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
		if (GraalViewsRepository.AbortNode.Properties.incomingTransitions == event
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
			final AbortNodePropertiesEditionPart abortNodePart = (AbortNodePropertiesEditionPart) this.editingPart;
			if (EnvironmentPackage.eINSTANCE.getObeoDSMObject_Description()
					.equals(msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (abortNodePart != null)
					&& this.isAccessible(GraalViewsRepository.AbortNode.Properties.description)) {
				if (msg.getNewValue() != null) {
					abortNodePart.setDescription(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					abortNodePart.setDescription("");
				}
			}
			if (GraalPackage.eINSTANCE.getNode_OutgoingTransitions().equals(
					msg.getFeature())
					&& this.isAccessible(GraalViewsRepository.AbortNode.Properties.outgoingTransitions)) {
				abortNodePart.updateOutgoingTransitions();
			}
			if (GraalPackage.eINSTANCE.getNode_IncomingTransitions().equals(
					msg.getFeature())
					&& this.isAccessible(GraalViewsRepository.AbortNode.Properties.incomingTransitions)) {
				abortNodePart.updateIncomingTransitions();
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
				if (GraalViewsRepository.AbortNode.Properties.description == event
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
			} catch (final IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (final WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
