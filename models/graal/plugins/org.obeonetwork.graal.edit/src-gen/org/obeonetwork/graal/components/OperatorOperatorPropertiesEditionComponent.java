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
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.obeonetwork.dsl.environment.EnvironmentPackage;
import org.obeonetwork.graal.GraalPackage;
import org.obeonetwork.graal.Operator;
import org.obeonetwork.graal.OperatorKind;
import org.obeonetwork.graal.Transition;
import org.obeonetwork.graal.parts.GraalViewsRepository;
import org.obeonetwork.graal.parts.OperatorPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class OperatorOperatorPropertiesEditionComponent extends
		SinglePartPropertiesEditingComponent {

	public static String OPERATOR_PART = "Operator"; //$NON-NLS-1$

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
	public OperatorOperatorPropertiesEditionComponent(
			final PropertiesEditingContext editingContext,
			final EObject operator, final String editing_mode) {
		super(editingContext, operator, editing_mode);
		this.parts = new String[] { OPERATOR_PART };
		this.repositoryKey = GraalViewsRepository.class;
		this.partKey = GraalViewsRepository.Operator.class;
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

			final Operator operator = (Operator) elt;
			final OperatorPropertiesEditionPart operatorPart = (OperatorPropertiesEditionPart) this.editingPart;
			// init values
			if (this.isAccessible(GraalViewsRepository.Operator.Properties.description)) {
				operatorPart.setDescription(EcoreUtil.convertToString(
						EcorePackage.Literals.ESTRING,
						operator.getDescription()));
			}
			if (this.isAccessible(GraalViewsRepository.Operator.Properties.outgoingTransitions)) {
				this.outgoingTransitionsSettings = new ReferencesTableSettings(
						operator,
						GraalPackage.eINSTANCE.getNode_OutgoingTransitions());
				operatorPart
						.initOutgoingTransitions(this.outgoingTransitionsSettings);
			}
			if (this.isAccessible(GraalViewsRepository.Operator.Properties.incomingTransitions)) {
				this.incomingTransitionsSettings = new ReferencesTableSettings(
						operator,
						GraalPackage.eINSTANCE.getNode_IncomingTransitions());
				operatorPart
						.initIncomingTransitions(this.incomingTransitionsSettings);
			}
			if (this.isAccessible(GraalViewsRepository.Operator.Properties.kind)) {
				operatorPart.initKind(EEFUtils.choiceOfValues(operator,
						GraalPackage.eINSTANCE.getOperator_Kind()), operator
						.getKind());
			}
			// init filters

			if (this.isAccessible(GraalViewsRepository.Operator.Properties.outgoingTransitions)) {
				operatorPart.addFilterToOutgoingTransitions(new EObjectFilter(
						GraalPackage.Literals.TRANSITION));
				// Start of user code for additional businessfilters for
				// outgoingTransitions
				// End of user code
			}
			if (this.isAccessible(GraalViewsRepository.Operator.Properties.incomingTransitions)) {
				operatorPart.addFilterToIncomingTransitions(new EObjectFilter(
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
		if (editorKey == GraalViewsRepository.Operator.Properties.description) {
			return EnvironmentPackage.eINSTANCE.getObeoDSMObject_Description();
		}
		if (editorKey == GraalViewsRepository.Operator.Properties.outgoingTransitions) {
			return GraalPackage.eINSTANCE.getNode_OutgoingTransitions();
		}
		if (editorKey == GraalViewsRepository.Operator.Properties.incomingTransitions) {
			return GraalPackage.eINSTANCE.getNode_IncomingTransitions();
		}
		if (editorKey == GraalViewsRepository.Operator.Properties.kind) {
			return GraalPackage.eINSTANCE.getOperator_Kind();
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
		final Operator operator = (Operator) this.semanticObject;
		if (GraalViewsRepository.Operator.Properties.description == event
				.getAffectedEditor()) {
			operator.setDescription((java.lang.String) EEFConverterUtil
					.createFromString(EcorePackage.Literals.ESTRING,
							(String) event.getNewValue()));
		}
		if (GraalViewsRepository.Operator.Properties.outgoingTransitions == event
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
		if (GraalViewsRepository.Operator.Properties.incomingTransitions == event
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
		if (GraalViewsRepository.Operator.Properties.kind == event
				.getAffectedEditor()) {
			operator.setKind((OperatorKind) event.getNewValue());
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
			final OperatorPropertiesEditionPart operatorPart = (OperatorPropertiesEditionPart) this.editingPart;
			if (EnvironmentPackage.eINSTANCE.getObeoDSMObject_Description()
					.equals(msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (operatorPart != null)
					&& this.isAccessible(GraalViewsRepository.Operator.Properties.description)) {
				if (msg.getNewValue() != null) {
					operatorPart.setDescription(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					operatorPart.setDescription("");
				}
			}
			if (GraalPackage.eINSTANCE.getNode_OutgoingTransitions().equals(
					msg.getFeature())
					&& this.isAccessible(GraalViewsRepository.Operator.Properties.outgoingTransitions)) {
				operatorPart.updateOutgoingTransitions();
			}
			if (GraalPackage.eINSTANCE.getNode_IncomingTransitions().equals(
					msg.getFeature())
					&& this.isAccessible(GraalViewsRepository.Operator.Properties.incomingTransitions)) {
				operatorPart.updateIncomingTransitions();
			}
			if (GraalPackage.eINSTANCE.getOperator_Kind().equals(
					msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& this.isAccessible(GraalViewsRepository.Operator.Properties.kind)) {
				operatorPart.setKind((OperatorKind) msg.getNewValue());
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
				GraalPackage.eINSTANCE.getNode_IncomingTransitions(),
				GraalPackage.eINSTANCE.getOperator_Kind());
		return new NotificationFilter[] { filter, };
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object,
	 *      int)
	 * 
	 */
	@Override
	public boolean isRequired(final Object key, final int kind) {
		return key == GraalViewsRepository.Operator.Properties.kind;
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
				if (GraalViewsRepository.Operator.Properties.description == event
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
				if (GraalViewsRepository.Operator.Properties.kind == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(
										GraalPackage.eINSTANCE
												.getOperator_Kind()
												.getEAttributeType(),
										(String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							GraalPackage.eINSTANCE.getOperator_Kind()
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
