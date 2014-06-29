/*******************************************************************************
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.dsl.environment.binding.dialect.properties;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.sirius.editor.editorPlugin.SiriusEditor;
import org.eclipse.sirius.editor.properties.sections.common.AbstractComboPropertySection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.obeonetwork.dsl.environment.bindingdialect.description.DescriptionPackage;

/**
 * @author sthibaudeau
 * 
 */
public class DBindingEditorCreationDescriptionDescriptionPropertySection extends
		AbstractComboPropertySection {
	/**
	 * @see fr.obeo.dsl.viewpoint.tree.editor.properties.sections.AbstractComboPropertySection#getDefaultLabelText()
	 */
	@Override
	protected String getDefaultLabelText() {
		return "DBindingEditorDescription"; //$NON-NLS-1$
	}

	/**
	 * @see fr.obeo.dsl.viewpoint.tree.editor.properties.sections.AbstractComboPropertySection#getLabelText()
	 */
	@Override
	protected String getLabelText() {
		String labelText;
		labelText = super.getLabelText() + "*:"; //$NON-NLS-1$
		return labelText;
	}

	/**
	 * @see fr.obeo.dsl.viewpoint.tree.editor.properties.sections.AbstractComboPropertySection#getFeature()
	 */
	@Override
	protected EReference getFeature() {
		return DescriptionPackage.eINSTANCE
				.getDBindingEditorCreationDescription_Description();
	}

	/**
	 * @see fr.obeo.dsl.viewpoint.tree.editor.properties.sections.AbstractComboPropertySection#getFeatureValue(int)
	 */
	@Override
	protected Object getFeatureValue(final int index) {
		return this.getFeatureValueAt(index);
	}

	/**
	 * @see fr.obeo.dsl.viewpoint.tree.editor.properties.sections.AbstractComboPropertySection#isEqual(int)
	 */
	@Override
	protected boolean isEqual(final int index) {
		boolean isEqual = false;
		if (this.getFeatureValueAt(index) == null) {
			isEqual = this.eObject.eGet(this.getFeature()) == null;
		} else {
			isEqual = this.getFeatureValueAt(index).equals(
					this.eObject.eGet(this.getFeature()));
		}
		return isEqual;
	}

	/**
	 * Returns the value at the specified index in the choice of values for the
	 * feature.
	 * 
	 * @param index
	 *            Index of the value.
	 * @return the value at the specified index in the choice of values.
	 */
	protected Object getFeatureValueAt(final int index) {
		final List values = this.getChoiceOfValues();
		if ((values.size() < index) || (values.size() == 0) || (index == -1)) {
			return null;
		}
		return values.get(index);
	}

	/**
	 * Fetches the list of available values for the feature.
	 * 
	 * @return The list of available values for the feature.
	 */
	@Override
	protected List getChoiceOfValues() {
		List values = Collections.emptyList();
		final List<IItemPropertyDescriptor> propertyDescriptors = this
				.getDescriptors();
		for (final Iterator iterator = propertyDescriptors.iterator(); iterator
				.hasNext();) {
			final IItemPropertyDescriptor propertyDescriptor = (IItemPropertyDescriptor) iterator
					.next();
			if (((EStructuralFeature) propertyDescriptor
					.getFeature(this.eObject)) == this.getFeature()) {
				values = new ArrayList(
						propertyDescriptor.getChoiceOfValues(this.eObject));
			}
		}
		return values;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void createControls(final Composite parent,
			final TabbedPropertySheetPage tabbedPropertySheetPage) {
		super.createControls(parent, tabbedPropertySheetPage);
		this.nameLabel.setFont(SiriusEditor.getFontRegistry().get("required"));
	}
}
