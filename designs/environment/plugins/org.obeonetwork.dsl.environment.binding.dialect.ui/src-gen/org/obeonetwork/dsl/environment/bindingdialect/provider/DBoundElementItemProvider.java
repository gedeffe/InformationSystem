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
package org.obeonetwork.dsl.environment.bindingdialect.provider;

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
import org.eclipse.sirius.viewpoint.provider.DRepresentationElementItemProvider;
import org.obeonetwork.dsl.environment.bindingdialect.BindingdialectPackage;
import org.obeonetwork.dsl.environment.bindingdialect.DBoundElement;

/**
 * This is the item provider adapter for a
 * {@link org.obeonetwork.dsl.environment.bindingdialect.DBoundElement} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class DBoundElementItemProvider extends
		DRepresentationElementItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
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
	public DBoundElementItemProvider(final AdapterFactory adapterFactory) {
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
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			this.addParentPropertyDescriptor(object);
			this.addChildrenPropertyDescriptor(object);
			this.addEdgesAsLeftPropertyDescriptor(object);
			this.addEdgesAsRightPropertyDescriptor(object);
			this.addEdgesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Parent feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addParentPropertyDescriptor(final Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				this.getResourceLocator(),
				getString("_UI_DBoundElement_parent_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DBoundElement_parent_feature",
						"_UI_DBoundElement_type"),
				BindingdialectPackage.Literals.DBOUND_ELEMENT__PARENT, true,
				false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Children feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addChildrenPropertyDescriptor(final Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				this.getResourceLocator(),
				getString("_UI_DBoundElement_children_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DBoundElement_children_feature",
						"_UI_DBoundElement_type"),
				BindingdialectPackage.Literals.DBOUND_ELEMENT__CHILDREN, true,
				false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Edges As Left feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addEdgesAsLeftPropertyDescriptor(final Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				this.getResourceLocator(),
				getString("_UI_DBoundElement_edgesAsLeft_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DBoundElement_edgesAsLeft_feature",
						"_UI_DBoundElement_type"),
				BindingdialectPackage.Literals.DBOUND_ELEMENT__EDGES_AS_LEFT,
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Edges As Right feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addEdgesAsRightPropertyDescriptor(final Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				this.getResourceLocator(),
				getString("_UI_DBoundElement_edgesAsRight_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DBoundElement_edgesAsRight_feature",
						"_UI_DBoundElement_type"),
				BindingdialectPackage.Literals.DBOUND_ELEMENT__EDGES_AS_RIGHT,
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Edges feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addEdgesPropertyDescriptor(final Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				this.getResourceLocator(),
				getString("_UI_DBoundElement_edges_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DBoundElement_edges_feature",
						"_UI_DBoundElement_type"),
				BindingdialectPackage.Literals.DBOUND_ELEMENT__EDGES, false,
				false, false, null, null, null));
	}

	/**
	 * This returns DBoundElement.gif. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(final Object object) {
		return overlayImage(object,
				this.getResourceLocator().getImage("full/obj16/DBoundElement"));
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
		final String label = ((DBoundElement) object).getName();
		return (label == null) || (label.length() == 0) ? getString("_UI_DBoundElement_type")
				: getString("_UI_DBoundElement_type") + " " + label;
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
		updateChildren(notification);
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
