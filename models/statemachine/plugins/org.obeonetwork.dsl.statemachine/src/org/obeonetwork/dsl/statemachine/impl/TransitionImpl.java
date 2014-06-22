/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.statemachine.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.obeonetwork.dsl.environment.impl.ObeoDSMObjectImpl;
import org.obeonetwork.dsl.statemachine.AbstractState;
import org.obeonetwork.dsl.statemachine.StateMachinePackage;
import org.obeonetwork.dsl.statemachine.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.statemachine.impl.TransitionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.statemachine.impl.TransitionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.statemachine.impl.TransitionImpl#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends ObeoDSMObjectImpl implements Transition {
	/**
	 * The default value of the '{@link #getGuard() <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected String guard = GUARD_EDEFAULT;
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected AbstractState from;
	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected AbstractState to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateMachinePackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(String newGuard) {
		String oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.TRANSITION__GUARD, oldGuard, guard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractState getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (AbstractState)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateMachinePackage.TRANSITION__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractState basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(AbstractState newFrom, NotificationChain msgs) {
		AbstractState oldFrom = from;
		from = newFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateMachinePackage.TRANSITION__FROM, oldFrom, newFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(AbstractState newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject)from).eInverseRemove(this, StateMachinePackage.ABSTRACT_STATE__OUTCOMING_TRANSITIONS, AbstractState.class, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, StateMachinePackage.ABSTRACT_STATE__OUTCOMING_TRANSITIONS, AbstractState.class, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.TRANSITION__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractState getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (AbstractState)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateMachinePackage.TRANSITION__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractState basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(AbstractState newTo, NotificationChain msgs) {
		AbstractState oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateMachinePackage.TRANSITION__TO, oldTo, newTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(AbstractState newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject)to).eInverseRemove(this, StateMachinePackage.ABSTRACT_STATE__INCOMING_TRANSITIONS, AbstractState.class, msgs);
			if (newTo != null)
				msgs = ((InternalEObject)newTo).eInverseAdd(this, StateMachinePackage.ABSTRACT_STATE__INCOMING_TRANSITIONS, AbstractState.class, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.TRANSITION__TO, newTo, newTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StateMachinePackage.TRANSITION__FROM:
				if (from != null)
					msgs = ((InternalEObject)from).eInverseRemove(this, StateMachinePackage.ABSTRACT_STATE__OUTCOMING_TRANSITIONS, AbstractState.class, msgs);
				return basicSetFrom((AbstractState)otherEnd, msgs);
			case StateMachinePackage.TRANSITION__TO:
				if (to != null)
					msgs = ((InternalEObject)to).eInverseRemove(this, StateMachinePackage.ABSTRACT_STATE__INCOMING_TRANSITIONS, AbstractState.class, msgs);
				return basicSetTo((AbstractState)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StateMachinePackage.TRANSITION__FROM:
				return basicSetFrom(null, msgs);
			case StateMachinePackage.TRANSITION__TO:
				return basicSetTo(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StateMachinePackage.TRANSITION__GUARD:
				return getGuard();
			case StateMachinePackage.TRANSITION__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case StateMachinePackage.TRANSITION__TO:
				if (resolve) return getTo();
				return basicGetTo();
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
			case StateMachinePackage.TRANSITION__GUARD:
				setGuard((String)newValue);
				return;
			case StateMachinePackage.TRANSITION__FROM:
				setFrom((AbstractState)newValue);
				return;
			case StateMachinePackage.TRANSITION__TO:
				setTo((AbstractState)newValue);
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
			case StateMachinePackage.TRANSITION__GUARD:
				setGuard(GUARD_EDEFAULT);
				return;
			case StateMachinePackage.TRANSITION__FROM:
				setFrom((AbstractState)null);
				return;
			case StateMachinePackage.TRANSITION__TO:
				setTo((AbstractState)null);
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
			case StateMachinePackage.TRANSITION__GUARD:
				return GUARD_EDEFAULT == null ? guard != null : !GUARD_EDEFAULT.equals(guard);
			case StateMachinePackage.TRANSITION__FROM:
				return from != null;
			case StateMachinePackage.TRANSITION__TO:
				return to != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (guard: ");
		result.append(guard);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
