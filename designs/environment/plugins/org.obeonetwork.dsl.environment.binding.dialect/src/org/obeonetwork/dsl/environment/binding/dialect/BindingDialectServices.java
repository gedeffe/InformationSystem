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
package org.obeonetwork.dsl.environment.binding.dialect;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sirius.business.api.dialect.AbstractRepresentationDialectServices;
import org.eclipse.sirius.business.api.dialect.description.IInterpretedExpressionQuery;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.RepresentationExtensionDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.obeonetwork.dsl.environment.bindingdialect.BindingdialectFactory;
import org.obeonetwork.dsl.environment.bindingdialect.DBindingEditor;
import org.obeonetwork.dsl.environment.bindingdialect.description.DBindingEditorDescription;

/**
 * Class to provide Binding dialect services
 * 
 * @author Stephane Thibaudeau <stephane.thibaudeau@obeo.fr>
 * 
 */
public class BindingDialectServices extends
		AbstractRepresentationDialectServices {

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.viewpoint.business.api.dialect.AbstractRepresentationDialectServices#isSupported(fr.obeo.dsl.viewpoint.DRepresentation)
	 */
	@Override
	protected boolean isSupported(final DRepresentation representation) {
		return representation instanceof DBindingEditor;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.viewpoint.business.api.dialect.AbstractRepresentationDialectServices#isSupported(fr.obeo.dsl.viewpoint.description.RepresentationDescription)
	 */
	@Override
	protected boolean isSupported(
			final RepresentationDescription representationDesc) {
		return representationDesc instanceof DBindingEditorDescription;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.viewpoint.business.api.dialect.DialectServices#getDescription(fr.obeo.dsl.viewpoint.DRepresentation)
	 */
	@Override
	public RepresentationDescription getDescription(
			final DRepresentation representation) {
		if (this.isSupported(representation)) {
			return ((DBindingEditor) representation).getDescription();
		} else {
			return null;
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.viewpoint.business.api.dialect.DialectServices#canCreate(org.eclipse.emf.ecore.EObject,
	 *      fr.obeo.dsl.viewpoint.description.RepresentationDescription)
	 */
	@Override
	public boolean canCreate(final EObject semantic,
			final RepresentationDescription representationDesc) {
		boolean result = false;
		if ((semantic != null) && this.isSupported(representationDesc)) {
			// TODO Check the domain class when it will be possible to specify
			// it as a parameter in odesign
			// TODO Check preconditions too and so on
			result = "BindingInfo".equals(semantic.eClass().getName());
		}
		return result;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.viewpoint.business.api.dialect.DialectServices#createRepresentation(java.lang.String,
	 *      org.eclipse.emf.ecore.EObject,
	 *      fr.obeo.dsl.viewpoint.description.RepresentationDescription,
	 *      org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public DRepresentation createRepresentation(final String name,
			final EObject semantic,
			final RepresentationDescription description,
			final IProgressMonitor monitor) {
		// ensureDescriptionResourceInMainResourceSet(description);

		final DBindingEditor editor = BindingdialectFactory.eINSTANCE
				.createDBindingEditor();
		editor.setName(name);
		editor.setDescription((DBindingEditorDescription) description);
		editor.setTarget(semantic);

		this.refresh(editor, monitor);

		return editor;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.viewpoint.business.api.dialect.DialectServices#refresh(fr.obeo.dsl.viewpoint.DRepresentation,
	 *      org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void refresh(final DRepresentation representation,
			final IProgressMonitor monitor) {
		if (this.canRefresh(representation)) {
			this.refreshEditor((DBindingEditor) representation, monitor);
		}
	}

	/**
	 * Refreshes an editor
	 * 
	 * @param editor
	 *            Editor to refresh
	 * @param monitor
	 *            Progress monitor
	 */
	private void refreshEditor(final DBindingEditor editor,
			final IProgressMonitor monitor) {
		// TODO implement refresh
	}

	@Override
	public void initRepresentations(final Viewpoint viewpoint,
			final EObject semantic, final IProgressMonitor monitor) {
	}

	@Override
	protected <T extends RepresentationDescription> void initRepresentationForElement(
			final T representationDescription, final EObject semanticElement,
			final IProgressMonitor monitor) {

	}

	@Override
	public IInterpretedExpressionQuery createInterpretedExpressionQuery(
			final EObject arg0, final EStructuralFeature arg1) {
		return null;
	}

	@Override
	public boolean handles(final RepresentationDescription description) {
		return this.isSupported(description);
	}

	@Override
	public boolean handles(
			final RepresentationExtensionDescription representationExtensionDescription) {
		// TODO Auto-generated method stub
		return false;
	}

}
