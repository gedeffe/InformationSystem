/*******************************************************************************
 * Copyright (c) 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.dsl.is.design.ui.commands;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ui.business.api.session.SessionEditorInput;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.obeonetwork.dsl.environment.ObeoDSMObject;

public class ContainsISModelPropertyTester extends PropertyTester {

	public boolean test(final Object receiver, final String property,
			final Object[] args, final Object expectedValue) {
		if (receiver instanceof IEditorPart) {
			final IEditorInput editorInput = ((IEditorPart) receiver)
					.getEditorInput();
			if (editorInput instanceof SessionEditorInput) {
				final SessionEditorInput sessionEditorInput = (SessionEditorInput) editorInput;
				final Session session = sessionEditorInput.getSession();
				if (session != null) {
					final TransactionalEditingDomain ted = session
							.getTransactionalEditingDomain();
					if (ted != null) {
						return this.containsIsModel(ted.getResourceSet());
					}
				}
			}
		}
		return false;
	}

	/**
	 * Tests if the resource set contains at least one Requirements model
	 * 
	 * @param set
	 *            ResourceSet to be tested
	 * @return boolean
	 */
	private boolean containsIsModel(final ResourceSet set) {
		if (set != null) {
			for (final Resource resource : set.getResources()) {
				for (final EObject eObject : resource.getContents()) {
					if (eObject instanceof ObeoDSMObject) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
