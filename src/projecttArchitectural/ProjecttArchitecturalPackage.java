/**
 */
package projecttArchitectural;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see projecttArchitectural.ProjecttArchitecturalFactory
 * @model kind="package"
 * @generated
 */
public interface ProjecttArchitecturalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "projecttArchitectural";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/projecttArchitectural";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "projecttArchitectural";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProjecttArchitecturalPackage eINSTANCE = projecttArchitectural.impl.ProjecttArchitecturalPackageImpl.init();

	/**
	 * The meta object id for the '{@link projecttArchitectural.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projecttArchitectural.impl.ElementImpl
	 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CONTRAINTES = 0;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CONFIGURATIONS = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projecttArchitectural.impl.ConfigurationsImpl <em>Configurations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projecttArchitectural.impl.ConfigurationsImpl
	 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getConfigurations()
	 * @generated
	 */
	int CONFIGURATIONS = 1;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATIONS__CONTRAINTES = ELEMENT__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATIONS__CONFIGURATIONS = ELEMENT__CONFIGURATIONS;

	/**
	 * The feature id for the '<em><b>Lien</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATIONS__LIEN = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Configurations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATIONS_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Configurations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATIONS_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projecttArchitectural.impl.ComposantsImpl <em>Composants</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projecttArchitectural.impl.ComposantsImpl
	 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getComposants()
	 * @generated
	 */
	int COMPOSANTS = 2;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANTS__CONTRAINTES = ELEMENT__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANTS__CONFIGURATIONS = ELEMENT__CONFIGURATIONS;

	/**
	 * The feature id for the '<em><b>Propriétés</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANTS__PROPRIÉTÉS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interfacecomposants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANTS__INTERFACECOMPOSANTS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composants</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANTS_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composants</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANTS_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projecttArchitectural.impl.ConnecteursImpl <em>Connecteurs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projecttArchitectural.impl.ConnecteursImpl
	 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getConnecteurs()
	 * @generated
	 */
	int CONNECTEURS = 3;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEURS__CONTRAINTES = ELEMENT__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEURS__CONFIGURATIONS = ELEMENT__CONFIGURATIONS;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEURS__GLUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Roleconnecteurs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEURS__ROLECONNECTEURS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connecteurs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEURS_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connecteurs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEURS_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projecttArchitectural.impl.PropriétésImpl <em>Propriétés</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projecttArchitectural.impl.PropriétésImpl
	 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getPropriétés()
	 * @generated
	 */
	int PROPRIÉTÉS = 4;

	/**
	 * The number of structural features of the '<em>Propriétés</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIÉTÉS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Propriétés</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIÉTÉS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projecttArchitectural.impl.PropriétésFonctionnellesImpl <em>Propriétés Fonctionnelles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projecttArchitectural.impl.PropriétésFonctionnellesImpl
	 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getPropriétésFonctionnelles()
	 * @generated
	 */
	int PROPRIÉTÉS_FONCTIONNELLES = 5;

	/**
	 * The number of structural features of the '<em>Propriétés Fonctionnelles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIÉTÉS_FONCTIONNELLES_FEATURE_COUNT = PROPRIÉTÉS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Propriétés Fonctionnelles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIÉTÉS_FONCTIONNELLES_OPERATION_COUNT = PROPRIÉTÉS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projecttArchitectural.impl.PropriétésNonFonctionnellesImpl <em>Propriétés Non Fonctionnelles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projecttArchitectural.impl.PropriétésNonFonctionnellesImpl
	 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getPropriétésNonFonctionnelles()
	 * @generated
	 */
	int PROPRIÉTÉS_NON_FONCTIONNELLES = 6;

	/**
	 * The number of structural features of the '<em>Propriétés Non Fonctionnelles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIÉTÉS_NON_FONCTIONNELLES_FEATURE_COUNT = PROPRIÉTÉS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Propriétés Non Fonctionnelles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIÉTÉS_NON_FONCTIONNELLES_OPERATION_COUNT = PROPRIÉTÉS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projecttArchitectural.impl.LienImpl <em>Lien</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projecttArchitectural.impl.LienImpl
	 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getLien()
	 * @generated
	 */
	int LIEN = 7;

	/**
	 * The number of structural features of the '<em>Lien</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Lien</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projecttArchitectural.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projecttArchitectural.impl.BindingImpl
	 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 8;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = LIEN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION_COUNT = LIEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projecttArchitectural.impl.AttachmentImpl <em>Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projecttArchitectural.impl.AttachmentImpl
	 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getAttachment()
	 * @generated
	 */
	int ATTACHMENT = 9;

	/**
	 * The number of structural features of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_FEATURE_COUNT = LIEN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_OPERATION_COUNT = LIEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projecttArchitectural.impl.InterfaceComposantsImpl <em>Interface Composants</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projecttArchitectural.impl.InterfaceComposantsImpl
	 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getInterfaceComposants()
	 * @generated
	 */
	int INTERFACE_COMPOSANTS = 10;

	/**
	 * The feature id for the '<em><b>Portscompasants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_COMPOSANTS__PORTSCOMPASANTS = 0;

	/**
	 * The feature id for the '<em><b>Servicecomposants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_COMPOSANTS__SERVICECOMPOSANTS = 1;

	/**
	 * The number of structural features of the '<em>Interface Composants</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_COMPOSANTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Interface Composants</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_COMPOSANTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projecttArchitectural.impl.PortsCompasantsImpl <em>Ports Compasants</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projecttArchitectural.impl.PortsCompasantsImpl
	 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getPortsCompasants()
	 * @generated
	 */
	int PORTS_COMPASANTS = 11;

	/**
	 * The number of structural features of the '<em>Ports Compasants</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTS_COMPASANTS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Ports Compasants</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTS_COMPASANTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projecttArchitectural.impl.ServiceComposantsImpl <em>Service Composants</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projecttArchitectural.impl.ServiceComposantsImpl
	 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getServiceComposants()
	 * @generated
	 */
	int SERVICE_COMPOSANTS = 12;

	/**
	 * The number of structural features of the '<em>Service Composants</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPOSANTS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Service Composants</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPOSANTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projecttArchitectural.impl.PortsComposantsRequisImpl <em>Ports Composants Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projecttArchitectural.impl.PortsComposantsRequisImpl
	 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getPortsComposantsRequis()
	 * @generated
	 */
	int PORTS_COMPOSANTS_REQUIS = 13;

	/**
	 * The number of structural features of the '<em>Ports Composants Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTS_COMPOSANTS_REQUIS_FEATURE_COUNT = PORTS_COMPASANTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ports Composants Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTS_COMPOSANTS_REQUIS_OPERATION_COUNT = PORTS_COMPASANTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projecttArchitectural.impl.PortsComposantsFournisImpl <em>Ports Composants Fournis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projecttArchitectural.impl.PortsComposantsFournisImpl
	 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getPortsComposantsFournis()
	 * @generated
	 */
	int PORTS_COMPOSANTS_FOURNIS = 14;

	/**
	 * The number of structural features of the '<em>Ports Composants Fournis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTS_COMPOSANTS_FOURNIS_FEATURE_COUNT = PORTS_COMPASANTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ports Composants Fournis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTS_COMPOSANTS_FOURNIS_OPERATION_COUNT = PORTS_COMPASANTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projecttArchitectural.impl.ServiceConposantsRequisImpl <em>Service Conposants Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projecttArchitectural.impl.ServiceConposantsRequisImpl
	 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getServiceConposantsRequis()
	 * @generated
	 */
	int SERVICE_CONPOSANTS_REQUIS = 15;

	/**
	 * The number of structural features of the '<em>Service Conposants Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONPOSANTS_REQUIS_FEATURE_COUNT = SERVICE_COMPOSANTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service Conposants Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONPOSANTS_REQUIS_OPERATION_COUNT = SERVICE_COMPOSANTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projecttArchitectural.impl.ServiceConposantsFournisImpl <em>Service Conposants Fournis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projecttArchitectural.impl.ServiceConposantsFournisImpl
	 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getServiceConposantsFournis()
	 * @generated
	 */
	int SERVICE_CONPOSANTS_FOURNIS = 16;

	/**
	 * The number of structural features of the '<em>Service Conposants Fournis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONPOSANTS_FOURNIS_FEATURE_COUNT = SERVICE_COMPOSANTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service Conposants Fournis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONPOSANTS_FOURNIS_OPERATION_COUNT = SERVICE_COMPOSANTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projecttArchitectural.impl.GlueImpl <em>Glue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projecttArchitectural.impl.GlueImpl
	 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getGlue()
	 * @generated
	 */
	int GLUE = 17;

	/**
	 * The feature id for the '<em><b>Roleconnecteurs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE__ROLECONNECTEURS = 0;

	/**
	 * The number of structural features of the '<em>Glue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Glue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projecttArchitectural.impl.RoleConnecteursImpl <em>Role Connecteurs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projecttArchitectural.impl.RoleConnecteursImpl
	 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getRoleConnecteurs()
	 * @generated
	 */
	int ROLE_CONNECTEURS = 18;

	/**
	 * The number of structural features of the '<em>Role Connecteurs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTEURS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Role Connecteurs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTEURS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projecttArchitectural.impl.RoleConnecteursFournisImpl <em>Role Connecteurs Fournis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projecttArchitectural.impl.RoleConnecteursFournisImpl
	 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getRoleConnecteursFournis()
	 * @generated
	 */
	int ROLE_CONNECTEURS_FOURNIS = 19;

	/**
	 * The number of structural features of the '<em>Role Connecteurs Fournis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTEURS_FOURNIS_FEATURE_COUNT = ROLE_CONNECTEURS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role Connecteurs Fournis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTEURS_FOURNIS_OPERATION_COUNT = ROLE_CONNECTEURS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projecttArchitectural.impl.RoleConnecteursRequisImpl <em>Role Connecteurs Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projecttArchitectural.impl.RoleConnecteursRequisImpl
	 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getRoleConnecteursRequis()
	 * @generated
	 */
	int ROLE_CONNECTEURS_REQUIS = 20;

	/**
	 * The number of structural features of the '<em>Role Connecteurs Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTEURS_REQUIS_FEATURE_COUNT = ROLE_CONNECTEURS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role Connecteurs Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTEURS_REQUIS_OPERATION_COUNT = ROLE_CONNECTEURS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projecttArchitectural.impl.ContraintesImpl <em>Contraintes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projecttArchitectural.impl.ContraintesImpl
	 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getContraintes()
	 * @generated
	 */
	int CONTRAINTES = 21;

	/**
	 * The number of structural features of the '<em>Contraintes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Contraintes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projecttArchitectural.impl.BindingFournisImpl <em>Binding Fournis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projecttArchitectural.impl.BindingFournisImpl
	 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getBindingFournis()
	 * @generated
	 */
	int BINDING_FOURNIS = 22;

	/**
	 * The feature id for the '<em><b>Portscomposantsfournis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FOURNIS__PORTSCOMPOSANTSFOURNIS = BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Roleconnecteursfournis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FOURNIS__ROLECONNECTEURSFOURNIS = BINDING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binding Fournis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FOURNIS_FEATURE_COUNT = BINDING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binding Fournis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FOURNIS_OPERATION_COUNT = BINDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projecttArchitectural.impl.BindingRequisImpl <em>Binding Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projecttArchitectural.impl.BindingRequisImpl
	 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getBindingRequis()
	 * @generated
	 */
	int BINDING_REQUIS = 23;

	/**
	 * The feature id for the '<em><b>Portscomposantsrequis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_REQUIS__PORTSCOMPOSANTSREQUIS = BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Roleconnecteursrequis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_REQUIS__ROLECONNECTEURSREQUIS = BINDING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binding Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_REQUIS_FEATURE_COUNT = BINDING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binding Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_REQUIS_OPERATION_COUNT = BINDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projecttArchitectural.impl.AttachmentsRequisFournisImpl <em>Attachments Requis Fournis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projecttArchitectural.impl.AttachmentsRequisFournisImpl
	 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getAttachmentsRequisFournis()
	 * @generated
	 */
	int ATTACHMENTS_REQUIS_FOURNIS = 24;

	/**
	 * The feature id for the '<em><b>Portscomposantsrequis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENTS_REQUIS_FOURNIS__PORTSCOMPOSANTSREQUIS = ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Roleconnecteursfournis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENTS_REQUIS_FOURNIS__ROLECONNECTEURSFOURNIS = ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachments Requis Fournis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENTS_REQUIS_FOURNIS_FEATURE_COUNT = ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attachments Requis Fournis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENTS_REQUIS_FOURNIS_OPERATION_COUNT = ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projecttArchitectural.impl.AttachmentFournisRequisImpl <em>Attachment Fournis Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projecttArchitectural.impl.AttachmentFournisRequisImpl
	 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getAttachmentFournisRequis()
	 * @generated
	 */
	int ATTACHMENT_FOURNIS_REQUIS = 25;

	/**
	 * The feature id for the '<em><b>Portscomposantsfournis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_FOURNIS_REQUIS__PORTSCOMPOSANTSFOURNIS = ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Roleconnecteursrequis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_FOURNIS_REQUIS__ROLECONNECTEURSREQUIS = ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachment Fournis Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_FOURNIS_REQUIS_FEATURE_COUNT = ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attachment Fournis Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_FOURNIS_REQUIS_OPERATION_COUNT = ATTACHMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link projecttArchitectural.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see projecttArchitectural.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the containment reference list '{@link projecttArchitectural.Element#getContraintes <em>Contraintes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contraintes</em>'.
	 * @see projecttArchitectural.Element#getContraintes()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Contraintes();

	/**
	 * Returns the meta object for the containment reference list '{@link projecttArchitectural.Element#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configurations</em>'.
	 * @see projecttArchitectural.Element#getConfigurations()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Configurations();

	/**
	 * Returns the meta object for class '{@link projecttArchitectural.Configurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configurations</em>'.
	 * @see projecttArchitectural.Configurations
	 * @generated
	 */
	EClass getConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link projecttArchitectural.Configurations#getLien <em>Lien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lien</em>'.
	 * @see projecttArchitectural.Configurations#getLien()
	 * @see #getConfigurations()
	 * @generated
	 */
	EReference getConfigurations_Lien();

	/**
	 * Returns the meta object for class '{@link projecttArchitectural.Composants <em>Composants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composants</em>'.
	 * @see projecttArchitectural.Composants
	 * @generated
	 */
	EClass getComposants();

	/**
	 * Returns the meta object for the containment reference list '{@link projecttArchitectural.Composants#getPropriétés <em>Propriétés</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Propriétés</em>'.
	 * @see projecttArchitectural.Composants#getPropriétés()
	 * @see #getComposants()
	 * @generated
	 */
	EReference getComposants_Propriétés();

	/**
	 * Returns the meta object for the containment reference list '{@link projecttArchitectural.Composants#getInterfacecomposants <em>Interfacecomposants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfacecomposants</em>'.
	 * @see projecttArchitectural.Composants#getInterfacecomposants()
	 * @see #getComposants()
	 * @generated
	 */
	EReference getComposants_Interfacecomposants();

	/**
	 * Returns the meta object for class '{@link projecttArchitectural.Connecteurs <em>Connecteurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connecteurs</em>'.
	 * @see projecttArchitectural.Connecteurs
	 * @generated
	 */
	EClass getConnecteurs();

	/**
	 * Returns the meta object for the containment reference list '{@link projecttArchitectural.Connecteurs#getGlue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Glue</em>'.
	 * @see projecttArchitectural.Connecteurs#getGlue()
	 * @see #getConnecteurs()
	 * @generated
	 */
	EReference getConnecteurs_Glue();

	/**
	 * Returns the meta object for the containment reference list '{@link projecttArchitectural.Connecteurs#getRoleconnecteurs <em>Roleconnecteurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roleconnecteurs</em>'.
	 * @see projecttArchitectural.Connecteurs#getRoleconnecteurs()
	 * @see #getConnecteurs()
	 * @generated
	 */
	EReference getConnecteurs_Roleconnecteurs();

	/**
	 * Returns the meta object for class '{@link projecttArchitectural.Propriétés <em>Propriétés</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propriétés</em>'.
	 * @see projecttArchitectural.Propriétés
	 * @generated
	 */
	EClass getPropriétés();

	/**
	 * Returns the meta object for class '{@link projecttArchitectural.PropriétésFonctionnelles <em>Propriétés Fonctionnelles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propriétés Fonctionnelles</em>'.
	 * @see projecttArchitectural.PropriétésFonctionnelles
	 * @generated
	 */
	EClass getPropriétésFonctionnelles();

	/**
	 * Returns the meta object for class '{@link projecttArchitectural.PropriétésNonFonctionnelles <em>Propriétés Non Fonctionnelles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propriétés Non Fonctionnelles</em>'.
	 * @see projecttArchitectural.PropriétésNonFonctionnelles
	 * @generated
	 */
	EClass getPropriétésNonFonctionnelles();

	/**
	 * Returns the meta object for class '{@link projecttArchitectural.Lien <em>Lien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien</em>'.
	 * @see projecttArchitectural.Lien
	 * @generated
	 */
	EClass getLien();

	/**
	 * Returns the meta object for class '{@link projecttArchitectural.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see projecttArchitectural.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for class '{@link projecttArchitectural.Attachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment</em>'.
	 * @see projecttArchitectural.Attachment
	 * @generated
	 */
	EClass getAttachment();

	/**
	 * Returns the meta object for class '{@link projecttArchitectural.InterfaceComposants <em>Interface Composants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Composants</em>'.
	 * @see projecttArchitectural.InterfaceComposants
	 * @generated
	 */
	EClass getInterfaceComposants();

	/**
	 * Returns the meta object for the containment reference list '{@link projecttArchitectural.InterfaceComposants#getPortscompasants <em>Portscompasants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Portscompasants</em>'.
	 * @see projecttArchitectural.InterfaceComposants#getPortscompasants()
	 * @see #getInterfaceComposants()
	 * @generated
	 */
	EReference getInterfaceComposants_Portscompasants();

	/**
	 * Returns the meta object for the containment reference list '{@link projecttArchitectural.InterfaceComposants#getServicecomposants <em>Servicecomposants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servicecomposants</em>'.
	 * @see projecttArchitectural.InterfaceComposants#getServicecomposants()
	 * @see #getInterfaceComposants()
	 * @generated
	 */
	EReference getInterfaceComposants_Servicecomposants();

	/**
	 * Returns the meta object for class '{@link projecttArchitectural.PortsCompasants <em>Ports Compasants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ports Compasants</em>'.
	 * @see projecttArchitectural.PortsCompasants
	 * @generated
	 */
	EClass getPortsCompasants();

	/**
	 * Returns the meta object for class '{@link projecttArchitectural.ServiceComposants <em>Service Composants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Composants</em>'.
	 * @see projecttArchitectural.ServiceComposants
	 * @generated
	 */
	EClass getServiceComposants();

	/**
	 * Returns the meta object for class '{@link projecttArchitectural.PortsComposantsRequis <em>Ports Composants Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ports Composants Requis</em>'.
	 * @see projecttArchitectural.PortsComposantsRequis
	 * @generated
	 */
	EClass getPortsComposantsRequis();

	/**
	 * Returns the meta object for class '{@link projecttArchitectural.PortsComposantsFournis <em>Ports Composants Fournis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ports Composants Fournis</em>'.
	 * @see projecttArchitectural.PortsComposantsFournis
	 * @generated
	 */
	EClass getPortsComposantsFournis();

	/**
	 * Returns the meta object for class '{@link projecttArchitectural.ServiceConposantsRequis <em>Service Conposants Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Conposants Requis</em>'.
	 * @see projecttArchitectural.ServiceConposantsRequis
	 * @generated
	 */
	EClass getServiceConposantsRequis();

	/**
	 * Returns the meta object for class '{@link projecttArchitectural.ServiceConposantsFournis <em>Service Conposants Fournis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Conposants Fournis</em>'.
	 * @see projecttArchitectural.ServiceConposantsFournis
	 * @generated
	 */
	EClass getServiceConposantsFournis();

	/**
	 * Returns the meta object for class '{@link projecttArchitectural.Glue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glue</em>'.
	 * @see projecttArchitectural.Glue
	 * @generated
	 */
	EClass getGlue();

	/**
	 * Returns the meta object for the containment reference list '{@link projecttArchitectural.Glue#getRoleconnecteurs <em>Roleconnecteurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roleconnecteurs</em>'.
	 * @see projecttArchitectural.Glue#getRoleconnecteurs()
	 * @see #getGlue()
	 * @generated
	 */
	EReference getGlue_Roleconnecteurs();

	/**
	 * Returns the meta object for class '{@link projecttArchitectural.RoleConnecteurs <em>Role Connecteurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Connecteurs</em>'.
	 * @see projecttArchitectural.RoleConnecteurs
	 * @generated
	 */
	EClass getRoleConnecteurs();

	/**
	 * Returns the meta object for class '{@link projecttArchitectural.RoleConnecteursFournis <em>Role Connecteurs Fournis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Connecteurs Fournis</em>'.
	 * @see projecttArchitectural.RoleConnecteursFournis
	 * @generated
	 */
	EClass getRoleConnecteursFournis();

	/**
	 * Returns the meta object for class '{@link projecttArchitectural.RoleConnecteursRequis <em>Role Connecteurs Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Connecteurs Requis</em>'.
	 * @see projecttArchitectural.RoleConnecteursRequis
	 * @generated
	 */
	EClass getRoleConnecteursRequis();

	/**
	 * Returns the meta object for class '{@link projecttArchitectural.Contraintes <em>Contraintes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contraintes</em>'.
	 * @see projecttArchitectural.Contraintes
	 * @generated
	 */
	EClass getContraintes();

	/**
	 * Returns the meta object for class '{@link projecttArchitectural.BindingFournis <em>Binding Fournis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Fournis</em>'.
	 * @see projecttArchitectural.BindingFournis
	 * @generated
	 */
	EClass getBindingFournis();

	/**
	 * Returns the meta object for the reference '{@link projecttArchitectural.BindingFournis#getPortscomposantsfournis <em>Portscomposantsfournis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portscomposantsfournis</em>'.
	 * @see projecttArchitectural.BindingFournis#getPortscomposantsfournis()
	 * @see #getBindingFournis()
	 * @generated
	 */
	EReference getBindingFournis_Portscomposantsfournis();

	/**
	 * Returns the meta object for the reference '{@link projecttArchitectural.BindingFournis#getRoleconnecteursfournis <em>Roleconnecteursfournis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Roleconnecteursfournis</em>'.
	 * @see projecttArchitectural.BindingFournis#getRoleconnecteursfournis()
	 * @see #getBindingFournis()
	 * @generated
	 */
	EReference getBindingFournis_Roleconnecteursfournis();

	/**
	 * Returns the meta object for class '{@link projecttArchitectural.BindingRequis <em>Binding Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Requis</em>'.
	 * @see projecttArchitectural.BindingRequis
	 * @generated
	 */
	EClass getBindingRequis();

	/**
	 * Returns the meta object for the reference '{@link projecttArchitectural.BindingRequis#getPortscomposantsrequis <em>Portscomposantsrequis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portscomposantsrequis</em>'.
	 * @see projecttArchitectural.BindingRequis#getPortscomposantsrequis()
	 * @see #getBindingRequis()
	 * @generated
	 */
	EReference getBindingRequis_Portscomposantsrequis();

	/**
	 * Returns the meta object for the reference '{@link projecttArchitectural.BindingRequis#getRoleconnecteursrequis <em>Roleconnecteursrequis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Roleconnecteursrequis</em>'.
	 * @see projecttArchitectural.BindingRequis#getRoleconnecteursrequis()
	 * @see #getBindingRequis()
	 * @generated
	 */
	EReference getBindingRequis_Roleconnecteursrequis();

	/**
	 * Returns the meta object for class '{@link projecttArchitectural.AttachmentsRequisFournis <em>Attachments Requis Fournis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachments Requis Fournis</em>'.
	 * @see projecttArchitectural.AttachmentsRequisFournis
	 * @generated
	 */
	EClass getAttachmentsRequisFournis();

	/**
	 * Returns the meta object for the reference '{@link projecttArchitectural.AttachmentsRequisFournis#getPortscomposantsrequis <em>Portscomposantsrequis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portscomposantsrequis</em>'.
	 * @see projecttArchitectural.AttachmentsRequisFournis#getPortscomposantsrequis()
	 * @see #getAttachmentsRequisFournis()
	 * @generated
	 */
	EReference getAttachmentsRequisFournis_Portscomposantsrequis();

	/**
	 * Returns the meta object for the reference '{@link projecttArchitectural.AttachmentsRequisFournis#getRoleconnecteursfournis <em>Roleconnecteursfournis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Roleconnecteursfournis</em>'.
	 * @see projecttArchitectural.AttachmentsRequisFournis#getRoleconnecteursfournis()
	 * @see #getAttachmentsRequisFournis()
	 * @generated
	 */
	EReference getAttachmentsRequisFournis_Roleconnecteursfournis();

	/**
	 * Returns the meta object for class '{@link projecttArchitectural.AttachmentFournisRequis <em>Attachment Fournis Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment Fournis Requis</em>'.
	 * @see projecttArchitectural.AttachmentFournisRequis
	 * @generated
	 */
	EClass getAttachmentFournisRequis();

	/**
	 * Returns the meta object for the reference '{@link projecttArchitectural.AttachmentFournisRequis#getPortscomposantsfournis <em>Portscomposantsfournis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portscomposantsfournis</em>'.
	 * @see projecttArchitectural.AttachmentFournisRequis#getPortscomposantsfournis()
	 * @see #getAttachmentFournisRequis()
	 * @generated
	 */
	EReference getAttachmentFournisRequis_Portscomposantsfournis();

	/**
	 * Returns the meta object for the reference '{@link projecttArchitectural.AttachmentFournisRequis#getRoleconnecteursrequis <em>Roleconnecteursrequis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Roleconnecteursrequis</em>'.
	 * @see projecttArchitectural.AttachmentFournisRequis#getRoleconnecteursrequis()
	 * @see #getAttachmentFournisRequis()
	 * @generated
	 */
	EReference getAttachmentFournisRequis_Roleconnecteursrequis();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProjecttArchitecturalFactory getProjecttArchitecturalFactory();

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
		 * The meta object literal for the '{@link projecttArchitectural.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projecttArchitectural.impl.ElementImpl
		 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Contraintes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__CONTRAINTES = eINSTANCE.getElement_Contraintes();

		/**
		 * The meta object literal for the '<em><b>Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__CONFIGURATIONS = eINSTANCE.getElement_Configurations();

		/**
		 * The meta object literal for the '{@link projecttArchitectural.impl.ConfigurationsImpl <em>Configurations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projecttArchitectural.impl.ConfigurationsImpl
		 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getConfigurations()
		 * @generated
		 */
		EClass CONFIGURATIONS = eINSTANCE.getConfigurations();

		/**
		 * The meta object literal for the '<em><b>Lien</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATIONS__LIEN = eINSTANCE.getConfigurations_Lien();

		/**
		 * The meta object literal for the '{@link projecttArchitectural.impl.ComposantsImpl <em>Composants</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projecttArchitectural.impl.ComposantsImpl
		 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getComposants()
		 * @generated
		 */
		EClass COMPOSANTS = eINSTANCE.getComposants();

		/**
		 * The meta object literal for the '<em><b>Propriétés</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSANTS__PROPRIÉTÉS = eINSTANCE.getComposants_Propriétés();

		/**
		 * The meta object literal for the '<em><b>Interfacecomposants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSANTS__INTERFACECOMPOSANTS = eINSTANCE.getComposants_Interfacecomposants();

		/**
		 * The meta object literal for the '{@link projecttArchitectural.impl.ConnecteursImpl <em>Connecteurs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projecttArchitectural.impl.ConnecteursImpl
		 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getConnecteurs()
		 * @generated
		 */
		EClass CONNECTEURS = eINSTANCE.getConnecteurs();

		/**
		 * The meta object literal for the '<em><b>Glue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTEURS__GLUE = eINSTANCE.getConnecteurs_Glue();

		/**
		 * The meta object literal for the '<em><b>Roleconnecteurs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTEURS__ROLECONNECTEURS = eINSTANCE.getConnecteurs_Roleconnecteurs();

		/**
		 * The meta object literal for the '{@link projecttArchitectural.impl.PropriétésImpl <em>Propriétés</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projecttArchitectural.impl.PropriétésImpl
		 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getPropriétés()
		 * @generated
		 */
		EClass PROPRIÉTÉS = eINSTANCE.getPropriétés();

		/**
		 * The meta object literal for the '{@link projecttArchitectural.impl.PropriétésFonctionnellesImpl <em>Propriétés Fonctionnelles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projecttArchitectural.impl.PropriétésFonctionnellesImpl
		 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getPropriétésFonctionnelles()
		 * @generated
		 */
		EClass PROPRIÉTÉS_FONCTIONNELLES = eINSTANCE.getPropriétésFonctionnelles();

		/**
		 * The meta object literal for the '{@link projecttArchitectural.impl.PropriétésNonFonctionnellesImpl <em>Propriétés Non Fonctionnelles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projecttArchitectural.impl.PropriétésNonFonctionnellesImpl
		 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getPropriétésNonFonctionnelles()
		 * @generated
		 */
		EClass PROPRIÉTÉS_NON_FONCTIONNELLES = eINSTANCE.getPropriétésNonFonctionnelles();

		/**
		 * The meta object literal for the '{@link projecttArchitectural.impl.LienImpl <em>Lien</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projecttArchitectural.impl.LienImpl
		 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getLien()
		 * @generated
		 */
		EClass LIEN = eINSTANCE.getLien();

		/**
		 * The meta object literal for the '{@link projecttArchitectural.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projecttArchitectural.impl.BindingImpl
		 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '{@link projecttArchitectural.impl.AttachmentImpl <em>Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projecttArchitectural.impl.AttachmentImpl
		 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getAttachment()
		 * @generated
		 */
		EClass ATTACHMENT = eINSTANCE.getAttachment();

		/**
		 * The meta object literal for the '{@link projecttArchitectural.impl.InterfaceComposantsImpl <em>Interface Composants</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projecttArchitectural.impl.InterfaceComposantsImpl
		 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getInterfaceComposants()
		 * @generated
		 */
		EClass INTERFACE_COMPOSANTS = eINSTANCE.getInterfaceComposants();

		/**
		 * The meta object literal for the '<em><b>Portscompasants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_COMPOSANTS__PORTSCOMPASANTS = eINSTANCE.getInterfaceComposants_Portscompasants();

		/**
		 * The meta object literal for the '<em><b>Servicecomposants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_COMPOSANTS__SERVICECOMPOSANTS = eINSTANCE.getInterfaceComposants_Servicecomposants();

		/**
		 * The meta object literal for the '{@link projecttArchitectural.impl.PortsCompasantsImpl <em>Ports Compasants</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projecttArchitectural.impl.PortsCompasantsImpl
		 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getPortsCompasants()
		 * @generated
		 */
		EClass PORTS_COMPASANTS = eINSTANCE.getPortsCompasants();

		/**
		 * The meta object literal for the '{@link projecttArchitectural.impl.ServiceComposantsImpl <em>Service Composants</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projecttArchitectural.impl.ServiceComposantsImpl
		 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getServiceComposants()
		 * @generated
		 */
		EClass SERVICE_COMPOSANTS = eINSTANCE.getServiceComposants();

		/**
		 * The meta object literal for the '{@link projecttArchitectural.impl.PortsComposantsRequisImpl <em>Ports Composants Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projecttArchitectural.impl.PortsComposantsRequisImpl
		 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getPortsComposantsRequis()
		 * @generated
		 */
		EClass PORTS_COMPOSANTS_REQUIS = eINSTANCE.getPortsComposantsRequis();

		/**
		 * The meta object literal for the '{@link projecttArchitectural.impl.PortsComposantsFournisImpl <em>Ports Composants Fournis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projecttArchitectural.impl.PortsComposantsFournisImpl
		 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getPortsComposantsFournis()
		 * @generated
		 */
		EClass PORTS_COMPOSANTS_FOURNIS = eINSTANCE.getPortsComposantsFournis();

		/**
		 * The meta object literal for the '{@link projecttArchitectural.impl.ServiceConposantsRequisImpl <em>Service Conposants Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projecttArchitectural.impl.ServiceConposantsRequisImpl
		 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getServiceConposantsRequis()
		 * @generated
		 */
		EClass SERVICE_CONPOSANTS_REQUIS = eINSTANCE.getServiceConposantsRequis();

		/**
		 * The meta object literal for the '{@link projecttArchitectural.impl.ServiceConposantsFournisImpl <em>Service Conposants Fournis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projecttArchitectural.impl.ServiceConposantsFournisImpl
		 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getServiceConposantsFournis()
		 * @generated
		 */
		EClass SERVICE_CONPOSANTS_FOURNIS = eINSTANCE.getServiceConposantsFournis();

		/**
		 * The meta object literal for the '{@link projecttArchitectural.impl.GlueImpl <em>Glue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projecttArchitectural.impl.GlueImpl
		 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getGlue()
		 * @generated
		 */
		EClass GLUE = eINSTANCE.getGlue();

		/**
		 * The meta object literal for the '<em><b>Roleconnecteurs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLUE__ROLECONNECTEURS = eINSTANCE.getGlue_Roleconnecteurs();

		/**
		 * The meta object literal for the '{@link projecttArchitectural.impl.RoleConnecteursImpl <em>Role Connecteurs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projecttArchitectural.impl.RoleConnecteursImpl
		 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getRoleConnecteurs()
		 * @generated
		 */
		EClass ROLE_CONNECTEURS = eINSTANCE.getRoleConnecteurs();

		/**
		 * The meta object literal for the '{@link projecttArchitectural.impl.RoleConnecteursFournisImpl <em>Role Connecteurs Fournis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projecttArchitectural.impl.RoleConnecteursFournisImpl
		 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getRoleConnecteursFournis()
		 * @generated
		 */
		EClass ROLE_CONNECTEURS_FOURNIS = eINSTANCE.getRoleConnecteursFournis();

		/**
		 * The meta object literal for the '{@link projecttArchitectural.impl.RoleConnecteursRequisImpl <em>Role Connecteurs Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projecttArchitectural.impl.RoleConnecteursRequisImpl
		 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getRoleConnecteursRequis()
		 * @generated
		 */
		EClass ROLE_CONNECTEURS_REQUIS = eINSTANCE.getRoleConnecteursRequis();

		/**
		 * The meta object literal for the '{@link projecttArchitectural.impl.ContraintesImpl <em>Contraintes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projecttArchitectural.impl.ContraintesImpl
		 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getContraintes()
		 * @generated
		 */
		EClass CONTRAINTES = eINSTANCE.getContraintes();

		/**
		 * The meta object literal for the '{@link projecttArchitectural.impl.BindingFournisImpl <em>Binding Fournis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projecttArchitectural.impl.BindingFournisImpl
		 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getBindingFournis()
		 * @generated
		 */
		EClass BINDING_FOURNIS = eINSTANCE.getBindingFournis();

		/**
		 * The meta object literal for the '<em><b>Portscomposantsfournis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_FOURNIS__PORTSCOMPOSANTSFOURNIS = eINSTANCE.getBindingFournis_Portscomposantsfournis();

		/**
		 * The meta object literal for the '<em><b>Roleconnecteursfournis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_FOURNIS__ROLECONNECTEURSFOURNIS = eINSTANCE.getBindingFournis_Roleconnecteursfournis();

		/**
		 * The meta object literal for the '{@link projecttArchitectural.impl.BindingRequisImpl <em>Binding Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projecttArchitectural.impl.BindingRequisImpl
		 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getBindingRequis()
		 * @generated
		 */
		EClass BINDING_REQUIS = eINSTANCE.getBindingRequis();

		/**
		 * The meta object literal for the '<em><b>Portscomposantsrequis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_REQUIS__PORTSCOMPOSANTSREQUIS = eINSTANCE.getBindingRequis_Portscomposantsrequis();

		/**
		 * The meta object literal for the '<em><b>Roleconnecteursrequis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_REQUIS__ROLECONNECTEURSREQUIS = eINSTANCE.getBindingRequis_Roleconnecteursrequis();

		/**
		 * The meta object literal for the '{@link projecttArchitectural.impl.AttachmentsRequisFournisImpl <em>Attachments Requis Fournis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projecttArchitectural.impl.AttachmentsRequisFournisImpl
		 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getAttachmentsRequisFournis()
		 * @generated
		 */
		EClass ATTACHMENTS_REQUIS_FOURNIS = eINSTANCE.getAttachmentsRequisFournis();

		/**
		 * The meta object literal for the '<em><b>Portscomposantsrequis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENTS_REQUIS_FOURNIS__PORTSCOMPOSANTSREQUIS = eINSTANCE.getAttachmentsRequisFournis_Portscomposantsrequis();

		/**
		 * The meta object literal for the '<em><b>Roleconnecteursfournis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENTS_REQUIS_FOURNIS__ROLECONNECTEURSFOURNIS = eINSTANCE.getAttachmentsRequisFournis_Roleconnecteursfournis();

		/**
		 * The meta object literal for the '{@link projecttArchitectural.impl.AttachmentFournisRequisImpl <em>Attachment Fournis Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projecttArchitectural.impl.AttachmentFournisRequisImpl
		 * @see projecttArchitectural.impl.ProjecttArchitecturalPackageImpl#getAttachmentFournisRequis()
		 * @generated
		 */
		EClass ATTACHMENT_FOURNIS_REQUIS = eINSTANCE.getAttachmentFournisRequis();

		/**
		 * The meta object literal for the '<em><b>Portscomposantsfournis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_FOURNIS_REQUIS__PORTSCOMPOSANTSFOURNIS = eINSTANCE.getAttachmentFournisRequis_Portscomposantsfournis();

		/**
		 * The meta object literal for the '<em><b>Roleconnecteursrequis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_FOURNIS_REQUIS__ROLECONNECTEURSREQUIS = eINSTANCE.getAttachmentFournisRequis_Roleconnecteursrequis();

	}

} //ProjecttArchitecturalPackage
