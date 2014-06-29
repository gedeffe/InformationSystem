/**
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.obeonetwork.dsl.environment.bindingdialect.description.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.sirius.viewpoint.ViewpointPackage;
import org.eclipse.sirius.viewpoint.description.tool.ToolPackage;
import org.obeonetwork.dsl.environment.bindingdialect.BindingdialectPackage;
import org.obeonetwork.dsl.environment.bindingdialect.description.DBindingEditorCreationDescription;
import org.obeonetwork.dsl.environment.bindingdialect.description.DBindingEditorDescription;
import org.obeonetwork.dsl.environment.bindingdialect.description.DescriptionFactory;
import org.obeonetwork.dsl.environment.bindingdialect.description.DescriptionPackage;
import org.obeonetwork.dsl.environment.bindingdialect.impl.BindingdialectPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class DescriptionPackageImpl extends EPackageImpl implements
		DescriptionPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2011 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n    Obeo - initial API and implementation";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass dBindingEditorDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass dBindingEditorCreationDescriptionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.obeonetwork.dsl.environment.bindingdialect.description.DescriptionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DescriptionPackageImpl() {
		super(eNS_URI, DescriptionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link DescriptionPackage#eINSTANCE}
	 * when that field is accessed. Clients should not invoke it directly.
	 * Instead, they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DescriptionPackage init() {
		if (isInited) {
			return (DescriptionPackage) EPackage.Registry.INSTANCE
					.getEPackage(DescriptionPackage.eNS_URI);
		}

		// Obtain or create and register package
		final DescriptionPackageImpl theDescriptionPackage = (DescriptionPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof DescriptionPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new DescriptionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ViewpointPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		final BindingdialectPackageImpl theBindingdialectPackage = (BindingdialectPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(BindingdialectPackage.eNS_URI) instanceof BindingdialectPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(BindingdialectPackage.eNS_URI)
				: BindingdialectPackage.eINSTANCE);

		// Create package meta-data objects
		theDescriptionPackage.createPackageContents();
		theBindingdialectPackage.createPackageContents();

		// Initialize created meta-data
		theDescriptionPackage.initializePackageContents();
		theBindingdialectPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDescriptionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DescriptionPackage.eNS_URI,
				theDescriptionPackage);
		return theDescriptionPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getDBindingEditorDescription() {
		return this.dBindingEditorDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getDBindingEditorCreationDescription() {
		return this.dBindingEditorCreationDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getDBindingEditorCreationDescription_Description() {
		return (EReference) this.dBindingEditorCreationDescriptionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public DescriptionFactory getDescriptionFactory() {
		return (DescriptionFactory) this.getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to
	 * have no affect on any invocation but its first. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (this.isCreated) {
			return;
		}
		this.isCreated = true;

		// Create classes and their features
		this.dBindingEditorDescriptionEClass = this
				.createEClass(DBINDING_EDITOR_DESCRIPTION);

		this.dBindingEditorCreationDescriptionEClass = this
				.createEClass(DBINDING_EDITOR_CREATION_DESCRIPTION);
		this.createEReference(this.dBindingEditorCreationDescriptionEClass,
				DBINDING_EDITOR_CREATION_DESCRIPTION__DESCRIPTION);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (this.isInitialized) {
			return;
		}
		this.isInitialized = true;

		// Initialize package
		this.setName(eNAME);
		this.setNsPrefix(eNS_PREFIX);
		this.setNsURI(eNS_URI);

		// Obtain other dependent packages
		final org.eclipse.sirius.viewpoint.description.DescriptionPackage theDescriptionPackage_1 = (org.eclipse.sirius.viewpoint.description.DescriptionPackage) EPackage.Registry.INSTANCE
				.getEPackage(org.eclipse.sirius.viewpoint.description.DescriptionPackage.eNS_URI);
		final ToolPackage theToolPackage = (ToolPackage) EPackage.Registry.INSTANCE
				.getEPackage(ToolPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		this.dBindingEditorDescriptionEClass.getESuperTypes().add(
				theDescriptionPackage_1.getRepresentationDescription());
		this.dBindingEditorCreationDescriptionEClass.getESuperTypes().add(
				theToolPackage.getRepresentationCreationDescription());

		// Initialize classes and features; add operations and parameters
		this.initEClass(this.dBindingEditorDescriptionEClass,
				DBindingEditorDescription.class, "DBindingEditorDescription",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		this.initEClass(this.dBindingEditorCreationDescriptionEClass,
				DBindingEditorCreationDescription.class,
				"DBindingEditorCreationDescription", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		this.initEReference(
				this.getDBindingEditorCreationDescription_Description(),
				this.getDBindingEditorDescription(), null, "description", null,
				1, 1, DBindingEditorCreationDescription.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} // DescriptionPackageImpl
