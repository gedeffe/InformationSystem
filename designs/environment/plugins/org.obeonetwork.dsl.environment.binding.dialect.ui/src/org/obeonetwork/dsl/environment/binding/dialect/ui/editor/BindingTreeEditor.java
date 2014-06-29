/*******************************************************************************
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.dsl.environment.binding.dialect.ui.editor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.business.api.dialect.command.RefreshRepresentationsCommand;
import org.eclipse.sirius.business.api.preferences.SiriusPreferencesKeys;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionListener;
import org.eclipse.sirius.business.api.session.SessionStatus;
import org.eclipse.sirius.common.ui.SiriusTransPlugin;
import org.eclipse.sirius.ecore.extender.business.api.accessor.ModelAccessor;
import org.eclipse.sirius.ui.business.api.dialect.DefaultDialectEditorDialogFactory;
import org.eclipse.sirius.ui.business.api.dialect.DialectEditor;
import org.eclipse.sirius.ui.business.api.dialect.DialectEditorDialogFactory;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.session.IEditingSession;
import org.eclipse.sirius.ui.business.api.session.SessionEditorInput;
import org.eclipse.sirius.ui.business.api.session.SessionUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.SiriusPlugin;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorMatchingStrategy;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IEditorRegistry;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IPageListener;
import org.eclipse.ui.ISaveablePart2;
import org.eclipse.ui.ISaveablesSource;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.Saveable;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;
import org.obeonetwork.dsl.environment.BindingInfo;
import org.obeonetwork.dsl.environment.Type;
import org.obeonetwork.dsl.environment.binding.dialect.ui.editor.undoredo.UndoRedoActionHandler;
import org.obeonetwork.dsl.environment.binding.dialect.ui.treemapper.BindingTreeMapper;
import org.obeonetwork.dsl.environment.binding.dialect.ui.treemapper.BindingTreeSemanticSupport;
import org.obeonetwork.dsl.environment.binding.dialect.ui.treemapper.TreeRoot;
import org.obeonetwork.dsl.environment.binding.dialect.ui.treemapper.commands.CreateMappingsCommand;
import org.obeonetwork.dsl.environment.binding.dialect.ui.treemapper.provider.TreeDataProvider;
import org.obeonetwork.dsl.environment.bindingdialect.DBindingEdge;
import org.obeonetwork.dsl.environment.bindingdialect.DBindingEditor;
import org.obeonetwork.dsl.environment.bindingdialect.DBoundElement;

/**
 * @author sthibaudeau
 * 
 */
public class BindingTreeEditor extends EditorPart implements DialectEditor,
		SessionListener, IPageListener {

	public static final String ID = "org.obeonetwork.dsl.environment.binding.dialect.ui.editor.BindingTreeEditor"; //$NON-NLS-1$

	private DBindingEditor bindingEditorRepresentation;
	private BindingTreeEditorManager editorManager;
	private Session session;
	protected ModelAccessor accessor;
	protected DialectEditorDialogFactory myDialogFactory = new DefaultDialectEditorDialogFactory();

	private SashForm sashForm;
	private BindingTreeMapper treeMapper;
	private ScrolledComposite scrolledComposite;
	private Composite mappingDetails;
	private BindingGroupDetails grpDetailsLTR;
	private BindingGroupDetails grpDetailsRTL;
	private boolean closing = false;

	/**
	 * The {@link UndoRedoActionHandler} used to provide appropriate undo and
	 * redo Action Handlers to this editor.
	 */
	protected UndoRedoActionHandler undoRedoActionHandler;

	public BindingTreeEditor() {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(final Composite parent) {
		this.setUpUndoRedoActionHandler();

		this.sashForm = new SashForm(parent, SWT.VERTICAL);
		this.sashForm.setSashWidth(3);

		parent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		this.editorManager = new BindingTreeEditorManager(
				this.getEditingDomain(), this.accessor);
		final BindingTreeSemanticSupport treeSemanticSupport = new BindingTreeSemanticSupport(
				this.getBindingInfo(), this.editorManager);
		this.treeMapper = new BindingTreeMapper(this.sashForm,
				treeSemanticSupport);
		this.treeMapper.getLeftTreeViewer().addSelectionChangedListener(
				new ISelectionChangedListener() {
					@Override
					public void selectionChanged(
							final SelectionChangedEvent event) {
						if (event.getSelection() instanceof StructuredSelection) {
							final StructuredSelection strSelection = (StructuredSelection) event
									.getSelection();
							@SuppressWarnings("unchecked")
							final Collection<DBoundElement> selectedElements = strSelection
									.toList();
							BindingTreeEditor.this
									.populateLTRMappingDetails(selectedElements);
						}
					}
				});
		this.treeMapper.getRightTreeViewer().addSelectionChangedListener(
				new ISelectionChangedListener() {
					@Override
					public void selectionChanged(
							final SelectionChangedEvent event) {
						if (event.getSelection() instanceof StructuredSelection) {
							final StructuredSelection strSelection = (StructuredSelection) event
									.getSelection();
							@SuppressWarnings("unchecked")
							final Collection<DBoundElement> selectedElements = strSelection
									.toList();
							BindingTreeEditor.this
									.populateRTLMappingDetails(selectedElements);
						}
					}
				});

		final TreeDataProvider treeDataProvider = new TreeDataProvider(
				this.getBindingInfo());
		final DBoundElement left = treeDataProvider.getLeftRoot();
		final DBoundElement right = treeDataProvider.getRightRoot();
		final List<DBindingEdge> edges = treeDataProvider.getEdges();

		this.treeMapper
				.setInput(new TreeRoot(left), new TreeRoot(right), edges);

		this.createBindingGroupDetails(this.sashForm);
		this.grpDetailsLTR.setText(this.getBindingDetailsLabel(left, right));
		this.grpDetailsRTL.setText(this.getBindingDetailsLabel(right, left));

		this.sashForm.setWeights(new int[] { 70, 30 });

		// Expand the first levels on the two trees
		this.treeMapper.getLeftTreeViewer().expandToLevel(2);
		this.treeMapper.getRightTreeViewer().expandToLevel(2);

		this.revealBoundElements(edges);
	}

	private void createBindingGroupDetails(final Composite parent) {
		final Composite bottom = new Composite(parent, SWT.NONE);
		bottom.setLayout(new GridLayout(1, false));

		final Button autoBindBtn = new Button(bottom, SWT.NONE);
		autoBindBtn.setText("Auto bind !");
		autoBindBtn.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false,
				false, 1, 1));
		autoBindBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(final MouseEvent e) {
				BindingTreeEditor.this.autoBind();
			}
		});

		this.scrolledComposite = new ScrolledComposite(bottom, SWT.BORDER
				| SWT.H_SCROLL | SWT.V_SCROLL);
		this.scrolledComposite.setExpandHorizontal(true);
		this.scrolledComposite.setExpandVertical(true);
		this.scrolledComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
				true, true, 1, 1));

		this.mappingDetails = new Composite(this.scrolledComposite, SWT.NONE);
		final FormLayout fl_mappingDetails = new FormLayout();
		fl_mappingDetails.marginWidth = 10;
		fl_mappingDetails.marginHeight = 5;
		this.mappingDetails.setLayout(fl_mappingDetails);

		this.createLTRBindingGroupDetails(this.mappingDetails);
		this.createRTLBindingGroupDetails(this.mappingDetails);

		this.scrolledComposite.setContent(this.mappingDetails);
		this.scrolledComposite.setMinSize(this.mappingDetails.computeSize(
				SWT.DEFAULT, SWT.DEFAULT));
	}

	private void createLTRBindingGroupDetails(final Composite parent) {
		this.grpDetailsLTR = new BindingGroupDetails(parent, null,
				this.editorManager);
	}

	private void createRTLBindingGroupDetails(final Composite parent) {
		this.grpDetailsRTL = new BindingGroupDetails(parent,
				this.grpDetailsLTR.getGroup(), this.editorManager);
	}

	private void autoBind() {
		final TreeRoot leftRoot = (TreeRoot) this.treeMapper
				.getLeftTreeViewer().getInput();
		final DBoundElement leftRootElement = leftRoot.getElement();

		final TreeRoot rightRoot = (TreeRoot) this.treeMapper
				.getRightTreeViewer().getInput();
		final DBoundElement rightRootElement = rightRoot.getElement();

		// collect candidates to auto bind
		final List<DBoundElement> leftCandidates = new ArrayList<DBoundElement>();
		for (final DBoundElement leftItem : leftRootElement.getChildren()) {
			if (leftItem.getEdgesAsLeft().isEmpty()) {
				leftCandidates.add(leftItem);
			}
		}
		final List<DBoundElement> rightCandidates = new ArrayList<DBoundElement>();
		for (final DBoundElement rightItem : rightRootElement.getChildren()) {
			if (rightItem.getEdgesAsRight().isEmpty()) {
				rightCandidates.add(rightItem);
			}
		}

		final List<DBoundElement> leftElementsToBind = new ArrayList<DBoundElement>();
		final List<DBoundElement> rightElementsToBind = new ArrayList<DBoundElement>();
		while ((leftCandidates.isEmpty() == false)
				&& (rightCandidates.isEmpty() == false)) {
			final DBoundElement left = leftCandidates.remove(0);
			for (final DBoundElement right : rightCandidates) {
				if (this.getPropertyLabel(left.getTarget()).equals(
						this.getPropertyLabel(right.getTarget()))) {
					leftElementsToBind.add(left);
					rightElementsToBind.add(right);
					rightCandidates.remove(right);
					break;
				}
			}
		}
		if (leftElementsToBind.size() > 0) {
			this.editorManager.execute(new CreateMappingsCommand(this
					.getEditingDomain(), this.getBindingInfo(),
					leftElementsToBind, rightElementsToBind));
			this.doRefresh();
		}
	}

	private String getPropertyLabel(final EObject property) {
		String label = "";
		if (property instanceof org.obeonetwork.dsl.entity.Property) {
			label = ((org.obeonetwork.dsl.entity.Property) property).getName();
		} else if (property instanceof org.obeonetwork.dsl.environment.Property) {
			label = ((org.obeonetwork.dsl.environment.Property) property)
					.getName();
		}
		return label;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.part.EditorPart#init(org.eclipse.ui.IEditorSite,
	 *      org.eclipse.ui.IEditorInput)
	 */
	@Override
	public void init(final IEditorSite site, final IEditorInput input)
			throws PartInitException {
		this.setSite(site);
		this.setInput(input);

		if (input instanceof SessionEditorInput) {
			final URI uri = ((SessionEditorInput) input).getURI();
			this.session = ((SessionEditorInput) input).getSession();
			this.setBindingEditorRepresentation(this
					.getBindingEditorRepresentation(uri, false));
		}

		if (this.session != null) {
			this.session.addListener(this);
		}

		final IEditingSession uiSession = SessionUIManager.INSTANCE
				.getOrCreateUISession(this.session);
		uiSession.open();
		uiSession.attachEditor(this);
		this.setAccessor(SiriusPlugin.getDefault().getModelAccessorRegistry()
				.getModelAccessor(this.getBindingEditorRepresentation()));

		/*
		 * let's activate the model listening
		 */
		// final DTreeElementSynchronizer sync = new
		// DTreeElementSynchronizerSpec(accessor, getInterpreter());
		// getTreeModel().activate(sync);
		/* Update title. Semantic tree could have been renamed */
		this.notify(PROP_TITLE);
	}

	/**
	 * @param accessor
	 *            the accessor to set
	 */
	private void setAccessor(final ModelAccessor accessor) {
		this.accessor = accessor;
	}

	private void populateLTRMappingDetails(
			final Collection<DBoundElement> elements) {
		this.grpDetailsLTR.setBoundElements(new LinkedHashSet<DBoundElement>(
				elements));
		this.mappingDetails.layout(true);
		this.scrolledComposite.setMinSize(this.mappingDetails.computeSize(
				SWT.DEFAULT, SWT.DEFAULT));
	}

	private void populateRTLMappingDetails(
			final Collection<DBoundElement> elements) {
		this.grpDetailsRTL.setBoundElements(new LinkedHashSet<DBoundElement>(
				elements));
		this.mappingDetails.layout(true);
		this.scrolledComposite.setMinSize(this.mappingDetails.computeSize(
				SWT.DEFAULT, SWT.DEFAULT));
	}

	/**
	 * Closes this editor
	 * 
	 * @param save
	 *            indicates whether the modifications should be saved or not
	 */
	public void close(final boolean save) {
		final Display display = this.getSite().getShell().getDisplay();
		display.asyncExec(new Runnable() {
			@Override
			public void run() {
				PlatformUI.getWorkbench().getActiveWorkbenchWindow()
						.getActivePage()
						.closeEditor(BindingTreeEditor.this, save);
			}
		});
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.ide.IGotoMarker#gotoMarker(org.eclipse.core.resources.IMarker)
	 */
	@Override
	public void gotoMarker(final IMarker marker) {

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.edit.domain.IEditingDomainProvider#getEditingDomain()
	 */
	@Override
	public TransactionalEditingDomain getEditingDomain() {
		return this.session.getTransactionalEditingDomain();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.viewpoint.ui.business.api.dialect.DialectEditor#getRepresentation()
	 */
	@Override
	public DRepresentation getRepresentation() {
		return this.getBindingEditorRepresentation();
	}

	public DBindingEditor getBindingEditorRepresentation() {
		return this.bindingEditorRepresentation;
	}

	private void setBindingEditorRepresentation(
			final DBindingEditor bindingEditorRepresentation) {
		this.bindingEditorRepresentation = bindingEditorRepresentation;
	}

	private DBindingEditor getBindingEditorRepresentation(final URI uri,
			final boolean loadOnDemand) {
		DBindingEditor result = null;
		final Resource resource = this.getEditingDomain().getResourceSet()
				.getResource(uri.trimFragment(), loadOnDemand);
		if ((resource != null) && resource.isLoaded()) {
			if (uri.fragment() != null) {
				final EObject rootElement = resource.getEObject(uri.fragment());
				if (rootElement instanceof DBindingEditor) {
					result = (DBindingEditor) rootElement;
				}
			}
		}
		return result;
	}

	private BindingInfo getBindingInfo() {
		return (BindingInfo) this.getBindingEditorRepresentation().getTarget();
	}

	protected boolean isAutoRefresh() {
		boolean autoRefresh = false;
		try {
			autoRefresh = SiriusPlugin.getDefault().getPluginPreferences()
					.getBoolean(SiriusPreferencesKeys.PREF_AUTO_REFRESH.name());
		} catch (final IllegalArgumentException e) {
			SiriusTransPlugin
					.getPlugin()
					.getLog()
					.log(new Status(IStatus.ERROR, SiriusTransPlugin.PLUGIN_ID,
							IStatus.OK, e.getMessage(), e));
		}
		return autoRefresh;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.viewpoint.ui.business.api.dialect.DialectEditor#setDialogFactory(fr.obeo.dsl.viewpoint.ui.business.api.dialect.DialectEditorDialogFactory)
	 */
	@Override
	public void setDialogFactory(final DialectEditorDialogFactory dialogFactory) {
		this.myDialogFactory = dialogFactory;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.viewpoint.ui.business.api.dialect.DialectEditor#validateRepresentation()
	 */
	@Override
	public void validateRepresentation() {
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.part.EditorPart#doSave(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void doSave(final IProgressMonitor progressMonitor) {
		this.performSave(false, progressMonitor);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.part.EditorPart#doSaveAs()
	 */
	@Override
	public void doSaveAs() {
		if (this.isSaveAsAllowed()) {
			this.performSaveAs(new NullProgressMonitor());
		}
	}

	/**
	 * Performs the save and handles errors appropriately.
	 * 
	 * @param overwrite
	 *            indicates whether or not overwriting is allowed
	 * @param progressMonitor
	 *            the monitor in which to run the operation
	 * 
	 */
	protected void performSave(final boolean overwrite,
			final IProgressMonitor progressMonitor) {
		this.session.save(progressMonitor);
	}

	/**
	 * Perform the saveAs action.
	 * 
	 * @param progressMonitor
	 *            The progress monitor
	 */
	private void performSaveAs(final IProgressMonitor progressMonitor) {
		final Shell shell = this.getSite().getShell();
		final IEditorInput input = this.getEditorInput();
		final SaveAsDialog dialog = new SaveAsDialog(shell);
		final IFile original = input instanceof IFileEditorInput ? ((IFileEditorInput) input)
				.getFile() : null;
		if (original != null) {
			dialog.setOriginalFile(original);
		}
		dialog.create();

		if (dialog.open() == Window.CANCEL) {
			if (progressMonitor != null) {
				progressMonitor.setCanceled(true);
			}
		} else {
			final IPath filePath = dialog.getResult();
			if (filePath == null) {
				if (progressMonitor != null) {
					progressMonitor.setCanceled(true);
				}
				return;
			}
			final IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace()
					.getRoot();
			final IFile file = workspaceRoot.getFile(filePath);
			final IEditorInput newInput = new FileEditorInput(file);
			// Check if the editor is already open
			final IEditorMatchingStrategy matchingStrategy = this
					.getEditorDescriptor().getEditorMatchingStrategy();
			final IEditorReference[] editorRefs = PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getActivePage()
					.getEditorReferences();
			for (int i = 0; i < editorRefs.length; i++) {
				if (matchingStrategy.matches(editorRefs[i], newInput)) {
					return;
				}
			}
			final boolean success = false;
			if (progressMonitor != null) {
				progressMonitor.setCanceled(!success);
			}
		}
	}

	/**
	 * Retrieves the descriptor for this editor.
	 * 
	 * @return the editor descriptor
	 */
	protected final IEditorDescriptor getEditorDescriptor() {
		final IEditorRegistry editorRegistry = PlatformUI.getWorkbench()
				.getEditorRegistry();
		final IEditorDescriptor editorDesc = editorRegistry.findEditor(this
				.getSite().getId());
		return editorDesc;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.part.EditorPart#isDirty()
	 */
	@Override
	public boolean isDirty() {
		return this.session.getStatus() == SessionStatus.DIRTY;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.part.EditorPart#isSaveAsAllowed()
	 */
	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	/**
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public void setFocus() {
		this.checkSemanticAssociation();
	}

	private void checkSemanticAssociation() {
		if ((this.closing == false)
				&& ((this.getBindingEditorRepresentation() == null)
						|| (this.getBindingEditorRepresentation().eResource() == null)
						|| (this.getBindingEditorRepresentation().getTarget() == null) || (this
						.getBindingEditorRepresentation().getTarget()
						.eResource() == null))) {
			/*
			 * The element has been deleted, we should close the editor
			 */
			this.myDialogFactory.editorWillBeClosedInformationDialog(this
					.getSite().getShell());
			this.closing = DialectUIManager.INSTANCE.closeEditor(this, false);
		}
	}

	@Override
	public void notify(final int changeKind) {
		switch (changeKind) {
		case DIRTY:
			this.firePropertyChangeInUIThread(IEditorPart.PROP_DIRTY);
			break;
		case SYNC:
			this.firePropertyChangeInUIThread(IEditorPart.PROP_DIRTY);
			break;
		case PROP_TITLE:
			this.firePropertyChangeInUIThread(PROP_TITLE);
			break;
		case REPLACED:
			/* session was reload, we need to reload the table or close it */
			this.launchRefresh();
			break;
		default:
			break;
		}
	}

	private void launchRefresh() {
		this.getEditingDomain()
				.getCommandStack()
				.execute(
						new RefreshRepresentationsCommand(this
								.getEditingDomain(), new NullProgressMonitor(),
								this.getBindingEditorRepresentation()));
		this.doRefresh();
	}

	public void doRefresh() {
		final TreeDataProvider treeDataProvider = new TreeDataProvider(
				this.getBindingInfo());
		final DBoundElement left = treeDataProvider.getLeftRoot();
		final DBoundElement right = treeDataProvider.getRightRoot();
		final List<DBindingEdge> edges = treeDataProvider.getEdges();
		this.treeMapper
				.setInput(new TreeRoot(left), new TreeRoot(right), edges);
		this.treeMapper.refresh();
		this.treeMapper.getLeftTreeViewer().expandToLevel(2);
		this.treeMapper.getRightTreeViewer().expandToLevel(2);
	}

	private void revealBoundElements(final List<DBindingEdge> edges) {
		for (final DBindingEdge dBindingEdge : edges) {
			this.treeMapper.getLeftTreeViewer().reveal(dBindingEdge.getLeft());
			this.treeMapper.getRightTreeViewer()
					.reveal(dBindingEdge.getRight());
		}
	}

	private void firePropertyChangeInUIThread(final int notificationKind) {
		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			@Override
			public void run() {
				if (notificationKind == PROP_TITLE) {
					BindingTreeEditor.this.setPartName(BindingTreeEditor.this
							.getRepresentation().getName());
				}
				BindingTreeEditor.this.firePropertyChange(notificationKind);
			}
		});
	}

	private String getBindingDetailsLabel(final DBoundElement first,
			final DBoundElement second) {
		String label = "Binding details : ";
		if (first.getTarget() instanceof Type) {
			label += ((Type) first.getTarget()).getName();
		}
		label += " --> ";
		if (second.getTarget() instanceof Type) {
			label += ((Type) second.getTarget()).getName();
		}

		return label;
	}

	/**
	 * Initializes an UndoRedoActionHandler, which purpose is to provide
	 * appropriate undo and redo Action Handlers to this editor.
	 */
	protected void setUpUndoRedoActionHandler() {
		final IWorkbenchWindow workbenchWindow = this.getEditorSite()
				.getWorkbenchWindow();
		if (workbenchWindow != null) {
			final IWorkbenchPage part = workbenchWindow.getActivePage();
			if (part != null) {
				this.undoRedoActionHandler = new UndoRedoActionHandler(this,
						this.getEditingDomain());
			}
		}
		// If the UndoRedoActionHandler was not create
		if (this.undoRedoActionHandler == null) {
			// We register the current editor as listening the page opening
			// The UndoRedoActionHandler will be created whenever the page will
			// open
			this.getEditorSite().getWorkbenchWindow().addPageListener(this);
		}
	}

	@Override
	public void pageActivated(final IWorkbenchPage page) {
		this.setUpUndoRedoActionHandler();
	}

	@Override
	public void pageClosed(final IWorkbenchPage page) {
	}

	@Override
	public void pageOpened(final IWorkbenchPage page) {
	}

	@Override
	public Saveable[] getSaveables() {
		final IEditingSession uiSession = SessionUIManager.INSTANCE
				.getOrCreateUISession(this.session);
		return ((ISaveablesSource) uiSession).getSaveables();
	}

	@Override
	public Saveable[] getActiveSaveables() {
		final IEditingSession uiSession = SessionUIManager.INSTANCE
				.getOrCreateUISession(this.session);
		return ((ISaveablesSource) uiSession).getActiveSaveables();
	}

	@Override
	public int promptToSaveOnClose() {
		int choice = ISaveablePart2.DEFAULT;
		if ((this.session != null) && this.session.isOpen()) {
			final IEditingSession uiSession = SessionUIManager.INSTANCE
					.getUISession(this.session);
			// Close all && Still open elsewhere detection.
			if ((uiSession != null) && uiSession.needToBeSavedOnClose(this)) {
				choice = uiSession.promptToSaveOnClose();
			}
		}
		return choice;
	}

	@Override
	public DialectEditorDialogFactory getDialogFactory() {
		return this.myDialogFactory;
	}

	@Override
	public boolean needsRefresh(final int propId) {
		if (propId == DialectEditor.PROP_REFRESH) {
			if (this.isAutoRefresh()) {
				return true;
			}
		} else if (propId == DialectEditor.PROP_FORCE_REFRESH) {
			return true;
		}
		return false;
	}

}
