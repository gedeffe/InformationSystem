/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.environment.parts;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


/**
 * 
 * @generated
 */
public interface EnumerationPropertiesEditionPart {

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
	 * Init the fields
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initFields(ReferencesTableSettings settings);

	/**
	 * Update the fields
	 * @param newValue the fields to update
	 * @generated
	 */
	public void updateFields();

	/**
	 * Adds the given filter to the fields edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToFields(ViewerFilter filter);

	/**
	 * Adds the given filter to the fields edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToFields(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the fields table
	 * @generated
	 */
	public boolean isContainedInFieldsTable(EObject element);


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
