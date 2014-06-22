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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.obeonetwork.dsl.environment.DTO;
import org.obeonetwork.dsl.environment.EnvironmentPackage;
import org.obeonetwork.dsl.environment.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.ReferenceImpl#isIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.ReferenceImpl#isNavigable <em>Navigable</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.ReferenceImpl#getOppositeOf <em>Opposite Of</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.ReferenceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.ReferenceImpl#getDto <em>Dto</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceImpl extends PropertyImpl implements Reference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2008-2009 Obeo.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The default value of the '{@link #isIsComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComposite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMPOSITE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComposite()
	 * @generated
	 * @ordered
	 */
	protected boolean isComposite = IS_COMPOSITE_EDEFAULT;

	/**
	 * The default value of the '{@link #isNavigable() <em>Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNavigable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NAVIGABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNavigable() <em>Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNavigable()
	 * @generated
	 * @ordered
	 */
	protected boolean navigable = NAVIGABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOppositeOf() <em>Opposite Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppositeOf()
	 * @generated
	 * @ordered
	 */
	protected Reference oppositeOf;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DTO type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnvironmentPackage.Literals.REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsComposite() {
		return isComposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsComposite(boolean newIsComposite) {
		boolean oldIsComposite = isComposite;
		isComposite = newIsComposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EnvironmentPackage.REFERENCE__IS_COMPOSITE, oldIsComposite,
					isComposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNavigable() {
		return navigable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigable(boolean newNavigable) {
		boolean oldNavigable = navigable;
		navigable = newNavigable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EnvironmentPackage.REFERENCE__NAVIGABLE, oldNavigable,
					navigable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOppositeOf() {
		if (oppositeOf != null && oppositeOf.eIsProxy()) {
			InternalEObject oldOppositeOf = (InternalEObject) oppositeOf;
			oppositeOf = (Reference) eResolveProxy(oldOppositeOf);
			if (oppositeOf != oldOppositeOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EnvironmentPackage.REFERENCE__OPPOSITE_OF,
							oldOppositeOf, oppositeOf));
			}
		}
		return oppositeOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference basicGetOppositeOf() {
		return oppositeOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOppositeOf(Reference newOppositeOf) {
		Reference oldOppositeOf = oppositeOf;
		oppositeOf = newOppositeOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EnvironmentPackage.REFERENCE__OPPOSITE_OF, oldOppositeOf,
					oppositeOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTO getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (DTO) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EnvironmentPackage.REFERENCE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTO basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DTO newType) {
		DTO oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EnvironmentPackage.REFERENCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTO getDto() {
		if (eContainerFeatureID() != EnvironmentPackage.REFERENCE__DTO)
			return null;
		return (DTO) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTO basicGetDto() {
		if (eContainerFeatureID() != EnvironmentPackage.REFERENCE__DTO)
			return null;
		return (DTO) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDto(DTO newDto, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newDto,
				EnvironmentPackage.REFERENCE__DTO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setDto(DTO newDto) {
		if (newDto != eInternalContainer()
				|| (eContainerFeatureID() != EnvironmentPackage.REFERENCE__DTO && newDto != null)) {
			if (EcoreUtil.isAncestor(this, newDto))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDto != null)
				msgs = ((InternalEObject) newDto).eInverseAdd(this,
						EnvironmentPackage.DTO__OWNED_REFERENCES, DTO.class,
						msgs);
			msgs = eBasicSetContainer((InternalEObject) newDto,
					EnvironmentPackage.REFERENCE__DTO, msgs);
			if (msgs != null) {
				msgs.dispatch();
			} else {
				// We check if the oppositeOf is still consistent
				if (getOppositeOf() != null
						&& !newDto.isSubtypeOf(getOppositeOf().getType())) {
					setOppositeOf(null);
				}
			}
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EnvironmentPackage.REFERENCE__DTO, newDto, newDto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean canBeOppositeOf(Reference opposite) {
		return (opposite != null && getDto() != null && getType() != null
				&& opposite.getDto() != null && opposite.getType() != null
				&& getDto().isSubtypeOf(opposite.getType()) && opposite
				.getDto().isSubtypeOf(getType()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EnvironmentPackage.REFERENCE__DTO:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetDto((DTO) otherEnd, msgs);
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
		case EnvironmentPackage.REFERENCE__DTO:
			return basicSetDto(null, msgs);
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
		case EnvironmentPackage.REFERENCE__DTO:
			return eInternalContainer().eInverseRemove(this,
					EnvironmentPackage.DTO__OWNED_REFERENCES, DTO.class, msgs);
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
		case EnvironmentPackage.REFERENCE__IS_COMPOSITE:
			return isIsComposite();
		case EnvironmentPackage.REFERENCE__NAVIGABLE:
			return isNavigable();
		case EnvironmentPackage.REFERENCE__OPPOSITE_OF:
			if (resolve)
				return getOppositeOf();
			return basicGetOppositeOf();
		case EnvironmentPackage.REFERENCE__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case EnvironmentPackage.REFERENCE__DTO:
			if (resolve)
				return getDto();
			return basicGetDto();
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
		case EnvironmentPackage.REFERENCE__IS_COMPOSITE:
			setIsComposite((Boolean) newValue);
			return;
		case EnvironmentPackage.REFERENCE__NAVIGABLE:
			setNavigable((Boolean) newValue);
			return;
		case EnvironmentPackage.REFERENCE__OPPOSITE_OF:
			setOppositeOf((Reference) newValue);
			return;
		case EnvironmentPackage.REFERENCE__TYPE:
			setType((DTO) newValue);
			return;
		case EnvironmentPackage.REFERENCE__DTO:
			setDto((DTO) newValue);
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
		case EnvironmentPackage.REFERENCE__IS_COMPOSITE:
			setIsComposite(IS_COMPOSITE_EDEFAULT);
			return;
		case EnvironmentPackage.REFERENCE__NAVIGABLE:
			setNavigable(NAVIGABLE_EDEFAULT);
			return;
		case EnvironmentPackage.REFERENCE__OPPOSITE_OF:
			setOppositeOf((Reference) null);
			return;
		case EnvironmentPackage.REFERENCE__TYPE:
			setType((DTO) null);
			return;
		case EnvironmentPackage.REFERENCE__DTO:
			setDto((DTO) null);
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
		case EnvironmentPackage.REFERENCE__IS_COMPOSITE:
			return isComposite != IS_COMPOSITE_EDEFAULT;
		case EnvironmentPackage.REFERENCE__NAVIGABLE:
			return navigable != NAVIGABLE_EDEFAULT;
		case EnvironmentPackage.REFERENCE__OPPOSITE_OF:
			return oppositeOf != null;
		case EnvironmentPackage.REFERENCE__TYPE:
			return type != null;
		case EnvironmentPackage.REFERENCE__DTO:
			return basicGetDto() != null;
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
		result.append(" (isComposite: ");
		result.append(isComposite);
		result.append(", navigable: ");
		result.append(navigable);
		result.append(')');
		return result.toString();
	}

} //ReferenceImpl
