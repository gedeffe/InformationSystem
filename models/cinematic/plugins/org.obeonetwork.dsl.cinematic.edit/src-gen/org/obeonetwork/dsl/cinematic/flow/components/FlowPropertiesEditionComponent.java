/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.cinematic.flow.components;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.obeonetwork.dsl.cinematic.flow.Flow;
import org.obeonetwork.dsl.cinematic.flow.parts.FlowPropertiesEditionPart;
import org.obeonetwork.dsl.cinematic.flow.parts.FlowViewsRepository;
import org.obeonetwork.dsl.environment.components.MetadataCptPropertiesEditionComponent;
import org.obeonetwork.dsl.environment.parts.EnvironmentViewsRepository;


/**
 * 
 * @generated
 */
public class FlowPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Flow part
	 * @generated
	 */
	private FlowPropertiesEditionPart flowPart;

	/**
	 * The FlowFlowPropertiesEditionComponent sub component
	 * @generated
	 */
	protected FlowFlowPropertiesEditionComponent flowFlowPropertiesEditionComponent;

	/**
	 * The MetadataCptPropertiesEditionComponent sub component
	 * @generated
	 */
	protected MetadataCptPropertiesEditionComponent metadataCptPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param flow the EObject to edit
	 * @generated
	 */
	public FlowPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject flow, String editing_mode) {
		super(editingContext, editing_mode);
		if (flow instanceof Flow) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(flow, PropertiesEditingProvider.class);
			flowFlowPropertiesEditionComponent = (FlowFlowPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, FlowFlowPropertiesEditionComponent.FLOW_PART, FlowFlowPropertiesEditionComponent.class);
			addSubComponent(flowFlowPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(flow, PropertiesEditingProvider.class);
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
		if (FlowFlowPropertiesEditionComponent.FLOW_PART.equals(key)) {
			flowPart = (FlowPropertiesEditionPart)flowFlowPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)flowPart;
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
		if (FlowViewsRepository.Flow_.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			flowPart = (FlowPropertiesEditionPart)propertiesEditionPart;
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
		if (key == FlowViewsRepository.Flow_.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EnvironmentViewsRepository.Metadatas.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
