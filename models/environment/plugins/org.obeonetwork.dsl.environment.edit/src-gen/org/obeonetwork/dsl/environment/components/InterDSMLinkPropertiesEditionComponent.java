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

import org.obeonetwork.dsl.environment.InterDSMLink;

import org.obeonetwork.dsl.environment.parts.EnvironmentViewsRepository;
import org.obeonetwork.dsl.environment.parts.InterDSMLinkPropertiesEditionPart;


/**
 * 
 * @generated
 */
public class InterDSMLinkPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The InterDSMLink part
	 * @generated
	 */
	private InterDSMLinkPropertiesEditionPart interDSMLinkPart;

	/**
	 * The InterDSMLinkInterDSMLinkPropertiesEditionComponent sub component
	 * @generated
	 */
	protected InterDSMLinkInterDSMLinkPropertiesEditionComponent interDSMLinkInterDSMLinkPropertiesEditionComponent;

	/**
	 * The MetadataCptPropertiesEditionComponent sub component
	 * @generated
	 */
	protected MetadataCptPropertiesEditionComponent metadataCptPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param interDSMLink the EObject to edit
	 * @generated
	 */
	public InterDSMLinkPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject interDSMLink, String editing_mode) {
    super(editingContext, editing_mode);
    if (interDSMLink instanceof InterDSMLink) {
      PropertiesEditingProvider provider = null;
      provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(interDSMLink, PropertiesEditingProvider.class);
      interDSMLinkInterDSMLinkPropertiesEditionComponent = (InterDSMLinkInterDSMLinkPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, InterDSMLinkInterDSMLinkPropertiesEditionComponent.INTERDSMLINK_PART, InterDSMLinkInterDSMLinkPropertiesEditionComponent.class);
      addSubComponent(interDSMLinkInterDSMLinkPropertiesEditionComponent);
      provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(interDSMLink, PropertiesEditingProvider.class);
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
    if (InterDSMLinkInterDSMLinkPropertiesEditionComponent.INTERDSMLINK_PART.equals(key)) {
      interDSMLinkPart = (InterDSMLinkPropertiesEditionPart)interDSMLinkInterDSMLinkPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
      return (IPropertiesEditionPart)interDSMLinkPart;
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
    if (EnvironmentViewsRepository.InterDSMLink.class == key) {
      super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
      interDSMLinkPart = (InterDSMLinkPropertiesEditionPart)propertiesEditionPart;
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
    if (key == EnvironmentViewsRepository.InterDSMLink.class) {
      super.initPart(key, kind, element, allResource);
    }
    if (key == EnvironmentViewsRepository.Metadatas.class) {
      super.initPart(key, kind, element, allResource);
    }
  }
}
