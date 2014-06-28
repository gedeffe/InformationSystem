package org.obeonetwork.graal.design.ui.view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.State;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.sirius.business.api.query.EObjectQuery;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.viewpoint.DAnalysis;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.part.ViewPart;
import org.obeonetwork.graal.UserStory;
import org.obeonetwork.graal.UserStoryElement;
import org.obeonetwork.graal.design.command.LinkStory;
import org.obeonetwork.graal.design.command.UnlinkStory;
import org.obeonetwork.graal.design.command.UpdateStoryActivationStatus;
import org.obeonetwork.graal.design.services.configuration.UIConfigurationServices;
import org.obeonetwork.graal.design.ui.view.command.HighlightUserStoryCommand;
import org.obeonetwork.graal.design.ui.view.util.UserStoriesCheckStateProvider;
import org.obeonetwork.graal.design.ui.view.util.UserStoriesContentProvider;
import org.obeonetwork.graal.design.ui.view.util.UserStoryLabelProvider;
import org.obeonetwork.graal.design.ui.view.util.ViewpointMultiSelectionListener;

/**
 * @author <a href="goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 * 
 */
public class UserStoriesView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.obeonetwork.graal.design.ui.view.UserStoriesView";

	private CheckboxTreeViewer viewer;

	private final AdapterFactory adapterFactory;

	private DAnalysis activeAnalysis;

	private ViewpointMultiSelectionListener selectionListener;

	/**
	 * The constructor.
	 */
	public UserStoriesView() {
		this.adapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	@Override
	public void createPartControl(final Composite parent) {
		this.viewer = new CheckboxTreeViewer(parent, SWT.BORDER | SWT.MULTI
				| SWT.V_SCROLL | SWT.H_SCROLL);
		this.viewer.setContentProvider(new UserStoriesContentProvider());
		this.viewer.setLabelProvider(new UserStoryLabelProvider(this,
				this.adapterFactory));
		this.viewer.setCheckStateProvider(new UserStoriesCheckStateProvider(
				this.viewer));
		this.viewer.addCheckStateListener(new ICheckStateListener() {

			public void checkStateChanged(final CheckStateChangedEvent event) {
				if (event.getElement() instanceof UserStory) {
					final UserStory story = (UserStory) event.getElement();
					if (UserStoriesView.this.viewer.getInput() instanceof UserStoryElement) {
						final TransactionalEditingDomain editingDomain = TransactionUtil
								.getEditingDomain(UserStoriesView.this.viewer
										.getInput());
						if (editingDomain != null) {
							if (event.getChecked()) {
								final LinkStory command = new LinkStory(
										story,
										(UserStoryElement) UserStoriesView.this.viewer
												.getInput());
								editingDomain.getCommandStack()
										.execute(command);
							} else {
								final UnlinkStory command = new UnlinkStory(
										story,
										(UserStoryElement) UserStoriesView.this.viewer
												.getInput());
								editingDomain.getCommandStack()
										.execute(command);
							}
						}
					} else if (UserStoriesView.this.viewer.getInput() instanceof Collection<?>) {
						final List<UserStoryElement> selection = new ArrayList<UserStoryElement>();
						for (final Object next : (Collection<?>) UserStoriesView.this.viewer
								.getInput()) {
							if (next instanceof UserStoryElement) {
								selection.add((UserStoryElement) next);
							}
						}
						if (!selection.isEmpty()) {
							final TransactionalEditingDomain editingDomain = TransactionUtil
									.getEditingDomain(selection.get(0));
							if (editingDomain != null) {
								if (event.getChecked()) {
									final LinkStory command = new LinkStory(
											story, selection);
									editingDomain.getCommandStack().execute(
											command);
								} else {
									final UnlinkStory command = new UnlinkStory(
											story, selection);
									editingDomain.getCommandStack().execute(
											command);
								}
							}
						}
					}
				}
				UserStoriesView.this.viewer.refresh();
			}
		});
		ColumnViewerToolTipSupport.enableFor(this.viewer);
		this.viewer
				.addSelectionChangedListener(new ISelectionChangedListener() {

					public void selectionChanged(
							final SelectionChangedEvent event) {
						final ICommandService service = (ICommandService) PlatformUI
								.getWorkbench().getService(
										ICommandService.class);
						final State state = service.getCommand(
								HighlightUserStoryCommand.COMMAND_ID).getState(
								HighlightUserStoryCommand.STATE_ID);
						state.setValue((UserStoriesView.this
								.getSelectedStories().size() == 1)
								&& UserStoriesView.this
										.isActiveUserStory(UserStoriesView.this
												.getSelectedStories().get(0)));
						service.refreshElements(
								HighlightUserStoryCommand.COMMAND_ID, null);
					}
				});

		this.viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(final DoubleClickEvent event) {
				UserStoriesView.this.updateUserStoryHighlightment();
				final ICommandService service = (ICommandService) PlatformUI
						.getWorkbench().getService(ICommandService.class);
				final State state = service.getCommand(
						HighlightUserStoryCommand.COMMAND_ID).getState(
						HighlightUserStoryCommand.STATE_ID);
				state.setValue((UserStoriesView.this.getSelectedStories()
						.size() == 1)
						&& UserStoriesView.this
								.isActiveUserStory(UserStoriesView.this
										.getSelectedStories().get(0)));
				service.refreshElements(HighlightUserStoryCommand.COMMAND_ID,
						null);
			}
		});

		this.getSite().setSelectionProvider(this.viewer);
		this.selectionListener = new ViewpointMultiSelectionListener(this) {

			@Override
			protected void eObjectSelected(final DAnalysis analysis,
					final List<EObject> selectedEObjects) {
				UserStoriesView.this.update(analysis, selectedEObjects);
			}
		};
		this.getSite().getWorkbenchWindow().getSelectionService()
				.addSelectionListener(this.selectionListener);
	}

	protected void update(final DAnalysis analysis,
			final List<EObject> selectedEObjects) {
		if (analysis != null) {
			// Retrieve the local analysis (for CDO projetcs)
			final Session session = (new EObjectQuery(analysis)).getSession();
			if (session != null) {
				final EObject analysisEObject = session.getSessionResource()
						.getContents().get(0);
				if (analysisEObject instanceof DAnalysis) {
					this.activeAnalysis = (DAnalysis) analysisEObject;
					this.viewer.setInput(selectedEObjects);
					return;
				}
			}
		}
		this.activeAnalysis = null;
		this.viewer.setInput(null);
	}

	/**
	 * @return
	 */
	public List<EObject> getInput() {
		final List<EObject> result = new ArrayList<EObject>();
		if (this.viewer.getInput() instanceof EObject) {
			result.add((EObject) this.viewer.getInput());
		} else if (this.viewer.getInput() instanceof Collection<?>) {
			for (final Object next : (Collection<?>) this.viewer.getInput()) {
				if (next instanceof EObject) {
					result.add((EObject) next);
				}
			}
		}
		return result;
	}

	/**
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<UserStory> getSelectedStories() {
		if (this.viewer.getSelection() instanceof StructuredSelection) {
			return ((StructuredSelection) this.viewer.getSelection()).toList();
		}
		return Collections.emptyList();
	}

	/**
	 * @return
	 */
	public EditingDomain getEditingDomain() {
		return this.getInput().isEmpty() ? null : TransactionUtil
				.getEditingDomain(this.getInput().get(0));
	}

	/**
	 * @return the activeAnalysis
	 */
	public DAnalysis getActiveAnalysis() {
		return this.activeAnalysis;
	}

	public boolean isActiveUserStory(final UserStory story) {
		final List<UserStory> activeUserStories = this.getActiveUserStories();
		return activeUserStories.contains(story);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#dispose()
	 */
	@Override
	public void dispose() {
		if (this.selectionListener != null) {
			this.getSite().getWorkbenchWindow().getSelectionService()
					.removeSelectionListener(this.selectionListener);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		this.viewer.getControl().setFocus();
	}

	public void refresh() {
		this.viewer.refresh();
	}

	public void updateUserStoryHighlightment() {
		if (this.getSelectedStories().size() == 1) {
			final UserStory currentStory = this.getSelectedStories().get(0);
			this.getEditingDomain()
					.getCommandStack()
					.execute(
							new UpdateStoryActivationStatus(
									this.activeAnalysis, currentStory));
			this.viewer.refresh();
		}
	}

	private List<UserStory> getActiveUserStories() {
		final List<UserStory> result = new ArrayList<UserStory>();
		if ((UIConfigurationServices.getUIConfiguration(this.activeAnalysis) != null)
				&& !UIConfigurationServices
						.getUIConfiguration(this.activeAnalysis)
						.getActiveUserStories().isEmpty()) {
			result.addAll(UIConfigurationServices.getUIConfiguration(
					this.activeAnalysis).getActiveUserStories());
		}
		return result;
	}

}