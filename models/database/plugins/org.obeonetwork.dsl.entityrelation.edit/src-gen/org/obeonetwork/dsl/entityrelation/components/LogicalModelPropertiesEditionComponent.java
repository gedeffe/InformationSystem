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
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.obeonetwork.dsl.entityrelation.EntityRelationPackage;
import org.obeonetwork.dsl.entityrelation.LogicalModel;
import org.obeonetwork.dsl.entityrelation.parts.EntityrelationViewsRepository;
import org.obeonetwork.dsl.entityrelation.parts.LogicalModelPropertiesEditionPart;
import org.obeonetwork.dsl.typeslibrary.TypesLibrary;
import org.obeonetwork.dsl.typeslibrary.TypesLibraryPackage;

// End of user code

/**
 * 
 * 
 */
public class LogicalModelPropertiesEditionComponent extends
		SinglePartPropertiesEditingComponent {

	public static String LOGICALMODEL_PART = "LogicalModel"; //$NON-NLS-1$

	/**
	 * Settings for usedLibraries ReferencesTable
	 */
	private ReferencesTableSettings usedLibrariesSettings;

	/**
	 * Default constructor
	 * 
	 */
	public LogicalModelPropertiesEditionComponent(
			final PropertiesEditingContext editingContext,
			final EObject logicalModel, final String editing_mode) {
		super(editingContext, logicalModel, editing_mode);
		this.parts = new String[] { LOGICALMODEL_PART };
		this.repositoryKey = EntityrelationViewsRepository.class;
		this.partKey = EntityrelationViewsRepository.LogicalModel.class;
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

			final LogicalModel logicalModel = (LogicalModel) elt;
			final LogicalModelPropertiesEditionPart logicalModelPart = (LogicalModelPropertiesEditionPart) this.editingPart;
			// init values
			if (this.isAccessible(EntityrelationViewsRepository.LogicalModel.Properties.name)) {
				logicalModelPart.setName(EEFConverterUtil.convertToString(
						EcorePackage.Literals.ESTRING, logicalModel.getName()));
			}

			if (this.isAccessible(EntityrelationViewsRepository.LogicalModel.Properties.usedLibraries)) {
				this.usedLibrariesSettings = new ReferencesTableSettings(
						logicalModel,
						TypesLibraryPackage.eINSTANCE
								.getTypesLibraryUser_UsedLibraries());
				logicalModelPart.initUsedLibraries(this.usedLibrariesSettings);
			}
			if (this.isAccessible(EntityrelationViewsRepository.LogicalModel.Properties.comments)) {
				logicalModelPart.setComments(EcoreUtil.convertToString(
						EcorePackage.Literals.ESTRING,
						logicalModel.getComments()));
				// init filters
			}

			if (this.isAccessible(EntityrelationViewsRepository.LogicalModel.Properties.usedLibraries)) {
				logicalModelPart.addFilterToUsedLibraries(new EObjectFilter(
						TypesLibraryPackage.Literals.TYPES_LIBRARY));
				// Start of user code for additional businessfilters for
				// usedLibraries
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
		if (editorKey == EntityrelationViewsRepository.LogicalModel.Properties.name) {
			return EntityRelationPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == EntityrelationViewsRepository.LogicalModel.Properties.usedLibraries) {
			return TypesLibraryPackage.eINSTANCE
					.getTypesLibraryUser_UsedLibraries();
		}
		if (editorKey == EntityrelationViewsRepository.LogicalModel.Properties.comments) {
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
		final LogicalModel logicalModel = (LogicalModel) this.semanticObject;
		if (EntityrelationViewsRepository.LogicalModel.Properties.name == event
				.getAffectedEditor()) {
			logicalModel.setName((java.lang.String) EEFConverterUtil
					.createFromString(EcorePackage.Literals.ESTRING,
							(String) event.getNewValue()));
		}
		if (EntityrelationViewsRepository.LogicalModel.Properties.usedLibraries == event
				.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof TypesLibrary) {
					this.usedLibrariesSettings.addToReference((EObject) event
							.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				this.usedLibrariesSettings.removeFromReference((EObject) event
						.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				this.usedLibrariesSettings.move(event.getNewIndex(),
						(TypesLibrary) event.getNewValue());
			}
		}
		if (EntityrelationViewsRepository.LogicalModel.Properties.comments == event
				.getAffectedEditor()) {
			logicalModel.setComments((java.lang.String) EEFConverterUtil
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
			final LogicalModelPropertiesEditionPart logicalModelPart = (LogicalModelPropertiesEditionPart) this.editingPart;
			if (EntityRelationPackage.eINSTANCE.getNamedElement_Name().equals(
					msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (logicalModelPart != null)
					&& this.isAccessible(EntityrelationViewsRepository.LogicalModel.Properties.name)) {
				if (msg.getNewValue() != null) {
					logicalModelPart.setName(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					logicalModelPart.setName("");
				}
			}
			if (TypesLibraryPackage.eINSTANCE
					.getTypesLibraryUser_UsedLibraries().equals(
							msg.getFeature())
					&& this.isAccessible(EntityrelationViewsRepository.LogicalModel.Properties.usedLibraries)) {
				logicalModelPart.updateUsedLibraries();
			}
			if (EntityRelationPackage.eINSTANCE.getLogicalElement_Comments()
					.equals(msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (logicalModelPart != null)
					&& this.isAccessible(EntityrelationViewsRepository.LogicalModel.Properties.comments)) {
				if (msg.getNewValue() != null) {
					logicalModelPart.setComments(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					logicalModelPart.setComments("");
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
				TypesLibraryPackage.eINSTANCE
						.getTypesLibraryUser_UsedLibraries(),
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
				if (EntityrelationViewsRepository.LogicalModel.Properties.name == event
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
				if (EntityrelationViewsRepository.LogicalModel.Properties.comments == event
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
