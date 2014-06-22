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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.environment.Action;
import org.obeonetwork.dsl.environment.Behaviour;
import org.obeonetwork.dsl.environment.Environment;
import org.obeonetwork.dsl.environment.EnvironmentPackage;
import org.obeonetwork.dsl.environment.InterDSMLink;
import org.obeonetwork.dsl.environment.PriorityDefinition;
import org.obeonetwork.dsl.environment.TypesDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.EnvironmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.EnvironmentImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.EnvironmentImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.EnvironmentImpl#getPriorityDefinitions <em>Priority Definitions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.EnvironmentImpl#getTypesDefinition <em>Types Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnvironmentImpl extends ObeoDSMObjectImpl implements Environment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2008-2009 Obeo.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Obeo - initial API and implementation";

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
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<InterDSMLink> links;

	/**
	 * The cached value of the '{@link #getPriorityDefinitions() <em>Priority Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityDefinitions()
	 * @generated
	 * @ordered
	 */
	protected PriorityDefinition priorityDefinitions;

	/**
	 * The cached value of the '{@link #getTypesDefinition() <em>Types Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypesDefinition()
	 * @generated
	 * @ordered
	 */
	protected TypesDefinition typesDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnvironmentPackage.Literals.ENVIRONMENT;
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
					EnvironmentPackage.ENVIRONMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList.Resolving<Action>(
					Action.class, this, EnvironmentPackage.ENVIRONMENT__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<InterDSMLink> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList.Resolving<InterDSMLink>(
					InterDSMLink.class, this,
					EnvironmentPackage.ENVIRONMENT__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityDefinition getPriorityDefinitions() {
		if (priorityDefinitions != null && priorityDefinitions.eIsProxy()) {
			InternalEObject oldPriorityDefinitions = (InternalEObject) priorityDefinitions;
			priorityDefinitions = (PriorityDefinition) eResolveProxy(oldPriorityDefinitions);
			if (priorityDefinitions != oldPriorityDefinitions) {
				InternalEObject newPriorityDefinitions = (InternalEObject) priorityDefinitions;
				NotificationChain msgs = oldPriorityDefinitions
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- EnvironmentPackage.ENVIRONMENT__PRIORITY_DEFINITIONS,
								null, null);
				if (newPriorityDefinitions.eInternalContainer() == null) {
					msgs = newPriorityDefinitions
							.eInverseAdd(
									this,
									EOPPOSITE_FEATURE_BASE
											- EnvironmentPackage.ENVIRONMENT__PRIORITY_DEFINITIONS,
									null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							EnvironmentPackage.ENVIRONMENT__PRIORITY_DEFINITIONS,
							oldPriorityDefinitions, priorityDefinitions));
			}
		}
		return priorityDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityDefinition basicGetPriorityDefinitions() {
		return priorityDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriorityDefinitions(
			PriorityDefinition newPriorityDefinitions, NotificationChain msgs) {
		PriorityDefinition oldPriorityDefinitions = priorityDefinitions;
		priorityDefinitions = newPriorityDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					EnvironmentPackage.ENVIRONMENT__PRIORITY_DEFINITIONS,
					oldPriorityDefinitions, newPriorityDefinitions);
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
	public void setPriorityDefinitions(PriorityDefinition newPriorityDefinitions) {
		if (newPriorityDefinitions != priorityDefinitions) {
			NotificationChain msgs = null;
			if (priorityDefinitions != null)
				msgs = ((InternalEObject) priorityDefinitions)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- EnvironmentPackage.ENVIRONMENT__PRIORITY_DEFINITIONS,
								null, msgs);
			if (newPriorityDefinitions != null)
				msgs = ((InternalEObject) newPriorityDefinitions)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- EnvironmentPackage.ENVIRONMENT__PRIORITY_DEFINITIONS,
								null, msgs);
			msgs = basicSetPriorityDefinitions(newPriorityDefinitions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EnvironmentPackage.ENVIRONMENT__PRIORITY_DEFINITIONS,
					newPriorityDefinitions, newPriorityDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesDefinition getTypesDefinition() {
		if (typesDefinition != null && typesDefinition.eIsProxy()) {
			InternalEObject oldTypesDefinition = (InternalEObject) typesDefinition;
			typesDefinition = (TypesDefinition) eResolveProxy(oldTypesDefinition);
			if (typesDefinition != oldTypesDefinition) {
				InternalEObject newTypesDefinition = (InternalEObject) typesDefinition;
				NotificationChain msgs = oldTypesDefinition
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- EnvironmentPackage.ENVIRONMENT__TYPES_DEFINITION,
								null, null);
				if (newTypesDefinition.eInternalContainer() == null) {
					msgs = newTypesDefinition
							.eInverseAdd(
									this,
									EOPPOSITE_FEATURE_BASE
											- EnvironmentPackage.ENVIRONMENT__TYPES_DEFINITION,
									null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EnvironmentPackage.ENVIRONMENT__TYPES_DEFINITION,
							oldTypesDefinition, typesDefinition));
			}
		}
		return typesDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesDefinition basicGetTypesDefinition() {
		return typesDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypesDefinition(
			TypesDefinition newTypesDefinition, NotificationChain msgs) {
		TypesDefinition oldTypesDefinition = typesDefinition;
		typesDefinition = newTypesDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					EnvironmentPackage.ENVIRONMENT__TYPES_DEFINITION,
					oldTypesDefinition, newTypesDefinition);
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
	public void setTypesDefinition(TypesDefinition newTypesDefinition) {
		if (newTypesDefinition != typesDefinition) {
			NotificationChain msgs = null;
			if (typesDefinition != null)
				msgs = ((InternalEObject) typesDefinition)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- EnvironmentPackage.ENVIRONMENT__TYPES_DEFINITION,
								null, msgs);
			if (newTypesDefinition != null)
				msgs = ((InternalEObject) newTypesDefinition)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- EnvironmentPackage.ENVIRONMENT__TYPES_DEFINITION,
								null, msgs);
			msgs = basicSetTypesDefinition(newTypesDefinition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EnvironmentPackage.ENVIRONMENT__TYPES_DEFINITION,
					newTypesDefinition, newTypesDefinition));
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
		case EnvironmentPackage.ENVIRONMENT__ACTIONS:
			return ((InternalEList<?>) getActions())
					.basicRemove(otherEnd, msgs);
		case EnvironmentPackage.ENVIRONMENT__LINKS:
			return ((InternalEList<?>) getLinks()).basicRemove(otherEnd, msgs);
		case EnvironmentPackage.ENVIRONMENT__PRIORITY_DEFINITIONS:
			return basicSetPriorityDefinitions(null, msgs);
		case EnvironmentPackage.ENVIRONMENT__TYPES_DEFINITION:
			return basicSetTypesDefinition(null, msgs);
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
		case EnvironmentPackage.ENVIRONMENT__NAME:
			return getName();
		case EnvironmentPackage.ENVIRONMENT__ACTIONS:
			return getActions();
		case EnvironmentPackage.ENVIRONMENT__LINKS:
			return getLinks();
		case EnvironmentPackage.ENVIRONMENT__PRIORITY_DEFINITIONS:
			if (resolve)
				return getPriorityDefinitions();
			return basicGetPriorityDefinitions();
		case EnvironmentPackage.ENVIRONMENT__TYPES_DEFINITION:
			if (resolve)
				return getTypesDefinition();
			return basicGetTypesDefinition();
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
		case EnvironmentPackage.ENVIRONMENT__NAME:
			setName((String) newValue);
			return;
		case EnvironmentPackage.ENVIRONMENT__ACTIONS:
			getActions().clear();
			getActions().addAll((Collection<? extends Action>) newValue);
			return;
		case EnvironmentPackage.ENVIRONMENT__LINKS:
			getLinks().clear();
			getLinks().addAll((Collection<? extends InterDSMLink>) newValue);
			return;
		case EnvironmentPackage.ENVIRONMENT__PRIORITY_DEFINITIONS:
			setPriorityDefinitions((PriorityDefinition) newValue);
			return;
		case EnvironmentPackage.ENVIRONMENT__TYPES_DEFINITION:
			setTypesDefinition((TypesDefinition) newValue);
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
		case EnvironmentPackage.ENVIRONMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EnvironmentPackage.ENVIRONMENT__ACTIONS:
			getActions().clear();
			return;
		case EnvironmentPackage.ENVIRONMENT__LINKS:
			getLinks().clear();
			return;
		case EnvironmentPackage.ENVIRONMENT__PRIORITY_DEFINITIONS:
			setPriorityDefinitions((PriorityDefinition) null);
			return;
		case EnvironmentPackage.ENVIRONMENT__TYPES_DEFINITION:
			setTypesDefinition((TypesDefinition) null);
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
		case EnvironmentPackage.ENVIRONMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case EnvironmentPackage.ENVIRONMENT__ACTIONS:
			return actions != null && !actions.isEmpty();
		case EnvironmentPackage.ENVIRONMENT__LINKS:
			return links != null && !links.isEmpty();
		case EnvironmentPackage.ENVIRONMENT__PRIORITY_DEFINITIONS:
			return priorityDefinitions != null;
		case EnvironmentPackage.ENVIRONMENT__TYPES_DEFINITION:
			return typesDefinition != null;
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

} //EnvironmentImpl