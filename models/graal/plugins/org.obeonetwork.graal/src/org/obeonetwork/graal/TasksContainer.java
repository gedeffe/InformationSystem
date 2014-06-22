/**
 * Copyright (c) 2010-2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.obeonetwork.graal;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tasks Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.graal.TasksContainer#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.obeonetwork.graal.TasksContainer#getOwnedTasks <em>Owned Tasks</em>}</li>
 *   <li>{@link org.obeonetwork.graal.TasksContainer#getOwnedGroups <em>Owned Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.graal.GraalPackage#getTasksContainer()
 * @model abstract="true"
 * @generated
 */
public interface TasksContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.graal.AbstractTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see org.obeonetwork.graal.GraalPackage#getTasksContainer_Tasks()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<AbstractTask> getTasks();

	/**
	 * Returns the value of the '<em><b>Owned Tasks</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.graal.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Tasks</em>' reference list.
	 * @see org.obeonetwork.graal.GraalPackage#getTasksContainer_OwnedTasks()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Task> getOwnedTasks();

	/**
	 * Returns the value of the '<em><b>Owned Groups</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.graal.TasksGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Groups</em>' reference list.
	 * @see org.obeonetwork.graal.GraalPackage#getTasksContainer_OwnedGroups()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<TasksGroup> getOwnedGroups();

} // TasksContainer
