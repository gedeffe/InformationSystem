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
import org.obeonetwork.dsl.cinematic.flow.FinalState;
import org.obeonetwork.dsl.cinematic.flow.parts.FinalStatePropertiesEditionPart;
import org.obeonetwork.dsl.cinematic.flow.parts.FlowViewsRepository;
import org.obeonetwork.dsl.environment.components.MetadataCptPropertiesEditionComponent;
import org.obeonetwork.dsl.environment.parts.EnvironmentViewsRepository;


/**
 * 
 * @generated
 */
public class FinalStatePropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The FinalState part
	 * @generated
	 */
	private FinalStatePropertiesEditionPart finalStatePart;

	/**
	 * The FinalStateFinalStatePropertiesEditionComponent sub component
	 * @generated
	 */
	protected FinalStateFinalStatePropertiesEditionComponent finalStateFinalStatePropertiesEditionComponent;

	/**
	 * The MetadataCptPropertiesEditionComponent sub component
	 * @generated
	 */
	protected MetadataCptPropertiesEditionComponent metadataCptPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param finalState the EObject to edit
	 * @generated
	 */
	public FinalStatePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject finalState, String editing_mode) {
		super(editingContext, editing_mode);
		if (finalState instanceof FinalState) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(finalState, PropertiesEditingProvider.class);
			finalStateFinalStatePropertiesEditionComponent = (FinalStateFinalStatePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, FinalStateFinalStatePropertiesEditionComponent.FINALSTATE_PART, FinalStateFinalStatePropertiesEditionComponent.class);
			addSubComponent(finalStateFinalStatePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(finalState, PropertiesEditingProvider.class);
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
		if (FinalStateFinalStatePropertiesEditionComponent.FINALSTATE_PART.equals(key)) {
			finalStatePart = (FinalStatePropertiesEditionPart)finalStateFinalStatePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)finalStatePart;
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
		if (FlowViewsRepository.FinalState.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			finalStatePart = (FinalStatePropertiesEditionPart)propertiesEditionPart;
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
		if (key == FlowViewsRepository.FinalState.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EnvironmentViewsRepository.Metadatas.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
