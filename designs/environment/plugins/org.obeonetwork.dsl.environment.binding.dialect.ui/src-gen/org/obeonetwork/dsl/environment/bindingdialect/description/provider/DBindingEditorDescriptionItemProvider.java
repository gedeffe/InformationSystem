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
package org.obeonetwork.dsl.environment.bindingdialect.description.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.sirius.viewpoint.description.DescriptionPackage;
import org.eclipse.sirius.viewpoint.description.provider.DocumentedElementItemProvider;
import org.obeonetwork.dsl.environment.bindingdialect.description.DBindingEditorDescription;
import org.obeonetwork.dsl.environment.bindingdialect.provider.BindingdialectEditPlugin;

/**
 * This is the item provider adapter for a
 * {@link org.obeonetwork.dsl.environment.bindingdialect.description.DBindingEditorDescription}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class DBindingEditorDescriptionItemProvider extends
		DocumentedElementItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2011 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n    Obeo - initial API and implementation";

	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DBindingEditorDescriptionItemProvider(
			final AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(
			final Object object) {
		if (this.itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			this.addEndUserDocumentationPropertyDescriptor(object);
			this.addNamePropertyDescriptor(object);
			this.addLabelPropertyDescriptor(object);
			this.addTitleExpressionPropertyDescriptor(object);
			this.addInitialisationPropertyDescriptor(object);
			this.addMetamodelPropertyDescriptor(object);
			this.addShowOnStartupPropertyDescriptor(object);
		}
		return this.itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the End User Documentation feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addEndUserDocumentationPropertyDescriptor(final Object object) {
		this.itemPropertyDescriptors
				.add(this.createItemPropertyDescriptor(
						((ComposeableAdapterFactory) this.adapterFactory)
								.getRootAdapterFactory(),
						this.getResourceLocator(),
						this.getString("_UI_EndUserDocumentedElement_endUserDocumentation_feature"),
						this.getString(
								"_UI_PropertyDescriptor_description",
								"_UI_EndUserDocumentedElement_endUserDocumentation_feature",
								"_UI_EndUserDocumentedElement_type"),
						DescriptionPackage.Literals.END_USER_DOCUMENTED_ELEMENT__END_USER_DOCUMENTATION,
						true, true, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Name feature. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addNamePropertyDescriptor(final Object object) {
		this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
				((ComposeableAdapterFactory) this.adapterFactory)
						.getRootAdapterFactory(), this.getResourceLocator(),
				this.getString("_UI_IdentifiedElement_name_feature"), this
						.getString("_UI_PropertyDescriptor_description",
								"_UI_IdentifiedElement_name_feature",
								"_UI_IdentifiedElement_type"),
				DescriptionPackage.Literals.IDENTIFIED_ELEMENT__NAME, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Label feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(final Object object) {
		this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
				((ComposeableAdapterFactory) this.adapterFactory)
						.getRootAdapterFactory(), this.getResourceLocator(),
				this.getString("_UI_IdentifiedElement_label_feature"), this
						.getString("_UI_PropertyDescriptor_description",
								"_UI_IdentifiedElement_label_feature",
								"_UI_IdentifiedElement_type"),
				DescriptionPackage.Literals.IDENTIFIED_ELEMENT__LABEL, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Title Expression feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addTitleExpressionPropertyDescriptor(final Object object) {
		this.itemPropertyDescriptors
				.add(this.createItemPropertyDescriptor(
						((ComposeableAdapterFactory) this.adapterFactory)
								.getRootAdapterFactory(),
						this.getResourceLocator(),
						this.getString("_UI_RepresentationDescription_titleExpression_feature"),
						this.getString(
								"_UI_PropertyDescriptor_description",
								"_UI_RepresentationDescription_titleExpression_feature",
								"_UI_RepresentationDescription_type"),
						DescriptionPackage.Literals.REPRESENTATION_DESCRIPTION__TITLE_EXPRESSION,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Initialisation feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addInitialisationPropertyDescriptor(final Object object) {
		this.itemPropertyDescriptors
				.add(this.createItemPropertyDescriptor(
						((ComposeableAdapterFactory) this.adapterFactory)
								.getRootAdapterFactory(),
						this.getResourceLocator(),
						this.getString("_UI_RepresentationDescription_initialisation_feature"),
						this.getString(
								"_UI_PropertyDescriptor_description",
								"_UI_RepresentationDescription_initialisation_feature",
								"_UI_RepresentationDescription_type"),
						DescriptionPackage.Literals.REPRESENTATION_DESCRIPTION__INITIALISATION,
						true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Metamodel feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addMetamodelPropertyDescriptor(final Object object) {
		this.itemPropertyDescriptors
				.add(this.createItemPropertyDescriptor(
						((ComposeableAdapterFactory) this.adapterFactory)
								.getRootAdapterFactory(),
						this.getResourceLocator(),
						this.getString("_UI_RepresentationDescription_metamodel_feature"),
						this.getString(
								"_UI_PropertyDescriptor_description",
								"_UI_RepresentationDescription_metamodel_feature",
								"_UI_RepresentationDescription_type"),
						DescriptionPackage.Literals.REPRESENTATION_DESCRIPTION__METAMODEL,
						true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Show On Startup feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addShowOnStartupPropertyDescriptor(final Object object) {
		this.itemPropertyDescriptors
				.add(this.createItemPropertyDescriptor(
						((ComposeableAdapterFactory) this.adapterFactory)
								.getRootAdapterFactory(),
						this.getResourceLocator(),
						this.getString("_UI_RepresentationDescription_showOnStartup_feature"),
						this.getString(
								"_UI_PropertyDescriptor_description",
								"_UI_RepresentationDescription_showOnStartup_feature",
								"_UI_RepresentationDescription_type"),
						DescriptionPackage.Literals.REPRESENTATION_DESCRIPTION__SHOW_ON_STARTUP,
						true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns DBindingEditorDescription.gif. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(final Object object) {
		return this.overlayImage(
				object,
				this.getResourceLocator().getImage(
						"full/obj16/DBindingEditorDescription"));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(final Object object) {
		final String label = ((DBindingEditorDescription) object).getName();
		return (label == null) || (label.length() == 0) ? this
				.getString("_UI_DBindingEditorDescription_type") : this
				.getString("_UI_DBindingEditorDescription_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to
	 * update any cached children and by creating a viewer notification, which
	 * it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(final Notification notification) {
		this.updateChildren(notification);

		switch (notification.getFeatureID(DBindingEditorDescription.class)) {
		case org.obeonetwork.dsl.environment.bindingdialect.description.DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__END_USER_DOCUMENTATION:
		case org.obeonetwork.dsl.environment.bindingdialect.description.DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__NAME:
		case org.obeonetwork.dsl.environment.bindingdialect.description.DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__LABEL:
		case org.obeonetwork.dsl.environment.bindingdialect.description.DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__TITLE_EXPRESSION:
		case org.obeonetwork.dsl.environment.bindingdialect.description.DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__INITIALISATION:
		case org.obeonetwork.dsl.environment.bindingdialect.description.DescriptionPackage.DBINDING_EDITOR_DESCRIPTION__SHOW_ON_STARTUP:
			this.fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			final Collection<Object> newChildDescriptors, final Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BindingdialectEditPlugin.INSTANCE;
	}

}
