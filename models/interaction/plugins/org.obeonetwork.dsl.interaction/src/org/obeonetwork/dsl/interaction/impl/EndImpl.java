/**
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.obeonetwork.dsl.interaction.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.obeonetwork.dsl.interaction.CombinedFragment;
import org.obeonetwork.dsl.interaction.End;
import org.obeonetwork.dsl.interaction.Execution;
import org.obeonetwork.dsl.interaction.InteractionFragment;
import org.obeonetwork.dsl.interaction.InteractionPackage;
import org.obeonetwork.dsl.interaction.InteractionUse;
import org.obeonetwork.dsl.interaction.Message;
import org.obeonetwork.dsl.interaction.Operand;
import org.obeonetwork.dsl.interaction.Participant;
import org.obeonetwork.dsl.interaction.StateInvariant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.interaction.impl.EndImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.interaction.impl.EndImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EndImpl extends NamedElementImpl implements End {
	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Participant context;
	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected InteractionFragment owner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.END;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (Participant)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.END__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(Participant newContext) {
		Participant oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.END__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFragment getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (InteractionFragment)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.END__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFragment basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(InteractionFragment newOwner) {
		InteractionFragment oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.END__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * Checks if the end is a starting end
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isStartingEnd() {
		return (getOwner() != null && equals(getOwner().getStartingEnd()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * Checks if the end is a finishing end
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isFinishingEnd() {
		return (getOwner() != null && equals(getOwner().getFinishingEnd()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns true if the end's owner is a message
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isMessageEnd() {
		return (getOwner() != null && getOwner() instanceof Message);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the owner as an execution if the end's owner is a message
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Message getMessage() {
		if (isMessageEnd()) {
			return (Message)getOwner();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns true if the end's owner is an execution
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isExecutionEnd() {
		return (getOwner() != null && getOwner() instanceof Execution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the owner as an execution if the end's owner is an execution
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Execution getExecution() {
		if (isExecutionEnd()) {
			return (Execution)getOwner();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns true if the end's owner is a state invariant
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isStateInvariantEnd() {
		return (getOwner() != null && getOwner() instanceof StateInvariant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the owner as an execution if the end's owner is a state invariant
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public StateInvariant getStateInvariant() {
		if (isStateInvariantEnd()) {
			return (StateInvariant)getOwner();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns true if the end's owner is an interaction use
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isInteractionUseEnd() {
		return (getOwner() != null && getOwner() instanceof InteractionUse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the owner as an execution if the end's owner is an interaction use
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public InteractionUse getInteractionUse() {
		if (isInteractionUseEnd()) {
			return (InteractionUse)getOwner();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns true if the end's owner is a combined fragment
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isCombinedFragmentEnd() {
		return (getOwner() != null && getOwner() instanceof CombinedFragment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the owner as an execution if the end's owner is a combined fragment
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public CombinedFragment getCombinedFragment() {
		if (isCombinedFragmentEnd()) {
			return (CombinedFragment)getOwner();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns true if the end's owner is an operand
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isOperandEnd() {
		return (getOwner() != null && getOwner() instanceof Operand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the owner as an execution if the end's owner is an operand
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Operand getOperand() {
		if (isOperandEnd()) {
			return (Operand)getOwner();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionPackage.END__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case InteractionPackage.END__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InteractionPackage.END__CONTEXT:
				setContext((Participant)newValue);
				return;
			case InteractionPackage.END__OWNER:
				setOwner((InteractionFragment)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InteractionPackage.END__CONTEXT:
				setContext((Participant)null);
				return;
			case InteractionPackage.END__OWNER:
				setOwner((InteractionFragment)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InteractionPackage.END__CONTEXT:
				return context != null;
			case InteractionPackage.END__OWNER:
				return owner != null;
		}
		return super.eIsSet(featureID);
	}

} //EndImpl
