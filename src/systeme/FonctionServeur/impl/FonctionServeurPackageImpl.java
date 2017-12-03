/**
 */
package systeme.FonctionServeur.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import projecttArchitectural.Glue;
import projecttArchitectural.ProjecttArchitecturalPackage;

import projecttArchitectural.RoleConnecteursFournis;
import projecttArchitectural.RoleConnecteursRequis;
import projecttArchitectural.impl.ProjecttArchitecturalPackageImpl;

import systeme.ClientServeur.ClientServeurPackage;

import systeme.ClientServeur.impl.ClientServeurPackageImpl;

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

import systeme.SystemePackage;

import systeme.impl.SystemePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FonctionServeurPackageImpl extends EPackageImpl implements FonctionServeurPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceConnectionManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceSecurityManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceDatabaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portFournis_ConnectionManager_DatabaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portRequis_ConnectionManager_DatabaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portFournis_ConnectionManager_SecurityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portRequis_ConnectionManager_SecurityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portFournis_Security_ConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portRequis_Security_ConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portFournis_Security_DatabaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portRequis_Security_DatabaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portFournis_database_ConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portRequis_database_ConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portFournis_database_SecurityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portRequis_database_SecurityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_connectionM_Fournis_role_database_RequisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_connectionM_Requis_role_security_fournisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_connectionM_Fournis_role_security_RequisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_connectionM_Requis_role_database_fournisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_Security_Requis_role_Connection_fournisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_Security_Fournis_role_Connection_RequisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_Security_Requis_role_Database_fournisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_Security_Fournis_role_Database_RequisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_Database_Requis_role_connection_fournisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_Database_Fournis_role_Connection_RequisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_Database_Requis_role_Security_fournisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_Database_Fournis_role_Security_RequisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connecteurServeurDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glueServeur1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleFournis_ConnectionManager_DatabaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleRequis_ConnectionManager_DatabaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleFournis_ConnectionManager_SecurityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleRequis_ConnectionManager_SecurityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleFournis_Security_ConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleRequis_Security_ConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleFournis_Security_DatabaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleRequis_Security_DatabaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleFournis_Database_ConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleRequis_Database_ConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleFournis_Database_SecurityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleRequis_Database_SecurityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portRequisConfigCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portFournisCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serveurDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glueServeur2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glueServeur3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glueServeur4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glueServeur5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glueServeur6EClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see systeme.FonctionServeur.FonctionServeurPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FonctionServeurPackageImpl() {
		super(eNS_URI, FonctionServeurFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FonctionServeurPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FonctionServeurPackage init() {
		if (isInited) return (FonctionServeurPackage)EPackage.Registry.INSTANCE.getEPackage(FonctionServeurPackage.eNS_URI);

		// Obtain or create and register package
		FonctionServeurPackageImpl theFonctionServeurPackage = (FonctionServeurPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FonctionServeurPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FonctionServeurPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SystemePackageImpl theSystemePackage = (SystemePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SystemePackage.eNS_URI) instanceof SystemePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SystemePackage.eNS_URI) : SystemePackage.eINSTANCE);
		ClientServeurPackageImpl theClientServeurPackage = (ClientServeurPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClientServeurPackage.eNS_URI) instanceof ClientServeurPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClientServeurPackage.eNS_URI) : ClientServeurPackage.eINSTANCE);
		ProjecttArchitecturalPackageImpl theProjecttArchitecturalPackage = (ProjecttArchitecturalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProjecttArchitecturalPackage.eNS_URI) instanceof ProjecttArchitecturalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProjecttArchitecturalPackage.eNS_URI) : ProjecttArchitecturalPackage.eINSTANCE);

		// Create package meta-data objects
		theFonctionServeurPackage.createPackageContents();
		theSystemePackage.createPackageContents();
		theClientServeurPackage.createPackageContents();
		theProjecttArchitecturalPackage.createPackageContents();

		// Initialize created meta-data
		theFonctionServeurPackage.initializePackageContents();
		theSystemePackage.initializePackageContents();
		theClientServeurPackage.initializePackageContents();
		theProjecttArchitecturalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFonctionServeurPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FonctionServeurPackage.eNS_URI, theFonctionServeurPackage);
		return theFonctionServeurPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionManager() {
		return connectionManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionManager_Interfaceconnectionmanager() {
		return (EReference)connectionManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityManager() {
		return securityManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityManager_Interfacesecuritymanager() {
		return (EReference)securityManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabase() {
		return databaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabase_Interfacedatabase() {
		return (EReference)databaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceConnectionManager() {
		return interfaceConnectionManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceConnectionManager_Portrequisconfigcs() {
		return (EReference)interfaceConnectionManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceConnectionManager_Portfourniscs() {
		return (EReference)interfaceConnectionManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceConnectionManager_Portfournis_connectionmanager_database() {
		return (EReference)interfaceConnectionManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceConnectionManager_Portrequis_connectionmanager_database() {
		return (EReference)interfaceConnectionManagerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceConnectionManager_Portfournis_connectionmanager_security() {
		return (EReference)interfaceConnectionManagerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceConnectionManager_Portrequis_connectionmanager_security() {
		return (EReference)interfaceConnectionManagerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getinterfaceSecurityManager() {
		return interfaceSecurityManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getinterfaceSecurityManager_Portfournis_security_connection() {
		return (EReference)interfaceSecurityManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getinterfaceSecurityManager_Portrequis_security_connection() {
		return (EReference)interfaceSecurityManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getinterfaceSecurityManager_Portfournis_security_database() {
		return (EReference)interfaceSecurityManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getinterfaceSecurityManager_Portrequis_security_database() {
		return (EReference)interfaceSecurityManagerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceDatabase() {
		return interfaceDatabaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceDatabase_Portfournis_database_connection() {
		return (EReference)interfaceDatabaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceDatabase_Portrequis_database_connection() {
		return (EReference)interfaceDatabaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceDatabase_Portfournis_database_security() {
		return (EReference)interfaceDatabaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceDatabase_Portrequis_database_security() {
		return (EReference)interfaceDatabaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortFournis_ConnectionManager_Database() {
		return portFournis_ConnectionManager_DatabaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortRequis_ConnectionManager_Database() {
		return portRequis_ConnectionManager_DatabaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortFournis_ConnectionManager_Security() {
		return portFournis_ConnectionManager_SecurityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortRequis_ConnectionManager_Security() {
		return portRequis_ConnectionManager_SecurityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortFournis_Security_Connection() {
		return portFournis_Security_ConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortRequis_Security_Connection() {
		return portRequis_Security_ConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortFournis_Security_Database() {
		return portFournis_Security_DatabaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortRequis_Security_Database() {
		return portRequis_Security_DatabaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortFournis_database_Connection() {
		return portFournis_database_ConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortRequis_database_Connection() {
		return portRequis_database_ConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortFournis_database_Security() {
		return portFournis_database_SecurityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortRequis_database_Security() {
		return portRequis_database_SecurityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getattachment_connectionM_Fournis_role_database_Requis() {
		return attachment_connectionM_Fournis_role_database_RequisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattachment_connectionM_Fournis_role_database_Requis_Portfournis_connectionmanager_database() {
		return (EReference)attachment_connectionM_Fournis_role_database_RequisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattachment_connectionM_Fournis_role_database_Requis_Rolerequis_database_connection() {
		return (EReference)attachment_connectionM_Fournis_role_database_RequisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getattachment_connectionM_Requis_role_security_fournis() {
		return attachment_connectionM_Requis_role_security_fournisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattachment_connectionM_Requis_role_security_fournis_Portrequis_connectionmanager_security() {
		return (EReference)attachment_connectionM_Requis_role_security_fournisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattachment_connectionM_Requis_role_security_fournis_Rolefournis_security_connection() {
		return (EReference)attachment_connectionM_Requis_role_security_fournisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getattachment_connectionM_Fournis_role_security_Requis() {
		return attachment_connectionM_Fournis_role_security_RequisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattachment_connectionM_Fournis_role_security_Requis_Portfournis_connectionmanager_security() {
		return (EReference)attachment_connectionM_Fournis_role_security_RequisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattachment_connectionM_Fournis_role_security_Requis_Rolerequis_security_connection() {
		return (EReference)attachment_connectionM_Fournis_role_security_RequisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getattachment_connectionM_Requis_role_database_fournis() {
		return attachment_connectionM_Requis_role_database_fournisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattachment_connectionM_Requis_role_database_fournis_Portrequis_connectionmanager_database() {
		return (EReference)attachment_connectionM_Requis_role_database_fournisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattachment_connectionM_Requis_role_database_fournis_Rolefournis_database_connection() {
		return (EReference)attachment_connectionM_Requis_role_database_fournisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getattachment_Security_Requis_role_Connection_fournis() {
		return attachment_Security_Requis_role_Connection_fournisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattachment_Security_Requis_role_Connection_fournis_Portrequis_security_connection() {
		return (EReference)attachment_Security_Requis_role_Connection_fournisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattachment_Security_Requis_role_Connection_fournis_Rolefournis_connectionmanager_security() {
		return (EReference)attachment_Security_Requis_role_Connection_fournisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getattachment_Security_Fournis_role_Connection_Requis() {
		return attachment_Security_Fournis_role_Connection_RequisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattachment_Security_Fournis_role_Connection_Requis_Portfournis_security_connection() {
		return (EReference)attachment_Security_Fournis_role_Connection_RequisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattachment_Security_Fournis_role_Connection_Requis_Rolerequis_connectionmanager_security() {
		return (EReference)attachment_Security_Fournis_role_Connection_RequisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getattachment_Security_Requis_role_Database_fournis() {
		return attachment_Security_Requis_role_Database_fournisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattachment_Security_Requis_role_Database_fournis_Portrequis_security_database() {
		return (EReference)attachment_Security_Requis_role_Database_fournisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattachment_Security_Requis_role_Database_fournis_Rolefournis_database_security() {
		return (EReference)attachment_Security_Requis_role_Database_fournisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getattachment_Security_Fournis_role_Database_Requis() {
		return attachment_Security_Fournis_role_Database_RequisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattachment_Security_Fournis_role_Database_Requis_Rolerequis_database_security() {
		return (EReference)attachment_Security_Fournis_role_Database_RequisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattachment_Security_Fournis_role_Database_Requis_Portfournis_security_database() {
		return (EReference)attachment_Security_Fournis_role_Database_RequisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getattachment_Database_Requis_role_connection_fournis() {
		return attachment_Database_Requis_role_connection_fournisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattachment_Database_Requis_role_connection_fournis_Portrequis_database_connection() {
		return (EReference)attachment_Database_Requis_role_connection_fournisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattachment_Database_Requis_role_connection_fournis_Rolefournis_connectionmanager_database() {
		return (EReference)attachment_Database_Requis_role_connection_fournisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getattachment_Database_Fournis_role_Connection_Requis() {
		return attachment_Database_Fournis_role_Connection_RequisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattachment_Database_Fournis_role_Connection_Requis_Portfournis_database_connection() {
		return (EReference)attachment_Database_Fournis_role_Connection_RequisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattachment_Database_Fournis_role_Connection_Requis_Rolerequis_connectionmanager_database() {
		return (EReference)attachment_Database_Fournis_role_Connection_RequisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getattachment_Database_Requis_role_Security_fournis() {
		return attachment_Database_Requis_role_Security_fournisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattachment_Database_Requis_role_Security_fournis_Portrequis_database_security() {
		return (EReference)attachment_Database_Requis_role_Security_fournisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattachment_Database_Requis_role_Security_fournis_Rolefournis_security_database() {
		return (EReference)attachment_Database_Requis_role_Security_fournisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getattachment_Database_Fournis_role_Security_Requis() {
		return attachment_Database_Fournis_role_Security_RequisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattachment_Database_Fournis_role_Security_Requis_Portfournis_database_security() {
		return (EReference)attachment_Database_Fournis_role_Security_RequisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattachment_Database_Fournis_role_Security_Requis_Rolerequis_security_database() {
		return (EReference)attachment_Database_Fournis_role_Security_RequisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnecteurServeurD() {
		return connecteurServeurDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnecteurServeurD_Glueserveur1() {
		return (EReference)connecteurServeurDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnecteurServeurD_Glueserveur2() {
		return (EReference)connecteurServeurDEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnecteurServeurD_Glueserveur3() {
		return (EReference)connecteurServeurDEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnecteurServeurD_Glueserveur4() {
		return (EReference)connecteurServeurDEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnecteurServeurD_Glueserveur5() {
		return (EReference)connecteurServeurDEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnecteurServeurD_Glueserveur6() {
		return (EReference)connecteurServeurDEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnecteurServeurD_Rolefournis_connectionmanager_database() {
		return (EReference)connecteurServeurDEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnecteurServeurD_Rolerequis_connectionmanager_database() {
		return (EReference)connecteurServeurDEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnecteurServeurD_Rolefournis_connectionmanager_security() {
		return (EReference)connecteurServeurDEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnecteurServeurD_Rolerequis_connectionmanager_security() {
		return (EReference)connecteurServeurDEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnecteurServeurD_Rolefournis_security_connection() {
		return (EReference)connecteurServeurDEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnecteurServeurD_Rolerequis_security_connection() {
		return (EReference)connecteurServeurDEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnecteurServeurD_Rolefournis_security_database() {
		return (EReference)connecteurServeurDEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnecteurServeurD_Rolerequis_security_database() {
		return (EReference)connecteurServeurDEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnecteurServeurD_Rolefournis_database_connection() {
		return (EReference)connecteurServeurDEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnecteurServeurD_Rolerequis_database_connection() {
		return (EReference)connecteurServeurDEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnecteurServeurD_Rolefournis_database_security() {
		return (EReference)connecteurServeurDEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnecteurServeurD_Rolerequis_database_security() {
		return (EReference)connecteurServeurDEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlueServeur1() {
		return glueServeur1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlueServeur1_Rolefournis_connectionmanager_database() {
		return (EReference)glueServeur1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlueServeur1_Rolerequis_connectionmanager_database() {
		return (EReference)glueServeur1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleFournis_ConnectionManager_Database() {
		return roleFournis_ConnectionManager_DatabaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleRequis_ConnectionManager_Database() {
		return roleRequis_ConnectionManager_DatabaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleFournis_ConnectionManager_Security() {
		return roleFournis_ConnectionManager_SecurityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleRequis_ConnectionManager_Security() {
		return roleRequis_ConnectionManager_SecurityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleFournis_Security_Connection() {
		return roleFournis_Security_ConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleRequis_Security_Connection() {
		return roleRequis_Security_ConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleFournis_Security_Database() {
		return roleFournis_Security_DatabaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleRequis_Security_Database() {
		return roleRequis_Security_DatabaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleFournis_Database_Connection() {
		return roleFournis_Database_ConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleRequis_Database_Connection() {
		return roleRequis_Database_ConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleFournis_Database_Security() {
		return roleFournis_Database_SecurityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleRequis_Database_Security() {
		return roleRequis_Database_SecurityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortRequisConfigCS() {
		return portRequisConfigCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortFournisCS() {
		return portFournisCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServeurDetail() {
		return serveurDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeurDetail_Connectionmanager() {
		return (EReference)serveurDetailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeurDetail_Securitymanager() {
		return (EReference)serveurDetailEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeurDetail_Database() {
		return (EReference)serveurDetailEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeurDetail_Connecteurserveurd() {
		return (EReference)serveurDetailEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeurDetail_Attachment_connectionm_fournis_role_database_requis() {
		return (EReference)serveurDetailEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeurDetail_Attachment_connectionm_requis_role_database_fournis() {
		return (EReference)serveurDetailEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeurDetail_Attachment_connectionm_requis_role_security_fournis() {
		return (EReference)serveurDetailEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeurDetail_Attachment_connectionm_fournis_role_security_requis() {
		return (EReference)serveurDetailEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeurDetail_Attachment_security_requis_role_connection_fournis() {
		return (EReference)serveurDetailEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeurDetail_Attachment_security_fournis_role_connection_requis() {
		return (EReference)serveurDetailEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeurDetail_Attachment_security_requis_role_database_fournis() {
		return (EReference)serveurDetailEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeurDetail_Attachment_security_fournis_role_database_requis() {
		return (EReference)serveurDetailEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeurDetail_Attachment_database_requis_role_connection_fournis() {
		return (EReference)serveurDetailEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeurDetail_Attachment_database_fournis_role_connection_requis() {
		return (EReference)serveurDetailEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeurDetail_Attachment_database_requis_role_security_fournis() {
		return (EReference)serveurDetailEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServeurDetail_Attachment_database_fournis_role_security_requis() {
		return (EReference)serveurDetailEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlueServeur2() {
		return glueServeur2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlueServeur2_Rolefournis_connectionmanager_security() {
		return (EReference)glueServeur2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlueServeur2_Rolerequis_connectionmanager_security() {
		return (EReference)glueServeur2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlueServeur3() {
		return glueServeur3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlueServeur3_Rolefournis_security_connection() {
		return (EReference)glueServeur3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlueServeur3_Rolerequis_security_connection() {
		return (EReference)glueServeur3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlueServeur4() {
		return glueServeur4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlueServeur4_Rolefournis_security_database() {
		return (EReference)glueServeur4EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlueServeur4_Rolerequis_security_database() {
		return (EReference)glueServeur4EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlueServeur5() {
		return glueServeur5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlueServeur5_Rolefournis_database_connection() {
		return (EReference)glueServeur5EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlueServeur5_Rolerequis_database_connection() {
		return (EReference)glueServeur5EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlueServeur6() {
		return glueServeur6EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlueServeur6_Rolefournis_database_security() {
		return (EReference)glueServeur6EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlueServeur6_Rolerequis_database_security() {
		return (EReference)glueServeur6EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FonctionServeurFactory getFonctionServeurFactory() {
		return (FonctionServeurFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		connectionManagerEClass = createEClass(CONNECTION_MANAGER);
		createEReference(connectionManagerEClass, CONNECTION_MANAGER__INTERFACECONNECTIONMANAGER);

		securityManagerEClass = createEClass(SECURITY_MANAGER);
		createEReference(securityManagerEClass, SECURITY_MANAGER__INTERFACESECURITYMANAGER);

		databaseEClass = createEClass(DATABASE);
		createEReference(databaseEClass, DATABASE__INTERFACEDATABASE);

		interfaceConnectionManagerEClass = createEClass(INTERFACE_CONNECTION_MANAGER);
		createEReference(interfaceConnectionManagerEClass, INTERFACE_CONNECTION_MANAGER__PORTREQUISCONFIGCS);
		createEReference(interfaceConnectionManagerEClass, INTERFACE_CONNECTION_MANAGER__PORTFOURNISCS);
		createEReference(interfaceConnectionManagerEClass, INTERFACE_CONNECTION_MANAGER__PORTFOURNIS_CONNECTIONMANAGER_DATABASE);
		createEReference(interfaceConnectionManagerEClass, INTERFACE_CONNECTION_MANAGER__PORTREQUIS_CONNECTIONMANAGER_DATABASE);
		createEReference(interfaceConnectionManagerEClass, INTERFACE_CONNECTION_MANAGER__PORTFOURNIS_CONNECTIONMANAGER_SECURITY);
		createEReference(interfaceConnectionManagerEClass, INTERFACE_CONNECTION_MANAGER__PORTREQUIS_CONNECTIONMANAGER_SECURITY);

		interfaceSecurityManagerEClass = createEClass(INTERFACE_SECURITY_MANAGER);
		createEReference(interfaceSecurityManagerEClass, INTERFACE_SECURITY_MANAGER__PORTFOURNIS_SECURITY_CONNECTION);
		createEReference(interfaceSecurityManagerEClass, INTERFACE_SECURITY_MANAGER__PORTREQUIS_SECURITY_CONNECTION);
		createEReference(interfaceSecurityManagerEClass, INTERFACE_SECURITY_MANAGER__PORTFOURNIS_SECURITY_DATABASE);
		createEReference(interfaceSecurityManagerEClass, INTERFACE_SECURITY_MANAGER__PORTREQUIS_SECURITY_DATABASE);

		interfaceDatabaseEClass = createEClass(INTERFACE_DATABASE);
		createEReference(interfaceDatabaseEClass, INTERFACE_DATABASE__PORTFOURNIS_DATABASE_CONNECTION);
		createEReference(interfaceDatabaseEClass, INTERFACE_DATABASE__PORTREQUIS_DATABASE_CONNECTION);
		createEReference(interfaceDatabaseEClass, INTERFACE_DATABASE__PORTFOURNIS_DATABASE_SECURITY);
		createEReference(interfaceDatabaseEClass, INTERFACE_DATABASE__PORTREQUIS_DATABASE_SECURITY);

		portFournis_ConnectionManager_DatabaseEClass = createEClass(PORT_FOURNIS_CONNECTION_MANAGER_DATABASE);

		portRequis_ConnectionManager_DatabaseEClass = createEClass(PORT_REQUIS_CONNECTION_MANAGER_DATABASE);

		portFournis_ConnectionManager_SecurityEClass = createEClass(PORT_FOURNIS_CONNECTION_MANAGER_SECURITY);

		portRequis_ConnectionManager_SecurityEClass = createEClass(PORT_REQUIS_CONNECTION_MANAGER_SECURITY);

		portFournis_Security_ConnectionEClass = createEClass(PORT_FOURNIS_SECURITY_CONNECTION);

		portRequis_Security_ConnectionEClass = createEClass(PORT_REQUIS_SECURITY_CONNECTION);

		portFournis_Security_DatabaseEClass = createEClass(PORT_FOURNIS_SECURITY_DATABASE);

		portRequis_Security_DatabaseEClass = createEClass(PORT_REQUIS_SECURITY_DATABASE);

		portFournis_database_ConnectionEClass = createEClass(PORT_FOURNIS_DATABASE_CONNECTION);

		portRequis_database_ConnectionEClass = createEClass(PORT_REQUIS_DATABASE_CONNECTION);

		portFournis_database_SecurityEClass = createEClass(PORT_FOURNIS_DATABASE_SECURITY);

		portRequis_database_SecurityEClass = createEClass(PORT_REQUIS_DATABASE_SECURITY);

		attachment_connectionM_Fournis_role_database_RequisEClass = createEClass(ATTACHMENT_CONNECTION_MFOURNIS_ROLE_DATABASE_REQUIS);
		createEReference(attachment_connectionM_Fournis_role_database_RequisEClass, ATTACHMENT_CONNECTION_MFOURNIS_ROLE_DATABASE_REQUIS__PORTFOURNIS_CONNECTIONMANAGER_DATABASE);
		createEReference(attachment_connectionM_Fournis_role_database_RequisEClass, ATTACHMENT_CONNECTION_MFOURNIS_ROLE_DATABASE_REQUIS__ROLEREQUIS_DATABASE_CONNECTION);

		attachment_connectionM_Requis_role_security_fournisEClass = createEClass(ATTACHMENT_CONNECTION_MREQUIS_ROLE_SECURITY_FOURNIS);
		createEReference(attachment_connectionM_Requis_role_security_fournisEClass, ATTACHMENT_CONNECTION_MREQUIS_ROLE_SECURITY_FOURNIS__PORTREQUIS_CONNECTIONMANAGER_SECURITY);
		createEReference(attachment_connectionM_Requis_role_security_fournisEClass, ATTACHMENT_CONNECTION_MREQUIS_ROLE_SECURITY_FOURNIS__ROLEFOURNIS_SECURITY_CONNECTION);

		attachment_connectionM_Fournis_role_security_RequisEClass = createEClass(ATTACHMENT_CONNECTION_MFOURNIS_ROLE_SECURITY_REQUIS);
		createEReference(attachment_connectionM_Fournis_role_security_RequisEClass, ATTACHMENT_CONNECTION_MFOURNIS_ROLE_SECURITY_REQUIS__PORTFOURNIS_CONNECTIONMANAGER_SECURITY);
		createEReference(attachment_connectionM_Fournis_role_security_RequisEClass, ATTACHMENT_CONNECTION_MFOURNIS_ROLE_SECURITY_REQUIS__ROLEREQUIS_SECURITY_CONNECTION);

		attachment_connectionM_Requis_role_database_fournisEClass = createEClass(ATTACHMENT_CONNECTION_MREQUIS_ROLE_DATABASE_FOURNIS);
		createEReference(attachment_connectionM_Requis_role_database_fournisEClass, ATTACHMENT_CONNECTION_MREQUIS_ROLE_DATABASE_FOURNIS__PORTREQUIS_CONNECTIONMANAGER_DATABASE);
		createEReference(attachment_connectionM_Requis_role_database_fournisEClass, ATTACHMENT_CONNECTION_MREQUIS_ROLE_DATABASE_FOURNIS__ROLEFOURNIS_DATABASE_CONNECTION);

		attachment_Security_Requis_role_Connection_fournisEClass = createEClass(ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS);
		createEReference(attachment_Security_Requis_role_Connection_fournisEClass, ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS__PORTREQUIS_SECURITY_CONNECTION);
		createEReference(attachment_Security_Requis_role_Connection_fournisEClass, ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS__ROLEFOURNIS_CONNECTIONMANAGER_SECURITY);

		attachment_Security_Fournis_role_Connection_RequisEClass = createEClass(ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS);
		createEReference(attachment_Security_Fournis_role_Connection_RequisEClass, ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS__PORTFOURNIS_SECURITY_CONNECTION);
		createEReference(attachment_Security_Fournis_role_Connection_RequisEClass, ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS__ROLEREQUIS_CONNECTIONMANAGER_SECURITY);

		attachment_Security_Requis_role_Database_fournisEClass = createEClass(ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS);
		createEReference(attachment_Security_Requis_role_Database_fournisEClass, ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS__PORTREQUIS_SECURITY_DATABASE);
		createEReference(attachment_Security_Requis_role_Database_fournisEClass, ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS__ROLEFOURNIS_DATABASE_SECURITY);

		attachment_Security_Fournis_role_Database_RequisEClass = createEClass(ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS);
		createEReference(attachment_Security_Fournis_role_Database_RequisEClass, ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS__ROLEREQUIS_DATABASE_SECURITY);
		createEReference(attachment_Security_Fournis_role_Database_RequisEClass, ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS__PORTFOURNIS_SECURITY_DATABASE);

		attachment_Database_Requis_role_connection_fournisEClass = createEClass(ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS);
		createEReference(attachment_Database_Requis_role_connection_fournisEClass, ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS__PORTREQUIS_DATABASE_CONNECTION);
		createEReference(attachment_Database_Requis_role_connection_fournisEClass, ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS__ROLEFOURNIS_CONNECTIONMANAGER_DATABASE);

		attachment_Database_Fournis_role_Connection_RequisEClass = createEClass(ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS);
		createEReference(attachment_Database_Fournis_role_Connection_RequisEClass, ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS__PORTFOURNIS_DATABASE_CONNECTION);
		createEReference(attachment_Database_Fournis_role_Connection_RequisEClass, ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS__ROLEREQUIS_CONNECTIONMANAGER_DATABASE);

		attachment_Database_Requis_role_Security_fournisEClass = createEClass(ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS);
		createEReference(attachment_Database_Requis_role_Security_fournisEClass, ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS__PORTREQUIS_DATABASE_SECURITY);
		createEReference(attachment_Database_Requis_role_Security_fournisEClass, ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS__ROLEFOURNIS_SECURITY_DATABASE);

		attachment_Database_Fournis_role_Security_RequisEClass = createEClass(ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS);
		createEReference(attachment_Database_Fournis_role_Security_RequisEClass, ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS__PORTFOURNIS_DATABASE_SECURITY);
		createEReference(attachment_Database_Fournis_role_Security_RequisEClass, ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS__ROLEREQUIS_SECURITY_DATABASE);

		connecteurServeurDEClass = createEClass(CONNECTEUR_SERVEUR_D);
		createEReference(connecteurServeurDEClass, CONNECTEUR_SERVEUR_D__GLUESERVEUR1);
		createEReference(connecteurServeurDEClass, CONNECTEUR_SERVEUR_D__GLUESERVEUR2);
		createEReference(connecteurServeurDEClass, CONNECTEUR_SERVEUR_D__GLUESERVEUR3);
		createEReference(connecteurServeurDEClass, CONNECTEUR_SERVEUR_D__GLUESERVEUR4);
		createEReference(connecteurServeurDEClass, CONNECTEUR_SERVEUR_D__GLUESERVEUR5);
		createEReference(connecteurServeurDEClass, CONNECTEUR_SERVEUR_D__GLUESERVEUR6);
		createEReference(connecteurServeurDEClass, CONNECTEUR_SERVEUR_D__ROLEFOURNIS_CONNECTIONMANAGER_DATABASE);
		createEReference(connecteurServeurDEClass, CONNECTEUR_SERVEUR_D__ROLEREQUIS_CONNECTIONMANAGER_DATABASE);
		createEReference(connecteurServeurDEClass, CONNECTEUR_SERVEUR_D__ROLEFOURNIS_CONNECTIONMANAGER_SECURITY);
		createEReference(connecteurServeurDEClass, CONNECTEUR_SERVEUR_D__ROLEREQUIS_CONNECTIONMANAGER_SECURITY);
		createEReference(connecteurServeurDEClass, CONNECTEUR_SERVEUR_D__ROLEFOURNIS_SECURITY_CONNECTION);
		createEReference(connecteurServeurDEClass, CONNECTEUR_SERVEUR_D__ROLEREQUIS_SECURITY_CONNECTION);
		createEReference(connecteurServeurDEClass, CONNECTEUR_SERVEUR_D__ROLEFOURNIS_SECURITY_DATABASE);
		createEReference(connecteurServeurDEClass, CONNECTEUR_SERVEUR_D__ROLEREQUIS_SECURITY_DATABASE);
		createEReference(connecteurServeurDEClass, CONNECTEUR_SERVEUR_D__ROLEFOURNIS_DATABASE_CONNECTION);
		createEReference(connecteurServeurDEClass, CONNECTEUR_SERVEUR_D__ROLEREQUIS_DATABASE_CONNECTION);
		createEReference(connecteurServeurDEClass, CONNECTEUR_SERVEUR_D__ROLEFOURNIS_DATABASE_SECURITY);
		createEReference(connecteurServeurDEClass, CONNECTEUR_SERVEUR_D__ROLEREQUIS_DATABASE_SECURITY);

		glueServeur1EClass = createEClass(GLUE_SERVEUR1);
		createEReference(glueServeur1EClass, GLUE_SERVEUR1__ROLEFOURNIS_CONNECTIONMANAGER_DATABASE);
		createEReference(glueServeur1EClass, GLUE_SERVEUR1__ROLEREQUIS_CONNECTIONMANAGER_DATABASE);

		roleFournis_ConnectionManager_DatabaseEClass = createEClass(ROLE_FOURNIS_CONNECTION_MANAGER_DATABASE);

		roleRequis_ConnectionManager_DatabaseEClass = createEClass(ROLE_REQUIS_CONNECTION_MANAGER_DATABASE);

		roleFournis_ConnectionManager_SecurityEClass = createEClass(ROLE_FOURNIS_CONNECTION_MANAGER_SECURITY);

		roleRequis_ConnectionManager_SecurityEClass = createEClass(ROLE_REQUIS_CONNECTION_MANAGER_SECURITY);

		roleFournis_Security_ConnectionEClass = createEClass(ROLE_FOURNIS_SECURITY_CONNECTION);

		roleRequis_Security_ConnectionEClass = createEClass(ROLE_REQUIS_SECURITY_CONNECTION);

		roleFournis_Security_DatabaseEClass = createEClass(ROLE_FOURNIS_SECURITY_DATABASE);

		roleRequis_Security_DatabaseEClass = createEClass(ROLE_REQUIS_SECURITY_DATABASE);

		roleFournis_Database_ConnectionEClass = createEClass(ROLE_FOURNIS_DATABASE_CONNECTION);

		roleRequis_Database_ConnectionEClass = createEClass(ROLE_REQUIS_DATABASE_CONNECTION);

		roleFournis_Database_SecurityEClass = createEClass(ROLE_FOURNIS_DATABASE_SECURITY);

		roleRequis_Database_SecurityEClass = createEClass(ROLE_REQUIS_DATABASE_SECURITY);

		portRequisConfigCSEClass = createEClass(PORT_REQUIS_CONFIG_CS);

		portFournisCSEClass = createEClass(PORT_FOURNIS_CS);

		serveurDetailEClass = createEClass(SERVEUR_DETAIL);
		createEReference(serveurDetailEClass, SERVEUR_DETAIL__CONNECTIONMANAGER);
		createEReference(serveurDetailEClass, SERVEUR_DETAIL__SECURITYMANAGER);
		createEReference(serveurDetailEClass, SERVEUR_DETAIL__DATABASE);
		createEReference(serveurDetailEClass, SERVEUR_DETAIL__CONNECTEURSERVEURD);
		createEReference(serveurDetailEClass, SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_FOURNIS_ROLE_DATABASE_REQUIS);
		createEReference(serveurDetailEClass, SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_REQUIS_ROLE_DATABASE_FOURNIS);
		createEReference(serveurDetailEClass, SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_REQUIS_ROLE_SECURITY_FOURNIS);
		createEReference(serveurDetailEClass, SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_FOURNIS_ROLE_SECURITY_REQUIS);
		createEReference(serveurDetailEClass, SERVEUR_DETAIL__ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS);
		createEReference(serveurDetailEClass, SERVEUR_DETAIL__ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS);
		createEReference(serveurDetailEClass, SERVEUR_DETAIL__ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS);
		createEReference(serveurDetailEClass, SERVEUR_DETAIL__ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS);
		createEReference(serveurDetailEClass, SERVEUR_DETAIL__ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS);
		createEReference(serveurDetailEClass, SERVEUR_DETAIL__ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS);
		createEReference(serveurDetailEClass, SERVEUR_DETAIL__ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS);
		createEReference(serveurDetailEClass, SERVEUR_DETAIL__ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS);

		glueServeur2EClass = createEClass(GLUE_SERVEUR2);
		createEReference(glueServeur2EClass, GLUE_SERVEUR2__ROLEFOURNIS_CONNECTIONMANAGER_SECURITY);
		createEReference(glueServeur2EClass, GLUE_SERVEUR2__ROLEREQUIS_CONNECTIONMANAGER_SECURITY);

		glueServeur3EClass = createEClass(GLUE_SERVEUR3);
		createEReference(glueServeur3EClass, GLUE_SERVEUR3__ROLEFOURNIS_SECURITY_CONNECTION);
		createEReference(glueServeur3EClass, GLUE_SERVEUR3__ROLEREQUIS_SECURITY_CONNECTION);

		glueServeur4EClass = createEClass(GLUE_SERVEUR4);
		createEReference(glueServeur4EClass, GLUE_SERVEUR4__ROLEFOURNIS_SECURITY_DATABASE);
		createEReference(glueServeur4EClass, GLUE_SERVEUR4__ROLEREQUIS_SECURITY_DATABASE);

		glueServeur5EClass = createEClass(GLUE_SERVEUR5);
		createEReference(glueServeur5EClass, GLUE_SERVEUR5__ROLEFOURNIS_DATABASE_CONNECTION);
		createEReference(glueServeur5EClass, GLUE_SERVEUR5__ROLEREQUIS_DATABASE_CONNECTION);

		glueServeur6EClass = createEClass(GLUE_SERVEUR6);
		createEReference(glueServeur6EClass, GLUE_SERVEUR6__ROLEFOURNIS_DATABASE_SECURITY);
		createEReference(glueServeur6EClass, GLUE_SERVEUR6__ROLEREQUIS_DATABASE_SECURITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ProjecttArchitecturalPackage theProjecttArchitecturalPackage = (ProjecttArchitecturalPackage)EPackage.Registry.INSTANCE.getEPackage(ProjecttArchitecturalPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		connectionManagerEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getComposants());
		securityManagerEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getComposants());
		databaseEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getComposants());
		interfaceConnectionManagerEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getInterfaceComposants());
		interfaceSecurityManagerEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getInterfaceComposants());
		interfaceDatabaseEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getInterfaceComposants());
		portFournis_ConnectionManager_DatabaseEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getPortsComposantsFournis());
		portRequis_ConnectionManager_DatabaseEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getPortsComposantsRequis());
		portFournis_ConnectionManager_SecurityEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getPortsComposantsFournis());
		portRequis_ConnectionManager_SecurityEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getPortsComposantsRequis());
		portFournis_Security_ConnectionEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getPortsComposantsFournis());
		portRequis_Security_ConnectionEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getPortsComposantsRequis());
		portFournis_Security_DatabaseEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getPortsComposantsFournis());
		portRequis_Security_DatabaseEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getPortsComposantsRequis());
		portFournis_database_ConnectionEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getPortsComposantsFournis());
		portRequis_database_ConnectionEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getPortsComposantsRequis());
		portFournis_database_SecurityEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getPortsComposantsFournis());
		portRequis_database_SecurityEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getPortsComposantsRequis());
		attachment_connectionM_Fournis_role_database_RequisEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getAttachmentFournisRequis());
		attachment_connectionM_Requis_role_security_fournisEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getAttachmentsRequisFournis());
		attachment_connectionM_Fournis_role_security_RequisEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getAttachmentFournisRequis());
		attachment_connectionM_Requis_role_database_fournisEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getAttachmentsRequisFournis());
		attachment_Security_Requis_role_Connection_fournisEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getAttachmentsRequisFournis());
		attachment_Security_Fournis_role_Connection_RequisEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getAttachmentFournisRequis());
		attachment_Security_Requis_role_Database_fournisEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getAttachmentsRequisFournis());
		attachment_Security_Fournis_role_Database_RequisEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getAttachmentFournisRequis());
		attachment_Database_Requis_role_connection_fournisEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getAttachmentsRequisFournis());
		attachment_Database_Fournis_role_Connection_RequisEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getAttachmentFournisRequis());
		attachment_Database_Requis_role_Security_fournisEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getAttachmentsRequisFournis());
		attachment_Database_Fournis_role_Security_RequisEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getAttachmentFournisRequis());
		connecteurServeurDEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getConnecteurs());
		glueServeur1EClass.getESuperTypes().add(theProjecttArchitecturalPackage.getGlue());
		roleFournis_ConnectionManager_DatabaseEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getRoleConnecteursFournis());
		roleRequis_ConnectionManager_DatabaseEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getRoleConnecteursRequis());
		roleFournis_ConnectionManager_SecurityEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getRoleConnecteursFournis());
		roleRequis_ConnectionManager_SecurityEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getRoleConnecteursRequis());
		roleFournis_Security_ConnectionEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getRoleConnecteursFournis());
		roleRequis_Security_ConnectionEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getRoleConnecteursRequis());
		roleFournis_Security_DatabaseEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getRoleConnecteursFournis());
		roleRequis_Security_DatabaseEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getRoleConnecteursRequis());
		roleFournis_Database_ConnectionEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getRoleConnecteursFournis());
		roleRequis_Database_ConnectionEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getRoleConnecteursRequis());
		roleFournis_Database_SecurityEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getRoleConnecteursFournis());
		roleRequis_Database_SecurityEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getRoleConnecteursRequis());
		serveurDetailEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getConfigurations());
		glueServeur2EClass.getESuperTypes().add(theProjecttArchitecturalPackage.getGlue());
		glueServeur3EClass.getESuperTypes().add(theProjecttArchitecturalPackage.getGlue());
		glueServeur4EClass.getESuperTypes().add(theProjecttArchitecturalPackage.getGlue());
		glueServeur5EClass.getESuperTypes().add(theProjecttArchitecturalPackage.getGlue());
		glueServeur6EClass.getESuperTypes().add(theProjecttArchitecturalPackage.getGlue());

		// Initialize classes, features, and operations; add parameters
		initEClass(connectionManagerEClass, ConnectionManager.class, "ConnectionManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionManager_Interfaceconnectionmanager(), this.getInterfaceConnectionManager(), null, "interfaceconnectionmanager", null, 0, 1, ConnectionManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityManagerEClass, systeme.FonctionServeur.SecurityManager.class, "SecurityManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityManager_Interfacesecuritymanager(), this.getinterfaceSecurityManager(), null, "interfacesecuritymanager", null, 0, 1, systeme.FonctionServeur.SecurityManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseEClass, Database.class, "Database", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabase_Interfacedatabase(), this.getInterfaceDatabase(), null, "interfacedatabase", null, 0, 1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceConnectionManagerEClass, InterfaceConnectionManager.class, "InterfaceConnectionManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceConnectionManager_Portrequisconfigcs(), this.getPortRequisConfigCS(), null, "portrequisconfigcs", null, 0, 1, InterfaceConnectionManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceConnectionManager_Portfourniscs(), this.getPortFournisCS(), null, "portfourniscs", null, 0, 1, InterfaceConnectionManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceConnectionManager_Portfournis_connectionmanager_database(), this.getPortFournis_ConnectionManager_Database(), null, "portfournis_connectionmanager_database", null, 0, 1, InterfaceConnectionManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceConnectionManager_Portrequis_connectionmanager_database(), this.getPortRequis_ConnectionManager_Database(), null, "portrequis_connectionmanager_database", null, 0, 1, InterfaceConnectionManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceConnectionManager_Portfournis_connectionmanager_security(), this.getPortFournis_ConnectionManager_Security(), null, "portfournis_connectionmanager_security", null, 0, 1, InterfaceConnectionManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceConnectionManager_Portrequis_connectionmanager_security(), this.getPortRequis_ConnectionManager_Security(), null, "portrequis_connectionmanager_security", null, 0, 1, InterfaceConnectionManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceSecurityManagerEClass, interfaceSecurityManager.class, "interfaceSecurityManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getinterfaceSecurityManager_Portfournis_security_connection(), this.getPortFournis_Security_Connection(), null, "portfournis_security_connection", null, 0, 1, interfaceSecurityManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getinterfaceSecurityManager_Portrequis_security_connection(), this.getPortRequis_Security_Connection(), null, "portrequis_security_connection", null, 0, 1, interfaceSecurityManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getinterfaceSecurityManager_Portfournis_security_database(), this.getPortFournis_Security_Database(), null, "portfournis_security_database", null, 0, 1, interfaceSecurityManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getinterfaceSecurityManager_Portrequis_security_database(), this.getPortRequis_Security_Database(), null, "portrequis_security_database", null, 0, 1, interfaceSecurityManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceDatabaseEClass, InterfaceDatabase.class, "InterfaceDatabase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceDatabase_Portfournis_database_connection(), this.getPortFournis_database_Connection(), null, "portfournis_database_connection", null, 0, 1, InterfaceDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceDatabase_Portrequis_database_connection(), this.getPortRequis_database_Connection(), null, "portrequis_database_connection", null, 0, 1, InterfaceDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceDatabase_Portfournis_database_security(), this.getPortFournis_database_Security(), null, "portfournis_database_security", null, 0, 1, InterfaceDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceDatabase_Portrequis_database_security(), this.getPortRequis_database_Security(), null, "portrequis_database_security", null, 0, 1, InterfaceDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portFournis_ConnectionManager_DatabaseEClass, PortFournis_ConnectionManager_Database.class, "PortFournis_ConnectionManager_Database", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portRequis_ConnectionManager_DatabaseEClass, PortRequis_ConnectionManager_Database.class, "PortRequis_ConnectionManager_Database", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portFournis_ConnectionManager_SecurityEClass, PortFournis_ConnectionManager_Security.class, "PortFournis_ConnectionManager_Security", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portRequis_ConnectionManager_SecurityEClass, PortRequis_ConnectionManager_Security.class, "PortRequis_ConnectionManager_Security", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portFournis_Security_ConnectionEClass, PortFournis_Security_Connection.class, "PortFournis_Security_Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portRequis_Security_ConnectionEClass, PortRequis_Security_Connection.class, "PortRequis_Security_Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portFournis_Security_DatabaseEClass, PortFournis_Security_Database.class, "PortFournis_Security_Database", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portRequis_Security_DatabaseEClass, PortRequis_Security_Database.class, "PortRequis_Security_Database", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portFournis_database_ConnectionEClass, PortFournis_database_Connection.class, "PortFournis_database_Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portRequis_database_ConnectionEClass, PortRequis_database_Connection.class, "PortRequis_database_Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portFournis_database_SecurityEClass, PortFournis_database_Security.class, "PortFournis_database_Security", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portRequis_database_SecurityEClass, PortRequis_database_Security.class, "PortRequis_database_Security", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attachment_connectionM_Fournis_role_database_RequisEClass, attachment_connectionM_Fournis_role_database_Requis.class, "attachment_connectionM_Fournis_role_database_Requis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getattachment_connectionM_Fournis_role_database_Requis_Portfournis_connectionmanager_database(), this.getPortFournis_ConnectionManager_Database(), null, "portfournis_connectionmanager_database", null, 0, 1, attachment_connectionM_Fournis_role_database_Requis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getattachment_connectionM_Fournis_role_database_Requis_Rolerequis_database_connection(), this.getRoleRequis_Database_Connection(), null, "rolerequis_database_connection", null, 0, 1, attachment_connectionM_Fournis_role_database_Requis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachment_connectionM_Requis_role_security_fournisEClass, attachment_connectionM_Requis_role_security_fournis.class, "attachment_connectionM_Requis_role_security_fournis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getattachment_connectionM_Requis_role_security_fournis_Portrequis_connectionmanager_security(), this.getPortRequis_ConnectionManager_Security(), null, "portrequis_connectionmanager_security", null, 0, 1, attachment_connectionM_Requis_role_security_fournis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getattachment_connectionM_Requis_role_security_fournis_Rolefournis_security_connection(), this.getRoleFournis_Security_Connection(), null, "rolefournis_security_connection", null, 0, 1, attachment_connectionM_Requis_role_security_fournis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachment_connectionM_Fournis_role_security_RequisEClass, attachment_connectionM_Fournis_role_security_Requis.class, "attachment_connectionM_Fournis_role_security_Requis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getattachment_connectionM_Fournis_role_security_Requis_Portfournis_connectionmanager_security(), this.getPortFournis_ConnectionManager_Security(), null, "portfournis_connectionmanager_security", null, 0, 1, attachment_connectionM_Fournis_role_security_Requis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getattachment_connectionM_Fournis_role_security_Requis_Rolerequis_security_connection(), this.getRoleRequis_Security_Connection(), null, "rolerequis_security_connection", null, 0, 1, attachment_connectionM_Fournis_role_security_Requis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachment_connectionM_Requis_role_database_fournisEClass, attachment_connectionM_Requis_role_database_fournis.class, "attachment_connectionM_Requis_role_database_fournis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getattachment_connectionM_Requis_role_database_fournis_Portrequis_connectionmanager_database(), this.getPortRequis_ConnectionManager_Database(), null, "portrequis_connectionmanager_database", null, 0, 1, attachment_connectionM_Requis_role_database_fournis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getattachment_connectionM_Requis_role_database_fournis_Rolefournis_database_connection(), this.getRoleFournis_Database_Connection(), null, "rolefournis_database_connection", null, 0, 1, attachment_connectionM_Requis_role_database_fournis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachment_Security_Requis_role_Connection_fournisEClass, attachment_Security_Requis_role_Connection_fournis.class, "attachment_Security_Requis_role_Connection_fournis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getattachment_Security_Requis_role_Connection_fournis_Portrequis_security_connection(), this.getPortRequis_Security_Connection(), null, "portrequis_security_connection", null, 0, 1, attachment_Security_Requis_role_Connection_fournis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getattachment_Security_Requis_role_Connection_fournis_Rolefournis_connectionmanager_security(), this.getRoleFournis_ConnectionManager_Security(), null, "rolefournis_connectionmanager_security", null, 0, 1, attachment_Security_Requis_role_Connection_fournis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachment_Security_Fournis_role_Connection_RequisEClass, attachment_Security_Fournis_role_Connection_Requis.class, "attachment_Security_Fournis_role_Connection_Requis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getattachment_Security_Fournis_role_Connection_Requis_Portfournis_security_connection(), this.getPortFournis_Security_Connection(), null, "portfournis_security_connection", null, 0, 1, attachment_Security_Fournis_role_Connection_Requis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getattachment_Security_Fournis_role_Connection_Requis_Rolerequis_connectionmanager_security(), this.getRoleRequis_ConnectionManager_Security(), null, "rolerequis_connectionmanager_security", null, 0, 1, attachment_Security_Fournis_role_Connection_Requis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachment_Security_Requis_role_Database_fournisEClass, attachment_Security_Requis_role_Database_fournis.class, "attachment_Security_Requis_role_Database_fournis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getattachment_Security_Requis_role_Database_fournis_Portrequis_security_database(), this.getPortRequis_Security_Database(), null, "portrequis_security_database", null, 0, 1, attachment_Security_Requis_role_Database_fournis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getattachment_Security_Requis_role_Database_fournis_Rolefournis_database_security(), this.getRoleFournis_Database_Security(), null, "rolefournis_database_security", null, 0, 1, attachment_Security_Requis_role_Database_fournis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachment_Security_Fournis_role_Database_RequisEClass, attachment_Security_Fournis_role_Database_Requis.class, "attachment_Security_Fournis_role_Database_Requis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getattachment_Security_Fournis_role_Database_Requis_Rolerequis_database_security(), this.getRoleRequis_Database_Security(), null, "rolerequis_database_security", null, 0, 1, attachment_Security_Fournis_role_Database_Requis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getattachment_Security_Fournis_role_Database_Requis_Portfournis_security_database(), this.getPortFournis_Security_Database(), null, "portfournis_security_database", null, 0, 1, attachment_Security_Fournis_role_Database_Requis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachment_Database_Requis_role_connection_fournisEClass, attachment_Database_Requis_role_connection_fournis.class, "attachment_Database_Requis_role_connection_fournis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getattachment_Database_Requis_role_connection_fournis_Portrequis_database_connection(), this.getPortRequis_database_Connection(), null, "portrequis_database_connection", null, 0, 1, attachment_Database_Requis_role_connection_fournis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getattachment_Database_Requis_role_connection_fournis_Rolefournis_connectionmanager_database(), this.getRoleFournis_ConnectionManager_Database(), null, "rolefournis_connectionmanager_database", null, 0, 1, attachment_Database_Requis_role_connection_fournis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachment_Database_Fournis_role_Connection_RequisEClass, attachment_Database_Fournis_role_Connection_Requis.class, "attachment_Database_Fournis_role_Connection_Requis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getattachment_Database_Fournis_role_Connection_Requis_Portfournis_database_connection(), this.getPortFournis_database_Connection(), null, "portfournis_database_connection", null, 0, 1, attachment_Database_Fournis_role_Connection_Requis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getattachment_Database_Fournis_role_Connection_Requis_Rolerequis_connectionmanager_database(), this.getRoleRequis_ConnectionManager_Database(), null, "rolerequis_connectionmanager_database", null, 0, 1, attachment_Database_Fournis_role_Connection_Requis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachment_Database_Requis_role_Security_fournisEClass, attachment_Database_Requis_role_Security_fournis.class, "attachment_Database_Requis_role_Security_fournis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getattachment_Database_Requis_role_Security_fournis_Portrequis_database_security(), this.getPortRequis_database_Security(), null, "portrequis_database_security", null, 0, 1, attachment_Database_Requis_role_Security_fournis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getattachment_Database_Requis_role_Security_fournis_Rolefournis_security_database(), this.getRoleFournis_Security_Database(), null, "rolefournis_security_database", null, 0, 1, attachment_Database_Requis_role_Security_fournis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachment_Database_Fournis_role_Security_RequisEClass, attachment_Database_Fournis_role_Security_Requis.class, "attachment_Database_Fournis_role_Security_Requis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getattachment_Database_Fournis_role_Security_Requis_Portfournis_database_security(), this.getPortFournis_database_Security(), null, "portfournis_database_security", null, 0, 1, attachment_Database_Fournis_role_Security_Requis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getattachment_Database_Fournis_role_Security_Requis_Rolerequis_security_database(), this.getRoleRequis_Security_Database(), null, "rolerequis_security_database", null, 0, 1, attachment_Database_Fournis_role_Security_Requis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connecteurServeurDEClass, ConnecteurServeurD.class, "ConnecteurServeurD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnecteurServeurD_Glueserveur1(), this.getGlueServeur1(), null, "glueserveur1", null, 0, 1, ConnecteurServeurD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnecteurServeurD_Glueserveur2(), this.getGlueServeur2(), null, "glueserveur2", null, 0, 1, ConnecteurServeurD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnecteurServeurD_Glueserveur3(), this.getGlueServeur3(), null, "glueserveur3", null, 0, 1, ConnecteurServeurD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnecteurServeurD_Glueserveur4(), this.getGlueServeur4(), null, "glueserveur4", null, 0, 1, ConnecteurServeurD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnecteurServeurD_Glueserveur5(), this.getGlueServeur5(), null, "glueserveur5", null, 0, 1, ConnecteurServeurD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnecteurServeurD_Glueserveur6(), this.getGlueServeur6(), null, "glueserveur6", null, 0, 1, ConnecteurServeurD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnecteurServeurD_Rolefournis_connectionmanager_database(), this.getRoleFournis_ConnectionManager_Database(), null, "rolefournis_connectionmanager_database", null, 0, 1, ConnecteurServeurD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnecteurServeurD_Rolerequis_connectionmanager_database(), this.getRoleRequis_ConnectionManager_Database(), null, "rolerequis_connectionmanager_database", null, 0, 1, ConnecteurServeurD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnecteurServeurD_Rolefournis_connectionmanager_security(), this.getRoleFournis_ConnectionManager_Security(), null, "rolefournis_connectionmanager_security", null, 0, 1, ConnecteurServeurD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnecteurServeurD_Rolerequis_connectionmanager_security(), this.getRoleRequis_ConnectionManager_Security(), null, "rolerequis_connectionmanager_security", null, 0, 1, ConnecteurServeurD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnecteurServeurD_Rolefournis_security_connection(), this.getRoleFournis_Security_Connection(), null, "rolefournis_security_connection", null, 0, 1, ConnecteurServeurD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnecteurServeurD_Rolerequis_security_connection(), this.getRoleRequis_Security_Connection(), null, "rolerequis_security_connection", null, 0, 1, ConnecteurServeurD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnecteurServeurD_Rolefournis_security_database(), this.getRoleFournis_Security_Database(), null, "rolefournis_security_database", null, 0, 1, ConnecteurServeurD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnecteurServeurD_Rolerequis_security_database(), this.getRoleRequis_Security_Database(), null, "rolerequis_security_database", null, 0, 1, ConnecteurServeurD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnecteurServeurD_Rolefournis_database_connection(), this.getRoleFournis_Database_Connection(), null, "rolefournis_database_connection", null, 0, 1, ConnecteurServeurD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnecteurServeurD_Rolerequis_database_connection(), this.getRoleRequis_Database_Connection(), null, "rolerequis_database_connection", null, 0, 1, ConnecteurServeurD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnecteurServeurD_Rolefournis_database_security(), this.getRoleFournis_Database_Security(), null, "rolefournis_database_security", null, 0, 1, ConnecteurServeurD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnecteurServeurD_Rolerequis_database_security(), this.getRoleRequis_Database_Security(), null, "rolerequis_database_security", null, 0, 1, ConnecteurServeurD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glueServeur1EClass, Glue.class, "GlueServeur1", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlueServeur1_Rolefournis_connectionmanager_database(), this.getRoleFournis_ConnectionManager_Database(), null, "rolefournis_connectionmanager_database", null, 0, 1, Glue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlueServeur1_Rolerequis_connectionmanager_database(), this.getRoleRequis_ConnectionManager_Database(), null, "rolerequis_connectionmanager_database", null, 0, 1, Glue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleFournis_ConnectionManager_DatabaseEClass, RoleConnecteursFournis.class, "RoleFournis_ConnectionManager_Database", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleRequis_ConnectionManager_DatabaseEClass, RoleConnecteursRequis.class, "RoleRequis_ConnectionManager_Database", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleFournis_ConnectionManager_SecurityEClass, RoleFournis_ConnectionManager_Security.class, "RoleFournis_ConnectionManager_Security", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleRequis_ConnectionManager_SecurityEClass, RoleRequis_ConnectionManager_Security.class, "RoleRequis_ConnectionManager_Security", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleFournis_Security_ConnectionEClass, RoleFournis_Security_Connection.class, "RoleFournis_Security_Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleRequis_Security_ConnectionEClass, RoleRequis_Security_Connection.class, "RoleRequis_Security_Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleFournis_Security_DatabaseEClass, RoleFournis_Security_Database.class, "RoleFournis_Security_Database", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleRequis_Security_DatabaseEClass, RoleRequis_Security_Database.class, "RoleRequis_Security_Database", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleFournis_Database_ConnectionEClass, RoleFournis_Database_Connection.class, "RoleFournis_Database_Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleRequis_Database_ConnectionEClass, RoleRequis_Database_Connection.class, "RoleRequis_Database_Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleFournis_Database_SecurityEClass, RoleFournis_Database_Security.class, "RoleFournis_Database_Security", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleRequis_Database_SecurityEClass, RoleRequis_Database_Security.class, "RoleRequis_Database_Security", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portRequisConfigCSEClass, PortRequisConfigCS.class, "PortRequisConfigCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portFournisCSEClass, PortFournisCS.class, "PortFournisCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serveurDetailEClass, ServeurDetail.class, "ServeurDetail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServeurDetail_Connectionmanager(), this.getConnectionManager(), null, "connectionmanager", null, 0, 1, ServeurDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetail_Securitymanager(), this.getSecurityManager(), null, "securitymanager", null, 0, 1, ServeurDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetail_Database(), this.getDatabase(), null, "database", null, 0, 1, ServeurDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetail_Connecteurserveurd(), this.getConnecteurServeurD(), null, "connecteurserveurd", null, 0, 1, ServeurDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetail_Attachment_connectionm_fournis_role_database_requis(), this.getattachment_connectionM_Fournis_role_database_Requis(), null, "attachment_connectionm_fournis_role_database_requis", null, 0, 1, ServeurDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetail_Attachment_connectionm_requis_role_database_fournis(), this.getattachment_connectionM_Requis_role_database_fournis(), null, "attachment_connectionm_requis_role_database_fournis", null, 0, 1, ServeurDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetail_Attachment_connectionm_requis_role_security_fournis(), this.getattachment_connectionM_Requis_role_security_fournis(), null, "attachment_connectionm_requis_role_security_fournis", null, 0, 1, ServeurDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetail_Attachment_connectionm_fournis_role_security_requis(), this.getattachment_connectionM_Fournis_role_security_Requis(), null, "attachment_connectionm_fournis_role_security_requis", null, 0, 1, ServeurDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetail_Attachment_security_requis_role_connection_fournis(), this.getattachment_Security_Requis_role_Connection_fournis(), null, "attachment_security_requis_role_connection_fournis", null, 0, 1, ServeurDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetail_Attachment_security_fournis_role_connection_requis(), this.getattachment_Security_Fournis_role_Connection_Requis(), null, "attachment_security_fournis_role_connection_requis", null, 0, 1, ServeurDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetail_Attachment_security_requis_role_database_fournis(), this.getattachment_Security_Requis_role_Database_fournis(), null, "attachment_security_requis_role_database_fournis", null, 0, 1, ServeurDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetail_Attachment_security_fournis_role_database_requis(), this.getattachment_Security_Fournis_role_Database_Requis(), null, "attachment_security_fournis_role_database_requis", null, 0, 1, ServeurDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetail_Attachment_database_requis_role_connection_fournis(), this.getattachment_Database_Requis_role_connection_fournis(), null, "attachment_database_requis_role_connection_fournis", null, 0, 1, ServeurDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetail_Attachment_database_fournis_role_connection_requis(), this.getattachment_Database_Fournis_role_Connection_Requis(), null, "attachment_database_fournis_role_connection_requis", null, 0, 1, ServeurDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetail_Attachment_database_requis_role_security_fournis(), this.getattachment_Database_Requis_role_Security_fournis(), null, "attachment_database_requis_role_security_fournis", null, 0, 1, ServeurDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServeurDetail_Attachment_database_fournis_role_security_requis(), this.getattachment_Database_Fournis_role_Security_Requis(), null, "attachment_database_fournis_role_security_requis", null, 0, 1, ServeurDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glueServeur2EClass, Glue.class, "GlueServeur2", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlueServeur2_Rolefournis_connectionmanager_security(), this.getRoleFournis_ConnectionManager_Security(), null, "rolefournis_connectionmanager_security", null, 0, 1, Glue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlueServeur2_Rolerequis_connectionmanager_security(), this.getRoleRequis_ConnectionManager_Security(), null, "rolerequis_connectionmanager_security", null, 0, 1, Glue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glueServeur3EClass, Glue.class, "GlueServeur3", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlueServeur3_Rolefournis_security_connection(), this.getRoleFournis_Security_Connection(), null, "rolefournis_security_connection", null, 0, 1, Glue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlueServeur3_Rolerequis_security_connection(), this.getRoleRequis_Security_Connection(), null, "rolerequis_security_connection", null, 0, 1, Glue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glueServeur4EClass, Glue.class, "GlueServeur4", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlueServeur4_Rolefournis_security_database(), this.getRoleFournis_Security_Database(), null, "rolefournis_security_database", null, 0, 1, Glue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlueServeur4_Rolerequis_security_database(), this.getRoleRequis_Security_Database(), null, "rolerequis_security_database", null, 0, 1, Glue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glueServeur5EClass, Glue.class, "GlueServeur5", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlueServeur5_Rolefournis_database_connection(), this.getRoleFournis_Database_Connection(), null, "rolefournis_database_connection", null, 0, 1, Glue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlueServeur5_Rolerequis_database_connection(), this.getRoleRequis_Database_Connection(), null, "rolerequis_database_connection", null, 0, 1, Glue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glueServeur6EClass, Glue.class, "GlueServeur6", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlueServeur6_Rolefournis_database_security(), this.getRoleFournis_Database_Security(), null, "rolefournis_database_security", null, 0, 1, Glue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlueServeur6_Rolerequis_database_security(), this.getRoleRequis_Database_Security(), null, "rolerequis_database_security", null, 0, 1, Glue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //FonctionServeurPackageImpl
