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
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.obeonetwork.dsl.entity.Attribute;
import org.obeonetwork.dsl.entity.EntityFactory;
import org.obeonetwork.dsl.entity.EntityPackage;
import org.obeonetwork.dsl.entity.InternalCriterion;
import org.obeonetwork.dsl.entity.parts.EntityViewsRepository;
import org.obeonetwork.dsl.entity.parts.InternalCriterionPropertiesEditionPart;
import org.obeonetwork.dsl.environment.EnvironmentPackage;

// End of user code

/**
 * @author <a href="mailto:jerome.benois@obeo.fr>Jérôme Benois</a>
 * 
 */
public class InternalCriterionInternalCriterionPropertiesEditionComponent
		extends SinglePartPropertiesEditingComponent {

	public static String INTERNALCRITERION_PART = "InternalCriterion"; //$NON-NLS-1$

	/**
	 * Settings for target EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings targetSettings;

	/**
	 * Default constructor
	 * 
	 */
	public InternalCriterionInternalCriterionPropertiesEditionComponent(
			final PropertiesEditingContext editingContext,
			final EObject internalCriterion, final String editing_mode) {
		super(editingContext, internalCriterion, editing_mode);
		this.parts = new String[] { INTERNALCRITERION_PART };
		this.repositoryKey = EntityViewsRepository.class;
		this.partKey = EntityViewsRepository.InternalCriterion.class;
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

			final InternalCriterion internalCriterion = (InternalCriterion) elt;
			final InternalCriterionPropertiesEditionPart internalCriterionPart = (InternalCriterionPropertiesEditionPart) this.editingPart;
			// init values
			if (this.isAccessible(EntityViewsRepository.InternalCriterion.Properties.target)) {
				// init part
				this.targetSettings = new EObjectFlatComboSettings(
						internalCriterion,
						EntityPackage.eINSTANCE.getInternalCriterion_Target());
				internalCriterionPart.initTarget(this.targetSettings);
				// set the button mode
				internalCriterionPart
						.setTargetButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (this.isAccessible(EntityViewsRepository.InternalCriterion.Properties.description)) {
				internalCriterionPart.setDescription(EcoreUtil.convertToString(
						EcorePackage.Literals.ESTRING,
						internalCriterion.getDescription()));
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
		if (editorKey == EntityViewsRepository.InternalCriterion.Properties.target) {
			return EntityPackage.eINSTANCE.getInternalCriterion_Target();
		}
		if (editorKey == EntityViewsRepository.InternalCriterion.Properties.description) {
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
		final InternalCriterion internalCriterion = (InternalCriterion) this.semanticObject;
		if (EntityViewsRepository.InternalCriterion.Properties.target == event
				.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				this.targetSettings.setToReference(event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				final Attribute eObject = EntityFactory.eINSTANCE
						.createAttribute();
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
				this.targetSettings.setToReference(eObject);
			}
		}
		if (EntityViewsRepository.InternalCriterion.Properties.description == event
				.getAffectedEditor()) {
			internalCriterion
					.setDescription((java.lang.String) EEFConverterUtil
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
			final InternalCriterionPropertiesEditionPart internalCriterionPart = (InternalCriterionPropertiesEditionPart) this.editingPart;
			if (EntityPackage.eINSTANCE.getInternalCriterion_Target().equals(
					msg.getFeature())
					&& (internalCriterionPart != null)
					&& this.isAccessible(EntityViewsRepository.InternalCriterion.Properties.target)) {
				internalCriterionPart.setTarget((EObject) msg.getNewValue());
			}
			if (EnvironmentPackage.eINSTANCE.getObeoDSMObject_Description()
					.equals(msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (internalCriterionPart != null)
					&& this.isAccessible(EntityViewsRepository.InternalCriterion.Properties.description)) {
				if (msg.getNewValue() != null) {
					internalCriterionPart.setDescription(EcoreUtil
							.convertToString(EcorePackage.Literals.ESTRING,
									msg.getNewValue()));
				} else {
					internalCriterionPart.setDescription("");
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
				EntityPackage.eINSTANCE.getInternalCriterion_Target(),
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
		return key == EntityViewsRepository.InternalCriterion.Properties.target;
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
				if (EntityViewsRepository.InternalCriterion.Properties.description == event
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
