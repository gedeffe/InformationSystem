/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.environment.providers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.obeonetwork.dsl.environment.util.EnvironmentAdapterFactory;

/**
 * 
 * @generated
 */
public class EnvironmentEEFAdapterFactory extends EnvironmentAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.environment.util.EnvironmentAdapterFactory#createObeoDSMObjectAdapter()
	 * @generated
	 */
	public Adapter createObeoDSMObjectAdapter() {
    return new MetadataCptPropertiesEditionProvider();
  }
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.environment.util.EnvironmentAdapterFactory#createEnvironmentAdapter()
	 * @generated
	 */
	public Adapter createEnvironmentAdapter() {
    List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
    providers.add((PropertiesEditingProvider)createObeoDSMObjectAdapter());
    return new EnvironmentPropertiesEditionProvider(providers);
  }
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.environment.util.EnvironmentAdapterFactory#createPrimitiveTypeAdapter()
	 * @generated
	 */
	public Adapter createPrimitiveTypeAdapter() {
    List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
    providers.add((PropertiesEditingProvider)createObeoDSMObjectAdapter());
    return new PrimitiveTypePropertiesEditionProvider(providers);
  }
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.environment.util.EnvironmentAdapterFactory#createEnumerationAdapter()
	 * @generated
	 */
	public Adapter createEnumerationAdapter() {
    List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
    providers.add((PropertiesEditingProvider)createObeoDSMObjectAdapter());
    return new EnumerationPropertiesEditionProvider(providers);
  }
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.environment.util.EnvironmentAdapterFactory#createFieldAdapter()
	 * @generated
	 */
	public Adapter createFieldAdapter() {
    List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
    providers.add((PropertiesEditingProvider)createObeoDSMObjectAdapter());
    return new FieldPropertiesEditionProvider(providers);
  }
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.environment.util.EnvironmentAdapterFactory#createInterDSMLinkAdapter()
	 * @generated
	 */
	public Adapter createInterDSMLinkAdapter() {
    List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
    providers.add((PropertiesEditingProvider)createObeoDSMObjectAdapter());
    return new InterDSMLinkPropertiesEditionProvider(providers);
  }
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.environment.util.EnvironmentAdapterFactory#createAnnotationAdapter()
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
    return new AnnotationPropertiesEditionProvider();
  }
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.environment.util.EnvironmentAdapterFactory#createPriorityDefinitionAdapter()
	 * @generated
	 */
	public Adapter createPriorityDefinitionAdapter() {
    List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
    providers.add((PropertiesEditingProvider)createObeoDSMObjectAdapter());
    return new PriorityDefinitionPropertiesEditionProvider(providers);
  }
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.environment.util.EnvironmentAdapterFactory#createPriorityAdapter()
	 * @generated
	 */
	public Adapter createPriorityAdapter() {
    List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
    providers.add((PropertiesEditingProvider)createObeoDSMObjectAdapter());
    return new PriorityPropertiesEditionProvider(providers);
  }
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.environment.util.EnvironmentAdapterFactory#createTypesDefinitionAdapter()
	 * @generated
	 */
	public Adapter createTypesDefinitionAdapter() {
    List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
    providers.add((PropertiesEditingProvider)createObeoDSMObjectAdapter());
    return new TypesDefinitionPropertiesEditionProvider(providers);
  }
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.environment.util.EnvironmentAdapterFactory#createFilterContainerAdapter()
	 * @generated
	 */
	public Adapter createFilterContainerAdapter() {
    List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
    providers.add((PropertiesEditingProvider)createObeoDSMObjectAdapter());
    return new FilterContainerPropertiesEditionProvider(providers);
  }
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.environment.util.EnvironmentAdapterFactory#createNamespaceAdapter()
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
    List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
    providers.add((PropertiesEditingProvider)createObeoDSMObjectAdapter());
    return new NamespacePropertiesEditionProvider(providers);
  }
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.environment.util.EnvironmentAdapterFactory#createAttributeAdapter()
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
    List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
    providers.add((PropertiesEditingProvider)createObeoDSMObjectAdapter());
    return new AttributePropertiesEditionProvider(providers);
  }
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.environment.util.EnvironmentAdapterFactory#createReferenceAdapter()
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
    List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
    providers.add((PropertiesEditingProvider)createObeoDSMObjectAdapter());
    return new ReferencePropertiesEditionProvider(providers);
  }
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.environment.util.EnvironmentAdapterFactory#createBindingInfoAdapter()
	 * @generated
	 */
	public Adapter createBindingInfoAdapter() {
    List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
    providers.add((PropertiesEditingProvider)createObeoDSMObjectAdapter());
    return new BindingInfoPropertiesEditionProvider(providers);
  }
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.environment.util.EnvironmentAdapterFactory#createBindingReferenceAdapter()
	 * @generated
	 */
	public Adapter createBindingReferenceAdapter() {
    List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
    providers.add((PropertiesEditingProvider)createObeoDSMObjectAdapter());
    return new BindingReferencePropertiesEditionProvider(providers);
  }
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.environment.util.EnvironmentAdapterFactory#createBindingElementAdapter()
	 * @generated
	 */
	public Adapter createBindingElementAdapter() {
    List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
    providers.add((PropertiesEditingProvider)createObeoDSMObjectAdapter());
    return new BindingElementPropertiesEditionProvider(providers);
  }

}
