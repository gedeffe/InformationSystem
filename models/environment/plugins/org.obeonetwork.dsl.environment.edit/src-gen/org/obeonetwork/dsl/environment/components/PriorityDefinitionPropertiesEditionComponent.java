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

import org.obeonetwork.dsl.environment.PriorityDefinition;

import org.obeonetwork.dsl.environment.parts.EnvironmentViewsRepository;
import org.obeonetwork.dsl.environment.parts.PriorityDefinitionPropertiesEditionPart;


/**
 * 
 * @generated
 */
public class PriorityDefinitionPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The PriorityDefinition part
	 * @generated
	 */
	private PriorityDefinitionPropertiesEditionPart priorityDefinitionPart;

	/**
	 * The PriorityDefinitionPriorityDefinitionPropertiesEditionComponent sub component
	 * @generated
	 */
	protected PriorityDefinitionPriorityDefinitionPropertiesEditionComponent priorityDefinitionPriorityDefinitionPropertiesEditionComponent;

	/**
	 * The MetadataCptPropertiesEditionComponent sub component
	 * @generated
	 */
	protected MetadataCptPropertiesEditionComponent metadataCptPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param priorityDefinition the EObject to edit
	 * @generated
	 */
	public PriorityDefinitionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject priorityDefinition, String editing_mode) {
    super(editingContext, editing_mode);
    if (priorityDefinition instanceof PriorityDefinition) {
      PropertiesEditingProvider provider = null;
      provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(priorityDefinition, PropertiesEditingProvider.class);
      priorityDefinitionPriorityDefinitionPropertiesEditionComponent = (PriorityDefinitionPriorityDefinitionPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, PriorityDefinitionPriorityDefinitionPropertiesEditionComponent.PRIORITYDEFINITION_PART, PriorityDefinitionPriorityDefinitionPropertiesEditionComponent.class);
      addSubComponent(priorityDefinitionPriorityDefinitionPropertiesEditionComponent);
      provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(priorityDefinition, PropertiesEditingProvider.class);
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
    if (PriorityDefinitionPriorityDefinitionPropertiesEditionComponent.PRIORITYDEFINITION_PART.equals(key)) {
      priorityDefinitionPart = (PriorityDefinitionPropertiesEditionPart)priorityDefinitionPriorityDefinitionPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
      return (IPropertiesEditionPart)priorityDefinitionPart;
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
    if (EnvironmentViewsRepository.PriorityDefinition.class == key) {
      super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
      priorityDefinitionPart = (PriorityDefinitionPropertiesEditionPart)propertiesEditionPart;
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
    if (key == EnvironmentViewsRepository.PriorityDefinition.class) {
      super.initPart(key, kind, element, allResource);
    }
    if (key == EnvironmentViewsRepository.Metadatas.class) {
      super.initPart(key, kind, element, allResource);
    }
  }
}
