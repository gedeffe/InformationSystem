package org.obeonetwork.dsl.environment.binding.dialect.ui.treemapper.commands;

import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.ecore.extender.business.api.accessor.ModelAccessor;
import org.obeonetwork.dsl.environment.BindingElement;
import org.obeonetwork.dsl.environment.BindingReference;
import org.obeonetwork.dsl.environment.bindingdialect.DBindingEdge;

public class DeleteMappingCommand extends RecordingCommand {

	private DBindingEdge bindingEdge = null;
	private final ModelAccessor accessor;

	public DeleteMappingCommand(final TransactionalEditingDomain domain,
			final ModelAccessor accessor, final DBindingEdge bindingEdge) {
		super(domain, "Delete mapping");
		this.bindingEdge = bindingEdge;
		this.accessor = accessor;
	}

	@Override
	protected void doExecute() {
		if ((this.bindingEdge.getTarget() != null)
				&& (this.bindingEdge.getTarget() instanceof BindingReference)) {

			final BindingReference bindingReference = (BindingReference) this.bindingEdge
					.getTarget();
			final Session session = SessionManager.INSTANCE
					.getSession(bindingReference);
			final ECrossReferenceAdapter crossReferencer = session
					.getSemanticCrossReferencer();

			final BindingElement left = bindingReference.getLeft();
			final BindingElement right = bindingReference.getRight();
			if (this.hasNoOtherReference(left)) {
				// Delete the useless element
				this.accessor.eDelete(left, crossReferencer);
			}
			if (this.hasNoOtherReference(right)) {
				// Delete the useless element
				this.accessor.eDelete(right, crossReferencer);
			} else {

			}
			this.accessor.eDelete(bindingReference, crossReferencer);
		}
		this.bindingEdge.setLeft(null);
		this.bindingEdge.setRight(null);
		EcoreUtil.delete(this.bindingEdge);
	}

	private boolean hasNoOtherReference(final BindingElement bindingElement) {
		return bindingElement.getReferencedBy().size() <= 1;
	}
}
