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
package org.obeonetwork.dsl.cinematic.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.cinematic.AbstractPackage;
import org.obeonetwork.dsl.cinematic.CinematicPackage;
import org.obeonetwork.dsl.cinematic.flow.Flow;
import org.obeonetwork.dsl.cinematic.view.ViewContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.cinematic.impl.AbstractPackageImpl#getFlows <em>Flows</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.cinematic.impl.AbstractPackageImpl#getViewContainers <em>View Containers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.cinematic.impl.AbstractPackageImpl#getSubPackages <em>Sub Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractPackageImpl extends NamedElementImpl implements AbstractPackage {
	/**
	 * The cached value of the '{@link #getFlows() <em>Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<Flow> flows;
	/**
	 * The cached value of the '{@link #getViewContainers() <em>View Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewContainer> viewContainers;
	/**
	 * The cached value of the '{@link #getSubPackages() <em>Sub Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<org.obeonetwork.dsl.cinematic.Package> subPackages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CinematicPackage.Literals.ABSTRACT_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Flow> getFlows() {
		if (flows == null) {
			flows = new EObjectContainmentEList<Flow>(Flow.class, this, CinematicPackage.ABSTRACT_PACKAGE__FLOWS);
		}
		return flows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ViewContainer> getViewContainers() {
		if (viewContainers == null) {
			viewContainers = new EObjectContainmentEList<ViewContainer>(ViewContainer.class, this, CinematicPackage.ABSTRACT_PACKAGE__VIEW_CONTAINERS);
		}
		return viewContainers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.obeonetwork.dsl.cinematic.Package> getSubPackages() {
		if (subPackages == null) {
			subPackages = new EObjectContainmentEList<org.obeonetwork.dsl.cinematic.Package>(org.obeonetwork.dsl.cinematic.Package.class, this, CinematicPackage.ABSTRACT_PACKAGE__SUB_PACKAGES);
		}
		return subPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CinematicPackage.ABSTRACT_PACKAGE__FLOWS:
				return ((InternalEList<?>)getFlows()).basicRemove(otherEnd, msgs);
			case CinematicPackage.ABSTRACT_PACKAGE__VIEW_CONTAINERS:
				return ((InternalEList<?>)getViewContainers()).basicRemove(otherEnd, msgs);
			case CinematicPackage.ABSTRACT_PACKAGE__SUB_PACKAGES:
				return ((InternalEList<?>)getSubPackages()).basicRemove(otherEnd, msgs);
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
			case CinematicPackage.ABSTRACT_PACKAGE__FLOWS:
				return getFlows();
			case CinematicPackage.ABSTRACT_PACKAGE__VIEW_CONTAINERS:
				return getViewContainers();
			case CinematicPackage.ABSTRACT_PACKAGE__SUB_PACKAGES:
				return getSubPackages();
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
			case CinematicPackage.ABSTRACT_PACKAGE__FLOWS:
				getFlows().clear();
				getFlows().addAll((Collection<? extends Flow>)newValue);
				return;
			case CinematicPackage.ABSTRACT_PACKAGE__VIEW_CONTAINERS:
				getViewContainers().clear();
				getViewContainers().addAll((Collection<? extends ViewContainer>)newValue);
				return;
			case CinematicPackage.ABSTRACT_PACKAGE__SUB_PACKAGES:
				getSubPackages().clear();
				getSubPackages().addAll((Collection<? extends org.obeonetwork.dsl.cinematic.Package>)newValue);
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
			case CinematicPackage.ABSTRACT_PACKAGE__FLOWS:
				getFlows().clear();
				return;
			case CinematicPackage.ABSTRACT_PACKAGE__VIEW_CONTAINERS:
				getViewContainers().clear();
				return;
			case CinematicPackage.ABSTRACT_PACKAGE__SUB_PACKAGES:
				getSubPackages().clear();
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
			case CinematicPackage.ABSTRACT_PACKAGE__FLOWS:
				return flows != null && !flows.isEmpty();
			case CinematicPackage.ABSTRACT_PACKAGE__VIEW_CONTAINERS:
				return viewContainers != null && !viewContainers.isEmpty();
			case CinematicPackage.ABSTRACT_PACKAGE__SUB_PACKAGES:
				return subPackages != null && !subPackages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractPackageImpl
