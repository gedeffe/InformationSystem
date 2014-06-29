package org.obeonetwork.dsl.environment.binding.dialect.ui.treemapper.commands;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.ecore.extender.business.api.accessor.ModelAccessor;
import org.eclipse.sirius.viewpoint.SiriusPlugin;

public class UpdateMappingExpressionCommand extends RecordingCommand {

	private final EObject element;
	private final String expression;
	private final ModelAccessor accessor;

	public UpdateMappingExpressionCommand(
			final TransactionalEditingDomain domain,
			final ModelAccessor accessor, final EObject element,
			final String expression) {
		super(domain, "Update Mapping expression");
		this.element = element;
		this.accessor = accessor;
		this.expression = expression;
	}

	@Override
	protected void doExecute() {
		if (this.element == null) {
			return;
		}
		try {
			this.accessor.eSet(this.element, "bindingExpression",
					this.expression);
		} catch (final Exception e) {
			SiriusPlugin.getDefault().error("Error while modifying model", e);
		}
	}

}
