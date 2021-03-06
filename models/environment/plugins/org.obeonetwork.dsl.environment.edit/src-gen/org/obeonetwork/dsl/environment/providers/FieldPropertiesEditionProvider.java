/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.environment.providers;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.providers.impl.PropertiesEditingProviderImpl;

import org.eclipse.jface.viewers.IFilter;

import org.obeonetwork.dsl.environment.EnvironmentPackage;
import org.obeonetwork.dsl.environment.Field;

import org.obeonetwork.dsl.environment.components.FieldFieldPropertiesEditionComponent;
import org.obeonetwork.dsl.environment.components.FieldPropertiesEditionComponent;
import org.obeonetwork.dsl.environment.components.MetadataCptPropertiesEditionComponent;

/**
 * 
 * @generated
 */
public class FieldPropertiesEditionProvider extends PropertiesEditingProviderImpl {

	/**
	 * Constructor without provider for super types.
	 */
	public FieldPropertiesEditionProvider() {
		super();
	}

	/**
	 * Constructor with providers for super types.
	 * @param superProviders providers to use for super types.
	 */
	public FieldPropertiesEditionProvider(List<PropertiesEditingProvider> superProviders) {
		super(superProviders);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext)
	 * @generated
	 */
	public boolean provides(PropertiesEditingContext editingContext) {
    return (editingContext.getEObject() instanceof Field) 
          && (EnvironmentPackage.Literals.FIELD == editingContext.getEObject().eClass());
  }

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * @generated
	 */
	public boolean provides(PropertiesEditingContext editingContext, String part) {
    return (editingContext.getEObject() instanceof Field) && (FieldFieldPropertiesEditionComponent.FIELD_PART.equals(part) || MetadataCptPropertiesEditionComponent.METADATAS_PART.equals(part));
  }

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.Class)
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, java.lang.Class refinement) {
    return (editingContext.getEObject() instanceof Field) && (refinement == FieldFieldPropertiesEditionComponent.class || refinement == MetadataCptPropertiesEditionComponent.class);
  }

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.Class)
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, String part, java.lang.Class refinement) {
    return (editingContext.getEObject() instanceof Field) && ((FieldFieldPropertiesEditionComponent.FIELD_PART.equals(part) && refinement == FieldFieldPropertiesEditionComponent.class) || (MetadataCptPropertiesEditionComponent.METADATAS_PART.equals(part) && refinement == MetadataCptPropertiesEditionComponent.class));
  }

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * @generated
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode) {
    if (editingContext.getEObject() instanceof Field) {
      return new FieldPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
    }
    return super.getPropertiesEditingComponent(editingContext, mode);
  }

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String)
	 * @generated
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part) {
    if (editingContext.getEObject() instanceof Field) {
      if (FieldFieldPropertiesEditionComponent.FIELD_PART.equals(part))
        return new FieldFieldPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
      if (MetadataCptPropertiesEditionComponent.METADATAS_PART.equals(part))
        return new MetadataCptPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
    }
    return super.getPropertiesEditingComponent(editingContext, mode, part);
  }

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String, java.lang.Class)
	 */
	@SuppressWarnings("rawtypes")
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part, java.lang.Class refinement) {
		if (editingContext.getEObject() instanceof Field) {
			if (FieldFieldPropertiesEditionComponent.FIELD_PART.equals(part)
				&& refinement == FieldFieldPropertiesEditionComponent.class)
				return new FieldFieldPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (MetadataCptPropertiesEditionComponent.METADATAS_PART.equals(part)
				&& refinement == MetadataCptPropertiesEditionComponent.class)
				return new MetadataCptPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode, part, refinement);
	}

	/**
	 * Provides the filter used by the plugin.xml to assign part forms.
	 */
	public static class EditionFilter implements IFilter {
		
		/**
		 * {@inheritDoc}
		 * 
		 * @see org.eclipse.jface.viewers.IFilter#select(java.lang.Object)
		 */
		public boolean select(Object toTest) {
			EObject eObj = EEFUtils.resolveSemanticObject(toTest);
			return eObj != null && EnvironmentPackage.Literals.FIELD == eObj.eClass();
		}
		
	}

}
