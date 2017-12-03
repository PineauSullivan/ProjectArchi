/**
 */
package systeme.FonctionServeur;

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
 * @see systeme.FonctionServeur.FonctionServeurFactory
 * @model kind="package"
 * @generated
 */
public interface FonctionServeurPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "FonctionServeur";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "notutile";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "utility";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FonctionServeurPackage eINSTANCE = systeme.FonctionServeur.impl.FonctionServeurPackageImpl.init();

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.ConnectionManagerImpl <em>Connection Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.ConnectionManagerImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getConnectionManager()
	 * @generated
	 */
	int CONNECTION_MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__CONFIGURATIONS = ProjecttArchitecturalPackage.COMPOSANTS__CONFIGURATIONS;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__CONTRAINTES = ProjecttArchitecturalPackage.COMPOSANTS__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Interfacecomposants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__INTERFACECOMPOSANTS = ProjecttArchitecturalPackage.COMPOSANTS__INTERFACECOMPOSANTS;

	/**
	 * The feature id for the '<em><b>Propriétés</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__PROPRIÉTÉS = ProjecttArchitecturalPackage.COMPOSANTS__PROPRIÉTÉS;

	/**
	 * The feature id for the '<em><b>Interfaceconnectionmanager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER__INTERFACECONNECTIONMANAGER = ProjecttArchitecturalPackage.COMPOSANTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connection Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER_FEATURE_COUNT = ProjecttArchitecturalPackage.COMPOSANTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Connection Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER_OPERATION_COUNT = ProjecttArchitecturalPackage.COMPOSANTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.SecurityManagerImpl <em>Security Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.SecurityManagerImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getSecurityManager()
	 * @generated
	 */
	int SECURITY_MANAGER = 1;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER__CONFIGURATIONS = ProjecttArchitecturalPackage.COMPOSANTS__CONFIGURATIONS;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER__CONTRAINTES = ProjecttArchitecturalPackage.COMPOSANTS__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Interfacecomposants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER__INTERFACECOMPOSANTS = ProjecttArchitecturalPackage.COMPOSANTS__INTERFACECOMPOSANTS;

	/**
	 * The feature id for the '<em><b>Propriétés</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER__PROPRIÉTÉS = ProjecttArchitecturalPackage.COMPOSANTS__PROPRIÉTÉS;

	/**
	 * The feature id for the '<em><b>Interfacesecuritymanager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER__INTERFACESECURITYMANAGER = ProjecttArchitecturalPackage.COMPOSANTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Security Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER_FEATURE_COUNT = ProjecttArchitecturalPackage.COMPOSANTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Security Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MANAGER_OPERATION_COUNT = ProjecttArchitecturalPackage.COMPOSANTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.DatabaseImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 2;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__CONFIGURATIONS = ProjecttArchitecturalPackage.COMPOSANTS__CONFIGURATIONS;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__CONTRAINTES = ProjecttArchitecturalPackage.COMPOSANTS__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Interfacecomposants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__INTERFACECOMPOSANTS = ProjecttArchitecturalPackage.COMPOSANTS__INTERFACECOMPOSANTS;

	/**
	 * The feature id for the '<em><b>Propriétés</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__PROPRIÉTÉS = ProjecttArchitecturalPackage.COMPOSANTS__PROPRIÉTÉS;

	/**
	 * The feature id for the '<em><b>Interfacedatabase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__INTERFACEDATABASE = ProjecttArchitecturalPackage.COMPOSANTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = ProjecttArchitecturalPackage.COMPOSANTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION_COUNT = ProjecttArchitecturalPackage.COMPOSANTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.InterfaceConnectionManagerImpl <em>Interface Connection Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.InterfaceConnectionManagerImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getInterfaceConnectionManager()
	 * @generated
	 */
	int INTERFACE_CONNECTION_MANAGER = 3;

	/**
	 * The feature id for the '<em><b>Servicecomposants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTION_MANAGER__SERVICECOMPOSANTS = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS__SERVICECOMPOSANTS;

	/**
	 * The feature id for the '<em><b>Portscompasants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTION_MANAGER__PORTSCOMPASANTS = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS__PORTSCOMPASANTS;

	/**
	 * The feature id for the '<em><b>Portrequisconfigcs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTION_MANAGER__PORTREQUISCONFIGCS = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Portfourniscs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTION_MANAGER__PORTFOURNISCS = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Portfournis connectionmanager database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTION_MANAGER__PORTFOURNIS_CONNECTIONMANAGER_DATABASE = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Portrequis connectionmanager database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTION_MANAGER__PORTREQUIS_CONNECTIONMANAGER_DATABASE = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Portfournis connectionmanager security</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTION_MANAGER__PORTFOURNIS_CONNECTIONMANAGER_SECURITY = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Portrequis connectionmanager security</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTION_MANAGER__PORTREQUIS_CONNECTIONMANAGER_SECURITY = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Interface Connection Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTION_MANAGER_FEATURE_COUNT = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Interface Connection Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTION_MANAGER_OPERATION_COUNT = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.interfaceSecurityManagerImpl <em>interface Security Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.interfaceSecurityManagerImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getinterfaceSecurityManager()
	 * @generated
	 */
	int INTERFACE_SECURITY_MANAGER = 4;

	/**
	 * The feature id for the '<em><b>Servicecomposants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SECURITY_MANAGER__SERVICECOMPOSANTS = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS__SERVICECOMPOSANTS;

	/**
	 * The feature id for the '<em><b>Portscompasants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SECURITY_MANAGER__PORTSCOMPASANTS = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS__PORTSCOMPASANTS;

	/**
	 * The feature id for the '<em><b>Portfournis security connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SECURITY_MANAGER__PORTFOURNIS_SECURITY_CONNECTION = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Portrequis security connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SECURITY_MANAGER__PORTREQUIS_SECURITY_CONNECTION = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Portfournis security database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SECURITY_MANAGER__PORTFOURNIS_SECURITY_DATABASE = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Portrequis security database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SECURITY_MANAGER__PORTREQUIS_SECURITY_DATABASE = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>interface Security Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SECURITY_MANAGER_FEATURE_COUNT = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>interface Security Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SECURITY_MANAGER_OPERATION_COUNT = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.InterfaceDatabaseImpl <em>Interface Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.InterfaceDatabaseImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getInterfaceDatabase()
	 * @generated
	 */
	int INTERFACE_DATABASE = 5;

	/**
	 * The feature id for the '<em><b>Servicecomposants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DATABASE__SERVICECOMPOSANTS = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS__SERVICECOMPOSANTS;

	/**
	 * The feature id for the '<em><b>Portscompasants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DATABASE__PORTSCOMPASANTS = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS__PORTSCOMPASANTS;

	/**
	 * The feature id for the '<em><b>Portfournis database connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DATABASE__PORTFOURNIS_DATABASE_CONNECTION = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Portrequis database connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DATABASE__PORTREQUIS_DATABASE_CONNECTION = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Portfournis database security</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DATABASE__PORTFOURNIS_DATABASE_SECURITY = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Portrequis database security</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DATABASE__PORTREQUIS_DATABASE_SECURITY = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Interface Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DATABASE_FEATURE_COUNT = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Interface Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DATABASE_OPERATION_COUNT = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.PortFournis_ConnectionManager_DatabaseImpl <em>Port Fournis Connection Manager Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.PortFournis_ConnectionManager_DatabaseImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getPortFournis_ConnectionManager_Database()
	 * @generated
	 */
	int PORT_FOURNIS_CONNECTION_MANAGER_DATABASE = 6;

	/**
	 * The number of structural features of the '<em>Port Fournis Connection Manager Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNIS_CONNECTION_MANAGER_DATABASE_FEATURE_COUNT = ProjecttArchitecturalPackage.PORTS_COMPOSANTS_FOURNIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Fournis Connection Manager Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNIS_CONNECTION_MANAGER_DATABASE_OPERATION_COUNT = ProjecttArchitecturalPackage.PORTS_COMPOSANTS_FOURNIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.PortRequis_ConnectionManager_DatabaseImpl <em>Port Requis Connection Manager Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.PortRequis_ConnectionManager_DatabaseImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getPortRequis_ConnectionManager_Database()
	 * @generated
	 */
	int PORT_REQUIS_CONNECTION_MANAGER_DATABASE = 7;

	/**
	 * The number of structural features of the '<em>Port Requis Connection Manager Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_CONNECTION_MANAGER_DATABASE_FEATURE_COUNT = ProjecttArchitecturalPackage.PORTS_COMPOSANTS_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Requis Connection Manager Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_CONNECTION_MANAGER_DATABASE_OPERATION_COUNT = ProjecttArchitecturalPackage.PORTS_COMPOSANTS_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.PortFournis_ConnectionManager_SecurityImpl <em>Port Fournis Connection Manager Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.PortFournis_ConnectionManager_SecurityImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getPortFournis_ConnectionManager_Security()
	 * @generated
	 */
	int PORT_FOURNIS_CONNECTION_MANAGER_SECURITY = 8;

	/**
	 * The number of structural features of the '<em>Port Fournis Connection Manager Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNIS_CONNECTION_MANAGER_SECURITY_FEATURE_COUNT = ProjecttArchitecturalPackage.PORTS_COMPOSANTS_FOURNIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Fournis Connection Manager Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNIS_CONNECTION_MANAGER_SECURITY_OPERATION_COUNT = ProjecttArchitecturalPackage.PORTS_COMPOSANTS_FOURNIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.PortRequis_ConnectionManager_SecurityImpl <em>Port Requis Connection Manager Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.PortRequis_ConnectionManager_SecurityImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getPortRequis_ConnectionManager_Security()
	 * @generated
	 */
	int PORT_REQUIS_CONNECTION_MANAGER_SECURITY = 9;

	/**
	 * The number of structural features of the '<em>Port Requis Connection Manager Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_CONNECTION_MANAGER_SECURITY_FEATURE_COUNT = ProjecttArchitecturalPackage.PORTS_COMPOSANTS_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Requis Connection Manager Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_CONNECTION_MANAGER_SECURITY_OPERATION_COUNT = ProjecttArchitecturalPackage.PORTS_COMPOSANTS_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.PortFournis_Security_ConnectionImpl <em>Port Fournis Security Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.PortFournis_Security_ConnectionImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getPortFournis_Security_Connection()
	 * @generated
	 */
	int PORT_FOURNIS_SECURITY_CONNECTION = 10;

	/**
	 * The number of structural features of the '<em>Port Fournis Security Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNIS_SECURITY_CONNECTION_FEATURE_COUNT = ProjecttArchitecturalPackage.PORTS_COMPOSANTS_FOURNIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Fournis Security Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNIS_SECURITY_CONNECTION_OPERATION_COUNT = ProjecttArchitecturalPackage.PORTS_COMPOSANTS_FOURNIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.PortRequis_Security_ConnectionImpl <em>Port Requis Security Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.PortRequis_Security_ConnectionImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getPortRequis_Security_Connection()
	 * @generated
	 */
	int PORT_REQUIS_SECURITY_CONNECTION = 11;

	/**
	 * The number of structural features of the '<em>Port Requis Security Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_SECURITY_CONNECTION_FEATURE_COUNT = ProjecttArchitecturalPackage.PORTS_COMPOSANTS_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Requis Security Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_SECURITY_CONNECTION_OPERATION_COUNT = ProjecttArchitecturalPackage.PORTS_COMPOSANTS_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.PortFournis_Security_DatabaseImpl <em>Port Fournis Security Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.PortFournis_Security_DatabaseImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getPortFournis_Security_Database()
	 * @generated
	 */
	int PORT_FOURNIS_SECURITY_DATABASE = 12;

	/**
	 * The number of structural features of the '<em>Port Fournis Security Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNIS_SECURITY_DATABASE_FEATURE_COUNT = ProjecttArchitecturalPackage.PORTS_COMPOSANTS_FOURNIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Fournis Security Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNIS_SECURITY_DATABASE_OPERATION_COUNT = ProjecttArchitecturalPackage.PORTS_COMPOSANTS_FOURNIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.PortRequis_Security_DatabaseImpl <em>Port Requis Security Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.PortRequis_Security_DatabaseImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getPortRequis_Security_Database()
	 * @generated
	 */
	int PORT_REQUIS_SECURITY_DATABASE = 13;

	/**
	 * The number of structural features of the '<em>Port Requis Security Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_SECURITY_DATABASE_FEATURE_COUNT = ProjecttArchitecturalPackage.PORTS_COMPOSANTS_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Requis Security Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_SECURITY_DATABASE_OPERATION_COUNT = ProjecttArchitecturalPackage.PORTS_COMPOSANTS_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.PortFournis_database_ConnectionImpl <em>Port Fournis database Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.PortFournis_database_ConnectionImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getPortFournis_database_Connection()
	 * @generated
	 */
	int PORT_FOURNIS_DATABASE_CONNECTION = 14;

	/**
	 * The number of structural features of the '<em>Port Fournis database Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNIS_DATABASE_CONNECTION_FEATURE_COUNT = ProjecttArchitecturalPackage.PORTS_COMPOSANTS_FOURNIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Fournis database Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNIS_DATABASE_CONNECTION_OPERATION_COUNT = ProjecttArchitecturalPackage.PORTS_COMPOSANTS_FOURNIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.PortRequis_database_ConnectionImpl <em>Port Requis database Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.PortRequis_database_ConnectionImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getPortRequis_database_Connection()
	 * @generated
	 */
	int PORT_REQUIS_DATABASE_CONNECTION = 15;

	/**
	 * The number of structural features of the '<em>Port Requis database Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_DATABASE_CONNECTION_FEATURE_COUNT = ProjecttArchitecturalPackage.PORTS_COMPOSANTS_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Requis database Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_DATABASE_CONNECTION_OPERATION_COUNT = ProjecttArchitecturalPackage.PORTS_COMPOSANTS_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.PortFournis_database_SecurityImpl <em>Port Fournis database Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.PortFournis_database_SecurityImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getPortFournis_database_Security()
	 * @generated
	 */
	int PORT_FOURNIS_DATABASE_SECURITY = 16;

	/**
	 * The number of structural features of the '<em>Port Fournis database Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNIS_DATABASE_SECURITY_FEATURE_COUNT = ProjecttArchitecturalPackage.PORTS_COMPOSANTS_FOURNIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Fournis database Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNIS_DATABASE_SECURITY_OPERATION_COUNT = ProjecttArchitecturalPackage.PORTS_COMPOSANTS_FOURNIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.PortRequis_database_SecurityImpl <em>Port Requis database Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.PortRequis_database_SecurityImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getPortRequis_database_Security()
	 * @generated
	 */
	int PORT_REQUIS_DATABASE_SECURITY = 17;

	/**
	 * The number of structural features of the '<em>Port Requis database Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_DATABASE_SECURITY_FEATURE_COUNT = ProjecttArchitecturalPackage.PORTS_COMPOSANTS_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Requis database Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_DATABASE_SECURITY_OPERATION_COUNT = ProjecttArchitecturalPackage.PORTS_COMPOSANTS_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.attachment_connectionM_Fournis_role_database_RequisImpl <em>attachment connection MFournis role database Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.attachment_connectionM_Fournis_role_database_RequisImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getattachment_connectionM_Fournis_role_database_Requis()
	 * @generated
	 */
	int ATTACHMENT_CONNECTION_MFOURNIS_ROLE_DATABASE_REQUIS = 18;

	/**
	 * The feature id for the '<em><b>Portscomposantsfournis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CONNECTION_MFOURNIS_ROLE_DATABASE_REQUIS__PORTSCOMPOSANTSFOURNIS = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS__PORTSCOMPOSANTSFOURNIS;

	/**
	 * The feature id for the '<em><b>Roleconnecteursrequis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CONNECTION_MFOURNIS_ROLE_DATABASE_REQUIS__ROLECONNECTEURSREQUIS = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS__ROLECONNECTEURSREQUIS;

	/**
	 * The feature id for the '<em><b>Portfournis connectionmanager database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CONNECTION_MFOURNIS_ROLE_DATABASE_REQUIS__PORTFOURNIS_CONNECTIONMANAGER_DATABASE = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolerequis database connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CONNECTION_MFOURNIS_ROLE_DATABASE_REQUIS__ROLEREQUIS_DATABASE_CONNECTION = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>attachment connection MFournis role database Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CONNECTION_MFOURNIS_ROLE_DATABASE_REQUIS_FEATURE_COUNT = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>attachment connection MFournis role database Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CONNECTION_MFOURNIS_ROLE_DATABASE_REQUIS_OPERATION_COUNT = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.attachment_connectionM_Requis_role_security_fournisImpl <em>attachment connection MRequis role security fournis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.attachment_connectionM_Requis_role_security_fournisImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getattachment_connectionM_Requis_role_security_fournis()
	 * @generated
	 */
	int ATTACHMENT_CONNECTION_MREQUIS_ROLE_SECURITY_FOURNIS = 19;

	/**
	 * The feature id for the '<em><b>Portscomposantsrequis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CONNECTION_MREQUIS_ROLE_SECURITY_FOURNIS__PORTSCOMPOSANTSREQUIS = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS__PORTSCOMPOSANTSREQUIS;

	/**
	 * The feature id for the '<em><b>Roleconnecteursfournis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CONNECTION_MREQUIS_ROLE_SECURITY_FOURNIS__ROLECONNECTEURSFOURNIS = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS__ROLECONNECTEURSFOURNIS;

	/**
	 * The feature id for the '<em><b>Portrequis connectionmanager security</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CONNECTION_MREQUIS_ROLE_SECURITY_FOURNIS__PORTREQUIS_CONNECTIONMANAGER_SECURITY = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolefournis security connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CONNECTION_MREQUIS_ROLE_SECURITY_FOURNIS__ROLEFOURNIS_SECURITY_CONNECTION = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>attachment connection MRequis role security fournis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CONNECTION_MREQUIS_ROLE_SECURITY_FOURNIS_FEATURE_COUNT = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>attachment connection MRequis role security fournis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CONNECTION_MREQUIS_ROLE_SECURITY_FOURNIS_OPERATION_COUNT = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.attachment_connectionM_Fournis_role_security_RequisImpl <em>attachment connection MFournis role security Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.attachment_connectionM_Fournis_role_security_RequisImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getattachment_connectionM_Fournis_role_security_Requis()
	 * @generated
	 */
	int ATTACHMENT_CONNECTION_MFOURNIS_ROLE_SECURITY_REQUIS = 20;

	/**
	 * The feature id for the '<em><b>Portscomposantsfournis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CONNECTION_MFOURNIS_ROLE_SECURITY_REQUIS__PORTSCOMPOSANTSFOURNIS = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS__PORTSCOMPOSANTSFOURNIS;

	/**
	 * The feature id for the '<em><b>Roleconnecteursrequis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CONNECTION_MFOURNIS_ROLE_SECURITY_REQUIS__ROLECONNECTEURSREQUIS = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS__ROLECONNECTEURSREQUIS;

	/**
	 * The feature id for the '<em><b>Portfournis connectionmanager security</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CONNECTION_MFOURNIS_ROLE_SECURITY_REQUIS__PORTFOURNIS_CONNECTIONMANAGER_SECURITY = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolerequis security connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CONNECTION_MFOURNIS_ROLE_SECURITY_REQUIS__ROLEREQUIS_SECURITY_CONNECTION = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>attachment connection MFournis role security Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CONNECTION_MFOURNIS_ROLE_SECURITY_REQUIS_FEATURE_COUNT = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>attachment connection MFournis role security Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CONNECTION_MFOURNIS_ROLE_SECURITY_REQUIS_OPERATION_COUNT = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.attachment_connectionM_Requis_role_database_fournisImpl <em>attachment connection MRequis role database fournis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.attachment_connectionM_Requis_role_database_fournisImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getattachment_connectionM_Requis_role_database_fournis()
	 * @generated
	 */
	int ATTACHMENT_CONNECTION_MREQUIS_ROLE_DATABASE_FOURNIS = 21;

	/**
	 * The feature id for the '<em><b>Portscomposantsrequis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CONNECTION_MREQUIS_ROLE_DATABASE_FOURNIS__PORTSCOMPOSANTSREQUIS = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS__PORTSCOMPOSANTSREQUIS;

	/**
	 * The feature id for the '<em><b>Roleconnecteursfournis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CONNECTION_MREQUIS_ROLE_DATABASE_FOURNIS__ROLECONNECTEURSFOURNIS = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS__ROLECONNECTEURSFOURNIS;

	/**
	 * The feature id for the '<em><b>Portrequis connectionmanager database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CONNECTION_MREQUIS_ROLE_DATABASE_FOURNIS__PORTREQUIS_CONNECTIONMANAGER_DATABASE = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolefournis database connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CONNECTION_MREQUIS_ROLE_DATABASE_FOURNIS__ROLEFOURNIS_DATABASE_CONNECTION = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>attachment connection MRequis role database fournis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CONNECTION_MREQUIS_ROLE_DATABASE_FOURNIS_FEATURE_COUNT = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>attachment connection MRequis role database fournis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CONNECTION_MREQUIS_ROLE_DATABASE_FOURNIS_OPERATION_COUNT = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.attachment_Security_Requis_role_Connection_fournisImpl <em>attachment Security Requis role Connection fournis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.attachment_Security_Requis_role_Connection_fournisImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getattachment_Security_Requis_role_Connection_fournis()
	 * @generated
	 */
	int ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS = 22;

	/**
	 * The feature id for the '<em><b>Portscomposantsrequis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS__PORTSCOMPOSANTSREQUIS = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS__PORTSCOMPOSANTSREQUIS;

	/**
	 * The feature id for the '<em><b>Roleconnecteursfournis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS__ROLECONNECTEURSFOURNIS = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS__ROLECONNECTEURSFOURNIS;

	/**
	 * The feature id for the '<em><b>Portrequis security connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS__PORTREQUIS_SECURITY_CONNECTION = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolefournis connectionmanager security</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS__ROLEFOURNIS_CONNECTIONMANAGER_SECURITY = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>attachment Security Requis role Connection fournis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS_FEATURE_COUNT = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>attachment Security Requis role Connection fournis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS_OPERATION_COUNT = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.attachment_Security_Fournis_role_Connection_RequisImpl <em>attachment Security Fournis role Connection Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.attachment_Security_Fournis_role_Connection_RequisImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getattachment_Security_Fournis_role_Connection_Requis()
	 * @generated
	 */
	int ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS = 23;

	/**
	 * The feature id for the '<em><b>Portscomposantsfournis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS__PORTSCOMPOSANTSFOURNIS = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS__PORTSCOMPOSANTSFOURNIS;

	/**
	 * The feature id for the '<em><b>Roleconnecteursrequis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS__ROLECONNECTEURSREQUIS = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS__ROLECONNECTEURSREQUIS;

	/**
	 * The feature id for the '<em><b>Portfournis security connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS__PORTFOURNIS_SECURITY_CONNECTION = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolerequis connectionmanager security</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS__ROLEREQUIS_CONNECTIONMANAGER_SECURITY = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>attachment Security Fournis role Connection Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS_FEATURE_COUNT = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>attachment Security Fournis role Connection Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS_OPERATION_COUNT = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.attachment_Security_Requis_role_Database_fournisImpl <em>attachment Security Requis role Database fournis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.attachment_Security_Requis_role_Database_fournisImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getattachment_Security_Requis_role_Database_fournis()
	 * @generated
	 */
	int ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS = 24;

	/**
	 * The feature id for the '<em><b>Portscomposantsrequis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS__PORTSCOMPOSANTSREQUIS = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS__PORTSCOMPOSANTSREQUIS;

	/**
	 * The feature id for the '<em><b>Roleconnecteursfournis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS__ROLECONNECTEURSFOURNIS = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS__ROLECONNECTEURSFOURNIS;

	/**
	 * The feature id for the '<em><b>Portrequis security database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS__PORTREQUIS_SECURITY_DATABASE = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolefournis database security</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS__ROLEFOURNIS_DATABASE_SECURITY = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>attachment Security Requis role Database fournis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS_FEATURE_COUNT = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>attachment Security Requis role Database fournis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS_OPERATION_COUNT = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.attachment_Security_Fournis_role_Database_RequisImpl <em>attachment Security Fournis role Database Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.attachment_Security_Fournis_role_Database_RequisImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getattachment_Security_Fournis_role_Database_Requis()
	 * @generated
	 */
	int ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS = 25;

	/**
	 * The feature id for the '<em><b>Portscomposantsfournis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS__PORTSCOMPOSANTSFOURNIS = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS__PORTSCOMPOSANTSFOURNIS;

	/**
	 * The feature id for the '<em><b>Roleconnecteursrequis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS__ROLECONNECTEURSREQUIS = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS__ROLECONNECTEURSREQUIS;

	/**
	 * The feature id for the '<em><b>Rolerequis database security</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS__ROLEREQUIS_DATABASE_SECURITY = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Portfournis security database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS__PORTFOURNIS_SECURITY_DATABASE = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>attachment Security Fournis role Database Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS_FEATURE_COUNT = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>attachment Security Fournis role Database Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS_OPERATION_COUNT = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.attachment_Database_Requis_role_connection_fournisImpl <em>attachment Database Requis role connection fournis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.attachment_Database_Requis_role_connection_fournisImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getattachment_Database_Requis_role_connection_fournis()
	 * @generated
	 */
	int ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS = 26;

	/**
	 * The feature id for the '<em><b>Portscomposantsrequis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS__PORTSCOMPOSANTSREQUIS = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS__PORTSCOMPOSANTSREQUIS;

	/**
	 * The feature id for the '<em><b>Roleconnecteursfournis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS__ROLECONNECTEURSFOURNIS = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS__ROLECONNECTEURSFOURNIS;

	/**
	 * The feature id for the '<em><b>Portrequis database connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS__PORTREQUIS_DATABASE_CONNECTION = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolefournis connectionmanager database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS__ROLEFOURNIS_CONNECTIONMANAGER_DATABASE = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>attachment Database Requis role connection fournis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS_FEATURE_COUNT = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>attachment Database Requis role connection fournis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS_OPERATION_COUNT = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.attachment_Database_Fournis_role_Connection_RequisImpl <em>attachment Database Fournis role Connection Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.attachment_Database_Fournis_role_Connection_RequisImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getattachment_Database_Fournis_role_Connection_Requis()
	 * @generated
	 */
	int ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS = 27;

	/**
	 * The feature id for the '<em><b>Portscomposantsfournis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS__PORTSCOMPOSANTSFOURNIS = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS__PORTSCOMPOSANTSFOURNIS;

	/**
	 * The feature id for the '<em><b>Roleconnecteursrequis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS__ROLECONNECTEURSREQUIS = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS__ROLECONNECTEURSREQUIS;

	/**
	 * The feature id for the '<em><b>Portfournis database connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS__PORTFOURNIS_DATABASE_CONNECTION = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolerequis connectionmanager database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS__ROLEREQUIS_CONNECTIONMANAGER_DATABASE = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>attachment Database Fournis role Connection Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS_FEATURE_COUNT = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>attachment Database Fournis role Connection Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS_OPERATION_COUNT = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.attachment_Database_Requis_role_Security_fournisImpl <em>attachment Database Requis role Security fournis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.attachment_Database_Requis_role_Security_fournisImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getattachment_Database_Requis_role_Security_fournis()
	 * @generated
	 */
	int ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS = 28;

	/**
	 * The feature id for the '<em><b>Portscomposantsrequis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS__PORTSCOMPOSANTSREQUIS = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS__PORTSCOMPOSANTSREQUIS;

	/**
	 * The feature id for the '<em><b>Roleconnecteursfournis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS__ROLECONNECTEURSFOURNIS = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS__ROLECONNECTEURSFOURNIS;

	/**
	 * The feature id for the '<em><b>Portrequis database security</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS__PORTREQUIS_DATABASE_SECURITY = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolefournis security database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS__ROLEFOURNIS_SECURITY_DATABASE = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>attachment Database Requis role Security fournis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS_FEATURE_COUNT = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>attachment Database Requis role Security fournis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS_OPERATION_COUNT = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.attachment_Database_Fournis_role_Security_RequisImpl <em>attachment Database Fournis role Security Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.attachment_Database_Fournis_role_Security_RequisImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getattachment_Database_Fournis_role_Security_Requis()
	 * @generated
	 */
	int ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS = 29;

	/**
	 * The feature id for the '<em><b>Portscomposantsfournis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS__PORTSCOMPOSANTSFOURNIS = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS__PORTSCOMPOSANTSFOURNIS;

	/**
	 * The feature id for the '<em><b>Roleconnecteursrequis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS__ROLECONNECTEURSREQUIS = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS__ROLECONNECTEURSREQUIS;

	/**
	 * The feature id for the '<em><b>Portfournis database security</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS__PORTFOURNIS_DATABASE_SECURITY = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolerequis security database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS__ROLEREQUIS_SECURITY_DATABASE = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>attachment Database Fournis role Security Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS_FEATURE_COUNT = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>attachment Database Fournis role Security Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS_OPERATION_COUNT = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.ConnecteurServeurDImpl <em>Connecteur Serveur D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.ConnecteurServeurDImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getConnecteurServeurD()
	 * @generated
	 */
	int CONNECTEUR_SERVEUR_D = 30;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR_SERVEUR_D__CONFIGURATIONS = ProjecttArchitecturalPackage.CONNECTEURS__CONFIGURATIONS;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR_SERVEUR_D__CONTRAINTES = ProjecttArchitecturalPackage.CONNECTEURS__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR_SERVEUR_D__GLUE = ProjecttArchitecturalPackage.CONNECTEURS__GLUE;

	/**
	 * The feature id for the '<em><b>Roleconnecteurs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR_SERVEUR_D__ROLECONNECTEURS = ProjecttArchitecturalPackage.CONNECTEURS__ROLECONNECTEURS;

	/**
	 * The feature id for the '<em><b>Glueserveur1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR_SERVEUR_D__GLUESERVEUR1 = ProjecttArchitecturalPackage.CONNECTEURS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Glueserveur2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR_SERVEUR_D__GLUESERVEUR2 = ProjecttArchitecturalPackage.CONNECTEURS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Glueserveur3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR_SERVEUR_D__GLUESERVEUR3 = ProjecttArchitecturalPackage.CONNECTEURS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Glueserveur4</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR_SERVEUR_D__GLUESERVEUR4 = ProjecttArchitecturalPackage.CONNECTEURS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Glueserveur5</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR_SERVEUR_D__GLUESERVEUR5 = ProjecttArchitecturalPackage.CONNECTEURS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Glueserveur6</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR_SERVEUR_D__GLUESERVEUR6 = ProjecttArchitecturalPackage.CONNECTEURS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rolefournis connectionmanager database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR_SERVEUR_D__ROLEFOURNIS_CONNECTIONMANAGER_DATABASE = ProjecttArchitecturalPackage.CONNECTEURS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Rolerequis connectionmanager database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR_SERVEUR_D__ROLEREQUIS_CONNECTIONMANAGER_DATABASE = ProjecttArchitecturalPackage.CONNECTEURS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Rolefournis connectionmanager security</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR_SERVEUR_D__ROLEFOURNIS_CONNECTIONMANAGER_SECURITY = ProjecttArchitecturalPackage.CONNECTEURS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Rolerequis connectionmanager security</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR_SERVEUR_D__ROLEREQUIS_CONNECTIONMANAGER_SECURITY = ProjecttArchitecturalPackage.CONNECTEURS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Rolefournis security connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR_SERVEUR_D__ROLEFOURNIS_SECURITY_CONNECTION = ProjecttArchitecturalPackage.CONNECTEURS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Rolerequis security connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR_SERVEUR_D__ROLEREQUIS_SECURITY_CONNECTION = ProjecttArchitecturalPackage.CONNECTEURS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Rolefournis security database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR_SERVEUR_D__ROLEFOURNIS_SECURITY_DATABASE = ProjecttArchitecturalPackage.CONNECTEURS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Rolerequis security database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR_SERVEUR_D__ROLEREQUIS_SECURITY_DATABASE = ProjecttArchitecturalPackage.CONNECTEURS_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Rolefournis database connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR_SERVEUR_D__ROLEFOURNIS_DATABASE_CONNECTION = ProjecttArchitecturalPackage.CONNECTEURS_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Rolerequis database connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR_SERVEUR_D__ROLEREQUIS_DATABASE_CONNECTION = ProjecttArchitecturalPackage.CONNECTEURS_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Rolefournis database security</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR_SERVEUR_D__ROLEFOURNIS_DATABASE_SECURITY = ProjecttArchitecturalPackage.CONNECTEURS_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Rolerequis database security</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR_SERVEUR_D__ROLEREQUIS_DATABASE_SECURITY = ProjecttArchitecturalPackage.CONNECTEURS_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Connecteur Serveur D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR_SERVEUR_D_FEATURE_COUNT = ProjecttArchitecturalPackage.CONNECTEURS_FEATURE_COUNT + 18;

	/**
	 * The number of operations of the '<em>Connecteur Serveur D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR_SERVEUR_D_OPERATION_COUNT = ProjecttArchitecturalPackage.CONNECTEURS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.GlueServeur1Impl <em>Glue Serveur1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.GlueServeur1Impl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getGlueServeur1()
	 * @generated
	 */
	int GLUE_SERVEUR1 = 31;

	/**
	 * The feature id for the '<em><b>Roleconnecteurs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_SERVEUR1__ROLECONNECTEURS = ProjecttArchitecturalPackage.GLUE__ROLECONNECTEURS;

	/**
	 * The feature id for the '<em><b>Rolefournis connectionmanager database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_SERVEUR1__ROLEFOURNIS_CONNECTIONMANAGER_DATABASE = ProjecttArchitecturalPackage.GLUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolerequis connectionmanager database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_SERVEUR1__ROLEREQUIS_CONNECTIONMANAGER_DATABASE = ProjecttArchitecturalPackage.GLUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Glue Serveur1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_SERVEUR1_FEATURE_COUNT = ProjecttArchitecturalPackage.GLUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Glue Serveur1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_SERVEUR1_OPERATION_COUNT = ProjecttArchitecturalPackage.GLUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.RoleFournis_ConnectionManager_DatabaseImpl <em>Role Fournis Connection Manager Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.RoleFournis_ConnectionManager_DatabaseImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getRoleFournis_ConnectionManager_Database()
	 * @generated
	 */
	int ROLE_FOURNIS_CONNECTION_MANAGER_DATABASE = 32;

	/**
	 * The number of structural features of the '<em>Role Fournis Connection Manager Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNIS_CONNECTION_MANAGER_DATABASE_FEATURE_COUNT = ProjecttArchitecturalPackage.ROLE_CONNECTEURS_FOURNIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role Fournis Connection Manager Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNIS_CONNECTION_MANAGER_DATABASE_OPERATION_COUNT = ProjecttArchitecturalPackage.ROLE_CONNECTEURS_FOURNIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.RoleRequis_ConnectionManager_DatabaseImpl <em>Role Requis Connection Manager Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.RoleRequis_ConnectionManager_DatabaseImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getRoleRequis_ConnectionManager_Database()
	 * @generated
	 */
	int ROLE_REQUIS_CONNECTION_MANAGER_DATABASE = 33;

	/**
	 * The number of structural features of the '<em>Role Requis Connection Manager Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_CONNECTION_MANAGER_DATABASE_FEATURE_COUNT = ProjecttArchitecturalPackage.ROLE_CONNECTEURS_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role Requis Connection Manager Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_CONNECTION_MANAGER_DATABASE_OPERATION_COUNT = ProjecttArchitecturalPackage.ROLE_CONNECTEURS_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.RoleFournis_ConnectionManager_SecurityImpl <em>Role Fournis Connection Manager Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.RoleFournis_ConnectionManager_SecurityImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getRoleFournis_ConnectionManager_Security()
	 * @generated
	 */
	int ROLE_FOURNIS_CONNECTION_MANAGER_SECURITY = 34;

	/**
	 * The number of structural features of the '<em>Role Fournis Connection Manager Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNIS_CONNECTION_MANAGER_SECURITY_FEATURE_COUNT = ProjecttArchitecturalPackage.ROLE_CONNECTEURS_FOURNIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role Fournis Connection Manager Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNIS_CONNECTION_MANAGER_SECURITY_OPERATION_COUNT = ProjecttArchitecturalPackage.ROLE_CONNECTEURS_FOURNIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.RoleRequis_ConnectionManager_SecurityImpl <em>Role Requis Connection Manager Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.RoleRequis_ConnectionManager_SecurityImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getRoleRequis_ConnectionManager_Security()
	 * @generated
	 */
	int ROLE_REQUIS_CONNECTION_MANAGER_SECURITY = 35;

	/**
	 * The number of structural features of the '<em>Role Requis Connection Manager Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_CONNECTION_MANAGER_SECURITY_FEATURE_COUNT = ProjecttArchitecturalPackage.ROLE_CONNECTEURS_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role Requis Connection Manager Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_CONNECTION_MANAGER_SECURITY_OPERATION_COUNT = ProjecttArchitecturalPackage.ROLE_CONNECTEURS_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.RoleFournis_Security_ConnectionImpl <em>Role Fournis Security Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.RoleFournis_Security_ConnectionImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getRoleFournis_Security_Connection()
	 * @generated
	 */
	int ROLE_FOURNIS_SECURITY_CONNECTION = 36;

	/**
	 * The number of structural features of the '<em>Role Fournis Security Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNIS_SECURITY_CONNECTION_FEATURE_COUNT = ProjecttArchitecturalPackage.ROLE_CONNECTEURS_FOURNIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role Fournis Security Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNIS_SECURITY_CONNECTION_OPERATION_COUNT = ProjecttArchitecturalPackage.ROLE_CONNECTEURS_FOURNIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.RoleRequis_Security_ConnectionImpl <em>Role Requis Security Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.RoleRequis_Security_ConnectionImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getRoleRequis_Security_Connection()
	 * @generated
	 */
	int ROLE_REQUIS_SECURITY_CONNECTION = 37;

	/**
	 * The number of structural features of the '<em>Role Requis Security Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_SECURITY_CONNECTION_FEATURE_COUNT = ProjecttArchitecturalPackage.ROLE_CONNECTEURS_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role Requis Security Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_SECURITY_CONNECTION_OPERATION_COUNT = ProjecttArchitecturalPackage.ROLE_CONNECTEURS_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.RoleFournis_Security_DatabaseImpl <em>Role Fournis Security Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.RoleFournis_Security_DatabaseImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getRoleFournis_Security_Database()
	 * @generated
	 */
	int ROLE_FOURNIS_SECURITY_DATABASE = 38;

	/**
	 * The number of structural features of the '<em>Role Fournis Security Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNIS_SECURITY_DATABASE_FEATURE_COUNT = ProjecttArchitecturalPackage.ROLE_CONNECTEURS_FOURNIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role Fournis Security Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNIS_SECURITY_DATABASE_OPERATION_COUNT = ProjecttArchitecturalPackage.ROLE_CONNECTEURS_FOURNIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.RoleRequis_Security_DatabaseImpl <em>Role Requis Security Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.RoleRequis_Security_DatabaseImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getRoleRequis_Security_Database()
	 * @generated
	 */
	int ROLE_REQUIS_SECURITY_DATABASE = 39;

	/**
	 * The number of structural features of the '<em>Role Requis Security Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_SECURITY_DATABASE_FEATURE_COUNT = ProjecttArchitecturalPackage.ROLE_CONNECTEURS_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role Requis Security Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_SECURITY_DATABASE_OPERATION_COUNT = ProjecttArchitecturalPackage.ROLE_CONNECTEURS_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.RoleFournis_Database_ConnectionImpl <em>Role Fournis Database Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.RoleFournis_Database_ConnectionImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getRoleFournis_Database_Connection()
	 * @generated
	 */
	int ROLE_FOURNIS_DATABASE_CONNECTION = 40;

	/**
	 * The number of structural features of the '<em>Role Fournis Database Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNIS_DATABASE_CONNECTION_FEATURE_COUNT = ProjecttArchitecturalPackage.ROLE_CONNECTEURS_FOURNIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role Fournis Database Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNIS_DATABASE_CONNECTION_OPERATION_COUNT = ProjecttArchitecturalPackage.ROLE_CONNECTEURS_FOURNIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.RoleRequis_Database_ConnectionImpl <em>Role Requis Database Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.RoleRequis_Database_ConnectionImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getRoleRequis_Database_Connection()
	 * @generated
	 */
	int ROLE_REQUIS_DATABASE_CONNECTION = 41;

	/**
	 * The number of structural features of the '<em>Role Requis Database Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_DATABASE_CONNECTION_FEATURE_COUNT = ProjecttArchitecturalPackage.ROLE_CONNECTEURS_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role Requis Database Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_DATABASE_CONNECTION_OPERATION_COUNT = ProjecttArchitecturalPackage.ROLE_CONNECTEURS_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.RoleFournis_Database_SecurityImpl <em>Role Fournis Database Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.RoleFournis_Database_SecurityImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getRoleFournis_Database_Security()
	 * @generated
	 */
	int ROLE_FOURNIS_DATABASE_SECURITY = 42;

	/**
	 * The number of structural features of the '<em>Role Fournis Database Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNIS_DATABASE_SECURITY_FEATURE_COUNT = ProjecttArchitecturalPackage.ROLE_CONNECTEURS_FOURNIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role Fournis Database Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNIS_DATABASE_SECURITY_OPERATION_COUNT = ProjecttArchitecturalPackage.ROLE_CONNECTEURS_FOURNIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.RoleRequis_Database_SecurityImpl <em>Role Requis Database Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.RoleRequis_Database_SecurityImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getRoleRequis_Database_Security()
	 * @generated
	 */
	int ROLE_REQUIS_DATABASE_SECURITY = 43;

	/**
	 * The number of structural features of the '<em>Role Requis Database Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_DATABASE_SECURITY_FEATURE_COUNT = ProjecttArchitecturalPackage.ROLE_CONNECTEURS_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role Requis Database Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_DATABASE_SECURITY_OPERATION_COUNT = ProjecttArchitecturalPackage.ROLE_CONNECTEURS_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.PortRequisConfigCSImpl <em>Port Requis Config CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.PortRequisConfigCSImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getPortRequisConfigCS()
	 * @generated
	 */
	int PORT_REQUIS_CONFIG_CS = 44;

	/**
	 * The number of structural features of the '<em>Port Requis Config CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_CONFIG_CS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Port Requis Config CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_CONFIG_CS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.PortFournisCSImpl <em>Port Fournis CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.PortFournisCSImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getPortFournisCS()
	 * @generated
	 */
	int PORT_FOURNIS_CS = 45;

	/**
	 * The number of structural features of the '<em>Port Fournis CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNIS_CS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Port Fournis CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNIS_CS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.ServeurDetailImpl <em>Serveur Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.ServeurDetailImpl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getServeurDetail()
	 * @generated
	 */
	int SERVEUR_DETAIL = 46;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__CONFIGURATIONS = ProjecttArchitecturalPackage.CONFIGURATIONS__CONFIGURATIONS;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__CONTRAINTES = ProjecttArchitecturalPackage.CONFIGURATIONS__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Lien</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__LIEN = ProjecttArchitecturalPackage.CONFIGURATIONS__LIEN;

	/**
	 * The feature id for the '<em><b>Connectionmanager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__CONNECTIONMANAGER = ProjecttArchitecturalPackage.CONFIGURATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Securitymanager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__SECURITYMANAGER = ProjecttArchitecturalPackage.CONFIGURATIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__DATABASE = ProjecttArchitecturalPackage.CONFIGURATIONS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connecteurserveurd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__CONNECTEURSERVEURD = ProjecttArchitecturalPackage.CONFIGURATIONS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attachment connectionm fournis role database requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_FOURNIS_ROLE_DATABASE_REQUIS = ProjecttArchitecturalPackage.CONFIGURATIONS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attachment connectionm requis role database fournis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_REQUIS_ROLE_DATABASE_FOURNIS = ProjecttArchitecturalPackage.CONFIGURATIONS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attachment connectionm requis role security fournis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_REQUIS_ROLE_SECURITY_FOURNIS = ProjecttArchitecturalPackage.CONFIGURATIONS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attachment connectionm fournis role security requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_FOURNIS_ROLE_SECURITY_REQUIS = ProjecttArchitecturalPackage.CONFIGURATIONS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Attachment security requis role connection fournis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS = ProjecttArchitecturalPackage.CONFIGURATIONS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Attachment security fournis role connection requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS = ProjecttArchitecturalPackage.CONFIGURATIONS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Attachment security requis role database fournis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS = ProjecttArchitecturalPackage.CONFIGURATIONS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Attachment security fournis role database requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS = ProjecttArchitecturalPackage.CONFIGURATIONS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Attachment database requis role connection fournis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS = ProjecttArchitecturalPackage.CONFIGURATIONS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Attachment database fournis role connection requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS = ProjecttArchitecturalPackage.CONFIGURATIONS_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Attachment database requis role security fournis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS = ProjecttArchitecturalPackage.CONFIGURATIONS_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Attachment database fournis role security requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL__ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS = ProjecttArchitecturalPackage.CONFIGURATIONS_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Serveur Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL_FEATURE_COUNT = ProjecttArchitecturalPackage.CONFIGURATIONS_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Serveur Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_DETAIL_OPERATION_COUNT = ProjecttArchitecturalPackage.CONFIGURATIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.GlueServeur2Impl <em>Glue Serveur2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.GlueServeur2Impl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getGlueServeur2()
	 * @generated
	 */
	int GLUE_SERVEUR2 = 47;

	/**
	 * The feature id for the '<em><b>Roleconnecteurs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_SERVEUR2__ROLECONNECTEURS = ProjecttArchitecturalPackage.GLUE__ROLECONNECTEURS;

	/**
	 * The feature id for the '<em><b>Rolefournis connectionmanager security</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_SERVEUR2__ROLEFOURNIS_CONNECTIONMANAGER_SECURITY = ProjecttArchitecturalPackage.GLUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolerequis connectionmanager security</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_SERVEUR2__ROLEREQUIS_CONNECTIONMANAGER_SECURITY = ProjecttArchitecturalPackage.GLUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Glue Serveur2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_SERVEUR2_FEATURE_COUNT = ProjecttArchitecturalPackage.GLUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Glue Serveur2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_SERVEUR2_OPERATION_COUNT = ProjecttArchitecturalPackage.GLUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.GlueServeur3Impl <em>Glue Serveur3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.GlueServeur3Impl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getGlueServeur3()
	 * @generated
	 */
	int GLUE_SERVEUR3 = 48;

	/**
	 * The feature id for the '<em><b>Roleconnecteurs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_SERVEUR3__ROLECONNECTEURS = ProjecttArchitecturalPackage.GLUE__ROLECONNECTEURS;

	/**
	 * The feature id for the '<em><b>Rolefournis security connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_SERVEUR3__ROLEFOURNIS_SECURITY_CONNECTION = ProjecttArchitecturalPackage.GLUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolerequis security connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_SERVEUR3__ROLEREQUIS_SECURITY_CONNECTION = ProjecttArchitecturalPackage.GLUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Glue Serveur3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_SERVEUR3_FEATURE_COUNT = ProjecttArchitecturalPackage.GLUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Glue Serveur3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_SERVEUR3_OPERATION_COUNT = ProjecttArchitecturalPackage.GLUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.GlueServeur4Impl <em>Glue Serveur4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.GlueServeur4Impl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getGlueServeur4()
	 * @generated
	 */
	int GLUE_SERVEUR4 = 49;

	/**
	 * The feature id for the '<em><b>Roleconnecteurs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_SERVEUR4__ROLECONNECTEURS = ProjecttArchitecturalPackage.GLUE__ROLECONNECTEURS;

	/**
	 * The feature id for the '<em><b>Rolefournis security database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_SERVEUR4__ROLEFOURNIS_SECURITY_DATABASE = ProjecttArchitecturalPackage.GLUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolerequis security database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_SERVEUR4__ROLEREQUIS_SECURITY_DATABASE = ProjecttArchitecturalPackage.GLUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Glue Serveur4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_SERVEUR4_FEATURE_COUNT = ProjecttArchitecturalPackage.GLUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Glue Serveur4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_SERVEUR4_OPERATION_COUNT = ProjecttArchitecturalPackage.GLUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.GlueServeur5Impl <em>Glue Serveur5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.GlueServeur5Impl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getGlueServeur5()
	 * @generated
	 */
	int GLUE_SERVEUR5 = 50;

	/**
	 * The feature id for the '<em><b>Roleconnecteurs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_SERVEUR5__ROLECONNECTEURS = ProjecttArchitecturalPackage.GLUE__ROLECONNECTEURS;

	/**
	 * The feature id for the '<em><b>Rolefournis database connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_SERVEUR5__ROLEFOURNIS_DATABASE_CONNECTION = ProjecttArchitecturalPackage.GLUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolerequis database connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_SERVEUR5__ROLEREQUIS_DATABASE_CONNECTION = ProjecttArchitecturalPackage.GLUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Glue Serveur5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_SERVEUR5_FEATURE_COUNT = ProjecttArchitecturalPackage.GLUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Glue Serveur5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_SERVEUR5_OPERATION_COUNT = ProjecttArchitecturalPackage.GLUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.FonctionServeur.impl.GlueServeur6Impl <em>Glue Serveur6</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.FonctionServeur.impl.GlueServeur6Impl
	 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getGlueServeur6()
	 * @generated
	 */
	int GLUE_SERVEUR6 = 51;

	/**
	 * The feature id for the '<em><b>Roleconnecteurs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_SERVEUR6__ROLECONNECTEURS = ProjecttArchitecturalPackage.GLUE__ROLECONNECTEURS;

	/**
	 * The feature id for the '<em><b>Rolefournis database security</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_SERVEUR6__ROLEFOURNIS_DATABASE_SECURITY = ProjecttArchitecturalPackage.GLUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rolerequis database security</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_SERVEUR6__ROLEREQUIS_DATABASE_SECURITY = ProjecttArchitecturalPackage.GLUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Glue Serveur6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_SERVEUR6_FEATURE_COUNT = ProjecttArchitecturalPackage.GLUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Glue Serveur6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_SERVEUR6_OPERATION_COUNT = ProjecttArchitecturalPackage.GLUE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.ConnectionManager <em>Connection Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Manager</em>'.
	 * @see systeme.FonctionServeur.ConnectionManager
	 * @generated
	 */
	EClass getConnectionManager();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.ConnectionManager#getInterfaceconnectionmanager <em>Interfaceconnectionmanager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interfaceconnectionmanager</em>'.
	 * @see systeme.FonctionServeur.ConnectionManager#getInterfaceconnectionmanager()
	 * @see #getConnectionManager()
	 * @generated
	 */
	EReference getConnectionManager_Interfaceconnectionmanager();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.SecurityManager <em>Security Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Manager</em>'.
	 * @see systeme.FonctionServeur.SecurityManager
	 * @generated
	 */
	EClass getSecurityManager();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.SecurityManager#getInterfacesecuritymanager <em>Interfacesecuritymanager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interfacesecuritymanager</em>'.
	 * @see systeme.FonctionServeur.SecurityManager#getInterfacesecuritymanager()
	 * @see #getSecurityManager()
	 * @generated
	 */
	EReference getSecurityManager_Interfacesecuritymanager();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see systeme.FonctionServeur.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.Database#getInterfacedatabase <em>Interfacedatabase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interfacedatabase</em>'.
	 * @see systeme.FonctionServeur.Database#getInterfacedatabase()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_Interfacedatabase();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.InterfaceConnectionManager <em>Interface Connection Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Connection Manager</em>'.
	 * @see systeme.FonctionServeur.InterfaceConnectionManager
	 * @generated
	 */
	EClass getInterfaceConnectionManager();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.InterfaceConnectionManager#getPortrequisconfigcs <em>Portrequisconfigcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portrequisconfigcs</em>'.
	 * @see systeme.FonctionServeur.InterfaceConnectionManager#getPortrequisconfigcs()
	 * @see #getInterfaceConnectionManager()
	 * @generated
	 */
	EReference getInterfaceConnectionManager_Portrequisconfigcs();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.InterfaceConnectionManager#getPortfourniscs <em>Portfourniscs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portfourniscs</em>'.
	 * @see systeme.FonctionServeur.InterfaceConnectionManager#getPortfourniscs()
	 * @see #getInterfaceConnectionManager()
	 * @generated
	 */
	EReference getInterfaceConnectionManager_Portfourniscs();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.InterfaceConnectionManager#getPortfournis_connectionmanager_database <em>Portfournis connectionmanager database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portfournis connectionmanager database</em>'.
	 * @see systeme.FonctionServeur.InterfaceConnectionManager#getPortfournis_connectionmanager_database()
	 * @see #getInterfaceConnectionManager()
	 * @generated
	 */
	EReference getInterfaceConnectionManager_Portfournis_connectionmanager_database();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.InterfaceConnectionManager#getPortrequis_connectionmanager_database <em>Portrequis connectionmanager database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portrequis connectionmanager database</em>'.
	 * @see systeme.FonctionServeur.InterfaceConnectionManager#getPortrequis_connectionmanager_database()
	 * @see #getInterfaceConnectionManager()
	 * @generated
	 */
	EReference getInterfaceConnectionManager_Portrequis_connectionmanager_database();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.InterfaceConnectionManager#getPortfournis_connectionmanager_security <em>Portfournis connectionmanager security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portfournis connectionmanager security</em>'.
	 * @see systeme.FonctionServeur.InterfaceConnectionManager#getPortfournis_connectionmanager_security()
	 * @see #getInterfaceConnectionManager()
	 * @generated
	 */
	EReference getInterfaceConnectionManager_Portfournis_connectionmanager_security();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.InterfaceConnectionManager#getPortrequis_connectionmanager_security <em>Portrequis connectionmanager security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portrequis connectionmanager security</em>'.
	 * @see systeme.FonctionServeur.InterfaceConnectionManager#getPortrequis_connectionmanager_security()
	 * @see #getInterfaceConnectionManager()
	 * @generated
	 */
	EReference getInterfaceConnectionManager_Portrequis_connectionmanager_security();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.interfaceSecurityManager <em>interface Security Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>interface Security Manager</em>'.
	 * @see systeme.FonctionServeur.interfaceSecurityManager
	 * @generated
	 */
	EClass getinterfaceSecurityManager();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.interfaceSecurityManager#getPortfournis_security_connection <em>Portfournis security connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portfournis security connection</em>'.
	 * @see systeme.FonctionServeur.interfaceSecurityManager#getPortfournis_security_connection()
	 * @see #getinterfaceSecurityManager()
	 * @generated
	 */
	EReference getinterfaceSecurityManager_Portfournis_security_connection();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.interfaceSecurityManager#getPortrequis_security_connection <em>Portrequis security connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portrequis security connection</em>'.
	 * @see systeme.FonctionServeur.interfaceSecurityManager#getPortrequis_security_connection()
	 * @see #getinterfaceSecurityManager()
	 * @generated
	 */
	EReference getinterfaceSecurityManager_Portrequis_security_connection();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.interfaceSecurityManager#getPortfournis_security_database <em>Portfournis security database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portfournis security database</em>'.
	 * @see systeme.FonctionServeur.interfaceSecurityManager#getPortfournis_security_database()
	 * @see #getinterfaceSecurityManager()
	 * @generated
	 */
	EReference getinterfaceSecurityManager_Portfournis_security_database();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.interfaceSecurityManager#getPortrequis_security_database <em>Portrequis security database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portrequis security database</em>'.
	 * @see systeme.FonctionServeur.interfaceSecurityManager#getPortrequis_security_database()
	 * @see #getinterfaceSecurityManager()
	 * @generated
	 */
	EReference getinterfaceSecurityManager_Portrequis_security_database();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.InterfaceDatabase <em>Interface Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Database</em>'.
	 * @see systeme.FonctionServeur.InterfaceDatabase
	 * @generated
	 */
	EClass getInterfaceDatabase();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.InterfaceDatabase#getPortfournis_database_connection <em>Portfournis database connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portfournis database connection</em>'.
	 * @see systeme.FonctionServeur.InterfaceDatabase#getPortfournis_database_connection()
	 * @see #getInterfaceDatabase()
	 * @generated
	 */
	EReference getInterfaceDatabase_Portfournis_database_connection();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.InterfaceDatabase#getPortrequis_database_connection <em>Portrequis database connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portrequis database connection</em>'.
	 * @see systeme.FonctionServeur.InterfaceDatabase#getPortrequis_database_connection()
	 * @see #getInterfaceDatabase()
	 * @generated
	 */
	EReference getInterfaceDatabase_Portrequis_database_connection();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.InterfaceDatabase#getPortfournis_database_security <em>Portfournis database security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portfournis database security</em>'.
	 * @see systeme.FonctionServeur.InterfaceDatabase#getPortfournis_database_security()
	 * @see #getInterfaceDatabase()
	 * @generated
	 */
	EReference getInterfaceDatabase_Portfournis_database_security();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.InterfaceDatabase#getPortrequis_database_security <em>Portrequis database security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portrequis database security</em>'.
	 * @see systeme.FonctionServeur.InterfaceDatabase#getPortrequis_database_security()
	 * @see #getInterfaceDatabase()
	 * @generated
	 */
	EReference getInterfaceDatabase_Portrequis_database_security();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.PortFournis_ConnectionManager_Database <em>Port Fournis Connection Manager Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Fournis Connection Manager Database</em>'.
	 * @see systeme.FonctionServeur.PortFournis_ConnectionManager_Database
	 * @generated
	 */
	EClass getPortFournis_ConnectionManager_Database();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.PortRequis_ConnectionManager_Database <em>Port Requis Connection Manager Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Requis Connection Manager Database</em>'.
	 * @see systeme.FonctionServeur.PortRequis_ConnectionManager_Database
	 * @generated
	 */
	EClass getPortRequis_ConnectionManager_Database();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.PortFournis_ConnectionManager_Security <em>Port Fournis Connection Manager Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Fournis Connection Manager Security</em>'.
	 * @see systeme.FonctionServeur.PortFournis_ConnectionManager_Security
	 * @generated
	 */
	EClass getPortFournis_ConnectionManager_Security();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.PortRequis_ConnectionManager_Security <em>Port Requis Connection Manager Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Requis Connection Manager Security</em>'.
	 * @see systeme.FonctionServeur.PortRequis_ConnectionManager_Security
	 * @generated
	 */
	EClass getPortRequis_ConnectionManager_Security();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.PortFournis_Security_Connection <em>Port Fournis Security Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Fournis Security Connection</em>'.
	 * @see systeme.FonctionServeur.PortFournis_Security_Connection
	 * @generated
	 */
	EClass getPortFournis_Security_Connection();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.PortRequis_Security_Connection <em>Port Requis Security Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Requis Security Connection</em>'.
	 * @see systeme.FonctionServeur.PortRequis_Security_Connection
	 * @generated
	 */
	EClass getPortRequis_Security_Connection();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.PortFournis_Security_Database <em>Port Fournis Security Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Fournis Security Database</em>'.
	 * @see systeme.FonctionServeur.PortFournis_Security_Database
	 * @generated
	 */
	EClass getPortFournis_Security_Database();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.PortRequis_Security_Database <em>Port Requis Security Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Requis Security Database</em>'.
	 * @see systeme.FonctionServeur.PortRequis_Security_Database
	 * @generated
	 */
	EClass getPortRequis_Security_Database();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.PortFournis_database_Connection <em>Port Fournis database Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Fournis database Connection</em>'.
	 * @see systeme.FonctionServeur.PortFournis_database_Connection
	 * @generated
	 */
	EClass getPortFournis_database_Connection();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.PortRequis_database_Connection <em>Port Requis database Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Requis database Connection</em>'.
	 * @see systeme.FonctionServeur.PortRequis_database_Connection
	 * @generated
	 */
	EClass getPortRequis_database_Connection();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.PortFournis_database_Security <em>Port Fournis database Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Fournis database Security</em>'.
	 * @see systeme.FonctionServeur.PortFournis_database_Security
	 * @generated
	 */
	EClass getPortFournis_database_Security();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.PortRequis_database_Security <em>Port Requis database Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Requis database Security</em>'.
	 * @see systeme.FonctionServeur.PortRequis_database_Security
	 * @generated
	 */
	EClass getPortRequis_database_Security();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.attachment_connectionM_Fournis_role_database_Requis <em>attachment connection MFournis role database Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>attachment connection MFournis role database Requis</em>'.
	 * @see systeme.FonctionServeur.attachment_connectionM_Fournis_role_database_Requis
	 * @generated
	 */
	EClass getattachment_connectionM_Fournis_role_database_Requis();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.attachment_connectionM_Fournis_role_database_Requis#getPortfournis_connectionmanager_database <em>Portfournis connectionmanager database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portfournis connectionmanager database</em>'.
	 * @see systeme.FonctionServeur.attachment_connectionM_Fournis_role_database_Requis#getPortfournis_connectionmanager_database()
	 * @see #getattachment_connectionM_Fournis_role_database_Requis()
	 * @generated
	 */
	EReference getattachment_connectionM_Fournis_role_database_Requis_Portfournis_connectionmanager_database();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.attachment_connectionM_Fournis_role_database_Requis#getRolerequis_database_connection <em>Rolerequis database connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolerequis database connection</em>'.
	 * @see systeme.FonctionServeur.attachment_connectionM_Fournis_role_database_Requis#getRolerequis_database_connection()
	 * @see #getattachment_connectionM_Fournis_role_database_Requis()
	 * @generated
	 */
	EReference getattachment_connectionM_Fournis_role_database_Requis_Rolerequis_database_connection();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.attachment_connectionM_Requis_role_security_fournis <em>attachment connection MRequis role security fournis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>attachment connection MRequis role security fournis</em>'.
	 * @see systeme.FonctionServeur.attachment_connectionM_Requis_role_security_fournis
	 * @generated
	 */
	EClass getattachment_connectionM_Requis_role_security_fournis();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.attachment_connectionM_Requis_role_security_fournis#getPortrequis_connectionmanager_security <em>Portrequis connectionmanager security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portrequis connectionmanager security</em>'.
	 * @see systeme.FonctionServeur.attachment_connectionM_Requis_role_security_fournis#getPortrequis_connectionmanager_security()
	 * @see #getattachment_connectionM_Requis_role_security_fournis()
	 * @generated
	 */
	EReference getattachment_connectionM_Requis_role_security_fournis_Portrequis_connectionmanager_security();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.attachment_connectionM_Requis_role_security_fournis#getRolefournis_security_connection <em>Rolefournis security connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolefournis security connection</em>'.
	 * @see systeme.FonctionServeur.attachment_connectionM_Requis_role_security_fournis#getRolefournis_security_connection()
	 * @see #getattachment_connectionM_Requis_role_security_fournis()
	 * @generated
	 */
	EReference getattachment_connectionM_Requis_role_security_fournis_Rolefournis_security_connection();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.attachment_connectionM_Fournis_role_security_Requis <em>attachment connection MFournis role security Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>attachment connection MFournis role security Requis</em>'.
	 * @see systeme.FonctionServeur.attachment_connectionM_Fournis_role_security_Requis
	 * @generated
	 */
	EClass getattachment_connectionM_Fournis_role_security_Requis();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.attachment_connectionM_Fournis_role_security_Requis#getPortfournis_connectionmanager_security <em>Portfournis connectionmanager security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portfournis connectionmanager security</em>'.
	 * @see systeme.FonctionServeur.attachment_connectionM_Fournis_role_security_Requis#getPortfournis_connectionmanager_security()
	 * @see #getattachment_connectionM_Fournis_role_security_Requis()
	 * @generated
	 */
	EReference getattachment_connectionM_Fournis_role_security_Requis_Portfournis_connectionmanager_security();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.attachment_connectionM_Fournis_role_security_Requis#getRolerequis_security_connection <em>Rolerequis security connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolerequis security connection</em>'.
	 * @see systeme.FonctionServeur.attachment_connectionM_Fournis_role_security_Requis#getRolerequis_security_connection()
	 * @see #getattachment_connectionM_Fournis_role_security_Requis()
	 * @generated
	 */
	EReference getattachment_connectionM_Fournis_role_security_Requis_Rolerequis_security_connection();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.attachment_connectionM_Requis_role_database_fournis <em>attachment connection MRequis role database fournis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>attachment connection MRequis role database fournis</em>'.
	 * @see systeme.FonctionServeur.attachment_connectionM_Requis_role_database_fournis
	 * @generated
	 */
	EClass getattachment_connectionM_Requis_role_database_fournis();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.attachment_connectionM_Requis_role_database_fournis#getPortrequis_connectionmanager_database <em>Portrequis connectionmanager database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portrequis connectionmanager database</em>'.
	 * @see systeme.FonctionServeur.attachment_connectionM_Requis_role_database_fournis#getPortrequis_connectionmanager_database()
	 * @see #getattachment_connectionM_Requis_role_database_fournis()
	 * @generated
	 */
	EReference getattachment_connectionM_Requis_role_database_fournis_Portrequis_connectionmanager_database();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.attachment_connectionM_Requis_role_database_fournis#getRolefournis_database_connection <em>Rolefournis database connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolefournis database connection</em>'.
	 * @see systeme.FonctionServeur.attachment_connectionM_Requis_role_database_fournis#getRolefournis_database_connection()
	 * @see #getattachment_connectionM_Requis_role_database_fournis()
	 * @generated
	 */
	EReference getattachment_connectionM_Requis_role_database_fournis_Rolefournis_database_connection();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.attachment_Security_Requis_role_Connection_fournis <em>attachment Security Requis role Connection fournis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>attachment Security Requis role Connection fournis</em>'.
	 * @see systeme.FonctionServeur.attachment_Security_Requis_role_Connection_fournis
	 * @generated
	 */
	EClass getattachment_Security_Requis_role_Connection_fournis();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.attachment_Security_Requis_role_Connection_fournis#getPortrequis_security_connection <em>Portrequis security connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portrequis security connection</em>'.
	 * @see systeme.FonctionServeur.attachment_Security_Requis_role_Connection_fournis#getPortrequis_security_connection()
	 * @see #getattachment_Security_Requis_role_Connection_fournis()
	 * @generated
	 */
	EReference getattachment_Security_Requis_role_Connection_fournis_Portrequis_security_connection();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.attachment_Security_Requis_role_Connection_fournis#getRolefournis_connectionmanager_security <em>Rolefournis connectionmanager security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolefournis connectionmanager security</em>'.
	 * @see systeme.FonctionServeur.attachment_Security_Requis_role_Connection_fournis#getRolefournis_connectionmanager_security()
	 * @see #getattachment_Security_Requis_role_Connection_fournis()
	 * @generated
	 */
	EReference getattachment_Security_Requis_role_Connection_fournis_Rolefournis_connectionmanager_security();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.attachment_Security_Fournis_role_Connection_Requis <em>attachment Security Fournis role Connection Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>attachment Security Fournis role Connection Requis</em>'.
	 * @see systeme.FonctionServeur.attachment_Security_Fournis_role_Connection_Requis
	 * @generated
	 */
	EClass getattachment_Security_Fournis_role_Connection_Requis();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.attachment_Security_Fournis_role_Connection_Requis#getPortfournis_security_connection <em>Portfournis security connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portfournis security connection</em>'.
	 * @see systeme.FonctionServeur.attachment_Security_Fournis_role_Connection_Requis#getPortfournis_security_connection()
	 * @see #getattachment_Security_Fournis_role_Connection_Requis()
	 * @generated
	 */
	EReference getattachment_Security_Fournis_role_Connection_Requis_Portfournis_security_connection();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.attachment_Security_Fournis_role_Connection_Requis#getRolerequis_connectionmanager_security <em>Rolerequis connectionmanager security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolerequis connectionmanager security</em>'.
	 * @see systeme.FonctionServeur.attachment_Security_Fournis_role_Connection_Requis#getRolerequis_connectionmanager_security()
	 * @see #getattachment_Security_Fournis_role_Connection_Requis()
	 * @generated
	 */
	EReference getattachment_Security_Fournis_role_Connection_Requis_Rolerequis_connectionmanager_security();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.attachment_Security_Requis_role_Database_fournis <em>attachment Security Requis role Database fournis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>attachment Security Requis role Database fournis</em>'.
	 * @see systeme.FonctionServeur.attachment_Security_Requis_role_Database_fournis
	 * @generated
	 */
	EClass getattachment_Security_Requis_role_Database_fournis();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.attachment_Security_Requis_role_Database_fournis#getPortrequis_security_database <em>Portrequis security database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portrequis security database</em>'.
	 * @see systeme.FonctionServeur.attachment_Security_Requis_role_Database_fournis#getPortrequis_security_database()
	 * @see #getattachment_Security_Requis_role_Database_fournis()
	 * @generated
	 */
	EReference getattachment_Security_Requis_role_Database_fournis_Portrequis_security_database();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.attachment_Security_Requis_role_Database_fournis#getRolefournis_database_security <em>Rolefournis database security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolefournis database security</em>'.
	 * @see systeme.FonctionServeur.attachment_Security_Requis_role_Database_fournis#getRolefournis_database_security()
	 * @see #getattachment_Security_Requis_role_Database_fournis()
	 * @generated
	 */
	EReference getattachment_Security_Requis_role_Database_fournis_Rolefournis_database_security();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.attachment_Security_Fournis_role_Database_Requis <em>attachment Security Fournis role Database Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>attachment Security Fournis role Database Requis</em>'.
	 * @see systeme.FonctionServeur.attachment_Security_Fournis_role_Database_Requis
	 * @generated
	 */
	EClass getattachment_Security_Fournis_role_Database_Requis();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.attachment_Security_Fournis_role_Database_Requis#getRolerequis_database_security <em>Rolerequis database security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolerequis database security</em>'.
	 * @see systeme.FonctionServeur.attachment_Security_Fournis_role_Database_Requis#getRolerequis_database_security()
	 * @see #getattachment_Security_Fournis_role_Database_Requis()
	 * @generated
	 */
	EReference getattachment_Security_Fournis_role_Database_Requis_Rolerequis_database_security();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.attachment_Security_Fournis_role_Database_Requis#getPortfournis_security_database <em>Portfournis security database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portfournis security database</em>'.
	 * @see systeme.FonctionServeur.attachment_Security_Fournis_role_Database_Requis#getPortfournis_security_database()
	 * @see #getattachment_Security_Fournis_role_Database_Requis()
	 * @generated
	 */
	EReference getattachment_Security_Fournis_role_Database_Requis_Portfournis_security_database();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.attachment_Database_Requis_role_connection_fournis <em>attachment Database Requis role connection fournis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>attachment Database Requis role connection fournis</em>'.
	 * @see systeme.FonctionServeur.attachment_Database_Requis_role_connection_fournis
	 * @generated
	 */
	EClass getattachment_Database_Requis_role_connection_fournis();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.attachment_Database_Requis_role_connection_fournis#getPortrequis_database_connection <em>Portrequis database connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portrequis database connection</em>'.
	 * @see systeme.FonctionServeur.attachment_Database_Requis_role_connection_fournis#getPortrequis_database_connection()
	 * @see #getattachment_Database_Requis_role_connection_fournis()
	 * @generated
	 */
	EReference getattachment_Database_Requis_role_connection_fournis_Portrequis_database_connection();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.attachment_Database_Requis_role_connection_fournis#getRolefournis_connectionmanager_database <em>Rolefournis connectionmanager database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolefournis connectionmanager database</em>'.
	 * @see systeme.FonctionServeur.attachment_Database_Requis_role_connection_fournis#getRolefournis_connectionmanager_database()
	 * @see #getattachment_Database_Requis_role_connection_fournis()
	 * @generated
	 */
	EReference getattachment_Database_Requis_role_connection_fournis_Rolefournis_connectionmanager_database();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.attachment_Database_Fournis_role_Connection_Requis <em>attachment Database Fournis role Connection Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>attachment Database Fournis role Connection Requis</em>'.
	 * @see systeme.FonctionServeur.attachment_Database_Fournis_role_Connection_Requis
	 * @generated
	 */
	EClass getattachment_Database_Fournis_role_Connection_Requis();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.attachment_Database_Fournis_role_Connection_Requis#getPortfournis_database_connection <em>Portfournis database connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portfournis database connection</em>'.
	 * @see systeme.FonctionServeur.attachment_Database_Fournis_role_Connection_Requis#getPortfournis_database_connection()
	 * @see #getattachment_Database_Fournis_role_Connection_Requis()
	 * @generated
	 */
	EReference getattachment_Database_Fournis_role_Connection_Requis_Portfournis_database_connection();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.attachment_Database_Fournis_role_Connection_Requis#getRolerequis_connectionmanager_database <em>Rolerequis connectionmanager database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolerequis connectionmanager database</em>'.
	 * @see systeme.FonctionServeur.attachment_Database_Fournis_role_Connection_Requis#getRolerequis_connectionmanager_database()
	 * @see #getattachment_Database_Fournis_role_Connection_Requis()
	 * @generated
	 */
	EReference getattachment_Database_Fournis_role_Connection_Requis_Rolerequis_connectionmanager_database();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.attachment_Database_Requis_role_Security_fournis <em>attachment Database Requis role Security fournis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>attachment Database Requis role Security fournis</em>'.
	 * @see systeme.FonctionServeur.attachment_Database_Requis_role_Security_fournis
	 * @generated
	 */
	EClass getattachment_Database_Requis_role_Security_fournis();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.attachment_Database_Requis_role_Security_fournis#getPortrequis_database_security <em>Portrequis database security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portrequis database security</em>'.
	 * @see systeme.FonctionServeur.attachment_Database_Requis_role_Security_fournis#getPortrequis_database_security()
	 * @see #getattachment_Database_Requis_role_Security_fournis()
	 * @generated
	 */
	EReference getattachment_Database_Requis_role_Security_fournis_Portrequis_database_security();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.attachment_Database_Requis_role_Security_fournis#getRolefournis_security_database <em>Rolefournis security database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolefournis security database</em>'.
	 * @see systeme.FonctionServeur.attachment_Database_Requis_role_Security_fournis#getRolefournis_security_database()
	 * @see #getattachment_Database_Requis_role_Security_fournis()
	 * @generated
	 */
	EReference getattachment_Database_Requis_role_Security_fournis_Rolefournis_security_database();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.attachment_Database_Fournis_role_Security_Requis <em>attachment Database Fournis role Security Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>attachment Database Fournis role Security Requis</em>'.
	 * @see systeme.FonctionServeur.attachment_Database_Fournis_role_Security_Requis
	 * @generated
	 */
	EClass getattachment_Database_Fournis_role_Security_Requis();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.attachment_Database_Fournis_role_Security_Requis#getPortfournis_database_security <em>Portfournis database security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Portfournis database security</em>'.
	 * @see systeme.FonctionServeur.attachment_Database_Fournis_role_Security_Requis#getPortfournis_database_security()
	 * @see #getattachment_Database_Fournis_role_Security_Requis()
	 * @generated
	 */
	EReference getattachment_Database_Fournis_role_Security_Requis_Portfournis_database_security();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.attachment_Database_Fournis_role_Security_Requis#getRolerequis_security_database <em>Rolerequis security database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolerequis security database</em>'.
	 * @see systeme.FonctionServeur.attachment_Database_Fournis_role_Security_Requis#getRolerequis_security_database()
	 * @see #getattachment_Database_Fournis_role_Security_Requis()
	 * @generated
	 */
	EReference getattachment_Database_Fournis_role_Security_Requis_Rolerequis_security_database();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.ConnecteurServeurD <em>Connecteur Serveur D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connecteur Serveur D</em>'.
	 * @see systeme.FonctionServeur.ConnecteurServeurD
	 * @generated
	 */
	EClass getConnecteurServeurD();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.ConnecteurServeurD#getGlueserveur1 <em>Glueserveur1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Glueserveur1</em>'.
	 * @see systeme.FonctionServeur.ConnecteurServeurD#getGlueserveur1()
	 * @see #getConnecteurServeurD()
	 * @generated
	 */
	EReference getConnecteurServeurD_Glueserveur1();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.ConnecteurServeurD#getGlueserveur2 <em>Glueserveur2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Glueserveur2</em>'.
	 * @see systeme.FonctionServeur.ConnecteurServeurD#getGlueserveur2()
	 * @see #getConnecteurServeurD()
	 * @generated
	 */
	EReference getConnecteurServeurD_Glueserveur2();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.ConnecteurServeurD#getGlueserveur3 <em>Glueserveur3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Glueserveur3</em>'.
	 * @see systeme.FonctionServeur.ConnecteurServeurD#getGlueserveur3()
	 * @see #getConnecteurServeurD()
	 * @generated
	 */
	EReference getConnecteurServeurD_Glueserveur3();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.ConnecteurServeurD#getGlueserveur4 <em>Glueserveur4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Glueserveur4</em>'.
	 * @see systeme.FonctionServeur.ConnecteurServeurD#getGlueserveur4()
	 * @see #getConnecteurServeurD()
	 * @generated
	 */
	EReference getConnecteurServeurD_Glueserveur4();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.ConnecteurServeurD#getGlueserveur5 <em>Glueserveur5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Glueserveur5</em>'.
	 * @see systeme.FonctionServeur.ConnecteurServeurD#getGlueserveur5()
	 * @see #getConnecteurServeurD()
	 * @generated
	 */
	EReference getConnecteurServeurD_Glueserveur5();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.ConnecteurServeurD#getGlueserveur6 <em>Glueserveur6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Glueserveur6</em>'.
	 * @see systeme.FonctionServeur.ConnecteurServeurD#getGlueserveur6()
	 * @see #getConnecteurServeurD()
	 * @generated
	 */
	EReference getConnecteurServeurD_Glueserveur6();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.ConnecteurServeurD#getRolefournis_connectionmanager_database <em>Rolefournis connectionmanager database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolefournis connectionmanager database</em>'.
	 * @see systeme.FonctionServeur.ConnecteurServeurD#getRolefournis_connectionmanager_database()
	 * @see #getConnecteurServeurD()
	 * @generated
	 */
	EReference getConnecteurServeurD_Rolefournis_connectionmanager_database();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.ConnecteurServeurD#getRolerequis_connectionmanager_database <em>Rolerequis connectionmanager database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolerequis connectionmanager database</em>'.
	 * @see systeme.FonctionServeur.ConnecteurServeurD#getRolerequis_connectionmanager_database()
	 * @see #getConnecteurServeurD()
	 * @generated
	 */
	EReference getConnecteurServeurD_Rolerequis_connectionmanager_database();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.ConnecteurServeurD#getRolefournis_connectionmanager_security <em>Rolefournis connectionmanager security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolefournis connectionmanager security</em>'.
	 * @see systeme.FonctionServeur.ConnecteurServeurD#getRolefournis_connectionmanager_security()
	 * @see #getConnecteurServeurD()
	 * @generated
	 */
	EReference getConnecteurServeurD_Rolefournis_connectionmanager_security();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.ConnecteurServeurD#getRolerequis_connectionmanager_security <em>Rolerequis connectionmanager security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolerequis connectionmanager security</em>'.
	 * @see systeme.FonctionServeur.ConnecteurServeurD#getRolerequis_connectionmanager_security()
	 * @see #getConnecteurServeurD()
	 * @generated
	 */
	EReference getConnecteurServeurD_Rolerequis_connectionmanager_security();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.ConnecteurServeurD#getRolefournis_security_connection <em>Rolefournis security connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolefournis security connection</em>'.
	 * @see systeme.FonctionServeur.ConnecteurServeurD#getRolefournis_security_connection()
	 * @see #getConnecteurServeurD()
	 * @generated
	 */
	EReference getConnecteurServeurD_Rolefournis_security_connection();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.ConnecteurServeurD#getRolerequis_security_connection <em>Rolerequis security connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolerequis security connection</em>'.
	 * @see systeme.FonctionServeur.ConnecteurServeurD#getRolerequis_security_connection()
	 * @see #getConnecteurServeurD()
	 * @generated
	 */
	EReference getConnecteurServeurD_Rolerequis_security_connection();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.ConnecteurServeurD#getRolefournis_security_database <em>Rolefournis security database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolefournis security database</em>'.
	 * @see systeme.FonctionServeur.ConnecteurServeurD#getRolefournis_security_database()
	 * @see #getConnecteurServeurD()
	 * @generated
	 */
	EReference getConnecteurServeurD_Rolefournis_security_database();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.ConnecteurServeurD#getRolerequis_security_database <em>Rolerequis security database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolerequis security database</em>'.
	 * @see systeme.FonctionServeur.ConnecteurServeurD#getRolerequis_security_database()
	 * @see #getConnecteurServeurD()
	 * @generated
	 */
	EReference getConnecteurServeurD_Rolerequis_security_database();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.ConnecteurServeurD#getRolefournis_database_connection <em>Rolefournis database connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolefournis database connection</em>'.
	 * @see systeme.FonctionServeur.ConnecteurServeurD#getRolefournis_database_connection()
	 * @see #getConnecteurServeurD()
	 * @generated
	 */
	EReference getConnecteurServeurD_Rolefournis_database_connection();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.ConnecteurServeurD#getRolerequis_database_connection <em>Rolerequis database connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolerequis database connection</em>'.
	 * @see systeme.FonctionServeur.ConnecteurServeurD#getRolerequis_database_connection()
	 * @see #getConnecteurServeurD()
	 * @generated
	 */
	EReference getConnecteurServeurD_Rolerequis_database_connection();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.ConnecteurServeurD#getRolefournis_database_security <em>Rolefournis database security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolefournis database security</em>'.
	 * @see systeme.FonctionServeur.ConnecteurServeurD#getRolefournis_database_security()
	 * @see #getConnecteurServeurD()
	 * @generated
	 */
	EReference getConnecteurServeurD_Rolefournis_database_security();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.ConnecteurServeurD#getRolerequis_database_security <em>Rolerequis database security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolerequis database security</em>'.
	 * @see systeme.FonctionServeur.ConnecteurServeurD#getRolerequis_database_security()
	 * @see #getConnecteurServeurD()
	 * @generated
	 */
	EReference getConnecteurServeurD_Rolerequis_database_security();

	/**
	 * Returns the meta object for class '{@link projecttArchitectural.Glue <em>Glue Serveur1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glue Serveur1</em>'.
	 * @see projecttArchitectural.Glue
	 * @model instanceClass="projecttArchitectural.Glue"
	 * @generated
	 */
	EClass getGlueServeur1();

	/**
	 * Returns the meta object for the reference '{@link projecttArchitectural.Glue#getRolefournis_connectionmanager_database <em>Rolefournis connectionmanager database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolefournis connectionmanager database</em>'.
	 * @see projecttArchitectural.Glue#getRolefournis_connectionmanager_database()
	 * @see #getGlueServeur1()
	 * @generated
	 */
	EReference getGlueServeur1_Rolefournis_connectionmanager_database();

	/**
	 * Returns the meta object for the reference '{@link projecttArchitectural.Glue#getRolerequis_connectionmanager_database <em>Rolerequis connectionmanager database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolerequis connectionmanager database</em>'.
	 * @see projecttArchitectural.Glue#getRolerequis_connectionmanager_database()
	 * @see #getGlueServeur1()
	 * @generated
	 */
	EReference getGlueServeur1_Rolerequis_connectionmanager_database();

	/**
	 * Returns the meta object for class '{@link projecttArchitectural.RoleConnecteursFournis <em>Role Fournis Connection Manager Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Fournis Connection Manager Database</em>'.
	 * @see projecttArchitectural.RoleConnecteursFournis
	 * @model instanceClass="projecttArchitectural.RoleConnecteursFournis"
	 * @generated
	 */
	EClass getRoleFournis_ConnectionManager_Database();

	/**
	 * Returns the meta object for class '{@link projecttArchitectural.RoleConnecteursRequis <em>Role Requis Connection Manager Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Requis Connection Manager Database</em>'.
	 * @see projecttArchitectural.RoleConnecteursRequis
	 * @model instanceClass="projecttArchitectural.RoleConnecteursRequis"
	 * @generated
	 */
	EClass getRoleRequis_ConnectionManager_Database();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.RoleFournis_ConnectionManager_Security <em>Role Fournis Connection Manager Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Fournis Connection Manager Security</em>'.
	 * @see systeme.FonctionServeur.RoleFournis_ConnectionManager_Security
	 * @generated
	 */
	EClass getRoleFournis_ConnectionManager_Security();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.RoleRequis_ConnectionManager_Security <em>Role Requis Connection Manager Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Requis Connection Manager Security</em>'.
	 * @see systeme.FonctionServeur.RoleRequis_ConnectionManager_Security
	 * @generated
	 */
	EClass getRoleRequis_ConnectionManager_Security();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.RoleFournis_Security_Connection <em>Role Fournis Security Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Fournis Security Connection</em>'.
	 * @see systeme.FonctionServeur.RoleFournis_Security_Connection
	 * @generated
	 */
	EClass getRoleFournis_Security_Connection();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.RoleRequis_Security_Connection <em>Role Requis Security Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Requis Security Connection</em>'.
	 * @see systeme.FonctionServeur.RoleRequis_Security_Connection
	 * @generated
	 */
	EClass getRoleRequis_Security_Connection();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.RoleFournis_Security_Database <em>Role Fournis Security Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Fournis Security Database</em>'.
	 * @see systeme.FonctionServeur.RoleFournis_Security_Database
	 * @generated
	 */
	EClass getRoleFournis_Security_Database();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.RoleRequis_Security_Database <em>Role Requis Security Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Requis Security Database</em>'.
	 * @see systeme.FonctionServeur.RoleRequis_Security_Database
	 * @generated
	 */
	EClass getRoleRequis_Security_Database();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.RoleFournis_Database_Connection <em>Role Fournis Database Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Fournis Database Connection</em>'.
	 * @see systeme.FonctionServeur.RoleFournis_Database_Connection
	 * @generated
	 */
	EClass getRoleFournis_Database_Connection();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.RoleRequis_Database_Connection <em>Role Requis Database Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Requis Database Connection</em>'.
	 * @see systeme.FonctionServeur.RoleRequis_Database_Connection
	 * @generated
	 */
	EClass getRoleRequis_Database_Connection();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.RoleFournis_Database_Security <em>Role Fournis Database Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Fournis Database Security</em>'.
	 * @see systeme.FonctionServeur.RoleFournis_Database_Security
	 * @generated
	 */
	EClass getRoleFournis_Database_Security();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.RoleRequis_Database_Security <em>Role Requis Database Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Requis Database Security</em>'.
	 * @see systeme.FonctionServeur.RoleRequis_Database_Security
	 * @generated
	 */
	EClass getRoleRequis_Database_Security();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.PortRequisConfigCS <em>Port Requis Config CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Requis Config CS</em>'.
	 * @see systeme.FonctionServeur.PortRequisConfigCS
	 * @generated
	 */
	EClass getPortRequisConfigCS();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.PortFournisCS <em>Port Fournis CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Fournis CS</em>'.
	 * @see systeme.FonctionServeur.PortFournisCS
	 * @generated
	 */
	EClass getPortFournisCS();

	/**
	 * Returns the meta object for class '{@link systeme.FonctionServeur.ServeurDetail <em>Serveur Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serveur Detail</em>'.
	 * @see systeme.FonctionServeur.ServeurDetail
	 * @generated
	 */
	EClass getServeurDetail();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.ServeurDetail#getConnectionmanager <em>Connectionmanager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connectionmanager</em>'.
	 * @see systeme.FonctionServeur.ServeurDetail#getConnectionmanager()
	 * @see #getServeurDetail()
	 * @generated
	 */
	EReference getServeurDetail_Connectionmanager();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.ServeurDetail#getSecuritymanager <em>Securitymanager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Securitymanager</em>'.
	 * @see systeme.FonctionServeur.ServeurDetail#getSecuritymanager()
	 * @see #getServeurDetail()
	 * @generated
	 */
	EReference getServeurDetail_Securitymanager();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.ServeurDetail#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Database</em>'.
	 * @see systeme.FonctionServeur.ServeurDetail#getDatabase()
	 * @see #getServeurDetail()
	 * @generated
	 */
	EReference getServeurDetail_Database();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.ServeurDetail#getConnecteurserveurd <em>Connecteurserveurd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connecteurserveurd</em>'.
	 * @see systeme.FonctionServeur.ServeurDetail#getConnecteurserveurd()
	 * @see #getServeurDetail()
	 * @generated
	 */
	EReference getServeurDetail_Connecteurserveurd();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.ServeurDetail#getAttachment_connectionm_fournis_role_database_requis <em>Attachment connectionm fournis role database requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment connectionm fournis role database requis</em>'.
	 * @see systeme.FonctionServeur.ServeurDetail#getAttachment_connectionm_fournis_role_database_requis()
	 * @see #getServeurDetail()
	 * @generated
	 */
	EReference getServeurDetail_Attachment_connectionm_fournis_role_database_requis();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.ServeurDetail#getAttachment_connectionm_requis_role_database_fournis <em>Attachment connectionm requis role database fournis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment connectionm requis role database fournis</em>'.
	 * @see systeme.FonctionServeur.ServeurDetail#getAttachment_connectionm_requis_role_database_fournis()
	 * @see #getServeurDetail()
	 * @generated
	 */
	EReference getServeurDetail_Attachment_connectionm_requis_role_database_fournis();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.ServeurDetail#getAttachment_connectionm_requis_role_security_fournis <em>Attachment connectionm requis role security fournis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment connectionm requis role security fournis</em>'.
	 * @see systeme.FonctionServeur.ServeurDetail#getAttachment_connectionm_requis_role_security_fournis()
	 * @see #getServeurDetail()
	 * @generated
	 */
	EReference getServeurDetail_Attachment_connectionm_requis_role_security_fournis();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.ServeurDetail#getAttachment_connectionm_fournis_role_security_requis <em>Attachment connectionm fournis role security requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment connectionm fournis role security requis</em>'.
	 * @see systeme.FonctionServeur.ServeurDetail#getAttachment_connectionm_fournis_role_security_requis()
	 * @see #getServeurDetail()
	 * @generated
	 */
	EReference getServeurDetail_Attachment_connectionm_fournis_role_security_requis();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.ServeurDetail#getAttachment_security_requis_role_connection_fournis <em>Attachment security requis role connection fournis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment security requis role connection fournis</em>'.
	 * @see systeme.FonctionServeur.ServeurDetail#getAttachment_security_requis_role_connection_fournis()
	 * @see #getServeurDetail()
	 * @generated
	 */
	EReference getServeurDetail_Attachment_security_requis_role_connection_fournis();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.ServeurDetail#getAttachment_security_fournis_role_connection_requis <em>Attachment security fournis role connection requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment security fournis role connection requis</em>'.
	 * @see systeme.FonctionServeur.ServeurDetail#getAttachment_security_fournis_role_connection_requis()
	 * @see #getServeurDetail()
	 * @generated
	 */
	EReference getServeurDetail_Attachment_security_fournis_role_connection_requis();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.ServeurDetail#getAttachment_security_requis_role_database_fournis <em>Attachment security requis role database fournis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment security requis role database fournis</em>'.
	 * @see systeme.FonctionServeur.ServeurDetail#getAttachment_security_requis_role_database_fournis()
	 * @see #getServeurDetail()
	 * @generated
	 */
	EReference getServeurDetail_Attachment_security_requis_role_database_fournis();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.ServeurDetail#getAttachment_security_fournis_role_database_requis <em>Attachment security fournis role database requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment security fournis role database requis</em>'.
	 * @see systeme.FonctionServeur.ServeurDetail#getAttachment_security_fournis_role_database_requis()
	 * @see #getServeurDetail()
	 * @generated
	 */
	EReference getServeurDetail_Attachment_security_fournis_role_database_requis();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.ServeurDetail#getAttachment_database_requis_role_connection_fournis <em>Attachment database requis role connection fournis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment database requis role connection fournis</em>'.
	 * @see systeme.FonctionServeur.ServeurDetail#getAttachment_database_requis_role_connection_fournis()
	 * @see #getServeurDetail()
	 * @generated
	 */
	EReference getServeurDetail_Attachment_database_requis_role_connection_fournis();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.ServeurDetail#getAttachment_database_fournis_role_connection_requis <em>Attachment database fournis role connection requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment database fournis role connection requis</em>'.
	 * @see systeme.FonctionServeur.ServeurDetail#getAttachment_database_fournis_role_connection_requis()
	 * @see #getServeurDetail()
	 * @generated
	 */
	EReference getServeurDetail_Attachment_database_fournis_role_connection_requis();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.ServeurDetail#getAttachment_database_requis_role_security_fournis <em>Attachment database requis role security fournis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment database requis role security fournis</em>'.
	 * @see systeme.FonctionServeur.ServeurDetail#getAttachment_database_requis_role_security_fournis()
	 * @see #getServeurDetail()
	 * @generated
	 */
	EReference getServeurDetail_Attachment_database_requis_role_security_fournis();

	/**
	 * Returns the meta object for the reference '{@link systeme.FonctionServeur.ServeurDetail#getAttachment_database_fournis_role_security_requis <em>Attachment database fournis role security requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment database fournis role security requis</em>'.
	 * @see systeme.FonctionServeur.ServeurDetail#getAttachment_database_fournis_role_security_requis()
	 * @see #getServeurDetail()
	 * @generated
	 */
	EReference getServeurDetail_Attachment_database_fournis_role_security_requis();

	/**
	 * Returns the meta object for class '{@link projecttArchitectural.Glue <em>Glue Serveur2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glue Serveur2</em>'.
	 * @see projecttArchitectural.Glue
	 * @model instanceClass="projecttArchitectural.Glue"
	 * @generated
	 */
	EClass getGlueServeur2();

	/**
	 * Returns the meta object for the reference '{@link projecttArchitectural.Glue#getRolefournis_connectionmanager_security <em>Rolefournis connectionmanager security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolefournis connectionmanager security</em>'.
	 * @see projecttArchitectural.Glue#getRolefournis_connectionmanager_security()
	 * @see #getGlueServeur2()
	 * @generated
	 */
	EReference getGlueServeur2_Rolefournis_connectionmanager_security();

	/**
	 * Returns the meta object for the reference '{@link projecttArchitectural.Glue#getRolerequis_connectionmanager_security <em>Rolerequis connectionmanager security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolerequis connectionmanager security</em>'.
	 * @see projecttArchitectural.Glue#getRolerequis_connectionmanager_security()
	 * @see #getGlueServeur2()
	 * @generated
	 */
	EReference getGlueServeur2_Rolerequis_connectionmanager_security();

	/**
	 * Returns the meta object for class '{@link projecttArchitectural.Glue <em>Glue Serveur3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glue Serveur3</em>'.
	 * @see projecttArchitectural.Glue
	 * @model instanceClass="projecttArchitectural.Glue"
	 * @generated
	 */
	EClass getGlueServeur3();

	/**
	 * Returns the meta object for the reference '{@link projecttArchitectural.Glue#getRolefournis_security_connection <em>Rolefournis security connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolefournis security connection</em>'.
	 * @see projecttArchitectural.Glue#getRolefournis_security_connection()
	 * @see #getGlueServeur3()
	 * @generated
	 */
	EReference getGlueServeur3_Rolefournis_security_connection();

	/**
	 * Returns the meta object for the reference '{@link projecttArchitectural.Glue#getRolerequis_security_connection <em>Rolerequis security connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolerequis security connection</em>'.
	 * @see projecttArchitectural.Glue#getRolerequis_security_connection()
	 * @see #getGlueServeur3()
	 * @generated
	 */
	EReference getGlueServeur3_Rolerequis_security_connection();

	/**
	 * Returns the meta object for class '{@link projecttArchitectural.Glue <em>Glue Serveur4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glue Serveur4</em>'.
	 * @see projecttArchitectural.Glue
	 * @model instanceClass="projecttArchitectural.Glue"
	 * @generated
	 */
	EClass getGlueServeur4();

	/**
	 * Returns the meta object for the reference '{@link projecttArchitectural.Glue#getRolefournis_security_database <em>Rolefournis security database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolefournis security database</em>'.
	 * @see projecttArchitectural.Glue#getRolefournis_security_database()
	 * @see #getGlueServeur4()
	 * @generated
	 */
	EReference getGlueServeur4_Rolefournis_security_database();

	/**
	 * Returns the meta object for the reference '{@link projecttArchitectural.Glue#getRolerequis_security_database <em>Rolerequis security database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolerequis security database</em>'.
	 * @see projecttArchitectural.Glue#getRolerequis_security_database()
	 * @see #getGlueServeur4()
	 * @generated
	 */
	EReference getGlueServeur4_Rolerequis_security_database();

	/**
	 * Returns the meta object for class '{@link projecttArchitectural.Glue <em>Glue Serveur5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glue Serveur5</em>'.
	 * @see projecttArchitectural.Glue
	 * @model instanceClass="projecttArchitectural.Glue"
	 * @generated
	 */
	EClass getGlueServeur5();

	/**
	 * Returns the meta object for the reference '{@link projecttArchitectural.Glue#getRolefournis_database_connection <em>Rolefournis database connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolefournis database connection</em>'.
	 * @see projecttArchitectural.Glue#getRolefournis_database_connection()
	 * @see #getGlueServeur5()
	 * @generated
	 */
	EReference getGlueServeur5_Rolefournis_database_connection();

	/**
	 * Returns the meta object for the reference '{@link projecttArchitectural.Glue#getRolerequis_database_connection <em>Rolerequis database connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolerequis database connection</em>'.
	 * @see projecttArchitectural.Glue#getRolerequis_database_connection()
	 * @see #getGlueServeur5()
	 * @generated
	 */
	EReference getGlueServeur5_Rolerequis_database_connection();

	/**
	 * Returns the meta object for class '{@link projecttArchitectural.Glue <em>Glue Serveur6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glue Serveur6</em>'.
	 * @see projecttArchitectural.Glue
	 * @model instanceClass="projecttArchitectural.Glue"
	 * @generated
	 */
	EClass getGlueServeur6();

	/**
	 * Returns the meta object for the reference '{@link projecttArchitectural.Glue#getRolefournis_database_security <em>Rolefournis database security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolefournis database security</em>'.
	 * @see projecttArchitectural.Glue#getRolefournis_database_security()
	 * @see #getGlueServeur6()
	 * @generated
	 */
	EReference getGlueServeur6_Rolefournis_database_security();

	/**
	 * Returns the meta object for the reference '{@link projecttArchitectural.Glue#getRolerequis_database_security <em>Rolerequis database security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rolerequis database security</em>'.
	 * @see projecttArchitectural.Glue#getRolerequis_database_security()
	 * @see #getGlueServeur6()
	 * @generated
	 */
	EReference getGlueServeur6_Rolerequis_database_security();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FonctionServeurFactory getFonctionServeurFactory();

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
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.ConnectionManagerImpl <em>Connection Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.ConnectionManagerImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getConnectionManager()
		 * @generated
		 */
		EClass CONNECTION_MANAGER = eINSTANCE.getConnectionManager();

		/**
		 * The meta object literal for the '<em><b>Interfaceconnectionmanager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_MANAGER__INTERFACECONNECTIONMANAGER = eINSTANCE.getConnectionManager_Interfaceconnectionmanager();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.SecurityManagerImpl <em>Security Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.SecurityManagerImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getSecurityManager()
		 * @generated
		 */
		EClass SECURITY_MANAGER = eINSTANCE.getSecurityManager();

		/**
		 * The meta object literal for the '<em><b>Interfacesecuritymanager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MANAGER__INTERFACESECURITYMANAGER = eINSTANCE.getSecurityManager_Interfacesecuritymanager();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.DatabaseImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '<em><b>Interfacedatabase</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__INTERFACEDATABASE = eINSTANCE.getDatabase_Interfacedatabase();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.InterfaceConnectionManagerImpl <em>Interface Connection Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.InterfaceConnectionManagerImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getInterfaceConnectionManager()
		 * @generated
		 */
		EClass INTERFACE_CONNECTION_MANAGER = eINSTANCE.getInterfaceConnectionManager();

		/**
		 * The meta object literal for the '<em><b>Portrequisconfigcs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CONNECTION_MANAGER__PORTREQUISCONFIGCS = eINSTANCE.getInterfaceConnectionManager_Portrequisconfigcs();

		/**
		 * The meta object literal for the '<em><b>Portfourniscs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CONNECTION_MANAGER__PORTFOURNISCS = eINSTANCE.getInterfaceConnectionManager_Portfourniscs();

		/**
		 * The meta object literal for the '<em><b>Portfournis connectionmanager database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CONNECTION_MANAGER__PORTFOURNIS_CONNECTIONMANAGER_DATABASE = eINSTANCE.getInterfaceConnectionManager_Portfournis_connectionmanager_database();

		/**
		 * The meta object literal for the '<em><b>Portrequis connectionmanager database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CONNECTION_MANAGER__PORTREQUIS_CONNECTIONMANAGER_DATABASE = eINSTANCE.getInterfaceConnectionManager_Portrequis_connectionmanager_database();

		/**
		 * The meta object literal for the '<em><b>Portfournis connectionmanager security</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CONNECTION_MANAGER__PORTFOURNIS_CONNECTIONMANAGER_SECURITY = eINSTANCE.getInterfaceConnectionManager_Portfournis_connectionmanager_security();

		/**
		 * The meta object literal for the '<em><b>Portrequis connectionmanager security</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CONNECTION_MANAGER__PORTREQUIS_CONNECTIONMANAGER_SECURITY = eINSTANCE.getInterfaceConnectionManager_Portrequis_connectionmanager_security();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.interfaceSecurityManagerImpl <em>interface Security Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.interfaceSecurityManagerImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getinterfaceSecurityManager()
		 * @generated
		 */
		EClass INTERFACE_SECURITY_MANAGER = eINSTANCE.getinterfaceSecurityManager();

		/**
		 * The meta object literal for the '<em><b>Portfournis security connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_SECURITY_MANAGER__PORTFOURNIS_SECURITY_CONNECTION = eINSTANCE.getinterfaceSecurityManager_Portfournis_security_connection();

		/**
		 * The meta object literal for the '<em><b>Portrequis security connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_SECURITY_MANAGER__PORTREQUIS_SECURITY_CONNECTION = eINSTANCE.getinterfaceSecurityManager_Portrequis_security_connection();

		/**
		 * The meta object literal for the '<em><b>Portfournis security database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_SECURITY_MANAGER__PORTFOURNIS_SECURITY_DATABASE = eINSTANCE.getinterfaceSecurityManager_Portfournis_security_database();

		/**
		 * The meta object literal for the '<em><b>Portrequis security database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_SECURITY_MANAGER__PORTREQUIS_SECURITY_DATABASE = eINSTANCE.getinterfaceSecurityManager_Portrequis_security_database();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.InterfaceDatabaseImpl <em>Interface Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.InterfaceDatabaseImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getInterfaceDatabase()
		 * @generated
		 */
		EClass INTERFACE_DATABASE = eINSTANCE.getInterfaceDatabase();

		/**
		 * The meta object literal for the '<em><b>Portfournis database connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_DATABASE__PORTFOURNIS_DATABASE_CONNECTION = eINSTANCE.getInterfaceDatabase_Portfournis_database_connection();

		/**
		 * The meta object literal for the '<em><b>Portrequis database connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_DATABASE__PORTREQUIS_DATABASE_CONNECTION = eINSTANCE.getInterfaceDatabase_Portrequis_database_connection();

		/**
		 * The meta object literal for the '<em><b>Portfournis database security</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_DATABASE__PORTFOURNIS_DATABASE_SECURITY = eINSTANCE.getInterfaceDatabase_Portfournis_database_security();

		/**
		 * The meta object literal for the '<em><b>Portrequis database security</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_DATABASE__PORTREQUIS_DATABASE_SECURITY = eINSTANCE.getInterfaceDatabase_Portrequis_database_security();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.PortFournis_ConnectionManager_DatabaseImpl <em>Port Fournis Connection Manager Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.PortFournis_ConnectionManager_DatabaseImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getPortFournis_ConnectionManager_Database()
		 * @generated
		 */
		EClass PORT_FOURNIS_CONNECTION_MANAGER_DATABASE = eINSTANCE.getPortFournis_ConnectionManager_Database();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.PortRequis_ConnectionManager_DatabaseImpl <em>Port Requis Connection Manager Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.PortRequis_ConnectionManager_DatabaseImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getPortRequis_ConnectionManager_Database()
		 * @generated
		 */
		EClass PORT_REQUIS_CONNECTION_MANAGER_DATABASE = eINSTANCE.getPortRequis_ConnectionManager_Database();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.PortFournis_ConnectionManager_SecurityImpl <em>Port Fournis Connection Manager Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.PortFournis_ConnectionManager_SecurityImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getPortFournis_ConnectionManager_Security()
		 * @generated
		 */
		EClass PORT_FOURNIS_CONNECTION_MANAGER_SECURITY = eINSTANCE.getPortFournis_ConnectionManager_Security();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.PortRequis_ConnectionManager_SecurityImpl <em>Port Requis Connection Manager Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.PortRequis_ConnectionManager_SecurityImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getPortRequis_ConnectionManager_Security()
		 * @generated
		 */
		EClass PORT_REQUIS_CONNECTION_MANAGER_SECURITY = eINSTANCE.getPortRequis_ConnectionManager_Security();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.PortFournis_Security_ConnectionImpl <em>Port Fournis Security Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.PortFournis_Security_ConnectionImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getPortFournis_Security_Connection()
		 * @generated
		 */
		EClass PORT_FOURNIS_SECURITY_CONNECTION = eINSTANCE.getPortFournis_Security_Connection();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.PortRequis_Security_ConnectionImpl <em>Port Requis Security Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.PortRequis_Security_ConnectionImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getPortRequis_Security_Connection()
		 * @generated
		 */
		EClass PORT_REQUIS_SECURITY_CONNECTION = eINSTANCE.getPortRequis_Security_Connection();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.PortFournis_Security_DatabaseImpl <em>Port Fournis Security Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.PortFournis_Security_DatabaseImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getPortFournis_Security_Database()
		 * @generated
		 */
		EClass PORT_FOURNIS_SECURITY_DATABASE = eINSTANCE.getPortFournis_Security_Database();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.PortRequis_Security_DatabaseImpl <em>Port Requis Security Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.PortRequis_Security_DatabaseImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getPortRequis_Security_Database()
		 * @generated
		 */
		EClass PORT_REQUIS_SECURITY_DATABASE = eINSTANCE.getPortRequis_Security_Database();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.PortFournis_database_ConnectionImpl <em>Port Fournis database Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.PortFournis_database_ConnectionImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getPortFournis_database_Connection()
		 * @generated
		 */
		EClass PORT_FOURNIS_DATABASE_CONNECTION = eINSTANCE.getPortFournis_database_Connection();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.PortRequis_database_ConnectionImpl <em>Port Requis database Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.PortRequis_database_ConnectionImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getPortRequis_database_Connection()
		 * @generated
		 */
		EClass PORT_REQUIS_DATABASE_CONNECTION = eINSTANCE.getPortRequis_database_Connection();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.PortFournis_database_SecurityImpl <em>Port Fournis database Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.PortFournis_database_SecurityImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getPortFournis_database_Security()
		 * @generated
		 */
		EClass PORT_FOURNIS_DATABASE_SECURITY = eINSTANCE.getPortFournis_database_Security();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.PortRequis_database_SecurityImpl <em>Port Requis database Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.PortRequis_database_SecurityImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getPortRequis_database_Security()
		 * @generated
		 */
		EClass PORT_REQUIS_DATABASE_SECURITY = eINSTANCE.getPortRequis_database_Security();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.attachment_connectionM_Fournis_role_database_RequisImpl <em>attachment connection MFournis role database Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.attachment_connectionM_Fournis_role_database_RequisImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getattachment_connectionM_Fournis_role_database_Requis()
		 * @generated
		 */
		EClass ATTACHMENT_CONNECTION_MFOURNIS_ROLE_DATABASE_REQUIS = eINSTANCE.getattachment_connectionM_Fournis_role_database_Requis();

		/**
		 * The meta object literal for the '<em><b>Portfournis connectionmanager database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_CONNECTION_MFOURNIS_ROLE_DATABASE_REQUIS__PORTFOURNIS_CONNECTIONMANAGER_DATABASE = eINSTANCE.getattachment_connectionM_Fournis_role_database_Requis_Portfournis_connectionmanager_database();

		/**
		 * The meta object literal for the '<em><b>Rolerequis database connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_CONNECTION_MFOURNIS_ROLE_DATABASE_REQUIS__ROLEREQUIS_DATABASE_CONNECTION = eINSTANCE.getattachment_connectionM_Fournis_role_database_Requis_Rolerequis_database_connection();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.attachment_connectionM_Requis_role_security_fournisImpl <em>attachment connection MRequis role security fournis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.attachment_connectionM_Requis_role_security_fournisImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getattachment_connectionM_Requis_role_security_fournis()
		 * @generated
		 */
		EClass ATTACHMENT_CONNECTION_MREQUIS_ROLE_SECURITY_FOURNIS = eINSTANCE.getattachment_connectionM_Requis_role_security_fournis();

		/**
		 * The meta object literal for the '<em><b>Portrequis connectionmanager security</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_CONNECTION_MREQUIS_ROLE_SECURITY_FOURNIS__PORTREQUIS_CONNECTIONMANAGER_SECURITY = eINSTANCE.getattachment_connectionM_Requis_role_security_fournis_Portrequis_connectionmanager_security();

		/**
		 * The meta object literal for the '<em><b>Rolefournis security connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_CONNECTION_MREQUIS_ROLE_SECURITY_FOURNIS__ROLEFOURNIS_SECURITY_CONNECTION = eINSTANCE.getattachment_connectionM_Requis_role_security_fournis_Rolefournis_security_connection();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.attachment_connectionM_Fournis_role_security_RequisImpl <em>attachment connection MFournis role security Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.attachment_connectionM_Fournis_role_security_RequisImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getattachment_connectionM_Fournis_role_security_Requis()
		 * @generated
		 */
		EClass ATTACHMENT_CONNECTION_MFOURNIS_ROLE_SECURITY_REQUIS = eINSTANCE.getattachment_connectionM_Fournis_role_security_Requis();

		/**
		 * The meta object literal for the '<em><b>Portfournis connectionmanager security</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_CONNECTION_MFOURNIS_ROLE_SECURITY_REQUIS__PORTFOURNIS_CONNECTIONMANAGER_SECURITY = eINSTANCE.getattachment_connectionM_Fournis_role_security_Requis_Portfournis_connectionmanager_security();

		/**
		 * The meta object literal for the '<em><b>Rolerequis security connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_CONNECTION_MFOURNIS_ROLE_SECURITY_REQUIS__ROLEREQUIS_SECURITY_CONNECTION = eINSTANCE.getattachment_connectionM_Fournis_role_security_Requis_Rolerequis_security_connection();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.attachment_connectionM_Requis_role_database_fournisImpl <em>attachment connection MRequis role database fournis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.attachment_connectionM_Requis_role_database_fournisImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getattachment_connectionM_Requis_role_database_fournis()
		 * @generated
		 */
		EClass ATTACHMENT_CONNECTION_MREQUIS_ROLE_DATABASE_FOURNIS = eINSTANCE.getattachment_connectionM_Requis_role_database_fournis();

		/**
		 * The meta object literal for the '<em><b>Portrequis connectionmanager database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_CONNECTION_MREQUIS_ROLE_DATABASE_FOURNIS__PORTREQUIS_CONNECTIONMANAGER_DATABASE = eINSTANCE.getattachment_connectionM_Requis_role_database_fournis_Portrequis_connectionmanager_database();

		/**
		 * The meta object literal for the '<em><b>Rolefournis database connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_CONNECTION_MREQUIS_ROLE_DATABASE_FOURNIS__ROLEFOURNIS_DATABASE_CONNECTION = eINSTANCE.getattachment_connectionM_Requis_role_database_fournis_Rolefournis_database_connection();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.attachment_Security_Requis_role_Connection_fournisImpl <em>attachment Security Requis role Connection fournis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.attachment_Security_Requis_role_Connection_fournisImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getattachment_Security_Requis_role_Connection_fournis()
		 * @generated
		 */
		EClass ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS = eINSTANCE.getattachment_Security_Requis_role_Connection_fournis();

		/**
		 * The meta object literal for the '<em><b>Portrequis security connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS__PORTREQUIS_SECURITY_CONNECTION = eINSTANCE.getattachment_Security_Requis_role_Connection_fournis_Portrequis_security_connection();

		/**
		 * The meta object literal for the '<em><b>Rolefournis connectionmanager security</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS__ROLEFOURNIS_CONNECTIONMANAGER_SECURITY = eINSTANCE.getattachment_Security_Requis_role_Connection_fournis_Rolefournis_connectionmanager_security();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.attachment_Security_Fournis_role_Connection_RequisImpl <em>attachment Security Fournis role Connection Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.attachment_Security_Fournis_role_Connection_RequisImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getattachment_Security_Fournis_role_Connection_Requis()
		 * @generated
		 */
		EClass ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS = eINSTANCE.getattachment_Security_Fournis_role_Connection_Requis();

		/**
		 * The meta object literal for the '<em><b>Portfournis security connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS__PORTFOURNIS_SECURITY_CONNECTION = eINSTANCE.getattachment_Security_Fournis_role_Connection_Requis_Portfournis_security_connection();

		/**
		 * The meta object literal for the '<em><b>Rolerequis connectionmanager security</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS__ROLEREQUIS_CONNECTIONMANAGER_SECURITY = eINSTANCE.getattachment_Security_Fournis_role_Connection_Requis_Rolerequis_connectionmanager_security();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.attachment_Security_Requis_role_Database_fournisImpl <em>attachment Security Requis role Database fournis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.attachment_Security_Requis_role_Database_fournisImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getattachment_Security_Requis_role_Database_fournis()
		 * @generated
		 */
		EClass ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS = eINSTANCE.getattachment_Security_Requis_role_Database_fournis();

		/**
		 * The meta object literal for the '<em><b>Portrequis security database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS__PORTREQUIS_SECURITY_DATABASE = eINSTANCE.getattachment_Security_Requis_role_Database_fournis_Portrequis_security_database();

		/**
		 * The meta object literal for the '<em><b>Rolefournis database security</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS__ROLEFOURNIS_DATABASE_SECURITY = eINSTANCE.getattachment_Security_Requis_role_Database_fournis_Rolefournis_database_security();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.attachment_Security_Fournis_role_Database_RequisImpl <em>attachment Security Fournis role Database Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.attachment_Security_Fournis_role_Database_RequisImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getattachment_Security_Fournis_role_Database_Requis()
		 * @generated
		 */
		EClass ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS = eINSTANCE.getattachment_Security_Fournis_role_Database_Requis();

		/**
		 * The meta object literal for the '<em><b>Rolerequis database security</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS__ROLEREQUIS_DATABASE_SECURITY = eINSTANCE.getattachment_Security_Fournis_role_Database_Requis_Rolerequis_database_security();

		/**
		 * The meta object literal for the '<em><b>Portfournis security database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS__PORTFOURNIS_SECURITY_DATABASE = eINSTANCE.getattachment_Security_Fournis_role_Database_Requis_Portfournis_security_database();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.attachment_Database_Requis_role_connection_fournisImpl <em>attachment Database Requis role connection fournis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.attachment_Database_Requis_role_connection_fournisImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getattachment_Database_Requis_role_connection_fournis()
		 * @generated
		 */
		EClass ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS = eINSTANCE.getattachment_Database_Requis_role_connection_fournis();

		/**
		 * The meta object literal for the '<em><b>Portrequis database connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS__PORTREQUIS_DATABASE_CONNECTION = eINSTANCE.getattachment_Database_Requis_role_connection_fournis_Portrequis_database_connection();

		/**
		 * The meta object literal for the '<em><b>Rolefournis connectionmanager database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS__ROLEFOURNIS_CONNECTIONMANAGER_DATABASE = eINSTANCE.getattachment_Database_Requis_role_connection_fournis_Rolefournis_connectionmanager_database();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.attachment_Database_Fournis_role_Connection_RequisImpl <em>attachment Database Fournis role Connection Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.attachment_Database_Fournis_role_Connection_RequisImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getattachment_Database_Fournis_role_Connection_Requis()
		 * @generated
		 */
		EClass ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS = eINSTANCE.getattachment_Database_Fournis_role_Connection_Requis();

		/**
		 * The meta object literal for the '<em><b>Portfournis database connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS__PORTFOURNIS_DATABASE_CONNECTION = eINSTANCE.getattachment_Database_Fournis_role_Connection_Requis_Portfournis_database_connection();

		/**
		 * The meta object literal for the '<em><b>Rolerequis connectionmanager database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS__ROLEREQUIS_CONNECTIONMANAGER_DATABASE = eINSTANCE.getattachment_Database_Fournis_role_Connection_Requis_Rolerequis_connectionmanager_database();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.attachment_Database_Requis_role_Security_fournisImpl <em>attachment Database Requis role Security fournis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.attachment_Database_Requis_role_Security_fournisImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getattachment_Database_Requis_role_Security_fournis()
		 * @generated
		 */
		EClass ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS = eINSTANCE.getattachment_Database_Requis_role_Security_fournis();

		/**
		 * The meta object literal for the '<em><b>Portrequis database security</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS__PORTREQUIS_DATABASE_SECURITY = eINSTANCE.getattachment_Database_Requis_role_Security_fournis_Portrequis_database_security();

		/**
		 * The meta object literal for the '<em><b>Rolefournis security database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS__ROLEFOURNIS_SECURITY_DATABASE = eINSTANCE.getattachment_Database_Requis_role_Security_fournis_Rolefournis_security_database();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.attachment_Database_Fournis_role_Security_RequisImpl <em>attachment Database Fournis role Security Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.attachment_Database_Fournis_role_Security_RequisImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getattachment_Database_Fournis_role_Security_Requis()
		 * @generated
		 */
		EClass ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS = eINSTANCE.getattachment_Database_Fournis_role_Security_Requis();

		/**
		 * The meta object literal for the '<em><b>Portfournis database security</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS__PORTFOURNIS_DATABASE_SECURITY = eINSTANCE.getattachment_Database_Fournis_role_Security_Requis_Portfournis_database_security();

		/**
		 * The meta object literal for the '<em><b>Rolerequis security database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS__ROLEREQUIS_SECURITY_DATABASE = eINSTANCE.getattachment_Database_Fournis_role_Security_Requis_Rolerequis_security_database();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.ConnecteurServeurDImpl <em>Connecteur Serveur D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.ConnecteurServeurDImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getConnecteurServeurD()
		 * @generated
		 */
		EClass CONNECTEUR_SERVEUR_D = eINSTANCE.getConnecteurServeurD();

		/**
		 * The meta object literal for the '<em><b>Glueserveur1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTEUR_SERVEUR_D__GLUESERVEUR1 = eINSTANCE.getConnecteurServeurD_Glueserveur1();

		/**
		 * The meta object literal for the '<em><b>Glueserveur2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTEUR_SERVEUR_D__GLUESERVEUR2 = eINSTANCE.getConnecteurServeurD_Glueserveur2();

		/**
		 * The meta object literal for the '<em><b>Glueserveur3</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTEUR_SERVEUR_D__GLUESERVEUR3 = eINSTANCE.getConnecteurServeurD_Glueserveur3();

		/**
		 * The meta object literal for the '<em><b>Glueserveur4</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTEUR_SERVEUR_D__GLUESERVEUR4 = eINSTANCE.getConnecteurServeurD_Glueserveur4();

		/**
		 * The meta object literal for the '<em><b>Glueserveur5</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTEUR_SERVEUR_D__GLUESERVEUR5 = eINSTANCE.getConnecteurServeurD_Glueserveur5();

		/**
		 * The meta object literal for the '<em><b>Glueserveur6</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTEUR_SERVEUR_D__GLUESERVEUR6 = eINSTANCE.getConnecteurServeurD_Glueserveur6();

		/**
		 * The meta object literal for the '<em><b>Rolefournis connectionmanager database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTEUR_SERVEUR_D__ROLEFOURNIS_CONNECTIONMANAGER_DATABASE = eINSTANCE.getConnecteurServeurD_Rolefournis_connectionmanager_database();

		/**
		 * The meta object literal for the '<em><b>Rolerequis connectionmanager database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTEUR_SERVEUR_D__ROLEREQUIS_CONNECTIONMANAGER_DATABASE = eINSTANCE.getConnecteurServeurD_Rolerequis_connectionmanager_database();

		/**
		 * The meta object literal for the '<em><b>Rolefournis connectionmanager security</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTEUR_SERVEUR_D__ROLEFOURNIS_CONNECTIONMANAGER_SECURITY = eINSTANCE.getConnecteurServeurD_Rolefournis_connectionmanager_security();

		/**
		 * The meta object literal for the '<em><b>Rolerequis connectionmanager security</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTEUR_SERVEUR_D__ROLEREQUIS_CONNECTIONMANAGER_SECURITY = eINSTANCE.getConnecteurServeurD_Rolerequis_connectionmanager_security();

		/**
		 * The meta object literal for the '<em><b>Rolefournis security connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTEUR_SERVEUR_D__ROLEFOURNIS_SECURITY_CONNECTION = eINSTANCE.getConnecteurServeurD_Rolefournis_security_connection();

		/**
		 * The meta object literal for the '<em><b>Rolerequis security connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTEUR_SERVEUR_D__ROLEREQUIS_SECURITY_CONNECTION = eINSTANCE.getConnecteurServeurD_Rolerequis_security_connection();

		/**
		 * The meta object literal for the '<em><b>Rolefournis security database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTEUR_SERVEUR_D__ROLEFOURNIS_SECURITY_DATABASE = eINSTANCE.getConnecteurServeurD_Rolefournis_security_database();

		/**
		 * The meta object literal for the '<em><b>Rolerequis security database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTEUR_SERVEUR_D__ROLEREQUIS_SECURITY_DATABASE = eINSTANCE.getConnecteurServeurD_Rolerequis_security_database();

		/**
		 * The meta object literal for the '<em><b>Rolefournis database connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTEUR_SERVEUR_D__ROLEFOURNIS_DATABASE_CONNECTION = eINSTANCE.getConnecteurServeurD_Rolefournis_database_connection();

		/**
		 * The meta object literal for the '<em><b>Rolerequis database connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTEUR_SERVEUR_D__ROLEREQUIS_DATABASE_CONNECTION = eINSTANCE.getConnecteurServeurD_Rolerequis_database_connection();

		/**
		 * The meta object literal for the '<em><b>Rolefournis database security</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTEUR_SERVEUR_D__ROLEFOURNIS_DATABASE_SECURITY = eINSTANCE.getConnecteurServeurD_Rolefournis_database_security();

		/**
		 * The meta object literal for the '<em><b>Rolerequis database security</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTEUR_SERVEUR_D__ROLEREQUIS_DATABASE_SECURITY = eINSTANCE.getConnecteurServeurD_Rolerequis_database_security();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.GlueServeur1Impl <em>Glue Serveur1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.GlueServeur1Impl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getGlueServeur1()
		 * @generated
		 */
		EClass GLUE_SERVEUR1 = eINSTANCE.getGlueServeur1();

		/**
		 * The meta object literal for the '<em><b>Rolefournis connectionmanager database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLUE_SERVEUR1__ROLEFOURNIS_CONNECTIONMANAGER_DATABASE = eINSTANCE.getGlueServeur1_Rolefournis_connectionmanager_database();

		/**
		 * The meta object literal for the '<em><b>Rolerequis connectionmanager database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLUE_SERVEUR1__ROLEREQUIS_CONNECTIONMANAGER_DATABASE = eINSTANCE.getGlueServeur1_Rolerequis_connectionmanager_database();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.RoleFournis_ConnectionManager_DatabaseImpl <em>Role Fournis Connection Manager Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.RoleFournis_ConnectionManager_DatabaseImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getRoleFournis_ConnectionManager_Database()
		 * @generated
		 */
		EClass ROLE_FOURNIS_CONNECTION_MANAGER_DATABASE = eINSTANCE.getRoleFournis_ConnectionManager_Database();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.RoleRequis_ConnectionManager_DatabaseImpl <em>Role Requis Connection Manager Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.RoleRequis_ConnectionManager_DatabaseImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getRoleRequis_ConnectionManager_Database()
		 * @generated
		 */
		EClass ROLE_REQUIS_CONNECTION_MANAGER_DATABASE = eINSTANCE.getRoleRequis_ConnectionManager_Database();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.RoleFournis_ConnectionManager_SecurityImpl <em>Role Fournis Connection Manager Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.RoleFournis_ConnectionManager_SecurityImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getRoleFournis_ConnectionManager_Security()
		 * @generated
		 */
		EClass ROLE_FOURNIS_CONNECTION_MANAGER_SECURITY = eINSTANCE.getRoleFournis_ConnectionManager_Security();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.RoleRequis_ConnectionManager_SecurityImpl <em>Role Requis Connection Manager Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.RoleRequis_ConnectionManager_SecurityImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getRoleRequis_ConnectionManager_Security()
		 * @generated
		 */
		EClass ROLE_REQUIS_CONNECTION_MANAGER_SECURITY = eINSTANCE.getRoleRequis_ConnectionManager_Security();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.RoleFournis_Security_ConnectionImpl <em>Role Fournis Security Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.RoleFournis_Security_ConnectionImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getRoleFournis_Security_Connection()
		 * @generated
		 */
		EClass ROLE_FOURNIS_SECURITY_CONNECTION = eINSTANCE.getRoleFournis_Security_Connection();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.RoleRequis_Security_ConnectionImpl <em>Role Requis Security Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.RoleRequis_Security_ConnectionImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getRoleRequis_Security_Connection()
		 * @generated
		 */
		EClass ROLE_REQUIS_SECURITY_CONNECTION = eINSTANCE.getRoleRequis_Security_Connection();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.RoleFournis_Security_DatabaseImpl <em>Role Fournis Security Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.RoleFournis_Security_DatabaseImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getRoleFournis_Security_Database()
		 * @generated
		 */
		EClass ROLE_FOURNIS_SECURITY_DATABASE = eINSTANCE.getRoleFournis_Security_Database();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.RoleRequis_Security_DatabaseImpl <em>Role Requis Security Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.RoleRequis_Security_DatabaseImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getRoleRequis_Security_Database()
		 * @generated
		 */
		EClass ROLE_REQUIS_SECURITY_DATABASE = eINSTANCE.getRoleRequis_Security_Database();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.RoleFournis_Database_ConnectionImpl <em>Role Fournis Database Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.RoleFournis_Database_ConnectionImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getRoleFournis_Database_Connection()
		 * @generated
		 */
		EClass ROLE_FOURNIS_DATABASE_CONNECTION = eINSTANCE.getRoleFournis_Database_Connection();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.RoleRequis_Database_ConnectionImpl <em>Role Requis Database Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.RoleRequis_Database_ConnectionImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getRoleRequis_Database_Connection()
		 * @generated
		 */
		EClass ROLE_REQUIS_DATABASE_CONNECTION = eINSTANCE.getRoleRequis_Database_Connection();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.RoleFournis_Database_SecurityImpl <em>Role Fournis Database Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.RoleFournis_Database_SecurityImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getRoleFournis_Database_Security()
		 * @generated
		 */
		EClass ROLE_FOURNIS_DATABASE_SECURITY = eINSTANCE.getRoleFournis_Database_Security();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.RoleRequis_Database_SecurityImpl <em>Role Requis Database Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.RoleRequis_Database_SecurityImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getRoleRequis_Database_Security()
		 * @generated
		 */
		EClass ROLE_REQUIS_DATABASE_SECURITY = eINSTANCE.getRoleRequis_Database_Security();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.PortRequisConfigCSImpl <em>Port Requis Config CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.PortRequisConfigCSImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getPortRequisConfigCS()
		 * @generated
		 */
		EClass PORT_REQUIS_CONFIG_CS = eINSTANCE.getPortRequisConfigCS();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.PortFournisCSImpl <em>Port Fournis CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.PortFournisCSImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getPortFournisCS()
		 * @generated
		 */
		EClass PORT_FOURNIS_CS = eINSTANCE.getPortFournisCS();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.ServeurDetailImpl <em>Serveur Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.ServeurDetailImpl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getServeurDetail()
		 * @generated
		 */
		EClass SERVEUR_DETAIL = eINSTANCE.getServeurDetail();

		/**
		 * The meta object literal for the '<em><b>Connectionmanager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_DETAIL__CONNECTIONMANAGER = eINSTANCE.getServeurDetail_Connectionmanager();

		/**
		 * The meta object literal for the '<em><b>Securitymanager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_DETAIL__SECURITYMANAGER = eINSTANCE.getServeurDetail_Securitymanager();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_DETAIL__DATABASE = eINSTANCE.getServeurDetail_Database();

		/**
		 * The meta object literal for the '<em><b>Connecteurserveurd</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_DETAIL__CONNECTEURSERVEURD = eINSTANCE.getServeurDetail_Connecteurserveurd();

		/**
		 * The meta object literal for the '<em><b>Attachment connectionm fournis role database requis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_FOURNIS_ROLE_DATABASE_REQUIS = eINSTANCE.getServeurDetail_Attachment_connectionm_fournis_role_database_requis();

		/**
		 * The meta object literal for the '<em><b>Attachment connectionm requis role database fournis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_REQUIS_ROLE_DATABASE_FOURNIS = eINSTANCE.getServeurDetail_Attachment_connectionm_requis_role_database_fournis();

		/**
		 * The meta object literal for the '<em><b>Attachment connectionm requis role security fournis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_REQUIS_ROLE_SECURITY_FOURNIS = eINSTANCE.getServeurDetail_Attachment_connectionm_requis_role_security_fournis();

		/**
		 * The meta object literal for the '<em><b>Attachment connectionm fournis role security requis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_FOURNIS_ROLE_SECURITY_REQUIS = eINSTANCE.getServeurDetail_Attachment_connectionm_fournis_role_security_requis();

		/**
		 * The meta object literal for the '<em><b>Attachment security requis role connection fournis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_DETAIL__ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS = eINSTANCE.getServeurDetail_Attachment_security_requis_role_connection_fournis();

		/**
		 * The meta object literal for the '<em><b>Attachment security fournis role connection requis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_DETAIL__ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS = eINSTANCE.getServeurDetail_Attachment_security_fournis_role_connection_requis();

		/**
		 * The meta object literal for the '<em><b>Attachment security requis role database fournis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_DETAIL__ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS = eINSTANCE.getServeurDetail_Attachment_security_requis_role_database_fournis();

		/**
		 * The meta object literal for the '<em><b>Attachment security fournis role database requis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_DETAIL__ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS = eINSTANCE.getServeurDetail_Attachment_security_fournis_role_database_requis();

		/**
		 * The meta object literal for the '<em><b>Attachment database requis role connection fournis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_DETAIL__ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS = eINSTANCE.getServeurDetail_Attachment_database_requis_role_connection_fournis();

		/**
		 * The meta object literal for the '<em><b>Attachment database fournis role connection requis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_DETAIL__ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS = eINSTANCE.getServeurDetail_Attachment_database_fournis_role_connection_requis();

		/**
		 * The meta object literal for the '<em><b>Attachment database requis role security fournis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_DETAIL__ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS = eINSTANCE.getServeurDetail_Attachment_database_requis_role_security_fournis();

		/**
		 * The meta object literal for the '<em><b>Attachment database fournis role security requis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR_DETAIL__ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS = eINSTANCE.getServeurDetail_Attachment_database_fournis_role_security_requis();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.GlueServeur2Impl <em>Glue Serveur2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.GlueServeur2Impl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getGlueServeur2()
		 * @generated
		 */
		EClass GLUE_SERVEUR2 = eINSTANCE.getGlueServeur2();

		/**
		 * The meta object literal for the '<em><b>Rolefournis connectionmanager security</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLUE_SERVEUR2__ROLEFOURNIS_CONNECTIONMANAGER_SECURITY = eINSTANCE.getGlueServeur2_Rolefournis_connectionmanager_security();

		/**
		 * The meta object literal for the '<em><b>Rolerequis connectionmanager security</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLUE_SERVEUR2__ROLEREQUIS_CONNECTIONMANAGER_SECURITY = eINSTANCE.getGlueServeur2_Rolerequis_connectionmanager_security();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.GlueServeur3Impl <em>Glue Serveur3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.GlueServeur3Impl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getGlueServeur3()
		 * @generated
		 */
		EClass GLUE_SERVEUR3 = eINSTANCE.getGlueServeur3();

		/**
		 * The meta object literal for the '<em><b>Rolefournis security connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLUE_SERVEUR3__ROLEFOURNIS_SECURITY_CONNECTION = eINSTANCE.getGlueServeur3_Rolefournis_security_connection();

		/**
		 * The meta object literal for the '<em><b>Rolerequis security connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLUE_SERVEUR3__ROLEREQUIS_SECURITY_CONNECTION = eINSTANCE.getGlueServeur3_Rolerequis_security_connection();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.GlueServeur4Impl <em>Glue Serveur4</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.GlueServeur4Impl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getGlueServeur4()
		 * @generated
		 */
		EClass GLUE_SERVEUR4 = eINSTANCE.getGlueServeur4();

		/**
		 * The meta object literal for the '<em><b>Rolefournis security database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLUE_SERVEUR4__ROLEFOURNIS_SECURITY_DATABASE = eINSTANCE.getGlueServeur4_Rolefournis_security_database();

		/**
		 * The meta object literal for the '<em><b>Rolerequis security database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLUE_SERVEUR4__ROLEREQUIS_SECURITY_DATABASE = eINSTANCE.getGlueServeur4_Rolerequis_security_database();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.GlueServeur5Impl <em>Glue Serveur5</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.GlueServeur5Impl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getGlueServeur5()
		 * @generated
		 */
		EClass GLUE_SERVEUR5 = eINSTANCE.getGlueServeur5();

		/**
		 * The meta object literal for the '<em><b>Rolefournis database connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLUE_SERVEUR5__ROLEFOURNIS_DATABASE_CONNECTION = eINSTANCE.getGlueServeur5_Rolefournis_database_connection();

		/**
		 * The meta object literal for the '<em><b>Rolerequis database connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLUE_SERVEUR5__ROLEREQUIS_DATABASE_CONNECTION = eINSTANCE.getGlueServeur5_Rolerequis_database_connection();

		/**
		 * The meta object literal for the '{@link systeme.FonctionServeur.impl.GlueServeur6Impl <em>Glue Serveur6</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.FonctionServeur.impl.GlueServeur6Impl
		 * @see systeme.FonctionServeur.impl.FonctionServeurPackageImpl#getGlueServeur6()
		 * @generated
		 */
		EClass GLUE_SERVEUR6 = eINSTANCE.getGlueServeur6();

		/**
		 * The meta object literal for the '<em><b>Rolefournis database security</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLUE_SERVEUR6__ROLEFOURNIS_DATABASE_SECURITY = eINSTANCE.getGlueServeur6_Rolefournis_database_security();

		/**
		 * The meta object literal for the '<em><b>Rolerequis database security</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLUE_SERVEUR6__ROLEREQUIS_DATABASE_SECURITY = eINSTANCE.getGlueServeur6_Rolerequis_database_security();

	}

} //FonctionServeurPackage
