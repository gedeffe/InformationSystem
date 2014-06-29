package org.obeonetwork.dsl.environment.binding.dialect.ui.editor;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.ecore.extender.business.api.accessor.ModelAccessor;

public class BindingTreeEditorManager {

	private final TransactionalEditingDomain editingDomain;
	private final ModelAccessor accessor;

	public BindingTreeEditorManager(
			final TransactionalEditingDomain editingDomain,
			final ModelAccessor accessor) {
		super();
		this.editingDomain = editingDomain;
		this.accessor = accessor;
	}

	public TransactionalEditingDomain getEditingDomain() {
		return this.editingDomain;
	}

	public ModelAccessor getAccessor() {
		return this.accessor;
	}

	public void execute(final Command command) {
		this.getEditingDomain().getCommandStack().execute(command);
	}

}
