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
package org.obeonetwork.dsl.environment.binding.dialect.ui.dialect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.tree.provider.TreeItemProviderAdapterFactory;
import org.eclipse.emf.transaction.RunnableWithResult;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.dialect.command.RefreshRepresentationsCommand;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ui.business.api.dialect.DialectEditor;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIServices;
import org.eclipse.sirius.ui.business.api.dialect.ExportFormat;
import org.eclipse.sirius.ui.business.api.session.SessionEditorInput;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.sirius.viewpoint.description.DescriptionPackage;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.RepresentationExtensionDescription;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.obeonetwork.dsl.environment.binding.dialect.ui.editor.BindingTreeEditor;
import org.obeonetwork.dsl.environment.bindingdialect.DBindingEditor;
import org.obeonetwork.dsl.environment.bindingdialect.description.DBindingEditorCreationDescription;
import org.obeonetwork.dsl.environment.bindingdialect.description.DBindingEditorDescription;
import org.obeonetwork.dsl.environment.bindingdialect.description.DescriptionFactory;
import org.obeonetwork.dsl.environment.bindingdialect.description.provider.DescriptionItemProviderAdapterFactory;
import org.obeonetwork.dsl.environment.bindingdialect.provider.BindingdialectItemProviderAdapterFactory;

/**
 * @author sthibaudeau
 * 
 */
public class BindingDialectUIServices implements DialectUIServices {

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.viewpoint.ui.business.api.dialect.DialectUIServices#canHandle(fr.obeo.dsl.viewpoint.DRepresentation)
	 */
	@Override
	public boolean canHandle(final DRepresentation representation) {
		return representation instanceof DBindingEditor;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.viewpoint.ui.business.api.dialect.DialectUIServices#canHandleEditor(org.eclipse.ui.IEditorPart)
	 */
	@Override
	public boolean canHandleEditor(final IEditorPart editor) {
		return editor instanceof BindingTreeEditor;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.viewpoint.ui.business.api.dialect.DialectUIServices#getEditorName(fr.obeo.dsl.viewpoint.DRepresentation)
	 */
	@Override
	public String getEditorName(final DRepresentation representation) {
		return representation.getName();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.viewpoint.ui.business.api.dialect.DialectUIServices#closeEditor(org.eclipse.ui.IEditorPart,
	 *      boolean)
	 */
	@Override
	public boolean closeEditor(final IEditorPart editorPart, final boolean save) {
		boolean result = false;
		if (this.canHandleEditor(editorPart)) {
			try {
				((BindingTreeEditor) editorPart).close(save);
			} catch (final NullPointerException e) {
				// we might have an exception closing an editor which is
				// already in trouble
			}
			// We suppose it is closed.
			result = true;
		}
		return result;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.viewpoint.ui.business.api.dialect.DialectUIServices#createAdapterFactory()
	 */
	@Override
	public AdapterFactory createAdapterFactory() {
		final ComposedAdapterFactory factory = new ComposedAdapterFactory();
		factory.addAdapterFactory(new BindingdialectItemProviderAdapterFactory());
		factory.addAdapterFactory(new DescriptionItemProviderAdapterFactory());
		factory.addAdapterFactory(new TreeItemProviderAdapterFactory());
		return factory;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.viewpoint.ui.business.api.dialect.DialectUIServices#isRepresentationManagedByEditor(fr.obeo.dsl.viewpoint.DRepresentation,
	 *      org.eclipse.ui.IEditorPart)
	 */
	@Override
	public boolean isRepresentationManagedByEditor(
			final DRepresentation representation, final IEditorPart editor) {
		if (this.canHandleEditor(editor)) {
			return ((DialectEditor) editor).getRepresentation().equals(
					representation);
		} else {
			return false;
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.viewpoint.ui.business.api.dialect.DialectUIServices#isRepresentationDescriptionManagedByEditor(fr.obeo.dsl.viewpoint.description.RepresentationDescription,
	 *      org.eclipse.ui.IEditorPart)
	 */
	@Override
	public boolean isRepresentationDescriptionManagedByEditor(
			final RepresentationDescription description,
			final IEditorPart editor) {
		if (this.canHandleEditor(editor)) {
			final BindingTreeEditor bindingEditor = (BindingTreeEditor) editor;
			return EcoreUtil.equals(bindingEditor
					.getBindingEditorRepresentation().getDescription(),
					description);
		} else {
			return false;
		}
	}

	@Override
	public IEditorPart openEditor(final Session session,
			final DRepresentation representation, final IProgressMonitor monitor) {
		if (representation instanceof DBindingEditor) {
			final URI uri = EcoreUtil.getURI(representation);
			final TransactionalEditingDomain domain = session
					.getTransactionalEditingDomain();
			final IEditorInput editorInput = new SessionEditorInput(uri,
					this.getEditorName(representation), session);
			final RunnableWithResult<IEditorPart> runnable = new RunnableWithResult.Impl<IEditorPart>() {
				@Override
				public void run() {
					final IWorkbenchPage page = PlatformUI.getWorkbench()
							.getActiveWorkbenchWindow().getActivePage();
					try {
						this.setResult(page.openEditor(editorInput,
								BindingTreeEditor.ID));
					} catch (final PartInitException e) {
						// silent catch
					}
				}
			};
			PlatformUI.getWorkbench().getDisplay().syncExec(runnable);
			final Object result = runnable.getResult();
			if ((result instanceof IEditorPart)
					&& this.canHandleEditor((IEditorPart) result)) {
				// Activation of the refresh of the DBindingEditor property page
				if (result instanceof BindingTreeEditor) {
					// TODO v�rifier s'il faut enlever des choses
					this.doRefresh((DBindingEditor) representation, domain);
				}
				return (IEditorPart) result;
			}
		}
		return null;
	}

	private void doRefresh(final DBindingEditor editor,
			final TransactionalEditingDomain domain) {
		if (DialectManager.INSTANCE.canRefresh(editor)) {
			final Runnable runnable = new Runnable() {
				@Override
				public void run() {
					domain.getCommandStack().execute(
							new RefreshRepresentationsCommand(domain,
									new NullProgressMonitor(), editor));
				};
			};
			PlatformUI.getWorkbench().getDisplay().syncExec(runnable);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.viewpoint.ui.business.api.dialect.DialectUIServices#provideNewChildDescriptors()
	 */
	@Override
	public Collection<CommandParameter> provideNewChildDescriptors() {
		final Collection<CommandParameter> newChilds = new ArrayList<CommandParameter>();
		final DBindingEditorDescription description = DescriptionFactory.eINSTANCE
				.createDBindingEditorDescription();
		newChilds.add(new CommandParameter(null,
				DescriptionPackage.Literals.VIEWPOINT__OWNED_REPRESENTATIONS,
				description));
		return newChilds;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.viewpoint.ui.business.api.dialect.DialectUIServices#provideRepresentationCreationToolDescriptors(java.lang.Object)
	 */
	@Override
	public Collection<CommandParameter> provideRepresentationCreationToolDescriptors(
			final Object feature) {
		final Collection<CommandParameter> newChilds = new ArrayList<CommandParameter>();
		final DBindingEditorCreationDescription creationTool = DescriptionFactory.eINSTANCE
				.createDBindingEditorCreationDescription();
		newChilds.add(new CommandParameter(null, feature, creationTool));
		return newChilds;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.viewpoint.ui.business.api.dialect.DialectUIServices#provideRepresentationNavigationToolDescriptors(java.lang.Object)
	 */
	@Override
	public Collection<CommandParameter> provideRepresentationNavigationToolDescriptors(
			final Object feature) {
		// TODO Auto-generated method stub
		return Collections.emptyList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.viewpoint.ui.business.api.dialect.DialectUIServices#provideTools(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public Collection<CommandParameter> provideTools(final EObject object) {
		return Collections.emptyList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.viewpoint.ui.business.api.dialect.DialectUIServices#provideAdditionalMappings(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public Collection<CommandParameter> provideAdditionalMappings(
			final EObject object) {
		return Collections.emptyList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.viewpoint.ui.business.api.dialect.DialectUIServices#canExport(fr.obeo.dsl.viewpoint.ui.business.api.dialect.ExportFormat)
	 */
	@Override
	public boolean canExport(final ExportFormat format) {
		return false;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.obeo.dsl.viewpoint.ui.business.api.dialect.DialectUIServices#export(fr.obeo.dsl.viewpoint.DRepresentation,
	 *      fr.obeo.dsl.viewpoint.business.api.session.Session,
	 *      org.eclipse.core.runtime.IPath,
	 *      fr.obeo.dsl.viewpoint.ui.business.api.dialect.ExportFormat,
	 *      org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void export(final DRepresentation representation,
			final Session session, final IPath path, final ExportFormat format,
			final IProgressMonitor monitor) {
		// Nothing to do for binding trees
	}

	@Override
	public ILabelProvider getHierarchyLabelProvider(
			final ILabelProvider labelProvider) {
		return labelProvider;
	}

	@Override
	public Collection<DSemanticDecorator> getSelection(
			final DialectEditor dialectEditor) {
		return Collections.emptyList();
	}

	@Override
	public void setSelection(final DialectEditor dialectEditor,
			final List<DRepresentationElement> representationElements) {

	}

	@Override
	public boolean canHandle(final RepresentationDescription description) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canHandle(
			final RepresentationExtensionDescription description) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String completeToolTipText(final String toolTipText,
			final EObject eObject) {
		// TODO Auto-generated method stub
		return null;
	}
}
