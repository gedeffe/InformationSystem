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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.obeonetwork.dsl.entity.Block;
import org.obeonetwork.dsl.entity.Entity;
import org.obeonetwork.dsl.soa.Category;
import org.obeonetwork.dsl.soa.ServiceDTO;
import org.obeonetwork.graal.DomainModelRegistry;
import org.obeonetwork.graal.GraalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Model Registry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.graal.impl.DomainModelRegistryImpl#getDtoCategories <em>Dto Categories</em>}</li>
 *   <li>{@link org.obeonetwork.graal.impl.DomainModelRegistryImpl#getDtos <em>Dtos</em>}</li>
 *   <li>{@link org.obeonetwork.graal.impl.DomainModelRegistryImpl#getEntityBlocks <em>Entity Blocks</em>}</li>
 *   <li>{@link org.obeonetwork.graal.impl.DomainModelRegistryImpl#getEntities <em>Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DomainModelRegistryImpl extends EObjectImpl implements DomainModelRegistry {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainModelRegistryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraalPackage.Literals.DOMAIN_MODEL_REGISTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Category> getDtoCategories() {
		if (dtoCategories == null) {
			dtoCategories = new EObjectResolvingEList<Category>(Category.class, this, GraalPackage.DOMAIN_MODEL_REGISTRY__DTO_CATEGORIES);
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
			dtos = new EObjectResolvingEList<ServiceDTO>(ServiceDTO.class, this, GraalPackage.DOMAIN_MODEL_REGISTRY__DTOS);
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
			entityBlocks = new EObjectResolvingEList<Block>(Block.class, this, GraalPackage.DOMAIN_MODEL_REGISTRY__ENTITY_BLOCKS);
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
			entities = new EObjectResolvingEList<Entity>(Entity.class, this, GraalPackage.DOMAIN_MODEL_REGISTRY__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraalPackage.DOMAIN_MODEL_REGISTRY__DTO_CATEGORIES:
				return getDtoCategories();
			case GraalPackage.DOMAIN_MODEL_REGISTRY__DTOS:
				return getDtos();
			case GraalPackage.DOMAIN_MODEL_REGISTRY__ENTITY_BLOCKS:
				return getEntityBlocks();
			case GraalPackage.DOMAIN_MODEL_REGISTRY__ENTITIES:
				return getEntities();
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
			case GraalPackage.DOMAIN_MODEL_REGISTRY__DTO_CATEGORIES:
				getDtoCategories().clear();
				getDtoCategories().addAll((Collection<? extends Category>)newValue);
				return;
			case GraalPackage.DOMAIN_MODEL_REGISTRY__DTOS:
				getDtos().clear();
				getDtos().addAll((Collection<? extends ServiceDTO>)newValue);
				return;
			case GraalPackage.DOMAIN_MODEL_REGISTRY__ENTITY_BLOCKS:
				getEntityBlocks().clear();
				getEntityBlocks().addAll((Collection<? extends Block>)newValue);
				return;
			case GraalPackage.DOMAIN_MODEL_REGISTRY__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends Entity>)newValue);
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
			case GraalPackage.DOMAIN_MODEL_REGISTRY__DTO_CATEGORIES:
				getDtoCategories().clear();
				return;
			case GraalPackage.DOMAIN_MODEL_REGISTRY__DTOS:
				getDtos().clear();
				return;
			case GraalPackage.DOMAIN_MODEL_REGISTRY__ENTITY_BLOCKS:
				getEntityBlocks().clear();
				return;
			case GraalPackage.DOMAIN_MODEL_REGISTRY__ENTITIES:
				getEntities().clear();
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
			case GraalPackage.DOMAIN_MODEL_REGISTRY__DTO_CATEGORIES:
				return dtoCategories != null && !dtoCategories.isEmpty();
			case GraalPackage.DOMAIN_MODEL_REGISTRY__DTOS:
				return dtos != null && !dtos.isEmpty();
			case GraalPackage.DOMAIN_MODEL_REGISTRY__ENTITY_BLOCKS:
				return entityBlocks != null && !entityBlocks.isEmpty();
			case GraalPackage.DOMAIN_MODEL_REGISTRY__ENTITIES:
				return entities != null && !entities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainModelRegistryImpl
