/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.entityrelation.components;

// Start of user code for imports
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
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
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.settings.EEFEditorSettingsBuilder;
import org.eclipse.emf.eef.runtime.ui.widgets.settings.EEFEditorSettingsBuilder.EEFEditorSettingsImpl;
import org.eclipse.emf.eef.runtime.ui.widgets.settings.NavigationStepBuilder;
import org.obeonetwork.dsl.entityrelation.Attribute;
import org.obeonetwork.dsl.entityrelation.EntityRelationPackage;
import org.obeonetwork.dsl.entityrelation.parts.AttributePropertiesEditionPart;
import org.obeonetwork.dsl.entityrelation.parts.EntityrelationViewsRepository;
import org.obeonetwork.dsl.typeslibrary.NativeType;
import org.obeonetwork.dsl.typeslibrary.TypesLibraryPackage;

// End of user code

/**
 * 
 * 
 */
public class AttributePropertiesEditionComponent extends
		SinglePartPropertiesEditingComponent {

	public static String ATTRIBUTE_PART = "Attribute"; //$NON-NLS-1$

	/**
	 * Settings for type editor
	 */
	protected EEFEditorSettingsImpl typeSettings = (EEFEditorSettingsImpl) EEFEditorSettingsBuilder
			.create(this.semanticObject,
					TypesLibraryPackage.eINSTANCE.getTypeInstance_NativeType())
			.nextStep(
					NavigationStepBuilder
							.create(EntityRelationPackage.eINSTANCE
									.getAttribute_Type())
							.index(0)
							.discriminator(
									TypesLibraryPackage.Literals.TYPE_INSTANCE)
							.build()).build();

	/**
	 * Settings for length editor
	 */
	protected EEFEditorSettingsImpl lengthSettings = (EEFEditorSettingsImpl) EEFEditorSettingsBuilder
			.create(this.semanticObject,
					TypesLibraryPackage.eINSTANCE.getTypeInstance_Length())
			.nextStep(
					NavigationStepBuilder
							.create(EntityRelationPackage.eINSTANCE
									.getAttribute_Type())
							.index(0)
							.discriminator(
									TypesLibraryPackage.Literals.TYPE_INSTANCE)
							.build()).build();

	/**
	 * Settings for precision editor
	 */
	protected EEFEditorSettingsImpl precisionSettings = (EEFEditorSettingsImpl) EEFEditorSettingsBuilder
			.create(this.semanticObject,
					TypesLibraryPackage.eINSTANCE.getTypeInstance_Precision())
			.nextStep(
					NavigationStepBuilder
							.create(EntityRelationPackage.eINSTANCE
									.getAttribute_Type())
							.index(0)
							.discriminator(
									TypesLibraryPackage.Literals.TYPE_INSTANCE)
							.build()).build();

	/**
	 * Settings for literals editor
	 */
	protected EEFEditorSettingsImpl literalsSettings = (EEFEditorSettingsImpl) EEFEditorSettingsBuilder
			.create(this.semanticObject,
					TypesLibraryPackage.eINSTANCE.getTypeInstance_Literals())
			.nextStep(
					NavigationStepBuilder
							.create(EntityRelationPackage.eINSTANCE
									.getAttribute_Type())
							.index(0)
							.discriminator(
									TypesLibraryPackage.Literals.TYPE_INSTANCE)
							.build()).build();

	/**
	 * Default constructor
	 * 
	 */
	public AttributePropertiesEditionComponent(
			final PropertiesEditingContext editingContext,
			final EObject attribute, final String editing_mode) {
		super(editingContext, attribute, editing_mode);
		this.parts = new String[] { ATTRIBUTE_PART };
		this.repositoryKey = EntityrelationViewsRepository.class;
		this.partKey = EntityrelationViewsRepository.Attribute.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object,
	 *      int, org.eclipse.emf.ecore.EObject,
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	@Override
	public void initPart(final Object key, final int kind, final EObject elt,
			final ResourceSet allResource) {
		this.setInitializing(true);
		if ((this.editingPart != null) && (key == this.partKey)) {
			this.editingPart.setContext(elt, allResource);
			if (this.editingPart instanceof CompositePropertiesEditionPart) {
				((CompositePropertiesEditionPart) this.editingPart)
						.getSettings().add(this.typeSettings);
				((CompositePropertiesEditionPart) this.editingPart)
						.getSettings().add(this.lengthSettings);
				((CompositePropertiesEditionPart) this.editingPart)
						.getSettings().add(this.precisionSettings);
				((CompositePropertiesEditionPart) this.editingPart)
						.getSettings().add(this.literalsSettings);
			}
			final Attribute attribute = (Attribute) elt;
			final AttributePropertiesEditionPart attributePart = (AttributePropertiesEditionPart) this.editingPart;
			// init values
			if (this.isAccessible(EntityrelationViewsRepository.Attribute.Properties.name)) {
				attributePart.setName(EEFConverterUtil.convertToString(
						EcorePackage.Literals.ESTRING, attribute.getName()));
			}

			if (this.isAccessible(EntityrelationViewsRepository.Attribute.Properties.RequiredAndIdentifier.required)) {
				attributePart.setRequired(attribute.isRequired());
			}
			if (this.isAccessible(EntityrelationViewsRepository.Attribute.Properties.RequiredAndIdentifier.inPrimaryIdentifier)) {
				attributePart.setInPrimaryIdentifier(attribute
						.isInPrimaryIdentifier());
			}
			if (this.isAccessible(EntityrelationViewsRepository.Attribute.Properties.comments)) {
				attributePart
						.setComments(EcoreUtil.convertToString(
								EcorePackage.Literals.ESTRING,
								attribute.getComments()));
			}
			if ((this.typeSettings.getSignificantObject() != null)
					&& this.isAccessible(EntityrelationViewsRepository.Attribute.Properties.type)) {
				attributePart.initType(EEFUtils.choiceOfValues(
						this.typeSettings.getSignificantObject(),
						TypesLibraryPackage.eINSTANCE
								.getTypeInstance_NativeType()),
						this.typeSettings.getValue());
			}
			if ((this.lengthSettings.getValue() != null)
					&& this.isAccessible(EntityrelationViewsRepository.Attribute.Properties.TypeAttributes.length)) {
				attributePart.setLength(EEFConverterUtil.convertToString(
						EcorePackage.Literals.EINTEGER_OBJECT,
						this.lengthSettings.getValue()));
			}

			if ((this.precisionSettings.getValue() != null)
					&& this.isAccessible(EntityrelationViewsRepository.Attribute.Properties.TypeAttributes.precision)) {
				attributePart.setPrecision(EEFConverterUtil.convertToString(
						EcorePackage.Literals.EINTEGER_OBJECT,
						this.precisionSettings.getValue()));
			}

			if ((this.literalsSettings.getSignificantObject() != null)
					&& this.isAccessible(EntityrelationViewsRepository.Attribute.Properties.literals)) {
				attributePart.setLiterals((EList<?>) this.literalsSettings
						.getValue());
			}
			// init filters

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
	 * @see org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent#shouldProcess(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 */
	@Override
	protected boolean shouldProcess(final IPropertiesEditionEvent event) {
		if (event.getAffectedEditor() == EntityrelationViewsRepository.Attribute.Properties.type) {
			return (this.typeSettings.getValue() == null) ? (event
					.getNewValue() != null) : (!this.typeSettings.getValue()
					.equals(event.getNewValue()));
		}
		if (event.getAffectedEditor() == EntityrelationViewsRepository.Attribute.Properties.TypeAttributes.length) {
			return (this.lengthSettings.getValue() == null) ? (event
					.getNewValue() != null) : (!this.lengthSettings.getValue()
					.equals(event.getNewValue()));
		}
		if (event.getAffectedEditor() == EntityrelationViewsRepository.Attribute.Properties.TypeAttributes.precision) {
			return (this.precisionSettings.getValue() == null) ? (event
					.getNewValue() != null) : (!this.precisionSettings
					.getValue().equals(event.getNewValue()));
		}
		if (event.getAffectedEditor() == EntityrelationViewsRepository.Attribute.Properties.literals) {
			return (this.literalsSettings.getValue() == null) ? (event
					.getNewValue() != null) : (!this.literalsSettings
					.getValue().equals(event.getNewValue()));
		}
		return super.shouldProcess(event);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	@Override
	public EStructuralFeature associatedFeature(final Object editorKey) {
		if (editorKey == EntityrelationViewsRepository.Attribute.Properties.name) {
			return EntityRelationPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == EntityrelationViewsRepository.Attribute.Properties.RequiredAndIdentifier.required) {
			return EntityRelationPackage.eINSTANCE.getAttribute_Required();
		}
		if (editorKey == EntityrelationViewsRepository.Attribute.Properties.RequiredAndIdentifier.inPrimaryIdentifier) {
			return EntityRelationPackage.eINSTANCE
					.getAttribute_InPrimaryIdentifier();
		}
		if (editorKey == EntityrelationViewsRepository.Attribute.Properties.comments) {
			return EntityRelationPackage.eINSTANCE.getLogicalElement_Comments();
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
		if (EntityrelationViewsRepository.Attribute.Properties.name == event
				.getAffectedEditor()) {
			attribute.setName((java.lang.String) EEFConverterUtil
					.createFromString(EcorePackage.Literals.ESTRING,
							(String) event.getNewValue()));
		}
		if (EntityrelationViewsRepository.Attribute.Properties.RequiredAndIdentifier.required == event
				.getAffectedEditor()) {
			attribute.setRequired((Boolean) event.getNewValue());
		}
		if (EntityrelationViewsRepository.Attribute.Properties.comments == event
				.getAffectedEditor()) {
			attribute.setComments((java.lang.String) EEFConverterUtil
					.createFromString(EcorePackage.Literals.ESTRING,
							(String) event.getNewValue()));
		}
		if (EntityrelationViewsRepository.Attribute.Properties.type == event
				.getAffectedEditor()) {
			this.typeSettings
					.setValue(!"".equals(event.getNewValue()) ? (NativeType) event
							.getNewValue() : null);
		}
		if (EntityrelationViewsRepository.Attribute.Properties.TypeAttributes.length == event
				.getAffectedEditor()) {
			this.lengthSettings.setValue(EEFConverterUtil.createFromString(
					EcorePackage.Literals.EINTEGER_OBJECT,
					(String) event.getNewValue()));
		}
		if (EntityrelationViewsRepository.Attribute.Properties.TypeAttributes.precision == event
				.getAffectedEditor()) {
			this.precisionSettings.setValue(EEFConverterUtil.createFromString(
					EcorePackage.Literals.EINTEGER_OBJECT,
					(String) event.getNewValue()));
		}
		if (EntityrelationViewsRepository.Attribute.Properties.literals == event
				.getAffectedEditor()) {
			this.literalsSettings.setValue(event.getNewValue());
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
			if (EntityRelationPackage.eINSTANCE.getNamedElement_Name().equals(
					msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (attributePart != null)
					&& this.isAccessible(EntityrelationViewsRepository.Attribute.Properties.name)) {
				if (msg.getNewValue() != null) {
					attributePart.setName(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					attributePart.setName("");
				}
			}
			if (EntityRelationPackage.eINSTANCE.getAttribute_Required().equals(
					msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (attributePart != null)
					&& this.isAccessible(EntityrelationViewsRepository.Attribute.Properties.RequiredAndIdentifier.required)) {
				attributePart.setRequired((Boolean) msg.getNewValue());
			}

			if (EntityRelationPackage.eINSTANCE
					.getAttribute_InPrimaryIdentifier()
					.equals(msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (attributePart != null)
					&& this.isAccessible(EntityrelationViewsRepository.Attribute.Properties.RequiredAndIdentifier.inPrimaryIdentifier)) {
				attributePart.setInPrimaryIdentifier((Boolean) msg
						.getNewValue());
			}

			if (EntityRelationPackage.eINSTANCE.getLogicalElement_Comments()
					.equals(msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (attributePart != null)
					&& this.isAccessible(EntityrelationViewsRepository.Attribute.Properties.comments)) {
				if (msg.getNewValue() != null) {
					attributePart.setComments(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					attributePart.setComments("");
				}
			}
			if (this.typeSettings.isAffectingEvent(msg)
					&& (attributePart != null)
					&& this.isAccessible(EntityrelationViewsRepository.Attribute.Properties.type)) {
				attributePart.setType(msg.getNewValue());
			}
			if (!(msg.getNewValue() instanceof EObject)
					&& this.lengthSettings.isAffectingEvent(msg)
					&& (attributePart != null)
					&& this.isAccessible(EntityrelationViewsRepository.Attribute.Properties.TypeAttributes.length)) {
				if (msg.getNewValue() != null) {
					attributePart.setLength(EcoreUtil.convertToString(
							EcorePackage.Literals.EINTEGER_OBJECT,
							msg.getNewValue()));
				} else {
					attributePart.setLength("");
				}
			}
			if (!(msg.getNewValue() instanceof EObject)
					&& this.precisionSettings.isAffectingEvent(msg)
					&& (attributePart != null)
					&& this.isAccessible(EntityrelationViewsRepository.Attribute.Properties.TypeAttributes.precision)) {
				if (msg.getNewValue() != null) {
					attributePart.setPrecision(EcoreUtil.convertToString(
							EcorePackage.Literals.EINTEGER_OBJECT,
							msg.getNewValue()));
				} else {
					attributePart.setPrecision("");
				}
			}
			if (this.literalsSettings.isAffectingEvent(msg)
					&& (attributePart != null)
					&& this.isAccessible(EntityrelationViewsRepository.Attribute.Properties.literals)) {
				if (msg.getNewValue() instanceof EList<?>) {
					attributePart.setLiterals((EList<?>) msg.getNewValue());
				} else if (msg.getNewValue() == null) {
					attributePart.setLiterals(new BasicEList<Object>());
				} else {
					final BasicEList<Object> newValueAsList = new BasicEList<Object>();
					newValueAsList.add(msg.getNewValue());
					attributePart.setLiterals(newValueAsList);
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
				EntityRelationPackage.eINSTANCE.getNamedElement_Name(),
				EntityRelationPackage.eINSTANCE.getAttribute_Required(),
				EntityRelationPackage.eINSTANCE
						.getAttribute_InPrimaryIdentifier(),
				EntityRelationPackage.eINSTANCE.getLogicalElement_Comments(),
				TypesLibraryPackage.eINSTANCE.getTypeInstance_NativeType(),
				TypesLibraryPackage.eINSTANCE.getTypeInstance_Length(),
				TypesLibraryPackage.eINSTANCE.getTypeInstance_Precision(),
				TypesLibraryPackage.eINSTANCE.getTypeInstance_Literals());
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
		return key == EntityrelationViewsRepository.Attribute.Properties.type;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	@Override
	public Diagnostic validateValue(final IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (EntityrelationViewsRepository.Attribute.Properties.name == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(
										EntityRelationPackage.eINSTANCE
												.getNamedElement_Name()
												.getEAttributeType(),
										(String) newValue);
					}
					ret = Diagnostician.INSTANCE
							.validate(
									EntityRelationPackage.eINSTANCE
											.getNamedElement_Name()
											.getEAttributeType(), newValue);
				}
				if (EntityrelationViewsRepository.Attribute.Properties.RequiredAndIdentifier.required == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(
										EntityRelationPackage.eINSTANCE
												.getAttribute_Required()
												.getEAttributeType(),
										(String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							EntityRelationPackage.eINSTANCE
									.getAttribute_Required()
									.getEAttributeType(), newValue);
				}
				if (EntityrelationViewsRepository.Attribute.Properties.RequiredAndIdentifier.inPrimaryIdentifier == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(
										EntityRelationPackage.eINSTANCE
												.getAttribute_InPrimaryIdentifier()
												.getEAttributeType(),
										(String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							EntityRelationPackage.eINSTANCE
									.getAttribute_InPrimaryIdentifier()
									.getEAttributeType(), newValue);
				}
				if (EntityrelationViewsRepository.Attribute.Properties.comments == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(
										EntityRelationPackage.eINSTANCE
												.getLogicalElement_Comments()
												.getEAttributeType(),
										(String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							EntityRelationPackage.eINSTANCE
									.getLogicalElement_Comments()
									.getEAttributeType(), newValue);
				}
				if (EntityrelationViewsRepository.Attribute.Properties.TypeAttributes.length == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(TypesLibraryPackage.eINSTANCE
										.getTypeInstance_Length()
										.getEAttributeType(), (String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							TypesLibraryPackage.eINSTANCE
									.getTypeInstance_Length()
									.getEAttributeType(), newValue);
				}
				if (EntityrelationViewsRepository.Attribute.Properties.TypeAttributes.precision == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(TypesLibraryPackage.eINSTANCE
										.getTypeInstance_Precision()
										.getEAttributeType(), (String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							TypesLibraryPackage.eINSTANCE
									.getTypeInstance_Precision()
									.getEAttributeType(), newValue);
				}
				if (EntityrelationViewsRepository.Attribute.Properties.literals == event
						.getAffectedEditor()) {
					final BasicDiagnostic chain = new BasicDiagnostic();
					for (final Iterator iterator = ((List) event.getNewValue())
							.iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(
								TypesLibraryPackage.eINSTANCE
										.getTypeInstance_Literals()
										.getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
			} catch (final IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (final WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

	/**
	 * @ return settings for type editor
	 */
	public EEFEditorSettingsImpl getTypeSettings() {
		return this.typeSettings;
	}

	/**
	 * @ return settings for length editor
	 */
	public EEFEditorSettingsImpl getLengthSettings() {
		return this.lengthSettings;
	}

	/**
	 * @ return settings for precision editor
	 */
	public EEFEditorSettingsImpl getPrecisionSettings() {
		return this.precisionSettings;
	}

	/**
	 * @ return settings for literals editor
	 */
	public EEFEditorSettingsImpl getLiteralsSettings() {
		return this.literalsSettings;
	}

}
