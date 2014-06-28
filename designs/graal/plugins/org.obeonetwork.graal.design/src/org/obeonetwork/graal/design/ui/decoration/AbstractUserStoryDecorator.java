/*******************************************************************************
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.graal.design.ui.decoration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.AbstractDecorator;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.sirius.business.api.query.EObjectQuery;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DDiagramElementContainer;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.EdgeTarget;
import org.eclipse.sirius.diagram.ui.edit.api.part.IDiagramElementEditPart;
import org.eclipse.sirius.viewpoint.DAnalysis;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.obeonetwork.graal.GraalObject;
import org.obeonetwork.graal.GraalPackage;
import org.obeonetwork.graal.System;
import org.obeonetwork.graal.UserStory;
import org.obeonetwork.graal.design.graalfeatureextensions.GraalfeatureextensionsPackage;
import org.obeonetwork.graal.design.graalfeatureextensions.UIConfiguration;
import org.obeonetwork.graal.design.services.configuration.UIConfigurationServices;

/**
 * User story decorators' superclass
 * 
 * @author <a href="mailto:stephane.thibaudeau@obeo.fr">Stephane Thibaudeau</a>
 */
public abstract class AbstractUserStoryDecorator extends AbstractDecorator {
	private GraalObject graalObject = null;
	private GraalObject graalObject2 = null;
	private DAnalysis analysis = null;
	private UIConfiguration uiConfiguration = null;
	private Adapter airdAdapter = null;
	private Adapter configurationAdapter = null;
	private final List<UserStory> activeUserStories = new ArrayList<UserStory>();
	private final List<Adapter> activeUserStoriesAdapters = new ArrayList<Adapter>();
	private static final int[][] colorsRgbValues = new int[][] {
			new int[] { 255, 140, 42 }, new int[] { 186, 89, 210 },
			new int[] { 87, 157, 80 }, new int[] { 195, 52, 89 },
			new int[] { 255, 178, 0 }, new int[] { 0, 69, 134 } };
	private final Map<Integer, Color> createdColors = new HashMap<Integer, Color>();
	private static final String USE_EDGE_MAPPING_NAME = "TG_Use";

	protected AbstractUserStoryDecorator(final IDecoratorTarget target) {
		super(target);
		final EObject semanticElement = this.getTargetEditPart()
				.resolveTargetSemanticElement();

		// Use relationships must be handle in a special way
		// because 2 semantic elements must be taken into account
		final String mappingName = this.getTargetEditPart()
				.resolveDiagramElement().getDiagramElementMapping().getName();
		if (USE_EDGE_MAPPING_NAME.equals(mappingName)) {
			final DDiagramElement diagramElement = this.getTargetEditPart()
					.resolveDiagramElement();
			if (diagramElement instanceof DEdge) {
				this.graalObject = this
						.getGraalObjectForEdgeTarget(((DEdge) diagramElement)
								.getSourceNode());
				this.graalObject2 = this
						.getGraalObjectForEdgeTarget(((DEdge) diagramElement)
								.getTargetNode());
			}
		} else {
			if (semanticElement instanceof GraalObject) {
				this.graalObject = (GraalObject) semanticElement;
			}
		}
	}

	/**
	 * 
	 * @param edgeTarget
	 * @return
	 */
	protected GraalObject getGraalObjectForEdgeTarget(
			final EdgeTarget edgeTarget) {
		EObject semantic = null;
		if (edgeTarget instanceof DNode) {
			semantic = ((DNode) edgeTarget).getTarget();
		} else if (edgeTarget instanceof DDiagramElementContainer) {
			semantic = ((DDiagramElementContainer) edgeTarget).getTarget();
		}
		if ((semantic != null) && (semantic instanceof GraalObject)) {
			return (GraalObject) semantic;
		}
		return null;
	}

	/**
	 * Gets the DiagramElementEditPart corresponding to the decorated element
	 * 
	 * @return DiagramElementEditPart instance
	 */
	protected IDiagramElementEditPart getTargetEditPart() {
		return (IDiagramElementEditPart) this.getDecoratorTarget().getAdapter(
				IDiagramElementEditPart.class);
	}

	/**
	 * Gets the list of active user stories
	 * 
	 * @return List of active user stories
	 */
	protected List<UserStory> getActiveUserStories() {
		return this.activeUserStories;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecorator#activate()
	 */
	public void activate() {
		this.analysis = getAnalysis(this.getTargetEditPart());
		if (this.analysis != null) {
			final UIConfiguration configuration = UIConfigurationServices
					.getUIConfigurationOnlyIfExisting(this.analysis);
			if (configuration != null) {
				this.uiConfiguration = configuration;
				this.attachConfigurationAdapter();
			} else {
				this.attachAirdAdapter();
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecorator#deactivate()
	 */
	@Override
	public void deactivate() {
		this.detachAirdAdapter();
		this.detachConfigurationAdapter();
		this.detachUserStoriesAdapters();
		// release color resources
		for (final Color createdColor : this.createdColors.values()) {
			createdColor.dispose();
		}
		super.deactivate();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecorator#refresh()
	 */
	public void refresh() {
		if (this.activeUserStoriesChanged() == true) {
			this.detachUserStoriesAdapters();
			this.attachUserStoriesAdapters();
			this.doRefresh();
		}
	}

	/**
	 * Abstract method used to implement the specific refresh behaviour
	 */
	abstract protected void doRefresh();

	/**
	 * Attaches adapters on the active user stories to refresh the decorator
	 * when an user story changes
	 */
	private void attachUserStoriesAdapters() {
		for (final UserStory activeUserStory : this.activeUserStories) {
			final Adapter adapter = new AdapterImpl() {
				@Override
				public void notifyChanged(final Notification msg) {
					if (GraalPackage.Literals.USER_STORY__ELEMENTS.equals(msg
							.getFeature())) {
						AbstractUserStoryDecorator.this.doRefresh();
					}
				}
			};
			activeUserStory.eAdapters().add(adapter);
			this.activeUserStoriesAdapters.add(adapter);
		}
	}

	/**
	 * Detaches all adapters from user stories
	 */
	private void detachUserStoriesAdapters() {
		for (final Adapter adapter : this.activeUserStoriesAdapters) {
			adapter.getTarget().eAdapters().remove(adapter);
		}
		this.activeUserStoriesAdapters.clear();
	}

	/**
	 * Attaches an adapter on the aird resource This adapter is used to know
	 * when an UIConfiguration has been created so we can attach a listener on
	 * the UIConfiguration itself The adapter on the aird will be detached as
	 * soon as we have been able to attach the adapter on the UIConfiguration
	 */
	private void attachAirdAdapter() {
		this.airdAdapter = new AdapterImpl() {
			@Override
			public void notifyChanged(final Notification msg) {
				final UIConfiguration configuration = UIConfigurationServices
						.getUIConfigurationOnlyIfExisting(AbstractUserStoryDecorator.this.analysis);
				if ((configuration != null)
						&& (AbstractUserStoryDecorator.this.uiConfiguration == null)) {
					AbstractUserStoryDecorator.this.uiConfiguration = configuration;
					AbstractUserStoryDecorator.this.detachAirdAdapter();
					AbstractUserStoryDecorator.this
							.attachConfigurationAdapter();
					AbstractUserStoryDecorator.this.refresh();
				}
			}
		};
		this.analysis.eResource().eAdapters().add(this.airdAdapter);
	}

	/**
	 * Detaches the adapter from the aird resource
	 */
	private void detachAirdAdapter() {
		if (this.airdAdapter != null) {
			this.airdAdapter.getTarget().eAdapters().remove(this.airdAdapter);
			this.airdAdapter = null;
		}
	}

	/**
	 * Attaches an adapter on the UI configuration This adapter is used to know
	 * when the active user stories change and to refresh the decorator
	 */
	private void attachConfigurationAdapter() {
		this.configurationAdapter = new AdapterImpl() {
			@Override
			public void notifyChanged(final Notification msg) {
				if (GraalfeatureextensionsPackage.Literals.UI_CONFIGURATION__ACTIVE_USER_STORIES
						.equals(msg.getFeature())) {
					AbstractUserStoryDecorator.this.refresh();
				}
			}
		};
		this.uiConfiguration.eAdapters().add(this.configurationAdapter);
	}

	/**
	 * Detaches the adapter from the UIConfiguration
	 */
	private void detachConfigurationAdapter() {
		if (this.configurationAdapter != null) {
			if ((this.configurationAdapter.getTarget() != null)
					&& (this.configurationAdapter.getTarget().eAdapters() != null)) {
				this.configurationAdapter.getTarget().eAdapters()
						.remove(this.configurationAdapter);
			}
			this.configurationAdapter = null;
		}
	}

	/**
	 * Retrieves the DAnalysis instance from a diagram edit part
	 * 
	 * @param diagramEditPart
	 *            Diagram edit part corresponding to an element on a viewpoint
	 *            diagram
	 * @return the DAnalysis instance
	 */
	private static DAnalysis getAnalysis(
			final IDiagramElementEditPart diagramEditPart) {
		final EObject viewpointNode = diagramEditPart.resolveSemanticElement();
		// EObject container = EcoreUtil.getRootContainer(viewpointNode);
		final Session session = (new EObjectQuery(viewpointNode)).getSession();
		final EObject analysisEObject = session.getSessionResource()
				.getContents().get(0);
		if (analysisEObject instanceof DAnalysis) {
			return (DAnalysis) analysisEObject;
		}
		// if (container != null && container instanceof DAnalysis) {
		// return (DAnalysis)container;
		// }
		return null;
	}

	/**
	 * Checks if the targetted semantic element is referenced by the active user
	 * story Up to now, only one user story can be activated even if an
	 * UIConfiguration can store a list of active user stories. This method
	 * considers the first user story from this list to be the active user story
	 * 
	 * @return true if the active user story references the semantic element
	 */
	protected boolean isConcernedByActiveUserStory() {
		if ((this.activeUserStories.isEmpty() == false)
				&& (this.graalObject != null)) {
			if (this.graalObject2 == null) {
				return this.graalObject
						.isConcernedByUserStory(this.activeUserStories.get(0));
			} else {
				return this.graalObject
						.isConcernedByUserStory(this.activeUserStories.get(0))
						&& this.graalObject2
								.isConcernedByUserStory(this.activeUserStories
										.get(0));
			}
		}
		return false;
	}

	/**
	 * Checks if the active user stories
	 * 
	 * @return
	 */
	protected boolean activeUserStoriesChanged() {
		if (this.uiConfiguration == null) {
			return false;
		}
		// Retrieve active user stories
		final List<UserStory> savedActiveUserStories = this.uiConfiguration
				.getActiveUserStories();
		// Empty now
		if ((savedActiveUserStories == null)
				|| savedActiveUserStories.isEmpty()) {
			if (this.activeUserStories.isEmpty()) {
				return false;
			} else {
				this.activeUserStories.clear();
				return true;
			}
		} else {
			// Not empty now
			if (savedActiveUserStories.containsAll(this.activeUserStories)
					&& this.activeUserStories
							.containsAll(savedActiveUserStories)) {
				return false;
			} else {
				this.activeUserStories.clear();
				this.activeUserStories.addAll(savedActiveUserStories);
				return true;
			}
		}
	}

	/**
	 * Picks a color to be used to display a user story
	 * 
	 * @param userStory
	 *            user story to be displayed
	 * @return a color instance
	 */
	protected Color pickColor(final UserStory userStory) {
		final int index = this.getUserStoryIndex(userStory);
		Color color = this.createdColors.get(index);

		if (color == null) {
			final int startingColorIndex = index % colorsRgbValues.length;

			final int red = this.translateColorValue(
					colorsRgbValues[startingColorIndex][0], index, 20);
			final int green = this.translateColorValue(
					colorsRgbValues[startingColorIndex][1], index, -20);
			final int blue = this.translateColorValue(
					colorsRgbValues[startingColorIndex][2], index, 10);

			color = new Color(Display.getCurrent(), red, green, blue);
			this.createdColors.put(index, color);
		}
		return color;
	}

	/**
	 * Translates one of a color RGB values. This method is used to always get
	 * different colors
	 * 
	 * @param initialValue
	 *            Red, Green or Blue value
	 * @param index
	 *            Index of the color to be picked
	 * @param translation
	 *            value used to translate the value
	 * @return
	 */
	private int translateColorValue(final int initialValue, final int index,
			final int translation) {
		int value = (initialValue + ((index / colorsRgbValues.length) * translation)) % 256;
		if (value < 0) {
			value = value + 256;
		}
		return value;
	}

	/**
	 * Returns the index of the specified user story from the whole user stories
	 * list
	 * 
	 * @param userStory
	 * @return index from list
	 */
	private int getUserStoryIndex(final UserStory userStory) {
		// Get System containing the user story
		final System system = (System) userStory.eContainer();
		return system.getUserStories().indexOf(userStory);
	}
}
