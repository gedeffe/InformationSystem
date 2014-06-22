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

import org.obeonetwork.dsl.interaction.End;
import org.obeonetwork.dsl.interaction.InteractionFragment;
import org.obeonetwork.dsl.interaction.InteractionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.interaction.impl.InteractionFragmentImpl#getStartingEnd <em>Starting End</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.interaction.impl.InteractionFragmentImpl#getFinishingEnd <em>Finishing End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InteractionFragmentImpl extends NamedElementImpl implements InteractionFragment {
	/**
	 * The cached value of the '{@link #getStartingEnd() <em>Starting End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingEnd()
	 * @generated
	 * @ordered
	 */
	protected End startingEnd;
	/**
	 * The cached value of the '{@link #getFinishingEnd() <em>Finishing End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinishingEnd()
	 * @generated
	 * @ordered
	 */
	protected End finishingEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.INTERACTION_FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public End getStartingEnd() {
		if (startingEnd != null && startingEnd.eIsProxy()) {
			InternalEObject oldStartingEnd = (InternalEObject)startingEnd;
			startingEnd = (End)eResolveProxy(oldStartingEnd);
			if (startingEnd != oldStartingEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.INTERACTION_FRAGMENT__STARTING_END, oldStartingEnd, startingEnd));
			}
		}
		return startingEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public End basicGetStartingEnd() {
		return startingEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartingEnd(End newStartingEnd) {
		End oldStartingEnd = startingEnd;
		startingEnd = newStartingEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.INTERACTION_FRAGMENT__STARTING_END, oldStartingEnd, startingEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public End getFinishingEnd() {
		if (finishingEnd != null && finishingEnd.eIsProxy()) {
			InternalEObject oldFinishingEnd = (InternalEObject)finishingEnd;
			finishingEnd = (End)eResolveProxy(oldFinishingEnd);
			if (finishingEnd != oldFinishingEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.INTERACTION_FRAGMENT__FINISHING_END, oldFinishingEnd, finishingEnd));
			}
		}
		return finishingEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public End basicGetFinishingEnd() {
		return finishingEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinishingEnd(End newFinishingEnd) {
		End oldFinishingEnd = finishingEnd;
		finishingEnd = newFinishingEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.INTERACTION_FRAGMENT__FINISHING_END, oldFinishingEnd, finishingEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionPackage.INTERACTION_FRAGMENT__STARTING_END:
				if (resolve) return getStartingEnd();
				return basicGetStartingEnd();
			case InteractionPackage.INTERACTION_FRAGMENT__FINISHING_END:
				if (resolve) return getFinishingEnd();
				return basicGetFinishingEnd();
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
			case InteractionPackage.INTERACTION_FRAGMENT__STARTING_END:
				setStartingEnd((End)newValue);
				return;
			case InteractionPackage.INTERACTION_FRAGMENT__FINISHING_END:
				setFinishingEnd((End)newValue);
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
			case InteractionPackage.INTERACTION_FRAGMENT__STARTING_END:
				setStartingEnd((End)null);
				return;
			case InteractionPackage.INTERACTION_FRAGMENT__FINISHING_END:
				setFinishingEnd((End)null);
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
			case InteractionPackage.INTERACTION_FRAGMENT__STARTING_END:
				return startingEnd != null;
			case InteractionPackage.INTERACTION_FRAGMENT__FINISHING_END:
				return finishingEnd != null;
		}
		return super.eIsSet(featureID);
	}

} //InteractionFragmentImpl
