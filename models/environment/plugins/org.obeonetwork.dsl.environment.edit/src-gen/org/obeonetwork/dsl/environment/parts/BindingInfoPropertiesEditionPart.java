/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.environment.parts;

import org.eclipse.jface.viewers.ViewerFilter;


/**
 * 
 * @generated
 */
public interface BindingInfoPropertiesEditionPart {

	/**
	 * @return the left
	 * @generated
	 */
	public Object getLeft();

	/**
	 * Init the left
	 * @param input choice of values
	 * @param currentValue the current value
	 */
	public void initLeft(Object input, Object currentValue);

	/**
	 * Defines a new left
	 * @param newValue the new left to set
	 * @generated
	 */
	public void setLeft(Object newValue);

	/**
	 * Adds the given filter to the left edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToLeft(ViewerFilter filter);


	/**
	 * @return the right
	 * @generated
	 */
	public Object getRight();

	/**
	 * Init the right
	 * @param input choice of values
	 * @param currentValue the current value
	 */
	public void initRight(Object input, Object currentValue);

	/**
	 * Defines a new right
	 * @param newValue the new right to set
	 * @generated
	 */
	public void setRight(Object newValue);

	/**
	 * Adds the given filter to the right edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToRight(ViewerFilter filter);


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
