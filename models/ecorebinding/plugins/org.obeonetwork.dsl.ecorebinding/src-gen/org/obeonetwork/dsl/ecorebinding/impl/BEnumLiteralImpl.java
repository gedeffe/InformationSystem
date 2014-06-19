/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.ecorebinding.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnumLiteral;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.obeonetwork.dsl.ecorebinding.BEnum;
import org.obeonetwork.dsl.ecorebinding.BEnumLiteral;
import org.obeonetwork.dsl.ecorebinding.EcorebindingPackage;

import org.obeonetwork.dsl.environment.BoundableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BEnum Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.ecorebinding.impl.BEnumLiteralImpl#getBEnum <em>BEnum</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.ecorebinding.impl.BEnumLiteralImpl#getEcoreEnumLiteral <em>Ecore Enum Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BEnumLiteralImpl extends CDOObjectImpl implements BEnumLiteral {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BEnumLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorebindingPackage.Literals.BENUM_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BEnum getBEnum() {
		return (BEnum)eGet(EcorebindingPackage.Literals.BENUM_LITERAL__BENUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBEnum(BEnum newBEnum) {
		eSet(EcorebindingPackage.Literals.BENUM_LITERAL__BENUM, newBEnum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnumLiteral getEcoreEnumLiteral() {
		return (EEnumLiteral)eGet(EcorebindingPackage.Literals.BENUM_LITERAL__ECORE_ENUM_LITERAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcoreEnumLiteral(EEnumLiteral newEcoreEnumLiteral) {
		eSet(EcorebindingPackage.Literals.BENUM_LITERAL__ECORE_ENUM_LITERAL, newEcoreEnumLiteral);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPathValid(BoundableElement root, String path) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} //BEnumLiteralImpl
