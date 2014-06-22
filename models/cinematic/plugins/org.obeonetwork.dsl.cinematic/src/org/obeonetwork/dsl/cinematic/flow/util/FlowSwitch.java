/**
 * Copyright (c) 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.obeonetwork.dsl.cinematic.flow.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.obeonetwork.dsl.cinematic.CinematicElement;
import org.obeonetwork.dsl.cinematic.Event;
import org.obeonetwork.dsl.cinematic.NamedElement;
import org.obeonetwork.dsl.cinematic.flow.*;
import org.obeonetwork.dsl.environment.ObeoDSMObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.cinematic.flow.FlowPackage
 * @generated
 */
public class FlowSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FlowPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowSwitch() {
		if (modelPackage == null) {
			modelPackage = FlowPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FlowPackage.FLOW: {
				Flow flow = (Flow)theEObject;
				T result = caseFlow(flow);
				if (result == null) result = caseNamedElement(flow);
				if (result == null) result = caseCinematicElement(flow);
				if (result == null) result = caseObeoDSMObject(flow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.NAMED_FLOW_STATE: {
				NamedFlowState namedFlowState = (NamedFlowState)theEObject;
				T result = caseNamedFlowState(namedFlowState);
				if (result == null) result = caseFlowState(namedFlowState);
				if (result == null) result = caseNamedElement(namedFlowState);
				if (result == null) result = caseCinematicElement(namedFlowState);
				if (result == null) result = caseObeoDSMObject(namedFlowState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseNamedElement(transition);
				if (result == null) result = caseCinematicElement(transition);
				if (result == null) result = caseObeoDSMObject(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.ACTION_STATE: {
				ActionState actionState = (ActionState)theEObject;
				T result = caseActionState(actionState);
				if (result == null) result = caseNamedFlowState(actionState);
				if (result == null) result = caseFlowState(actionState);
				if (result == null) result = caseNamedElement(actionState);
				if (result == null) result = caseCinematicElement(actionState);
				if (result == null) result = caseObeoDSMObject(actionState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.VIEW_STATE: {
				ViewState viewState = (ViewState)theEObject;
				T result = caseViewState(viewState);
				if (result == null) result = caseNamedFlowState(viewState);
				if (result == null) result = caseFlowState(viewState);
				if (result == null) result = caseNamedElement(viewState);
				if (result == null) result = caseCinematicElement(viewState);
				if (result == null) result = caseObeoDSMObject(viewState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.DECISION_STATE: {
				DecisionState decisionState = (DecisionState)theEObject;
				T result = caseDecisionState(decisionState);
				if (result == null) result = caseNamedFlowState(decisionState);
				if (result == null) result = caseFlowState(decisionState);
				if (result == null) result = caseNamedElement(decisionState);
				if (result == null) result = caseCinematicElement(decisionState);
				if (result == null) result = caseObeoDSMObject(decisionState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.SUBFLOW_STATE: {
				SubflowState subflowState = (SubflowState)theEObject;
				T result = caseSubflowState(subflowState);
				if (result == null) result = caseFlowState(subflowState);
				if (result == null) result = caseCinematicElement(subflowState);
				if (result == null) result = caseObeoDSMObject(subflowState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.ASYNC_EVENT_STATE: {
				AsyncEventState asyncEventState = (AsyncEventState)theEObject;
				T result = caseAsyncEventState(asyncEventState);
				if (result == null) result = caseNamedFlowState(asyncEventState);
				if (result == null) result = caseFlowState(asyncEventState);
				if (result == null) result = caseNamedElement(asyncEventState);
				if (result == null) result = caseCinematicElement(asyncEventState);
				if (result == null) result = caseObeoDSMObject(asyncEventState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.INITIAL_STATE: {
				InitialState initialState = (InitialState)theEObject;
				T result = caseInitialState(initialState);
				if (result == null) result = caseNamedFlowState(initialState);
				if (result == null) result = caseFlowState(initialState);
				if (result == null) result = caseNamedElement(initialState);
				if (result == null) result = caseCinematicElement(initialState);
				if (result == null) result = caseObeoDSMObject(initialState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.ABORT_STATE: {
				AbortState abortState = (AbortState)theEObject;
				T result = caseAbortState(abortState);
				if (result == null) result = caseNamedFlowState(abortState);
				if (result == null) result = caseFlowState(abortState);
				if (result == null) result = caseNamedElement(abortState);
				if (result == null) result = caseCinematicElement(abortState);
				if (result == null) result = caseObeoDSMObject(abortState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.FINAL_STATE: {
				FinalState finalState = (FinalState)theEObject;
				T result = caseFinalState(finalState);
				if (result == null) result = caseNamedFlowState(finalState);
				if (result == null) result = caseFlowState(finalState);
				if (result == null) result = caseNamedElement(finalState);
				if (result == null) result = caseCinematicElement(finalState);
				if (result == null) result = caseObeoDSMObject(finalState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.FLOW_ACTION: {
				FlowAction flowAction = (FlowAction)theEObject;
				T result = caseFlowAction(flowAction);
				if (result == null) result = caseNamedElement(flowAction);
				if (result == null) result = caseCinematicElement(flowAction);
				if (result == null) result = caseObeoDSMObject(flowAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.FLOW_EVENT: {
				FlowEvent flowEvent = (FlowEvent)theEObject;
				T result = caseFlowEvent(flowEvent);
				if (result == null) result = caseEvent(flowEvent);
				if (result == null) result = caseNamedElement(flowEvent);
				if (result == null) result = caseCinematicElement(flowEvent);
				if (result == null) result = caseObeoDSMObject(flowEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.FLOW_STATE: {
				FlowState flowState = (FlowState)theEObject;
				T result = caseFlowState(flowState);
				if (result == null) result = caseCinematicElement(flowState);
				if (result == null) result = caseObeoDSMObject(flowState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlow(Flow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Flow State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Flow State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedFlowState(NamedFlowState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowState(FlowState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionState(ActionState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewState(ViewState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionState(DecisionState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subflow State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subflow State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubflowState(SubflowState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialState(InitialState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalState(FinalState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Async Event State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Async Event State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsyncEventState(AsyncEventState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowAction(FlowAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowEvent(FlowEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abort State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abort State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbortState(AbortState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Obeo DSM Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Obeo DSM Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObeoDSMObject(ObeoDSMObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCinematicElement(CinematicElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FlowSwitch
