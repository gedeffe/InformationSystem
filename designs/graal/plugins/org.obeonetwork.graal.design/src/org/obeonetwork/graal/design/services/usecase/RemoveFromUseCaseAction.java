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
package org.obeonetwork.graal.design.services.usecase;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.AbstractDNode;
import org.obeonetwork.graal.AbstractTask;
import org.obeonetwork.graal.Task;
import org.obeonetwork.graal.TasksGroup;
import org.obeonetwork.graal.UseCase;

/**
 * Class used to remove a task or a group from a Use case
 * 
 * @author Stephane Thibaudeau <stephane.thibaudeau@obeo.fr>
 * 
 */
public class RemoveFromUseCaseAction {

	/**
	 * Checks if the action can be done
	 * 
	 * @param context
	 *            EObject needed so the method can be called by Acceleo
	 * @param selections
	 *            Graphical elements selected by the user before invoking the
	 *            action
	 * @return True if at least one Task or TasksGroup instance has been
	 *         selected
	 */
	public boolean canExecuteRemoveFromUseCaseAction(final EObject context,
			final Collection<? extends EObject> selections) {
		// The action can be executed only if at least one Task or TasksGroup
		// has been selected
		for (final EObject selection : selections) {
			if (selection instanceof AbstractDNode) {
				final EObject target = ((AbstractDNode) selection).getTarget();
				if (target instanceof AbstractTask) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * creates a new use case from selected Task and TasksGroup instances
	 * 
	 * @param context
	 *            EObject needed so the method can be called by Acceleo
	 * @param selections
	 *            Graphical elements selected by the user before invoking the
	 *            action
	 * @return unmodified "context" parameter
	 */
	public EObject executeRemoveFromUseCaseAction(final EObject context,
			final Collection<? extends EObject> selections) {
		if (context instanceof UseCase) {
			final UseCase useCase = (UseCase) context;
			for (final EObject selection : selections) {
				if (selection instanceof AbstractDNode) {
					final EObject target = ((AbstractDNode) selection)
							.getTarget();
					if (target instanceof Task) {
						this.removeFromUseCase(useCase, (Task) target);
					} else if (target instanceof TasksGroup) {
						this.removeFromUseCase(useCase, (TasksGroup) target);
					}
				}
			}
		}
		return context;
	}

	/**
	 * Removes a task from a use case
	 * 
	 * @param useCase
	 * @param task
	 */
	private void removeFromUseCase(final UseCase useCase, final Task task) {
		useCase.getTasks().remove(task);
	}

	/**
	 * Removes a whole group from a use case
	 * 
	 * @param useCase
	 * @param group
	 */
	private void removeFromUseCase(final UseCase useCase, final TasksGroup group) {
		for (final Task task : group.getOwnedTasks()) {
			this.removeFromUseCase(useCase, task);
		}
		for (final TasksGroup subGroup : group.getOwnedGroups()) {
			this.removeFromUseCase(useCase, subGroup);
		}
		useCase.getTasks().remove(group);
	}
}
