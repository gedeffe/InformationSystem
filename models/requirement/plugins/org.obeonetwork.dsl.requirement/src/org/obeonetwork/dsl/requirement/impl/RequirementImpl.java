/**
 * Copyright (c) 2010 Obeo.
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
package org.obeonetwork.dsl.requirement.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.obeonetwork.dsl.requirement.Category;
import org.obeonetwork.dsl.requirement.Requirement;
import org.obeonetwork.dsl.requirement.RequirementPackage;
import org.obeonetwork.dsl.requirement.RequirementType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.requirement.impl.RequirementImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.requirement.impl.RequirementImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.requirement.impl.RequirementImpl#getReferencedObject <em>Referenced Object</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.requirement.impl.RequirementImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.requirement.impl.RequirementImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.requirement.impl.RequirementImpl#getAcceptanceCriteria <em>Acceptance Criteria</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.requirement.impl.RequirementImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.requirement.impl.RequirementImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.requirement.impl.RequirementImpl#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.requirement.impl.RequirementImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.requirement.impl.RequirementImpl#getCreatedOn <em>Created On</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.requirement.impl.RequirementImpl#getModifiedOn <em>Modified On</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequirementImpl extends NamedElementImpl implements Requirement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2010 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n    Obeo - initial API and implementation";

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_EDEFAULT = 1;
	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected int version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferencedObject() <em>Referenced Object</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedObject()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> referencedObject;

	/**
	 * The default value of the '{@link #getStatement() <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String STATEMENT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getStatement() <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected String statement = STATEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected static final String RATIONALE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected String rationale = RATIONALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAcceptanceCriteria() <em>Acceptance Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptanceCriteria()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCEPTANCE_CRITERIA_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAcceptanceCriteria() <em>Acceptance Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptanceCriteria()
	 * @generated
	 * @ordered
	 */
	protected String acceptanceCriteria = ACCEPTANCE_CRITERIA_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final RequirementType TYPE_EDEFAULT = RequirementType.FUNCTIONAL;
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected RequirementType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubtype() <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBTYPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSubtype() <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected String subtype = SUBTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedOn() <em>Created On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedOn()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_ON_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCreatedOn() <em>Created On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedOn()
	 * @generated
	 * @ordered
	 */
	protected Date createdOn = CREATED_ON_EDEFAULT;

	/**
	 * The default value of the '{@link #getModifiedOn() <em>Modified On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedOn()
	 * @generated
	 * @ordered
	 */
	protected static final Date MODIFIED_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModifiedOn() <em>Modified On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedOn()
	 * @generated
	 * @ordered
	 */
	protected Date modifiedOn = MODIFIED_ON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected RequirementImpl() {
		super();
		if (getCreatedOn() == null) {
			setCreatedOn(new Date());
		}
		if (getModifiedOn() == null) {
			setModifiedOn(new Date());
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementPackage.Literals.REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(int newVersion) {
		int oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EObject> getReferencedObject() {
		if (referencedObject == null) {
			referencedObject = new EObjectResolvingEList<EObject>(EObject.class, this, RequirementPackage.REQUIREMENT__REFERENCED_OBJECT);
		}
		return referencedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatement() {
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatement(String newStatement) {
		String oldStatement = statement;
		statement = newStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__STATEMENT, oldStatement, statement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRationale() {
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRationale(String newRationale) {
		String oldRationale = rationale;
		rationale = newRationale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__RATIONALE, oldRationale, rationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAcceptanceCriteria() {
		return acceptanceCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcceptanceCriteria(String newAcceptanceCriteria) {
		String oldAcceptanceCriteria = acceptanceCriteria;
		acceptanceCriteria = newAcceptanceCriteria;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__ACCEPTANCE_CRITERIA, oldAcceptanceCriteria, acceptanceCriteria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(RequirementType newType) {
		RequirementType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getCategory() {
		if (eContainerFeatureID() != RequirementPackage.REQUIREMENT__CATEGORY) return null;
		return (Category)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category basicGetCategory() {
		if (eContainerFeatureID() != RequirementPackage.REQUIREMENT__CATEGORY) return null;
		return (Category)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(Category newCategory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCategory, RequirementPackage.REQUIREMENT__CATEGORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(Category newCategory) {
		if (newCategory != eInternalContainer() || (eContainerFeatureID() != RequirementPackage.REQUIREMENT__CATEGORY && newCategory != null)) {
			if (EcoreUtil.isAncestor(this, newCategory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, RequirementPackage.CATEGORY__REQUIREMENTS, Category.class, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubtype() {
		return subtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtype(String newSubtype) {
		String oldSubtype = subtype;
		subtype = newSubtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__SUBTYPE, oldSubtype, subtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreatedOn() {
		return createdOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedOn(Date newCreatedOn) {
		Date oldCreatedOn = createdOn;
		createdOn = newCreatedOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__CREATED_ON, oldCreatedOn, createdOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getModifiedOn() {
		return modifiedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifiedOn(Date newModifiedOn) {
		Date oldModifiedOn = modifiedOn;
		modifiedOn = newModifiedOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__MODIFIED_ON, oldModifiedOn, modifiedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequirementPackage.REQUIREMENT__CATEGORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCategory((Category)otherEnd, msgs);
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
			case RequirementPackage.REQUIREMENT__CATEGORY:
				return basicSetCategory(null, msgs);
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
			case RequirementPackage.REQUIREMENT__CATEGORY:
				return eInternalContainer().eInverseRemove(this, RequirementPackage.CATEGORY__REQUIREMENTS, Category.class, msgs);
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
			case RequirementPackage.REQUIREMENT__ID:
				return getId();
			case RequirementPackage.REQUIREMENT__VERSION:
				return getVersion();
			case RequirementPackage.REQUIREMENT__REFERENCED_OBJECT:
				return getReferencedObject();
			case RequirementPackage.REQUIREMENT__STATEMENT:
				return getStatement();
			case RequirementPackage.REQUIREMENT__RATIONALE:
				return getRationale();
			case RequirementPackage.REQUIREMENT__ACCEPTANCE_CRITERIA:
				return getAcceptanceCriteria();
			case RequirementPackage.REQUIREMENT__TYPE:
				return getType();
			case RequirementPackage.REQUIREMENT__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case RequirementPackage.REQUIREMENT__SUBTYPE:
				return getSubtype();
			case RequirementPackage.REQUIREMENT__STATUS:
				return getStatus();
			case RequirementPackage.REQUIREMENT__CREATED_ON:
				return getCreatedOn();
			case RequirementPackage.REQUIREMENT__MODIFIED_ON:
				return getModifiedOn();
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
			case RequirementPackage.REQUIREMENT__ID:
				setId((String)newValue);
				return;
			case RequirementPackage.REQUIREMENT__VERSION:
				setVersion((Integer)newValue);
				return;
			case RequirementPackage.REQUIREMENT__REFERENCED_OBJECT:
				getReferencedObject().clear();
				getReferencedObject().addAll((Collection<? extends EObject>)newValue);
				return;
			case RequirementPackage.REQUIREMENT__STATEMENT:
				setStatement((String)newValue);
				return;
			case RequirementPackage.REQUIREMENT__RATIONALE:
				setRationale((String)newValue);
				return;
			case RequirementPackage.REQUIREMENT__ACCEPTANCE_CRITERIA:
				setAcceptanceCriteria((String)newValue);
				return;
			case RequirementPackage.REQUIREMENT__TYPE:
				setType((RequirementType)newValue);
				return;
			case RequirementPackage.REQUIREMENT__CATEGORY:
				setCategory((Category)newValue);
				return;
			case RequirementPackage.REQUIREMENT__SUBTYPE:
				setSubtype((String)newValue);
				return;
			case RequirementPackage.REQUIREMENT__STATUS:
				setStatus((String)newValue);
				return;
			case RequirementPackage.REQUIREMENT__CREATED_ON:
				setCreatedOn((Date)newValue);
				return;
			case RequirementPackage.REQUIREMENT__MODIFIED_ON:
				setModifiedOn((Date)newValue);
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
			case RequirementPackage.REQUIREMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__REFERENCED_OBJECT:
				getReferencedObject().clear();
				return;
			case RequirementPackage.REQUIREMENT__STATEMENT:
				setStatement(STATEMENT_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__RATIONALE:
				setRationale(RATIONALE_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__ACCEPTANCE_CRITERIA:
				setAcceptanceCriteria(ACCEPTANCE_CRITERIA_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__CATEGORY:
				setCategory((Category)null);
				return;
			case RequirementPackage.REQUIREMENT__SUBTYPE:
				setSubtype(SUBTYPE_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__CREATED_ON:
				setCreatedOn(CREATED_ON_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__MODIFIED_ON:
				setModifiedOn(MODIFIED_ON_EDEFAULT);
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
			case RequirementPackage.REQUIREMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case RequirementPackage.REQUIREMENT__VERSION:
				return version != VERSION_EDEFAULT;
			case RequirementPackage.REQUIREMENT__REFERENCED_OBJECT:
				return referencedObject != null && !referencedObject.isEmpty();
			case RequirementPackage.REQUIREMENT__STATEMENT:
				return STATEMENT_EDEFAULT == null ? statement != null : !STATEMENT_EDEFAULT.equals(statement);
			case RequirementPackage.REQUIREMENT__RATIONALE:
				return RATIONALE_EDEFAULT == null ? rationale != null : !RATIONALE_EDEFAULT.equals(rationale);
			case RequirementPackage.REQUIREMENT__ACCEPTANCE_CRITERIA:
				return ACCEPTANCE_CRITERIA_EDEFAULT == null ? acceptanceCriteria != null : !ACCEPTANCE_CRITERIA_EDEFAULT.equals(acceptanceCriteria);
			case RequirementPackage.REQUIREMENT__TYPE:
				return type != TYPE_EDEFAULT;
			case RequirementPackage.REQUIREMENT__CATEGORY:
				return basicGetCategory() != null;
			case RequirementPackage.REQUIREMENT__SUBTYPE:
				return SUBTYPE_EDEFAULT == null ? subtype != null : !SUBTYPE_EDEFAULT.equals(subtype);
			case RequirementPackage.REQUIREMENT__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case RequirementPackage.REQUIREMENT__CREATED_ON:
				return CREATED_ON_EDEFAULT == null ? createdOn != null : !CREATED_ON_EDEFAULT.equals(createdOn);
			case RequirementPackage.REQUIREMENT__MODIFIED_ON:
				return MODIFIED_ON_EDEFAULT == null ? modifiedOn != null : !MODIFIED_ON_EDEFAULT.equals(modifiedOn);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", version: ");
		result.append(version);
		result.append(", statement: ");
		result.append(statement);
		result.append(", rationale: ");
		result.append(rationale);
		result.append(", acceptanceCriteria: ");
		result.append(acceptanceCriteria);
		result.append(", type: ");
		result.append(type);
		result.append(", subtype: ");
		result.append(subtype);
		result.append(", status: ");
		result.append(status);
		result.append(", createdOn: ");
		result.append(createdOn);
		result.append(", modifiedOn: ");
		result.append(modifiedOn);
		result.append(')');
		return result.toString();
	}



} //RequirementImpl
