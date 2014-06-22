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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.graal.Actor;
import org.obeonetwork.graal.GraalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.graal.impl.ActorImpl#getSubActors <em>Sub Actors</em>}</li>
 *   <li>{@link org.obeonetwork.graal.impl.ActorImpl#getSuperActor <em>Super Actor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActorImpl extends NamedElementImpl implements Actor {
	/**
	 * The cached value of the '{@link #getSubActors() <em>Sub Actors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> subActors;
	/**
	 * The cached value of the '{@link #getSuperActor() <em>Super Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperActor()
	 * @generated
	 * @ordered
	 */
	protected Actor superActor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraalPackage.Literals.ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Actor> getSubActors() {
		if (subActors == null) {
			subActors = new EObjectWithInverseResolvingEList<Actor>(Actor.class, this, GraalPackage.ACTOR__SUB_ACTORS, GraalPackage.ACTOR__SUPER_ACTOR);
		}
		return subActors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getSuperActor() {
		if (superActor != null && superActor.eIsProxy()) {
			InternalEObject oldSuperActor = (InternalEObject)superActor;
			superActor = (Actor)eResolveProxy(oldSuperActor);
			if (superActor != oldSuperActor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraalPackage.ACTOR__SUPER_ACTOR, oldSuperActor, superActor));
			}
		}
		return superActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetSuperActor() {
		return superActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperActor(Actor newSuperActor, NotificationChain msgs) {
		Actor oldSuperActor = superActor;
		superActor = newSuperActor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraalPackage.ACTOR__SUPER_ACTOR, oldSuperActor, newSuperActor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperActor(Actor newSuperActor) {
		if (newSuperActor != superActor) {
			NotificationChain msgs = null;
			if (superActor != null)
				msgs = ((InternalEObject)superActor).eInverseRemove(this, GraalPackage.ACTOR__SUB_ACTORS, Actor.class, msgs);
			if (newSuperActor != null)
				msgs = ((InternalEObject)newSuperActor).eInverseAdd(this, GraalPackage.ACTOR__SUB_ACTORS, Actor.class, msgs);
			msgs = basicSetSuperActor(newSuperActor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraalPackage.ACTOR__SUPER_ACTOR, newSuperActor, newSuperActor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraalPackage.ACTOR__SUB_ACTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubActors()).basicAdd(otherEnd, msgs);
			case GraalPackage.ACTOR__SUPER_ACTOR:
				if (superActor != null)
					msgs = ((InternalEObject)superActor).eInverseRemove(this, GraalPackage.ACTOR__SUB_ACTORS, Actor.class, msgs);
				return basicSetSuperActor((Actor)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraalPackage.ACTOR__SUB_ACTORS:
				return ((InternalEList<?>)getSubActors()).basicRemove(otherEnd, msgs);
			case GraalPackage.ACTOR__SUPER_ACTOR:
				return basicSetSuperActor(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraalPackage.ACTOR__SUB_ACTORS:
				return getSubActors();
			case GraalPackage.ACTOR__SUPER_ACTOR:
				if (resolve) return getSuperActor();
				return basicGetSuperActor();
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
			case GraalPackage.ACTOR__SUB_ACTORS:
				getSubActors().clear();
				getSubActors().addAll((Collection<? extends Actor>)newValue);
				return;
			case GraalPackage.ACTOR__SUPER_ACTOR:
				setSuperActor((Actor)newValue);
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
			case GraalPackage.ACTOR__SUB_ACTORS:
				getSubActors().clear();
				return;
			case GraalPackage.ACTOR__SUPER_ACTOR:
				setSuperActor((Actor)null);
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
			case GraalPackage.ACTOR__SUB_ACTORS:
				return subActors != null && !subActors.isEmpty();
			case GraalPackage.ACTOR__SUPER_ACTOR:
				return superActor != null;
		}
		return super.eIsSet(featureID);
	}

} //ActorImpl
