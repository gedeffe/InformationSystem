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
package org.obeonetwork.dsl.cinematic.flow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.obeonetwork.dsl.cinematic.flow.FlowPackage;
import org.obeonetwork.dsl.cinematic.flow.ViewState;
import org.obeonetwork.dsl.cinematic.view.ViewContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.cinematic.flow.impl.ViewStateImpl#isNewInstance <em>New Instance</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.cinematic.flow.impl.ViewStateImpl#isRefresh <em>Refresh</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.cinematic.flow.impl.ViewStateImpl#getViewContainers <em>View Containers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewStateImpl extends NamedFlowStateImpl implements ViewState {
	/**
	 * The default value of the '{@link #isNewInstance() <em>New Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNewInstance()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEW_INSTANCE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isNewInstance() <em>New Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNewInstance()
	 * @generated
	 * @ordered
	 */
	protected boolean newInstance = NEW_INSTANCE_EDEFAULT;
	/**
	 * The default value of the '{@link #isRefresh() <em>Refresh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRefresh()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REFRESH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRefresh() <em>Refresh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRefresh()
	 * @generated
	 * @ordered
	 */
	protected boolean refresh = REFRESH_EDEFAULT;
	/**
	 * The cached value of the '{@link #getViewContainers() <em>View Containers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewContainer> viewContainers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.VIEW_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNewInstance() {
		return newInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewInstance(boolean newNewInstance) {
		boolean oldNewInstance = newInstance;
		newInstance = newNewInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.VIEW_STATE__NEW_INSTANCE, oldNewInstance, newInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRefresh() {
		return refresh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefresh(boolean newRefresh) {
		boolean oldRefresh = refresh;
		refresh = newRefresh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.VIEW_STATE__REFRESH, oldRefresh, refresh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ViewContainer> getViewContainers() {
		if (viewContainers == null) {
			viewContainers = new EObjectResolvingEList<ViewContainer>(ViewContainer.class, this, FlowPackage.VIEW_STATE__VIEW_CONTAINERS);
		}
		return viewContainers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlowPackage.VIEW_STATE__NEW_INSTANCE:
				return isNewInstance();
			case FlowPackage.VIEW_STATE__REFRESH:
				return isRefresh();
			case FlowPackage.VIEW_STATE__VIEW_CONTAINERS:
				return getViewContainers();
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
			case FlowPackage.VIEW_STATE__NEW_INSTANCE:
				setNewInstance((Boolean)newValue);
				return;
			case FlowPackage.VIEW_STATE__REFRESH:
				setRefresh((Boolean)newValue);
				return;
			case FlowPackage.VIEW_STATE__VIEW_CONTAINERS:
				getViewContainers().clear();
				getViewContainers().addAll((Collection<? extends ViewContainer>)newValue);
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
			case FlowPackage.VIEW_STATE__NEW_INSTANCE:
				setNewInstance(NEW_INSTANCE_EDEFAULT);
				return;
			case FlowPackage.VIEW_STATE__REFRESH:
				setRefresh(REFRESH_EDEFAULT);
				return;
			case FlowPackage.VIEW_STATE__VIEW_CONTAINERS:
				getViewContainers().clear();
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
			case FlowPackage.VIEW_STATE__NEW_INSTANCE:
				return newInstance != NEW_INSTANCE_EDEFAULT;
			case FlowPackage.VIEW_STATE__REFRESH:
				return refresh != REFRESH_EDEFAULT;
			case FlowPackage.VIEW_STATE__VIEW_CONTAINERS:
				return viewContainers != null && !viewContainers.isEmpty();
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
		result.append(" (newInstance: ");
		result.append(newInstance);
		result.append(", refresh: ");
		result.append(refresh);
		result.append(')');
		return result.toString();
	}

} //ViewStateImpl
