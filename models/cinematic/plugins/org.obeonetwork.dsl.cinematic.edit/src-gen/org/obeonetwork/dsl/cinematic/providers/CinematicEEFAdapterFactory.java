/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.cinematic.providers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.obeonetwork.dsl.cinematic.util.CinematicAdapterFactory;
import org.obeonetwork.dsl.environment.providers.MetadataCptPropertiesEditionProvider;

/**
 * 
 * @generated
 */
public class CinematicEEFAdapterFactory extends CinematicAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.cinematic.util.CinematicAdapterFactory#createObeoDSMObjectAdapter()
	 * @generated
	 */
	public Adapter createObeoDSMObjectAdapter() {
		return new MetadataCptPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.cinematic.util.CinematicAdapterFactory#createPackageAdapter()
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createObeoDSMObjectAdapter());
		return new Package_PropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.cinematic.util.CinematicAdapterFactory#createCinematicRootAdapter()
	 * @generated
	 */
	public Adapter createCinematicRootAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createObeoDSMObjectAdapter());
		return new CinematicRootPropertiesEditionProvider(providers);
	}

}
