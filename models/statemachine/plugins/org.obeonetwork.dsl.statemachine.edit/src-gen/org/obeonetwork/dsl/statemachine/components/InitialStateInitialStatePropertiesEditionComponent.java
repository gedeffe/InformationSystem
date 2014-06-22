/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.statemachine.components;

// Start of user code for imports
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
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
import org.obeonetwork.dsl.statemachine.InitialState;
import org.obeonetwork.dsl.statemachine.StateMachinePackage;
import org.obeonetwork.dsl.statemachine.Transition;
import org.obeonetwork.dsl.statemachine.parts.InitialStatePropertiesEditionPart;
import org.obeonetwork.dsl.statemachine.parts.StatemachineViewsRepository;

// End of user code

/**
 * 
 * 
 */
public class InitialStateInitialStatePropertiesEditionComponent extends
		SinglePartPropertiesEditingComponent {

	public static String INITIALSTATE_PART = "InitialState"; //$NON-NLS-1$

	/**
	 * Settings for incomingTransitions ReferencesTable
	 */
	private ReferencesTableSettings incomingTransitionsSettings;

	/**
	 * Settings for outcomingTransitions ReferencesTable
	 */
	private ReferencesTableSettings outcomingTransitionsSettings;

	/**
	 * Default constructor
	 * 
	 */
	public InitialStateInitialStatePropertiesEditionComponent(
			final PropertiesEditingContext editingContext,
			final EObject initialState, final String editing_mode) {
		super(editingContext, initialState, editing_mode);
		this.parts = new String[] { INITIALSTATE_PART };
		this.repositoryKey = StatemachineViewsRepository.class;
		this.partKey = StatemachineViewsRepository.InitialState.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object,
	 *      int, org.eclipse.emf.ecore.EObject,
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	@Override
	public void initPart(final Object key, final int kind, final EObject elt,
			final ResourceSet allResource) {
		this.setInitializing(true);
		if ((this.editingPart != null) && (key == this.partKey)) {
			this.editingPart.setContext(elt, allResource);

			final InitialState initialState = (InitialState) elt;
			final InitialStatePropertiesEditionPart initialStatePart = (InitialStatePropertiesEditionPart) this.editingPart;
			// init values
			if (this.isAccessible(StatemachineViewsRepository.InitialState.Properties.description)) {
				initialStatePart.setDescription(EEFConverterUtil
						.convertToString(EcorePackage.Literals.ESTRING,
								initialState.getDescription()));
			}

			if (this.isAccessible(StatemachineViewsRepository.InitialState.Properties.keywords)) {
				initialStatePart.setKeywords(initialState.getKeywords());
			}

			if (this.isAccessible(StatemachineViewsRepository.InitialState.Properties.incomingTransitions)) {
				this.incomingTransitionsSettings = new ReferencesTableSettings(
						initialState,
						StateMachinePackage.eINSTANCE
								.getAbstractState_IncomingTransitions());
				initialStatePart
						.initIncomingTransitions(this.incomingTransitionsSettings);
			}
			if (this.isAccessible(StatemachineViewsRepository.InitialState.Properties.outcomingTransitions)) {
				this.outcomingTransitionsSettings = new ReferencesTableSettings(
						initialState,
						StateMachinePackage.eINSTANCE
								.getAbstractState_OutcomingTransitions());
				initialStatePart
						.initOutcomingTransitions(this.outcomingTransitionsSettings);
			}
			// init filters

			if (this.isAccessible(StatemachineViewsRepository.InitialState.Properties.incomingTransitions)) {
				initialStatePart
						.addFilterToIncomingTransitions(new EObjectFilter(
								StateMachinePackage.Literals.TRANSITION));
				// Start of user code for additional businessfilters for
				// incomingTransitions
				// End of user code
			}
			if (this.isAccessible(StatemachineViewsRepository.InitialState.Properties.outcomingTransitions)) {
				initialStatePart
						.addFilterToOutcomingTransitions(new EObjectFilter(
								StateMachinePackage.Literals.TRANSITION));
				// Start of user code for additional businessfilters for
				// outcomingTransitions
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
		if (editorKey == StatemachineViewsRepository.InitialState.Properties.description) {
			return EnvironmentPackage.eINSTANCE.getObeoDSMObject_Description();
		}
		if (editorKey == StatemachineViewsRepository.InitialState.Properties.keywords) {
			return EnvironmentPackage.eINSTANCE.getObeoDSMObject_Keywords();
		}
		if (editorKey == StatemachineViewsRepository.InitialState.Properties.incomingTransitions) {
			return StateMachinePackage.eINSTANCE
					.getAbstractState_IncomingTransitions();
		}
		if (editorKey == StatemachineViewsRepository.InitialState.Properties.outcomingTransitions) {
			return StateMachinePackage.eINSTANCE
					.getAbstractState_OutcomingTransitions();
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
		final InitialState initialState = (InitialState) this.semanticObject;
		if (StatemachineViewsRepository.InitialState.Properties.description == event
				.getAffectedEditor()) {
			initialState.setDescription((java.lang.String) EEFConverterUtil
					.createFromString(EcorePackage.Literals.ESTRING,
							(String) event.getNewValue()));
		}
		if (StatemachineViewsRepository.InitialState.Properties.keywords == event
				.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				initialState.getKeywords().clear();
				initialState.getKeywords()
						.addAll(((EList) event.getNewValue()));
			}
		}
		if (StatemachineViewsRepository.InitialState.Properties.incomingTransitions == event
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
		if (StatemachineViewsRepository.InitialState.Properties.outcomingTransitions == event
				.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Transition) {
					this.outcomingTransitionsSettings
							.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				this.outcomingTransitionsSettings
						.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				this.outcomingTransitionsSettings.move(event.getNewIndex(),
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
			final InitialStatePropertiesEditionPart initialStatePart = (InitialStatePropertiesEditionPart) this.editingPart;
			if (EnvironmentPackage.eINSTANCE.getObeoDSMObject_Description()
					.equals(msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (initialStatePart != null)
					&& this.isAccessible(StatemachineViewsRepository.InitialState.Properties.description)) {
				if (msg.getNewValue() != null) {
					initialStatePart.setDescription(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					initialStatePart.setDescription("");
				}
			}
			if (EnvironmentPackage.eINSTANCE.getObeoDSMObject_Keywords()
					.equals(msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (initialStatePart != null)
					&& this.isAccessible(StatemachineViewsRepository.InitialState.Properties.keywords)) {
				if (msg.getNewValue() instanceof EList<?>) {
					initialStatePart.setKeywords((EList<?>) msg.getNewValue());
				} else if (msg.getNewValue() == null) {
					initialStatePart.setKeywords(new BasicEList<Object>());
				} else {
					final BasicEList<Object> newValueAsList = new BasicEList<Object>();
					newValueAsList.add(msg.getNewValue());
					initialStatePart.setKeywords(newValueAsList);
				}
			}

			if (StateMachinePackage.eINSTANCE
					.getAbstractState_IncomingTransitions().equals(
							msg.getFeature())
					&& this.isAccessible(StatemachineViewsRepository.InitialState.Properties.incomingTransitions)) {
				initialStatePart.updateIncomingTransitions();
			}
			if (StateMachinePackage.eINSTANCE
					.getAbstractState_OutcomingTransitions().equals(
							msg.getFeature())
					&& this.isAccessible(StatemachineViewsRepository.InitialState.Properties.outcomingTransitions)) {
				initialStatePart.updateOutcomingTransitions();
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
				EnvironmentPackage.eINSTANCE.getObeoDSMObject_Keywords(),
				StateMachinePackage.eINSTANCE
						.getAbstractState_IncomingTransitions(),
				StateMachinePackage.eINSTANCE
						.getAbstractState_OutcomingTransitions());
		return new NotificationFilter[] { filter, };
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	@Override
	public Diagnostic validateValue(final IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (StatemachineViewsRepository.InitialState.Properties.description == event
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
				if (StatemachineViewsRepository.InitialState.Properties.keywords == event
						.getAffectedEditor()) {
					final BasicDiagnostic chain = new BasicDiagnostic();
					for (final Iterator iterator = ((List) event.getNewValue())
							.iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(
								EnvironmentPackage.eINSTANCE
										.getObeoDSMObject_Keywords()
										.getEAttributeType(), iterator.next()));
					}
					ret = chain;
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
