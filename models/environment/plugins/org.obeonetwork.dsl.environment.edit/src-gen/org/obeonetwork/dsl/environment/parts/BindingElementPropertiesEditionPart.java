/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.environment.parts;

import org.eclipse.jface.viewers.ViewerFilter;


/**
 * 
 * @generated
 */
public interface BindingElementPropertiesEditionPart {

	/**
	 * @return the boundElement
	 * @generated
	 */
	public Object getBoundElement();

	/**
	 * Init the boundElement
	 * @param input choice of values
	 * @param currentValue the current value
	 */
	public void initBoundElement(Object input, Object currentValue);

	/**
	 * Defines a new boundElement
	 * @param newValue the new boundElement to set
	 * @generated
	 */
	public void setBoundElement(Object newValue);

	/**
	 * Adds the given filter to the boundElement edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToBoundElement(ViewerFilter filter);


	/**
	 * @return the bindingExpression
	 * @generated
	 */
	public String getBindingExpression();

	/**
	 * Defines a new bindingExpression
	 * @param newValue the new bindingExpression to set
	 * @generated
	 */
	public void setBindingExpression(String newValue);


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
