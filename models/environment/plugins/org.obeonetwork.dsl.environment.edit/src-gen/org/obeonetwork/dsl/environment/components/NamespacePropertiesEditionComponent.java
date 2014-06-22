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

import org.obeonetwork.dsl.environment.Namespace;

import org.obeonetwork.dsl.environment.parts.EnvironmentViewsRepository;
import org.obeonetwork.dsl.environment.parts.NamespacePropertiesEditionPart;


/**
 * 
 * @generated
 */
public class NamespacePropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Namespace part
	 * @generated
	 */
	private NamespacePropertiesEditionPart namespacePart;

	/**
	 * The NamespaceNamespacePropertiesEditionComponent sub component
	 * @generated
	 */
	protected NamespaceNamespacePropertiesEditionComponent namespaceNamespacePropertiesEditionComponent;

	/**
	 * The MetadataCptPropertiesEditionComponent sub component
	 * @generated
	 */
	protected MetadataCptPropertiesEditionComponent metadataCptPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param namespace the EObject to edit
	 * @generated
	 */
	public NamespacePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject namespace, String editing_mode) {
    super(editingContext, editing_mode);
    if (namespace instanceof Namespace) {
      PropertiesEditingProvider provider = null;
      provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(namespace, PropertiesEditingProvider.class);
      namespaceNamespacePropertiesEditionComponent = (NamespaceNamespacePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, NamespaceNamespacePropertiesEditionComponent.NAMESPACE_PART, NamespaceNamespacePropertiesEditionComponent.class);
      addSubComponent(namespaceNamespacePropertiesEditionComponent);
      provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(namespace, PropertiesEditingProvider.class);
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
    if (NamespaceNamespacePropertiesEditionComponent.NAMESPACE_PART.equals(key)) {
      namespacePart = (NamespacePropertiesEditionPart)namespaceNamespacePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
      return (IPropertiesEditionPart)namespacePart;
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
    if (EnvironmentViewsRepository.Namespace.class == key) {
      super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
      namespacePart = (NamespacePropertiesEditionPart)propertiesEditionPart;
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
    if (key == EnvironmentViewsRepository.Namespace.class) {
      super.initPart(key, kind, element, allResource);
    }
    if (key == EnvironmentViewsRepository.Metadatas.class) {
      super.initPart(key, kind, element, allResource);
    }
  }
}
