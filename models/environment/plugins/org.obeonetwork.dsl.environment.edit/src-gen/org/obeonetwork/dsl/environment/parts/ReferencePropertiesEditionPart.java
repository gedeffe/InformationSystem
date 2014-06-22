/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.environment.parts;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ViewerFilter;


/**
 * 
 * @generated
 */
public interface ReferencePropertiesEditionPart {

	/**
	 * @return the name
	 * @generated
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * @generated
	 */
	public void setName(String newValue);


	/**
	 * @return the type
	 * @generated
	 */
	public EObject getType();

	/**
	 * Init the type
	 * @param settings the combo setting
	 */
	public void initType(EObjectFlatComboSettings settings);

	/**
	 * Defines a new type
	 * @param newValue the new type to set
	 * @generated
	 */
	public void setType(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * @generated
	 */
	public void setTypeButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the type edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToType(ViewerFilter filter);

	/**
	 * Adds the given filter to the type edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToType(ViewerFilter filter);


	/**
	 * @return the multiplicity
	 * @generated
	 */
	public Enumerator getMultiplicity();

	/**
	 * Init the multiplicity
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initMultiplicity(Object input, Enumerator current);

	/**
	 * Defines a new multiplicity
	 * @param newValue the new multiplicity to set
	 * @generated
	 */
	public void setMultiplicity(Enumerator newValue);


	/**
	 * @return the isComposite
	 * @generated
	 */
	public Boolean getIsComposite();

	/**
	 * Defines a new isComposite
	 * @param newValue the new isComposite to set
	 * @generated
	 */
	public void setIsComposite(Boolean newValue);


	/**
	 * @return the navigable
	 * @generated
	 */
	public Boolean getNavigable();

	/**
	 * Defines a new navigable
	 * @param newValue the new navigable to set
	 * @generated
	 */
	public void setNavigable(Boolean newValue);


	/**
	 * @return the oppositeOf
	 * @generated
	 */
	public EObject getOppositeOf();

	/**
	 * Init the oppositeOf
	 * @param settings the combo setting
	 */
	public void initOppositeOf(EObjectFlatComboSettings settings);

	/**
	 * Defines a new oppositeOf
	 * @param newValue the new oppositeOf to set
	 * @generated
	 */
	public void setOppositeOf(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * @generated
	 */
	public void setOppositeOfButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the oppositeOf edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToOppositeOf(ViewerFilter filter);

	/**
	 * Adds the given filter to the oppositeOf edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToOppositeOf(ViewerFilter filter);


	/**
	 * @return the description
	 * @generated
	 */
	public String getDescription();

	/**
	 * Defines a new description
	 * @param newValue the new description to set
	 * @generated
	 */
	public void setDescription(String newValue);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * @generated
	 */
	public String getTitle();


}
