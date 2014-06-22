/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.entityrelation.components;

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
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.settings.EEFEditorSettingsBuilder;
import org.eclipse.emf.eef.runtime.ui.widgets.settings.EEFEditorSettingsBuilder.EEFEditorSettingsImpl;
import org.eclipse.emf.eef.runtime.ui.widgets.settings.NavigationStepBuilder;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.obeonetwork.dsl.entityrelation.Attribute;
import org.obeonetwork.dsl.entityrelation.EntityRelationFactory;
import org.obeonetwork.dsl.entityrelation.EntityRelationPackage;
import org.obeonetwork.dsl.entityrelation.RelationElement;
import org.obeonetwork.dsl.entityrelation.parts.EntityrelationViewsRepository;
import org.obeonetwork.dsl.entityrelation.parts.RelationElementPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class RelationElementPropertiesEditionComponent extends
		SinglePartPropertiesEditingComponent {

	public static String RELATIONELEMENT_PART = "Relation Element"; //$NON-NLS-1$

	/**
	 * Settings for sourceAttribute EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings sourceAttributeSettings;

	/**
	 * Settings for targetAttribute EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings targetAttributeSettings;

	/**
	 * Settings for sourceEntity editor
	 */
	protected EEFEditorSettingsImpl sourceEntitySettings = (EEFEditorSettingsImpl) EEFEditorSettingsBuilder
			.create(this.semanticObject,
					EntityRelationPackage.eINSTANCE.getNamedElement_Name())
			.nextStep(
					NavigationStepBuilder
							.create(EntityRelationPackage.eINSTANCE
									.getRelationElement_SourceAttribute())
							.index(0).build())
			.nextStep(
					NavigationStepBuilder
							.create(EntityRelationPackage.eINSTANCE
									.getAttribute_Owner()).index(0).build())
			.build();

	/**
	 * Settings for targetEntity editor
	 */
	protected EEFEditorSettingsImpl targetEntitySettings = (EEFEditorSettingsImpl) EEFEditorSettingsBuilder
			.create(this.semanticObject,
					EntityRelationPackage.eINSTANCE.getNamedElement_Name())
			.nextStep(
					NavigationStepBuilder
							.create(EntityRelationPackage.eINSTANCE
									.getRelationElement_SourceAttribute())
							.index(0).build())
			.nextStep(
					NavigationStepBuilder
							.create(EntityRelationPackage.eINSTANCE
									.getAttribute_Owner()).index(0).build())
			.build();

	/**
	 * Default constructor
	 * 
	 */
	public RelationElementPropertiesEditionComponent(
			final PropertiesEditingContext editingContext,
			final EObject relationElement, final String editing_mode) {
		super(editingContext, relationElement, editing_mode);
		this.parts = new String[] { RELATIONELEMENT_PART };
		this.repositoryKey = EntityrelationViewsRepository.class;
		this.partKey = EntityrelationViewsRepository.RelationElement.class;
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
						.getSettings().add(this.sourceEntitySettings);
				((CompositePropertiesEditionPart) this.editingPart)
						.getSettings().add(this.targetEntitySettings);
			}
			final RelationElement relationElement = (RelationElement) elt;
			final RelationElementPropertiesEditionPart relationElementPart = (RelationElementPropertiesEditionPart) this.editingPart;
			// init values
			if ((this.sourceEntitySettings.getValue() != null)
					&& this.isAccessible(EntityrelationViewsRepository.RelationElement.Properties.sourceEntity)) {
				relationElementPart.setSourceEntity(EEFConverterUtil
						.convertToString(EcorePackage.Literals.ESTRING,
								this.sourceEntitySettings.getValue()));
			}

			if (this.isAccessible(EntityrelationViewsRepository.RelationElement.Properties.sourceAttribute)) {
				// init part
				this.sourceAttributeSettings = new EObjectFlatComboSettings(
						relationElement,
						EntityRelationPackage.eINSTANCE
								.getRelationElement_SourceAttribute());
				relationElementPart
						.initSourceAttribute(this.sourceAttributeSettings);
				// set the button mode
				relationElementPart
						.setSourceAttributeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if ((this.targetEntitySettings.getValue() != null)
					&& this.isAccessible(EntityrelationViewsRepository.RelationElement.Properties.targetEntity)) {
				relationElementPart.setTargetEntity(EEFConverterUtil
						.convertToString(EcorePackage.Literals.ESTRING,
								this.targetEntitySettings.getValue()));
			}

			if (this.isAccessible(EntityrelationViewsRepository.RelationElement.Properties.targetAttribute)) {
				// init part
				this.targetAttributeSettings = new EObjectFlatComboSettings(
						relationElement,
						EntityRelationPackage.eINSTANCE
								.getRelationElement_TargetAttribute());
				relationElementPart
						.initTargetAttribute(this.targetAttributeSettings);
				// set the button mode
				relationElementPart
						.setTargetAttributeButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (this.isAccessible(EntityrelationViewsRepository.RelationElement.Properties.comments)) {
				relationElementPart.setComments(EcoreUtil.convertToString(
						EcorePackage.Literals.ESTRING,
						relationElement.getComments()));
				// init filters
			}

			if (this.isAccessible(EntityrelationViewsRepository.RelationElement.Properties.sourceAttribute)) {
				relationElementPart
						.addFilterToSourceAttribute(new ViewerFilter() {

							/**
							 * {@inheritDoc}
							 * 
							 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
							 *      java.lang.Object, java.lang.Object)
							 */
							@Override
							public boolean select(final Viewer viewer,
									final Object parentElement,
									final Object element) {
								return ((element instanceof String) && element
										.equals("")) || (element instanceof Attribute); //$NON-NLS-1$ 
							}

						});
				// Start of user code for additional businessfilters for
				// sourceAttribute
				// End of user code
			}

			if (this.isAccessible(EntityrelationViewsRepository.RelationElement.Properties.targetAttribute)) {
				relationElementPart
						.addFilterToTargetAttribute(new ViewerFilter() {

							/**
							 * {@inheritDoc}
							 * 
							 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
							 *      java.lang.Object, java.lang.Object)
							 */
							@Override
							public boolean select(final Viewer viewer,
									final Object parentElement,
									final Object element) {
								return ((element instanceof String) && element
										.equals("")) || (element instanceof Attribute); //$NON-NLS-1$ 
							}

						});
				// Start of user code for additional businessfilters for
				// targetAttribute
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
	 * @see org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent#shouldProcess(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 */
	@Override
	protected boolean shouldProcess(final IPropertiesEditionEvent event) {
		if (event.getAffectedEditor() == EntityrelationViewsRepository.RelationElement.Properties.sourceEntity) {
			return (this.sourceEntitySettings.getValue() == null) ? (event
					.getNewValue() != null) : (!this.sourceEntitySettings
					.getValue().equals(event.getNewValue()));
		}
		if (event.getAffectedEditor() == EntityrelationViewsRepository.RelationElement.Properties.targetEntity) {
			return (this.targetEntitySettings.getValue() == null) ? (event
					.getNewValue() != null) : (!this.targetEntitySettings
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
		if (editorKey == EntityrelationViewsRepository.RelationElement.Properties.sourceAttribute) {
			return EntityRelationPackage.eINSTANCE
					.getRelationElement_SourceAttribute();
		}
		if (editorKey == EntityrelationViewsRepository.RelationElement.Properties.targetAttribute) {
			return EntityRelationPackage.eINSTANCE
					.getRelationElement_TargetAttribute();
		}
		if (editorKey == EntityrelationViewsRepository.RelationElement.Properties.comments) {
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
		final RelationElement relationElement = (RelationElement) this.semanticObject;
		if (EntityrelationViewsRepository.RelationElement.Properties.sourceAttribute == event
				.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				this.sourceAttributeSettings
						.setToReference(event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				final Attribute eObject = EntityRelationFactory.eINSTANCE
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
				this.sourceAttributeSettings.setToReference(eObject);
			}
		}
		if (EntityrelationViewsRepository.RelationElement.Properties.targetAttribute == event
				.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				this.targetAttributeSettings
						.setToReference(event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				final Attribute eObject = EntityRelationFactory.eINSTANCE
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
				this.targetAttributeSettings.setToReference(eObject);
			}
		}
		if (EntityrelationViewsRepository.RelationElement.Properties.comments == event
				.getAffectedEditor()) {
			relationElement.setComments((java.lang.String) EEFConverterUtil
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
			final RelationElementPropertiesEditionPart relationElementPart = (RelationElementPropertiesEditionPart) this.editingPart;
			if (!(msg.getNewValue() instanceof EObject)
					&& this.sourceEntitySettings.isAffectingEvent(msg)
					&& (relationElementPart != null)
					&& this.isAccessible(EntityrelationViewsRepository.RelationElement.Properties.sourceEntity)) {
				if (msg.getNewValue() != null) {
					relationElementPart.setSourceEntity(EcoreUtil
							.convertToString(EcorePackage.Literals.ESTRING,
									msg.getNewValue()));
				} else {
					relationElementPart.setSourceEntity("");
				}
			}
			if (EntityRelationPackage.eINSTANCE
					.getRelationElement_SourceAttribute().equals(
							msg.getFeature())
					&& (relationElementPart != null)
					&& this.isAccessible(EntityrelationViewsRepository.RelationElement.Properties.sourceAttribute)) {
				relationElementPart.setSourceAttribute((EObject) msg
						.getNewValue());
			}
			if (!(msg.getNewValue() instanceof EObject)
					&& this.targetEntitySettings.isAffectingEvent(msg)
					&& (relationElementPart != null)
					&& this.isAccessible(EntityrelationViewsRepository.RelationElement.Properties.targetEntity)) {
				if (msg.getNewValue() != null) {
					relationElementPart.setTargetEntity(EcoreUtil
							.convertToString(EcorePackage.Literals.ESTRING,
									msg.getNewValue()));
				} else {
					relationElementPart.setTargetEntity("");
				}
			}
			if (EntityRelationPackage.eINSTANCE
					.getRelationElement_TargetAttribute().equals(
							msg.getFeature())
					&& (relationElementPart != null)
					&& this.isAccessible(EntityrelationViewsRepository.RelationElement.Properties.targetAttribute)) {
				relationElementPart.setTargetAttribute((EObject) msg
						.getNewValue());
			}
			if (EntityRelationPackage.eINSTANCE.getLogicalElement_Comments()
					.equals(msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (relationElementPart != null)
					&& this.isAccessible(EntityrelationViewsRepository.RelationElement.Properties.comments)) {
				if (msg.getNewValue() != null) {
					relationElementPart.setComments(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					relationElementPart.setComments("");
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
				EntityRelationPackage.eINSTANCE
						.getRelationElement_SourceAttribute(),
				EntityRelationPackage.eINSTANCE.getNamedElement_Name(),
				EntityRelationPackage.eINSTANCE
						.getRelationElement_TargetAttribute(),
				EntityRelationPackage.eINSTANCE.getLogicalElement_Comments());
		return new NotificationFilter[] { filter, };
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
				if (EntityrelationViewsRepository.RelationElement.Properties.sourceEntity == event
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
				if (EntityrelationViewsRepository.RelationElement.Properties.targetEntity == event
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
				if (EntityrelationViewsRepository.RelationElement.Properties.comments == event
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
			} catch (final IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (final WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

	/**
	 * @ return settings for sourceEntity editor
	 */
	public EEFEditorSettingsImpl getSourceEntitySettings() {
		return this.sourceEntitySettings;
	}

	/**
	 * @ return settings for targetEntity editor
	 */
	public EEFEditorSettingsImpl getTargetEntitySettings() {
		return this.targetEntitySettings;
	}

}
