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
public interface ViewStatePropertiesEditionPart {

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
	 * Init the actions
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initActions(ReferencesTableSettings settings);

	/**
	 * Update the actions
	 * @param newValue the actions to update
	 * @generated
	 */
	public void updateActions();

	/**
	 * Adds the given filter to the actions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToActions(ViewerFilter filter);

	/**
	 * Adds the given filter to the actions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToActions(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the actions table
	 * @generated
	 */
	public boolean isContainedInActionsTable(EObject element);


	/**
	 * @return the newInstance
	 * @generated
	 */
	public Boolean getNewInstance();

	/**
	 * Defines a new newInstance
	 * @param newValue the new newInstance to set
	 * @generated
	 */
	public void setNewInstance(Boolean newValue);


	/**
	 * @return the refresh
	 * @generated
	 */
	public Boolean getRefresh();

	/**
	 * Defines a new refresh
	 * @param newValue the new refresh to set
	 * @generated
	 */
	public void setRefresh(Boolean newValue);




	/**
	 * Init the viewContainers
	 * @param settings settings for the viewContainers ReferencesTable 
	 */
	public void initViewContainers(ReferencesTableSettings settings);

	/**
	 * Update the viewContainers
	 * @param newValue the viewContainers to update
	 * @generated
	 */
	public void updateViewContainers();

	/**
	 * Adds the given filter to the viewContainers edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToViewContainers(ViewerFilter filter);

	/**
	 * Adds the given filter to the viewContainers edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToViewContainers(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the viewContainers table
	 * @generated
	 */
	public boolean isContainedInViewContainersTable(EObject element);


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
