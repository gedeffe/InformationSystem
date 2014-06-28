/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.graal.design.graalfeatureextensions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.sirius.viewpoint.DAnalysis;
import org.eclipse.sirius.viewpoint.impl.DFeatureExtensionImpl;
import org.obeonetwork.graal.UserStory;
import org.obeonetwork.graal.design.graalfeatureextensions.GraalfeatureextensionsPackage;
import org.obeonetwork.graal.design.graalfeatureextensions.UIConfiguration;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>UI Configuration</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.obeonetwork.graal.design.graalfeatureextensions.impl.UIConfigurationImpl#getViewpointAnalysis
 * <em>Viewpoint Analysis</em>}</li>
 * <li>
 * {@link org.obeonetwork.graal.design.graalfeatureextensions.impl.UIConfigurationImpl#getActiveUserStories
 * <em>Active User Stories</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class UIConfigurationImpl extends DFeatureExtensionImpl implements
		UIConfiguration {
	/**
	 * The cached value of the '{@link #getViewpointAnalysis()
	 * <em>Viewpoint Analysis</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getViewpointAnalysis()
	 * @generated
	 * @ordered
	 */
	protected DAnalysis viewpointAnalysis;

	/**
	 * The cached value of the '{@link #getActiveUserStories()
	 * <em>Active User Stories</em>}' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getActiveUserStories()
	 * @generated
	 * @ordered
	 */
	protected EList<UserStory> activeUserStories;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected UIConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraalfeatureextensionsPackage.Literals.UI_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DAnalysis getViewpointAnalysis() {
		if ((this.viewpointAnalysis != null)
				&& this.viewpointAnalysis.eIsProxy()) {
			final InternalEObject oldViewpointAnalysis = (InternalEObject) this.viewpointAnalysis;
			this.viewpointAnalysis = (DAnalysis) eResolveProxy(oldViewpointAnalysis);
			if (this.viewpointAnalysis != oldViewpointAnalysis) {
				if (eNotificationRequired()) {
					this.eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							GraalfeatureextensionsPackage.UI_CONFIGURATION__VIEWPOINT_ANALYSIS,
							oldViewpointAnalysis, this.viewpointAnalysis));
				}
			}
		}
		return this.viewpointAnalysis;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DAnalysis basicGetViewpointAnalysis() {
		return this.viewpointAnalysis;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setViewpointAnalysis(final DAnalysis newViewpointAnalysis) {
		final DAnalysis oldViewpointAnalysis = this.viewpointAnalysis;
		this.viewpointAnalysis = newViewpointAnalysis;
		if (eNotificationRequired()) {
			this.eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					GraalfeatureextensionsPackage.UI_CONFIGURATION__VIEWPOINT_ANALYSIS,
					oldViewpointAnalysis, this.viewpointAnalysis));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<UserStory> getActiveUserStories() {
		if (this.activeUserStories == null) {
			this.activeUserStories = new EObjectResolvingEList<UserStory>(
					UserStory.class,
					this,
					GraalfeatureextensionsPackage.UI_CONFIGURATION__ACTIVE_USER_STORIES);
		}
		return this.activeUserStories;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve,
			final boolean coreType) {
		switch (featureID) {
		case GraalfeatureextensionsPackage.UI_CONFIGURATION__VIEWPOINT_ANALYSIS:
			if (resolve) {
				return this.getViewpointAnalysis();
			}
			return this.basicGetViewpointAnalysis();
		case GraalfeatureextensionsPackage.UI_CONFIGURATION__ACTIVE_USER_STORIES:
			return this.getActiveUserStories();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(final int featureID, final Object newValue) {
		switch (featureID) {
		case GraalfeatureextensionsPackage.UI_CONFIGURATION__VIEWPOINT_ANALYSIS:
			this.setViewpointAnalysis((DAnalysis) newValue);
			return;
		case GraalfeatureextensionsPackage.UI_CONFIGURATION__ACTIVE_USER_STORIES:
			this.getActiveUserStories().clear();
			this.getActiveUserStories().addAll(
					(Collection<? extends UserStory>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(final int featureID) {
		switch (featureID) {
		case GraalfeatureextensionsPackage.UI_CONFIGURATION__VIEWPOINT_ANALYSIS:
			this.setViewpointAnalysis((DAnalysis) null);
			return;
		case GraalfeatureextensionsPackage.UI_CONFIGURATION__ACTIVE_USER_STORIES:
			this.getActiveUserStories().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(final int featureID) {
		switch (featureID) {
		case GraalfeatureextensionsPackage.UI_CONFIGURATION__VIEWPOINT_ANALYSIS:
			return this.viewpointAnalysis != null;
		case GraalfeatureextensionsPackage.UI_CONFIGURATION__ACTIVE_USER_STORIES:
			return (this.activeUserStories != null)
					&& !this.activeUserStories.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // UIConfigurationImpl
