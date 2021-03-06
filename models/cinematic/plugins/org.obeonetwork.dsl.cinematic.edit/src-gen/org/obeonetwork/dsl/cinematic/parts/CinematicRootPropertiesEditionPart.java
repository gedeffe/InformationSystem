/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.cinematic.parts;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;


/**
 * 
 * @generated
 */
public interface CinematicRootPropertiesEditionPart {

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
	 * Init the toolkits
	 * @param settings settings for the toolkits ReferencesTable 
	 */
	public void initToolkits(ReferencesTableSettings settings);

	/**
	 * Update the toolkits
	 * @param newValue the toolkits to update
	 * @generated
	 */
	public void updateToolkits();

	/**
	 * Adds the given filter to the toolkits edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToToolkits(ViewerFilter filter);

	/**
	 * Adds the given filter to the toolkits edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToToolkits(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the toolkits table
	 * @generated
	 */
	public boolean isContainedInToolkitsTable(EObject element);


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
	 * Init the subPackages
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initSubPackages(ReferencesTableSettings settings);

	/**
	 * Update the subPackages
	 * @param newValue the subPackages to update
	 * @generated
	 */
	public void updateSubPackages();

	/**
	 * Adds the given filter to the subPackages edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToSubPackages(ViewerFilter filter);

	/**
	 * Adds the given filter to the subPackages edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToSubPackages(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the subPackages table
	 * @generated
	 */
	public boolean isContainedInSubPackagesTable(EObject element);




	/**
	 * Init the flows
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initFlows(ReferencesTableSettings settings);

	/**
	 * Update the flows
	 * @param newValue the flows to update
	 * @generated
	 */
	public void updateFlows();

	/**
	 * Adds the given filter to the flows edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToFlows(ViewerFilter filter);

	/**
	 * Adds the given filter to the flows edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToFlows(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the flows table
	 * @generated
	 */
	public boolean isContainedInFlowsTable(EObject element);




	/**
	 * Init the viewContainers
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
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
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * @generated
	 */
	public String getTitle();


}
