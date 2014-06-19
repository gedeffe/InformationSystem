/**
 * <copyright>
 *
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id$
 */

package org.obeonetwork.demo.weblog.plugin.wizard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import org.obeonetwork.demo.weblog.plugin.WeblogDemoPlugin;


public class WeblogSpringDemoWizard
	extends AbstractExampleWizard {
	
	protected Collection getProjectDescriptors() {
		// We need the workspace example to be unzipped along with the
		// EMF library example model, edit and editor examples
		List projects = new ArrayList(2);
		projects.add(new ProjectDescriptor("org.obeonetwork.demo.weblog.plugin", "zips/org.obeonetwork.demo.weblog.ui.zip", "org.obeonetwork.demo.weblog.ui"));  //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
		projects.add(new ProjectDescriptor("org.obeonetwork.demo.weblog.plugin", "zips/org.obeonetwork.demo.weblog.business.zip", "org.obeonetwork.demo.weblog.business"));  //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
		return projects;
	}
	
	protected void log(Exception e) {
		if (e instanceof CoreException) {
			WeblogDemoPlugin.getDefault().getLog().log(((CoreException)e).getStatus());
		} else {
			WeblogDemoPlugin.getDefault().getLog().log(new Status(IStatus.ERROR, WeblogDemoPlugin.getDefault().getBundle().getSymbolicName(),IStatus.ERROR, e.getMessage(),e));
		}
	}
}
