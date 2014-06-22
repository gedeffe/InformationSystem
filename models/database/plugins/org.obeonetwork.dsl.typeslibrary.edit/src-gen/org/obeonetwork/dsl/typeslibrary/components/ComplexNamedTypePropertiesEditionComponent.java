/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.typeslibrary.components;

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
import org.obeonetwork.dsl.typeslibrary.ComplexNamedType;
import org.obeonetwork.dsl.typeslibrary.TypesLibraryPackage;
import org.obeonetwork.dsl.typeslibrary.UserDefinedType;
import org.obeonetwork.dsl.typeslibrary.parts.ComplexNamedTypePropertiesEditionPart;
import org.obeonetwork.dsl.typeslibrary.parts.TypeslibraryViewsRepository;

// End of user code

/**
 * 
 * 
 */
public class ComplexNamedTypePropertiesEditionComponent extends
		SinglePartPropertiesEditingComponent {

	public static String COMPLEXNAMEDTYPE_PART = "ComplexNamedType"; //$NON-NLS-1$

	/**
	 * Settings for types ReferencesTable
	 */
	protected ReferencesTableSettings typesSettings;

	/**
	 * Default constructor
	 * 
	 */
	public ComplexNamedTypePropertiesEditionComponent(
			final PropertiesEditingContext editingContext,
			final EObject complexNamedType, final String editing_mode) {
		super(editingContext, complexNamedType, editing_mode);
		this.parts = new String[] { COMPLEXNAMEDTYPE_PART };
		this.repositoryKey = TypeslibraryViewsRepository.class;
		this.partKey = TypeslibraryViewsRepository.ComplexNamedType.class;
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

			final ComplexNamedType complexNamedType = (ComplexNamedType) elt;
			final ComplexNamedTypePropertiesEditionPart complexNamedTypePart = (ComplexNamedTypePropertiesEditionPart) this.editingPart;
			// init values
			if (this.isAccessible(TypeslibraryViewsRepository.ComplexNamedType.Properties.name)) {
				complexNamedTypePart.setName(EEFConverterUtil.convertToString(
						EcorePackage.Literals.ESTRING,
						complexNamedType.getName()));
			}

			if (this.isAccessible(TypeslibraryViewsRepository.ComplexNamedType.Properties.types)) {
				this.typesSettings = new ReferencesTableSettings(
						complexNamedType,
						TypesLibraryPackage.eINSTANCE
								.getComplexNamedType_Types());
				complexNamedTypePart.initTypes(this.typesSettings);
			}
			// init filters

			if (this.isAccessible(TypeslibraryViewsRepository.ComplexNamedType.Properties.types)) {
				complexNamedTypePart.addFilterToTypes(new ViewerFilter() {
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
								.equals("")) || (element instanceof UserDefinedType); //$NON-NLS-1$ 
					}

				});
				// Start of user code for additional businessfilters for types
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
		if (editorKey == TypeslibraryViewsRepository.ComplexNamedType.Properties.name) {
			return TypesLibraryPackage.eINSTANCE.getUserDefinedType_Name();
		}
		if (editorKey == TypeslibraryViewsRepository.ComplexNamedType.Properties.types) {
			return TypesLibraryPackage.eINSTANCE.getComplexNamedType_Types();
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
		final ComplexNamedType complexNamedType = (ComplexNamedType) this.semanticObject;
		if (TypeslibraryViewsRepository.ComplexNamedType.Properties.name == event
				.getAffectedEditor()) {
			complexNamedType.setName((java.lang.String) EEFConverterUtil
					.createFromString(EcorePackage.Literals.ESTRING,
							(String) event.getNewValue()));
		}
		if (TypeslibraryViewsRepository.ComplexNamedType.Properties.types == event
				.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				final EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(
						this.editingContext, this, this.typesSettings,
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
				this.typesSettings.removeFromReference((EObject) event
						.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				this.typesSettings.move(event.getNewIndex(),
						(UserDefinedType) event.getNewValue());
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
			final ComplexNamedTypePropertiesEditionPart complexNamedTypePart = (ComplexNamedTypePropertiesEditionPart) this.editingPart;
			if (TypesLibraryPackage.eINSTANCE.getUserDefinedType_Name().equals(
					msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (complexNamedTypePart != null)
					&& this.isAccessible(TypeslibraryViewsRepository.ComplexNamedType.Properties.name)) {
				if (msg.getNewValue() != null) {
					complexNamedTypePart.setName(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					complexNamedTypePart.setName("");
				}
			}
			if (TypesLibraryPackage.eINSTANCE.getComplexNamedType_Types()
					.equals(msg.getFeature())
					&& this.isAccessible(TypeslibraryViewsRepository.ComplexNamedType.Properties.types)) {
				complexNamedTypePart.updateTypes();
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
				TypesLibraryPackage.eINSTANCE.getUserDefinedType_Name(),
				TypesLibraryPackage.eINSTANCE.getComplexNamedType_Types());
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
				if (TypeslibraryViewsRepository.ComplexNamedType.Properties.name == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(TypesLibraryPackage.eINSTANCE
										.getUserDefinedType_Name()
										.getEAttributeType(), (String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							TypesLibraryPackage.eINSTANCE
									.getUserDefinedType_Name()
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
