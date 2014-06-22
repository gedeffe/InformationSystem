/**
 * Copyright (c) 2008-2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.obeonetwork.dsl.environment.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.obeonetwork.dsl.environment.BindingElement;
import org.obeonetwork.dsl.environment.BindingReference;
import org.obeonetwork.dsl.environment.EnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.BindingReferenceImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.BindingReferenceImpl#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingReferenceImpl extends ObeoDSMObjectImpl implements
		BindingReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2008-2009 Obeo.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected BindingElement left;
	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected BindingElement right;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnvironmentPackage.Literals.BINDING_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingElement getLeft() {
		if (left != null && left.eIsProxy()) {
			InternalEObject oldLeft = (InternalEObject) left;
			left = (BindingElement) eResolveProxy(oldLeft);
			if (left != oldLeft) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EnvironmentPackage.BINDING_REFERENCE__LEFT,
							oldLeft, left));
			}
		}
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingElement basicGetLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeft(BindingElement newLeft,
			NotificationChain msgs) {
		BindingElement oldLeft = left;
		left = newLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					EnvironmentPackage.BINDING_REFERENCE__LEFT, oldLeft,
					newLeft);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(BindingElement newLeft) {
		if (newLeft != left) {
			NotificationChain msgs = null;
			if (left != null)
				msgs = ((InternalEObject) left)
						.eInverseRemove(
								this,
								EnvironmentPackage.BINDING_ELEMENT__REFERENCED_BY_AS_LEFT,
								BindingElement.class, msgs);
			if (newLeft != null)
				msgs = ((InternalEObject) newLeft)
						.eInverseAdd(
								this,
								EnvironmentPackage.BINDING_ELEMENT__REFERENCED_BY_AS_LEFT,
								BindingElement.class, msgs);
			msgs = basicSetLeft(newLeft, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EnvironmentPackage.BINDING_REFERENCE__LEFT, newLeft,
					newLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingElement getRight() {
		if (right != null && right.eIsProxy()) {
			InternalEObject oldRight = (InternalEObject) right;
			right = (BindingElement) eResolveProxy(oldRight);
			if (right != oldRight) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EnvironmentPackage.BINDING_REFERENCE__RIGHT,
							oldRight, right));
			}
		}
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingElement basicGetRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRight(BindingElement newRight,
			NotificationChain msgs) {
		BindingElement oldRight = right;
		right = newRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					EnvironmentPackage.BINDING_REFERENCE__RIGHT, oldRight,
					newRight);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(BindingElement newRight) {
		if (newRight != right) {
			NotificationChain msgs = null;
			if (right != null)
				msgs = ((InternalEObject) right)
						.eInverseRemove(
								this,
								EnvironmentPackage.BINDING_ELEMENT__REFERENCED_BY_AS_RIGHT,
								BindingElement.class, msgs);
			if (newRight != null)
				msgs = ((InternalEObject) newRight)
						.eInverseAdd(
								this,
								EnvironmentPackage.BINDING_ELEMENT__REFERENCED_BY_AS_RIGHT,
								BindingElement.class, msgs);
			msgs = basicSetRight(newRight, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EnvironmentPackage.BINDING_REFERENCE__RIGHT, newRight,
					newRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BindingElement getOppositeBindingElement(
			BindingElement bindingElement) {
		if (getLeft().equals(bindingElement)) {
			return getRight();
		} else if (getRight().equals(bindingElement)) {
			return getLeft();
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EnvironmentPackage.BINDING_REFERENCE__LEFT:
			if (left != null)
				msgs = ((InternalEObject) left)
						.eInverseRemove(
								this,
								EnvironmentPackage.BINDING_ELEMENT__REFERENCED_BY_AS_LEFT,
								BindingElement.class, msgs);
			return basicSetLeft((BindingElement) otherEnd, msgs);
		case EnvironmentPackage.BINDING_REFERENCE__RIGHT:
			if (right != null)
				msgs = ((InternalEObject) right)
						.eInverseRemove(
								this,
								EnvironmentPackage.BINDING_ELEMENT__REFERENCED_BY_AS_RIGHT,
								BindingElement.class, msgs);
			return basicSetRight((BindingElement) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EnvironmentPackage.BINDING_REFERENCE__LEFT:
			return basicSetLeft(null, msgs);
		case EnvironmentPackage.BINDING_REFERENCE__RIGHT:
			return basicSetRight(null, msgs);
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
		case EnvironmentPackage.BINDING_REFERENCE__LEFT:
			if (resolve)
				return getLeft();
			return basicGetLeft();
		case EnvironmentPackage.BINDING_REFERENCE__RIGHT:
			if (resolve)
				return getRight();
			return basicGetRight();
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
		case EnvironmentPackage.BINDING_REFERENCE__LEFT:
			setLeft((BindingElement) newValue);
			return;
		case EnvironmentPackage.BINDING_REFERENCE__RIGHT:
			setRight((BindingElement) newValue);
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
		case EnvironmentPackage.BINDING_REFERENCE__LEFT:
			setLeft((BindingElement) null);
			return;
		case EnvironmentPackage.BINDING_REFERENCE__RIGHT:
			setRight((BindingElement) null);
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
		case EnvironmentPackage.BINDING_REFERENCE__LEFT:
			return left != null;
		case EnvironmentPackage.BINDING_REFERENCE__RIGHT:
			return right != null;
		}
		return super.eIsSet(featureID);
	}

} //BindingReferenceImpl
