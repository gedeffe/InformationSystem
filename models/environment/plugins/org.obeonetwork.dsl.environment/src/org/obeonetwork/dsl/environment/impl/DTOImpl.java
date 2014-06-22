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
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.environment.Attribute;
import org.obeonetwork.dsl.environment.DTO;
import org.obeonetwork.dsl.environment.EnvironmentPackage;
import org.obeonetwork.dsl.environment.FilterContainer;
import org.obeonetwork.dsl.environment.Property;
import org.obeonetwork.dsl.environment.Reference;
import org.obeonetwork.dsl.environment.StructuredType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DTO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.DTOImpl#getOwnedContainer <em>Owned Container</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.DTOImpl#getAssociatedTypes <em>Associated Types</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.DTOImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.DTOImpl#getReferences <em>References</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.DTOImpl#getOwnedReferences <em>Owned References</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.DTOImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.DTOImpl#getOwnedAttributes <em>Owned Attributes</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.DTOImpl#getSupertype <em>Supertype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DTOImpl extends StructuredTypeImpl implements DTO {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2008-2009 Obeo.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getOwnedContainer() <em>Owned Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedContainer()
	 * @generated
	 * @ordered
	 */
	protected FilterContainer ownedContainer;
	/**
	 * The cached value of the '{@link #getAssociatedTypes() <em>Associated Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredType> associatedTypes;
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
	 * The cached value of the '{@link #getOwnedAttributes() <em>Owned Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> ownedAttributes;
	/**
	 * The cached value of the '{@link #getSupertype() <em>Supertype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupertype()
	 * @generated
	 * @ordered
	 */
	protected DTO supertype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DTOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnvironmentPackage.Literals.DTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterContainer getOwnedContainer() {
		if (ownedContainer != null && ownedContainer.eIsProxy()) {
			InternalEObject oldOwnedContainer = (InternalEObject) ownedContainer;
			ownedContainer = (FilterContainer) eResolveProxy(oldOwnedContainer);
			if (ownedContainer != oldOwnedContainer) {
				InternalEObject newOwnedContainer = (InternalEObject) ownedContainer;
				NotificationChain msgs = oldOwnedContainer.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- EnvironmentPackage.DTO__OWNED_CONTAINER,
						null, null);
				if (newOwnedContainer.eInternalContainer() == null) {
					msgs = newOwnedContainer.eInverseAdd(this,
							EOPPOSITE_FEATURE_BASE
									- EnvironmentPackage.DTO__OWNED_CONTAINER,
							null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EnvironmentPackage.DTO__OWNED_CONTAINER,
							oldOwnedContainer, ownedContainer));
			}
		}
		return ownedContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterContainer basicGetOwnedContainer() {
		return ownedContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedContainer(
			FilterContainer newOwnedContainer, NotificationChain msgs) {
		FilterContainer oldOwnedContainer = ownedContainer;
		ownedContainer = newOwnedContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, EnvironmentPackage.DTO__OWNED_CONTAINER,
					oldOwnedContainer, newOwnedContainer);
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
	public void setOwnedContainer(FilterContainer newOwnedContainer) {
		if (newOwnedContainer != ownedContainer) {
			NotificationChain msgs = null;
			if (ownedContainer != null)
				msgs = ((InternalEObject) ownedContainer).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- EnvironmentPackage.DTO__OWNED_CONTAINER,
						null, msgs);
			if (newOwnedContainer != null)
				msgs = ((InternalEObject) newOwnedContainer).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- EnvironmentPackage.DTO__OWNED_CONTAINER,
						null, msgs);
			msgs = basicSetOwnedContainer(newOwnedContainer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EnvironmentPackage.DTO__OWNED_CONTAINER, newOwnedContainer,
					newOwnedContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<StructuredType> getAssociatedTypes() {
		if (associatedTypes == null) {
			associatedTypes = new EObjectResolvingEList<StructuredType>(
					StructuredType.class, this,
					EnvironmentPackage.DTO__ASSOCIATED_TYPES);
		}
		return associatedTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Property> getProperties() {
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
				this, EnvironmentPackage.eINSTANCE.getDTO_Attributes(),
				result.size(), result.data());
		return unmodifiableResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Reference> getReferences() {
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
				this, EnvironmentPackage.eINSTANCE.getDTO_References(),
				result.size(), result.data());
		return unmodifiableResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Reference> getOwnedReferences() {
		if (ownedReferences == null) {
			ownedReferences = new EObjectContainmentWithInverseEList.Resolving<Reference>(
					Reference.class, this,
					EnvironmentPackage.DTO__OWNED_REFERENCES,
					EnvironmentPackage.REFERENCE__DTO);
		}
		return ownedReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Attribute> getAttributes() {
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
				this, EnvironmentPackage.eINSTANCE.getDTO_Attributes(),
				result.size(), result.data());
		return unmodifiableResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Attribute> getOwnedAttributes() {
		if (ownedAttributes == null) {
			ownedAttributes = new EObjectContainmentWithInverseEList.Resolving<Attribute>(
					Attribute.class, this,
					EnvironmentPackage.DTO__OWNED_ATTRIBUTES,
					EnvironmentPackage.ATTRIBUTE__DTO);
		}
		return ownedAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTO getSupertype() {
		if (supertype != null && supertype.eIsProxy()) {
			InternalEObject oldSupertype = (InternalEObject) supertype;
			supertype = (DTO) eResolveProxy(oldSupertype);
			if (supertype != oldSupertype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EnvironmentPackage.DTO__SUPERTYPE, oldSupertype,
							supertype));
			}
		}
		return supertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTO basicGetSupertype() {
		return supertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupertype(DTO newSupertype) {
		DTO oldSupertype = supertype;
		supertype = newSupertype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EnvironmentPackage.DTO__SUPERTYPE, oldSupertype, supertype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSubtypeOf(DTO dto) {
		// A DTO A is a subtype of a DTO B
		// - A and B are both the same DTO
		// - the supertype of A is B
		// - the supertype of A is a subtype of B
		return (EcoreUtil.equals(this, dto) || (getSupertype() != null && (EcoreUtil
				.equals(getSupertype(), dto) || getSupertype().isSubtypeOf(dto))));
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
		case EnvironmentPackage.DTO__OWNED_REFERENCES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedReferences())
					.basicAdd(otherEnd, msgs);
		case EnvironmentPackage.DTO__OWNED_ATTRIBUTES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedAttributes())
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
		case EnvironmentPackage.DTO__OWNED_CONTAINER:
			return basicSetOwnedContainer(null, msgs);
		case EnvironmentPackage.DTO__OWNED_REFERENCES:
			return ((InternalEList<?>) getOwnedReferences()).basicRemove(
					otherEnd, msgs);
		case EnvironmentPackage.DTO__OWNED_ATTRIBUTES:
			return ((InternalEList<?>) getOwnedAttributes()).basicRemove(
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
		case EnvironmentPackage.DTO__OWNED_CONTAINER:
			if (resolve)
				return getOwnedContainer();
			return basicGetOwnedContainer();
		case EnvironmentPackage.DTO__ASSOCIATED_TYPES:
			return getAssociatedTypes();
		case EnvironmentPackage.DTO__PROPERTIES:
			return getProperties();
		case EnvironmentPackage.DTO__REFERENCES:
			return getReferences();
		case EnvironmentPackage.DTO__OWNED_REFERENCES:
			return getOwnedReferences();
		case EnvironmentPackage.DTO__ATTRIBUTES:
			return getAttributes();
		case EnvironmentPackage.DTO__OWNED_ATTRIBUTES:
			return getOwnedAttributes();
		case EnvironmentPackage.DTO__SUPERTYPE:
			if (resolve)
				return getSupertype();
			return basicGetSupertype();
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
		case EnvironmentPackage.DTO__OWNED_CONTAINER:
			setOwnedContainer((FilterContainer) newValue);
			return;
		case EnvironmentPackage.DTO__ASSOCIATED_TYPES:
			getAssociatedTypes().clear();
			getAssociatedTypes().addAll(
					(Collection<? extends StructuredType>) newValue);
			return;
		case EnvironmentPackage.DTO__OWNED_REFERENCES:
			getOwnedReferences().clear();
			getOwnedReferences().addAll(
					(Collection<? extends Reference>) newValue);
			return;
		case EnvironmentPackage.DTO__OWNED_ATTRIBUTES:
			getOwnedAttributes().clear();
			getOwnedAttributes().addAll(
					(Collection<? extends Attribute>) newValue);
			return;
		case EnvironmentPackage.DTO__SUPERTYPE:
			setSupertype((DTO) newValue);
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
		case EnvironmentPackage.DTO__OWNED_CONTAINER:
			setOwnedContainer((FilterContainer) null);
			return;
		case EnvironmentPackage.DTO__ASSOCIATED_TYPES:
			getAssociatedTypes().clear();
			return;
		case EnvironmentPackage.DTO__OWNED_REFERENCES:
			getOwnedReferences().clear();
			return;
		case EnvironmentPackage.DTO__OWNED_ATTRIBUTES:
			getOwnedAttributes().clear();
			return;
		case EnvironmentPackage.DTO__SUPERTYPE:
			setSupertype((DTO) null);
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
		case EnvironmentPackage.DTO__OWNED_CONTAINER:
			return ownedContainer != null;
		case EnvironmentPackage.DTO__ASSOCIATED_TYPES:
			return associatedTypes != null && !associatedTypes.isEmpty();
		case EnvironmentPackage.DTO__PROPERTIES:
			return !getProperties().isEmpty();
		case EnvironmentPackage.DTO__REFERENCES:
			return !getReferences().isEmpty();
		case EnvironmentPackage.DTO__OWNED_REFERENCES:
			return ownedReferences != null && !ownedReferences.isEmpty();
		case EnvironmentPackage.DTO__ATTRIBUTES:
			return !getAttributes().isEmpty();
		case EnvironmentPackage.DTO__OWNED_ATTRIBUTES:
			return ownedAttributes != null && !ownedAttributes.isEmpty();
		case EnvironmentPackage.DTO__SUPERTYPE:
			return supertype != null;
		}
		return super.eIsSet(featureID);
	}

} //DTOImpl