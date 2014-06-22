/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.cinematic.components;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.obeonetwork.dsl.cinematic.CinematicRoot;
import org.obeonetwork.dsl.cinematic.parts.CinematicRootPropertiesEditionPart;
import org.obeonetwork.dsl.cinematic.parts.CinematicViewsRepository;
import org.obeonetwork.dsl.environment.components.MetadataCptPropertiesEditionComponent;
import org.obeonetwork.dsl.environment.parts.EnvironmentViewsRepository;

/**
 * 
 * @generated
 */
public class CinematicRootPropertiesEditionComponent extends
		ComposedPropertiesEditionComponent {

	/**
	 * The CinematicRoot part
	 * 
	 * @generated
	 */
	private CinematicRootPropertiesEditionPart cinematicRootPart;

	/**
	 * The CinematicRootCinematicRootPropertiesEditionComponent sub component
	 * 
	 * @generated
	 */
	protected CinematicRootCinematicRootPropertiesEditionComponent cinematicRootCinematicRootPropertiesEditionComponent;

	/**
	 * The MetadataCptPropertiesEditionComponent sub component
	 * 
	 * @generated
	 */
	protected MetadataCptPropertiesEditionComponent metadataCptPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param cinematicRoot
	 *            the EObject to edit
	 * @generated
	 */
	public CinematicRootPropertiesEditionComponent(
			final PropertiesEditingContext editingContext,
			final EObject cinematicRoot, final String editing_mode) {
		super(editingContext, editing_mode);
		if (cinematicRoot instanceof CinematicRoot) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider) editingContext
					.getAdapterFactory().adapt(cinematicRoot,
							PropertiesEditingProvider.class);
			this.cinematicRootCinematicRootPropertiesEditionComponent = (CinematicRootCinematicRootPropertiesEditionComponent) provider
					.getPropertiesEditingComponent(
							editingContext,
							editing_mode,
							CinematicRootCinematicRootPropertiesEditionComponent.CINEMATICROOT_PART,
							CinematicRootCinematicRootPropertiesEditionComponent.class);
			this.addSubComponent(this.cinematicRootCinematicRootPropertiesEditionComponent);
			provider = (PropertiesEditingProvider) editingContext
					.getAdapterFactory().adapt(cinematicRoot,
							PropertiesEditingProvider.class);
			this.metadataCptPropertiesEditionComponent = (MetadataCptPropertiesEditionComponent) provider
					.getPropertiesEditingComponent(
							editingContext,
							editing_mode,
							MetadataCptPropertiesEditionComponent.METADATAS_PART,
							MetadataCptPropertiesEditionComponent.class);
			this.addSubComponent(this.metadataCptPropertiesEditionComponent);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent#
	 *      getPropertiesEditionPart(int, java.lang.String)
	 * @generated
	 */
	@Override
	public IPropertiesEditionPart getPropertiesEditionPart(final int kind,
			final String key) {
		if (CinematicRootCinematicRootPropertiesEditionComponent.CINEMATICROOT_PART
				.equals(key)) {
			this.cinematicRootPart = (CinematicRootPropertiesEditionPart) this.cinematicRootCinematicRootPropertiesEditionComponent
					.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart) this.cinematicRootPart;
		}
		return super.getPropertiesEditionPart(kind, key);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent#
	 *      setPropertiesEditionPart(java.lang.Object, int,
	 *      org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart)
	 * @generated
	 */
	@Override
	public void setPropertiesEditionPart(final java.lang.Object key,
			final int kind, final IPropertiesEditionPart propertiesEditionPart) {
		if (CinematicViewsRepository.CinematicRoot.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			this.cinematicRootPart = (CinematicRootPropertiesEditionPart) propertiesEditionPart;
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent#
	 *      initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject,
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * @generated
	 */
	@Override
	public void initPart(final java.lang.Object key, final int kind,
			final EObject element, final ResourceSet allResource) {
		if (key == CinematicViewsRepository.CinematicRoot.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EnvironmentViewsRepository.Metadatas.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
