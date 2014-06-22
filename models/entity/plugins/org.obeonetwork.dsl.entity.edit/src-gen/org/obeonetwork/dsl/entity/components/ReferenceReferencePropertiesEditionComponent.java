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
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.obeonetwork.dsl.entity.Entity;
import org.obeonetwork.dsl.entity.EntityFactory;
import org.obeonetwork.dsl.entity.EntityPackage;
import org.obeonetwork.dsl.entity.Reference;
import org.obeonetwork.dsl.entity.parts.EntityViewsRepository;
import org.obeonetwork.dsl.entity.parts.ReferencePropertiesEditionPart;
import org.obeonetwork.dsl.environment.EnvironmentPackage;
import org.obeonetwork.dsl.environment.MultiplicityKind;

// End of user code

/**
 * @author <a href="mailto:jerome.benois@obeo.fr>Jérôme Benois</a>
 * 
 */
public class ReferenceReferencePropertiesEditionComponent extends
		SinglePartPropertiesEditingComponent {

	public static String REFERENCE_PART = "Reference"; //$NON-NLS-1$

	/**
	 * Settings for type EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings typeSettings;

	/**
	 * Settings for oppositeOf EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings oppositeOfSettings;

	/**
	 * Default constructor
	 * 
	 */
	public ReferenceReferencePropertiesEditionComponent(
			final PropertiesEditingContext editingContext,
			final EObject reference, final String editing_mode) {
		super(editingContext, reference, editing_mode);
		this.parts = new String[] { REFERENCE_PART };
		this.repositoryKey = EntityViewsRepository.class;
		this.partKey = EntityViewsRepository.Reference.class;
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

			final Reference reference = (Reference) elt;
			final ReferencePropertiesEditionPart referencePart = (ReferencePropertiesEditionPart) this.editingPart;
			// init values
			if (this.isAccessible(EntityViewsRepository.Reference.Properties.name)) {
				referencePart.setName(EEFConverterUtil.convertToString(
						EcorePackage.Literals.ESTRING, reference.getName()));
			}

			if (this.isAccessible(EntityViewsRepository.Reference.Properties.type)) {
				// init part
				this.typeSettings = new EObjectFlatComboSettings(reference,
						EntityPackage.eINSTANCE.getReference_Type());
				referencePart.initType(this.typeSettings);
				// set the button mode
				referencePart.setTypeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (this.isAccessible(EntityViewsRepository.Reference.Properties.multiplicity)) {
				referencePart.initMultiplicity(EEFUtils.choiceOfValues(
						reference,
						EntityPackage.eINSTANCE.getProperty_Multiplicity()),
						reference.getMultiplicity());
			}
			if (this.isAccessible(EntityViewsRepository.Reference.Properties.isPrimaryKey)) {
				referencePart.setIsPrimaryKey(reference.isIsPrimaryKey());
			}
			if (this.isAccessible(EntityViewsRepository.Reference.Properties.isComposite)) {
				referencePart.setIsComposite(reference.isIsComposite());
			}
			if (this.isAccessible(EntityViewsRepository.Reference.Properties.navigable)) {
				referencePart.setNavigable(reference.isNavigable());
			}
			if (this.isAccessible(EntityViewsRepository.Reference.Properties.description)) {
				referencePart.setDescription(EcoreUtil.convertToString(
						EcorePackage.Literals.ESTRING,
						reference.getDescription()));
			}
			if (this.isAccessible(EntityViewsRepository.Reference.Properties.oppositeOf)) {
				// init part
				this.oppositeOfSettings = new EObjectFlatComboSettings(
						reference,
						EntityPackage.eINSTANCE.getReference_OppositeOf());
				referencePart.initOppositeOf(this.oppositeOfSettings);
				// set the button mode
				referencePart.setOppositeOfButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters

			if (this.isAccessible(EntityViewsRepository.Reference.Properties.oppositeOf)) {
				referencePart.addFilterToOppositeOf(new ViewerFilter() {

					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
					 *      java.lang.Object, java.lang.Object)
					 */
					@Override
					public boolean select(final Viewer viewer,
							final Object parentElement, final Object element) {
						return ((element instanceof String) && element
								.equals("")) || (element instanceof Reference); //$NON-NLS-1$ 
					}

				});
				// Start of user code for additional businessfilters for
				// oppositeOf
				// End of user code
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
		if (editorKey == EntityViewsRepository.Reference.Properties.name) {
			return EntityPackage.eINSTANCE.getProperty_Name();
		}
		if (editorKey == EntityViewsRepository.Reference.Properties.type) {
			return EntityPackage.eINSTANCE.getReference_Type();
		}
		if (editorKey == EntityViewsRepository.Reference.Properties.multiplicity) {
			return EntityPackage.eINSTANCE.getProperty_Multiplicity();
		}
		if (editorKey == EntityViewsRepository.Reference.Properties.isPrimaryKey) {
			return EntityPackage.eINSTANCE.getProperty_IsPrimaryKey();
		}
		if (editorKey == EntityViewsRepository.Reference.Properties.isComposite) {
			return EntityPackage.eINSTANCE.getReference_IsComposite();
		}
		if (editorKey == EntityViewsRepository.Reference.Properties.navigable) {
			return EntityPackage.eINSTANCE.getReference_Navigable();
		}
		if (editorKey == EntityViewsRepository.Reference.Properties.description) {
			return EnvironmentPackage.eINSTANCE.getObeoDSMObject_Description();
		}
		if (editorKey == EntityViewsRepository.Reference.Properties.oppositeOf) {
			return EntityPackage.eINSTANCE.getReference_OppositeOf();
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
		final Reference reference = (Reference) this.semanticObject;
		if (EntityViewsRepository.Reference.Properties.name == event
				.getAffectedEditor()) {
			reference.setName((java.lang.String) EEFConverterUtil
					.createFromString(EcorePackage.Literals.ESTRING,
							(String) event.getNewValue()));
		}
		if (EntityViewsRepository.Reference.Properties.type == event
				.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				this.typeSettings.setToReference(event.getNewValue());
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
				this.typeSettings.setToReference(eObject);
			}
		}
		if (EntityViewsRepository.Reference.Properties.multiplicity == event
				.getAffectedEditor()) {
			reference.setMultiplicity((MultiplicityKind) event.getNewValue());
		}
		if (EntityViewsRepository.Reference.Properties.isPrimaryKey == event
				.getAffectedEditor()) {
			reference.setIsPrimaryKey((Boolean) event.getNewValue());
		}
		if (EntityViewsRepository.Reference.Properties.isComposite == event
				.getAffectedEditor()) {
			reference.setIsComposite((Boolean) event.getNewValue());
		}
		if (EntityViewsRepository.Reference.Properties.navigable == event
				.getAffectedEditor()) {
			reference.setNavigable((Boolean) event.getNewValue());
		}
		if (EntityViewsRepository.Reference.Properties.description == event
				.getAffectedEditor()) {
			reference.setDescription((java.lang.String) EEFConverterUtil
					.createFromString(EcorePackage.Literals.ESTRING,
							(String) event.getNewValue()));
		}
		if (EntityViewsRepository.Reference.Properties.oppositeOf == event
				.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				this.oppositeOfSettings.setToReference(event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				final Reference eObject = EntityFactory.eINSTANCE
						.createReference();
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
				this.oppositeOfSettings.setToReference(eObject);
			}
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
			final ReferencePropertiesEditionPart referencePart = (ReferencePropertiesEditionPart) this.editingPart;
			if (EntityPackage.eINSTANCE.getProperty_Name().equals(
					msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (referencePart != null)
					&& this.isAccessible(EntityViewsRepository.Reference.Properties.name)) {
				if (msg.getNewValue() != null) {
					referencePart.setName(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					referencePart.setName("");
				}
			}
			if (EntityPackage.eINSTANCE.getReference_Type().equals(
					msg.getFeature())
					&& (referencePart != null)
					&& this.isAccessible(EntityViewsRepository.Reference.Properties.type)) {
				referencePart.setType((EObject) msg.getNewValue());
			}
			if (EntityPackage.eINSTANCE.getProperty_Multiplicity().equals(
					msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& this.isAccessible(EntityViewsRepository.Reference.Properties.multiplicity)) {
				referencePart.setMultiplicity((MultiplicityKind) msg
						.getNewValue());
			}

			if (EntityPackage.eINSTANCE.getProperty_IsPrimaryKey().equals(
					msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (referencePart != null)
					&& this.isAccessible(EntityViewsRepository.Reference.Properties.isPrimaryKey)) {
				referencePart.setIsPrimaryKey((Boolean) msg.getNewValue());
			}

			if (EntityPackage.eINSTANCE.getReference_IsComposite().equals(
					msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (referencePart != null)
					&& this.isAccessible(EntityViewsRepository.Reference.Properties.isComposite)) {
				referencePart.setIsComposite((Boolean) msg.getNewValue());
			}

			if (EntityPackage.eINSTANCE.getReference_Navigable().equals(
					msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (referencePart != null)
					&& this.isAccessible(EntityViewsRepository.Reference.Properties.navigable)) {
				referencePart.setNavigable((Boolean) msg.getNewValue());
			}

			if (EnvironmentPackage.eINSTANCE.getObeoDSMObject_Description()
					.equals(msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (referencePart != null)
					&& this.isAccessible(EntityViewsRepository.Reference.Properties.description)) {
				if (msg.getNewValue() != null) {
					referencePart.setDescription(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					referencePart.setDescription("");
				}
			}
			if (EntityPackage.eINSTANCE.getReference_OppositeOf().equals(
					msg.getFeature())
					&& (referencePart != null)
					&& this.isAccessible(EntityViewsRepository.Reference.Properties.oppositeOf)) {
				referencePart.setOppositeOf((EObject) msg.getNewValue());
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
				EntityPackage.eINSTANCE.getReference_Type(),
				EntityPackage.eINSTANCE.getProperty_Multiplicity(),
				EntityPackage.eINSTANCE.getProperty_IsPrimaryKey(),
				EntityPackage.eINSTANCE.getReference_IsComposite(),
				EntityPackage.eINSTANCE.getReference_Navigable(),
				EnvironmentPackage.eINSTANCE.getObeoDSMObject_Description(),
				EntityPackage.eINSTANCE.getReference_OppositeOf());
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
		return (key == EntityViewsRepository.Reference.Properties.name)
				|| (key == EntityViewsRepository.Reference.Properties.type)
				|| (key == EntityViewsRepository.Reference.Properties.multiplicity)
				|| (key == EntityViewsRepository.Reference.Properties.isPrimaryKey)
				|| (key == EntityViewsRepository.Reference.Properties.isComposite);
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
				if (EntityViewsRepository.Reference.Properties.name == event
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
				if (EntityViewsRepository.Reference.Properties.multiplicity == event
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
				if (EntityViewsRepository.Reference.Properties.isPrimaryKey == event
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
				if (EntityViewsRepository.Reference.Properties.isComposite == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(EntityPackage.eINSTANCE
										.getReference_IsComposite()
										.getEAttributeType(), (String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							EntityPackage.eINSTANCE.getReference_IsComposite()
									.getEAttributeType(), newValue);
				}
				if (EntityViewsRepository.Reference.Properties.navigable == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(EntityPackage.eINSTANCE
										.getReference_Navigable()
										.getEAttributeType(), (String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							EntityPackage.eINSTANCE.getReference_Navigable()
									.getEAttributeType(), newValue);
				}
				if (EntityViewsRepository.Reference.Properties.description == event
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
