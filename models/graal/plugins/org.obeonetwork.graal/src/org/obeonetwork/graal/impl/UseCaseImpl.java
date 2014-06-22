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
package org.obeonetwork.graal.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.obeonetwork.dsl.entity.Block;
import org.obeonetwork.dsl.entity.Entity;
import org.obeonetwork.dsl.soa.Category;
import org.obeonetwork.dsl.soa.ServiceDTO;
import org.obeonetwork.graal.AbstractTask;
import org.obeonetwork.graal.Actor;
import org.obeonetwork.graal.DomainModelRegistry;
import org.obeonetwork.graal.GraalPackage;
import org.obeonetwork.graal.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.graal.impl.UseCaseImpl#getDtoCategories <em>Dto Categories</em>}</li>
 *   <li>{@link org.obeonetwork.graal.impl.UseCaseImpl#getDtos <em>Dtos</em>}</li>
 *   <li>{@link org.obeonetwork.graal.impl.UseCaseImpl#getEntityBlocks <em>Entity Blocks</em>}</li>
 *   <li>{@link org.obeonetwork.graal.impl.UseCaseImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link org.obeonetwork.graal.impl.UseCaseImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link org.obeonetwork.graal.impl.UseCaseImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.obeonetwork.graal.impl.UseCaseImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.obeonetwork.graal.impl.UseCaseImpl#getExtends <em>Extends</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UseCaseImpl extends NamedElementImpl implements UseCase {
	/**
	 * The cached value of the '{@link #getDtoCategories() <em>Dto Categories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtoCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> dtoCategories;
	/**
	 * The cached value of the '{@link #getDtos() <em>Dtos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtos()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceDTO> dtos;
	/**
	 * The cached value of the '{@link #getEntityBlocks() <em>Entity Blocks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Block> entityBlocks;
	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;
	/**
	 * The cached value of the '{@link #getActors() <em>Actors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actors;
	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractTask> tasks;
	/**
	 * The cached value of the '{@link #getIncludes() <em>Includes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludes()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCase> includes;
	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCase> extends_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraalPackage.Literals.USE_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Category> getDtoCategories() {
		if (dtoCategories == null) {
			dtoCategories = new EObjectResolvingEList<Category>(Category.class, this, GraalPackage.USE_CASE__DTO_CATEGORIES);
		}
		return dtoCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ServiceDTO> getDtos() {
		if (dtos == null) {
			dtos = new EObjectResolvingEList<ServiceDTO>(ServiceDTO.class, this, GraalPackage.USE_CASE__DTOS);
		}
		return dtos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Block> getEntityBlocks() {
		if (entityBlocks == null) {
			entityBlocks = new EObjectResolvingEList<Block>(Block.class, this, GraalPackage.USE_CASE__ENTITY_BLOCKS);
		}
		return entityBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectResolvingEList<Entity>(Entity.class, this, GraalPackage.USE_CASE__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Actor> getActors() {
		if (actors == null) {
			actors = new EObjectResolvingEList<Actor>(Actor.class, this, GraalPackage.USE_CASE__ACTORS);
		}
		return actors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AbstractTask> getTasks() {
		if (tasks == null) {
			tasks = new EObjectResolvingEList<AbstractTask>(AbstractTask.class, this, GraalPackage.USE_CASE__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UseCase> getIncludes() {
		if (includes == null) {
			includes = new EObjectResolvingEList<UseCase>(UseCase.class, this, GraalPackage.USE_CASE__INCLUDES);
		}
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UseCase> getExtends() {
		if (extends_ == null) {
			extends_ = new EObjectResolvingEList<UseCase>(UseCase.class, this, GraalPackage.USE_CASE__EXTENDS);
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraalPackage.USE_CASE__DTO_CATEGORIES:
				return getDtoCategories();
			case GraalPackage.USE_CASE__DTOS:
				return getDtos();
			case GraalPackage.USE_CASE__ENTITY_BLOCKS:
				return getEntityBlocks();
			case GraalPackage.USE_CASE__ENTITIES:
				return getEntities();
			case GraalPackage.USE_CASE__ACTORS:
				return getActors();
			case GraalPackage.USE_CASE__TASKS:
				return getTasks();
			case GraalPackage.USE_CASE__INCLUDES:
				return getIncludes();
			case GraalPackage.USE_CASE__EXTENDS:
				return getExtends();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraalPackage.USE_CASE__DTO_CATEGORIES:
				getDtoCategories().clear();
				getDtoCategories().addAll((Collection<? extends Category>)newValue);
				return;
			case GraalPackage.USE_CASE__DTOS:
				getDtos().clear();
				getDtos().addAll((Collection<? extends ServiceDTO>)newValue);
				return;
			case GraalPackage.USE_CASE__ENTITY_BLOCKS:
				getEntityBlocks().clear();
				getEntityBlocks().addAll((Collection<? extends Block>)newValue);
				return;
			case GraalPackage.USE_CASE__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case GraalPackage.USE_CASE__ACTORS:
				getActors().clear();
				getActors().addAll((Collection<? extends Actor>)newValue);
				return;
			case GraalPackage.USE_CASE__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends AbstractTask>)newValue);
				return;
			case GraalPackage.USE_CASE__INCLUDES:
				getIncludes().clear();
				getIncludes().addAll((Collection<? extends UseCase>)newValue);
				return;
			case GraalPackage.USE_CASE__EXTENDS:
				getExtends().clear();
				getExtends().addAll((Collection<? extends UseCase>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GraalPackage.USE_CASE__DTO_CATEGORIES:
				getDtoCategories().clear();
				return;
			case GraalPackage.USE_CASE__DTOS:
				getDtos().clear();
				return;
			case GraalPackage.USE_CASE__ENTITY_BLOCKS:
				getEntityBlocks().clear();
				return;
			case GraalPackage.USE_CASE__ENTITIES:
				getEntities().clear();
				return;
			case GraalPackage.USE_CASE__ACTORS:
				getActors().clear();
				return;
			case GraalPackage.USE_CASE__TASKS:
				getTasks().clear();
				return;
			case GraalPackage.USE_CASE__INCLUDES:
				getIncludes().clear();
				return;
			case GraalPackage.USE_CASE__EXTENDS:
				getExtends().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GraalPackage.USE_CASE__DTO_CATEGORIES:
				return dtoCategories != null && !dtoCategories.isEmpty();
			case GraalPackage.USE_CASE__DTOS:
				return dtos != null && !dtos.isEmpty();
			case GraalPackage.USE_CASE__ENTITY_BLOCKS:
				return entityBlocks != null && !entityBlocks.isEmpty();
			case GraalPackage.USE_CASE__ENTITIES:
				return entities != null && !entities.isEmpty();
			case GraalPackage.USE_CASE__ACTORS:
				return actors != null && !actors.isEmpty();
			case GraalPackage.USE_CASE__TASKS:
				return tasks != null && !tasks.isEmpty();
			case GraalPackage.USE_CASE__INCLUDES:
				return includes != null && !includes.isEmpty();
			case GraalPackage.USE_CASE__EXTENDS:
				return extends_ != null && !extends_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DomainModelRegistry.class) {
			switch (derivedFeatureID) {
				case GraalPackage.USE_CASE__DTO_CATEGORIES: return GraalPackage.DOMAIN_MODEL_REGISTRY__DTO_CATEGORIES;
				case GraalPackage.USE_CASE__DTOS: return GraalPackage.DOMAIN_MODEL_REGISTRY__DTOS;
				case GraalPackage.USE_CASE__ENTITY_BLOCKS: return GraalPackage.DOMAIN_MODEL_REGISTRY__ENTITY_BLOCKS;
				case GraalPackage.USE_CASE__ENTITIES: return GraalPackage.DOMAIN_MODEL_REGISTRY__ENTITIES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DomainModelRegistry.class) {
			switch (baseFeatureID) {
				case GraalPackage.DOMAIN_MODEL_REGISTRY__DTO_CATEGORIES: return GraalPackage.USE_CASE__DTO_CATEGORIES;
				case GraalPackage.DOMAIN_MODEL_REGISTRY__DTOS: return GraalPackage.USE_CASE__DTOS;
				case GraalPackage.DOMAIN_MODEL_REGISTRY__ENTITY_BLOCKS: return GraalPackage.USE_CASE__ENTITY_BLOCKS;
				case GraalPackage.DOMAIN_MODEL_REGISTRY__ENTITIES: return GraalPackage.USE_CASE__ENTITIES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //UseCaseImpl
