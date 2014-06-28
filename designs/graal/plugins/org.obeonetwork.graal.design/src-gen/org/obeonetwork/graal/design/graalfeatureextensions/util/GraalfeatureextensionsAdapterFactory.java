/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.graal.design.graalfeatureextensions.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.viewpoint.DFeatureExtension;
import org.obeonetwork.graal.design.graalfeatureextensions.GraalfeatureextensionsPackage;
import org.obeonetwork.graal.design.graalfeatureextensions.UIConfiguration;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * 
 * @see org.obeonetwork.graal.design.graalfeatureextensions.GraalfeatureextensionsPackage
 * @generated
 */
public class GraalfeatureextensionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static GraalfeatureextensionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public GraalfeatureextensionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GraalfeatureextensionsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc --> This implementation returns <code>true</code> if
	 * the object is either the model's package or is an instance object of the
	 * model. <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(final Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GraalfeatureextensionsSwitch<Adapter> modelSwitch = new GraalfeatureextensionsSwitch<Adapter>() {
		@Override
		public Adapter caseUIConfiguration(final UIConfiguration object) {
			return GraalfeatureextensionsAdapterFactory.this
					.createUIConfigurationAdapter();
		}

		@Override
		public Adapter caseDFeatureExtension(final DFeatureExtension object) {
			return GraalfeatureextensionsAdapterFactory.this
					.createDFeatureExtensionAdapter();
		}

		@Override
		public Adapter defaultCase(final EObject object) {
			return GraalfeatureextensionsAdapterFactory.this
					.createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(final Notifier target) {
		return this.modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.obeonetwork.graal.design.graalfeatureextensions.UIConfiguration
	 * <em>UI Configuration</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.obeonetwork.graal.design.graalfeatureextensions.UIConfiguration
	 * @generated
	 */
	public Adapter createUIConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.obeo.dsl.viewpoint.DFeatureExtension
	 * <em>DFeature Extension</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.obeo.dsl.viewpoint.DFeatureExtension
	 * @generated
	 */
	public Adapter createDFeatureExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This
	 * default implementation returns null. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // GraalfeatureextensionsAdapterFactory
