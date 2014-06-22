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
public interface FlowPropertiesEditionPart {

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
	 * Init the events
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initEvents(ReferencesTableSettings settings);

	/**
	 * Update the events
	 * @param newValue the events to update
	 * @generated
	 */
	public void updateEvents();

	/**
	 * Adds the given filter to the events edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToEvents(ViewerFilter filter);

	/**
	 * Adds the given filter to the events edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToEvents(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the events table
	 * @generated
	 */
	public boolean isContainedInEventsTable(EObject element);




	/**
	 * Init the states
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initStates(ReferencesTableSettings settings);

	/**
	 * Update the states
	 * @param newValue the states to update
	 * @generated
	 */
	public void updateStates();

	/**
	 * Adds the given filter to the states edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToStates(ViewerFilter filter);

	/**
	 * Adds the given filter to the states edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToStates(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the states table
	 * @generated
	 */
	public boolean isContainedInStatesTable(EObject element);




	/**
	 * Init the transitions
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initTransitions(ReferencesTableSettings settings);

	/**
	 * Update the transitions
	 * @param newValue the transitions to update
	 * @generated
	 */
	public void updateTransitions();

	/**
	 * Adds the given filter to the transitions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToTransitions(ViewerFilter filter);

	/**
	 * Adds the given filter to the transitions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToTransitions(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the transitions table
	 * @generated
	 */
	public boolean isContainedInTransitionsTable(EObject element);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * @generated
	 */
	public String getTitle();


}
