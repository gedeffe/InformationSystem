/**
 * Copyright (c) 2008-2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *
 * $Id$
 */
package org.obeonetwork.dsl.environment.impl;

import java.util.Collection;
import java.util.Date;
import org.eclipse.emf.cdo.CDONotification;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.environment.Behaviour;
import org.obeonetwork.dsl.environment.BindingRegistry;
import org.obeonetwork.dsl.environment.EnvironmentPackage;
import org.obeonetwork.dsl.environment.MetaDataContainer;
import org.obeonetwork.dsl.environment.ObeoDSMObject;
import org.obeonetwork.dsl.environment.util.EnvironmentUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Obeo DSM Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.ObeoDSMObjectImpl#getMetadatas <em>Metadatas</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.ObeoDSMObjectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.ObeoDSMObjectImpl#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.ObeoDSMObjectImpl#getBehaviours <em>Behaviours</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.ObeoDSMObjectImpl#getBindingRegistries <em>Binding Registries</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.ObeoDSMObjectImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.ObeoDSMObjectImpl#getCreatedOn <em>Created On</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.environment.impl.ObeoDSMObjectImpl#getModifiedOn <em>Modified On</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ObeoDSMObjectImpl extends EObjectImpl implements
		ObeoDSMObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2008-2009 Obeo.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The cached value of the '{@link #getMetadatas() <em>Metadatas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadatas()
	 * @generated
	 * @ordered
	 */
	protected MetaDataContainer metadatas;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKeywords() <em>Keywords</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywords()
	 * @generated
	 * @ordered
	 */
	protected EList<String> keywords;

	/**
	 * The cached value of the '{@link #getBehaviours() <em>Behaviours</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviours()
	 * @generated
	 * @ordered
	 */
	protected EList<Behaviour> behaviours;

	/**
	 * The cached value of the '{@link #getBindingRegistries() <em>Binding Registries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingRegistries()
	 * @generated
	 * @ordered
	 */
	protected EList<BindingRegistry> bindingRegistries;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected int version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedOn() <em>Created On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedOn()
	 * @generated NOT
	 * @ordered
	 */
	protected static final Date CREATED_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedOn() <em>Created On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedOn()
	 * @generated
	 * @ordered
	 */
	protected Date createdOn = CREATED_ON_EDEFAULT;

	/**
	 * The default value of the '{@link #getModifiedOn() <em>Modified On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedOn()
	 * @generated
	 * @ordered
	 */
	protected static final Date MODIFIED_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModifiedOn() <em>Modified On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedOn()
	 * @generated
	 * @ordered
	 */
	protected Date modifiedOn = MODIFIED_ON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ObeoDSMObjectImpl() {
		super();
		eAdapters().add(new AdapterImpl() {

			@Override
			public void notifyChanged(Notification msg) {
				// We don't handle CDONotifications because it would mean setting an attribute outside a transaction
				// When 2 clients are on the same shared projects :
				// - the one who actually does the modification receives instances of EMF classic notifications
				// - the one who is just listening to changes receives instances of CDO notifications
				// With that test, it is the first client who sets the modifiedOn attribute
				if (msg instanceof CDONotification) {
					return;
				}
				if (msg.getNotifier() instanceof ObeoDSMObject) {
					ObeoDSMObject notifier = (ObeoDSMObject) msg.getNotifier();

					if (!EnvironmentUtil.isResourceLoading(notifier)) {
						Date currentDate = new Date();

						if (msg != null
								&& msg.getFeature() != null
								&& !msg.getFeature()
										.equals(EnvironmentPackage.Literals.OBEO_DSM_OBJECT__MODIFIED_ON)
								&& !msg.getFeature()
										.equals(EnvironmentPackage.Literals.OBEO_DSM_OBJECT__CREATED_ON)) {
							switch (msg.getEventType()) {
							case Notification.MOVE:
							case Notification.SET:
							case Notification.UNSET:
							case Notification.ADD:
							case Notification.ADD_MANY:
							case Notification.REMOVE:
							case Notification.REMOVE_MANY:
								notifier.setModifiedOn(currentDate);
								if (notifier.getCreatedOn() == null) {
									notifier.setCreatedOn(currentDate);
								}
								break;
							}
						}/* Disabling this functionnality because it causes problems with CDO
							everytime an object is modifed all its containers are modified too
							and then CDO objects are locked
							
							else if (msg.getFeature().equals(EnvironmentPackage.Literals.OBEO_DSM_OBJECT__MODIFIED_ON)) {
							if (msg.isTouch() == false) {
								// When an object is modified, last modification date is set on its container too
								if (msg.getEventType() == Notification.SET) {
									if (notifier.eContainer() != null && notifier.eContainer() instanceof ObeoDSMObject) {
										((ObeoDSMObject) notifier.eContainer()).setModifiedOn(currentDate);
									}
								}
							}
							}*/
					}
				}
			}
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnvironmentPackage.Literals.OBEO_DSM_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaDataContainer getMetadatas() {
		if (metadatas != null && metadatas.eIsProxy()) {
			InternalEObject oldMetadatas = (InternalEObject) metadatas;
			metadatas = (MetaDataContainer) eResolveProxy(oldMetadatas);
			if (metadatas != oldMetadatas) {
				InternalEObject newMetadatas = (InternalEObject) metadatas;
				NotificationChain msgs = oldMetadatas
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- EnvironmentPackage.OBEO_DSM_OBJECT__METADATAS,
								null, null);
				if (newMetadatas.eInternalContainer() == null) {
					msgs = newMetadatas
							.eInverseAdd(
									this,
									EOPPOSITE_FEATURE_BASE
											- EnvironmentPackage.OBEO_DSM_OBJECT__METADATAS,
									null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EnvironmentPackage.OBEO_DSM_OBJECT__METADATAS,
							oldMetadatas, metadatas));
			}
		}
		return metadatas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaDataContainer basicGetMetadatas() {
		return metadatas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadatas(MetaDataContainer newMetadatas,
			NotificationChain msgs) {
		MetaDataContainer oldMetadatas = metadatas;
		metadatas = newMetadatas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					EnvironmentPackage.OBEO_DSM_OBJECT__METADATAS,
					oldMetadatas, newMetadatas);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadatas(MetaDataContainer newMetadatas) {
		if (newMetadatas != metadatas) {
			NotificationChain msgs = null;
			if (metadatas != null)
				msgs = ((InternalEObject) metadatas)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- EnvironmentPackage.OBEO_DSM_OBJECT__METADATAS,
								null, msgs);
			if (newMetadatas != null)
				msgs = ((InternalEObject) newMetadatas)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- EnvironmentPackage.OBEO_DSM_OBJECT__METADATAS,
								null, msgs);
			msgs = basicSetMetadatas(newMetadatas, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EnvironmentPackage.OBEO_DSM_OBJECT__METADATAS,
					newMetadatas, newMetadatas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EnvironmentPackage.OBEO_DSM_OBJECT__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getKeywords() {
		if (keywords == null) {
			keywords = new EDataTypeUniqueEList<String>(String.class, this,
					EnvironmentPackage.OBEO_DSM_OBJECT__KEYWORDS);
		}
		return keywords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Behaviour> getBehaviours() {
		if (behaviours == null) {
			behaviours = new EObjectContainmentEList.Resolving<Behaviour>(
					Behaviour.class, this,
					EnvironmentPackage.OBEO_DSM_OBJECT__BEHAVIOURS);
		}
		return behaviours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BindingRegistry> getBindingRegistries() {
		if (bindingRegistries == null) {
			bindingRegistries = new EObjectResolvingEList<BindingRegistry>(
					BindingRegistry.class, this,
					EnvironmentPackage.OBEO_DSM_OBJECT__BINDING_REGISTRIES);
		}
		return bindingRegistries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(int newVersion) {
		int oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EnvironmentPackage.OBEO_DSM_OBJECT__VERSION, oldVersion,
					version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreatedOn() {
		return createdOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedOn(Date newCreatedOn) {
		Date oldCreatedOn = createdOn;
		createdOn = newCreatedOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EnvironmentPackage.OBEO_DSM_OBJECT__CREATED_ON,
					oldCreatedOn, createdOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getModifiedOn() {
		return modifiedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifiedOn(Date newModifiedOn) {
		Date oldModifiedOn = modifiedOn;
		modifiedOn = newModifiedOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EnvironmentPackage.OBEO_DSM_OBJECT__MODIFIED_ON,
					oldModifiedOn, modifiedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EnvironmentPackage.OBEO_DSM_OBJECT__METADATAS:
			return basicSetMetadatas(null, msgs);
		case EnvironmentPackage.OBEO_DSM_OBJECT__BEHAVIOURS:
			return ((InternalEList<?>) getBehaviours()).basicRemove(otherEnd,
					msgs);
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
		case EnvironmentPackage.OBEO_DSM_OBJECT__METADATAS:
			if (resolve)
				return getMetadatas();
			return basicGetMetadatas();
		case EnvironmentPackage.OBEO_DSM_OBJECT__DESCRIPTION:
			return getDescription();
		case EnvironmentPackage.OBEO_DSM_OBJECT__KEYWORDS:
			return getKeywords();
		case EnvironmentPackage.OBEO_DSM_OBJECT__BEHAVIOURS:
			return getBehaviours();
		case EnvironmentPackage.OBEO_DSM_OBJECT__BINDING_REGISTRIES:
			return getBindingRegistries();
		case EnvironmentPackage.OBEO_DSM_OBJECT__VERSION:
			return getVersion();
		case EnvironmentPackage.OBEO_DSM_OBJECT__CREATED_ON:
			return getCreatedOn();
		case EnvironmentPackage.OBEO_DSM_OBJECT__MODIFIED_ON:
			return getModifiedOn();
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
		case EnvironmentPackage.OBEO_DSM_OBJECT__METADATAS:
			setMetadatas((MetaDataContainer) newValue);
			return;
		case EnvironmentPackage.OBEO_DSM_OBJECT__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case EnvironmentPackage.OBEO_DSM_OBJECT__KEYWORDS:
			getKeywords().clear();
			getKeywords().addAll((Collection<? extends String>) newValue);
			return;
		case EnvironmentPackage.OBEO_DSM_OBJECT__BEHAVIOURS:
			getBehaviours().clear();
			getBehaviours().addAll((Collection<? extends Behaviour>) newValue);
			return;
		case EnvironmentPackage.OBEO_DSM_OBJECT__BINDING_REGISTRIES:
			getBindingRegistries().clear();
			getBindingRegistries().addAll(
					(Collection<? extends BindingRegistry>) newValue);
			return;
		case EnvironmentPackage.OBEO_DSM_OBJECT__VERSION:
			setVersion((Integer) newValue);
			return;
		case EnvironmentPackage.OBEO_DSM_OBJECT__CREATED_ON:
			setCreatedOn((Date) newValue);
			return;
		case EnvironmentPackage.OBEO_DSM_OBJECT__MODIFIED_ON:
			setModifiedOn((Date) newValue);
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
		case EnvironmentPackage.OBEO_DSM_OBJECT__METADATAS:
			setMetadatas((MetaDataContainer) null);
			return;
		case EnvironmentPackage.OBEO_DSM_OBJECT__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case EnvironmentPackage.OBEO_DSM_OBJECT__KEYWORDS:
			getKeywords().clear();
			return;
		case EnvironmentPackage.OBEO_DSM_OBJECT__BEHAVIOURS:
			getBehaviours().clear();
			return;
		case EnvironmentPackage.OBEO_DSM_OBJECT__BINDING_REGISTRIES:
			getBindingRegistries().clear();
			return;
		case EnvironmentPackage.OBEO_DSM_OBJECT__VERSION:
			setVersion(VERSION_EDEFAULT);
			return;
		case EnvironmentPackage.OBEO_DSM_OBJECT__CREATED_ON:
			setCreatedOn(CREATED_ON_EDEFAULT);
			return;
		case EnvironmentPackage.OBEO_DSM_OBJECT__MODIFIED_ON:
			setModifiedOn(MODIFIED_ON_EDEFAULT);
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
		case EnvironmentPackage.OBEO_DSM_OBJECT__METADATAS:
			return metadatas != null;
		case EnvironmentPackage.OBEO_DSM_OBJECT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null
					: !DESCRIPTION_EDEFAULT.equals(description);
		case EnvironmentPackage.OBEO_DSM_OBJECT__KEYWORDS:
			return keywords != null && !keywords.isEmpty();
		case EnvironmentPackage.OBEO_DSM_OBJECT__BEHAVIOURS:
			return behaviours != null && !behaviours.isEmpty();
		case EnvironmentPackage.OBEO_DSM_OBJECT__BINDING_REGISTRIES:
			return bindingRegistries != null && !bindingRegistries.isEmpty();
		case EnvironmentPackage.OBEO_DSM_OBJECT__VERSION:
			return version != VERSION_EDEFAULT;
		case EnvironmentPackage.OBEO_DSM_OBJECT__CREATED_ON:
			return CREATED_ON_EDEFAULT == null ? createdOn != null
					: !CREATED_ON_EDEFAULT.equals(createdOn);
		case EnvironmentPackage.OBEO_DSM_OBJECT__MODIFIED_ON:
			return MODIFIED_ON_EDEFAULT == null ? modifiedOn != null
					: !MODIFIED_ON_EDEFAULT.equals(modifiedOn);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", keywords: ");
		result.append(keywords);
		result.append(", version: ");
		result.append(version);
		result.append(", createdOn: ");
		result.append(createdOn);
		result.append(", modifiedOn: ");
		result.append(modifiedOn);
		result.append(')');
		return result.toString();
	}

} //ObeoDSMObjectImpl