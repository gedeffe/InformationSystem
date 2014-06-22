/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.requirement.components;

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
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.obeonetwork.dsl.requirement.Requirement;
import org.obeonetwork.dsl.requirement.RequirementPackage;
import org.obeonetwork.dsl.requirement.parts.AdvancedPropertiesEditionPart;
import org.obeonetwork.dsl.requirement.parts.RequirementViewsRepository;

// End of user code

/**
 * 
 * 
 */
public class RequirementAdvancedPropertiesEditionComponent extends
		SinglePartPropertiesEditingComponent {

	public static String ADVANCED_PART = "Advanced"; //$NON-NLS-1$

	/**
	 * Settings for referencedObject ReferencesTable
	 */
	private ReferencesTableSettings referencedObjectSettings;

	/**
	 * Default constructor
	 * 
	 */
	public RequirementAdvancedPropertiesEditionComponent(
			final PropertiesEditingContext editingContext,
			final EObject requirement, final String editing_mode) {
		super(editingContext, requirement, editing_mode);
		this.parts = new String[] { ADVANCED_PART };
		this.repositoryKey = RequirementViewsRepository.class;
		this.partKey = RequirementViewsRepository.Advanced.class;
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

			final Requirement requirement = (Requirement) elt;
			final AdvancedPropertiesEditionPart advancedPart = (AdvancedPropertiesEditionPart) this.editingPart;
			// init values
			if (this.isAccessible(RequirementViewsRepository.Advanced.rationale)) {
				advancedPart.setRationale(EcoreUtil.convertToString(
						EcorePackage.Literals.ESTRING,
						requirement.getRationale()));
			}
			if (this.isAccessible(RequirementViewsRepository.Advanced.acceptanceCriteria)) {
				advancedPart.setAcceptanceCriteria(EcoreUtil.convertToString(
						EcorePackage.Literals.ESTRING,
						requirement.getAcceptanceCriteria()));
			}
			if (this.isAccessible(RequirementViewsRepository.Advanced.referencedObject)) {
				this.referencedObjectSettings = new ReferencesTableSettings(
						requirement,
						RequirementPackage.eINSTANCE
								.getRequirement_ReferencedObject());
				advancedPart
						.initReferencedObject(this.referencedObjectSettings);
			}
			// init filters

			if (this.isAccessible(RequirementViewsRepository.Advanced.referencedObject)) {
				advancedPart.addFilterToReferencedObject(new ViewerFilter() {

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
							return (!advancedPart
									.isContainedInReferencedObjectTable((EObject) element));
						}
						return (element instanceof String)
								&& element.equals("");
					}

				});
				advancedPart
						.addFilterToReferencedObject(new EObjectStrictFilter(
								EcorePackage.Literals.EOBJECT));
				// Start of user code for additional businessfilters for
				// referencedObject
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
		if (editorKey == RequirementViewsRepository.Advanced.rationale) {
			return RequirementPackage.eINSTANCE.getRequirement_Rationale();
		}
		if (editorKey == RequirementViewsRepository.Advanced.acceptanceCriteria) {
			return RequirementPackage.eINSTANCE
					.getRequirement_AcceptanceCriteria();
		}
		if (editorKey == RequirementViewsRepository.Advanced.referencedObject) {
			return RequirementPackage.eINSTANCE
					.getRequirement_ReferencedObject();
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
		final Requirement requirement = (Requirement) this.semanticObject;
		if (RequirementViewsRepository.Advanced.rationale == event
				.getAffectedEditor()) {
			requirement.setRationale((java.lang.String) EEFConverterUtil
					.createFromString(EcorePackage.Literals.ESTRING,
							(String) event.getNewValue()));
		}
		if (RequirementViewsRepository.Advanced.acceptanceCriteria == event
				.getAffectedEditor()) {
			requirement
					.setAcceptanceCriteria((java.lang.String) EEFConverterUtil
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
			final AdvancedPropertiesEditionPart advancedPart = (AdvancedPropertiesEditionPart) this.editingPart;
			if (RequirementPackage.eINSTANCE.getRequirement_Rationale().equals(
					msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (advancedPart != null)
					&& this.isAccessible(RequirementViewsRepository.Advanced.rationale)) {
				if (msg.getNewValue() != null) {
					advancedPart.setRationale(EcoreUtil.convertToString(
							EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					advancedPart.setRationale("");
				}
			}
			if (RequirementPackage.eINSTANCE
					.getRequirement_AcceptanceCriteria().equals(
							msg.getFeature())
					&& msg.getNotifier().equals(this.semanticObject)
					&& (advancedPart != null)
					&& this.isAccessible(RequirementViewsRepository.Advanced.acceptanceCriteria)) {
				if (msg.getNewValue() != null) {
					advancedPart.setAcceptanceCriteria(EcoreUtil
							.convertToString(EcorePackage.Literals.ESTRING,
									msg.getNewValue()));
				} else {
					advancedPart.setAcceptanceCriteria("");
				}
			}
			if (RequirementPackage.eINSTANCE.getRequirement_ReferencedObject()
					.equals(msg.getFeature())
					&& this.isAccessible(RequirementViewsRepository.Advanced.referencedObject)) {
				advancedPart.updateReferencedObject();
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
				RequirementPackage.eINSTANCE.getRequirement_Rationale(),
				RequirementPackage.eINSTANCE
						.getRequirement_AcceptanceCriteria(),
				RequirementPackage.eINSTANCE.getRequirement_ReferencedObject());
		return new NotificationFilter[] { filter, };
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getHelpContent(java.lang.Object,
	 *      int)
	 * 
	 */
	@Override
	public String getHelpContent(final Object key, final int kind) {
		if (key == RequirementViewsRepository.Requirement_.statement) {
			return "Statement of what the requirement is, including a definition of whether the requirement shall be met, should be met, or may be met."; //$NON-NLS-1$
		}
		if (key == RequirementViewsRepository.Advanced.rationale) {
			return "Statement of why the requirement exists."; //$NON-NLS-1$
		}
		if (key == RequirementViewsRepository.Advanced.acceptanceCriteria) {
			return "Acceptance criteria Statement of what tests will be carried out to ensure that the requirement will be met."; //$NON-NLS-1$
		}
		return super.getHelpContent(key, kind);
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
				if (RequirementViewsRepository.Advanced.rationale == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(RequirementPackage.eINSTANCE
										.getRequirement_Rationale()
										.getEAttributeType(), (String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							RequirementPackage.eINSTANCE
									.getRequirement_Rationale()
									.getEAttributeType(), newValue);
				}
				if (RequirementViewsRepository.Advanced.acceptanceCriteria == event
						.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil
								.createFromString(RequirementPackage.eINSTANCE
										.getRequirement_AcceptanceCriteria()
										.getEAttributeType(), (String) newValue);
					}
					ret = Diagnostician.INSTANCE.validate(
							RequirementPackage.eINSTANCE
									.getRequirement_AcceptanceCriteria()
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
