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

import org.obeonetwork.dsl.environment.Attribute;

import org.obeonetwork.dsl.environment.parts.AttributePropertiesEditionPart;
import org.obeonetwork.dsl.environment.parts.EnvironmentViewsRepository;


/**
 * 
 * @generated
 */
public class AttributePropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Attribute part
	 * @generated
	 */
	private AttributePropertiesEditionPart attributePart;

	/**
	 * The AttributeAttributePropertiesEditionComponent sub component
	 * @generated
	 */
	protected AttributeAttributePropertiesEditionComponent attributeAttributePropertiesEditionComponent;

	/**
	 * The MetadataCptPropertiesEditionComponent sub component
	 * @generated
	 */
	protected MetadataCptPropertiesEditionComponent metadataCptPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param attribute the EObject to edit
	 * @generated
	 */
	public AttributePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject attribute, String editing_mode) {
    super(editingContext, editing_mode);
    if (attribute instanceof Attribute) {
      PropertiesEditingProvider provider = null;
      provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(attribute, PropertiesEditingProvider.class);
      attributeAttributePropertiesEditionComponent = (AttributeAttributePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, AttributeAttributePropertiesEditionComponent.ATTRIBUTE_PART, AttributeAttributePropertiesEditionComponent.class);
      addSubComponent(attributeAttributePropertiesEditionComponent);
      provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(attribute, PropertiesEditingProvider.class);
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
    if (AttributeAttributePropertiesEditionComponent.ATTRIBUTE_PART.equals(key)) {
      attributePart = (AttributePropertiesEditionPart)attributeAttributePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
      return (IPropertiesEditionPart)attributePart;
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
    if (EnvironmentViewsRepository.Attribute.class == key) {
      super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
      attributePart = (AttributePropertiesEditionPart)propertiesEditionPart;
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
    if (key == EnvironmentViewsRepository.Attribute.class) {
      super.initPart(key, kind, element, allResource);
    }
    if (key == EnvironmentViewsRepository.Metadatas.class) {
      super.initPart(key, kind, element, allResource);
    }
  }
}
