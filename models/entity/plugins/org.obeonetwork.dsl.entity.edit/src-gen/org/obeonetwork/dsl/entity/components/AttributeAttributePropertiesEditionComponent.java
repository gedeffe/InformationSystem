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
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
import org.obeonetwork.dsl.entity.Attribute;
import org.obeonetwork.dsl.entity.EntityPackage;
import org.obeonetwork.dsl.entity.parts.AttributePropertiesEditionPart;
import org.obeonetwork.dsl.entity.parts.EntityViewsRepository;
import org.obeonetwork.dsl.environment.EnvironmentPackage;
import org.obeonetwork.dsl.environment.MultiplicityKind;
import org.obeonetwork.dsl.environment.PrimitiveType;

// End of user code

/**
 * @author <a href="mailto:jerome.benois@obeo.fr>Jérôme Benois</a>
 * 
 */
public class AttributeAttributePropertiesEditionComponent extends
		SinglePartPropertiesEditingComponent {

	public static String ATTRIBUTE_PART = "Attribute"; //$NON-NLS-1$

	/**
	 * Default constructor
	 * 
	 */
	public AttributeAttributePropertiesEditionComponent(
			final PropertiesEditingContext editingContext,
			final EObject attribute, final String editing_mode) {
		super(editingContext, attribute, editing_mode);
		this.parts = new String[] { ATTRIBUTE_PART };
		this.repositoryKey = EntityViewsRepository.class;
		this.partKey = EntityViewsRepository.Attribute.class;
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

			final Attribute attribute = (Attribute) elt;
			final AttributePropertiesEditionPart attributePart = (AttributePropertiesEditionPart) this.editingPart;
			// init values
			if (this.isAccessible(EntityViewsRepository.Attribute.Properties.name)) {
				attributePart.setName(EEFConverterUtil.convertToString(
						EcorePackage.Literals.ESTRING, attribute.getName()));
			}

			if (this.isAccessible(EntityViewsRepository.Attribute.Properties.type)) {
				attributePart.initType(EEFUtils.choiceOfValues(attribute,
						EntityPackage.eINSTANCE.getAttribute_Type()), attribute
						.getType());
			}
			if (this.isAccessible(EntityViewsRepository.Attribute.Properties.multiplicity)) {
				attributePart.initMultiplicity(EEFUtils.choiceOfValues(
						attribute,
						EntityPackage.eINSTANCE.getProperty_Multiplicity()),
						attribute.getMultiplicity());
			}
			if (this.isAccessible(EntityViewsRepository.Attribute.Properties.isPrimaryKey)) {
				attributePart.setIsPrimaryKey(attribute.isIsPrimaryKey());
			}
			if (this.isAccessible(EntityViewsRepository.Attribute.Properties.description)) {
				attributePart.setDescription(EcoreUtil.convertToString(
						EcorePackage.Literals.ESTRING,
						attribute.getDescription()));
				// init filters
			}

			// Start of user code for additional businessfilters for type
			// End of user code

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
		if (editorKey == EntityViewsRepository.Attribute.Properties.name) {
			return EntityPackage.eINSTANCE.getProperty_Name();
		}
		if (editorKey == EntityViewsRepository.Attribute.Properties.type) {
			return EntityPackage.eINSTANCE.getAttribute_Type();
		}
		if (editorKey == EntityViewsRepository.Attribute.Properties.multiplicity) {
			return EntityPackage.eINSTANCE.getProperty_Multiplicity();
		}
		if (editorKey == EntityViewsRepository.Attribute.Properties.isPrimaryKey) {
			return EntityPackage.eINSTANCE.getProperty_IsPrimaryKey();
		}
		if (editorKey == EntityViewsRepository.Attribute.Properties.description) {
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
		final Attribute attribute = (Attribute) this.semanticObject;
		if (EntityViewsRepository.Attribute.Properties.name == event
				.getAffectedEditor()) {
			attribute.setName((java.lang.String) EEFConverterUtil
					.createFromString(EcorePackage.Literals.ESTRING,
							(String) event.getNewValue()));
		}
		if (EntityViewsRepository.Attribute.Properties.type == event
				.getAffectedEditor()) {
			attribute
					.setType(!"".equals(event.getNewValue()) ? (PrimitiveType) event
							.getNewValue() : null);
		}
		if (EntityViewsRepository.Attribute.Properties.multiplicity == event
				.getAffectedEditor()) {
			attribute.setMultiplicity((MultiplicityKind) event.getNewValue());
		}
		if (EntityViewsRepository.Attribute.Properties.isPrimaryKey == event
				.getAffectedEditor()) {
			attribute.setIsPrimaryKey((Boolean) event.getNewValue());
		}
		if (EntityViewsRepository.Attribute.Properties.description == event
				.getAffectedEditor()) {
			attribute.setDescription((java.lang.String) EEFConverterUtil
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
			final AttributePropertiesEditionPart attributePart = (AttributePropertiesEditionPart) this.editingPart;
			if (EntityPackage.eINSTANCE.getProperty_Name().equals(
					msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (attributePart != null)
					&& this.isAccessible(EntityViewsRepository.Attribute.Properties.name)) {
				if (msg.getNewValue() != null) {
					attributePart.setName(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					attributePart.setName("");
				}
			}
			if (EntityPackage.eINSTANCE.getAttribute_Type().equals(
					msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (attributePart != null)
					&& this.isAccessible(EntityViewsRepository.Attribute.Properties.type)) {
				attributePart.setType(msg.getNewValue());
			}
			if (EntityPackage.eINSTANCE.getProperty_Multiplicity().equals(
					msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& this.isAccessible(EntityViewsRepository.Attribute.Properties.multiplicity)) {
				attributePart.setMultiplicity((MultiplicityKind) msg
						.getNewValue());
			}

			if (EntityPackage.eINSTANCE.getProperty_IsPrimaryKey().equals(
					msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (attributePart != null)
					&& this.isAccessible(EntityViewsRepository.Attribute.Properties.isPrimaryKey)) {
				attributePart.setIsPrimaryKey((Boolean) msg.getNewValue());
			}

			if (EnvironmentPackage.eINSTANCE.getObeoDSMObject_Description()
					.equals(msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (attributePart != null)
					&& this.isAccessible(EntityViewsRepository.Attribute.Properties.description)) {
				if (msg.getNewValue() != null) {
					attributePart.setDescription(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					attributePart.setDescription("");
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
				EntityPackage.eINSTANCE.getProperty_Name(),
				EntityPackage.eINSTANCE.getAttribute_Type(),
				EntityPackage.eINSTANCE.getProperty_Multiplicity(),
				EntityPackage.eINSTANCE.getProperty_IsPrimaryKey(),
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
		return (key == EntityViewsRepository.Attribute.Properties.name)
				|| (key == EntityViewsRepository.Attribute.Properties.type)
				|| (key == EntityViewsRepository.Attribute.Properties.multiplicity)
				|| (key == EntityViewsRepository.Attribute.Properties.isPrimaryKey);
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
				if (EntityViewsRepository.Attribute.Properties.name == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(
										EntityPackage.eINSTANCE
												.getProperty_Name()
												.getEAttributeType(),
										(String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							EntityPackage.eINSTANCE.getProperty_Name()
									.getEAttributeType(), newValue);
				}
				if (EntityViewsRepository.Attribute.Properties.multiplicity == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(EntityPackage.eINSTANCE
										.getProperty_Multiplicity()
										.getEAttributeType(), (String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							EntityPackage.eINSTANCE.getProperty_Multiplicity()
									.getEAttributeType(), newValue);
				}
				if (EntityViewsRepository.Attribute.Properties.isPrimaryKey == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(EntityPackage.eINSTANCE
										.getProperty_IsPrimaryKey()
										.getEAttributeType(), (String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							EntityPackage.eINSTANCE.getProperty_IsPrimaryKey()
									.getEAttributeType(), newValue);
				}
				if (EntityViewsRepository.Attribute.Properties.description == event
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
