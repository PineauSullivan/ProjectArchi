/**
 */
package systeme;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see systeme.SystemePackage
 * @generated
 */
public interface SystemeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemeFactory eINSTANCE = systeme.impl.SystemeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Systeme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Systeme</em>'.
	 * @generated
	 */
	Systeme createSysteme();

	/**
	 * Returns a new object of class '<em>Binding Requis CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding Requis CS</em>'.
	 * @generated
	 */
	BindingRequisCS createBindingRequisCS();

	/**
	 * Returns a new object of class '<em>Binding Fournis CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding Fournis CS</em>'.
	 * @generated
	 */
	BindingFournisCS createBindingFournisCS();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SystemePackage getSystemePackage();

} //SystemeFactory
