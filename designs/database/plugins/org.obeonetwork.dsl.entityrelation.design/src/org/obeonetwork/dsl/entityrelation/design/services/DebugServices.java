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
package org.obeonetwork.dsl.entityrelation.design.services;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreter;
import org.eclipse.sirius.tools.api.interpreter.InterpreterUtil;

/**
 * Class used to debug
 * 
 * @author Stephane Thibaudeau <stephane.thibaudeau@obeo.fr>
 * 
 */
public class DebugServices {

	/**
	 * Outputs information on the parameter and acceleo variables available
	 * 
	 * @param context
	 *            Object we wish to debug
	 * @return The unmodified parameter
	 */
	public Object traceWithVariables(final Object context) {
		System.out.println("$self : " + context);
		final EObject interpreterContext = this.getAnEObjectFrom(context);
		if (interpreterContext != null) {
			final IInterpreter interpreter = InterpreterUtil
					.getInterpreter(interpreterContext);
			for (final String variableName : interpreter.getVariables()
					.keySet()) {
				System.out.println("$" + variableName + " : "
						+ interpreter.getVariables().get(variableName));
			}
		}
		System.out.println("--------------------");
		return context;
	}

	/**
	 * Extracts an EObject from an Object instance
	 * 
	 * @param context
	 *            Object instance
	 * @return an EObject if one has been found
	 */
	private EObject getAnEObjectFrom(final Object context) {
		final EObject result = null;
		if (context instanceof EObject) {
			return (EObject) context;
		} else if ((context instanceof Collection)
				&& (((Collection<?>) context).size() > 0)) {
			// We search into the list elements
			for (final Object elem : (Collection<?>) context) {
				if (elem instanceof EObject) {
					return (EObject) elem;
				}
			}
			// If we have found nothing, we search if some elements of the
			// list are a list themselves
			for (final Object elem : (Collection<?>) context) {
				if (elem instanceof Collection) {
					final EObject tempResult = this.getAnEObjectFrom(elem);
					if (tempResult != null) {
						return tempResult;
					}
				}
			}
		}
		return result;
	}
}
