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

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.RepresentationElementMapping;
import org.eclipse.sirius.viewpoint.description.tool.impl.RepresentationCreationDescriptionImpl;
import org.obeonetwork.dsl.environment.bindingdialect.description.DBindingEditorCreationDescription;
import org.obeonetwork.dsl.environment.bindingdialect.description.DBindingEditorDescription;
import org.obeonetwork.dsl.environment.bindingdialect.description.DescriptionPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>DBinding Editor Creation Description</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.obeonetwork.dsl.environment.bindingdialect.description.impl.DBindingEditorCreationDescriptionImpl#getDescription
 * <em>Description</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class DBindingEditorCreationDescriptionImpl extends
		RepresentationCreationDescriptionImpl implements
		DBindingEditorCreationDescription {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2011 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n    Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected DBindingEditorDescription description;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DBindingEditorCreationDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DescriptionPackage.Literals.DBINDING_EDITOR_CREATION_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public DBindingEditorDescription getDescription() {
		if ((this.description != null) && this.description.eIsProxy()) {
			final InternalEObject oldDescription = (InternalEObject) this.description;
			this.description = (DBindingEditorDescription) this
					.eResolveProxy(oldDescription);
			if (this.description != oldDescription) {
				if (this.eNotificationRequired()) {
					this.eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							DescriptionPackage.DBINDING_EDITOR_CREATION_DESCRIPTION__DESCRIPTION,
							oldDescription, this.description));
				}
			}
		}
		return this.description;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DBindingEditorDescription basicGetDescription() {
		return this.description;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setDescription(final DBindingEditorDescription newDescription) {
		final DBindingEditorDescription oldDescription = this.description;
		this.description = newDescription;
		if (this.eNotificationRequired()) {
			this.eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					DescriptionPackage.DBINDING_EDITOR_CREATION_DESCRIPTION__DESCRIPTION,
					oldDescription, this.description));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve,
			final boolean coreType) {
		switch (featureID) {
		case DescriptionPackage.DBINDING_EDITOR_CREATION_DESCRIPTION__DESCRIPTION:
			if (resolve) {
				return this.getDescription();
			}
			return this.basicGetDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(final int featureID, final Object newValue) {
		switch (featureID) {
		case DescriptionPackage.DBINDING_EDITOR_CREATION_DESCRIPTION__DESCRIPTION:
			this.setDescription((DBindingEditorDescription) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(final int featureID) {
		switch (featureID) {
		case DescriptionPackage.DBINDING_EDITOR_CREATION_DESCRIPTION__DESCRIPTION:
			this.setDescription((DBindingEditorDescription) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(final int featureID) {
		switch (featureID) {
		case DescriptionPackage.DBINDING_EDITOR_CREATION_DESCRIPTION__DESCRIPTION:
			return this.description != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.viewpoint.description.tool.impl.RepresentationCreationDescriptionImpl#getMappings()
	 * @generated NOT
	 */
	@Override
	public EList<RepresentationElementMapping> getMappings() {
		if (this.eResource() == null) {
			throw new UnsupportedOperationException();
		}
		final ECrossReferenceAdapter crossReferencer = ECrossReferenceAdapter
				.getCrossReferenceAdapter(this.eResource().getResourceSet());
		if (crossReferencer == null) {
			throw new UnsupportedOperationException();
		}
		final List<RepresentationElementMapping> mappings = new LinkedList<RepresentationElementMapping>();
		final Collection<Setting> settings = crossReferencer
				.getInverseReferences(this, true);
		for (final Setting setting : settings) {
			final EObject eReferencer = setting.getEObject();
			final EStructuralFeature eFeature = setting.getEStructuralFeature();
			if ((eReferencer instanceof RepresentationElementMapping)
					&& eFeature
							.equals(org.eclipse.sirius.viewpoint.description.DescriptionPackage.eINSTANCE
									.getRepresentationElementMapping_DetailDescriptions())) {
				mappings.add((RepresentationElementMapping) eReferencer);
			}
		}
		return new BasicEList<RepresentationElementMapping>(mappings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.viewpoint.description.tool.impl.RepresentationCreationDescriptionImpl#basicGetRepresentationDescription()
	 * @generated NOT
	 */
	@Override
	public RepresentationDescription basicGetRepresentationDescription() {
		return this.getDescription();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.viewpoint.description.tool.impl.RepresentationCreationDescriptionImpl#getRepresentationDescription()
	 * @generated NOT
	 */
	@Override
	public DBindingEditorDescription getRepresentationDescription() {
		return this.getDescription();
	}

} // DBindingEditorCreationDescriptionImpl
