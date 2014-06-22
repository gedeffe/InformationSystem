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
import org.obeonetwork.graal.GraalFactory;
import org.obeonetwork.graal.GraalPackage;
import org.obeonetwork.graal.Task;
import org.obeonetwork.graal.TaskReference;
import org.obeonetwork.graal.Transition;
import org.obeonetwork.graal.parts.GraalViewsRepository;
import org.obeonetwork.graal.parts.TaskReferencePropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class TaskReferenceTaskReferencePropertiesEditionComponent extends
		SinglePartPropertiesEditingComponent {

	public static String TASKREFERENCE_PART = "TaskReference"; //$NON-NLS-1$

	/**
	 * Settings for outgoingTransitions ReferencesTable
	 */
	private ReferencesTableSettings outgoingTransitionsSettings;

	/**
	 * Settings for incomingTransitions ReferencesTable
	 */
	private ReferencesTableSettings incomingTransitionsSettings;

	/**
	 * Settings for task EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings taskSettings;

	/**
	 * Default constructor
	 * 
	 */
	public TaskReferenceTaskReferencePropertiesEditionComponent(
			final PropertiesEditingContext editingContext,
			final EObject taskReference, final String editing_mode) {
		super(editingContext, taskReference, editing_mode);
		this.parts = new String[] { TASKREFERENCE_PART };
		this.repositoryKey = GraalViewsRepository.class;
		this.partKey = GraalViewsRepository.TaskReference.class;
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

			final TaskReference taskReference = (TaskReference) elt;
			final TaskReferencePropertiesEditionPart taskReferencePart = (TaskReferencePropertiesEditionPart) this.editingPart;
			// init values
			if (this.isAccessible(GraalViewsRepository.TaskReference.Properties.description)) {
				taskReferencePart.setDescription(EcoreUtil.convertToString(
						EcorePackage.Literals.ESTRING,
						taskReference.getDescription()));
			}
			if (this.isAccessible(GraalViewsRepository.TaskReference.Properties.outgoingTransitions)) {
				this.outgoingTransitionsSettings = new ReferencesTableSettings(
						taskReference,
						GraalPackage.eINSTANCE.getNode_OutgoingTransitions());
				taskReferencePart
						.initOutgoingTransitions(this.outgoingTransitionsSettings);
			}
			if (this.isAccessible(GraalViewsRepository.TaskReference.Properties.incomingTransitions)) {
				this.incomingTransitionsSettings = new ReferencesTableSettings(
						taskReference,
						GraalPackage.eINSTANCE.getNode_IncomingTransitions());
				taskReferencePart
						.initIncomingTransitions(this.incomingTransitionsSettings);
			}
			if (this.isAccessible(GraalViewsRepository.TaskReference.Properties.task)) {
				// init part
				this.taskSettings = new EObjectFlatComboSettings(taskReference,
						GraalPackage.eINSTANCE.getTaskReference_Task());
				taskReferencePart.initTask(this.taskSettings);
				// set the button mode
				taskReferencePart.setTaskButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters

			if (this.isAccessible(GraalViewsRepository.TaskReference.Properties.outgoingTransitions)) {
				taskReferencePart
						.addFilterToOutgoingTransitions(new EObjectFilter(
								GraalPackage.Literals.TRANSITION));
				// Start of user code for additional businessfilters for
				// outgoingTransitions
				// End of user code
			}
			if (this.isAccessible(GraalViewsRepository.TaskReference.Properties.incomingTransitions)) {
				taskReferencePart
						.addFilterToIncomingTransitions(new EObjectFilter(
								GraalPackage.Literals.TRANSITION));
				// Start of user code for additional businessfilters for
				// incomingTransitions
				// End of user code
			}
			if (this.isAccessible(GraalViewsRepository.TaskReference.Properties.task)) {
				taskReferencePart.addFilterToTask(new ViewerFilter() {

					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
					 *      java.lang.Object, java.lang.Object)
					 */
					@Override
					public boolean select(final Viewer viewer,
							final Object parentElement, final Object element) {
						return (element instanceof Task);
					}

				});
				// Start of user code for additional businessfilters for task
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
		if (editorKey == GraalViewsRepository.TaskReference.Properties.description) {
			return EnvironmentPackage.eINSTANCE.getObeoDSMObject_Description();
		}
		if (editorKey == GraalViewsRepository.TaskReference.Properties.outgoingTransitions) {
			return GraalPackage.eINSTANCE.getNode_OutgoingTransitions();
		}
		if (editorKey == GraalViewsRepository.TaskReference.Properties.incomingTransitions) {
			return GraalPackage.eINSTANCE.getNode_IncomingTransitions();
		}
		if (editorKey == GraalViewsRepository.TaskReference.Properties.task) {
			return GraalPackage.eINSTANCE.getTaskReference_Task();
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
		final TaskReference taskReference = (TaskReference) this.semanticObject;
		if (GraalViewsRepository.TaskReference.Properties.description == event
				.getAffectedEditor()) {
			taskReference.setDescription((java.lang.String) EEFConverterUtil
					.createFromString(EcorePackage.Literals.ESTRING,
							(String) event.getNewValue()));
		}
		if (GraalViewsRepository.TaskReference.Properties.outgoingTransitions == event
				.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Transition) {
					this.outgoingTransitionsSettings
							.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				this.outgoingTransitionsSettings
						.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				this.outgoingTransitionsSettings.move(event.getNewIndex(),
						(Transition) event.getNewValue());
			}
		}
		if (GraalViewsRepository.TaskReference.Properties.incomingTransitions == event
				.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Transition) {
					this.incomingTransitionsSettings
							.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				this.incomingTransitionsSettings
						.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				this.incomingTransitionsSettings.move(event.getNewIndex(),
						(Transition) event.getNewValue());
			}
		}
		if (GraalViewsRepository.TaskReference.Properties.task == event
				.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				this.taskSettings.setToReference(event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				final Task eObject = GraalFactory.eINSTANCE.createTask();
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
				this.taskSettings.setToReference(eObject);
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
			final TaskReferencePropertiesEditionPart taskReferencePart = (TaskReferencePropertiesEditionPart) this.editingPart;
			if (EnvironmentPackage.eINSTANCE.getObeoDSMObject_Description()
					.equals(msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (taskReferencePart != null)
					&& this.isAccessible(GraalViewsRepository.TaskReference.Properties.description)) {
				if (msg.getNewValue() != null) {
					taskReferencePart.setDescription(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					taskReferencePart.setDescription("");
				}
			}
			if (GraalPackage.eINSTANCE.getNode_OutgoingTransitions().equals(
					msg.getFeature())
					&& this.isAccessible(GraalViewsRepository.TaskReference.Properties.outgoingTransitions)) {
				taskReferencePart.updateOutgoingTransitions();
			}
			if (GraalPackage.eINSTANCE.getNode_IncomingTransitions().equals(
					msg.getFeature())
					&& this.isAccessible(GraalViewsRepository.TaskReference.Properties.incomingTransitions)) {
				taskReferencePart.updateIncomingTransitions();
			}
			if (GraalPackage.eINSTANCE.getTaskReference_Task().equals(
					msg.getFeature())
					&& (taskReferencePart != null)
					&& this.isAccessible(GraalViewsRepository.TaskReference.Properties.task)) {
				taskReferencePart.setTask((EObject) msg.getNewValue());
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
				GraalPackage.eINSTANCE.getNode_OutgoingTransitions(),
				GraalPackage.eINSTANCE.getNode_IncomingTransitions(),
				GraalPackage.eINSTANCE.getTaskReference_Task());
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
		return key == GraalViewsRepository.TaskReference.Properties.task;
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
				if (GraalViewsRepository.TaskReference.Properties.description == event
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
			} catch (final IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (final WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
