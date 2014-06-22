package org.obeonetwork.dsl.database.section;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

/**
 * The class PropertiesEditionSection has disappeared in EEF runtime ...
 */
abstract public class AbstractDatabasePropertiesEditionSection /*
																 * extends
																 * PropertiesEditionSection
																 */{

	private AdapterFactory adapterFactory;

	protected PropertiesEditingProvider getProvider(final EObject eObject) {
		if (this.adapterFactory == null) {
			this.adapterFactory = new ComposedAdapterFactory(
					ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		}
		return (PropertiesEditingProvider) this.adapterFactory.adapt(eObject,
				PropertiesEditingProvider.class);
	}
}