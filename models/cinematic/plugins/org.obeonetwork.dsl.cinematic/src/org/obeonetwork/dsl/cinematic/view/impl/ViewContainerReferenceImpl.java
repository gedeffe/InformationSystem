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
package org.obeonetwork.dsl.cinematic.view.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.obeonetwork.dsl.cinematic.view.ViewContainer;
import org.obeonetwork.dsl.cinematic.view.ViewContainerReference;
import org.obeonetwork.dsl.cinematic.view.ViewPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.cinematic.view.impl.ViewContainerReferenceImpl#getViewContainer <em>View Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewContainerReferenceImpl extends AbstractViewElementImpl implements ViewContainerReference {
	/**
	 * The cached value of the '{@link #getViewContainer() <em>View Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewContainer()
	 * @generated
	 * @ordered
	 */
	protected ViewContainer viewContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewContainerReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewPackage.Literals.VIEW_CONTAINER_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewContainer getViewContainer() {
		if (viewContainer != null && viewContainer.eIsProxy()) {
			InternalEObject oldViewContainer = (InternalEObject)viewContainer;
			viewContainer = (ViewContainer)eResolveProxy(oldViewContainer);
			if (viewContainer != oldViewContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewPackage.VIEW_CONTAINER_REFERENCE__VIEW_CONTAINER, oldViewContainer, viewContainer));
			}
		}
		return viewContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewContainer basicGetViewContainer() {
		return viewContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewContainer(ViewContainer newViewContainer) {
		ViewContainer oldViewContainer = viewContainer;
		viewContainer = newViewContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.VIEW_CONTAINER_REFERENCE__VIEW_CONTAINER, oldViewContainer, viewContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewPackage.VIEW_CONTAINER_REFERENCE__VIEW_CONTAINER:
				if (resolve) return getViewContainer();
				return basicGetViewContainer();
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
			case ViewPackage.VIEW_CONTAINER_REFERENCE__VIEW_CONTAINER:
				setViewContainer((ViewContainer)newValue);
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
			case ViewPackage.VIEW_CONTAINER_REFERENCE__VIEW_CONTAINER:
				setViewContainer((ViewContainer)null);
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
			case ViewPackage.VIEW_CONTAINER_REFERENCE__VIEW_CONTAINER:
				return viewContainer != null;
		}
		return super.eIsSet(featureID);
	}

} //ViewContainerReferenceImpl
