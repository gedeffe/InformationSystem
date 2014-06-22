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
package org.obeonetwork.dsl.entity.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.entity.Criterion;
import org.obeonetwork.dsl.entity.Entity;
import org.obeonetwork.dsl.entity.EntityPackage;
import org.obeonetwork.dsl.entity.ExternalCriterion;
import org.obeonetwork.dsl.entity.Finder;
import org.obeonetwork.dsl.entity.InternalCriterion;
import org.obeonetwork.dsl.environment.MultiplicityKind;
import org.obeonetwork.dsl.environment.impl.ObeoDSMObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Finder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.entity.impl.FinderImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entity.impl.FinderImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entity.impl.FinderImpl#getCustomizedName <em>Customized Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entity.impl.FinderImpl#getCriterions <em>Criterions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entity.impl.FinderImpl#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FinderImpl extends ObeoDSMObjectImpl implements Finder {
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
	 * The default value of the '{@link #getCustomizedName() <em>Customized Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomizedName()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMIZED_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCustomizedName() <em>Customized Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomizedName()
	 * @generated
	 * @ordered
	 */
	protected String customizedName = CUSTOMIZED_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCriterions() <em>Criterions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriterions()
	 * @generated
	 * @ordered
	 */
	protected EList<Criterion> criterions;

	/**
	 * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final MultiplicityKind MULTIPLICITY_EDEFAULT = MultiplicityKind.ZERO_ONE_LITERAL;

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected MultiplicityKind multiplicity = MULTIPLICITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FinderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.FINDER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getName() {
		String result = "";
		String customizedName = getCustomizedName();
		if ((customizedName != null) && (!customizedName.equals(""))) {
			result = customizedName;
		} else {
			result = "finder : ";
			EList listCriterions = getCriterions();
			if (listCriterions != null) {
				for (Iterator iter = listCriterions.iterator(); iter.hasNext();) {
					Criterion criterion = (Criterion) iter.next();
					if (criterion instanceof InternalCriterion) {
						InternalCriterion internalCriterion = (InternalCriterion) criterion;
						result += internalCriterion.getName();

					} else if (criterion instanceof ExternalCriterion) {
						ExternalCriterion externalCriterion = (ExternalCriterion) criterion;
						result += externalCriterion.getName();
					} else
						result += criterion.toString();
					if (iter.hasNext())
						result += ", ";
				}
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getEntity() {
		if (eContainerFeatureID() != EntityPackage.FINDER__ENTITY) return null;
		return (Entity)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetEntity() {
		if (eContainerFeatureID() != EntityPackage.FINDER__ENTITY) return null;
		return (Entity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntity(Entity newEntity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEntity, EntityPackage.FINDER__ENTITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(Entity newEntity) {
		if (newEntity != eInternalContainer() || (eContainerFeatureID() != EntityPackage.FINDER__ENTITY && newEntity != null)) {
			if (EcoreUtil.isAncestor(this, newEntity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEntity != null)
				msgs = ((InternalEObject)newEntity).eInverseAdd(this, EntityPackage.ENTITY__OWNED_FINDERS, Entity.class, msgs);
			msgs = basicSetEntity(newEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.FINDER__ENTITY, newEntity, newEntity));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomizedName() {
		return customizedName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomizedName(String newCustomizedName) {
		String oldCustomizedName = customizedName;
		customizedName = newCustomizedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.FINDER__CUSTOMIZED_NAME, oldCustomizedName, customizedName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Criterion> getCriterions() {
		if (criterions == null) {
			criterions = new EObjectContainmentEList.Resolving<Criterion>(Criterion.class, this, EntityPackage.FINDER__CRITERIONS);
		}
		return criterions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityKind getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity(MultiplicityKind newMultiplicity) {
		MultiplicityKind oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity == null ? MULTIPLICITY_EDEFAULT : newMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.FINDER__MULTIPLICITY, oldMultiplicity, multiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntityPackage.FINDER__ENTITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEntity((Entity)otherEnd, msgs);
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
			case EntityPackage.FINDER__ENTITY:
				return basicSetEntity(null, msgs);
			case EntityPackage.FINDER__CRITERIONS:
				return ((InternalEList<?>)getCriterions()).basicRemove(otherEnd, msgs);
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
			case EntityPackage.FINDER__ENTITY:
				return eInternalContainer().eInverseRemove(this, EntityPackage.ENTITY__OWNED_FINDERS, Entity.class, msgs);
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
			case EntityPackage.FINDER__NAME:
				return getName();
			case EntityPackage.FINDER__ENTITY:
				if (resolve) return getEntity();
				return basicGetEntity();
			case EntityPackage.FINDER__CUSTOMIZED_NAME:
				return getCustomizedName();
			case EntityPackage.FINDER__CRITERIONS:
				return getCriterions();
			case EntityPackage.FINDER__MULTIPLICITY:
				return getMultiplicity();
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
			case EntityPackage.FINDER__ENTITY:
				setEntity((Entity)newValue);
				return;
			case EntityPackage.FINDER__CUSTOMIZED_NAME:
				setCustomizedName((String)newValue);
				return;
			case EntityPackage.FINDER__CRITERIONS:
				getCriterions().clear();
				getCriterions().addAll((Collection<? extends Criterion>)newValue);
				return;
			case EntityPackage.FINDER__MULTIPLICITY:
				setMultiplicity((MultiplicityKind)newValue);
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
			case EntityPackage.FINDER__ENTITY:
				setEntity((Entity)null);
				return;
			case EntityPackage.FINDER__CUSTOMIZED_NAME:
				setCustomizedName(CUSTOMIZED_NAME_EDEFAULT);
				return;
			case EntityPackage.FINDER__CRITERIONS:
				getCriterions().clear();
				return;
			case EntityPackage.FINDER__MULTIPLICITY:
				setMultiplicity(MULTIPLICITY_EDEFAULT);
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
			case EntityPackage.FINDER__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case EntityPackage.FINDER__ENTITY:
				return basicGetEntity() != null;
			case EntityPackage.FINDER__CUSTOMIZED_NAME:
				return CUSTOMIZED_NAME_EDEFAULT == null ? customizedName != null : !CUSTOMIZED_NAME_EDEFAULT.equals(customizedName);
			case EntityPackage.FINDER__CRITERIONS:
				return criterions != null && !criterions.isEmpty();
			case EntityPackage.FINDER__MULTIPLICITY:
				return multiplicity != MULTIPLICITY_EDEFAULT;
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
		result.append(" (customizedName: ");
		result.append(customizedName);
		result.append(", multiplicity: ");
		result.append(multiplicity);
		result.append(')');
		return result.toString();
	}

} // FinderImpl
