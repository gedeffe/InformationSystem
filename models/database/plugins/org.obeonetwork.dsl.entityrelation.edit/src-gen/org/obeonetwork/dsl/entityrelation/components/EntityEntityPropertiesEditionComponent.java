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
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.obeonetwork.dsl.entityrelation.Attribute;
import org.obeonetwork.dsl.entityrelation.Entity;
import org.obeonetwork.dsl.entityrelation.EntityRelationPackage;
import org.obeonetwork.dsl.entityrelation.parts.EntityPropertiesEditionPart;
import org.obeonetwork.dsl.entityrelation.parts.EntityrelationViewsRepository;

// End of user code

/**
 * 
 * 
 */
public class EntityEntityPropertiesEditionComponent extends
		SinglePartPropertiesEditingComponent {

	public static String ENTITY_PART = "Entity"; //$NON-NLS-1$

	/**
	 * Settings for attributes ReferencesTable
	 */
	protected ReferencesTableSettings attributesSettings;

	/**
	 * Default constructor
	 * 
	 */
	public EntityEntityPropertiesEditionComponent(
			final PropertiesEditingContext editingContext,
			final EObject entity, final String editing_mode) {
		super(editingContext, entity, editing_mode);
		this.parts = new String[] { ENTITY_PART };
		this.repositoryKey = EntityrelationViewsRepository.class;
		this.partKey = EntityrelationViewsRepository.Entity.class;
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

			final Entity entity = (Entity) elt;
			final EntityPropertiesEditionPart entityPart = (EntityPropertiesEditionPart) this.editingPart;
			// init values
			if (this.isAccessible(EntityrelationViewsRepository.Entity.Properties.name)) {
				entityPart.setName(EEFConverterUtil.convertToString(
						EcorePackage.Literals.ESTRING, entity.getName()));
			}

			if (this.isAccessible(EntityrelationViewsRepository.Entity.Properties.attributes)) {
				this.attributesSettings = new ReferencesTableSettings(entity,
						EntityRelationPackage.eINSTANCE.getEntity_Attributes());
				entityPart.initAttributes(this.attributesSettings);
			}
			if (this.isAccessible(EntityrelationViewsRepository.Entity.Properties.comments)) {
				entityPart.setComments(EcoreUtil.convertToString(
						EcorePackage.Literals.ESTRING, entity.getComments()));
				// init filters
			}

			if (this.isAccessible(EntityrelationViewsRepository.Entity.Properties.attributes)) {
				entityPart.addFilterToAttributes(new ViewerFilter() {
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
								.equals("")) || (element instanceof Attribute); //$NON-NLS-1$ 
					}

				});
				// Start of user code for additional businessfilters for
				// attributes
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
		if (editorKey == EntityrelationViewsRepository.Entity.Properties.name) {
			return EntityRelationPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == EntityrelationViewsRepository.Entity.Properties.attributes) {
			return EntityRelationPackage.eINSTANCE.getEntity_Attributes();
		}
		if (editorKey == EntityrelationViewsRepository.Entity.Properties.comments) {
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
		final Entity entity = (Entity) this.semanticObject;
		if (EntityrelationViewsRepository.Entity.Properties.name == event
				.getAffectedEditor()) {
			entity.setName((java.lang.String) EEFConverterUtil
					.createFromString(EcorePackage.Literals.ESTRING,
							(String) event.getNewValue()));
		}
		if (EntityrelationViewsRepository.Entity.Properties.attributes == event
				.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				final EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(
						this.editingContext, this, this.attributesSettings,
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
				this.attributesSettings.removeFromReference((EObject) event
						.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				this.attributesSettings.move(event.getNewIndex(),
						(Attribute) event.getNewValue());
			}
		}
		if (EntityrelationViewsRepository.Entity.Properties.comments == event
				.getAffectedEditor()) {
			entity.setComments((java.lang.String) EEFConverterUtil
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
			if (EntityRelationPackage.eINSTANCE.getNamedElement_Name().equals(
					msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (entityPart != null)
					&& this.isAccessible(EntityrelationViewsRepository.Entity.Properties.name)) {
				if (msg.getNewValue() != null) {
					entityPart.setName(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					entityPart.setName("");
				}
			}
			if (EntityRelationPackage.eINSTANCE.getEntity_Attributes().equals(
					msg.getFeature())
					&& this.isAccessible(EntityrelationViewsRepository.Entity.Properties.attributes)) {
				entityPart.updateAttributes();
			}
			if (EntityRelationPackage.eINSTANCE.getLogicalElement_Comments()
					.equals(msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (entityPart != null)
					&& this.isAccessible(EntityrelationViewsRepository.Entity.Properties.comments)) {
				if (msg.getNewValue() != null) {
					entityPart.setComments(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					entityPart.setComments("");
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
				EntityRelationPackage.eINSTANCE.getEntity_Attributes(),
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
				if (EntityrelationViewsRepository.Entity.Properties.name == event
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
				if (EntityrelationViewsRepository.Entity.Properties.comments == event
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

}
