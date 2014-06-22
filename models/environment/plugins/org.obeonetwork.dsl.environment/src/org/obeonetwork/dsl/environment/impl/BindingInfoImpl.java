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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.environment.BindingElement;
import org.obeonetwork.dsl.environment.BindingInfo;
import org.obeonetwork.dsl.environment.BindingReference;
import org.obeonetwork.dsl.environment.BoundableElement;
import org.obeonetwork.dsl.environment.EnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.BindingInfoImpl#getReferences <em>References</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.BindingInfoImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.BindingInfoImpl#getRight <em>Right</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.BindingInfoImpl#getSubBindingInfos <em>Sub Binding Infos</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.BindingInfoImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.BindingInfoImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingInfoImpl extends ObeoDSMObjectImpl implements BindingInfo {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2008-2009 Obeo.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<BindingReference> references;
	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected BoundableElement left;
	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected BoundableElement right;
	/**
	 * The cached value of the '{@link #getSubBindingInfos() <em>Sub Binding Infos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubBindingInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<BindingInfo> subBindingInfos;
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<BindingElement> elements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnvironmentPackage.Literals.BINDING_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BindingReference> getReferences() {
		if (references == null) {
			references = new EObjectContainmentEList.Resolving<BindingReference>(
					BindingReference.class, this,
					EnvironmentPackage.BINDING_INFO__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundableElement getLeft() {
		if (left != null && left.eIsProxy()) {
			InternalEObject oldLeft = (InternalEObject) left;
			left = (BoundableElement) eResolveProxy(oldLeft);
			if (left != oldLeft) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EnvironmentPackage.BINDING_INFO__LEFT, oldLeft,
							left));
			}
		}
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundableElement basicGetLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(BoundableElement newLeft) {
		BoundableElement oldLeft = left;
		left = newLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EnvironmentPackage.BINDING_INFO__LEFT, oldLeft, left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundableElement getRight() {
		if (right != null && right.eIsProxy()) {
			InternalEObject oldRight = (InternalEObject) right;
			right = (BoundableElement) eResolveProxy(oldRight);
			if (right != oldRight) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EnvironmentPackage.BINDING_INFO__RIGHT, oldRight,
							right));
			}
		}
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundableElement basicGetRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(BoundableElement newRight) {
		BoundableElement oldRight = right;
		right = newRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EnvironmentPackage.BINDING_INFO__RIGHT, oldRight, right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BindingInfo> getSubBindingInfos() {
		if (subBindingInfos == null) {
			subBindingInfos = new EObjectResolvingEList<BindingInfo>(
					BindingInfo.class, this,
					EnvironmentPackage.BINDING_INFO__SUB_BINDING_INFOS);
		}
		return subBindingInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<BoundableElement> getTargets() {
		EObject[] targets = new EObject[] { getLeft(), getRight() };
		return new EcoreEList.UnmodifiableEList<BoundableElement>(this,
				EnvironmentPackage.Literals.BINDING_INFO__TARGETS, 2, targets);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BindingElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList.Resolving<BindingElement>(
					BindingElement.class, this,
					EnvironmentPackage.BINDING_INFO__ELEMENTS);
		}
		return elements;
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
		case EnvironmentPackage.BINDING_INFO__REFERENCES:
			return ((InternalEList<?>) getReferences()).basicRemove(otherEnd,
					msgs);
		case EnvironmentPackage.BINDING_INFO__ELEMENTS:
			return ((InternalEList<?>) getElements()).basicRemove(otherEnd,
					msgs);
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
		case EnvironmentPackage.BINDING_INFO__REFERENCES:
			return getReferences();
		case EnvironmentPackage.BINDING_INFO__LEFT:
			if (resolve)
				return getLeft();
			return basicGetLeft();
		case EnvironmentPackage.BINDING_INFO__RIGHT:
			if (resolve)
				return getRight();
			return basicGetRight();
		case EnvironmentPackage.BINDING_INFO__SUB_BINDING_INFOS:
			return getSubBindingInfos();
		case EnvironmentPackage.BINDING_INFO__TARGETS:
			return getTargets();
		case EnvironmentPackage.BINDING_INFO__ELEMENTS:
			return getElements();
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
		case EnvironmentPackage.BINDING_INFO__REFERENCES:
			getReferences().clear();
			getReferences().addAll(
					(Collection<? extends BindingReference>) newValue);
			return;
		case EnvironmentPackage.BINDING_INFO__LEFT:
			setLeft((BoundableElement) newValue);
			return;
		case EnvironmentPackage.BINDING_INFO__RIGHT:
			setRight((BoundableElement) newValue);
			return;
		case EnvironmentPackage.BINDING_INFO__SUB_BINDING_INFOS:
			getSubBindingInfos().clear();
			getSubBindingInfos().addAll(
					(Collection<? extends BindingInfo>) newValue);
			return;
		case EnvironmentPackage.BINDING_INFO__ELEMENTS:
			getElements().clear();
			getElements().addAll(
					(Collection<? extends BindingElement>) newValue);
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
		case EnvironmentPackage.BINDING_INFO__REFERENCES:
			getReferences().clear();
			return;
		case EnvironmentPackage.BINDING_INFO__LEFT:
			setLeft((BoundableElement) null);
			return;
		case EnvironmentPackage.BINDING_INFO__RIGHT:
			setRight((BoundableElement) null);
			return;
		case EnvironmentPackage.BINDING_INFO__SUB_BINDING_INFOS:
			getSubBindingInfos().clear();
			return;
		case EnvironmentPackage.BINDING_INFO__ELEMENTS:
			getElements().clear();
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
		case EnvironmentPackage.BINDING_INFO__REFERENCES:
			return references != null && !references.isEmpty();
		case EnvironmentPackage.BINDING_INFO__LEFT:
			return left != null;
		case EnvironmentPackage.BINDING_INFO__RIGHT:
			return right != null;
		case EnvironmentPackage.BINDING_INFO__SUB_BINDING_INFOS:
			return subBindingInfos != null && !subBindingInfos.isEmpty();
		case EnvironmentPackage.BINDING_INFO__TARGETS:
			return !getTargets().isEmpty();
		case EnvironmentPackage.BINDING_INFO__ELEMENTS:
			return elements != null && !elements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BindingInfoImpl
