/**
 * Copyright (c) 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.obeonetwork.dsl.cinematic.design.services;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.obeonetwork.dsl.cinematic.NamedElement;

public class CinematicEcoreServices {

	public static Collection<EObject> getAllRootsForCinematic(final EObject any) {
		final Collection<EObject> roots = new ArrayList<EObject>();

		final Session session = SessionManager.INSTANCE.getSession(any);

		if (session != null) {
			for (final Resource childRes : session.getSemanticResources()) {
				roots.addAll(childRes.getContents());
			}
		}

		return roots;
	}

	@SuppressWarnings("unchecked")
	public static EObject duplicateCinematicElement(final EObject context) {
		final EObject clone = EcoreUtil.copy(context);
		if (clone instanceof NamedElement) {
			final NamedElement namedElement = (NamedElement) clone;
			namedElement.setName(namedElement.getName() + " copy");
		}
		final EStructuralFeature containmentFeature = context
				.eContainingFeature();
		final Object feature = context.eContainer().eGet(containmentFeature,
				true);
		if (feature instanceof Collection) {
			((Collection<EObject>) feature).add(clone);
		}

		return clone;
	}
}
