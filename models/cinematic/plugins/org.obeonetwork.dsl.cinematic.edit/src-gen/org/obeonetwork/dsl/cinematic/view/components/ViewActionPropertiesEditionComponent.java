/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.cinematic.view.components;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.obeonetwork.dsl.cinematic.view.ViewAction;
import org.obeonetwork.dsl.cinematic.view.parts.ViewActionPropertiesEditionPart;
import org.obeonetwork.dsl.cinematic.view.parts.ViewViewsRepository;
import org.obeonetwork.dsl.environment.components.MetadataCptPropertiesEditionComponent;
import org.obeonetwork.dsl.environment.parts.EnvironmentViewsRepository;

/**
 * 
 * @generated
 */
public class ViewActionPropertiesEditionComponent extends
		ComposedPropertiesEditionComponent {

	/**
	 * The ViewAction part
	 * 
	 * @generated
	 */
	private ViewActionPropertiesEditionPart viewActionPart;

	/**
	 * The ViewActionViewActionPropertiesEditionComponent sub component
	 * 
	 * @generated
	 */
	protected ViewActionViewActionPropertiesEditionComponent viewActionViewActionPropertiesEditionComponent;

	/**
	 * The MetadataCptPropertiesEditionComponent sub component
	 * 
	 * @generated
	 */
	protected MetadataCptPropertiesEditionComponent metadataCptPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param viewAction
	 *            the EObject to edit
	 * @generated
	 */
	public ViewActionPropertiesEditionComponent(
			final PropertiesEditingContext editingContext,
			final EObject viewAction, final String editing_mode) {
		super(editingContext, editing_mode);
		if (viewAction instanceof ViewAction) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider) editingContext
					.getAdapterFactory().adapt(viewAction,
							PropertiesEditingProvider.class);
			this.viewActionViewActionPropertiesEditionComponent = (ViewActionViewActionPropertiesEditionComponent) provider
					.getPropertiesEditingComponent(
							editingContext,
							editing_mode,
							ViewActionViewActionPropertiesEditionComponent.VIEWACTION_PART,
							ViewActionViewActionPropertiesEditionComponent.class);
			this.addSubComponent(this.viewActionViewActionPropertiesEditionComponent);
			provider = (PropertiesEditingProvider) editingContext
					.getAdapterFactory().adapt(viewAction,
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
		if (ViewActionViewActionPropertiesEditionComponent.VIEWACTION_PART
				.equals(key)) {
			this.viewActionPart = (ViewActionPropertiesEditionPart) this.viewActionViewActionPropertiesEditionComponent
					.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart) this.viewActionPart;
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
		if (ViewViewsRepository.ViewAction.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			this.viewActionPart = (ViewActionPropertiesEditionPart) propertiesEditionPart;
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
		if (key == ViewViewsRepository.ViewAction.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EnvironmentViewsRepository.Metadatas.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
