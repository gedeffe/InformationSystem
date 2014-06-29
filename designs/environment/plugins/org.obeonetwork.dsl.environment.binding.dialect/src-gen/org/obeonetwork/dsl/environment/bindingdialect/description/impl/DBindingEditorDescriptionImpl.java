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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.sirius.viewpoint.description.EndUserDocumentedElement;
import org.eclipse.sirius.viewpoint.description.IdentifiedElement;
import org.eclipse.sirius.viewpoint.description.impl.DocumentedElementImpl;
import org.obeonetwork.dsl.environment.bindingdialect.description.DBindingEditorDescription;
import org.obeonetwork.dsl.environment.bindingdialect.description.DescriptionPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>DBinding Editor Description</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.obeonetwork.dsl.environment.bindingdialect.description.impl.DBindingEditorDescriptionImpl#getEndUserDocumentation
 * <em>End User Documentation</em>}</li>
 * <li>
 * {@link org.obeonetwork.dsl.environment.bindingdialect.description.impl.DBindingEditorDescriptionImpl#getName
 * <em>Name</em>}</li>
 * <li>
 * {@link org.obeonetwork.dsl.environment.bindingdialect.description.impl.DBindingEditorDescriptionImpl#getLabel
 * <em>Label</em>}</li>
 * <li>
 * {@link org.obeonetwork.dsl.environment.bindingdialect.description.impl.DBindingEditorDescriptionImpl#getTitleExpression
 * <em>Title Expression</em>}</li>
 * <li>
 * {@link org.obeonetwork.dsl.environment.bindingdialect.description.impl.DBindingEditorDescriptionImpl#isInitialisation
 * <em>Initialisation</em>}</li>
 * <li>
 * {@link org.obeonetwork.dsl.environment.bindingdialect.description.impl.DBindingEditorDescriptionImpl#getMetamodel
 * <em>Metamodel</em>}</li>
 * <li>
 * {@link org.obeonetwork.dsl.environment.bindingdialect.description.impl.DBindingEditorDescriptionImpl#isShowOnStartup
 * <em>Show On Startup</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class DBindingEditorDescriptionImpl extends DocumentedElementImpl
		implements DBindingEditorDescription {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2011 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n    Obeo - initial API and implementation";

	/**
	 * The default value of the '{@link #getEndUserDocumentation()
	 * <em>End User Documentation</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getEndUserDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String END_USER_DOCUMENTATION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getEndUserDocumentation()
	 * <em>End User Documentation</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getEndUserDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String endUserDocumentation = END_USER_DOCUMENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitleExpression()
	 * <em>Title Expression</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getTitleExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EXPRESSION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTitleExpression()
	 * <em>Title Expression</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getTitleExpression()
	 * @generated
	 * @ordered
	 */
	protected String titleExpression = TITLE_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #isInitialisation()
	 * <em>Initialisation</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isInitialisation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIALISATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInitialisation()
	 * <em>Initialisation</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isInitialisation()
	 * @generated
	 * @ordered
	 */
	protected boolean initialisation = INITIALISATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetamodel() <em>Metamodel</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMetamodel()
	 * @generated
	 * @ordered
	 */
	protected EList<EPackage> metamodel;

	/**
	 * The default value of the '{@link #isShowOnStartup()
	 * <em>Show On Startup</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isShowOnStartup()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_ON_STARTUP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowOnStartup()
	 * <em>Show On Startup</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isShowOnStartup()
	 * @generated
	 * @ordered
	 */
	protected boolean showOnStartup = SHOW_ON_STARTUP_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DBindingEditorDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DescriptionPackage.Literals.DBINDING_EDITOR_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getEndUserDocumentation() {
		return this.endUserDocumentation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setEndUserDocumentation(final String newEndUserDocumentation) {
		final String oldEndUserDocumentation = this.endUserDocumentation;
		this.endUserDocumentation = newEndUserDocumentation;
		if (this.eNotificationRequired()) {
			this.eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__END_USER_DOCUMENTATION,
					oldEndUserDocumentation, this.endUserDocumentation));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getName() {
		return this.name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setName(final String newName) {
		final String oldName = this.name;
		this.name = newName;
		if (this.eNotificationRequired()) {
			this.eNotify(new ENotificationImpl(this, Notification.SET,
					DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__NAME,
					oldName, this.name));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getLabel() {
		return this.label;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setLabel(final String newLabel) {
		final String oldLabel = this.label;
		this.label = newLabel;
		if (this.eNotificationRequired()) {
			this.eNotify(new ENotificationImpl(this, Notification.SET,
					DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__LABEL,
					oldLabel, this.label));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getTitleExpression() {
		return this.titleExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setTitleExpression(final String newTitleExpression) {
		final String oldTitleExpression = this.titleExpression;
		this.titleExpression = newTitleExpression;
		if (this.eNotificationRequired()) {
			this.eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__TITLE_EXPRESSION,
					oldTitleExpression, this.titleExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isInitialisation() {
		return this.initialisation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setInitialisation(final boolean newInitialisation) {
		final boolean oldInitialisation = this.initialisation;
		this.initialisation = newInitialisation;
		if (this.eNotificationRequired()) {
			this.eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__INITIALISATION,
					oldInitialisation, this.initialisation));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<EPackage> getMetamodel() {
		if (this.metamodel == null) {
			this.metamodel = new EObjectResolvingEList<EPackage>(
					EPackage.class, this,
					DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__METAMODEL);
		}
		return this.metamodel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isShowOnStartup() {
		return this.showOnStartup;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setShowOnStartup(final boolean newShowOnStartup) {
		final boolean oldShowOnStartup = this.showOnStartup;
		this.showOnStartup = newShowOnStartup;
		if (this.eNotificationRequired()) {
			this.eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__SHOW_ON_STARTUP,
					oldShowOnStartup, this.showOnStartup));
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
		case DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__END_USER_DOCUMENTATION:
			return this.getEndUserDocumentation();
		case DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__NAME:
			return this.getName();
		case DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__LABEL:
			return this.getLabel();
		case DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__TITLE_EXPRESSION:
			return this.getTitleExpression();
		case DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__INITIALISATION:
			return this.isInitialisation();
		case DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__METAMODEL:
			return this.getMetamodel();
		case DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__SHOW_ON_STARTUP:
			return this.isShowOnStartup();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(final int featureID, final Object newValue) {
		switch (featureID) {
		case DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__END_USER_DOCUMENTATION:
			this.setEndUserDocumentation((String) newValue);
			return;
		case DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__NAME:
			this.setName((String) newValue);
			return;
		case DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__LABEL:
			this.setLabel((String) newValue);
			return;
		case DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__TITLE_EXPRESSION:
			this.setTitleExpression((String) newValue);
			return;
		case DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__INITIALISATION:
			this.setInitialisation((Boolean) newValue);
			return;
		case DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__METAMODEL:
			this.getMetamodel().clear();
			this.getMetamodel().addAll(
					(Collection<? extends EPackage>) newValue);
			return;
		case DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__SHOW_ON_STARTUP:
			this.setShowOnStartup((Boolean) newValue);
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
		case DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__END_USER_DOCUMENTATION:
			this.setEndUserDocumentation(END_USER_DOCUMENTATION_EDEFAULT);
			return;
		case DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__NAME:
			this.setName(NAME_EDEFAULT);
			return;
		case DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__LABEL:
			this.setLabel(LABEL_EDEFAULT);
			return;
		case DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__TITLE_EXPRESSION:
			this.setTitleExpression(TITLE_EXPRESSION_EDEFAULT);
			return;
		case DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__INITIALISATION:
			this.setInitialisation(INITIALISATION_EDEFAULT);
			return;
		case DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__METAMODEL:
			this.getMetamodel().clear();
			return;
		case DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__SHOW_ON_STARTUP:
			this.setShowOnStartup(SHOW_ON_STARTUP_EDEFAULT);
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
		case DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__END_USER_DOCUMENTATION:
			return END_USER_DOCUMENTATION_EDEFAULT == null ? this.endUserDocumentation != null
					: !END_USER_DOCUMENTATION_EDEFAULT
							.equals(this.endUserDocumentation);
		case DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__NAME:
			return NAME_EDEFAULT == null ? this.name != null : !NAME_EDEFAULT
					.equals(this.name);
		case DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__LABEL:
			return LABEL_EDEFAULT == null ? this.label != null
					: !LABEL_EDEFAULT.equals(this.label);
		case DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__TITLE_EXPRESSION:
			return TITLE_EXPRESSION_EDEFAULT == null ? this.titleExpression != null
					: !TITLE_EXPRESSION_EDEFAULT.equals(this.titleExpression);
		case DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__INITIALISATION:
			return this.initialisation != INITIALISATION_EDEFAULT;
		case DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__METAMODEL:
			return (this.metamodel != null) && !this.metamodel.isEmpty();
		case DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__SHOW_ON_STARTUP:
			return this.showOnStartup != SHOW_ON_STARTUP_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(final int derivedFeatureID,
			final Class<?> baseClass) {
		if (baseClass == EndUserDocumentedElement.class) {
			switch (derivedFeatureID) {
			case DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__END_USER_DOCUMENTATION:
				return org.eclipse.sirius.viewpoint.description.DescriptionPackage.END_USER_DOCUMENTED_ELEMENT__END_USER_DOCUMENTATION;
			default:
				return -1;
			}
		}
		if (baseClass == IdentifiedElement.class) {
			switch (derivedFeatureID) {
			case DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__NAME:
				return org.eclipse.sirius.viewpoint.description.DescriptionPackage.IDENTIFIED_ELEMENT__NAME;
			case DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__LABEL:
				return org.eclipse.sirius.viewpoint.description.DescriptionPackage.IDENTIFIED_ELEMENT__LABEL;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(final int baseFeatureID,
			final Class<?> baseClass) {
		if (baseClass == EndUserDocumentedElement.class) {
			switch (baseFeatureID) {
			case org.eclipse.sirius.viewpoint.description.DescriptionPackage.END_USER_DOCUMENTED_ELEMENT__END_USER_DOCUMENTATION:
				return DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__END_USER_DOCUMENTATION;
			default:
				return -1;
			}
		}
		if (baseClass == IdentifiedElement.class) {
			switch (baseFeatureID) {
			case org.eclipse.sirius.viewpoint.description.DescriptionPackage.IDENTIFIED_ELEMENT__NAME:
				return DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__NAME;
			case org.eclipse.sirius.viewpoint.description.DescriptionPackage.IDENTIFIED_ELEMENT__LABEL:
				return DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__LABEL;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (this.eIsProxy()) {
			return super.toString();
		}

		final StringBuffer result = new StringBuffer(super.toString());
		result.append(" (endUserDocumentation: ");
		result.append(this.endUserDocumentation);
		result.append(", name: ");
		result.append(this.name);
		result.append(", label: ");
		result.append(this.label);
		result.append(", titleExpression: ");
		result.append(this.titleExpression);
		result.append(", initialisation: ");
		result.append(this.initialisation);
		result.append(", showOnStartup: ");
		result.append(this.showOnStartup);
		result.append(')');
		return result.toString();
	}

} // DBindingEditorDescriptionImpl
