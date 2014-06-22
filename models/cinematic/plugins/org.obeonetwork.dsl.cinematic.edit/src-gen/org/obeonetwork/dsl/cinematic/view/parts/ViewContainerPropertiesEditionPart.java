/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.cinematic.view.parts;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;


/**
 * 
 * @generated
 */
public interface ViewContainerPropertiesEditionPart {

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
	 * @return the label
	 * @generated
	 */
	public String getLabel();

	/**
	 * Defines a new label
	 * @param newValue the new label to set
	 * @generated
	 */
	public void setLabel(String newValue);


	/**
	 * @return the widget
	 * @generated
	 */
	public EObject getWidget();

	/**
	 * Init the widget
	 * @param settings the combo setting
	 */
	public void initWidget(EObjectFlatComboSettings settings);

	/**
	 * Defines a new widget
	 * @param newValue the new widget to set
	 * @generated
	 */
	public void setWidget(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * @generated
	 */
	public void setWidgetButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the widget edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToWidget(ViewerFilter filter);

	/**
	 * Adds the given filter to the widget edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToWidget(ViewerFilter filter);




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
	 * Init the ownedElements
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initOwnedElements(ReferencesTableSettings settings);

	/**
	 * Update the ownedElements
	 * @param newValue the ownedElements to update
	 * @generated
	 */
	public void updateOwnedElements();

	/**
	 * Adds the given filter to the ownedElements edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToOwnedElements(ViewerFilter filter);

	/**
	 * Adds the given filter to the ownedElements edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToOwnedElements(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the ownedElements table
	 * @generated
	 */
	public boolean isContainedInOwnedElementsTable(EObject element);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * @generated
	 */
	public String getTitle();


}
