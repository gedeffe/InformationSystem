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
import org.obeonetwork.dsl.cinematic.flow.FlowAction;
import org.obeonetwork.dsl.cinematic.flow.parts.FlowActionPropertiesEditionPart;
import org.obeonetwork.dsl.cinematic.flow.parts.FlowViewsRepository;
import org.obeonetwork.dsl.environment.components.MetadataCptPropertiesEditionComponent;
import org.obeonetwork.dsl.environment.parts.EnvironmentViewsRepository;


/**
 * 
 * @generated
 */
public class FlowActionPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The FlowAction part
	 * @generated
	 */
	private FlowActionPropertiesEditionPart flowActionPart;

	/**
	 * The FlowActionFlowActionPropertiesEditionComponent sub component
	 * @generated
	 */
	protected FlowActionFlowActionPropertiesEditionComponent flowActionFlowActionPropertiesEditionComponent;

	/**
	 * The MetadataCptPropertiesEditionComponent sub component
	 * @generated
	 */
	protected MetadataCptPropertiesEditionComponent metadataCptPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param flowAction the EObject to edit
	 * @generated
	 */
	public FlowActionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject flowAction, String editing_mode) {
		super(editingContext, editing_mode);
		if (flowAction instanceof FlowAction) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(flowAction, PropertiesEditingProvider.class);
			flowActionFlowActionPropertiesEditionComponent = (FlowActionFlowActionPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, FlowActionFlowActionPropertiesEditionComponent.FLOWACTION_PART, FlowActionFlowActionPropertiesEditionComponent.class);
			addSubComponent(flowActionFlowActionPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(flowAction, PropertiesEditingProvider.class);
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
		if (FlowActionFlowActionPropertiesEditionComponent.FLOWACTION_PART.equals(key)) {
			flowActionPart = (FlowActionPropertiesEditionPart)flowActionFlowActionPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)flowActionPart;
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
		if (FlowViewsRepository.FlowAction.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			flowActionPart = (FlowActionPropertiesEditionPart)propertiesEditionPart;
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
		if (key == FlowViewsRepository.FlowAction.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EnvironmentViewsRepository.Metadatas.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
