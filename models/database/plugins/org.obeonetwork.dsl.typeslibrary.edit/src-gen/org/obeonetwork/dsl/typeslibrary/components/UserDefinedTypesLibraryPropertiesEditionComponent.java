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
import org.obeonetwork.dsl.typeslibrary.TypesLibraryPackage;
import org.obeonetwork.dsl.typeslibrary.UserDefinedType;
import org.obeonetwork.dsl.typeslibrary.UserDefinedTypesLibrary;
import org.obeonetwork.dsl.typeslibrary.parts.TypeslibraryViewsRepository;
import org.obeonetwork.dsl.typeslibrary.parts.UserDefinedTypesLibraryPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class UserDefinedTypesLibraryPropertiesEditionComponent extends
		SinglePartPropertiesEditingComponent {

	public static String USERDEFINEDTYPESLIBRARY_PART = "UserDefinedTypesLibrary"; //$NON-NLS-1$

	/**
	 * Settings for userDefinedTypes ReferencesTable
	 */
	protected ReferencesTableSettings userDefinedTypesSettings;

	/**
	 * Default constructor
	 * 
	 */
	public UserDefinedTypesLibraryPropertiesEditionComponent(
			final PropertiesEditingContext editingContext,
			final EObject userDefinedTypesLibrary, final String editing_mode) {
		super(editingContext, userDefinedTypesLibrary, editing_mode);
		this.parts = new String[] { USERDEFINEDTYPESLIBRARY_PART };
		this.repositoryKey = TypeslibraryViewsRepository.class;
		this.partKey = TypeslibraryViewsRepository.UserDefinedTypesLibrary.class;
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

			final UserDefinedTypesLibrary userDefinedTypesLibrary = (UserDefinedTypesLibrary) elt;
			final UserDefinedTypesLibraryPropertiesEditionPart userDefinedTypesLibraryPart = (UserDefinedTypesLibraryPropertiesEditionPart) this.editingPart;
			// init values
			if (this.isAccessible(TypeslibraryViewsRepository.UserDefinedTypesLibrary.Properties.name)) {
				userDefinedTypesLibraryPart.setName(EEFConverterUtil
						.convertToString(EcorePackage.Literals.ESTRING,
								userDefinedTypesLibrary.getName()));
			}

			if (this.isAccessible(TypeslibraryViewsRepository.UserDefinedTypesLibrary.Properties.userDefinedTypes)) {
				this.userDefinedTypesSettings = new ReferencesTableSettings(
						userDefinedTypesLibrary,
						TypesLibraryPackage.eINSTANCE
								.getUserDefinedTypesLibrary_UserDefinedTypes());
				userDefinedTypesLibraryPart
						.initUserDefinedTypes(this.userDefinedTypesSettings);
			}
			// init filters

			if (this.isAccessible(TypeslibraryViewsRepository.UserDefinedTypesLibrary.Properties.userDefinedTypes)) {
				userDefinedTypesLibraryPart
						.addFilterToUserDefinedTypes(new ViewerFilter() {
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
										.equals("")) || (element instanceof UserDefinedType); //$NON-NLS-1$ 
							}

						});
				// Start of user code for additional businessfilters for
				// userDefinedTypes
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
		if (editorKey == TypeslibraryViewsRepository.UserDefinedTypesLibrary.Properties.name) {
			return TypesLibraryPackage.eINSTANCE
					.getUserDefinedTypesLibrary_Name();
		}
		if (editorKey == TypeslibraryViewsRepository.UserDefinedTypesLibrary.Properties.userDefinedTypes) {
			return TypesLibraryPackage.eINSTANCE
					.getUserDefinedTypesLibrary_UserDefinedTypes();
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
		final UserDefinedTypesLibrary userDefinedTypesLibrary = (UserDefinedTypesLibrary) this.semanticObject;
		if (TypeslibraryViewsRepository.UserDefinedTypesLibrary.Properties.name == event
				.getAffectedEditor()) {
			userDefinedTypesLibrary.setName((java.lang.String) EEFConverterUtil
					.createFromString(EcorePackage.Literals.ESTRING,
							(String) event.getNewValue()));
		}
		if (TypeslibraryViewsRepository.UserDefinedTypesLibrary.Properties.userDefinedTypes == event
				.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				final EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(
						this.editingContext, this,
						this.userDefinedTypesSettings,
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
				this.userDefinedTypesSettings
						.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				this.userDefinedTypesSettings.move(event.getNewIndex(),
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
			final UserDefinedTypesLibraryPropertiesEditionPart userDefinedTypesLibraryPart = (UserDefinedTypesLibraryPropertiesEditionPart) this.editingPart;
			if (TypesLibraryPackage.eINSTANCE.getUserDefinedTypesLibrary_Name()
					.equals(msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (userDefinedTypesLibraryPart != null)
					&& this.isAccessible(TypeslibraryViewsRepository.UserDefinedTypesLibrary.Properties.name)) {
				if (msg.getNewValue() != null) {
					userDefinedTypesLibraryPart.setName(EcoreUtil
							.convertToString(EcorePackage.Literals.ESTRING,
									msg.getNewValue()));
				} else {
					userDefinedTypesLibraryPart.setName("");
				}
			}
			if (TypesLibraryPackage.eINSTANCE
					.getUserDefinedTypesLibrary_UserDefinedTypes().equals(
							msg.getFeature())
					&& this.isAccessible(TypeslibraryViewsRepository.UserDefinedTypesLibrary.Properties.userDefinedTypes)) {
				userDefinedTypesLibraryPart.updateUserDefinedTypes();
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
				TypesLibraryPackage.eINSTANCE.getUserDefinedTypesLibrary_Name(),
				TypesLibraryPackage.eINSTANCE
						.getUserDefinedTypesLibrary_UserDefinedTypes());
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
				if (TypeslibraryViewsRepository.UserDefinedTypesLibrary.Properties.name == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(TypesLibraryPackage.eINSTANCE
										.getUserDefinedTypesLibrary_Name()
										.getEAttributeType(), (String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							TypesLibraryPackage.eINSTANCE
									.getUserDefinedTypesLibrary_Name()
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
