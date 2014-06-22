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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.interaction.CombinedFragment;
import org.obeonetwork.dsl.interaction.InteractionPackage;
import org.obeonetwork.dsl.interaction.Operand;
import org.obeonetwork.dsl.interaction.Participant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combined Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.interaction.impl.CombinedFragmentImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.interaction.impl.CombinedFragmentImpl#getCoveredParticipants <em>Covered Participants</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.interaction.impl.CombinedFragmentImpl#getOwnedOperands <em>Owned Operands</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CombinedFragmentImpl extends InteractionFragmentImpl implements CombinedFragment {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected String operator = OPERATOR_EDEFAULT;
	/**
	 * The cached value of the '{@link #getCoveredParticipants() <em>Covered Participants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoveredParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant> coveredParticipants;
	/**
	 * The cached value of the '{@link #getOwnedOperands() <em>Owned Operands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperands()
	 * @generated
	 * @ordered
	 */
	protected EList<Operand> ownedOperands;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CombinedFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.COMBINED_FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(String newOperator) {
		String oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.COMBINED_FRAGMENT__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Participant> getCoveredParticipants() {
		if (coveredParticipants == null) {
			coveredParticipants = new EObjectResolvingEList<Participant>(Participant.class, this, InteractionPackage.COMBINED_FRAGMENT__COVERED_PARTICIPANTS);
		}
		return coveredParticipants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Operand> getOwnedOperands() {
		if (ownedOperands == null) {
			ownedOperands = new EObjectContainmentEList.Resolving<Operand>(Operand.class, this, InteractionPackage.COMBINED_FRAGMENT__OWNED_OPERANDS);
		}
		return ownedOperands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InteractionPackage.COMBINED_FRAGMENT__OWNED_OPERANDS:
				return ((InternalEList<?>)getOwnedOperands()).basicRemove(otherEnd, msgs);
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
			case InteractionPackage.COMBINED_FRAGMENT__OPERATOR:
				return getOperator();
			case InteractionPackage.COMBINED_FRAGMENT__COVERED_PARTICIPANTS:
				return getCoveredParticipants();
			case InteractionPackage.COMBINED_FRAGMENT__OWNED_OPERANDS:
				return getOwnedOperands();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InteractionPackage.COMBINED_FRAGMENT__OPERATOR:
				setOperator((String)newValue);
				return;
			case InteractionPackage.COMBINED_FRAGMENT__COVERED_PARTICIPANTS:
				getCoveredParticipants().clear();
				getCoveredParticipants().addAll((Collection<? extends Participant>)newValue);
				return;
			case InteractionPackage.COMBINED_FRAGMENT__OWNED_OPERANDS:
				getOwnedOperands().clear();
				getOwnedOperands().addAll((Collection<? extends Operand>)newValue);
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
			case InteractionPackage.COMBINED_FRAGMENT__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case InteractionPackage.COMBINED_FRAGMENT__COVERED_PARTICIPANTS:
				getCoveredParticipants().clear();
				return;
			case InteractionPackage.COMBINED_FRAGMENT__OWNED_OPERANDS:
				getOwnedOperands().clear();
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
			case InteractionPackage.COMBINED_FRAGMENT__OPERATOR:
				return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
			case InteractionPackage.COMBINED_FRAGMENT__COVERED_PARTICIPANTS:
				return coveredParticipants != null && !coveredParticipants.isEmpty();
			case InteractionPackage.COMBINED_FRAGMENT__OWNED_OPERANDS:
				return ownedOperands != null && !ownedOperands.isEmpty();
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //CombinedFragmentImpl
