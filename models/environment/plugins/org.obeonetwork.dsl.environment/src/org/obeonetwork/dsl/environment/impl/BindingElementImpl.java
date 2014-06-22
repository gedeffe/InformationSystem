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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList.UnmodifiableEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.environment.BindingElement;
import org.obeonetwork.dsl.environment.BindingReference;
import org.obeonetwork.dsl.environment.BoundableElement;
import org.obeonetwork.dsl.environment.EnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.BindingElementImpl#getBoundElement <em>Bound Element</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.BindingElementImpl#getBindingExpression <em>Binding Expression</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.BindingElementImpl#getReferencedByAsLeft <em>Referenced By As Left</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.BindingElementImpl#getReferencedByAsRight <em>Referenced By As Right</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.BindingElementImpl#getReferencedBy <em>Referenced By</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.BindingElementImpl#getPathReferences <em>Path References</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingElementImpl extends ObeoDSMObjectImpl implements
		BindingElement {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2008-2009 Obeo.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getBoundElement() <em>Bound Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundElement()
	 * @generated
	 * @ordered
	 */
	protected BoundableElement boundElement;

	/**
	 * The default value of the '{@link #getBindingExpression() <em>Binding Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String BINDING_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBindingExpression() <em>Binding Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingExpression()
	 * @generated
	 * @ordered
	 */
	protected String bindingExpression = BINDING_EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferencedByAsLeft() <em>Referenced By As Left</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedByAsLeft()
	 * @generated
	 * @ordered
	 */
	protected EList<BindingReference> referencedByAsLeft;

	/**
	 * The cached value of the '{@link #getReferencedByAsRight() <em>Referenced By As Right</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedByAsRight()
	 * @generated
	 * @ordered
	 */
	protected EList<BindingReference> referencedByAsRight;

	/**
	 * The cached value of the '{@link #getPathReferences() <em>Path References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<BoundableElement> pathReferences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnvironmentPackage.Literals.BINDING_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundableElement getBoundElement() {
		if (boundElement != null && boundElement.eIsProxy()) {
			InternalEObject oldBoundElement = (InternalEObject) boundElement;
			boundElement = (BoundableElement) eResolveProxy(oldBoundElement);
			if (boundElement != oldBoundElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EnvironmentPackage.BINDING_ELEMENT__BOUND_ELEMENT,
							oldBoundElement, boundElement));
			}
		}
		return boundElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundableElement basicGetBoundElement() {
		return boundElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundElement(BoundableElement newBoundElement) {
		BoundableElement oldBoundElement = boundElement;
		boundElement = newBoundElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EnvironmentPackage.BINDING_ELEMENT__BOUND_ELEMENT,
					oldBoundElement, boundElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBindingExpression() {
		return bindingExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingExpression(String newBindingExpression) {
		String oldBindingExpression = bindingExpression;
		bindingExpression = newBindingExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EnvironmentPackage.BINDING_ELEMENT__BINDING_EXPRESSION,
					oldBindingExpression, bindingExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BindingReference> getReferencedByAsLeft() {
		if (referencedByAsLeft == null) {
			referencedByAsLeft = new EObjectWithInverseResolvingEList<BindingReference>(
					BindingReference.class, this,
					EnvironmentPackage.BINDING_ELEMENT__REFERENCED_BY_AS_LEFT,
					EnvironmentPackage.BINDING_REFERENCE__LEFT);
		}
		return referencedByAsLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BindingReference> getReferencedByAsRight() {
		if (referencedByAsRight == null) {
			referencedByAsRight = new EObjectWithInverseResolvingEList<BindingReference>(
					BindingReference.class, this,
					EnvironmentPackage.BINDING_ELEMENT__REFERENCED_BY_AS_RIGHT,
					EnvironmentPackage.BINDING_REFERENCE__RIGHT);
		}
		return referencedByAsRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<BindingReference> getReferencedBy() {
		List<BindingReference> all = new ArrayList<BindingReference>();
		all.addAll(getReferencedByAsLeft());
		all.addAll(getReferencedByAsRight());
		return new UnmodifiableEList<BindingReference>(this,
				EnvironmentPackage.Literals.BINDING_ELEMENT__REFERENCED_BY,
				all.size(), all.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BoundableElement> getPathReferences() {
		if (pathReferences == null) {
			pathReferences = new EObjectResolvingEList<BoundableElement>(
					BoundableElement.class, this,
					EnvironmentPackage.BINDING_ELEMENT__PATH_REFERENCES);
		}
		return pathReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EnvironmentPackage.BINDING_ELEMENT__REFERENCED_BY_AS_LEFT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getReferencedByAsLeft())
					.basicAdd(otherEnd, msgs);
		case EnvironmentPackage.BINDING_ELEMENT__REFERENCED_BY_AS_RIGHT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getReferencedByAsRight())
					.basicAdd(otherEnd, msgs);
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
		case EnvironmentPackage.BINDING_ELEMENT__REFERENCED_BY_AS_LEFT:
			return ((InternalEList<?>) getReferencedByAsLeft()).basicRemove(
					otherEnd, msgs);
		case EnvironmentPackage.BINDING_ELEMENT__REFERENCED_BY_AS_RIGHT:
			return ((InternalEList<?>) getReferencedByAsRight()).basicRemove(
					otherEnd, msgs);
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
		case EnvironmentPackage.BINDING_ELEMENT__BOUND_ELEMENT:
			if (resolve)
				return getBoundElement();
			return basicGetBoundElement();
		case EnvironmentPackage.BINDING_ELEMENT__BINDING_EXPRESSION:
			return getBindingExpression();
		case EnvironmentPackage.BINDING_ELEMENT__REFERENCED_BY_AS_LEFT:
			return getReferencedByAsLeft();
		case EnvironmentPackage.BINDING_ELEMENT__REFERENCED_BY_AS_RIGHT:
			return getReferencedByAsRight();
		case EnvironmentPackage.BINDING_ELEMENT__REFERENCED_BY:
			return getReferencedBy();
		case EnvironmentPackage.BINDING_ELEMENT__PATH_REFERENCES:
			return getPathReferences();
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
		case EnvironmentPackage.BINDING_ELEMENT__BOUND_ELEMENT:
			setBoundElement((BoundableElement) newValue);
			return;
		case EnvironmentPackage.BINDING_ELEMENT__BINDING_EXPRESSION:
			setBindingExpression((String) newValue);
			return;
		case EnvironmentPackage.BINDING_ELEMENT__REFERENCED_BY_AS_LEFT:
			getReferencedByAsLeft().clear();
			getReferencedByAsLeft().addAll(
					(Collection<? extends BindingReference>) newValue);
			return;
		case EnvironmentPackage.BINDING_ELEMENT__REFERENCED_BY_AS_RIGHT:
			getReferencedByAsRight().clear();
			getReferencedByAsRight().addAll(
					(Collection<? extends BindingReference>) newValue);
			return;
		case EnvironmentPackage.BINDING_ELEMENT__PATH_REFERENCES:
			getPathReferences().clear();
			getPathReferences().addAll(
					(Collection<? extends BoundableElement>) newValue);
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
		case EnvironmentPackage.BINDING_ELEMENT__BOUND_ELEMENT:
			setBoundElement((BoundableElement) null);
			return;
		case EnvironmentPackage.BINDING_ELEMENT__BINDING_EXPRESSION:
			setBindingExpression(BINDING_EXPRESSION_EDEFAULT);
			return;
		case EnvironmentPackage.BINDING_ELEMENT__REFERENCED_BY_AS_LEFT:
			getReferencedByAsLeft().clear();
			return;
		case EnvironmentPackage.BINDING_ELEMENT__REFERENCED_BY_AS_RIGHT:
			getReferencedByAsRight().clear();
			return;
		case EnvironmentPackage.BINDING_ELEMENT__PATH_REFERENCES:
			getPathReferences().clear();
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
		case EnvironmentPackage.BINDING_ELEMENT__BOUND_ELEMENT:
			return boundElement != null;
		case EnvironmentPackage.BINDING_ELEMENT__BINDING_EXPRESSION:
			return BINDING_EXPRESSION_EDEFAULT == null ? bindingExpression != null
					: !BINDING_EXPRESSION_EDEFAULT.equals(bindingExpression);
		case EnvironmentPackage.BINDING_ELEMENT__REFERENCED_BY_AS_LEFT:
			return referencedByAsLeft != null && !referencedByAsLeft.isEmpty();
		case EnvironmentPackage.BINDING_ELEMENT__REFERENCED_BY_AS_RIGHT:
			return referencedByAsRight != null
					&& !referencedByAsRight.isEmpty();
		case EnvironmentPackage.BINDING_ELEMENT__REFERENCED_BY:
			return !getReferencedBy().isEmpty();
		case EnvironmentPackage.BINDING_ELEMENT__PATH_REFERENCES:
			return pathReferences != null && !pathReferences.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (bindingExpression: ");
		result.append(bindingExpression);
		result.append(')');
		return result.toString();
	}

} //BindingElementImpl
