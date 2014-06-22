/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.environment.components;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.obeonetwork.dsl.environment.BindingElement;

import org.obeonetwork.dsl.environment.parts.BindingElementPropertiesEditionPart;
import org.obeonetwork.dsl.environment.parts.EnvironmentViewsRepository;


/**
 * 
 * @generated
 */
public class BindingElementPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The BindingElement part
	 * @generated
	 */
	private BindingElementPropertiesEditionPart bindingElementPart;

	/**
	 * The BindingElementBindingElementPropertiesEditionComponent sub component
	 * @generated
	 */
	protected BindingElementBindingElementPropertiesEditionComponent bindingElementBindingElementPropertiesEditionComponent;

	/**
	 * The MetadataCptPropertiesEditionComponent sub component
	 * @generated
	 */
	protected MetadataCptPropertiesEditionComponent metadataCptPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param bindingElement the EObject to edit
	 * @generated
	 */
	public BindingElementPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject bindingElement, String editing_mode) {
    super(editingContext, editing_mode);
    if (bindingElement instanceof BindingElement) {
      PropertiesEditingProvider provider = null;
      provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(bindingElement, PropertiesEditingProvider.class);
      bindingElementBindingElementPropertiesEditionComponent = (BindingElementBindingElementPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, BindingElementBindingElementPropertiesEditionComponent.BINDINGELEMENT_PART, BindingElementBindingElementPropertiesEditionComponent.class);
      addSubComponent(bindingElementBindingElementPropertiesEditionComponent);
      provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(bindingElement, PropertiesEditingProvider.class);
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
    if (BindingElementBindingElementPropertiesEditionComponent.BINDINGELEMENT_PART.equals(key)) {
      bindingElementPart = (BindingElementPropertiesEditionPart)bindingElementBindingElementPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
      return (IPropertiesEditionPart)bindingElementPart;
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
    if (EnvironmentViewsRepository.BindingElement.class == key) {
      super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
      bindingElementPart = (BindingElementPropertiesEditionPart)propertiesEditionPart;
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
    if (key == EnvironmentViewsRepository.BindingElement.class) {
      super.initPart(key, kind, element, allResource);
    }
    if (key == EnvironmentViewsRepository.Metadatas.class) {
      super.initPart(key, kind, element, allResource);
    }
  }
}
