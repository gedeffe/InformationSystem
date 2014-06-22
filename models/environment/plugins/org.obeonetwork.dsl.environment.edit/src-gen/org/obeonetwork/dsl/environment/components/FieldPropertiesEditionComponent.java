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

import org.obeonetwork.dsl.environment.Field;

import org.obeonetwork.dsl.environment.parts.EnvironmentViewsRepository;
import org.obeonetwork.dsl.environment.parts.FieldPropertiesEditionPart;


/**
 * 
 * @generated
 */
public class FieldPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Field part
	 * @generated
	 */
	private FieldPropertiesEditionPart fieldPart;

	/**
	 * The FieldFieldPropertiesEditionComponent sub component
	 * @generated
	 */
	protected FieldFieldPropertiesEditionComponent fieldFieldPropertiesEditionComponent;

	/**
	 * The MetadataCptPropertiesEditionComponent sub component
	 * @generated
	 */
	protected MetadataCptPropertiesEditionComponent metadataCptPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param field the EObject to edit
	 * @generated
	 */
	public FieldPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject field, String editing_mode) {
    super(editingContext, editing_mode);
    if (field instanceof Field) {
      PropertiesEditingProvider provider = null;
      provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(field, PropertiesEditingProvider.class);
      fieldFieldPropertiesEditionComponent = (FieldFieldPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, FieldFieldPropertiesEditionComponent.FIELD_PART, FieldFieldPropertiesEditionComponent.class);
      addSubComponent(fieldFieldPropertiesEditionComponent);
      provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(field, PropertiesEditingProvider.class);
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
    if (FieldFieldPropertiesEditionComponent.FIELD_PART.equals(key)) {
      fieldPart = (FieldPropertiesEditionPart)fieldFieldPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
      return (IPropertiesEditionPart)fieldPart;
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
    if (EnvironmentViewsRepository.Field.class == key) {
      super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
      fieldPart = (FieldPropertiesEditionPart)propertiesEditionPart;
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
    if (key == EnvironmentViewsRepository.Field.class) {
      super.initPart(key, kind, element, allResource);
    }
    if (key == EnvironmentViewsRepository.Metadatas.class) {
      super.initPart(key, kind, element, allResource);
    }
  }
}
