/*******************************************************************************
 * Copyright (c) 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.dsl.requirement.validation;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.ui.dialogs.DiagnosticDialog;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.edit.ui.EMFEditUIPlugin;
import org.eclipse.emf.edit.ui.action.ValidateAction.EclipseResourcesUtil;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.model.IConstraintStatus;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.sirius.ui.business.api.session.SessionEditorInput;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.obeonetwork.dsl.requirement.Category;
import org.obeonetwork.dsl.requirement.Repository;
import org.obeonetwork.dsl.requirement.Requirement;
import org.obeonetwork.dsl.requirement.presentation.RequirementEditor;

public class ValidateRequirementsHandler extends AbstractHandler {
	private Shell shell;
	private ResourceSet resourceSet;

	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final IEditorPart editor = HandlerUtil.getActiveEditor(event);
		final IEditorInput editorInput = HandlerUtil
				.getActiveEditorInput(event);

		if (editor instanceof RequirementEditor) {
			this.shell = HandlerUtil.getActiveShell(event);
			final RequirementEditor ed = (RequirementEditor) editor;
			this.resourceSet = ed.getEditingDomain().getResourceSet();
		} else if (editorInput instanceof SessionEditorInput) {
			this.shell = HandlerUtil.getActiveShell(event);
			this.resourceSet = ((SessionEditorInput) editorInput).getSession()
					.getTransactionalEditingDomain().getResourceSet();
		} else {
			return null;
		}
		final Collection<EObject> objects = new ArrayList<EObject>();
		for (final Resource resource : this.resourceSet.getResources()) {
			for (final EObject eObject : resource.getContents()) {
				if ((eObject instanceof Repository)
						|| (eObject instanceof Category)
						|| (eObject instanceof Requirement)) {
					objects.add(eObject);
				}
			}
		}

		this.executeValidation(objects);

		return null;

	}

	private void executeValidation(final Collection<EObject> selectedEObjects) {
		ValidationDelegateClientSelector.running = true;

		final IBatchValidator validator = ModelValidationService.getInstance()
				.newValidator(EvaluationMode.BATCH);
		// include live constraints, also, in batch validation
		validator.setOption(IBatchValidator.OPTION_INCLUDE_LIVE_CONSTRAINTS,
				true);

		final IStatus status = validator.validate(selectedEObjects);

		ValidationDelegateClientSelector.running = false;

		// Markers creation
		final EclipseResourcesUtil eclipseResourcesUtil = new EclipseResourcesUtil();
		eclipseResourcesUtil.deleteMarkers(this.resourceSet);

		final BasicDiagnostic parentDiagnostic = new BasicDiagnostic(
				EObjectValidator.DIAGNOSTIC_SOURCE, 0,
				EMFEditUIPlugin.INSTANCE
						.getString("_UI_DiagnosisOfNObjects_message",
								new String[] { Integer
										.toString(selectedEObjects.size()) }),
				selectedEObjects.toArray());
		for (final IStatus childStatus : status.getChildren()) {
			final EObject target = ((IConstraintStatus) childStatus)
					.getTarget();
			final Diagnostic childDiagnostic = new BasicDiagnostic(
					childStatus.getSeverity(), // Severity
					childStatus.getPlugin(), // Source
					childStatus.getCode(), // Code
					childStatus.getMessage(), // Message
					new Object[] { ((IConstraintStatus) childStatus)
							.getTarget() } // Data
			);
			parentDiagnostic.add(childDiagnostic);
			eclipseResourcesUtil.createMarkers(target.eResource(),
					childDiagnostic);
		}
		if (parentDiagnostic.getChildren().isEmpty()) {
			MessageDialog.openInformation(this.shell,
					"No errors during validation",
					"No errors found when validating requirements	");
		} else {
			DiagnosticDialog.open(this.shell, "Errors during validation",
					"Errors have been encountered during validation",
					parentDiagnostic);
		}

		ValidationDelegateClientSelector.running = false;

	}

}
