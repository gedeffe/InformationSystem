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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.obeonetwork.dsl.cinematic.CinematicPackage;
import org.obeonetwork.dsl.cinematic.CinematicRoot;
import org.obeonetwork.dsl.cinematic.toolkits.Toolkit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.cinematic.impl.CinematicRootImpl#getToolkits <em>Toolkits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CinematicRootImpl extends AbstractPackageImpl implements CinematicRoot {
	/**
	 * The cached value of the '{@link #getToolkits() <em>Toolkits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolkits()
	 * @generated
	 * @ordered
	 */
	protected EList<Toolkit> toolkits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CinematicRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CinematicPackage.Literals.CINEMATIC_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Toolkit> getToolkits() {
		if (toolkits == null) {
			toolkits = new EObjectResolvingEList<Toolkit>(Toolkit.class, this, CinematicPackage.CINEMATIC_ROOT__TOOLKITS);
		}
		return toolkits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CinematicPackage.CINEMATIC_ROOT__TOOLKITS:
				return getToolkits();
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
			case CinematicPackage.CINEMATIC_ROOT__TOOLKITS:
				getToolkits().clear();
				getToolkits().addAll((Collection<? extends Toolkit>)newValue);
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
			case CinematicPackage.CINEMATIC_ROOT__TOOLKITS:
				getToolkits().clear();
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
			case CinematicPackage.CINEMATIC_ROOT__TOOLKITS:
				return toolkits != null && !toolkits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CinematicRootImpl
