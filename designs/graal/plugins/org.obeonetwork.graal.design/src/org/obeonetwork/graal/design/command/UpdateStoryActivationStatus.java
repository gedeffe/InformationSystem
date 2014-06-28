/**
 * 
 */
package org.obeonetwork.graal.design.command;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.sirius.viewpoint.DAnalysis;
import org.obeonetwork.graal.UserStory;
import org.obeonetwork.graal.design.graalfeatureextensions.UIConfiguration;
import org.obeonetwork.graal.design.services.configuration.UIConfigurationServices;

/**
 * @author <a href="goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 * 
 */
public class UpdateStoryActivationStatus extends AbstractCommand {

	private UIConfiguration config;
	private final UserStory story;
	private final DAnalysis analysis;

	/**
	 * @param config
	 * @param story
	 */
	public UpdateStoryActivationStatus(final DAnalysis analysis,
			final UserStory story) {
		super();
		this.analysis = analysis;
		this.story = story;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.common.command.AbstractCommand#prepare()
	 */
	@Override
	protected boolean prepare() {
		this.config = UIConfigurationServices.getUIConfiguration(this.analysis);
		return this.config != null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.common.command.Command#execute()
	 */
	public void execute() {
		if (this.config.getActiveUserStories().contains(this.story)) {
			this.config.getActiveUserStories().remove(this.story);
		} else {
			this.config.getActiveUserStories().clear();
			this.config.getActiveUserStories().add(this.story);
		}
		UIConfigurationServices.saveUIConfiguration(this.config, this.analysis);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.common.command.Command#redo()
	 */
	public void redo() {
		this.execute();
	}

}
