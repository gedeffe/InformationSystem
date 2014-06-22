/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.cinematic.flow.providers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.obeonetwork.dsl.cinematic.flow.util.FlowAdapterFactory;
import org.obeonetwork.dsl.environment.providers.MetadataCptPropertiesEditionProvider;

/**
 * 
 * @generated
 */
public class FlowEEFAdapterFactory extends FlowAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.cinematic.flow.util.FlowAdapterFactory#createObeoDSMObjectAdapter()
	 * @generated
	 */
	public Adapter createObeoDSMObjectAdapter() {
		return new MetadataCptPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.cinematic.flow.util.FlowAdapterFactory#createFlowAdapter()
	 * @generated
	 */
	public Adapter createFlowAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createObeoDSMObjectAdapter());
		return new FlowPropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.cinematic.flow.util.FlowAdapterFactory#createTransitionAdapter()
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createObeoDSMObjectAdapter());
		return new TransitionPropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.cinematic.flow.util.FlowAdapterFactory#createActionStateAdapter()
	 * @generated
	 */
	public Adapter createActionStateAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createObeoDSMObjectAdapter());
		return new ActionStatePropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.cinematic.flow.util.FlowAdapterFactory#createViewStateAdapter()
	 * @generated
	 */
	public Adapter createViewStateAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createObeoDSMObjectAdapter());
		return new ViewStatePropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.cinematic.flow.util.FlowAdapterFactory#createDecisionStateAdapter()
	 * @generated
	 */
	public Adapter createDecisionStateAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createObeoDSMObjectAdapter());
		return new DecisionStatePropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.cinematic.flow.util.FlowAdapterFactory#createSubflowStateAdapter()
	 * @generated
	 */
	public Adapter createSubflowStateAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createObeoDSMObjectAdapter());
		return new SubflowStatePropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.cinematic.flow.util.FlowAdapterFactory#createAsyncEventStateAdapter()
	 * @generated
	 */
	public Adapter createAsyncEventStateAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createObeoDSMObjectAdapter());
		return new AsyncEventStatePropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.cinematic.flow.util.FlowAdapterFactory#createInitialStateAdapter()
	 * @generated
	 */
	public Adapter createInitialStateAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createObeoDSMObjectAdapter());
		return new InitialStatePropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.cinematic.flow.util.FlowAdapterFactory#createAbortStateAdapter()
	 * @generated
	 */
	public Adapter createAbortStateAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createObeoDSMObjectAdapter());
		return new AbortStatePropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.cinematic.flow.util.FlowAdapterFactory#createFinalStateAdapter()
	 * @generated
	 */
	public Adapter createFinalStateAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createObeoDSMObjectAdapter());
		return new FinalStatePropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.cinematic.flow.util.FlowAdapterFactory#createFlowActionAdapter()
	 * @generated
	 */
	public Adapter createFlowActionAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createObeoDSMObjectAdapter());
		return new FlowActionPropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.cinematic.flow.util.FlowAdapterFactory#createFlowEventAdapter()
	 * @generated
	 */
	public Adapter createFlowEventAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createObeoDSMObjectAdapter());
		return new FlowEventPropertiesEditionProvider(providers);
	}

}
