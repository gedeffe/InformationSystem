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
package org.obeonetwork.dsl.database.design.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;

public class EcoreServices {

	public Collection<EObject> allRoots(final EObject any) {
		final Collection<EObject> roots = new ArrayList<EObject>();

		final Session session = SessionManager.INSTANCE.getSession(any);

		if (session != null) {
			for (final Resource childRes : session.getSemanticResources()) {
				roots.addAll(childRes.getContents());
			}
		}

		return roots;
	}

	static public Collection<Resource> getAllSemanticResourcesInSession(
			final EObject any) {
		final Session session = SessionManager.INSTANCE.getSession(any);
		if (session != null) {
			return session.getSemanticResources();
		}
		return Collections.emptyList();
	}
}