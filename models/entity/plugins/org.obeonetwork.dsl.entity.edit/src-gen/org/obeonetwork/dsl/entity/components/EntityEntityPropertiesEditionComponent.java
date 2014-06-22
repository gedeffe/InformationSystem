/*******************************************************************************
 * Copyright (c) 2008-2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.dsl.entity.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.obeonetwork.dsl.entity.Entity;
import org.obeonetwork.dsl.entity.EntityFactory;
import org.obeonetwork.dsl.entity.EntityPackage;
import org.obeonetwork.dsl.entity.InheritanceKind;
import org.obeonetwork.dsl.entity.parts.EntityPropertiesEditionPart;
import org.obeonetwork.dsl.entity.parts.EntityViewsRepository;
import org.obeonetwork.dsl.environment.EnvironmentPackage;

// End of user code

/**
 * @author <a href="mailto:jerome.benois@obeo.fr>Jérôme Benois</a>
 * 
 */
public class EntityEntityPropertiesEditionComponent extends
		SinglePartPropertiesEditingComponent {

	public static String ENTITY_PART = "Entity"; //$NON-NLS-1$

	/**
	 * Settings for superType EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings superTypeSettings;

	/**
	 * Default constructor
	 * 
	 */
	public EntityEntityPropertiesEditionComponent(
			final PropertiesEditingContext editingContext,
			final EObject entity, final String editing_mode) {
		super(editingContext, entity, editing_mode);
		this.parts = new String[] { ENTITY_PART };
		this.repositoryKey = EntityViewsRepository.class;
		this.partKey = EntityViewsRepository.Entity_.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object,
	 *      int, org.eclipse.emf.ecore.EObject,
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(final Object key, final int kind, final EObject elt,
			final ResourceSet allResource) {
		this.setInitializing(true);
		if ((this.editingPart != null) && (key == this.partKey)) {
			this.editingPart.setContext(elt, allResource);

			final Entity entity = (Entity) elt;
			final EntityPropertiesEditionPart entityPart = (EntityPropertiesEditionPart) this.editingPart;
			// init values
			if (this.isAccessible(EntityViewsRepository.Entity_.Properties.name)) {
				entityPart.setName(EEFConverterUtil.convertToString(
						EcorePackage.Literals.ESTRING, entity.getName()));
			}

			if (this.isAccessible(EntityViewsRepository.Entity_.Properties.superType)) {
				// init part
				this.superTypeSettings = new EObjectFlatComboSettings(entity,
						EntityPackage.eINSTANCE.getEntity_Supertype());
				entityPart.initSuperType(this.superTypeSettings);
				// set the button mode
				entityPart.setSuperTypeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (this.isAccessible(EntityViewsRepository.Entity_.Properties.estimatedVolumetry)) {
				entityPart.setEstimatedVolumetry(EEFConverterUtil
						.convertToString(EcorePackage.Literals.EINT,
								entity.getEstimatedVolumetry()));
			}

			if (this.isAccessible(EntityViewsRepository.Entity_.Properties.estimatedAccess)) {
				entityPart
						.setEstimatedAccess(EEFConverterUtil.convertToString(
								EcorePackage.Literals.EINT,
								entity.getEstimatedAccess()));
			}

			if (this.isAccessible(EntityViewsRepository.Entity_.Properties.historized)) {
				entityPart.setHistorized(entity.isHistorized());
			}
			if (this.isAccessible(EntityViewsRepository.Entity_.Properties.inheritanceKind)) {
				entityPart.initInheritanceKind(EEFUtils.choiceOfValues(entity,
						EntityPackage.eINSTANCE.getEntity_InheritanceKind()),
						entity.getInheritanceKind());
			}
			if (this.isAccessible(EntityViewsRepository.Entity_.Properties.description)) {
				entityPart
						.setDescription(EcoreUtil.convertToString(
								EcorePackage.Literals.ESTRING,
								entity.getDescription()));
				// init filters
			}

			// init values for referenced views

			// init filters for referenced views

		}
		this.setInitializing(false);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	@Override
	public EStructuralFeature associatedFeature(final Object editorKey) {
		if (editorKey == EntityViewsRepository.Entity_.Properties.name) {
			return EnvironmentPackage.eINSTANCE.getType_Name();
		}
		if (editorKey == EntityViewsRepository.Entity_.Properties.superType) {
			return EntityPackage.eINSTANCE.getEntity_Supertype();
		}
		if (editorKey == EntityViewsRepository.Entity_.Properties.estimatedVolumetry) {
			return EntityPackage.eINSTANCE.getEntity_EstimatedVolumetry();
		}
		if (editorKey == EntityViewsRepository.Entity_.Properties.estimatedAccess) {
			return EntityPackage.eINSTANCE.getEntity_EstimatedAccess();
		}
		if (editorKey == EntityViewsRepository.Entity_.Properties.historized) {
			return EntityPackage.eINSTANCE.getEntity_Historized();
		}
		if (editorKey == EntityViewsRepository.Entity_.Properties.inheritanceKind) {
			return EntityPackage.eINSTANCE.getEntity_InheritanceKind();
		}
		if (editorKey == EntityViewsRepository.Entity_.Properties.description) {
			return EnvironmentPackage.eINSTANCE.getObeoDSMObject_Description();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	@Override
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		final Entity entity = (Entity) this.semanticObject;
		if (EntityViewsRepository.Entity_.Properties.name == event
				.getAffectedEditor()) {
			entity.setName((java.lang.String) EEFConverterUtil
					.createFromString(EcorePackage.Literals.ESTRING,
							(String) event.getNewValue()));
		}
		if (EntityViewsRepository.Entity_.Properties.superType == event
				.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				this.superTypeSettings.setToReference(event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				final Entity eObject = EntityFactory.eINSTANCE.createEntity();
				final EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
						this.editingContext, this, eObject,
						this.editingContext.getAdapterFactory());
				final PropertiesEditingProvider provider = (PropertiesEditingProvider) this.editingContext
						.getAdapterFactory().adapt(eObject,
								PropertiesEditingProvider.class);
				if (provider != null) {
					final PropertiesEditingPolicy policy = provider
							.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				this.superTypeSettings.setToReference(eObject);
			}
		}
		if (EntityViewsRepository.Entity_.Properties.estimatedVolumetry == event
				.getAffectedEditor()) {
			entity.setEstimatedVolumetry((EEFConverterUtil.createIntFromString(
					EcorePackage.Literals.EINT, (String) event.getNewValue())));
		}
		if (EntityViewsRepository.Entity_.Properties.estimatedAccess == event
				.getAffectedEditor()) {
			entity.setEstimatedAccess((EEFConverterUtil.createIntFromString(
					EcorePackage.Literals.EINT, (String) event.getNewValue())));
		}
		if (EntityViewsRepository.Entity_.Properties.historized == event
				.getAffectedEditor()) {
			entity.setHistorized((Boolean) event.getNewValue());
		}
		if (EntityViewsRepository.Entity_.Properties.inheritanceKind == event
				.getAffectedEditor()) {
			entity.setInheritanceKind((InheritanceKind) event.getNewValue());
		}
		if (EntityViewsRepository.Entity_.Properties.description == event
				.getAffectedEditor()) {
			entity.setDescription((java.lang.String) EEFConverterUtil
					.createFromString(EcorePackage.Literals.ESTRING,
							(String) event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void updatePart(final Notification msg) {
		super.updatePart(msg);
		if (this.editingPart.isVisible()) {
			final EntityPropertiesEditionPart entityPart = (EntityPropertiesEditionPart) this.editingPart;
			if (EnvironmentPackage.eINSTANCE.getType_Name().equals(
					msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (entityPart != null)
					&& this.isAccessible(EntityViewsRepository.Entity_.Properties.name)) {
				if (msg.getNewValue() != null) {
					entityPart.setName(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					entityPart.setName("");
				}
			}
			if (EntityPackage.eINSTANCE.getEntity_Supertype().equals(
					msg.getFeature())
					&& (entityPart != null)
					&& this.isAccessible(EntityViewsRepository.Entity_.Properties.superType)) {
				entityPart.setSuperType((EObject) msg.getNewValue());
			}
			if (EntityPackage.eINSTANCE.getEntity_EstimatedVolumetry().equals(
					msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (entityPart != null)
					&& this.isAccessible(EntityViewsRepository.Entity_.Properties.estimatedVolumetry)) {
				if (msg.getNewValue() != null) {
					entityPart.setEstimatedVolumetry(EcoreUtil.convertToString(
							EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					entityPart.setEstimatedVolumetry("");
				}
			}
			if (EntityPackage.eINSTANCE.getEntity_EstimatedAccess().equals(
					msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (entityPart != null)
					&& this.isAccessible(EntityViewsRepository.Entity_.Properties.estimatedAccess)) {
				if (msg.getNewValue() != null) {
					entityPart.setEstimatedAccess(EcoreUtil.convertToString(
							EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					entityPart.setEstimatedAccess("");
				}
			}
			if (EntityPackage.eINSTANCE.getEntity_Historized().equals(
					msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (entityPart != null)
					&& this.isAccessible(EntityViewsRepository.Entity_.Properties.historized)) {
				entityPart.setHistorized((Boolean) msg.getNewValue());
			}

			if (EntityPackage.eINSTANCE.getEntity_InheritanceKind().equals(
					msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& this.isAccessible(EntityViewsRepository.Entity_.Properties.inheritanceKind)) {
				entityPart.setInheritanceKind((InheritanceKind) msg
						.getNewValue());
			}

			if (EnvironmentPackage.eINSTANCE.getObeoDSMObject_Description()
					.equals(msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (entityPart != null)
					&& this.isAccessible(EntityViewsRepository.Entity_.Properties.description)) {
				if (msg.getNewValue() != null) {
					entityPart.setDescription(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					entityPart.setDescription("");
				}
			}

		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		final NotificationFilter filter = new EStructuralFeatureNotificationFilter(
				EnvironmentPackage.eINSTANCE.getType_Name(),
				EntityPackage.eINSTANCE.getEntity_Supertype(),
				EntityPackage.eINSTANCE.getEntity_EstimatedVolumetry(),
				EntityPackage.eINSTANCE.getEntity_EstimatedAccess(),
				EntityPackage.eINSTANCE.getEntity_Historized(),
				EntityPackage.eINSTANCE.getEntity_InheritanceKind(),
				EnvironmentPackage.eINSTANCE.getObeoDSMObject_Description());
		return new NotificationFilter[] { filter, };
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object,
	 *      int)
	 * 
	 */
	@Override
	public boolean isRequired(final Object key, final int kind) {
		return (key == EntityViewsRepository.Entity_.Properties.name)
				|| (key == EntityViewsRepository.Entity_.Properties.historized);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(final IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (EntityViewsRepository.Entity_.Properties.name == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(EnvironmentPackage.eINSTANCE
										.getType_Name().getEAttributeType(),
										(String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							EnvironmentPackage.eINSTANCE.getType_Name()
									.getEAttributeType(), newValue);
				}
				if (EntityViewsRepository.Entity_.Properties.estimatedVolumetry == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(EntityPackage.eINSTANCE
										.getEntity_EstimatedVolumetry()
										.getEAttributeType(), (String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							EntityPackage.eINSTANCE
									.getEntity_EstimatedVolumetry()
									.getEAttributeType(), newValue);
				}
				if (EntityViewsRepository.Entity_.Properties.estimatedAccess == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(EntityPackage.eINSTANCE
										.getEntity_EstimatedAccess()
										.getEAttributeType(), (String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							EntityPackage.eINSTANCE.getEntity_EstimatedAccess()
									.getEAttributeType(), newValue);
				}
				if (EntityViewsRepository.Entity_.Properties.historized == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(EntityPackage.eINSTANCE
										.getEntity_Historized()
										.getEAttributeType(), (String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							EntityPackage.eINSTANCE.getEntity_Historized()
									.getEAttributeType(), newValue);
				}
				if (EntityViewsRepository.Entity_.Properties.inheritanceKind == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(EntityPackage.eINSTANCE
										.getEntity_InheritanceKind()
										.getEAttributeType(), (String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							EntityPackage.eINSTANCE.getEntity_InheritanceKind()
									.getEAttributeType(), newValue);
				}
				if (EntityViewsRepository.Entity_.Properties.description == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(EnvironmentPackage.eINSTANCE
										.getObeoDSMObject_Description()
										.getEAttributeType(), (String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							EnvironmentPackage.eINSTANCE
									.getObeoDSMObject_Description()
									.getEAttributeType(), newValue);
				}
			} catch (final IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (final WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
