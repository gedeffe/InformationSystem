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
package org.obeonetwork.graal.design.services.actor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.obeonetwork.graal.AbstractTask;
import org.obeonetwork.graal.Actor;
import org.obeonetwork.graal.System;
import org.obeonetwork.graal.Task;
import org.obeonetwork.graal.TasksGroup;
import org.obeonetwork.graal.UseCase;

/**
 * Utilities services concerning Actors
 * @author Stephane Thibaudeau <stephane.thibaudeau@obeo.fr>
 *
 */
public class ActorUtils {
	/**
	 * Get the list of actors that should be visually connected to a task
	 * The list depends on inherited actors and already visible tasks on diagram 
	 * @param abstractTask The AbstractTask for which we want the actors list
	 * @param tasksOnDiagram List of visible tasks on diagram
	 * @return List of Actors
	 */
	public Collection<Actor> getVisibleLinksToActors(AbstractTask abstractTask, List<Task> tasksOnDiagram) {
		return getVisibleLinksToActors(abstractTask, tasksOnDiagram, new HashMap<Task, Collection<Actor>>());
	}
	
	public Collection<Actor> getVisibleLinksToActors(AbstractTask abstractTask, List<Task> tasksOnDiagram, Map<Task, Collection<Actor>> cache) {
		if (abstractTask instanceof Task) {
			return getVisibleLinksToActorsFromTask((Task)abstractTask, tasksOnDiagram, cache);
		} else if (abstractTask instanceof TasksGroup) {
			return getVisibleLinksToActorsFromTasksGroup((TasksGroup)abstractTask, tasksOnDiagram, cache);
		};
		return null;
	}
	
	/**
	 * Get the list of actors that should be visually connected to a task
	 * The list depends on inherited actors and already visible tasks on diagram 
	 * @param task The task for which we want the actors list
	 * @param tasksOnDiagram List of visible tasks on diagram
	 * @return List of Actors
	 */
	private Collection<Actor> getVisibleLinksToActorsFromTask(Task task, List<Task> tasksOnDiagram, Map<Task, Collection<Actor>> cache) {
		List<Actor> actors = new ArrayList<Actor>();
		
		if (cache.containsKey(task)) {
			return cache.get(task);
		}
		
		// if at least one actor is specified directly on the task
		// this definition replaces the possibly inherited actors
		// If no actor is directly specified on the task, we look for
		// actors specified on parents of this task unless the parent
		// is visible on the same diagram
		cache.put(task, actors);
		if (task.getActors().isEmpty() == false) {
			actors = task.getActors();
		} else {
			for (Task usingTask : task.getUsedBy()) {
				if (!cache.containsKey(usingTask)) {
					// if the task is visible on the same diagram we don't take its actors into account
					if (!tasksOnDiagram.contains(usingTask)) {
						actors.addAll(getVisibleLinksToActors(usingTask, tasksOnDiagram, cache));
					}
				}
			}
		}
		cache.put(task, actors);
		return actors;
	}
	
	/**
	 * Get the list of actors that should be visually connected to a TasksGroup
	 * The list depends on inherited actors and already visible tasks on diagram 
	 * @param tasksGroup The TasksGroup for which we want the actors list
	 * @param tasksOnDiagram List of visible tasks on diagram
	 * @return List of Actors
	 */
	private Collection<Actor> getVisibleLinksToActorsFromTasksGroup(TasksGroup tasksGroup, List<Task> tasksOnDiagram, Map<Task, Collection<Actor>> cache) {
		List<Actor> actors = new ArrayList<Actor>();
		for (AbstractTask abstractTask : tasksGroup.getOwnedTasks()) {
			actors.addAll(getVisibleLinksToActors(abstractTask, tasksOnDiagram, cache));
		}
		return actors;
	}
	
	/**
	 * Returns the visible actors for a tasks group
	 * @param group
	 * @return
	 */
	public Set<Actor> getVisibleActors(TasksGroup group) {
		HashMap<Task, Set<Actor>> cache = new HashMap<Task, Set<Actor>>();
		Set<Actor> actors = new LinkedHashSet<Actor>();
		List<Actor> actorsLeft = getAllActorsInContext(group);
		for (AbstractTask abstractTask : group.getTasks()) {
			actors.addAll(internalGetVisibleActors(abstractTask, cache, actorsLeft));
		}
		return actors;
	}
	
	/**
	 * Returns the visible actors for a use case
	 * @param useCase
	 * @return
	 */
	public Set<Actor> getVisibleActors(UseCase	useCase) {
		HashMap<Task, Set<Actor>> cache = new HashMap<Task, Set<Actor>>();
		Set<Actor> actors = new LinkedHashSet<Actor>();
		List<Actor> actorsLeft = getAllActorsInContext(useCase);
		for (AbstractTask abstractTask : useCase.getTasks()) {
			actors.addAll(internalGetVisibleActors(abstractTask, cache, actorsLeft));
		}
		return actors;
	}
	
	/**
	 * Returns the visible actors for a system
	 * @param system
	 * @return
	 */
	public Set<Actor> getVisibleActors(System system) {
		HashMap<Task, Set<Actor>> cache = new HashMap<Task, Set<Actor>>();
		Set<Actor> actors = new LinkedHashSet<Actor>();
		List<Actor> actorsLeft = getAllActorsInContext(system);
		for (AbstractTask abstractTask : system.getTasks()) {
			actors.addAll(internalGetVisibleActors(abstractTask, cache, actorsLeft));
		}
		return actors;
	}

	/**
	 * Collect the visible actors for a task, using an internal cache
	 * @param abstractTask
	 * @param cache Map to store already calculated links between Tasks and Actors
	 * @param actorsLeft List of actors not yet in the final list (used to improve performance)
	 * @return
	 */
	private Set<Actor> internalGetVisibleActors(AbstractTask abstractTask, Map<Task, Set<Actor>> cache, List<Actor> actorsLeft) {
		if (!actorsLeft.isEmpty()) {
			if (abstractTask instanceof Task) {
				Task task = (Task)abstractTask;
				
				if (cache.containsKey(task)) {
					return cache.get(task);
				} else {
					Set<Actor> actors = new LinkedHashSet<Actor>();
					cache.put(task, actors);
					if (task.getActors().isEmpty()) {
						for (Task usingTask : task.getUsedBy()) {
							if (!cache.containsKey(usingTask) && !actorsLeft.isEmpty()) {
								actors.addAll(internalGetVisibleActors(usingTask, cache, actorsLeft));
							}
						}
					} else {
						actors.addAll(task.getActors());
						actorsLeft.removeAll(actors);
					}
					cache.put(task, actors);
					return actors;
				}
			} else if (abstractTask instanceof TasksGroup) {
				Set<Actor> actors = new LinkedHashSet<Actor>();
				TasksGroup group = (TasksGroup)abstractTask;
				for (AbstractTask subTask : group.getTasks()) {
					if (!actorsLeft.isEmpty()) {
						actors.addAll(internalGetVisibleActors(subTask, cache, actorsLeft));
					}
				}
				return actors;
			}
		}
		return new LinkedHashSet<Actor>();
	}
	
	private List<Actor> getAllActorsInContext(EObject object) {
		System system = getParentSystem(object);
		if (system != null) {
			return new ArrayList<Actor>(system.getActors());
		}
		return null;
	}
	
	private System getParentSystem(EObject object) {
		if (object instanceof System) {
			return (System)object;
		} else if (object.eContainer() != null) {
			return getParentSystem(object.eContainer());
		}
		return null;
	}
}
