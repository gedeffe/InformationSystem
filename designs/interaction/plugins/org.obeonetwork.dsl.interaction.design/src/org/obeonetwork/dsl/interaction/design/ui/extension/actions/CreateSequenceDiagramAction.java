package org.obeonetwork.dsl.interaction.design.ui.extension.actions;

import java.net.URL;
import java.util.Collection;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.common.tools.api.editing.EditingDomainFactoryService;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.swt.widgets.Shell;
import org.obeonetwork.dsl.environment.ObeoDSMObject;
import org.obeonetwork.dsl.interaction.Interaction;
import org.obeonetwork.dsl.interaction.InteractionFactory;
import org.obeonetwork.dsl.interaction.design.Activator;
import org.obeonetwork.dsl.interaction.design.ui.extension.providers.InteractionAnalysisContextMenuActionProvider;

public class CreateSequenceDiagramAction extends Action {

	private static ImageDescriptor image;
	static {
		final URL url = Activator.getDefault().getBundle()
				.getEntry("images/createSequenceDiagram.gif");
		image = ImageDescriptor.createFromURL(url);
	}

	private final ObeoDSMObject context;

	public CreateSequenceDiagramAction(final ObeoDSMObject context) {
		this.context = context;
	}

	@Override
	public String getId() {
		return "org.obeonetwork.dsl.interaction.design.ui.extension.actions.CreateSequenceDiagramAction";
	}

	@Override
	public String getText() {
		return "new Sequence Diagram";
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		return image;
	}

	@Override
	public void run() {
		if (this.context == null) {
			return;
		}

		final Shell shell = Activator.getDefault().getWorkbench()
				.getActiveWorkbenchWindow().getShell();

		// TransactionalEditingDomain editingDomain =
		// EditingDomainService.getInstance().getEditingDomainProvider().getEditingDomain();
		final Session session = SessionManager.INSTANCE
				.getSession(this.context);
		if ((session == null) || (session.getSessionResource() == null)
				|| (session.getSessionResource().getResourceSet() == null)) {
			return;
		}
		final ResourceSet resourceSet = session.getSessionResource()
				.getResourceSet();
		final TransactionalEditingDomain editingDomain = EditingDomainFactoryService.INSTANCE
				.getEditingDomainFactory().getEditingDomain(resourceSet);

		final RecordingCommand cmd = new RecordingCommand(editingDomain,
				"Create Sequence diagram") {
			@Override
			protected void doExecute() {
				// Get Session
				final Session session = SessionManager.INSTANCE
						.getSession(CreateSequenceDiagramAction.this.context);

				if (session != null) {
					// Ask the user to provide a name for the diagram
					final InputDialog dialog = new InputDialog(shell,
							"New representation", "New representation name",
							"new Sequence diagram", null);
					final int buttonPressed = dialog.open();
					if (buttonPressed == InputDialog.OK) {
						final String diagramName = dialog.getValue();

						// Create a new interaction instance
						final Interaction interaction = InteractionFactory.eINSTANCE
								.createInteraction();
						CreateSequenceDiagramAction.this.context
								.getBehaviours().add(interaction);

						final Collection<RepresentationDescription> descs = DialectManager.INSTANCE
								.getAvailableRepresentationDescriptions(
										session.getSelectedViewpoints(false),
										interaction);
						for (final RepresentationDescription desc : descs) {
							final Viewpoint viewpoint = (Viewpoint) desc
									.eContainer();

							if (InteractionAnalysisContextMenuActionProvider
									.isInteractionViewpoint(viewpoint)
									&& "Sequence Diagram"
											.equals(desc.getName())) {
								// Create the new diagram
								if (DialectManager.INSTANCE.canCreate(
										interaction, desc)) {
									final DRepresentation sequenceDiagram = DialectManager.INSTANCE
											.createRepresentation(diagramName,
													interaction, desc, session,
													new NullProgressMonitor());
									if (sequenceDiagram != null) {
										DialectUIManager.INSTANCE.openEditor(
												session, sequenceDiagram,
												new NullProgressMonitor());
									}
								}
							}
						}
					}
				}
			}
		};
		editingDomain.getCommandStack().execute(cmd);
	}
}