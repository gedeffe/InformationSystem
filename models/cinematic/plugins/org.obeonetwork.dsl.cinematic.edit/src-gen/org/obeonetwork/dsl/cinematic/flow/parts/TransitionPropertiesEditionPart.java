/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.cinematic.flow.parts;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;


/**
 * 
 * @generated
 */
public interface TransitionPropertiesEditionPart {

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
	 * @return the guard
	 * @generated
	 */
	public String getGuard();

	/**
	 * Defines a new guard
	 * @param newValue the new guard to set
	 * @generated
	 */
	public void setGuard(String newValue);


	/**
	 * @return the modal
	 * @generated
	 */
	public Boolean getModal();

	/**
	 * Defines a new modal
	 * @param newValue the new modal to set
	 * @generated
	 */
	public void setModal(Boolean newValue);




	/**
	 * Init the on
	 * @param settings settings for the on ReferencesTable 
	 */
	public void initOn(ReferencesTableSettings settings);

	/**
	 * Update the on
	 * @param newValue the on to update
	 * @generated
	 */
	public void updateOn();

	/**
	 * Adds the given filter to the on edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToOn(ViewerFilter filter);

	/**
	 * Adds the given filter to the on edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToOn(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the on table
	 * @generated
	 */
	public boolean isContainedInOnTable(EObject element);


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
	 * @return the from
	 * @generated
	 */
	public EObject getFrom();

	/**
	 * Init the from
	 * @param settings the combo setting
	 */
	public void initFrom(EObjectFlatComboSettings settings);

	/**
	 * Defines a new from
	 * @param newValue the new from to set
	 * @generated
	 */
	public void setFrom(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * @generated
	 */
	public void setFromButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the from edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToFrom(ViewerFilter filter);

	/**
	 * Adds the given filter to the from edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToFrom(ViewerFilter filter);


	/**
	 * @return the to
	 * @generated
	 */
	public EObject getTo();

	/**
	 * Init the to
	 * @param settings the combo setting
	 */
	public void initTo(EObjectFlatComboSettings settings);

	/**
	 * Defines a new to
	 * @param newValue the new to to set
	 * @generated
	 */
	public void setTo(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * @generated
	 */
	public void setToButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the to edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToTo(ViewerFilter filter);

	/**
	 * Adds the given filter to the to edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToTo(ViewerFilter filter);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * @generated
	 */
	public String getTitle();


}
