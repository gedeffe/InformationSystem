/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.environment.parts.impl;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;

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

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
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

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import org.obeonetwork.dsl.environment.parts.EnvironmentViewsRepository;
import org.obeonetwork.dsl.environment.parts.ReferencePropertiesEditionPart;

import org.obeonetwork.dsl.environment.providers.EnvironmentMessages;


/**
 * 
 * @generated
 */
public class ReferencePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ReferencePropertiesEditionPart {

	protected Text name;
	protected EObjectFlatComboViewer type;
	protected EMFComboViewer multiplicity;
	protected Button isComposite;
	protected Button navigable;
	protected EObjectFlatComboViewer oppositeOf;
	protected Text description;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public ReferencePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
    CompositionSequence referenceStep = new BindingCompositionSequence(propertiesEditionComponent);
    CompositionStep propertiesStep = referenceStep.addStep(EnvironmentViewsRepository.Reference.Properties.class);
    propertiesStep.addStep(EnvironmentViewsRepository.Reference.Properties.name);
    propertiesStep.addStep(EnvironmentViewsRepository.Reference.Properties.type);
    propertiesStep.addStep(EnvironmentViewsRepository.Reference.Properties.multiplicity);
    propertiesStep.addStep(EnvironmentViewsRepository.Reference.Properties.isComposite);
    propertiesStep.addStep(EnvironmentViewsRepository.Reference.Properties.navigable);
    propertiesStep.addStep(EnvironmentViewsRepository.Reference.Properties.oppositeOf);
    propertiesStep.addStep(EnvironmentViewsRepository.Reference.Properties.description);
    
    
    composer = new PartComposer(referenceStep) {

      @Override
      public Composite addToPart(Composite parent, Object key) {
        if (key == EnvironmentViewsRepository.Reference.Properties.class) {
          return createPropertiesGroup(parent);
        }
        if (key == EnvironmentViewsRepository.Reference.Properties.name) {
          return createNameText(parent);
        }
        if (key == EnvironmentViewsRepository.Reference.Properties.type) {
          return createTypeFlatComboViewer(parent);
        }
        if (key == EnvironmentViewsRepository.Reference.Properties.multiplicity) {
          return createMultiplicityEMFComboViewer(parent);
        }
        if (key == EnvironmentViewsRepository.Reference.Properties.isComposite) {
          return createIsCompositeCheckbox(parent);
        }
        if (key == EnvironmentViewsRepository.Reference.Properties.navigable) {
          return createNavigableCheckbox(parent);
        }
        if (key == EnvironmentViewsRepository.Reference.Properties.oppositeOf) {
          return createOppositeOfFlatComboViewer(parent);
        }
        if (key == EnvironmentViewsRepository.Reference.Properties.description) {
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
    propertiesGroup.setText(EnvironmentMessages.ReferencePropertiesEditionPart_PropertiesGroupLabel);
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
    createDescription(parent, EnvironmentViewsRepository.Reference.Properties.name, EnvironmentMessages.ReferencePropertiesEditionPart_NameLabel);
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
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencePropertiesEditionPartImpl.this, EnvironmentViewsRepository.Reference.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
            propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencePropertiesEditionPartImpl.this, EnvironmentViewsRepository.Reference.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
        }
      }

    });
    EditingUtils.setID(name, EnvironmentViewsRepository.Reference.Properties.name);
    EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EnvironmentViewsRepository.Reference.Properties.name, EnvironmentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    // Start of user code for createNameText

    // End of user code
    return parent;
  }

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createTypeFlatComboViewer(Composite parent) {
    createDescription(parent, EnvironmentViewsRepository.Reference.Properties.type, EnvironmentMessages.ReferencePropertiesEditionPart_TypeLabel);
    type = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EnvironmentViewsRepository.Reference.Properties.type, EnvironmentViewsRepository.SWT_KIND));
    type.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

    type.addSelectionChangedListener(new ISelectionChangedListener() {

      public void selectionChanged(SelectionChangedEvent event) {
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencePropertiesEditionPartImpl.this, EnvironmentViewsRepository.Reference.Properties.type, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getType()));
      }

    });
    GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
    type.setLayoutData(typeData);
    type.setID(EnvironmentViewsRepository.Reference.Properties.type);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EnvironmentViewsRepository.Reference.Properties.type, EnvironmentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    // Start of user code for createTypeFlatComboViewer

    // End of user code
    return parent;
  }

	/**
	 * @generated
	 */
	
	protected Composite createMultiplicityEMFComboViewer(Composite parent) {
    createDescription(parent, EnvironmentViewsRepository.Reference.Properties.multiplicity, EnvironmentMessages.ReferencePropertiesEditionPart_MultiplicityLabel);
    multiplicity = new EMFComboViewer(parent);
    multiplicity.setContentProvider(new ArrayContentProvider());
    multiplicity.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
    GridData multiplicityData = new GridData(GridData.FILL_HORIZONTAL);
    multiplicity.getCombo().setLayoutData(multiplicityData);
    multiplicity.addSelectionChangedListener(new ISelectionChangedListener() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
       * 	@generated
       */
      public void selectionChanged(SelectionChangedEvent event) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencePropertiesEditionPartImpl.this, EnvironmentViewsRepository.Reference.Properties.multiplicity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getMultiplicity()));
      }

    });
    multiplicity.setID(EnvironmentViewsRepository.Reference.Properties.multiplicity);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EnvironmentViewsRepository.Reference.Properties.multiplicity, EnvironmentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    // Start of user code for createMultiplicityEMFComboViewer

    // End of user code
    return parent;
  }

	/**
	 * @generated
	 */
	
	protected Composite createIsCompositeCheckbox(Composite parent) {
    isComposite = new Button(parent, SWT.CHECK);
    isComposite.setText(getDescription(EnvironmentViewsRepository.Reference.Properties.isComposite, EnvironmentMessages.ReferencePropertiesEditionPart_IsCompositeLabel));
    isComposite.addSelectionListener(new SelectionAdapter() {

      /**
       * {@inheritDoc}
       *
       * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
       * 	@generated
       */
      public void widgetSelected(SelectionEvent e) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencePropertiesEditionPartImpl.this, EnvironmentViewsRepository.Reference.Properties.isComposite, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isComposite.getSelection())));
      }

    });
    GridData isCompositeData = new GridData(GridData.FILL_HORIZONTAL);
    isCompositeData.horizontalSpan = 2;
    isComposite.setLayoutData(isCompositeData);
    EditingUtils.setID(isComposite, EnvironmentViewsRepository.Reference.Properties.isComposite);
    EditingUtils.setEEFtype(isComposite, "eef::Checkbox"); //$NON-NLS-1$
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EnvironmentViewsRepository.Reference.Properties.isComposite, EnvironmentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    // Start of user code for createIsCompositeCheckbox

    // End of user code
    return parent;
  }

	/**
	 * @generated
	 */
	
	protected Composite createNavigableCheckbox(Composite parent) {
    navigable = new Button(parent, SWT.CHECK);
    navigable.setText(getDescription(EnvironmentViewsRepository.Reference.Properties.navigable, EnvironmentMessages.ReferencePropertiesEditionPart_NavigableLabel));
    navigable.addSelectionListener(new SelectionAdapter() {

      /**
       * {@inheritDoc}
       *
       * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
       * 	@generated
       */
      public void widgetSelected(SelectionEvent e) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencePropertiesEditionPartImpl.this, EnvironmentViewsRepository.Reference.Properties.navigable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(navigable.getSelection())));
      }

    });
    GridData navigableData = new GridData(GridData.FILL_HORIZONTAL);
    navigableData.horizontalSpan = 2;
    navigable.setLayoutData(navigableData);
    EditingUtils.setID(navigable, EnvironmentViewsRepository.Reference.Properties.navigable);
    EditingUtils.setEEFtype(navigable, "eef::Checkbox"); //$NON-NLS-1$
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EnvironmentViewsRepository.Reference.Properties.navigable, EnvironmentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    // Start of user code for createNavigableCheckbox

    // End of user code
    return parent;
  }

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createOppositeOfFlatComboViewer(Composite parent) {
    createDescription(parent, EnvironmentViewsRepository.Reference.Properties.oppositeOf, EnvironmentMessages.ReferencePropertiesEditionPart_OppositeOfLabel);
    oppositeOf = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EnvironmentViewsRepository.Reference.Properties.oppositeOf, EnvironmentViewsRepository.SWT_KIND));
    oppositeOf.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

    oppositeOf.addSelectionChangedListener(new ISelectionChangedListener() {

      public void selectionChanged(SelectionChangedEvent event) {
        propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencePropertiesEditionPartImpl.this, EnvironmentViewsRepository.Reference.Properties.oppositeOf, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getOppositeOf()));
      }

    });
    GridData oppositeOfData = new GridData(GridData.FILL_HORIZONTAL);
    oppositeOf.setLayoutData(oppositeOfData);
    oppositeOf.setID(EnvironmentViewsRepository.Reference.Properties.oppositeOf);
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EnvironmentViewsRepository.Reference.Properties.oppositeOf, EnvironmentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
    // Start of user code for createOppositeOfFlatComboViewer

    // End of user code
    return parent;
  }

	/**
	 * @generated
	 */
	
	protected Composite createDescriptionText(Composite parent) {
    createDescription(parent, EnvironmentViewsRepository.Reference.Properties.description, EnvironmentMessages.ReferencePropertiesEditionPart_DescriptionLabel);
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
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencePropertiesEditionPartImpl.this, EnvironmentViewsRepository.Reference.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
            propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ReferencePropertiesEditionPartImpl.this, EnvironmentViewsRepository.Reference.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
        }
      }

    });
    EditingUtils.setID(description, EnvironmentViewsRepository.Reference.Properties.description);
    EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
    SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EnvironmentViewsRepository.Reference.Properties.description, EnvironmentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.environment.parts.ReferencePropertiesEditionPart#getName()
	 * @generated
	 */
	public String getName() {
    return name.getText();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.ReferencePropertiesEditionPart#setName(String newValue)
	 * @generated
	 */
	public void setName(String newValue) {
    if (newValue != null) {
      name.setText(newValue);
    } else {
      name.setText(""); //$NON-NLS-1$
    }
    boolean eefElementEditorReadOnlyState = isReadOnly(EnvironmentViewsRepository.Reference.Properties.name);
    if (eefElementEditorReadOnlyState && name.isEnabled()) {
      name.setEnabled(false);
      name.setToolTipText(EnvironmentMessages.Reference_ReadOnly);
    } else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
      name.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.ReferencePropertiesEditionPart#getType()
	 * @generated
	 */
	public EObject getType() {
    if (type.getSelection() instanceof StructuredSelection) {
      Object firstElement = ((StructuredSelection) type.getSelection()).getFirstElement();
      if (firstElement instanceof EObject)
        return (EObject) firstElement;
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.ReferencePropertiesEditionPart#initType(EObjectFlatComboSettings)
	 */
	public void initType(EObjectFlatComboSettings settings) {
		type.setInput(settings);
		if (current != null) {
			type.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EnvironmentViewsRepository.Reference.Properties.type);
		if (eefElementEditorReadOnlyState && type.isEnabled()) {
			type.setEnabled(false);
			type.setToolTipText(EnvironmentMessages.Reference_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !type.isEnabled()) {
			type.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.ReferencePropertiesEditionPart#setType(EObject newValue)
	 * @generated
	 */
	public void setType(EObject newValue) {
    if (newValue != null) {
      type.setSelection(new StructuredSelection(newValue));
    } else {
      type.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean eefElementEditorReadOnlyState = isReadOnly(EnvironmentViewsRepository.Reference.Properties.type);
    if (eefElementEditorReadOnlyState && type.isEnabled()) {
      type.setEnabled(false);
      type.setToolTipText(EnvironmentMessages.Reference_ReadOnly);
    } else if (!eefElementEditorReadOnlyState && !type.isEnabled()) {
      type.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.ReferencePropertiesEditionPart#setTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTypeButtonMode(ButtonsModeEnum newValue) {
		type.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.ReferencePropertiesEditionPart#addFilterType(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToType(ViewerFilter filter) {
    type.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.ReferencePropertiesEditionPart#addBusinessFilterType(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToType(ViewerFilter filter) {
    type.addBusinessRuleFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.ReferencePropertiesEditionPart#getMultiplicity()
	 * @generated
	 */
	public Enumerator getMultiplicity() {
    Enumerator selection = (Enumerator) ((StructuredSelection) multiplicity.getSelection()).getFirstElement();
    return selection;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.ReferencePropertiesEditionPart#initMultiplicity(Object input, Enumerator current)
	 */
	public void initMultiplicity(Object input, Enumerator current) {
		multiplicity.setInput(input);
		multiplicity.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EnvironmentViewsRepository.Reference.Properties.multiplicity);
		if (eefElementEditorReadOnlyState && multiplicity.isEnabled()) {
			multiplicity.setEnabled(false);
			multiplicity.setToolTipText(EnvironmentMessages.Reference_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !multiplicity.isEnabled()) {
			multiplicity.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.ReferencePropertiesEditionPart#setMultiplicity(Enumerator newValue)
	 * @generated
	 */
	public void setMultiplicity(Enumerator newValue) {
    multiplicity.modelUpdating(new StructuredSelection(newValue));
    boolean eefElementEditorReadOnlyState = isReadOnly(EnvironmentViewsRepository.Reference.Properties.multiplicity);
    if (eefElementEditorReadOnlyState && multiplicity.isEnabled()) {
      multiplicity.setEnabled(false);
      multiplicity.setToolTipText(EnvironmentMessages.Reference_ReadOnly);
    } else if (!eefElementEditorReadOnlyState && !multiplicity.isEnabled()) {
      multiplicity.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.ReferencePropertiesEditionPart#getIsComposite()
	 * @generated
	 */
	public Boolean getIsComposite() {
    return Boolean.valueOf(isComposite.getSelection());
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.ReferencePropertiesEditionPart#setIsComposite(Boolean newValue)
	 * @generated
	 */
	public void setIsComposite(Boolean newValue) {
    if (newValue != null) {
      isComposite.setSelection(newValue.booleanValue());
    } else {
      isComposite.setSelection(false);
    }
    boolean eefElementEditorReadOnlyState = isReadOnly(EnvironmentViewsRepository.Reference.Properties.isComposite);
    if (eefElementEditorReadOnlyState && isComposite.isEnabled()) {
      isComposite.setEnabled(false);
      isComposite.setToolTipText(EnvironmentMessages.Reference_ReadOnly);
    } else if (!eefElementEditorReadOnlyState && !isComposite.isEnabled()) {
      isComposite.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.ReferencePropertiesEditionPart#getNavigable()
	 * @generated
	 */
	public Boolean getNavigable() {
    return Boolean.valueOf(navigable.getSelection());
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.ReferencePropertiesEditionPart#setNavigable(Boolean newValue)
	 * @generated
	 */
	public void setNavigable(Boolean newValue) {
    if (newValue != null) {
      navigable.setSelection(newValue.booleanValue());
    } else {
      navigable.setSelection(false);
    }
    boolean eefElementEditorReadOnlyState = isReadOnly(EnvironmentViewsRepository.Reference.Properties.navigable);
    if (eefElementEditorReadOnlyState && navigable.isEnabled()) {
      navigable.setEnabled(false);
      navigable.setToolTipText(EnvironmentMessages.Reference_ReadOnly);
    } else if (!eefElementEditorReadOnlyState && !navigable.isEnabled()) {
      navigable.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.ReferencePropertiesEditionPart#getOppositeOf()
	 * @generated
	 */
	public EObject getOppositeOf() {
    if (oppositeOf.getSelection() instanceof StructuredSelection) {
      Object firstElement = ((StructuredSelection) oppositeOf.getSelection()).getFirstElement();
      if (firstElement instanceof EObject)
        return (EObject) firstElement;
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.ReferencePropertiesEditionPart#initOppositeOf(EObjectFlatComboSettings)
	 */
	public void initOppositeOf(EObjectFlatComboSettings settings) {
		oppositeOf.setInput(settings);
		if (current != null) {
			oppositeOf.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EnvironmentViewsRepository.Reference.Properties.oppositeOf);
		if (eefElementEditorReadOnlyState && oppositeOf.isEnabled()) {
			oppositeOf.setEnabled(false);
			oppositeOf.setToolTipText(EnvironmentMessages.Reference_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !oppositeOf.isEnabled()) {
			oppositeOf.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.ReferencePropertiesEditionPart#setOppositeOf(EObject newValue)
	 * @generated
	 */
	public void setOppositeOf(EObject newValue) {
    if (newValue != null) {
      oppositeOf.setSelection(new StructuredSelection(newValue));
    } else {
      oppositeOf.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean eefElementEditorReadOnlyState = isReadOnly(EnvironmentViewsRepository.Reference.Properties.oppositeOf);
    if (eefElementEditorReadOnlyState && oppositeOf.isEnabled()) {
      oppositeOf.setEnabled(false);
      oppositeOf.setToolTipText(EnvironmentMessages.Reference_ReadOnly);
    } else if (!eefElementEditorReadOnlyState && !oppositeOf.isEnabled()) {
      oppositeOf.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.ReferencePropertiesEditionPart#setOppositeOfButtonMode(ButtonsModeEnum newValue)
	 */
	public void setOppositeOfButtonMode(ButtonsModeEnum newValue) {
		oppositeOf.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.ReferencePropertiesEditionPart#addFilterOppositeOf(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToOppositeOf(ViewerFilter filter) {
    oppositeOf.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.ReferencePropertiesEditionPart#addBusinessFilterOppositeOf(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToOppositeOf(ViewerFilter filter) {
    oppositeOf.addBusinessRuleFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.ReferencePropertiesEditionPart#getDescription()
	 * @generated
	 */
	public String getDescription() {
    return description.getText();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.ReferencePropertiesEditionPart#setDescription(String newValue)
	 * @generated
	 */
	public void setDescription(String newValue) {
    if (newValue != null) {
      description.setText(newValue);
    } else {
      description.setText(""); //$NON-NLS-1$
    }
    boolean eefElementEditorReadOnlyState = isReadOnly(EnvironmentViewsRepository.Reference.Properties.description);
    if (eefElementEditorReadOnlyState && description.isEnabled()) {
      description.setEnabled(false);
      description.setToolTipText(EnvironmentMessages.Reference_ReadOnly);
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
    return EnvironmentMessages.Reference_Part_Title;
  }



}
