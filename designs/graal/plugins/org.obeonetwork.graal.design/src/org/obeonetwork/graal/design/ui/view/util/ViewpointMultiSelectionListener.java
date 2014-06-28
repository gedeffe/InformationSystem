/**
 * 
 */
package org.obeonetwork.graal.design.ui.view.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.sirius.viewpoint.DAnalysis;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.sirius.viewpoint.ViewpointPackage;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;

/**
 * @author <a href="goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 * 
 */
public abstract class ViewpointMultiSelectionListener implements
		ISelectionListener {

	private final IWorkbenchPart owningPart;

	/**
	 * @param owningPart
	 */
	public ViewpointMultiSelectionListener(final IWorkbenchPart owningPart) {
		this.owningPart = owningPart;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.ISelectionListener#selectionChanged(org.eclipse.ui.IWorkbenchPart,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	public void selectionChanged(final IWorkbenchPart part,
			final ISelection selection) {
		if (part != this.owningPart) {
			final List<EObject> selectedEObjects = new ArrayList<EObject>();
			DAnalysis analysis = null;
			if (!selection.isEmpty()
					&& (selection instanceof StructuredSelection)) {
				for (final Object selectedObject : ((StructuredSelection) selection)
						.toList()) {
					if (selectedObject instanceof GraphicalEditPart) {
						final GraphicalEditPart graphicalEditPart = (GraphicalEditPart) selectedObject;
						if (graphicalEditPart.getModel() instanceof View) {
							final View node = (View) graphicalEditPart
									.getModel();
							if (node.getElement() instanceof DSemanticDecorator) {
								final DSemanticDecorator semanticDecorator = (DSemanticDecorator) node
										.getElement();
								if (analysis == null) {
									final EObject rootContainer = EcoreUtil
											.getRootContainer(semanticDecorator);
									if (rootContainer instanceof DAnalysis) {
										analysis = (DAnalysis) rootContainer;
									}
								}
								selectedEObjects.add(semanticDecorator
										.getTarget());
							}
						}
					} else if (selectedObject instanceof EObject) {
						if (!ViewpointPackage.eINSTANCE.getDRepresentation()
								.isInstance(selectedObject)) {
							selectedEObjects.add((EObject) selectedObject);
						}
					}
				}
			}

			this.eObjectSelected(analysis, selectedEObjects);
		}
	}

	/**
	 * @param analysis
	 *            the active diagram.
	 * @param selectedEObject
	 *            the new selection
	 */
	protected abstract void eObjectSelected(DAnalysis analysis,
			List<EObject> selectedEObject);

}
