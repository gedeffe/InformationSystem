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
import org.obeonetwork.dsl.typeslibrary.NativeType;
import org.obeonetwork.dsl.typeslibrary.NativeTypesLibrary;
import org.obeonetwork.dsl.typeslibrary.TypesLibraryPackage;
import org.obeonetwork.dsl.typeslibrary.parts.NativeTypesLibraryPropertiesEditionPart;
import org.obeonetwork.dsl.typeslibrary.parts.TypeslibraryViewsRepository;

// End of user code

/**
 * 
 * 
 */
public class NativeTypesLibraryPropertiesEditionComponent extends
		SinglePartPropertiesEditingComponent {

	public static String NATIVETYPESLIBRARY_PART = "NativeTypesLibrary"; //$NON-NLS-1$

	/**
	 * Settings for nativeTypes ReferencesTable
	 */
	protected ReferencesTableSettings nativeTypesSettings;

	/**
	 * Default constructor
	 * 
	 */
	public NativeTypesLibraryPropertiesEditionComponent(
			final PropertiesEditingContext editingContext,
			final EObject nativeTypesLibrary, final String editing_mode) {
		super(editingContext, nativeTypesLibrary, editing_mode);
		this.parts = new String[] { NATIVETYPESLIBRARY_PART };
		this.repositoryKey = TypeslibraryViewsRepository.class;
		this.partKey = TypeslibraryViewsRepository.NativeTypesLibrary.class;
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

			final NativeTypesLibrary nativeTypesLibrary = (NativeTypesLibrary) elt;
			final NativeTypesLibraryPropertiesEditionPart nativeTypesLibraryPart = (NativeTypesLibraryPropertiesEditionPart) this.editingPart;
			// init values
			if (this.isAccessible(TypeslibraryViewsRepository.NativeTypesLibrary.Properties.name)) {
				nativeTypesLibraryPart.setName(EEFConverterUtil
						.convertToString(EcorePackage.Literals.ESTRING,
								nativeTypesLibrary.getName()));
			}

			if (this.isAccessible(TypeslibraryViewsRepository.NativeTypesLibrary.Properties.nativeTypes)) {
				this.nativeTypesSettings = new ReferencesTableSettings(
						nativeTypesLibrary,
						TypesLibraryPackage.eINSTANCE
								.getNativeTypesLibrary_NativeTypes());
				nativeTypesLibraryPart
						.initNativeTypes(this.nativeTypesSettings);
			}
			// init filters

			if (this.isAccessible(TypeslibraryViewsRepository.NativeTypesLibrary.Properties.nativeTypes)) {
				nativeTypesLibraryPart
						.addFilterToNativeTypes(new ViewerFilter() {
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
										.equals("")) || (element instanceof NativeType); //$NON-NLS-1$ 
							}

						});
				// Start of user code for additional businessfilters for
				// nativeTypes
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
		if (editorKey == TypeslibraryViewsRepository.NativeTypesLibrary.Properties.name) {
			return TypesLibraryPackage.eINSTANCE.getNativeTypesLibrary_Name();
		}
		if (editorKey == TypeslibraryViewsRepository.NativeTypesLibrary.Properties.nativeTypes) {
			return TypesLibraryPackage.eINSTANCE
					.getNativeTypesLibrary_NativeTypes();
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
		final NativeTypesLibrary nativeTypesLibrary = (NativeTypesLibrary) this.semanticObject;
		if (TypeslibraryViewsRepository.NativeTypesLibrary.Properties.name == event
				.getAffectedEditor()) {
			nativeTypesLibrary.setName((java.lang.String) EEFConverterUtil
					.createFromString(EcorePackage.Literals.ESTRING,
							(String) event.getNewValue()));
		}
		if (TypeslibraryViewsRepository.NativeTypesLibrary.Properties.nativeTypes == event
				.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				final EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(
						this.editingContext, this, this.nativeTypesSettings,
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
				this.nativeTypesSettings.removeFromReference((EObject) event
						.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				this.nativeTypesSettings.move(event.getNewIndex(),
						(NativeType) event.getNewValue());
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
			final NativeTypesLibraryPropertiesEditionPart nativeTypesLibraryPart = (NativeTypesLibraryPropertiesEditionPart) this.editingPart;
			if (TypesLibraryPackage.eINSTANCE.getNativeTypesLibrary_Name()
					.equals(msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (nativeTypesLibraryPart != null)
					&& this.isAccessible(TypeslibraryViewsRepository.NativeTypesLibrary.Properties.name)) {
				if (msg.getNewValue() != null) {
					nativeTypesLibraryPart.setName(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					nativeTypesLibraryPart.setName("");
				}
			}
			if (TypesLibraryPackage.eINSTANCE
					.getNativeTypesLibrary_NativeTypes().equals(
							msg.getFeature())
					&& this.isAccessible(TypeslibraryViewsRepository.NativeTypesLibrary.Properties.nativeTypes)) {
				nativeTypesLibraryPart.updateNativeTypes();
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
				TypesLibraryPackage.eINSTANCE.getNativeTypesLibrary_Name(),
				TypesLibraryPackage.eINSTANCE
						.getNativeTypesLibrary_NativeTypes());
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
				if (TypeslibraryViewsRepository.NativeTypesLibrary.Properties.name == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(TypesLibraryPackage.eINSTANCE
										.getNativeTypesLibrary_Name()
										.getEAttributeType(), (String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							TypesLibraryPackage.eINSTANCE
									.getNativeTypesLibrary_Name()
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
