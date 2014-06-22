/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.environment.parts.forms;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import org.obeonetwork.dsl.environment.parts.EnvironmentViewsRepository;
import org.obeonetwork.dsl.environment.parts.InterDSMLinkPropertiesEditionPart;

import org.obeonetwork.dsl.environment.providers.EnvironmentMessages;


/**
 * 
 * @generated
 */
public class InterDSMLinkPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, InterDSMLinkPropertiesEditionPart {

	protected Text name;
	protected EObjectFlatComboViewer target;
	protected Text description;



	/**
	 * For {@link ISection} use only.
	 */
	public InterDSMLinkPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public InterDSMLinkPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
    super(editionComponent);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * @generated
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
    ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
    Form form = scrolledForm.getForm();
    view = form.getBody();
    GridLayout layout = new GridLayout();
    layout.numColumns = 3;
    view.setLayout(layout);
    createControls(widgetFactory, view);
    return scrolledForm;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * @generated
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
    CompositionSequence interDSMLinkStep = new BindingCompositionSequence(propertiesEditionComponent);
    CompositionStep propertiesStep = interDSMLinkStep.addStep(EnvironmentViewsRepository.InterDSMLink.Properties.class);
    propertiesStep.addStep(EnvironmentViewsRepository.InterDSMLink.Properties.name);
    propertiesStep.addStep(EnvironmentViewsRepository.InterDSMLink.Properties.target);
    propertiesStep.addStep(EnvironmentViewsRepository.InterDSMLink.Properties.description);
    
    
    composer = new PartComposer(interDSMLinkStep) {

      @Override
      public Composite addToPart(Composite parent, Object key) {
        if (key == EnvironmentViewsRepository.InterDSMLink.Properties.class) {
          return createPropertiesGroup(widgetFactory, parent);
        }
        if (key == EnvironmentViewsRepository.InterDSMLink.Properties.name) {
          return createNameText(widgetFactory, parent);
        }
        if (key == EnvironmentViewsRepository.InterDSMLink.Properties.target) {
          return createTargetFlatComboViewer(parent, widgetFactory);
        }
        if (key == EnvironmentViewsRepository.InterDSMLink.Properties.description) {
          return createDescriptionText(widgetFactory, parent);
        }
        return parent;
      }
    };
    composer.compose(view);
  }
	/**
	 * @generated
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
    Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
    propertiesSection.setText(EnvironmentMessages.InterDSMLinkPropertiesEditionPart_PropertiesGroupLabel);
    GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
    propertiesSectionData.horizontalSpan = 3;
    propertiesSection.setLayoutData(propertiesSectionData);
    Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
    GridLayout propertiesGroupLayout = new GridLayout();
    propertiesGroupLayout.numColumns = 3;
    propertiesGroup.setLayout(propertiesGroupLayout);
    propertiesSection.setClient(propertiesGroup);
    return propertiesGroup;
  }

	/**
	 * @generated
	 */
	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
    createDescription(parent, EnvironmentViewsRepository.InterDSMLink.Properties.name, EnvironmentMessages.InterDSMLinkPropertiesEditionPart_NameLabel);
    name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
    name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
    widgetFactory.paintBordersFor(parent);
    GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
    name.setLayoutData(nameData);
    name.addFocusListener(new FocusAdapter() {
      /**
       * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
       * @generated
       */
      @Override
      @SuppressWarnings("synthetic-access")
      public void focusLost(FocusEvent e) {
        if (propertiesEditionComponent != null) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
              InterDSMLinkPropertiesEditionPartForm.this,
              EnvironmentViewsRepository.InterDSMLink.Properties.name,
              PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
          propertiesEditionComponent
              .firePropertiesChanged(new PropertiesEditionEvent(
                  InterDSMLinkPropertiesEditionPartForm.this,
                  EnvironmentViewsRepository.InterDSMLink.Properties.name,
                  PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
                  null, name.getText()));
        }
      }

      /**
       * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
       */
      @Override
      public void focusGained(FocusEvent e) {
        if (propertiesEditionComponent != null) {
          propertiesEditionComponent
              .firePropertiesChanged(new PropertiesEditionEvent(
                  InterDSMLinkPropertiesEditionPartForm.this,
                  null,
                  PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
                  null, null));
        }
      }
    });
    name.addKeyListener(new KeyAdapter() {
      /**
       * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
       * @generated
       */
      @Override
      @SuppressWarnings("synthetic-access")
      public void keyPressed(KeyEvent e) {
        if (e.character == SWT.CR) {
          if (propertiesEditionComponent != null)
            propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InterDSMLinkPropertiesEditionPartForm.this, EnvironmentViewsRepository.InterDSMLink.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
        }
      }
    });
    EditingUtils.setID(name, EnvironmentViewsRepository.InterDSMLink.Properties.name);
    EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
    FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EnvironmentViewsRepository.InterDSMLink.Properties.name, EnvironmentViewsRepository.FORM_KIND), null); //$NON-NLS-1$
    // Start of user code for createNameText

    // End of user code
    return parent;
  }

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * @generated
	 */
	protected Composite createTargetFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
    createDescription(parent, EnvironmentViewsRepository.InterDSMLink.Properties.target, EnvironmentMessages.InterDSMLinkPropertiesEditionPart_TargetLabel);
    target = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EnvironmentViewsRepository.InterDSMLink.Properties.target, EnvironmentViewsRepository.FORM_KIND));
    widgetFactory.adapt(target);
    target.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
    GridData targetData = new GridData(GridData.FILL_HORIZONTAL);
    target.setLayoutData(targetData);
    target.addSelectionChangedListener(new ISelectionChangedListener() {

      /**
       * {@inheritDoc}
       * 
       * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
       */
      public void selectionChanged(SelectionChangedEvent event) {
        if (propertiesEditionComponent != null)
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InterDSMLinkPropertiesEditionPartForm.this, EnvironmentViewsRepository.InterDSMLink.Properties.target, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTarget()));
      }

    });
    target.setID(EnvironmentViewsRepository.InterDSMLink.Properties.target);
    FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EnvironmentViewsRepository.InterDSMLink.Properties.target, EnvironmentViewsRepository.FORM_KIND), null); //$NON-NLS-1$
    // Start of user code for createTargetFlatComboViewer

    // End of user code
    return parent;
  }

	/**
	 * @generated
	 */
	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
    createDescription(parent, EnvironmentViewsRepository.InterDSMLink.Properties.description, EnvironmentMessages.InterDSMLinkPropertiesEditionPart_DescriptionLabel);
    description = widgetFactory.createText(parent, ""); //$NON-NLS-1$
    description.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
    widgetFactory.paintBordersFor(parent);
    GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
    description.setLayoutData(descriptionData);
    description.addFocusListener(new FocusAdapter() {
      /**
       * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
       * @generated
       */
      @Override
      @SuppressWarnings("synthetic-access")
      public void focusLost(FocusEvent e) {
        if (propertiesEditionComponent != null) {
          propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
              InterDSMLinkPropertiesEditionPartForm.this,
              EnvironmentViewsRepository.InterDSMLink.Properties.description,
              PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
          propertiesEditionComponent
              .firePropertiesChanged(new PropertiesEditionEvent(
                  InterDSMLinkPropertiesEditionPartForm.this,
                  EnvironmentViewsRepository.InterDSMLink.Properties.description,
                  PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
                  null, description.getText()));
        }
      }

      /**
       * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
       */
      @Override
      public void focusGained(FocusEvent e) {
        if (propertiesEditionComponent != null) {
          propertiesEditionComponent
              .firePropertiesChanged(new PropertiesEditionEvent(
                  InterDSMLinkPropertiesEditionPartForm.this,
                  null,
                  PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
                  null, null));
        }
      }
    });
    description.addKeyListener(new KeyAdapter() {
      /**
       * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
       * @generated
       */
      @Override
      @SuppressWarnings("synthetic-access")
      public void keyPressed(KeyEvent e) {
        if (e.character == SWT.CR) {
          if (propertiesEditionComponent != null)
            propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InterDSMLinkPropertiesEditionPartForm.this, EnvironmentViewsRepository.InterDSMLink.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
        }
      }
    });
    EditingUtils.setID(description, EnvironmentViewsRepository.InterDSMLink.Properties.description);
    EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
    FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EnvironmentViewsRepository.InterDSMLink.Properties.description, EnvironmentViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.environment.parts.InterDSMLinkPropertiesEditionPart#getName()
	 * @generated
	 */
	public String getName() {
    return name.getText();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.InterDSMLinkPropertiesEditionPart#setName(String newValue)
	 * @generated
	 */
	public void setName(String newValue) {
    if (newValue != null) {
      name.setText(newValue);
    } else {
      name.setText(""); //$NON-NLS-1$
    }
    boolean eefElementEditorReadOnlyState = isReadOnly(EnvironmentViewsRepository.InterDSMLink.Properties.name);
    if (eefElementEditorReadOnlyState && name.isEnabled()) {
      name.setEnabled(false);
      name.setToolTipText(EnvironmentMessages.InterDSMLink_ReadOnly);
    } else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
      name.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.InterDSMLinkPropertiesEditionPart#getTarget()
	 * @generated
	 */
	public EObject getTarget() {
    if (target.getSelection() instanceof StructuredSelection) {
      Object firstElement = ((StructuredSelection) target.getSelection()).getFirstElement();
      if (firstElement instanceof EObject)
        return (EObject) firstElement;
    }
    return null;
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.InterDSMLinkPropertiesEditionPart#initTarget(EObjectFlatComboSettings)
	 */
	public void initTarget(EObjectFlatComboSettings settings) {
		target.setInput(settings);
		if (current != null) {
			target.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EnvironmentViewsRepository.InterDSMLink.Properties.target);
		if (eefElementEditorReadOnlyState && target.isEnabled()) {
			target.setEnabled(false);
			target.setToolTipText(EnvironmentMessages.InterDSMLink_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !target.isEnabled()) {
			target.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.InterDSMLinkPropertiesEditionPart#setTarget(EObject newValue)
	 * @generated
	 */
	public void setTarget(EObject newValue) {
    if (newValue != null) {
      target.setSelection(new StructuredSelection(newValue));
    } else {
      target.setSelection(new StructuredSelection()); //$NON-NLS-1$
    }
    boolean eefElementEditorReadOnlyState = isReadOnly(EnvironmentViewsRepository.InterDSMLink.Properties.target);
    if (eefElementEditorReadOnlyState && target.isEnabled()) {
      target.setEnabled(false);
      target.setToolTipText(EnvironmentMessages.InterDSMLink_ReadOnly);
    } else if (!eefElementEditorReadOnlyState && !target.isEnabled()) {
      target.setEnabled(true);
    }	
    
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.InterDSMLinkPropertiesEditionPart#setTargetButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTargetButtonMode(ButtonsModeEnum newValue) {
		target.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.InterDSMLinkPropertiesEditionPart#addFilterTarget(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToTarget(ViewerFilter filter) {
    target.addFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.InterDSMLinkPropertiesEditionPart#addBusinessFilterTarget(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToTarget(ViewerFilter filter) {
    target.addBusinessRuleFilter(filter);
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.InterDSMLinkPropertiesEditionPart#getDescription()
	 * @generated
	 */
	public String getDescription() {
    return description.getText();
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.environment.parts.InterDSMLinkPropertiesEditionPart#setDescription(String newValue)
	 * @generated
	 */
	public void setDescription(String newValue) {
    if (newValue != null) {
      description.setText(newValue);
    } else {
      description.setText(""); //$NON-NLS-1$
    }
    boolean eefElementEditorReadOnlyState = isReadOnly(EnvironmentViewsRepository.InterDSMLink.Properties.description);
    if (eefElementEditorReadOnlyState && description.isEnabled()) {
      description.setEnabled(false);
      description.setToolTipText(EnvironmentMessages.InterDSMLink_ReadOnly);
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
    return EnvironmentMessages.InterDSMLink_Part_Title;
  }



}
