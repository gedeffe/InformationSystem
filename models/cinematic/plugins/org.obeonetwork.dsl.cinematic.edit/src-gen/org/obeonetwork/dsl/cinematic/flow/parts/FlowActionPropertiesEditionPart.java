/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.cinematic.flow.parts;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;


/**
 * 
 * @generated
 */
public interface FlowActionPropertiesEditionPart {

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
	 * Init the calls
	 * @param settings settings for the calls ReferencesTable 
	 */
	public void initCalls(ReferencesTableSettings settings);

	/**
	 * Update the calls
	 * @param newValue the calls to update
	 * @generated
	 */
	public void updateCalls();

	/**
	 * Adds the given filter to the calls edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToCalls(ViewerFilter filter);

	/**
	 * Adds the given filter to the calls edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToCalls(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the calls table
	 * @generated
	 */
	public boolean isContainedInCallsTable(EObject element);




	/**
	 * Init the operations
	 * @param settings settings for the operations ReferencesTable 
	 */
	public void initOperations(ReferencesTableSettings settings);

	/**
	 * Update the operations
	 * @param newValue the operations to update
	 * @generated
	 */
	public void updateOperations();

	/**
	 * Adds the given filter to the operations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToOperations(ViewerFilter filter);

	/**
	 * Adds the given filter to the operations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToOperations(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the operations table
	 * @generated
	 */
	public boolean isContainedInOperationsTable(EObject element);


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
