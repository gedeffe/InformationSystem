/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.environment.parts.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import org.obeonetwork.dsl.environment.parts.EnumerationPropertiesEditionPart;
import org.obeonetwork.dsl.environment.parts.EnvironmentViewsRepository;

import org.obeonetwork.dsl.environment.providers.EnvironmentMessages;


/**
 * 
 * @generated
 */
public class EnumerationPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, EnumerationPropertiesEditionPart {

	protected Text name;
	protected ReferencesTable fields;
	protected List<ViewerFilter> fieldsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> fieldsFilters = new ArrayList<ViewerFilter>();
	protected Text description;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public EnumerationPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
    super(editionComponent);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * @generated
	 */
	public Composite createFigure(final Composite parent) {
    view = new Composite(parent, SWT.NONE);
    GridLayout layout = new GridLayout();
    layout.numColumns = 3;
    view.setLayout(layout);
    createControls(view);
    return view;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * @generated
	 */
	public void createControls(Composite view) { 
    CompositionSequence enumerationStep = new BindingCompositionSequence(propertiesEditionComponent);
    CompositionStep propertiesStep = enumerationStep.addStep(EnvironmentViewsRepository.Enumeration.Properties.class);
    propertiesStep.addStep(EnvironmentViewsRepository.Enumeration.Properties.name);
    propertiesStep.addStep(EnvironmentViewsRepository.Enumeration.Properties.fields);
    propertiesStep.addStep(EnvironmentViewsRepository.Enumeration.Properties.description);
    
    
    composer = new PartComposer(enumerationStep) {

      @Override
      public Composite addToPart(Composite parent, Object key) {
        if (key == EnvironmentViewsRepository.Enumeration.Properties.class) {
          return createPropertiesGroup(parent);
        }
        if (key == EnvironmentViewsRepository.Enumeration.Properties.name) {
          return createNameText(parent);
        }
        if (key == EnvironmentViewsRepository.Enumeration.Properties.fields) {
          return createFieldsAdvancedTableComposition(parent);
        }
        if (key == EnvironmentViewsRepository.Enumeration.Properties.description) {
          return createDescriptionText(parent);
        }
        return parent;
      }
    };
    composer.compose(view);
  }

	/**
	 * @generated
	 */
	protected Composite createPropertiesGroup(Composite parent) {
    Group propertiesGroup = new Group(parent, SWT.NONE);
    propertiesGroup.setText(EnvironmentMessages.EnumerationPropertiesEditionPart_PropertiesGroupLabel);
    GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
    propertiesGroupData.horizontalSpan = 3;
    propertiesGroup.setLayoutData(propertiesGroupData);
    GridLayout propertiesGroupLayout = new GridLayout();
    propertiesGroupLayout.numColumns = 3;
    propertiesGroup.setLayout(propertiesGroupLayout);
    return propertiesGroup;
  }

	/**
	 * @generated
	 */
	
	protected Composite createNameText(Composite parent) {
    createDescription(parent, EnvironmentViewsRepository.Enumeration.Properties.name, EnvironmentMessages.EnumerationPropertiesEditionPart_NameLabel);
    name = SWTUtils.createScrollableText(parent, SWT.BORDER);
    GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
    name.setLayoutData(nameData);
    name.addFocusListener(new FocusAdapter() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
       * @generated
       */
      @Override
      @SuppressWarnings("synthetic-access")
      public void focusLost(FocusEvent e) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnumerationPropertiesEditionPartImpl.this, EnvironmentViewsRepository.Enumeration.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
      }

    });
    name.addKeyListener(new KeyAdapter() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
       * @generated
       */
      @Override
      @SuppressWarnings("synthetic-access")
      public void keyPressed(KeyEvent e) {
        if (e.character == SWT.CR) {
          if (propertiesEditionComponent != null)
            propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnumerationPropertiesEditionPartImpl.this, EnvironmentViewsRepository.Enumeration.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
        }
      }

    });
    EditingUtils.setID(name, EnvironmentViewsRepository.Enumeration.Properties.name);
    EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EnvironmentViewsRepository.Enumeration.Properties.name, EnvironmentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    // Start of user code for createNameText

    // End of user code
    return parent;
  }

	/**
	 * @param container
	 * @generated
	 */
	protected Composite createFieldsAdvancedTableComposition(Composite parent) {
    this.fields = new ReferencesTable(getDescription(EnvironmentViewsRepository.Enumeration.Properties.fields, EnvironmentMessages.EnumerationPropertiesEditionPart_FieldsLabel), new ReferencesTableListener() {
      public void handleAdd() { 
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnumerationPropertiesEditionPartImpl.this, EnvironmentViewsRepository.Enumeration.Properties.fields, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
        fields.refresh();
      }
      public void handleEdit(EObject element) {
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnumerationPropertiesEditionPartImpl.this, EnvironmentViewsRepository.Enumeration.Properties.fields, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
        fields.refresh();
      }
      public void handleMove(EObject element, int oldIndex, int newIndex) { 
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnumerationPropertiesEditionPartImpl.this, EnvironmentViewsRepository.Enumeration.Properties.fields, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
        fields.refresh();
      }
      public void handleRemove(EObject element) { 
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnumerationPropertiesEditionPartImpl.this, EnvironmentViewsRepository.Enumeration.Properties.fields, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
        fields.refresh();
      }
      public void navigateTo(EObject element) { }
    });
    for (ViewerFilter filter : this.fieldsFilters) {
      this.fields.addFilter(filter);
    }
    this.fields.setHelpText(propertiesEditionComponent.getHelpContent(EnvironmentViewsRepository.Enumeration.Properties.fields, EnvironmentViewsRepository.SWT_KIND));
    this.fields.createControls(parent);
    this.fields.addSelectionListener(new SelectionAdapter() {
      
      public void widgetSelected(SelectionEvent e) {
        if (e.item != null && e.item.getData() instanceof EObject) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnumerationPropertiesEditionPartImpl.this, EnvironmentViewsRepository.Enumeration.Properties.fields, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
        }
      }
      
    });
    GridData fieldsData = new GridData(GridData.FILL_HORIZONTAL);
    fieldsData.horizontalSpan = 3;
    this.fields.setLayoutData(fieldsData);
    this.fields.setLowerBound(1);
    this.fields.setUpperBound(-1);
    fields.setID(EnvironmentViewsRepository.Enumeration.Properties.fields);
    fields.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
    // Start of user code for createFieldsAdvancedTableComposition

    // End of user code
    return parent;
  }

	/**
	 * @generated
	 */
	
	protected Composite createDescriptionText(Composite parent) {
    createDescription(parent, EnvironmentViewsRepository.Enumeration.Properties.description, EnvironmentMessages.EnumerationPropertiesEditionPart_DescriptionLabel);
    description = SWTUtils.createScrollableText(parent, SWT.BORDER);
    GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
    description.setLayoutData(descriptionData);
    description.addFocusListener(new FocusAdapter() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
       * @generated
       */
      @Override
      @SuppressWarnings("synthetic-access")
      public void focusLost(FocusEvent e) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnumerationPropertiesEditionPartImpl.this, EnvironmentViewsRepository.Enumeration.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
      }

    });
    description.addKeyListener(new KeyAdapter() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
       * @generated
       */
      @Override
      @SuppressWarnings("synthetic-access")
      public void keyPressed(KeyEvent e) {
        if (e.character == SWT.CR) {
          if (propertiesEditionComponent != null)
            propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnumerationPropertiesEditionPartImpl.this, EnvironmentViewsRepository.Enumeration.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
        }
      }

    });
    EditingUtils.setID(description, EnvironmentViewsRepository.Enumeration.Properties.description);
    EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EnvironmentViewsRepository.Enumeration.Properties.description, EnvironmentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    // Start of user code for createDescriptionText

    // End of user code
    return parent;
  }


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * @generated
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.EnumerationPropertiesEditionPart#getName()
	 * @generated
	 */
	public String getName() {
    return name.getText();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.EnumerationPropertiesEditionPart#setName(String newValue)
	 * @generated
	 */
	public void setName(String newValue) {
    if (newValue != null) {
      name.setText(newValue);
    } else {
      name.setText(""); //$NON-NLS-1$
    }
    boolean eefElementEditorReadOnlyState = isReadOnly(EnvironmentViewsRepository.Enumeration.Properties.name);
    if (eefElementEditorReadOnlyState && name.isEnabled()) {
      name.setEnabled(false);
      name.setToolTipText(EnvironmentMessages.Enumeration_ReadOnly);
    } else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
      name.setEnabled(true);
    }	
    
  }



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.EnumerationPropertiesEditionPart#initFields(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initFields(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		fields.setContentProvider(contentProvider);
		fields.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EnvironmentViewsRepository.Enumeration.Properties.fields);
		if (eefElementEditorReadOnlyState && fields.isEnabled()) {
			fields.setEnabled(false);
			fields.setToolTipText(EnvironmentMessages.Enumeration_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fields.isEnabled()) {
			fields.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.EnumerationPropertiesEditionPart#updateFields()
	 * @generated
	 */
	public void updateFields() {
  fields.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.EnumerationPropertiesEditionPart#addFilterFields(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToFields(ViewerFilter filter) {
    fieldsFilters.add(filter);
    if (this.fields != null) {
      this.fields.addFilter(filter);
    }
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.EnumerationPropertiesEditionPart#addBusinessFilterFields(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToFields(ViewerFilter filter) {
    fieldsBusinessFilters.add(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.EnumerationPropertiesEditionPart#isContainedInFieldsTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInFieldsTable(EObject element) {
    return ((ReferencesTableSettings)fields.getInput()).contains(element);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.EnumerationPropertiesEditionPart#getDescription()
	 * @generated
	 */
	public String getDescription() {
    return description.getText();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.EnumerationPropertiesEditionPart#setDescription(String newValue)
	 * @generated
	 */
	public void setDescription(String newValue) {
    if (newValue != null) {
      description.setText(newValue);
    } else {
      description.setText(""); //$NON-NLS-1$
    }
    boolean eefElementEditorReadOnlyState = isReadOnly(EnvironmentViewsRepository.Enumeration.Properties.description);
    if (eefElementEditorReadOnlyState && description.isEnabled()) {
      description.setEnabled(false);
      description.setToolTipText(EnvironmentMessages.Enumeration_ReadOnly);
    } else if (!eefElementEditorReadOnlyState && !description.isEnabled()) {
      description.setEnabled(true);
    }	
    
  }






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
    return EnvironmentMessages.Enumeration_Part_Title;
  }



}
