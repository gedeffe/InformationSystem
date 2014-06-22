/*******************************************************************************
 * Copyright (c) 2008-2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.dsl.soa.providers;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.providers.impl.PropertiesEditingProviderImpl;
import org.eclipse.jface.viewers.IFilter;
import org.obeonetwork.dsl.environment.components.MetadataCptPropertiesEditionComponent;
import org.obeonetwork.dsl.soa.SoaPackage;
import org.obeonetwork.dsl.soa.System;
import org.obeonetwork.dsl.soa.components.SystemPropertiesEditionComponent;
import org.obeonetwork.dsl.soa.components.SystemSystemPropertiesEditionComponent;

/**
 * @author <a href="mailto:jerome.benois@obeo.fr>Jérôme Benois</a>
 * 
 */
public class SystemPropertiesEditionProvider extends
		PropertiesEditingProviderImpl {

	/**
	 * Constructor without provider for super types.
	 */
	public SystemPropertiesEditionProvider() {
		super();
	}

	/**
	 * Constructor with providers for super types.
	 * 
	 * @param superProviders
	 *            providers to use for super types.
	 */
	public SystemPropertiesEditionProvider(
			final List<PropertiesEditingProvider> superProviders) {
		super(superProviders);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext)
	 * 
	 */
	public boolean provides(final PropertiesEditingContext editingContext) {
		return (editingContext.getEObject() instanceof System)
				&& (SoaPackage.Literals.SYSTEM == editingContext.getEObject()
						.eClass());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext,
	 *      java.lang.String)
	 * 
	 */
	public boolean provides(final PropertiesEditingContext editingContext,
			final String part) {
		return (editingContext.getEObject() instanceof System)
				&& (SystemSystemPropertiesEditionComponent.SYSTEM_PART
						.equals(part) || MetadataCptPropertiesEditionComponent.METADATAS_PART
						.equals(part));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext,
	 *      java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(final PropertiesEditingContext editingContext,
			final java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof System)
				&& ((refinement == SystemSystemPropertiesEditionComponent.class) || (refinement == MetadataCptPropertiesEditionComponent.class));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext,
	 *      java.lang.String, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(final PropertiesEditingContext editingContext,
			final String part, final java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof System)
				&& ((SystemSystemPropertiesEditionComponent.SYSTEM_PART
						.equals(part) && (refinement == SystemSystemPropertiesEditionComponent.class)) || (MetadataCptPropertiesEditionComponent.METADATAS_PART
						.equals(part) && (refinement == MetadataCptPropertiesEditionComponent.class)));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext,
	 *      java.lang.String)
	 * 
	 */
	@Override
	public IPropertiesEditionComponent getPropertiesEditingComponent(
			final PropertiesEditingContext editingContext, final String mode) {
		if (editingContext.getEObject() instanceof System) {
			return new SystemPropertiesEditionComponent(editingContext,
					editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext,
	 *      java.lang.String, java.lang.String)
	 * 
	 */
	@Override
	public IPropertiesEditionComponent getPropertiesEditingComponent(
			final PropertiesEditingContext editingContext, final String mode,
			final String part) {
		if (editingContext.getEObject() instanceof System) {
			if (SystemSystemPropertiesEditionComponent.SYSTEM_PART.equals(part)) {
				return new SystemSystemPropertiesEditionComponent(
						editingContext, editingContext.getEObject(), mode);
			}
			if (MetadataCptPropertiesEditionComponent.METADATAS_PART
					.equals(part)) {
				return new MetadataCptPropertiesEditionComponent(
						editingContext, editingContext.getEObject(), mode);
			}
		}
		return super.getPropertiesEditingComponent(editingContext, mode, part);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext,
	 *      java.lang.String, java.lang.String, java.lang.Class)
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public IPropertiesEditionComponent getPropertiesEditingComponent(
			final PropertiesEditingContext editingContext, final String mode,
			final String part, final java.lang.Class refinement) {
		if (editingContext.getEObject() instanceof System) {
			if (SystemSystemPropertiesEditionComponent.SYSTEM_PART.equals(part)
					&& (refinement == SystemSystemPropertiesEditionComponent.class)) {
				return new SystemSystemPropertiesEditionComponent(
						editingContext, editingContext.getEObject(), mode);
			}
			if (MetadataCptPropertiesEditionComponent.METADATAS_PART
					.equals(part)
					&& (refinement == MetadataCptPropertiesEditionComponent.class)) {
				return new MetadataCptPropertiesEditionComponent(
						editingContext, editingContext.getEObject(), mode);
			}
		}
		return super.getPropertiesEditingComponent(editingContext, mode, part,
				refinement);
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
		public boolean select(final Object toTest) {
			final EObject eObj = EEFUtils.resolveSemanticObject(toTest);
			return (eObj != null)
					&& (SoaPackage.Literals.SYSTEM == eObj.eClass());
		}

	}

}
