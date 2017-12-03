/**
 */
package systeme.FonctionServeur.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import projecttArchitectural.Glue;

import projecttArchitectural.RoleConnecteursFournis;
import projecttArchitectural.RoleConnecteursRequis;
import systeme.FonctionServeur.ConnecteurServeurD;
import systeme.FonctionServeur.ConnectionManager;
import systeme.FonctionServeur.Database;
import systeme.FonctionServeur.FonctionServeurFactory;
import systeme.FonctionServeur.FonctionServeurPackage;
import systeme.FonctionServeur.InterfaceConnectionManager;
import systeme.FonctionServeur.InterfaceDatabase;
import systeme.FonctionServeur.PortFournisCS;
import systeme.FonctionServeur.PortFournis_ConnectionManager_Database;
import systeme.FonctionServeur.PortFournis_ConnectionManager_Security;
import systeme.FonctionServeur.PortFournis_Security_Connection;
import systeme.FonctionServeur.PortFournis_Security_Database;
import systeme.FonctionServeur.PortFournis_database_Connection;
import systeme.FonctionServeur.PortFournis_database_Security;
import systeme.FonctionServeur.PortRequisConfigCS;
import systeme.FonctionServeur.PortRequis_ConnectionManager_Database;
import systeme.FonctionServeur.PortRequis_ConnectionManager_Security;
import systeme.FonctionServeur.PortRequis_Security_Connection;
import systeme.FonctionServeur.PortRequis_Security_Database;
import systeme.FonctionServeur.PortRequis_database_Connection;
import systeme.FonctionServeur.PortRequis_database_Security;
import systeme.FonctionServeur.RoleFournis_ConnectionManager_Security;
import systeme.FonctionServeur.RoleFournis_Database_Connection;
import systeme.FonctionServeur.RoleFournis_Database_Security;
import systeme.FonctionServeur.RoleFournis_Security_Connection;
import systeme.FonctionServeur.RoleFournis_Security_Database;
import systeme.FonctionServeur.RoleRequis_ConnectionManager_Security;
import systeme.FonctionServeur.RoleRequis_Database_Connection;
import systeme.FonctionServeur.RoleRequis_Database_Security;
import systeme.FonctionServeur.RoleRequis_Security_Connection;
import systeme.FonctionServeur.RoleRequis_Security_Database;
import systeme.FonctionServeur.ServeurDetail;
import systeme.FonctionServeur.attachment_Database_Fournis_role_Connection_Requis;
import systeme.FonctionServeur.attachment_Database_Fournis_role_Security_Requis;
import systeme.FonctionServeur.attachment_Database_Requis_role_Security_fournis;
import systeme.FonctionServeur.attachment_Database_Requis_role_connection_fournis;
import systeme.FonctionServeur.attachment_Security_Fournis_role_Connection_Requis;
import systeme.FonctionServeur.attachment_Security_Fournis_role_Database_Requis;
import systeme.FonctionServeur.attachment_Security_Requis_role_Connection_fournis;
import systeme.FonctionServeur.attachment_Security_Requis_role_Database_fournis;
import systeme.FonctionServeur.attachment_connectionM_Fournis_role_database_Requis;
import systeme.FonctionServeur.attachment_connectionM_Fournis_role_security_Requis;
import systeme.FonctionServeur.attachment_connectionM_Requis_role_database_fournis;
import systeme.FonctionServeur.attachment_connectionM_Requis_role_security_fournis;
import systeme.FonctionServeur.interfaceSecurityManager;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FonctionServeurFactoryImpl extends EFactoryImpl implements FonctionServeurFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FonctionServeurFactory init() {
		try {
			FonctionServeurFactory theFonctionServeurFactory = (FonctionServeurFactory)EPackage.Registry.INSTANCE.getEFactory(FonctionServeurPackage.eNS_URI);
			if (theFonctionServeurFactory != null) {
				return theFonctionServeurFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FonctionServeurFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FonctionServeurFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FonctionServeurPackage.CONNECTION_MANAGER: return createConnectionManager();
			case FonctionServeurPackage.SECURITY_MANAGER: return createSecurityManager();
			case FonctionServeurPackage.DATABASE: return createDatabase();
			case FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER: return createInterfaceConnectionManager();
			case FonctionServeurPackage.INTERFACE_SECURITY_MANAGER: return createinterfaceSecurityManager();
			case FonctionServeurPackage.INTERFACE_DATABASE: return createInterfaceDatabase();
			case FonctionServeurPackage.PORT_FOURNIS_CONNECTION_MANAGER_DATABASE: return createPortFournis_ConnectionManager_Database();
			case FonctionServeurPackage.PORT_REQUIS_CONNECTION_MANAGER_DATABASE: return createPortRequis_ConnectionManager_Database();
			case FonctionServeurPackage.PORT_FOURNIS_CONNECTION_MANAGER_SECURITY: return createPortFournis_ConnectionManager_Security();
			case FonctionServeurPackage.PORT_REQUIS_CONNECTION_MANAGER_SECURITY: return createPortRequis_ConnectionManager_Security();
			case FonctionServeurPackage.PORT_FOURNIS_SECURITY_CONNECTION: return createPortFournis_Security_Connection();
			case FonctionServeurPackage.PORT_REQUIS_SECURITY_CONNECTION: return createPortRequis_Security_Connection();
			case FonctionServeurPackage.PORT_FOURNIS_SECURITY_DATABASE: return createPortFournis_Security_Database();
			case FonctionServeurPackage.PORT_REQUIS_SECURITY_DATABASE: return createPortRequis_Security_Database();
			case FonctionServeurPackage.PORT_FOURNIS_DATABASE_CONNECTION: return createPortFournis_database_Connection();
			case FonctionServeurPackage.PORT_REQUIS_DATABASE_CONNECTION: return createPortRequis_database_Connection();
			case FonctionServeurPackage.PORT_FOURNIS_DATABASE_SECURITY: return createPortFournis_database_Security();
			case FonctionServeurPackage.PORT_REQUIS_DATABASE_SECURITY: return createPortRequis_database_Security();
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MFOURNIS_ROLE_DATABASE_REQUIS: return createattachment_connectionM_Fournis_role_database_Requis();
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MREQUIS_ROLE_SECURITY_FOURNIS: return createattachment_connectionM_Requis_role_security_fournis();
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MFOURNIS_ROLE_SECURITY_REQUIS: return createattachment_connectionM_Fournis_role_security_Requis();
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MREQUIS_ROLE_DATABASE_FOURNIS: return createattachment_connectionM_Requis_role_database_fournis();
			case FonctionServeurPackage.ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS: return createattachment_Security_Requis_role_Connection_fournis();
			case FonctionServeurPackage.ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS: return createattachment_Security_Fournis_role_Connection_Requis();
			case FonctionServeurPackage.ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS: return createattachment_Security_Requis_role_Database_fournis();
			case FonctionServeurPackage.ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS: return createattachment_Security_Fournis_role_Database_Requis();
			case FonctionServeurPackage.ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS: return createattachment_Database_Requis_role_connection_fournis();
			case FonctionServeurPackage.ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS: return createattachment_Database_Fournis_role_Connection_Requis();
			case FonctionServeurPackage.ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS: return createattachment_Database_Requis_role_Security_fournis();
			case FonctionServeurPackage.ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS: return createattachment_Database_Fournis_role_Security_Requis();
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D: return createConnecteurServeurD();
			case FonctionServeurPackage.GLUE_SERVEUR1: return (EObject)createGlueServeur1();
			case FonctionServeurPackage.ROLE_FOURNIS_CONNECTION_MANAGER_DATABASE: return (EObject)createRoleFournis_ConnectionManager_Database();
			case FonctionServeurPackage.ROLE_REQUIS_CONNECTION_MANAGER_DATABASE: return (EObject)createRoleRequis_ConnectionManager_Database();
			case FonctionServeurPackage.ROLE_FOURNIS_CONNECTION_MANAGER_SECURITY: return createRoleFournis_ConnectionManager_Security();
			case FonctionServeurPackage.ROLE_REQUIS_CONNECTION_MANAGER_SECURITY: return createRoleRequis_ConnectionManager_Security();
			case FonctionServeurPackage.ROLE_FOURNIS_SECURITY_CONNECTION: return createRoleFournis_Security_Connection();
			case FonctionServeurPackage.ROLE_REQUIS_SECURITY_CONNECTION: return createRoleRequis_Security_Connection();
			case FonctionServeurPackage.ROLE_FOURNIS_SECURITY_DATABASE: return createRoleFournis_Security_Database();
			case FonctionServeurPackage.ROLE_REQUIS_SECURITY_DATABASE: return createRoleRequis_Security_Database();
			case FonctionServeurPackage.ROLE_FOURNIS_DATABASE_CONNECTION: return createRoleFournis_Database_Connection();
			case FonctionServeurPackage.ROLE_REQUIS_DATABASE_CONNECTION: return createRoleRequis_Database_Connection();
			case FonctionServeurPackage.ROLE_FOURNIS_DATABASE_SECURITY: return createRoleFournis_Database_Security();
			case FonctionServeurPackage.ROLE_REQUIS_DATABASE_SECURITY: return createRoleRequis_Database_Security();
			case FonctionServeurPackage.PORT_REQUIS_CONFIG_CS: return createPortRequisConfigCS();
			case FonctionServeurPackage.PORT_FOURNIS_CS: return createPortFournisCS();
			case FonctionServeurPackage.SERVEUR_DETAIL: return createServeurDetail();
			case FonctionServeurPackage.GLUE_SERVEUR2: return (EObject)createGlueServeur2();
			case FonctionServeurPackage.GLUE_SERVEUR3: return (EObject)createGlueServeur3();
			case FonctionServeurPackage.GLUE_SERVEUR4: return (EObject)createGlueServeur4();
			case FonctionServeurPackage.GLUE_SERVEUR5: return (EObject)createGlueServeur5();
			case FonctionServeurPackage.GLUE_SERVEUR6: return (EObject)createGlueServeur6();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionManager createConnectionManager() {
		ConnectionManagerImpl connectionManager = new ConnectionManagerImpl();
		return connectionManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public systeme.FonctionServeur.SecurityManager createSecurityManager() {
		SecurityManagerImpl securityManager = new SecurityManagerImpl();
		return securityManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database createDatabase() {
		DatabaseImpl database = new DatabaseImpl();
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceConnectionManager createInterfaceConnectionManager() {
		InterfaceConnectionManagerImpl interfaceConnectionManager = new InterfaceConnectionManagerImpl();
		return interfaceConnectionManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interfaceSecurityManager createinterfaceSecurityManager() {
		interfaceSecurityManagerImpl interfaceSecurityManager = new interfaceSecurityManagerImpl();
		return interfaceSecurityManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDatabase createInterfaceDatabase() {
		InterfaceDatabaseImpl interfaceDatabase = new InterfaceDatabaseImpl();
		return interfaceDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFournis_ConnectionManager_Database createPortFournis_ConnectionManager_Database() {
		PortFournis_ConnectionManager_DatabaseImpl portFournis_ConnectionManager_Database = new PortFournis_ConnectionManager_DatabaseImpl();
		return portFournis_ConnectionManager_Database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequis_ConnectionManager_Database createPortRequis_ConnectionManager_Database() {
		PortRequis_ConnectionManager_DatabaseImpl portRequis_ConnectionManager_Database = new PortRequis_ConnectionManager_DatabaseImpl();
		return portRequis_ConnectionManager_Database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFournis_ConnectionManager_Security createPortFournis_ConnectionManager_Security() {
		PortFournis_ConnectionManager_SecurityImpl portFournis_ConnectionManager_Security = new PortFournis_ConnectionManager_SecurityImpl();
		return portFournis_ConnectionManager_Security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequis_ConnectionManager_Security createPortRequis_ConnectionManager_Security() {
		PortRequis_ConnectionManager_SecurityImpl portRequis_ConnectionManager_Security = new PortRequis_ConnectionManager_SecurityImpl();
		return portRequis_ConnectionManager_Security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFournis_Security_Connection createPortFournis_Security_Connection() {
		PortFournis_Security_ConnectionImpl portFournis_Security_Connection = new PortFournis_Security_ConnectionImpl();
		return portFournis_Security_Connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequis_Security_Connection createPortRequis_Security_Connection() {
		PortRequis_Security_ConnectionImpl portRequis_Security_Connection = new PortRequis_Security_ConnectionImpl();
		return portRequis_Security_Connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFournis_Security_Database createPortFournis_Security_Database() {
		PortFournis_Security_DatabaseImpl portFournis_Security_Database = new PortFournis_Security_DatabaseImpl();
		return portFournis_Security_Database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequis_Security_Database createPortRequis_Security_Database() {
		PortRequis_Security_DatabaseImpl portRequis_Security_Database = new PortRequis_Security_DatabaseImpl();
		return portRequis_Security_Database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFournis_database_Connection createPortFournis_database_Connection() {
		PortFournis_database_ConnectionImpl portFournis_database_Connection = new PortFournis_database_ConnectionImpl();
		return portFournis_database_Connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequis_database_Connection createPortRequis_database_Connection() {
		PortRequis_database_ConnectionImpl portRequis_database_Connection = new PortRequis_database_ConnectionImpl();
		return portRequis_database_Connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFournis_database_Security createPortFournis_database_Security() {
		PortFournis_database_SecurityImpl portFournis_database_Security = new PortFournis_database_SecurityImpl();
		return portFournis_database_Security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequis_database_Security createPortRequis_database_Security() {
		PortRequis_database_SecurityImpl portRequis_database_Security = new PortRequis_database_SecurityImpl();
		return portRequis_database_Security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_connectionM_Fournis_role_database_Requis createattachment_connectionM_Fournis_role_database_Requis() {
		attachment_connectionM_Fournis_role_database_RequisImpl attachment_connectionM_Fournis_role_database_Requis = new attachment_connectionM_Fournis_role_database_RequisImpl();
		return attachment_connectionM_Fournis_role_database_Requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_connectionM_Requis_role_security_fournis createattachment_connectionM_Requis_role_security_fournis() {
		attachment_connectionM_Requis_role_security_fournisImpl attachment_connectionM_Requis_role_security_fournis = new attachment_connectionM_Requis_role_security_fournisImpl();
		return attachment_connectionM_Requis_role_security_fournis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_connectionM_Fournis_role_security_Requis createattachment_connectionM_Fournis_role_security_Requis() {
		attachment_connectionM_Fournis_role_security_RequisImpl attachment_connectionM_Fournis_role_security_Requis = new attachment_connectionM_Fournis_role_security_RequisImpl();
		return attachment_connectionM_Fournis_role_security_Requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_connectionM_Requis_role_database_fournis createattachment_connectionM_Requis_role_database_fournis() {
		attachment_connectionM_Requis_role_database_fournisImpl attachment_connectionM_Requis_role_database_fournis = new attachment_connectionM_Requis_role_database_fournisImpl();
		return attachment_connectionM_Requis_role_database_fournis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_Security_Requis_role_Connection_fournis createattachment_Security_Requis_role_Connection_fournis() {
		attachment_Security_Requis_role_Connection_fournisImpl attachment_Security_Requis_role_Connection_fournis = new attachment_Security_Requis_role_Connection_fournisImpl();
		return attachment_Security_Requis_role_Connection_fournis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_Security_Fournis_role_Connection_Requis createattachment_Security_Fournis_role_Connection_Requis() {
		attachment_Security_Fournis_role_Connection_RequisImpl attachment_Security_Fournis_role_Connection_Requis = new attachment_Security_Fournis_role_Connection_RequisImpl();
		return attachment_Security_Fournis_role_Connection_Requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_Security_Requis_role_Database_fournis createattachment_Security_Requis_role_Database_fournis() {
		attachment_Security_Requis_role_Database_fournisImpl attachment_Security_Requis_role_Database_fournis = new attachment_Security_Requis_role_Database_fournisImpl();
		return attachment_Security_Requis_role_Database_fournis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_Security_Fournis_role_Database_Requis createattachment_Security_Fournis_role_Database_Requis() {
		attachment_Security_Fournis_role_Database_RequisImpl attachment_Security_Fournis_role_Database_Requis = new attachment_Security_Fournis_role_Database_RequisImpl();
		return attachment_Security_Fournis_role_Database_Requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_Database_Requis_role_connection_fournis createattachment_Database_Requis_role_connection_fournis() {
		attachment_Database_Requis_role_connection_fournisImpl attachment_Database_Requis_role_connection_fournis = new attachment_Database_Requis_role_connection_fournisImpl();
		return attachment_Database_Requis_role_connection_fournis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_Database_Fournis_role_Connection_Requis createattachment_Database_Fournis_role_Connection_Requis() {
		attachment_Database_Fournis_role_Connection_RequisImpl attachment_Database_Fournis_role_Connection_Requis = new attachment_Database_Fournis_role_Connection_RequisImpl();
		return attachment_Database_Fournis_role_Connection_Requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_Database_Requis_role_Security_fournis createattachment_Database_Requis_role_Security_fournis() {
		attachment_Database_Requis_role_Security_fournisImpl attachment_Database_Requis_role_Security_fournis = new attachment_Database_Requis_role_Security_fournisImpl();
		return attachment_Database_Requis_role_Security_fournis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_Database_Fournis_role_Security_Requis createattachment_Database_Fournis_role_Security_Requis() {
		attachment_Database_Fournis_role_Security_RequisImpl attachment_Database_Fournis_role_Security_Requis = new attachment_Database_Fournis_role_Security_RequisImpl();
		return attachment_Database_Fournis_role_Security_Requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnecteurServeurD createConnecteurServeurD() {
		ConnecteurServeurDImpl connecteurServeurD = new ConnecteurServeurDImpl();
		return connecteurServeurD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue createGlueServeur1() {
		GlueServeur1Impl glueServeur1 = new GlueServeur1Impl();
		return glueServeur1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnecteursFournis createRoleFournis_ConnectionManager_Database() {
		RoleFournis_ConnectionManager_DatabaseImpl roleFournis_ConnectionManager_Database = new RoleFournis_ConnectionManager_DatabaseImpl();
		return roleFournis_ConnectionManager_Database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnecteursRequis createRoleRequis_ConnectionManager_Database() {
		RoleRequis_ConnectionManager_DatabaseImpl roleRequis_ConnectionManager_Database = new RoleRequis_ConnectionManager_DatabaseImpl();
		return roleRequis_ConnectionManager_Database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFournis_ConnectionManager_Security createRoleFournis_ConnectionManager_Security() {
		RoleFournis_ConnectionManager_SecurityImpl roleFournis_ConnectionManager_Security = new RoleFournis_ConnectionManager_SecurityImpl();
		return roleFournis_ConnectionManager_Security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis_ConnectionManager_Security createRoleRequis_ConnectionManager_Security() {
		RoleRequis_ConnectionManager_SecurityImpl roleRequis_ConnectionManager_Security = new RoleRequis_ConnectionManager_SecurityImpl();
		return roleRequis_ConnectionManager_Security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFournis_Security_Connection createRoleFournis_Security_Connection() {
		RoleFournis_Security_ConnectionImpl roleFournis_Security_Connection = new RoleFournis_Security_ConnectionImpl();
		return roleFournis_Security_Connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis_Security_Connection createRoleRequis_Security_Connection() {
		RoleRequis_Security_ConnectionImpl roleRequis_Security_Connection = new RoleRequis_Security_ConnectionImpl();
		return roleRequis_Security_Connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFournis_Security_Database createRoleFournis_Security_Database() {
		RoleFournis_Security_DatabaseImpl roleFournis_Security_Database = new RoleFournis_Security_DatabaseImpl();
		return roleFournis_Security_Database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis_Security_Database createRoleRequis_Security_Database() {
		RoleRequis_Security_DatabaseImpl roleRequis_Security_Database = new RoleRequis_Security_DatabaseImpl();
		return roleRequis_Security_Database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFournis_Database_Connection createRoleFournis_Database_Connection() {
		RoleFournis_Database_ConnectionImpl roleFournis_Database_Connection = new RoleFournis_Database_ConnectionImpl();
		return roleFournis_Database_Connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis_Database_Connection createRoleRequis_Database_Connection() {
		RoleRequis_Database_ConnectionImpl roleRequis_Database_Connection = new RoleRequis_Database_ConnectionImpl();
		return roleRequis_Database_Connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFournis_Database_Security createRoleFournis_Database_Security() {
		RoleFournis_Database_SecurityImpl roleFournis_Database_Security = new RoleFournis_Database_SecurityImpl();
		return roleFournis_Database_Security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis_Database_Security createRoleRequis_Database_Security() {
		RoleRequis_Database_SecurityImpl roleRequis_Database_Security = new RoleRequis_Database_SecurityImpl();
		return roleRequis_Database_Security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequisConfigCS createPortRequisConfigCS() {
		PortRequisConfigCSImpl portRequisConfigCS = new PortRequisConfigCSImpl();
		return portRequisConfigCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFournisCS createPortFournisCS() {
		PortFournisCSImpl portFournisCS = new PortFournisCSImpl();
		return portFournisCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServeurDetail createServeurDetail() {
		ServeurDetailImpl serveurDetail = new ServeurDetailImpl();
		return serveurDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue createGlueServeur2() {
		GlueServeur2Impl glueServeur2 = new GlueServeur2Impl();
		return glueServeur2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue createGlueServeur3() {
		GlueServeur3Impl glueServeur3 = new GlueServeur3Impl();
		return glueServeur3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue createGlueServeur4() {
		GlueServeur4Impl glueServeur4 = new GlueServeur4Impl();
		return glueServeur4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue createGlueServeur5() {
		GlueServeur5Impl glueServeur5 = new GlueServeur5Impl();
		return glueServeur5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue createGlueServeur6() {
		GlueServeur6Impl glueServeur6 = new GlueServeur6Impl();
		return glueServeur6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FonctionServeurPackage getFonctionServeurPackage() {
		return (FonctionServeurPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FonctionServeurPackage getPackage() {
		return FonctionServeurPackage.eINSTANCE;
	}

} //FonctionServeurFactoryImpl
