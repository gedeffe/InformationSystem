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
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectStrictFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.obeonetwork.dsl.entityrelation.Attribute;
import org.obeonetwork.dsl.entityrelation.EntityRelationPackage;
import org.obeonetwork.dsl.entityrelation.Identifier;
import org.obeonetwork.dsl.entityrelation.parts.EntityrelationViewsRepository;
import org.obeonetwork.dsl.entityrelation.parts.IdentifierPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class IdentifierPropertiesEditionComponent extends
		SinglePartPropertiesEditingComponent {

	public static String IDENTIFIER_PART = "Identifier"; //$NON-NLS-1$

	/**
	 * Settings for attributes ReferencesTable
	 */
	private ReferencesTableSettings attributesSettings;

	/**
	 * Default constructor
	 * 
	 */
	public IdentifierPropertiesEditionComponent(
			final PropertiesEditingContext editingContext,
			final EObject identifier, final String editing_mode) {
		super(editingContext, identifier, editing_mode);
		this.parts = new String[] { IDENTIFIER_PART };
		this.repositoryKey = EntityrelationViewsRepository.class;
		this.partKey = EntityrelationViewsRepository.Identifier.class;
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

			final Identifier identifier = (Identifier) elt;
			final IdentifierPropertiesEditionPart identifierPart = (IdentifierPropertiesEditionPart) this.editingPart;
			// init values
			if (this.isAccessible(EntityrelationViewsRepository.Identifier.Properties.name)) {
				identifierPart.setName(EEFConverterUtil.convertToString(
						EcorePackage.Literals.ESTRING, identifier.getName()));
			}

			if (this.isAccessible(EntityrelationViewsRepository.Identifier.Properties.attributes)) {
				this.attributesSettings = new ReferencesTableSettings(
						identifier,
						EntityRelationPackage.eINSTANCE
								.getIdentifier_Attributes());
				identifierPart.initAttributes(this.attributesSettings);
			}
			if (this.isAccessible(EntityrelationViewsRepository.Identifier.Properties.comments)) {
				identifierPart
						.setComments(EcoreUtil.convertToString(
								EcorePackage.Literals.ESTRING,
								identifier.getComments()));
				// init filters
			}

			if (this.isAccessible(EntityrelationViewsRepository.Identifier.Properties.attributes)) {
				identifierPart.addFilterToAttributes(new ViewerFilter() {

					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
					 *      java.lang.Object, java.lang.Object)
					 */
					@Override
					public boolean select(final Viewer viewer,
							final Object parentElement, final Object element) {
						if (element instanceof EObject) {
							return (!identifierPart
									.isContainedInAttributesTable((EObject) element));
						}
						return (element instanceof String)
								&& element.equals("");
					}

				});
				identifierPart.addFilterToAttributes(new EObjectStrictFilter(
						EntityRelationPackage.Literals.ATTRIBUTE));
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
		if (editorKey == EntityrelationViewsRepository.Identifier.Properties.name) {
			return EntityRelationPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == EntityrelationViewsRepository.Identifier.Properties.attributes) {
			return EntityRelationPackage.eINSTANCE.getIdentifier_Attributes();
		}
		if (editorKey == EntityrelationViewsRepository.Identifier.Properties.comments) {
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
		final Identifier identifier = (Identifier) this.semanticObject;
		if (EntityrelationViewsRepository.Identifier.Properties.name == event
				.getAffectedEditor()) {
			identifier.setName((java.lang.String) EEFConverterUtil
					.createFromString(EcorePackage.Literals.ESTRING,
							(String) event.getNewValue()));
		}
		if (EntityrelationViewsRepository.Identifier.Properties.attributes == event
				.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Attribute) {
					this.attributesSettings.addToReference((EObject) event
							.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				this.attributesSettings.removeFromReference((EObject) event
						.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				this.attributesSettings.move(event.getNewIndex(),
						(Attribute) event.getNewValue());
			}
		}
		if (EntityrelationViewsRepository.Identifier.Properties.comments == event
				.getAffectedEditor()) {
			identifier.setComments((java.lang.String) EEFConverterUtil
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
			final IdentifierPropertiesEditionPart identifierPart = (IdentifierPropertiesEditionPart) this.editingPart;
			if (EntityRelationPackage.eINSTANCE.getNamedElement_Name().equals(
					msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (identifierPart != null)
					&& this.isAccessible(EntityrelationViewsRepository.Identifier.Properties.name)) {
				if (msg.getNewValue() != null) {
					identifierPart.setName(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					identifierPart.setName("");
				}
			}
			if (EntityRelationPackage.eINSTANCE.getIdentifier_Attributes()
					.equals(msg.getFeature())
					&& this.isAccessible(EntityrelationViewsRepository.Identifier.Properties.attributes)) {
				identifierPart.updateAttributes();
			}
			if (EntityRelationPackage.eINSTANCE.getLogicalElement_Comments()
					.equals(msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (identifierPart != null)
					&& this.isAccessible(EntityrelationViewsRepository.Identifier.Properties.comments)) {
				if (msg.getNewValue() != null) {
					identifierPart.setComments(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					identifierPart.setComments("");
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
				EntityRelationPackage.eINSTANCE.getIdentifier_Attributes(),
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
				if (EntityrelationViewsRepository.Identifier.Properties.name == event
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
				if (EntityrelationViewsRepository.Identifier.Properties.comments == event
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
