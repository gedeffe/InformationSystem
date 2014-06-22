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
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.obeonetwork.dsl.entity.Attribute;
import org.obeonetwork.dsl.entity.Block;
import org.obeonetwork.dsl.entity.Entity;
import org.obeonetwork.dsl.entity.EntityPackage;
import org.obeonetwork.dsl.entity.Finder;
import org.obeonetwork.dsl.entity.InheritanceKind;
import org.obeonetwork.dsl.entity.Property;
import org.obeonetwork.dsl.entity.Reference;
import org.obeonetwork.dsl.environment.impl.StructuredTypeImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.entity.impl.EntityImpl#getOwnedAttributes <em>Owned Attributes</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entity.impl.EntityImpl#getOwnedReferences <em>Owned References</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entity.impl.EntityImpl#getSupertype <em>Supertype</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entity.impl.EntityImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entity.impl.EntityImpl#getReferences <em>References</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entity.impl.EntityImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entity.impl.EntityImpl#getEstimatedVolumetry <em>Estimated Volumetry</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entity.impl.EntityImpl#getEstimatedAccess <em>Estimated Access</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entity.impl.EntityImpl#isHistorized <em>Historized</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entity.impl.EntityImpl#getOwnedFinders <em>Owned Finders</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entity.impl.EntityImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entity.impl.EntityImpl#getInheritanceKind <em>Inheritance Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends StructuredTypeImpl implements Entity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2008-2009 Obeo.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getOwnedAttributes() <em>Owned Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> ownedAttributes;

	/**
	 * The cached value of the '{@link #getOwnedReferences() <em>Owned References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> ownedReferences;

	/**
	 * The cached value of the '{@link #getSupertype() <em>Supertype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupertype()
	 * @generated
	 * @ordered
	 */
	protected Entity supertype;

	/**
	 * The default value of the '{@link #getEstimatedVolumetry() <em>Estimated Volumetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedVolumetry()
	 * @generated
	 * @ordered
	 */
	protected static final int ESTIMATED_VOLUMETRY_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getEstimatedVolumetry() <em>Estimated Volumetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedVolumetry()
	 * @generated
	 * @ordered
	 */
	protected int estimatedVolumetry = ESTIMATED_VOLUMETRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedAccess() <em>Estimated Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedAccess()
	 * @generated
	 * @ordered
	 */
	protected static final int ESTIMATED_ACCESS_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getEstimatedAccess() <em>Estimated Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedAccess()
	 * @generated
	 * @ordered
	 */
	protected int estimatedAccess = ESTIMATED_ACCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #isHistorized() <em>Historized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHistorized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HISTORIZED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isHistorized() <em>Historized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHistorized()
	 * @generated
	 * @ordered
	 */
	protected boolean historized = HISTORIZED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedFinders() <em>Owned Finders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFinders()
	 * @generated
	 * @ordered
	 */
	protected EList<Finder> ownedFinders;

	/**
	 * The default value of the '{@link #getInheritanceKind() <em>Inheritance Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritanceKind()
	 * @generated
	 * @ordered
	 */
	protected static final InheritanceKind INHERITANCE_KIND_EDEFAULT = InheritanceKind.TABLE_PER_SUBCLASS_LITERAL;

	/**
	 * The cached value of the '{@link #getInheritanceKind() <em>Inheritance Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritanceKind()
	 * @generated
	 * @ordered
	 */
	protected InheritanceKind inheritanceKind = INHERITANCE_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Attribute> getOwnedAttributes() {
		if (ownedAttributes == null) {
			ownedAttributes = new EObjectContainmentWithInverseEList.Resolving<Attribute>(Attribute.class, this, EntityPackage.ENTITY__OWNED_ATTRIBUTES, EntityPackage.ATTRIBUTE__ENTITY);
		}
		return ownedAttributes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Reference> getOwnedReferences() {
		if (ownedReferences == null) {
			ownedReferences = new EObjectContainmentWithInverseEList.Resolving<Reference>(Reference.class, this, EntityPackage.ENTITY__OWNED_REFERENCES, EntityPackage.REFERENCE__ENTITY);
		}
		return ownedReferences;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getSupertype() {
		if (supertype != null && supertype.eIsProxy()) {
			InternalEObject oldSupertype = (InternalEObject)supertype;
			supertype = (Entity)eResolveProxy(oldSupertype);
			if (supertype != oldSupertype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityPackage.ENTITY__SUPERTYPE, oldSupertype, supertype));
			}
		}
		return supertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetSupertype() {
		return supertype;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupertype(Entity newSupertype) {
		Entity oldSupertype = supertype;
		supertype = newSupertype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.ENTITY__SUPERTYPE, oldSupertype, supertype));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList getAttributes() {
		BasicEList result = new UniqueEList() {
			protected Object[] newData(int capacity) {
				return new Attribute[capacity];
			}

			protected boolean useEquals() {
				return false;
			}
		};
		result.addAll(getOwnedAttributes());
		if (getSupertype() != null)
			result.addAll(getSupertype().getAttributes());
		result.shrink();
		EList unmodifiableResult = new EcoreEList.UnmodifiableEList.FastCompare(
				this, EntityPackage.eINSTANCE.getEntity_Attributes(), result
						.size(), result.data());
		return unmodifiableResult;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList getReferences() {
		BasicEList result = new UniqueEList() {
			protected Object[] newData(int capacity) {
				return new Reference[capacity];
			}

			protected boolean useEquals() {
				return false;
			}
		};
		result.addAll(getOwnedReferences());
		if (getSupertype() != null)
			result.addAll(getSupertype().getReferences());
		result.shrink();
		EList unmodifiableResult = new EcoreEList.UnmodifiableEList.FastCompare(
				this, EntityPackage.eINSTANCE.getEntity_References(), result
						.size(), result.data());
		return unmodifiableResult;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList getProperties() {
		BasicEList result = new UniqueEList() {
			protected Object[] newData(int capacity) {
				return new Property[capacity];
			}

			protected boolean useEquals() {
				return false;
			}
		};
		result.addAll(getAttributes());
		result.addAll(getReferences());
		result.shrink();
		EList unmodifiableResult = new EcoreEList.UnmodifiableEList.FastCompare(
				this, EntityPackage.eINSTANCE.getEntity_Attributes(), result
						.size(), result.data());
		return unmodifiableResult;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getEstimatedVolumetry() {
		return estimatedVolumetry;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstimatedVolumetry(int newEstimatedVolumetry) {
		int oldEstimatedVolumetry = estimatedVolumetry;
		estimatedVolumetry = newEstimatedVolumetry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.ENTITY__ESTIMATED_VOLUMETRY, oldEstimatedVolumetry, estimatedVolumetry));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getEstimatedAccess() {
		return estimatedAccess;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstimatedAccess(int newEstimatedAccess) {
		int oldEstimatedAccess = estimatedAccess;
		estimatedAccess = newEstimatedAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.ENTITY__ESTIMATED_ACCESS, oldEstimatedAccess, estimatedAccess));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHistorized() {
		return historized;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistorized(boolean newHistorized) {
		boolean oldHistorized = historized;
		historized = newHistorized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.ENTITY__HISTORIZED, oldHistorized, historized));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Finder> getOwnedFinders() {
		if (ownedFinders == null) {
			ownedFinders = new EObjectContainmentWithInverseEList.Resolving<Finder>(Finder.class, this, EntityPackage.ENTITY__OWNED_FINDERS, EntityPackage.FINDER__ENTITY);
		}
		return ownedFinders;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Block getBlock() {
		if (eContainerFeatureID() != EntityPackage.ENTITY__BLOCK) return null;
		return (Block)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block basicGetBlock() {
		if (eContainerFeatureID() != EntityPackage.ENTITY__BLOCK) return null;
		return (Block)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlock(Block newBlock, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBlock, EntityPackage.ENTITY__BLOCK, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlock(Block newBlock) {
		if (newBlock != eInternalContainer() || (eContainerFeatureID() != EntityPackage.ENTITY__BLOCK && newBlock != null)) {
			if (EcoreUtil.isAncestor(this, newBlock))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBlock != null)
				msgs = ((InternalEObject)newBlock).eInverseAdd(this, EntityPackage.BLOCK__ENTITIES, Block.class, msgs);
			msgs = basicSetBlock(newBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.ENTITY__BLOCK, newBlock, newBlock));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public InheritanceKind getInheritanceKind() {
		return inheritanceKind;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setInheritanceKind(InheritanceKind newInheritanceKind) {
		InheritanceKind oldInheritanceKind = inheritanceKind;
		inheritanceKind = newInheritanceKind == null ? INHERITANCE_KIND_EDEFAULT : newInheritanceKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.ENTITY__INHERITANCE_KIND, oldInheritanceKind, inheritanceKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSubtypeOf(Entity entity) {
		// An entity A is a subtype of an entity B
		// - A and B are both the same entity
		// - the supertype of A is B
		// - the supertype of A is a subtype of B
		return (EcoreUtil.equals(this, entity)
				|| (getSupertype() != null
						&& (EcoreUtil.equals(getSupertype(), entity) || getSupertype().isSubtypeOf(entity))));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntityPackage.ENTITY__OWNED_ATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedAttributes()).basicAdd(otherEnd, msgs);
			case EntityPackage.ENTITY__OWNED_REFERENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedReferences()).basicAdd(otherEnd, msgs);
			case EntityPackage.ENTITY__OWNED_FINDERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedFinders()).basicAdd(otherEnd, msgs);
			case EntityPackage.ENTITY__BLOCK:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBlock((Block)otherEnd, msgs);
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
			case EntityPackage.ENTITY__OWNED_ATTRIBUTES:
				return ((InternalEList<?>)getOwnedAttributes()).basicRemove(otherEnd, msgs);
			case EntityPackage.ENTITY__OWNED_REFERENCES:
				return ((InternalEList<?>)getOwnedReferences()).basicRemove(otherEnd, msgs);
			case EntityPackage.ENTITY__OWNED_FINDERS:
				return ((InternalEList<?>)getOwnedFinders()).basicRemove(otherEnd, msgs);
			case EntityPackage.ENTITY__BLOCK:
				return basicSetBlock(null, msgs);
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
			case EntityPackage.ENTITY__BLOCK:
				return eInternalContainer().eInverseRemove(this, EntityPackage.BLOCK__ENTITIES, Block.class, msgs);
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
			case EntityPackage.ENTITY__OWNED_ATTRIBUTES:
				return getOwnedAttributes();
			case EntityPackage.ENTITY__OWNED_REFERENCES:
				return getOwnedReferences();
			case EntityPackage.ENTITY__SUPERTYPE:
				if (resolve) return getSupertype();
				return basicGetSupertype();
			case EntityPackage.ENTITY__ATTRIBUTES:
				return getAttributes();
			case EntityPackage.ENTITY__REFERENCES:
				return getReferences();
			case EntityPackage.ENTITY__PROPERTIES:
				return getProperties();
			case EntityPackage.ENTITY__ESTIMATED_VOLUMETRY:
				return getEstimatedVolumetry();
			case EntityPackage.ENTITY__ESTIMATED_ACCESS:
				return getEstimatedAccess();
			case EntityPackage.ENTITY__HISTORIZED:
				return isHistorized();
			case EntityPackage.ENTITY__OWNED_FINDERS:
				return getOwnedFinders();
			case EntityPackage.ENTITY__BLOCK:
				if (resolve) return getBlock();
				return basicGetBlock();
			case EntityPackage.ENTITY__INHERITANCE_KIND:
				return getInheritanceKind();
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
			case EntityPackage.ENTITY__OWNED_ATTRIBUTES:
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case EntityPackage.ENTITY__OWNED_REFERENCES:
				getOwnedReferences().clear();
				getOwnedReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case EntityPackage.ENTITY__SUPERTYPE:
				setSupertype((Entity)newValue);
				return;
			case EntityPackage.ENTITY__ESTIMATED_VOLUMETRY:
				setEstimatedVolumetry((Integer)newValue);
				return;
			case EntityPackage.ENTITY__ESTIMATED_ACCESS:
				setEstimatedAccess((Integer)newValue);
				return;
			case EntityPackage.ENTITY__HISTORIZED:
				setHistorized((Boolean)newValue);
				return;
			case EntityPackage.ENTITY__OWNED_FINDERS:
				getOwnedFinders().clear();
				getOwnedFinders().addAll((Collection<? extends Finder>)newValue);
				return;
			case EntityPackage.ENTITY__BLOCK:
				setBlock((Block)newValue);
				return;
			case EntityPackage.ENTITY__INHERITANCE_KIND:
				setInheritanceKind((InheritanceKind)newValue);
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
			case EntityPackage.ENTITY__OWNED_ATTRIBUTES:
				getOwnedAttributes().clear();
				return;
			case EntityPackage.ENTITY__OWNED_REFERENCES:
				getOwnedReferences().clear();
				return;
			case EntityPackage.ENTITY__SUPERTYPE:
				setSupertype((Entity)null);
				return;
			case EntityPackage.ENTITY__ESTIMATED_VOLUMETRY:
				setEstimatedVolumetry(ESTIMATED_VOLUMETRY_EDEFAULT);
				return;
			case EntityPackage.ENTITY__ESTIMATED_ACCESS:
				setEstimatedAccess(ESTIMATED_ACCESS_EDEFAULT);
				return;
			case EntityPackage.ENTITY__HISTORIZED:
				setHistorized(HISTORIZED_EDEFAULT);
				return;
			case EntityPackage.ENTITY__OWNED_FINDERS:
				getOwnedFinders().clear();
				return;
			case EntityPackage.ENTITY__BLOCK:
				setBlock((Block)null);
				return;
			case EntityPackage.ENTITY__INHERITANCE_KIND:
				setInheritanceKind(INHERITANCE_KIND_EDEFAULT);
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
			case EntityPackage.ENTITY__OWNED_ATTRIBUTES:
				return ownedAttributes != null && !ownedAttributes.isEmpty();
			case EntityPackage.ENTITY__OWNED_REFERENCES:
				return ownedReferences != null && !ownedReferences.isEmpty();
			case EntityPackage.ENTITY__SUPERTYPE:
				return supertype != null;
			case EntityPackage.ENTITY__ATTRIBUTES:
				return !getAttributes().isEmpty();
			case EntityPackage.ENTITY__REFERENCES:
				return !getReferences().isEmpty();
			case EntityPackage.ENTITY__PROPERTIES:
				return !getProperties().isEmpty();
			case EntityPackage.ENTITY__ESTIMATED_VOLUMETRY:
				return estimatedVolumetry != ESTIMATED_VOLUMETRY_EDEFAULT;
			case EntityPackage.ENTITY__ESTIMATED_ACCESS:
				return estimatedAccess != ESTIMATED_ACCESS_EDEFAULT;
			case EntityPackage.ENTITY__HISTORIZED:
				return historized != HISTORIZED_EDEFAULT;
			case EntityPackage.ENTITY__OWNED_FINDERS:
				return ownedFinders != null && !ownedFinders.isEmpty();
			case EntityPackage.ENTITY__BLOCK:
				return basicGetBlock() != null;
			case EntityPackage.ENTITY__INHERITANCE_KIND:
				return inheritanceKind != INHERITANCE_KIND_EDEFAULT;
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
		result.append(" (estimatedVolumetry: ");
		result.append(estimatedVolumetry);
		result.append(", estimatedAccess: ");
		result.append(estimatedAccess);
		result.append(", historized: ");
		result.append(historized);
		result.append(", inheritanceKind: ");
		result.append(inheritanceKind);
		result.append(')');
		return result.toString();
	}

} // EntityImpl
