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
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.obeonetwork.dsl.entityrelation.Cardinality;
import org.obeonetwork.dsl.entityrelation.Entity;
import org.obeonetwork.dsl.entityrelation.EntityRelationFactory;
import org.obeonetwork.dsl.entityrelation.EntityRelationPackage;
import org.obeonetwork.dsl.entityrelation.Identifier;
import org.obeonetwork.dsl.entityrelation.Relation;
import org.obeonetwork.dsl.entityrelation.RelationElement;
import org.obeonetwork.dsl.entityrelation.parts.EntityrelationViewsRepository;
import org.obeonetwork.dsl.entityrelation.parts.RelationPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class RelationPropertiesEditionComponent extends
		SinglePartPropertiesEditingComponent {

	public static String RELATION_PART = "Relation"; //$NON-NLS-1$

	/**
	 * Settings for source EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings sourceSettings;

	/**
	 * Settings for target EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings targetSettings;

	/**
	 * Settings for elements ReferencesTable
	 */
	protected ReferencesTableSettings elementsSettings;

	/**
	 * Settings for identifier EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings identifierSettings;

	/**
	 * Default constructor
	 * 
	 */
	public RelationPropertiesEditionComponent(
			final PropertiesEditingContext editingContext,
			final EObject relation, final String editing_mode) {
		super(editingContext, relation, editing_mode);
		this.parts = new String[] { RELATION_PART };
		this.repositoryKey = EntityrelationViewsRepository.class;
		this.partKey = EntityrelationViewsRepository.Relation.class;
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

			final Relation relation = (Relation) elt;
			final RelationPropertiesEditionPart relationPart = (RelationPropertiesEditionPart) this.editingPart;
			// init values
			if (this.isAccessible(EntityrelationViewsRepository.Relation.Properties.comments)) {
				relationPart.setComments(EcoreUtil.convertToString(
						EcorePackage.Literals.ESTRING, relation.getComments()));
			}
			if (this.isAccessible(EntityrelationViewsRepository.Relation.Properties.name)) {
				relationPart.setName(EEFConverterUtil.convertToString(
						EcorePackage.Literals.ESTRING, relation.getName()));
			}

			if (this.isAccessible(EntityrelationViewsRepository.Relation.Properties.Source.source_)) {
				// init part
				this.sourceSettings = new EObjectFlatComboSettings(relation,
						EntityRelationPackage.eINSTANCE.getRelation_Source());
				relationPart.initSource(this.sourceSettings);
				// set the button mode
				relationPart.setSourceButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (this.isAccessible(EntityrelationViewsRepository.Relation.Properties.Source.sourceRole)) {
				relationPart
						.setSourceRole(EEFConverterUtil.convertToString(
								EcorePackage.Literals.ESTRING,
								relation.getSourceRole()));
			}

			if (this.isAccessible(EntityrelationViewsRepository.Relation.Properties.Source.sourceCardinality)) {
				relationPart.initSourceCardinality(EEFUtils.choiceOfValues(
						relation, EntityRelationPackage.eINSTANCE
								.getRelation_SourceCardinality()), relation
						.getSourceCardinality());
			}
			if (this.isAccessible(EntityrelationViewsRepository.Relation.Properties.Source.sourceIsComposite)) {
				relationPart.setSourceIsComposite(relation
						.isSourceIsComposite());
			}
			if (this.isAccessible(EntityrelationViewsRepository.Relation.Properties.Target.target_)) {
				// init part
				this.targetSettings = new EObjectFlatComboSettings(relation,
						EntityRelationPackage.eINSTANCE.getRelation_Target());
				relationPart.initTarget(this.targetSettings);
				// set the button mode
				relationPart.setTargetButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (this.isAccessible(EntityrelationViewsRepository.Relation.Properties.Target.targetRole)) {
				relationPart
						.setTargetRole(EEFConverterUtil.convertToString(
								EcorePackage.Literals.ESTRING,
								relation.getTargetRole()));
			}

			if (this.isAccessible(EntityrelationViewsRepository.Relation.Properties.Target.targetCardinality)) {
				relationPart.initTargetCardinality(EEFUtils.choiceOfValues(
						relation, EntityRelationPackage.eINSTANCE
								.getRelation_TargetCardinality()), relation
						.getTargetCardinality());
			}
			if (this.isAccessible(EntityrelationViewsRepository.Relation.Properties.Target.targetIsComposite)) {
				relationPart.setTargetIsComposite(relation
						.isTargetIsComposite());
			}
			if (this.isAccessible(EntityrelationViewsRepository.Relation.Properties.elements)) {
				this.elementsSettings = new ReferencesTableSettings(relation,
						EntityRelationPackage.eINSTANCE.getRelation_Elements());
				relationPart.initElements(this.elementsSettings);
			}
			if (this.isAccessible(EntityrelationViewsRepository.Relation.Properties.identifier)) {
				// init part
				this.identifierSettings = new EObjectFlatComboSettings(
						relation,
						EntityRelationPackage.eINSTANCE
								.getRelation_Identifier());
				relationPart.initIdentifier(this.identifierSettings);
				// set the button mode
				relationPart.setIdentifierButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters

			if (this.isAccessible(EntityrelationViewsRepository.Relation.Properties.Source.source_)) {
				relationPart.addFilterToSource(new ViewerFilter() {

					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
					 *      java.lang.Object, java.lang.Object)
					 */
					@Override
					public boolean select(final Viewer viewer,
							final Object parentElement, final Object element) {
						return (element instanceof Entity);
					}

				});
				// Start of user code for additional businessfilters for source
				// End of user code
			}

			if (this.isAccessible(EntityrelationViewsRepository.Relation.Properties.Target.target_)) {
				relationPart.addFilterToTarget(new ViewerFilter() {

					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
					 *      java.lang.Object, java.lang.Object)
					 */
					@Override
					public boolean select(final Viewer viewer,
							final Object parentElement, final Object element) {
						return (element instanceof Entity);
					}

				});
				// Start of user code for additional businessfilters for target
				// End of user code
			}

			if (this.isAccessible(EntityrelationViewsRepository.Relation.Properties.elements)) {
				relationPart.addFilterToElements(new ViewerFilter() {
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
								.equals("")) || (element instanceof RelationElement); //$NON-NLS-1$ 
					}

				});
				// Start of user code for additional businessfilters for
				// elements
				// End of user code
			}
			if (this.isAccessible(EntityrelationViewsRepository.Relation.Properties.identifier)) {
				relationPart.addFilterToIdentifier(new ViewerFilter() {

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
								.equals("")) || (element instanceof Identifier); //$NON-NLS-1$ 
					}

				});
				// Start of user code for additional businessfilters for
				// identifier
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
		if (editorKey == EntityrelationViewsRepository.Relation.Properties.comments) {
			return EntityRelationPackage.eINSTANCE.getLogicalElement_Comments();
		}
		if (editorKey == EntityrelationViewsRepository.Relation.Properties.name) {
			return EntityRelationPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == EntityrelationViewsRepository.Relation.Properties.Source.source_) {
			return EntityRelationPackage.eINSTANCE.getRelation_Source();
		}
		if (editorKey == EntityrelationViewsRepository.Relation.Properties.Source.sourceRole) {
			return EntityRelationPackage.eINSTANCE.getRelation_SourceRole();
		}
		if (editorKey == EntityrelationViewsRepository.Relation.Properties.Source.sourceCardinality) {
			return EntityRelationPackage.eINSTANCE
					.getRelation_SourceCardinality();
		}
		if (editorKey == EntityrelationViewsRepository.Relation.Properties.Source.sourceIsComposite) {
			return EntityRelationPackage.eINSTANCE
					.getRelation_SourceIsComposite();
		}
		if (editorKey == EntityrelationViewsRepository.Relation.Properties.Target.target_) {
			return EntityRelationPackage.eINSTANCE.getRelation_Target();
		}
		if (editorKey == EntityrelationViewsRepository.Relation.Properties.Target.targetRole) {
			return EntityRelationPackage.eINSTANCE.getRelation_TargetRole();
		}
		if (editorKey == EntityrelationViewsRepository.Relation.Properties.Target.targetCardinality) {
			return EntityRelationPackage.eINSTANCE
					.getRelation_TargetCardinality();
		}
		if (editorKey == EntityrelationViewsRepository.Relation.Properties.Target.targetIsComposite) {
			return EntityRelationPackage.eINSTANCE
					.getRelation_TargetIsComposite();
		}
		if (editorKey == EntityrelationViewsRepository.Relation.Properties.elements) {
			return EntityRelationPackage.eINSTANCE.getRelation_Elements();
		}
		if (editorKey == EntityrelationViewsRepository.Relation.Properties.identifier) {
			return EntityRelationPackage.eINSTANCE.getRelation_Identifier();
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
		final Relation relation = (Relation) this.semanticObject;
		if (EntityrelationViewsRepository.Relation.Properties.comments == event
				.getAffectedEditor()) {
			relation.setComments((java.lang.String) EEFConverterUtil
					.createFromString(EcorePackage.Literals.ESTRING,
							(String) event.getNewValue()));
		}
		if (EntityrelationViewsRepository.Relation.Properties.name == event
				.getAffectedEditor()) {
			relation.setName((java.lang.String) EEFConverterUtil
					.createFromString(EcorePackage.Literals.ESTRING,
							(String) event.getNewValue()));
		}
		if (EntityrelationViewsRepository.Relation.Properties.Source.source_ == event
				.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				this.sourceSettings.setToReference(event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				final Entity eObject = EntityRelationFactory.eINSTANCE
						.createEntity();
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
				this.sourceSettings.setToReference(eObject);
			}
		}
		if (EntityrelationViewsRepository.Relation.Properties.Source.sourceRole == event
				.getAffectedEditor()) {
			relation.setSourceRole((java.lang.String) EEFConverterUtil
					.createFromString(EcorePackage.Literals.ESTRING,
							(String) event.getNewValue()));
		}
		if (EntityrelationViewsRepository.Relation.Properties.Source.sourceCardinality == event
				.getAffectedEditor()) {
			relation.setSourceCardinality((Cardinality) event.getNewValue());
		}
		if (EntityrelationViewsRepository.Relation.Properties.Source.sourceIsComposite == event
				.getAffectedEditor()) {
			relation.setSourceIsComposite((Boolean) event.getNewValue());
		}
		if (EntityrelationViewsRepository.Relation.Properties.Target.target_ == event
				.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				this.targetSettings.setToReference(event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				final Entity eObject = EntityRelationFactory.eINSTANCE
						.createEntity();
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
		if (EntityrelationViewsRepository.Relation.Properties.Target.targetRole == event
				.getAffectedEditor()) {
			relation.setTargetRole((java.lang.String) EEFConverterUtil
					.createFromString(EcorePackage.Literals.ESTRING,
							(String) event.getNewValue()));
		}
		if (EntityrelationViewsRepository.Relation.Properties.Target.targetCardinality == event
				.getAffectedEditor()) {
			relation.setTargetCardinality((Cardinality) event.getNewValue());
		}
		if (EntityrelationViewsRepository.Relation.Properties.Target.targetIsComposite == event
				.getAffectedEditor()) {
			relation.setTargetIsComposite((Boolean) event.getNewValue());
		}
		if (EntityrelationViewsRepository.Relation.Properties.elements == event
				.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				final EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(
						this.editingContext, this, this.elementsSettings,
						this.editingContext.getAdapterFactory());
				final PropertiesEditingProvider provider = (PropertiesEditingProvider) this.editingContext
						.getAdapterFactory().adapt(this.semanticObject,
								PropertiesEditingProvider.class);
				if (provider != null) {
					final PropertiesEditingPolicy policy = provider
							.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				final EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
						this.editingContext, this,
						(EObject) event.getNewValue(),
						this.editingContext.getAdapterFactory());
				final PropertiesEditingProvider provider = (PropertiesEditingProvider) this.editingContext
						.getAdapterFactory().adapt(
								(EObject) event.getNewValue(),
								PropertiesEditingProvider.class);
				if (provider != null) {
					final PropertiesEditingPolicy editionPolicy = provider
							.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				this.elementsSettings.removeFromReference((EObject) event
						.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				this.elementsSettings.move(event.getNewIndex(),
						(RelationElement) event.getNewValue());
			}
		}
		if (EntityrelationViewsRepository.Relation.Properties.identifier == event
				.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				this.identifierSettings.setToReference(event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				final Identifier eObject = EntityRelationFactory.eINSTANCE
						.createIdentifier();
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
				this.identifierSettings.setToReference(eObject);
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
			final RelationPropertiesEditionPart relationPart = (RelationPropertiesEditionPart) this.editingPart;
			if (EntityRelationPackage.eINSTANCE.getLogicalElement_Comments()
					.equals(msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (relationPart != null)
					&& this.isAccessible(EntityrelationViewsRepository.Relation.Properties.comments)) {
				if (msg.getNewValue() != null) {
					relationPart.setComments(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					relationPart.setComments("");
				}
			}
			if (EntityRelationPackage.eINSTANCE.getNamedElement_Name().equals(
					msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (relationPart != null)
					&& this.isAccessible(EntityrelationViewsRepository.Relation.Properties.name)) {
				if (msg.getNewValue() != null) {
					relationPart.setName(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					relationPart.setName("");
				}
			}
			if (EntityRelationPackage.eINSTANCE.getRelation_Source().equals(
					msg.getFeature())
					&& (relationPart != null)
					&& this.isAccessible(EntityrelationViewsRepository.Relation.Properties.Source.source_)) {
				relationPart.setSource((EObject) msg.getNewValue());
			}
			if (EntityRelationPackage.eINSTANCE.getRelation_SourceRole()
					.equals(msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (relationPart != null)
					&& this.isAccessible(EntityrelationViewsRepository.Relation.Properties.Source.sourceRole)) {
				if (msg.getNewValue() != null) {
					relationPart.setSourceRole(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					relationPart.setSourceRole("");
				}
			}
			if (EntityRelationPackage.eINSTANCE.getRelation_SourceCardinality()
					.equals(msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& this.isAccessible(EntityrelationViewsRepository.Relation.Properties.Source.sourceCardinality)) {
				relationPart.setSourceCardinality((Cardinality) msg
						.getNewValue());
			}

			if (EntityRelationPackage.eINSTANCE.getRelation_SourceIsComposite()
					.equals(msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (relationPart != null)
					&& this.isAccessible(EntityrelationViewsRepository.Relation.Properties.Source.sourceIsComposite)) {
				relationPart.setSourceIsComposite((Boolean) msg.getNewValue());
			}

			if (EntityRelationPackage.eINSTANCE.getRelation_Target().equals(
					msg.getFeature())
					&& (relationPart != null)
					&& this.isAccessible(EntityrelationViewsRepository.Relation.Properties.Target.target_)) {
				relationPart.setTarget((EObject) msg.getNewValue());
			}
			if (EntityRelationPackage.eINSTANCE.getRelation_TargetRole()
					.equals(msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (relationPart != null)
					&& this.isAccessible(EntityrelationViewsRepository.Relation.Properties.Target.targetRole)) {
				if (msg.getNewValue() != null) {
					relationPart.setTargetRole(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					relationPart.setTargetRole("");
				}
			}
			if (EntityRelationPackage.eINSTANCE.getRelation_TargetCardinality()
					.equals(msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& this.isAccessible(EntityrelationViewsRepository.Relation.Properties.Target.targetCardinality)) {
				relationPart.setTargetCardinality((Cardinality) msg
						.getNewValue());
			}

			if (EntityRelationPackage.eINSTANCE.getRelation_TargetIsComposite()
					.equals(msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (relationPart != null)
					&& this.isAccessible(EntityrelationViewsRepository.Relation.Properties.Target.targetIsComposite)) {
				relationPart.setTargetIsComposite((Boolean) msg.getNewValue());
			}

			if (EntityRelationPackage.eINSTANCE.getRelation_Elements().equals(
					msg.getFeature())
					&& this.isAccessible(EntityrelationViewsRepository.Relation.Properties.elements)) {
				relationPart.updateElements();
			}
			if (EntityRelationPackage.eINSTANCE.getRelation_Identifier()
					.equals(msg.getFeature())
					&& (relationPart != null)
					&& this.isAccessible(EntityrelationViewsRepository.Relation.Properties.identifier)) {
				relationPart.setIdentifier((EObject) msg.getNewValue());
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
				EntityRelationPackage.eINSTANCE.getLogicalElement_Comments(),
				EntityRelationPackage.eINSTANCE.getNamedElement_Name(),
				EntityRelationPackage.eINSTANCE.getRelation_Source(),
				EntityRelationPackage.eINSTANCE.getRelation_SourceRole(),
				EntityRelationPackage.eINSTANCE.getRelation_SourceCardinality(),
				EntityRelationPackage.eINSTANCE.getRelation_SourceIsComposite(),
				EntityRelationPackage.eINSTANCE.getRelation_Target(),
				EntityRelationPackage.eINSTANCE.getRelation_TargetRole(),
				EntityRelationPackage.eINSTANCE.getRelation_TargetCardinality(),
				EntityRelationPackage.eINSTANCE.getRelation_TargetIsComposite(),
				EntityRelationPackage.eINSTANCE.getRelation_Elements(),
				EntityRelationPackage.eINSTANCE.getRelation_Identifier());
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
		return (key == EntityrelationViewsRepository.Relation.Properties.Source.source_)
				|| (key == EntityrelationViewsRepository.Relation.Properties.Target.target_);
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
				if (EntityrelationViewsRepository.Relation.Properties.comments == event
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
				if (EntityrelationViewsRepository.Relation.Properties.name == event
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
				if (EntityrelationViewsRepository.Relation.Properties.Source.sourceRole == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(
										EntityRelationPackage.eINSTANCE
												.getRelation_SourceRole()
												.getEAttributeType(),
										(String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							EntityRelationPackage.eINSTANCE
									.getRelation_SourceRole()
									.getEAttributeType(), newValue);
				}
				if (EntityrelationViewsRepository.Relation.Properties.Source.sourceCardinality == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(
										EntityRelationPackage.eINSTANCE
												.getRelation_SourceCardinality()
												.getEAttributeType(),
										(String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							EntityRelationPackage.eINSTANCE
									.getRelation_SourceCardinality()
									.getEAttributeType(), newValue);
				}
				if (EntityrelationViewsRepository.Relation.Properties.Source.sourceIsComposite == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(
										EntityRelationPackage.eINSTANCE
												.getRelation_SourceIsComposite()
												.getEAttributeType(),
										(String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							EntityRelationPackage.eINSTANCE
									.getRelation_SourceIsComposite()
									.getEAttributeType(), newValue);
				}
				if (EntityrelationViewsRepository.Relation.Properties.Target.targetRole == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(
										EntityRelationPackage.eINSTANCE
												.getRelation_TargetRole()
												.getEAttributeType(),
										(String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							EntityRelationPackage.eINSTANCE
									.getRelation_TargetRole()
									.getEAttributeType(), newValue);
				}
				if (EntityrelationViewsRepository.Relation.Properties.Target.targetCardinality == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(
										EntityRelationPackage.eINSTANCE
												.getRelation_TargetCardinality()
												.getEAttributeType(),
										(String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							EntityRelationPackage.eINSTANCE
									.getRelation_TargetCardinality()
									.getEAttributeType(), newValue);
				}
				if (EntityrelationViewsRepository.Relation.Properties.Target.targetIsComposite == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(
										EntityRelationPackage.eINSTANCE
												.getRelation_TargetIsComposite()
												.getEAttributeType(),
										(String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							EntityRelationPackage.eINSTANCE
									.getRelation_TargetIsComposite()
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
