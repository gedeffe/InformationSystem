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
import org.obeonetwork.dsl.cinematic.view.ViewContainerReference;
import org.obeonetwork.dsl.cinematic.view.parts.ViewContainerReferencePropertiesEditionPart;
import org.obeonetwork.dsl.cinematic.view.parts.ViewViewsRepository;
import org.obeonetwork.dsl.environment.components.MetadataCptPropertiesEditionComponent;
import org.obeonetwork.dsl.environment.parts.EnvironmentViewsRepository;


/**
 * 
 * @generated
 */
public class ViewContainerReferencePropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The ViewContainerReference part
	 * @generated
	 */
	private ViewContainerReferencePropertiesEditionPart viewContainerReferencePart;

	/**
	 * The ViewContainerReferenceViewContainerReferencePropertiesEditionComponent sub component
	 * @generated
	 */
	protected ViewContainerReferenceViewContainerReferencePropertiesEditionComponent viewContainerReferenceViewContainerReferencePropertiesEditionComponent;

	/**
	 * The MetadataCptPropertiesEditionComponent sub component
	 * @generated
	 */
	protected MetadataCptPropertiesEditionComponent metadataCptPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param viewContainerReference the EObject to edit
	 * @generated
	 */
	public ViewContainerReferencePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject viewContainerReference, String editing_mode) {
		super(editingContext, editing_mode);
		if (viewContainerReference instanceof ViewContainerReference) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(viewContainerReference, PropertiesEditingProvider.class);
			viewContainerReferenceViewContainerReferencePropertiesEditionComponent = (ViewContainerReferenceViewContainerReferencePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, ViewContainerReferenceViewContainerReferencePropertiesEditionComponent.VIEWCONTAINERREFERENCE_PART, ViewContainerReferenceViewContainerReferencePropertiesEditionComponent.class);
			addSubComponent(viewContainerReferenceViewContainerReferencePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(viewContainerReference, PropertiesEditingProvider.class);
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
		if (ViewContainerReferenceViewContainerReferencePropertiesEditionComponent.VIEWCONTAINERREFERENCE_PART.equals(key)) {
			viewContainerReferencePart = (ViewContainerReferencePropertiesEditionPart)viewContainerReferenceViewContainerReferencePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)viewContainerReferencePart;
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
		if (ViewViewsRepository.ViewContainerReference.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			viewContainerReferencePart = (ViewContainerReferencePropertiesEditionPart)propertiesEditionPart;
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
		if (key == ViewViewsRepository.ViewContainerReference.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EnvironmentViewsRepository.Metadatas.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
