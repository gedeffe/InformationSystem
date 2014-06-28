package org.obeonetwork.dsl.is.design.service;

import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.description.Layer;

public class DiagramService {

	public static boolean isLayerActivated(final DDiagram diagram,
			final String layerName) {
		for (final Layer activatedLayer : diagram.getActivatedLayers()) {
			if (layerName.equals(activatedLayer.getName())) {
				return true;
			}
		}
		return false;
	}
}
