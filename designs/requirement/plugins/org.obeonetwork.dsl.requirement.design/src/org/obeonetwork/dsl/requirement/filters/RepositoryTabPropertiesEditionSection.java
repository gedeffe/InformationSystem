package org.obeonetwork.dsl.requirement.filters;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.obeonetwork.dsl.requirement.Repository;

public class RepositoryTabPropertiesEditionSection implements IFilter {

	public boolean select(final Object toTest) {
		if (toTest instanceof DSemanticDecorator) {
			final EObject target = ((DSemanticDecorator) toTest).getTarget();
			if ((target != null) && (target instanceof Repository)) {
				return true;
			}
		}
		final EObject eObj = EEFUtils.resolveSemanticObject(toTest);
		return ((eObj != null) && (eObj instanceof Repository));
	}
}
