/**
 * Generated with Acceleo
 */
package org.obeonetwork.graal.components;

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
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.obeonetwork.dsl.environment.EnvironmentPackage;
import org.obeonetwork.graal.Actor;
import org.obeonetwork.graal.GraalFactory;
import org.obeonetwork.graal.GraalPackage;
import org.obeonetwork.graal.parts.ActorPropertiesEditionPart;
import org.obeonetwork.graal.parts.GraalViewsRepository;

// End of user code

/**
 * 
 * 
 */
public class ActorActorPropertiesEditionComponent extends
		SinglePartPropertiesEditingComponent {

	public static String ACTOR_PART = "Actor"; //$NON-NLS-1$

	/**
	 * Settings for subActors ReferencesTable
	 */
	private ReferencesTableSettings subActorsSettings;

	/**
	 * Settings for superActor EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings superActorSettings;

	/**
	 * Default constructor
	 * 
	 */
	public ActorActorPropertiesEditionComponent(
			final PropertiesEditingContext editingContext, final EObject actor,
			final String editing_mode) {
		super(editingContext, actor, editing_mode);
		this.parts = new String[] { ACTOR_PART };
		this.repositoryKey = GraalViewsRepository.class;
		this.partKey = GraalViewsRepository.Actor.class;
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

			final Actor actor = (Actor) elt;
			final ActorPropertiesEditionPart actorPart = (ActorPropertiesEditionPart) this.editingPart;
			// init values
			if (this.isAccessible(GraalViewsRepository.Actor.Properties.description)) {
				actorPart.setDescription(EcoreUtil.convertToString(
						EcorePackage.Literals.ESTRING, actor.getDescription()));
			}
			if (this.isAccessible(GraalViewsRepository.Actor.Properties.subActors)) {
				this.subActorsSettings = new ReferencesTableSettings(actor,
						GraalPackage.eINSTANCE.getActor_SubActors());
				actorPart.initSubActors(this.subActorsSettings);
			}
			if (this.isAccessible(GraalViewsRepository.Actor.Properties.superActor)) {
				// init part
				this.superActorSettings = new EObjectFlatComboSettings(actor,
						GraalPackage.eINSTANCE.getActor_SuperActor());
				actorPart.initSuperActor(this.superActorSettings);
				// set the button mode
				actorPart.setSuperActorButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (this.isAccessible(GraalViewsRepository.Actor.Properties.name)) {
				actorPart.setName(EEFConverterUtil.convertToString(
						EcorePackage.Literals.ESTRING, actor.getName()));
			}

			// init filters

			if (this.isAccessible(GraalViewsRepository.Actor.Properties.subActors)) {
				actorPart.addFilterToSubActors(new EObjectFilter(
						GraalPackage.Literals.ACTOR));
				// Start of user code for additional businessfilters for
				// subActors
				// End of user code
			}
			if (this.isAccessible(GraalViewsRepository.Actor.Properties.superActor)) {
				actorPart.addFilterToSuperActor(new ViewerFilter() {

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
								.equals("")) || (element instanceof Actor); //$NON-NLS-1$ 
					}

				});
				// Start of user code for additional businessfilters for
				// superActor
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
		if (editorKey == GraalViewsRepository.Actor.Properties.description) {
			return EnvironmentPackage.eINSTANCE.getObeoDSMObject_Description();
		}
		if (editorKey == GraalViewsRepository.Actor.Properties.subActors) {
			return GraalPackage.eINSTANCE.getActor_SubActors();
		}
		if (editorKey == GraalViewsRepository.Actor.Properties.superActor) {
			return GraalPackage.eINSTANCE.getActor_SuperActor();
		}
		if (editorKey == GraalViewsRepository.Actor.Properties.name) {
			return GraalPackage.eINSTANCE.getNamedElement_Name();
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
		final Actor actor = (Actor) this.semanticObject;
		if (GraalViewsRepository.Actor.Properties.description == event
				.getAffectedEditor()) {
			actor.setDescription((java.lang.String) EEFConverterUtil
					.createFromString(EcorePackage.Literals.ESTRING,
							(String) event.getNewValue()));
		}
		if (GraalViewsRepository.Actor.Properties.subActors == event
				.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Actor) {
					this.subActorsSettings.addToReference((EObject) event
							.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				this.subActorsSettings.removeFromReference((EObject) event
						.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				this.subActorsSettings.move(event.getNewIndex(),
						(Actor) event.getNewValue());
			}
		}
		if (GraalViewsRepository.Actor.Properties.superActor == event
				.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				this.superActorSettings.setToReference(event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				final Actor eObject = GraalFactory.eINSTANCE.createActor();
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
				this.superActorSettings.setToReference(eObject);
			}
		}
		if (GraalViewsRepository.Actor.Properties.name == event
				.getAffectedEditor()) {
			actor.setName((java.lang.String) EEFConverterUtil.createFromString(
					EcorePackage.Literals.ESTRING, (String) event.getNewValue()));
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
			final ActorPropertiesEditionPart actorPart = (ActorPropertiesEditionPart) this.editingPart;
			if (EnvironmentPackage.eINSTANCE.getObeoDSMObject_Description()
					.equals(msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (actorPart != null)
					&& this.isAccessible(GraalViewsRepository.Actor.Properties.description)) {
				if (msg.getNewValue() != null) {
					actorPart.setDescription(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					actorPart.setDescription("");
				}
			}
			if (GraalPackage.eINSTANCE.getActor_SubActors().equals(
					msg.getFeature())
					&& this.isAccessible(GraalViewsRepository.Actor.Properties.subActors)) {
				actorPart.updateSubActors();
			}
			if (GraalPackage.eINSTANCE.getActor_SuperActor().equals(
					msg.getFeature())
					&& (actorPart != null)
					&& this.isAccessible(GraalViewsRepository.Actor.Properties.superActor)) {
				actorPart.setSuperActor((EObject) msg.getNewValue());
			}
			if (GraalPackage.eINSTANCE.getNamedElement_Name().equals(
					msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (actorPart != null)
					&& this.isAccessible(GraalViewsRepository.Actor.Properties.name)) {
				if (msg.getNewValue() != null) {
					actorPart.setName(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					actorPart.setName("");
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
				EnvironmentPackage.eINSTANCE.getObeoDSMObject_Description(),
				GraalPackage.eINSTANCE.getActor_SubActors(),
				GraalPackage.eINSTANCE.getActor_SuperActor(),
				GraalPackage.eINSTANCE.getNamedElement_Name());
		return new NotificationFilter[] { filter, };
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
				if (GraalViewsRepository.Actor.Properties.description == event
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
				if (GraalViewsRepository.Actor.Properties.name == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(GraalPackage.eINSTANCE
										.getNamedElement_Name()
										.getEAttributeType(), (String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							GraalPackage.eINSTANCE.getNamedElement_Name()
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
