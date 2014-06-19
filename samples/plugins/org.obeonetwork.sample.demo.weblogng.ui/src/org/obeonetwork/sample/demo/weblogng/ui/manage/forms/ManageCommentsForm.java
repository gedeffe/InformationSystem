package org.obeonetwork.sample.demo.weblogng.ui.manage.forms;

// Start of user code for import 
import java.util.ArrayList;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

// End of user code for import

/**
 * Implementation of <strong>ManageComments Form</strong>
 * Scenario : Manage
 *
 */
public class ManageCommentsForm extends ValidatorForm {
	private static final long serialVersionUID = 1L;

    /**
     * Attributes
     */
	public Collection comments = new ArrayList();		
	public String hidden = null;
	public String update = null;
	public String delete = null;

	/**
	 * Return comments
	 * @return 
	 */
	 public Collection getComments() {
		return comments;
	}
	
	/**
	 * Set a value to parameter comments.
	 * @param comments 
	 */
	 public void setComments(Collection comments) {
		this.comments = comments;
	}
	/**
	 * Return hidden
	 * @return 
	 */
	 public String getHidden() {
		return hidden;
	}
	
	/**
	 * Set a value to parameter hidden.
	 * @param hidden 
	 */
	 public void setHidden(String hidden) {
		this.hidden = hidden;
	}
	/**
	 * Return update
	 * @return 
	 */
	 public String getUpdate() {
		return update;
	}
	
	/**
	 * Set a value to parameter update.
	 * @param update 
	 */
	 public void setUpdate(String update) {
		this.update = update;
	}
	/**
	 * Return delete
	 * @return 
	 */
	 public String getDelete() {
		return delete;
	}
	
	/**
	 * Set a value to parameter delete.
	 * @param delete 
	 */
	 public void setDelete(String delete) {
		this.delete = delete;
	}

	/**
	 * Reset all properties to their default values.
	 *
	 * @param mapping The mapping used to select this instance
	 * @param request The servlet request we are processing
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.comments.clear();
		this.hidden = null;
		this.update = null;
		this.delete = null;
	}

// Start of user code for other methods  	
// End of user code
	
}