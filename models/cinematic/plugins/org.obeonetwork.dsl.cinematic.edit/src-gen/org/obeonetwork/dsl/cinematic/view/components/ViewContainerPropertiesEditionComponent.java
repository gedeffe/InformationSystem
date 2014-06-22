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
import org.obeonetwork.dsl.cinematic.view.ViewContainer;
import org.obeonetwork.dsl.cinematic.view.parts.ViewContainerPropertiesEditionPart;
import org.obeonetwork.dsl.cinematic.view.parts.ViewViewsRepository;
import org.obeonetwork.dsl.environment.components.MetadataCptPropertiesEditionComponent;
import org.obeonetwork.dsl.environment.parts.EnvironmentViewsRepository;


/**
 * 
 * @generated
 */
public class ViewContainerPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The ViewContainer part
	 * @generated
	 */
	private ViewContainerPropertiesEditionPart viewContainerPart;

	/**
	 * The ViewContainerViewContainerPropertiesEditionComponent sub component
	 * @generated
	 */
	protected ViewContainerViewContainerPropertiesEditionComponent viewContainerViewContainerPropertiesEditionComponent;

	/**
	 * The MetadataCptPropertiesEditionComponent sub component
	 * @generated
	 */
	protected MetadataCptPropertiesEditionComponent metadataCptPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param viewContainer the EObject to edit
	 * @generated
	 */
	public ViewContainerPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject viewContainer, String editing_mode) {
		super(editingContext, editing_mode);
		if (viewContainer instanceof ViewContainer) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(viewContainer, PropertiesEditingProvider.class);
			viewContainerViewContainerPropertiesEditionComponent = (ViewContainerViewContainerPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, ViewContainerViewContainerPropertiesEditionComponent.VIEWCONTAINER_PART, ViewContainerViewContainerPropertiesEditionComponent.class);
			addSubComponent(viewContainerViewContainerPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(viewContainer, PropertiesEditingProvider.class);
			metadataCptPropertiesEditionComponent = (MetadataCptPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, MetadataCptPropertiesEditionComponent.METADATAS_PART, MetadataCptPropertiesEditionComponent.class);
			addSubComponent(metadataCptPropertiesEditionComponent);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent#
	 *      getPropertiesEditionPart(int, java.lang.String)
	 * @generated
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(int kind, String key) {
		if (ViewContainerViewContainerPropertiesEditionComponent.VIEWCONTAINER_PART.equals(key)) {
			viewContainerPart = (ViewContainerPropertiesEditionPart)viewContainerViewContainerPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)viewContainerPart;
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
	public void setPropertiesEditionPart(java.lang.Object key, int kind, IPropertiesEditionPart propertiesEditionPart) {
		if (ViewViewsRepository.ViewContainer.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			viewContainerPart = (ViewContainerPropertiesEditionPart)propertiesEditionPart;
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
	public void initPart(java.lang.Object key, int kind, EObject element, ResourceSet allResource) {
		if (key == ViewViewsRepository.ViewContainer.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EnvironmentViewsRepository.Metadatas.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
