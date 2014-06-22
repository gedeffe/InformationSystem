/**
 * Copyright (c) 2008-2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *
 * $Id$
 */
package org.obeonetwork.dsl.environment.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.environment.EnvironmentPackage;
import org.obeonetwork.dsl.environment.Namespace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.NamespaceImpl#getOwnedNamespaces <em>Owned Namespaces</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.NamespaceImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.NamespaceImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamespaceImpl extends ObeoDSMObjectImpl implements Namespace {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2008-2009 Obeo.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getOwnedNamespaces() <em>Owned Namespaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedNamespaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Namespace> ownedNamespaces;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnvironmentPackage.Literals.NAMESPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Namespace> getOwnedNamespaces() {
		if (ownedNamespaces == null) {
			ownedNamespaces = new EObjectContainmentWithInverseEList.Resolving<Namespace>(
					Namespace.class, this,
					EnvironmentPackage.NAMESPACE__OWNED_NAMESPACES,
					EnvironmentPackage.NAMESPACE__OWNER);
		}
		return ownedNamespaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getOwner() {
		if (eContainerFeatureID() != EnvironmentPackage.NAMESPACE__OWNER)
			return null;
		return (Namespace) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetOwner() {
		if (eContainerFeatureID() != EnvironmentPackage.NAMESPACE__OWNER)
			return null;
		return (Namespace) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Namespace newOwner,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newOwner,
				EnvironmentPackage.NAMESPACE__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Namespace newOwner) {
		if (newOwner != eInternalContainer()
				|| (eContainerFeatureID() != EnvironmentPackage.NAMESPACE__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject) newOwner).eInverseAdd(this,
						EnvironmentPackage.NAMESPACE__OWNED_NAMESPACES,
						Namespace.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EnvironmentPackage.NAMESPACE__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EnvironmentPackage.NAMESPACE__NAME, oldName, name));
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
		case EnvironmentPackage.NAMESPACE__OWNED_NAMESPACES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedNamespaces())
					.basicAdd(otherEnd, msgs);
		case EnvironmentPackage.NAMESPACE__OWNER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetOwner((Namespace) otherEnd, msgs);
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
		case EnvironmentPackage.NAMESPACE__OWNED_NAMESPACES:
			return ((InternalEList<?>) getOwnedNamespaces()).basicRemove(
					otherEnd, msgs);
		case EnvironmentPackage.NAMESPACE__OWNER:
			return basicSetOwner(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case EnvironmentPackage.NAMESPACE__OWNER:
			return eInternalContainer().eInverseRemove(this,
					EnvironmentPackage.NAMESPACE__OWNED_NAMESPACES,
					Namespace.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EnvironmentPackage.NAMESPACE__OWNED_NAMESPACES:
			return getOwnedNamespaces();
		case EnvironmentPackage.NAMESPACE__OWNER:
			if (resolve)
				return getOwner();
			return basicGetOwner();
		case EnvironmentPackage.NAMESPACE__NAME:
			return getName();
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
		case EnvironmentPackage.NAMESPACE__OWNED_NAMESPACES:
			getOwnedNamespaces().clear();
			getOwnedNamespaces().addAll(
					(Collection<? extends Namespace>) newValue);
			return;
		case EnvironmentPackage.NAMESPACE__OWNER:
			setOwner((Namespace) newValue);
			return;
		case EnvironmentPackage.NAMESPACE__NAME:
			setName((String) newValue);
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
		case EnvironmentPackage.NAMESPACE__OWNED_NAMESPACES:
			getOwnedNamespaces().clear();
			return;
		case EnvironmentPackage.NAMESPACE__OWNER:
			setOwner((Namespace) null);
			return;
		case EnvironmentPackage.NAMESPACE__NAME:
			setName(NAME_EDEFAULT);
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
		case EnvironmentPackage.NAMESPACE__OWNED_NAMESPACES:
			return ownedNamespaces != null && !ownedNamespaces.isEmpty();
		case EnvironmentPackage.NAMESPACE__OWNER:
			return basicGetOwner() != null;
		case EnvironmentPackage.NAMESPACE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //NamespaceImpl
