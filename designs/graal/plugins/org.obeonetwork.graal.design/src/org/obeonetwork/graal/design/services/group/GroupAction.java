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
package org.obeonetwork.graal.design.services.group;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.sirius.diagram.AbstractDNode;
import org.eclipse.ui.PlatformUI;
import org.obeonetwork.graal.AbstractTask;
import org.obeonetwork.graal.GraalFactory;
import org.obeonetwork.graal.System;
import org.obeonetwork.graal.TasksContainer;
import org.obeonetwork.graal.TasksGroup;
import org.obeonetwork.graal.design.services.task.TaskUtils;

/**
 * Class used to group tasks into a new group
 * 
 * @author Stephane Thibaudeau <stephane.thibaudeau@obeo.fr>
 * 
 */
public class GroupAction {

	/**
	 * Checks if the grouping action can be done
	 * 
	 * @param context
	 *            Object needed so the method can be called by Acceleo
	 * @param selections
	 *            Graphical elements selected by the user before launching the
	 *            action
	 * @return true if at least two tasks have been selected
	 */
	public boolean canExecuteGroupAction(final EObject context,
			final Collection<? extends EObject> selections) {
		// The action can be executed even if no element has been selected
		return true;
	}

	/**
	 * Executes the grouping action
	 * 
	 * @param context
	 *            Object needed so the method can be called by Acceleo. It is
	 *            returned unchanged
	 * @param selections
	 *            Graphical elements selected by the user before launching the
	 *            action
	 * @return The first parameter without any change
	 */
	public EObject executeGroupAction(final EObject context,
			final Collection<? extends EObject> selections) {

		// Filter the selections to retrieve only the Tasks
		final List<AbstractTask> tasks = this.extractTasks(selections);
		final String suggestedName = TaskUtils.instance
				.computeNameFromTasks(tasks);

		final InputDialog enterNameDialog = new InputDialog(PlatformUI
				.getWorkbench().getActiveWorkbenchWindow().getShell(),
				"Creating a group", "Enter a name for the group",
				suggestedName, null);
		enterNameDialog.open();
		final int returnCode = enterNameDialog.getReturnCode();

		if (returnCode == InputDialog.OK) {

			TasksContainer container = null;
			if (tasks.size() > 0) {

				// Store the current container
				container = (TasksContainer) tasks.get(0).eContainer();

				// Create a new group to contain the selected tasks
				final TasksGroup group = GraalFactory.eINSTANCE
						.createTasksGroup();
				final Date createdOn = new Date();
				group.setCreatedOn(createdOn);
				group.setModifiedOn(createdOn);

				// Attach the selected tasks to the new group
				group.getTasks().addAll(tasks);
				group.setName(enterNameDialog.getValue());

				// Get an available ID for the TasksGroup
				final System system = TaskUtils.instance
						.getClosestSystem(container);
				final String id = TaskUtils.instance
						.getNextAvailableTasksGroupId(system);
				group.setId(id);

				// Attach the new group to the container
				container.getTasks().add(group);
			}
		}

		return context;
	}

	/**
	 * Extracts the AbstractTask instances from a list of selected graphical
	 * elements
	 * 
	 * @param selections
	 *            Graphical elements selected by the user before launching the
	 *            action
	 * @return List of AbstractTask instances pointed by the graphical elements
	 */
	private List<AbstractTask> extractTasks(
			final Collection<? extends EObject> selections) {
		final List<AbstractTask> tasks = new ArrayList<AbstractTask>();
		for (final EObject selection : selections) {
			if (selection instanceof AbstractDNode) {
				final EObject target = ((AbstractDNode) selection).getTarget();
				if (target instanceof AbstractTask) {
					tasks.add((AbstractTask) target);
				}
			}
		}
		return tasks;
	}
}
