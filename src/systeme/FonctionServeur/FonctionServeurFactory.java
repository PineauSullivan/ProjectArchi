/**
 */
package systeme.FonctionServeur;

import org.eclipse.emf.ecore.EFactory;

import projecttArchitectural.Glue;
import projecttArchitectural.RoleConnecteursFournis;
import projecttArchitectural.RoleConnecteursRequis;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see systeme.FonctionServeur.FonctionServeurPackage
 * @generated
 */
public interface FonctionServeurFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FonctionServeurFactory eINSTANCE = systeme.FonctionServeur.impl.FonctionServeurFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Connection Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Manager</em>'.
	 * @generated
	 */
	ConnectionManager createConnectionManager();

	/**
	 * Returns a new object of class '<em>Security Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Manager</em>'.
	 * @generated
	 */
	SecurityManager createSecurityManager();

	/**
	 * Returns a new object of class '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database</em>'.
	 * @generated
	 */
	Database createDatabase();

	/**
	 * Returns a new object of class '<em>Interface Connection Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Connection Manager</em>'.
	 * @generated
	 */
	InterfaceConnectionManager createInterfaceConnectionManager();

	/**
	 * Returns a new object of class '<em>interface Security Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>interface Security Manager</em>'.
	 * @generated
	 */
	interfaceSecurityManager createinterfaceSecurityManager();

	/**
	 * Returns a new object of class '<em>Interface Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Database</em>'.
	 * @generated
	 */
	InterfaceDatabase createInterfaceDatabase();

	/**
	 * Returns a new object of class '<em>Port Fournis Connection Manager Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Fournis Connection Manager Database</em>'.
	 * @generated
	 */
	PortFournis_ConnectionManager_Database createPortFournis_ConnectionManager_Database();

	/**
	 * Returns a new object of class '<em>Port Requis Connection Manager Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Requis Connection Manager Database</em>'.
	 * @generated
	 */
	PortRequis_ConnectionManager_Database createPortRequis_ConnectionManager_Database();

	/**
	 * Returns a new object of class '<em>Port Fournis Connection Manager Security</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Fournis Connection Manager Security</em>'.
	 * @generated
	 */
	PortFournis_ConnectionManager_Security createPortFournis_ConnectionManager_Security();

	/**
	 * Returns a new object of class '<em>Port Requis Connection Manager Security</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Requis Connection Manager Security</em>'.
	 * @generated
	 */
	PortRequis_ConnectionManager_Security createPortRequis_ConnectionManager_Security();

	/**
	 * Returns a new object of class '<em>Port Fournis Security Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Fournis Security Connection</em>'.
	 * @generated
	 */
	PortFournis_Security_Connection createPortFournis_Security_Connection();

	/**
	 * Returns a new object of class '<em>Port Requis Security Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Requis Security Connection</em>'.
	 * @generated
	 */
	PortRequis_Security_Connection createPortRequis_Security_Connection();

	/**
	 * Returns a new object of class '<em>Port Fournis Security Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Fournis Security Database</em>'.
	 * @generated
	 */
	PortFournis_Security_Database createPortFournis_Security_Database();

	/**
	 * Returns a new object of class '<em>Port Requis Security Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Requis Security Database</em>'.
	 * @generated
	 */
	PortRequis_Security_Database createPortRequis_Security_Database();

	/**
	 * Returns a new object of class '<em>Port Fournis database Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Fournis database Connection</em>'.
	 * @generated
	 */
	PortFournis_database_Connection createPortFournis_database_Connection();

	/**
	 * Returns a new object of class '<em>Port Requis database Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Requis database Connection</em>'.
	 * @generated
	 */
	PortRequis_database_Connection createPortRequis_database_Connection();

	/**
	 * Returns a new object of class '<em>Port Fournis database Security</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Fournis database Security</em>'.
	 * @generated
	 */
	PortFournis_database_Security createPortFournis_database_Security();

	/**
	 * Returns a new object of class '<em>Port Requis database Security</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Requis database Security</em>'.
	 * @generated
	 */
	PortRequis_database_Security createPortRequis_database_Security();

	/**
	 * Returns a new object of class '<em>attachment connection MFournis role database Requis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>attachment connection MFournis role database Requis</em>'.
	 * @generated
	 */
	attachment_connectionM_Fournis_role_database_Requis createattachment_connectionM_Fournis_role_database_Requis();

	/**
	 * Returns a new object of class '<em>attachment connection MRequis role security fournis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>attachment connection MRequis role security fournis</em>'.
	 * @generated
	 */
	attachment_connectionM_Requis_role_security_fournis createattachment_connectionM_Requis_role_security_fournis();

	/**
	 * Returns a new object of class '<em>attachment connection MFournis role security Requis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>attachment connection MFournis role security Requis</em>'.
	 * @generated
	 */
	attachment_connectionM_Fournis_role_security_Requis createattachment_connectionM_Fournis_role_security_Requis();

	/**
	 * Returns a new object of class '<em>attachment connection MRequis role database fournis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>attachment connection MRequis role database fournis</em>'.
	 * @generated
	 */
	attachment_connectionM_Requis_role_database_fournis createattachment_connectionM_Requis_role_database_fournis();

	/**
	 * Returns a new object of class '<em>attachment Security Requis role Connection fournis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>attachment Security Requis role Connection fournis</em>'.
	 * @generated
	 */
	attachment_Security_Requis_role_Connection_fournis createattachment_Security_Requis_role_Connection_fournis();

	/**
	 * Returns a new object of class '<em>attachment Security Fournis role Connection Requis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>attachment Security Fournis role Connection Requis</em>'.
	 * @generated
	 */
	attachment_Security_Fournis_role_Connection_Requis createattachment_Security_Fournis_role_Connection_Requis();

	/**
	 * Returns a new object of class '<em>attachment Security Requis role Database fournis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>attachment Security Requis role Database fournis</em>'.
	 * @generated
	 */
	attachment_Security_Requis_role_Database_fournis createattachment_Security_Requis_role_Database_fournis();

	/**
	 * Returns a new object of class '<em>attachment Security Fournis role Database Requis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>attachment Security Fournis role Database Requis</em>'.
	 * @generated
	 */
	attachment_Security_Fournis_role_Database_Requis createattachment_Security_Fournis_role_Database_Requis();

	/**
	 * Returns a new object of class '<em>attachment Database Requis role connection fournis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>attachment Database Requis role connection fournis</em>'.
	 * @generated
	 */
	attachment_Database_Requis_role_connection_fournis createattachment_Database_Requis_role_connection_fournis();

	/**
	 * Returns a new object of class '<em>attachment Database Fournis role Connection Requis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>attachment Database Fournis role Connection Requis</em>'.
	 * @generated
	 */
	attachment_Database_Fournis_role_Connection_Requis createattachment_Database_Fournis_role_Connection_Requis();

	/**
	 * Returns a new object of class '<em>attachment Database Requis role Security fournis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>attachment Database Requis role Security fournis</em>'.
	 * @generated
	 */
	attachment_Database_Requis_role_Security_fournis createattachment_Database_Requis_role_Security_fournis();

	/**
	 * Returns a new object of class '<em>attachment Database Fournis role Security Requis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>attachment Database Fournis role Security Requis</em>'.
	 * @generated
	 */
	attachment_Database_Fournis_role_Security_Requis createattachment_Database_Fournis_role_Security_Requis();

	/**
	 * Returns a new object of class '<em>Connecteur Serveur D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connecteur Serveur D</em>'.
	 * @generated
	 */
	ConnecteurServeurD createConnecteurServeurD();

	/**
	 * Returns a new object of class '<em>Glue Serveur1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glue Serveur1</em>'.
	 * @generated
	 */
	Glue createGlueServeur1();

	/**
	 * Returns a new object of class '<em>Role Fournis Connection Manager Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Fournis Connection Manager Database</em>'.
	 * @generated
	 */
	RoleConnecteursFournis createRoleFournis_ConnectionManager_Database();

	/**
	 * Returns a new object of class '<em>Role Requis Connection Manager Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Requis Connection Manager Database</em>'.
	 * @generated
	 */
	RoleConnecteursRequis createRoleRequis_ConnectionManager_Database();

	/**
	 * Returns a new object of class '<em>Role Fournis Connection Manager Security</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Fournis Connection Manager Security</em>'.
	 * @generated
	 */
	RoleFournis_ConnectionManager_Security createRoleFournis_ConnectionManager_Security();

	/**
	 * Returns a new object of class '<em>Role Requis Connection Manager Security</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Requis Connection Manager Security</em>'.
	 * @generated
	 */
	RoleRequis_ConnectionManager_Security createRoleRequis_ConnectionManager_Security();

	/**
	 * Returns a new object of class '<em>Role Fournis Security Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Fournis Security Connection</em>'.
	 * @generated
	 */
	RoleFournis_Security_Connection createRoleFournis_Security_Connection();

	/**
	 * Returns a new object of class '<em>Role Requis Security Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Requis Security Connection</em>'.
	 * @generated
	 */
	RoleRequis_Security_Connection createRoleRequis_Security_Connection();

	/**
	 * Returns a new object of class '<em>Role Fournis Security Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Fournis Security Database</em>'.
	 * @generated
	 */
	RoleFournis_Security_Database createRoleFournis_Security_Database();

	/**
	 * Returns a new object of class '<em>Role Requis Security Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Requis Security Database</em>'.
	 * @generated
	 */
	RoleRequis_Security_Database createRoleRequis_Security_Database();

	/**
	 * Returns a new object of class '<em>Role Fournis Database Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Fournis Database Connection</em>'.
	 * @generated
	 */
	RoleFournis_Database_Connection createRoleFournis_Database_Connection();

	/**
	 * Returns a new object of class '<em>Role Requis Database Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Requis Database Connection</em>'.
	 * @generated
	 */
	RoleRequis_Database_Connection createRoleRequis_Database_Connection();

	/**
	 * Returns a new object of class '<em>Role Fournis Database Security</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Fournis Database Security</em>'.
	 * @generated
	 */
	RoleFournis_Database_Security createRoleFournis_Database_Security();

	/**
	 * Returns a new object of class '<em>Role Requis Database Security</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Requis Database Security</em>'.
	 * @generated
	 */
	RoleRequis_Database_Security createRoleRequis_Database_Security();

	/**
	 * Returns a new object of class '<em>Port Requis Config CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Requis Config CS</em>'.
	 * @generated
	 */
	PortRequisConfigCS createPortRequisConfigCS();

	/**
	 * Returns a new object of class '<em>Port Fournis CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Fournis CS</em>'.
	 * @generated
	 */
	PortFournisCS createPortFournisCS();

	/**
	 * Returns a new object of class '<em>Serveur Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Serveur Detail</em>'.
	 * @generated
	 */
	ServeurDetail createServeurDetail();

	/**
	 * Returns a new object of class '<em>Glue Serveur2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glue Serveur2</em>'.
	 * @generated
	 */
	Glue createGlueServeur2();

	/**
	 * Returns a new object of class '<em>Glue Serveur3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glue Serveur3</em>'.
	 * @generated
	 */
	Glue createGlueServeur3();

	/**
	 * Returns a new object of class '<em>Glue Serveur4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glue Serveur4</em>'.
	 * @generated
	 */
	Glue createGlueServeur4();

	/**
	 * Returns a new object of class '<em>Glue Serveur5</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glue Serveur5</em>'.
	 * @generated
	 */
	Glue createGlueServeur5();

	/**
	 * Returns a new object of class '<em>Glue Serveur6</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glue Serveur6</em>'.
	 * @generated
	 */
	Glue createGlueServeur6();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FonctionServeurPackage getFonctionServeurPackage();

} //FonctionServeurFactory
