/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.cinematic.view.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.obeonetwork.dsl.cinematic.view.parts.ViewViewsRepository;
import org.obeonetwork.dsl.cinematic.view.parts.forms.ViewActionPropertiesEditionPartForm;
import org.obeonetwork.dsl.cinematic.view.parts.forms.ViewContainerPropertiesEditionPartForm;
import org.obeonetwork.dsl.cinematic.view.parts.forms.ViewContainerReferencePropertiesEditionPartForm;
import org.obeonetwork.dsl.cinematic.view.parts.forms.ViewElementPropertiesEditionPartForm;
import org.obeonetwork.dsl.cinematic.view.parts.forms.ViewEventPropertiesEditionPartForm;
import org.obeonetwork.dsl.cinematic.view.parts.impl.ViewActionPropertiesEditionPartImpl;
import org.obeonetwork.dsl.cinematic.view.parts.impl.ViewContainerPropertiesEditionPartImpl;
import org.obeonetwork.dsl.cinematic.view.parts.impl.ViewContainerReferencePropertiesEditionPartImpl;
import org.obeonetwork.dsl.cinematic.view.parts.impl.ViewElementPropertiesEditionPartImpl;
import org.obeonetwork.dsl.cinematic.view.parts.impl.ViewEventPropertiesEditionPartImpl;

/**
 * 
 * @generated
 */
public class ViewPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * @generated
	 */
	public boolean provides(Object key) {
		return key == ViewViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * @generated
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == ViewViewsRepository.ViewContainer.class) {
			if (kind == ViewViewsRepository.SWT_KIND)
				return new ViewContainerPropertiesEditionPartImpl(component);
			if (kind == ViewViewsRepository.FORM_KIND)
				return new ViewContainerPropertiesEditionPartForm(component);
		}
		if (key == ViewViewsRepository.ViewElement.class) {
			if (kind == ViewViewsRepository.SWT_KIND)
				return new ViewElementPropertiesEditionPartImpl(component);
			if (kind == ViewViewsRepository.FORM_KIND)
				return new ViewElementPropertiesEditionPartForm(component);
		}
		if (key == ViewViewsRepository.ViewAction.class) {
			if (kind == ViewViewsRepository.SWT_KIND)
				return new ViewActionPropertiesEditionPartImpl(component);
			if (kind == ViewViewsRepository.FORM_KIND)
				return new ViewActionPropertiesEditionPartForm(component);
		}
		if (key == ViewViewsRepository.ViewEvent.class) {
			if (kind == ViewViewsRepository.SWT_KIND)
				return new ViewEventPropertiesEditionPartImpl(component);
			if (kind == ViewViewsRepository.FORM_KIND)
				return new ViewEventPropertiesEditionPartForm(component);
		}
		if (key == ViewViewsRepository.ViewContainerReference.class) {
			if (kind == ViewViewsRepository.SWT_KIND)
				return new ViewContainerReferencePropertiesEditionPartImpl(component);
			if (kind == ViewViewsRepository.FORM_KIND)
				return new ViewContainerReferencePropertiesEditionPartForm(component);
		}
		return null;
	}

}
