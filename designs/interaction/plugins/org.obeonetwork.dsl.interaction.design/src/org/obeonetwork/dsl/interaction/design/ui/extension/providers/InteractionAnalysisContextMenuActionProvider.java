package org.obeonetwork.dsl.interaction.design.ui.extension.providers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.ui.tools.internal.views.modelexplorer.extension.IContextMenuActionProvider;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.obeonetwork.dsl.environment.ObeoDSMObject;
import org.obeonetwork.dsl.interaction.Interaction;
import org.obeonetwork.dsl.interaction.design.ui.extension.actions.CreateSequenceDiagramAction;
import org.obeonetwork.dsl.interaction.design.ui.extension.actions.NewSequenceDiagramMenuAction;

public class InteractionAnalysisContextMenuActionProvider implements
		IContextMenuActionProvider {

	@Override
	public Iterable<IAction> getContextMenuActions(final ISelection selection) {
		final List<IAction> actions = new ArrayList<IAction>();

		if (selection instanceof IStructuredSelection) {
			final IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.size() == 1) {
				final Object selectedObject = structuredSelection
						.getFirstElement();
				if ((selectedObject instanceof ObeoDSMObject)
						&& !(selectedObject instanceof Interaction)) {
					// Let's check if the "Interaction" viewpoint is selected
					final Session session = SessionManager.INSTANCE
							.getSession((ObeoDSMObject) selectedObject);
					if (session != null) {
						for (final Viewpoint viewpoint : session
								.getSelectedViewpoints(false)) {
							if (isInteractionViewpoint(viewpoint)) {
								final IAction action = this
										.computeAction((ObeoDSMObject) selectedObject);
								if (action != null) {
									actions.add(action);
								}
								break;
							}
						}
					}
				}
			}
		}
		return actions;
	}

	@Override
	public Iterable<IContributionItem> getContextualMenuContributionItems(
			final ISelection selection) {
		return Collections.emptyList();
	}

	private IAction computeAction(final ObeoDSMObject context) {
		// Try to get the "New ..." menu item provided by Viewpoint
		final MenuManager menuManager = this.getModelContentMenuManager();
		if (menuManager != null) {
			// Reuse existing menu
			for (final IContributionItem item : menuManager.getItems()) {
				if (item instanceof MenuManager) {
					final MenuManager menuMgr = (MenuManager) item;
					if ("New ...".equals(menuMgr.getMenuText())) {
						// Add our action to the menu
						menuMgr.add(new CreateSequenceDiagramAction(context));
						return null;
					}
				}
			}
		}
		// No "New ..." Menu provided by Viewpoint, let's add ours
		return new NewSequenceDiagramMenuAction(context);
	}

	/**
	 * Retrieves the MenuManager for the Model Content view so we can provide
	 * our own action into the default Viewpoint menu
	 * 
	 * @return
	 */
	private MenuManager getModelContentMenuManager() {
		// TODO Fix to retrieve existing "new representation" menu
		return null;
		//
		// IViewPart modelContentView = PlatformUI.getWorkbench()
		// .getActiveWorkbenchWindow()
		// .getActivePage()
		// .findView("fr.obeo.dsl.viewpoint.ui.tools.views.model.explorer");
		// // .findView("fr.obeo.dsl.viewpoint.ui.tools.views.sessionview");
		// try {
		// Field f = DesignerSessionView.class.getDeclaredField("contextMenu");
		// f.setAccessible(true);
		// return (MenuManager)f.get(modelContentView);
		// } catch (SecurityException e) {
		// e.printStackTrace();
		// } catch (NoSuchFieldException e) {
		// e.printStackTrace();
		// } catch (IllegalArgumentException e) {
		// e.printStackTrace();
		// } catch (IllegalAccessException e) {
		// e.printStackTrace();
		// }
		// return null;
	}

	public static boolean isInteractionViewpoint(final Viewpoint viewpoint) {
		if ((viewpoint == null) || (viewpoint.eResource() == null)
				|| (viewpoint.eResource().getURI() == null)) {
			return false;
		}
		return "platform:/plugin/org.obeonetwork.dsl.interaction.design/description/interaction.odesign"
				.equals(viewpoint.eResource().getURI().toString())
				&& "Interaction".equals(viewpoint.getName());
	}
}
