/*******************************************************************************
 * Copyright (c) 2009-2010 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.dsl.is.design.ui.providers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.core.service.IProviderChangeListener;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.CreateEditPoliciesOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.IEditPolicyProvider;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.sirius.diagram.DDiagramElement;

/**
 * 
 * @author <a href="mailto:jerome.benois@obeo.fr">Jerome Benois</a>
 */
public class EditPolicyProvider implements IEditPolicyProvider {

	public void createEditPolicies(final EditPart editPart) {
		// EEF SWT Dialog doesn't fully compliant with OD 4.5.1
		// TODO check EEF SWT Dialog support with the next Obeo Designer release
		// editPart.installEditPolicy(EditPolicyRoles.OPEN_ROLE, new
		// OpenEditPolicy());
	}

	public boolean provides(final IOperation operation) {
		if (operation instanceof CreateEditPoliciesOperation) {
			final EditPart editPart = ((CreateEditPoliciesOperation) operation)
					.getEditPart();
			final Object model = editPart.getModel();
			if (model instanceof Node) {
				final Node node = (Node) model;
				// check DNode, DNodeContainer
				if (node.getElement() instanceof DDiagramElement) {
					final DDiagramElement dElement = (DDiagramElement) node
							.getElement();
					final EObject target = dElement.getTarget();
					// System.out.println("DDiagramElement Target : "+target);
					// if(target instanceof NamedElement){
					if (target instanceof EObject) {
						return true;
					}
				}
			}
			;
		}
		return false;
	}

	public void removeProviderChangeListener(final IProviderChangeListener arg0) {
	}

	public void addProviderChangeListener(final IProviderChangeListener arg0) {
	}
}
