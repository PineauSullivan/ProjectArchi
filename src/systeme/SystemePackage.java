/**
 */
package systeme;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import projecttArchitectural.ProjecttArchitecturalPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see systeme.SystemeFactory
 * @model kind="package"
 * @generated
 */
public interface SystemePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "systeme";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "anuthing";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nothing";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemePackage eINSTANCE = systeme.impl.SystemePackageImpl.init();

	/**
	 * The meta object id for the '{@link systeme.impl.SystemeImpl <em>Systeme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.impl.SystemeImpl
	 * @see systeme.impl.SystemePackageImpl#getSysteme()
	 * @generated
	 */
	int SYSTEME = 0;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEME__CONFIGURATIONS = ProjecttArchitecturalPackage.CONFIGURATIONS__CONFIGURATIONS;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEME__CONTRAINTES = ProjecttArchitecturalPackage.CONFIGURATIONS__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Lien</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEME__LIEN = ProjecttArchitecturalPackage.CONFIGURATIONS__LIEN;

	/**
	 * The feature id for the '<em><b>Configurationclientserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEME__CONFIGURATIONCLIENTSERVEUR = ProjecttArchitecturalPackage.CONFIGURATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Serveurdetail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEME__SERVEURDETAIL = ProjecttArchitecturalPackage.CONFIGURATIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bindingrequiscs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEME__BINDINGREQUISCS = ProjecttArchitecturalPackage.CONFIGURATIONS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bindingfourniscs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEME__BINDINGFOURNISCS = ProjecttArchitecturalPackage.CONFIGURATIONS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Systeme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEME_FEATURE_COUNT = ProjecttArchitecturalPackage.CONFIGURATIONS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Systeme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEME_OPERATION_COUNT = ProjecttArchitecturalPackage.CONFIGURATIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.impl.BindingRequisCSImpl <em>Binding Requis CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.impl.BindingRequisCSImpl
	 * @see systeme.impl.SystemePackageImpl#getBindingRequisCS()
	 * @generated
	 */
	int BINDING_REQUIS_CS = 1;

	/**
	 * The feature id for the '<em><b>Portrequisconfigcs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_REQUIS_CS__PORTREQUISCONFIGCS = 0;

	/**
	 * The feature id for the '<em><b>Port receive request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_REQUIS_CS__PORT_RECEIVE_REQUEST = 1;

	/**
	 * The number of structural features of the '<em>Binding Requis CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_REQUIS_CS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Binding Requis CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_REQUIS_CS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link systeme.impl.BindingFournisCSImpl <em>Binding Fournis CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.impl.BindingFournisCSImpl
	 * @see systeme.impl.SystemePackageImpl#getBindingFournisCS()
	 * @generated
	 */
	int BINDING_FOURNIS_CS = 2;

	/**
	 * The feature id for the '<em><b>Port receive request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FOURNIS_CS__PORT_RECEIVE_REQUEST = 0;

	/**
	 * The feature id for the '<em><b>Portfourniscs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FOURNIS_CS__PORTFOURNISCS = 1;

	/**
	 * The number of structural features of the '<em>Binding Fournis CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FOURNIS_CS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Binding Fournis CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FOURNIS_CS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link systeme.Systeme <em>Systeme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Systeme</em>'.
	 * @see systeme.Systeme
	 * @generated
	 */
	EClass getSysteme();

	/**
	 * Returns the meta object for the reference '{@link systeme.Systeme#getConfigurationclientserveur <em>Configurationclientserveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configurationclientserveur</em>'.
	 * @see systeme.Systeme#getConfigurationclientserveur()
	 * @see #getSysteme()
	 * @generated
	 */
	EReference getSysteme_Configurationclientserveur();

	/**
	 * Returns the meta object for the reference '{@link systeme.Systeme#getServeurdetail <em>Serveurdetail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Serveurdetail</em>'.
	 * @see systeme.Systeme#getServeurdetail()
	 * @see #getSysteme()
	 * @generated
	 */
	EReference getSysteme_Serveurdetail();

	/**
	 * Returns the meta object for the reference '{@link systeme.Systeme#getBindingrequiscs <em>Bindingrequiscs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bindingrequiscs</em>'.
	 * @see systeme.Systeme#getBindingrequiscs()
	 * @see #getSysteme()
	 * @generated
	 */
	EReference getSysteme_Bindingrequiscs();

	/**
	 * Returns the meta object for the reference '{@link systeme.Systeme#getBindingfourniscs <em>Bindingfourniscs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bindingfourniscs</em>'.
	 * @see systeme.Systeme#getBindingfourniscs()
	 * @see #getSysteme()
	 * @generated
	 */
	EReference getSysteme_Bindingfourniscs();

	/**
	 * Returns the meta object for class '{@link systeme.BindingRequisCS <em>Binding Requis CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Requis CS</em>'.
	 * @see systeme.BindingRequisCS
	 * @generated
	 */
	EClass getBindingRequisCS();

	/**
	 * Returns the meta object for the reference '{@link systeme.BindingRequisCS#getPortrequisconfigcs <em>Portrequisconfigcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portrequisconfigcs</em>'.
	 * @see systeme.BindingRequisCS#getPortrequisconfigcs()
	 * @see #getBindingRequisCS()
	 * @generated
	 */
	EReference getBindingRequisCS_Portrequisconfigcs();

	/**
	 * Returns the meta object for the reference '{@link systeme.BindingRequisCS#getPort_receive_request <em>Port receive request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port receive request</em>'.
	 * @see systeme.BindingRequisCS#getPort_receive_request()
	 * @see #getBindingRequisCS()
	 * @generated
	 */
	EReference getBindingRequisCS_Port_receive_request();

	/**
	 * Returns the meta object for class '{@link systeme.BindingFournisCS <em>Binding Fournis CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Fournis CS</em>'.
	 * @see systeme.BindingFournisCS
	 * @generated
	 */
	EClass getBindingFournisCS();

	/**
	 * Returns the meta object for the reference '{@link systeme.BindingFournisCS#getPort_receive_request <em>Port receive request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port receive request</em>'.
	 * @see systeme.BindingFournisCS#getPort_receive_request()
	 * @see #getBindingFournisCS()
	 * @generated
	 */
	EReference getBindingFournisCS_Port_receive_request();

	/**
	 * Returns the meta object for the reference '{@link systeme.BindingFournisCS#getPortfourniscs <em>Portfourniscs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portfourniscs</em>'.
	 * @see systeme.BindingFournisCS#getPortfourniscs()
	 * @see #getBindingFournisCS()
	 * @generated
	 */
	EReference getBindingFournisCS_Portfourniscs();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SystemeFactory getSystemeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link systeme.impl.SystemeImpl <em>Systeme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.impl.SystemeImpl
		 * @see systeme.impl.SystemePackageImpl#getSysteme()
		 * @generated
		 */
		EClass SYSTEME = eINSTANCE.getSysteme();

		/**
		 * The meta object literal for the '<em><b>Configurationclientserveur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEME__CONFIGURATIONCLIENTSERVEUR = eINSTANCE.getSysteme_Configurationclientserveur();

		/**
		 * The meta object literal for the '<em><b>Serveurdetail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEME__SERVEURDETAIL = eINSTANCE.getSysteme_Serveurdetail();

		/**
		 * The meta object literal for the '<em><b>Bindingrequiscs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEME__BINDINGREQUISCS = eINSTANCE.getSysteme_Bindingrequiscs();

		/**
		 * The meta object literal for the '<em><b>Bindingfourniscs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEME__BINDINGFOURNISCS = eINSTANCE.getSysteme_Bindingfourniscs();

		/**
		 * The meta object literal for the '{@link systeme.impl.BindingRequisCSImpl <em>Binding Requis CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.impl.BindingRequisCSImpl
		 * @see systeme.impl.SystemePackageImpl#getBindingRequisCS()
		 * @generated
		 */
		EClass BINDING_REQUIS_CS = eINSTANCE.getBindingRequisCS();

		/**
		 * The meta object literal for the '<em><b>Portrequisconfigcs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_REQUIS_CS__PORTREQUISCONFIGCS = eINSTANCE.getBindingRequisCS_Portrequisconfigcs();

		/**
		 * The meta object literal for the '<em><b>Port receive request</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_REQUIS_CS__PORT_RECEIVE_REQUEST = eINSTANCE.getBindingRequisCS_Port_receive_request();

		/**
		 * The meta object literal for the '{@link systeme.impl.BindingFournisCSImpl <em>Binding Fournis CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.impl.BindingFournisCSImpl
		 * @see systeme.impl.SystemePackageImpl#getBindingFournisCS()
		 * @generated
		 */
		EClass BINDING_FOURNIS_CS = eINSTANCE.getBindingFournisCS();

		/**
		 * The meta object literal for the '<em><b>Port receive request</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_FOURNIS_CS__PORT_RECEIVE_REQUEST = eINSTANCE.getBindingFournisCS_Port_receive_request();

		/**
		 * The meta object literal for the '<em><b>Portfourniscs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_FOURNIS_CS__PORTFOURNISCS = eINSTANCE.getBindingFournisCS_Portfourniscs();

	}

} //SystemePackage
