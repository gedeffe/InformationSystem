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
package org.obeonetwork.dsl.cinematic.toolkits.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.cinematic.toolkits.Toolkit;
import org.obeonetwork.dsl.cinematic.toolkits.ToolkitsPackage;
import org.obeonetwork.dsl.cinematic.toolkits.Widget;
import org.obeonetwork.dsl.cinematic.toolkits.WidgetEventType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.cinematic.toolkits.impl.WidgetImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.cinematic.toolkits.impl.WidgetImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.cinematic.toolkits.impl.WidgetImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.cinematic.toolkits.impl.WidgetImpl#getToolkit <em>Toolkit</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.cinematic.toolkits.impl.WidgetImpl#getPossibleEvents <em>Possible Events</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.cinematic.toolkits.impl.WidgetImpl#isIsContainer <em>Is Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WidgetImpl extends MinimalEObjectImpl.Container implements Widget {
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
	 * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected String icon = ICON_EDEFAULT;
	/**
	 * The default value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTATION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected String implementation = IMPLEMENTATION_EDEFAULT;
	/**
	 * The cached value of the '{@link #getPossibleEvents() <em>Possible Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<WidgetEventType> possibleEvents;
	/**
	 * The default value of the '{@link #isIsContainer() <em>Is Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsContainer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONTAINER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsContainer() <em>Is Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsContainer()
	 * @generated
	 * @ordered
	 */
	protected boolean isContainer = IS_CONTAINER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToolkitsPackage.Literals.WIDGET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToolkitsPackage.WIDGET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(String newIcon) {
		String oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolkitsPackage.WIDGET__ICON, oldIcon, icon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImplementation() {
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementation(String newImplementation) {
		String oldImplementation = implementation;
		implementation = newImplementation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolkitsPackage.WIDGET__IMPLEMENTATION, oldImplementation, implementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Toolkit getToolkit() {
		if (eContainerFeatureID() != ToolkitsPackage.WIDGET__TOOLKIT) return null;
		return (Toolkit)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToolkit(Toolkit newToolkit, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newToolkit, ToolkitsPackage.WIDGET__TOOLKIT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToolkit(Toolkit newToolkit) {
		if (newToolkit != eInternalContainer() || (eContainerFeatureID() != ToolkitsPackage.WIDGET__TOOLKIT && newToolkit != null)) {
			if (EcoreUtil.isAncestor(this, newToolkit))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newToolkit != null)
				msgs = ((InternalEObject)newToolkit).eInverseAdd(this, ToolkitsPackage.TOOLKIT__WIDGETS, Toolkit.class, msgs);
			msgs = basicSetToolkit(newToolkit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolkitsPackage.WIDGET__TOOLKIT, newToolkit, newToolkit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<WidgetEventType> getPossibleEvents() {
		if (possibleEvents == null) {
			possibleEvents = new EObjectContainmentEList<WidgetEventType>(WidgetEventType.class, this, ToolkitsPackage.WIDGET__POSSIBLE_EVENTS);
		}
		return possibleEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsContainer() {
		return isContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsContainer(boolean newIsContainer) {
		boolean oldIsContainer = isContainer;
		isContainer = newIsContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolkitsPackage.WIDGET__IS_CONTAINER, oldIsContainer, isContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToolkitsPackage.WIDGET__TOOLKIT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetToolkit((Toolkit)otherEnd, msgs);
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
			case ToolkitsPackage.WIDGET__TOOLKIT:
				return basicSetToolkit(null, msgs);
			case ToolkitsPackage.WIDGET__POSSIBLE_EVENTS:
				return ((InternalEList<?>)getPossibleEvents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ToolkitsPackage.WIDGET__TOOLKIT:
				return eInternalContainer().eInverseRemove(this, ToolkitsPackage.TOOLKIT__WIDGETS, Toolkit.class, msgs);
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
			case ToolkitsPackage.WIDGET__NAME:
				return getName();
			case ToolkitsPackage.WIDGET__ICON:
				return getIcon();
			case ToolkitsPackage.WIDGET__IMPLEMENTATION:
				return getImplementation();
			case ToolkitsPackage.WIDGET__TOOLKIT:
				return getToolkit();
			case ToolkitsPackage.WIDGET__POSSIBLE_EVENTS:
				return getPossibleEvents();
			case ToolkitsPackage.WIDGET__IS_CONTAINER:
				return isIsContainer();
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
			case ToolkitsPackage.WIDGET__NAME:
				setName((String)newValue);
				return;
			case ToolkitsPackage.WIDGET__ICON:
				setIcon((String)newValue);
				return;
			case ToolkitsPackage.WIDGET__IMPLEMENTATION:
				setImplementation((String)newValue);
				return;
			case ToolkitsPackage.WIDGET__TOOLKIT:
				setToolkit((Toolkit)newValue);
				return;
			case ToolkitsPackage.WIDGET__POSSIBLE_EVENTS:
				getPossibleEvents().clear();
				getPossibleEvents().addAll((Collection<? extends WidgetEventType>)newValue);
				return;
			case ToolkitsPackage.WIDGET__IS_CONTAINER:
				setIsContainer((Boolean)newValue);
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
			case ToolkitsPackage.WIDGET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ToolkitsPackage.WIDGET__ICON:
				setIcon(ICON_EDEFAULT);
				return;
			case ToolkitsPackage.WIDGET__IMPLEMENTATION:
				setImplementation(IMPLEMENTATION_EDEFAULT);
				return;
			case ToolkitsPackage.WIDGET__TOOLKIT:
				setToolkit((Toolkit)null);
				return;
			case ToolkitsPackage.WIDGET__POSSIBLE_EVENTS:
				getPossibleEvents().clear();
				return;
			case ToolkitsPackage.WIDGET__IS_CONTAINER:
				setIsContainer(IS_CONTAINER_EDEFAULT);
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
			case ToolkitsPackage.WIDGET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ToolkitsPackage.WIDGET__ICON:
				return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
			case ToolkitsPackage.WIDGET__IMPLEMENTATION:
				return IMPLEMENTATION_EDEFAULT == null ? implementation != null : !IMPLEMENTATION_EDEFAULT.equals(implementation);
			case ToolkitsPackage.WIDGET__TOOLKIT:
				return getToolkit() != null;
			case ToolkitsPackage.WIDGET__POSSIBLE_EVENTS:
				return possibleEvents != null && !possibleEvents.isEmpty();
			case ToolkitsPackage.WIDGET__IS_CONTAINER:
				return isContainer != IS_CONTAINER_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", icon: ");
		result.append(icon);
		result.append(", implementation: ");
		result.append(implementation);
		result.append(", isContainer: ");
		result.append(isContainer);
		result.append(')');
		return result.toString();
	}

} //WidgetImpl
