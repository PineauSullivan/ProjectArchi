/**
 */
package systeme.FonctionServeur.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import projecttArchitectural.Attachment;
import projecttArchitectural.AttachmentFournisRequis;
import projecttArchitectural.AttachmentsRequisFournis;
import projecttArchitectural.Composants;
import projecttArchitectural.Configurations;
import projecttArchitectural.Connecteurs;
import projecttArchitectural.Element;
import projecttArchitectural.Glue;
import projecttArchitectural.InterfaceComposants;
import projecttArchitectural.Lien;
import projecttArchitectural.PortsComposants;
import projecttArchitectural.PortsComposantsFournis;
import projecttArchitectural.PortsComposantsRequis;
import projecttArchitectural.RoleConnecteurs;
import projecttArchitectural.RoleConnecteursFournis;
import projecttArchitectural.RoleConnecteursRequis;
import systeme.FonctionServeur.ConnecteurServeurD;
import systeme.FonctionServeur.ConnectionManager;
import systeme.FonctionServeur.Database;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see systeme.FonctionServeur.FonctionServeurPackage
 * @generated
 */
public class FonctionServeurSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FonctionServeurPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FonctionServeurSwitch() {
		if (modelPackage == null) {
			modelPackage = FonctionServeurPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FonctionServeurPackage.CONNECTION_MANAGER: {
				ConnectionManager connectionManager = (ConnectionManager)theEObject;
				T result = caseConnectionManager(connectionManager);
				if (result == null) result = caseComposants(connectionManager);
				if (result == null) result = caseElement(connectionManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.SECURITY_MANAGER: {
				systeme.FonctionServeur.SecurityManager securityManager = (systeme.FonctionServeur.SecurityManager)theEObject;
				T result = caseSecurityManager(securityManager);
				if (result == null) result = caseComposants(securityManager);
				if (result == null) result = caseElement(securityManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.DATABASE: {
				Database database = (Database)theEObject;
				T result = caseDatabase(database);
				if (result == null) result = caseComposants(database);
				if (result == null) result = caseElement(database);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER: {
				InterfaceConnectionManager interfaceConnectionManager = (InterfaceConnectionManager)theEObject;
				T result = caseInterfaceConnectionManager(interfaceConnectionManager);
				if (result == null) result = caseInterfaceComposants(interfaceConnectionManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.INTERFACE_SECURITY_MANAGER: {
				interfaceSecurityManager interfaceSecurityManager = (interfaceSecurityManager)theEObject;
				T result = caseinterfaceSecurityManager(interfaceSecurityManager);
				if (result == null) result = caseInterfaceComposants(interfaceSecurityManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.INTERFACE_DATABASE: {
				InterfaceDatabase interfaceDatabase = (InterfaceDatabase)theEObject;
				T result = caseInterfaceDatabase(interfaceDatabase);
				if (result == null) result = caseInterfaceComposants(interfaceDatabase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.PORT_FOURNIS_CONNECTION_MANAGER_DATABASE: {
				PortFournis_ConnectionManager_Database portFournis_ConnectionManager_Database = (PortFournis_ConnectionManager_Database)theEObject;
				T result = casePortFournis_ConnectionManager_Database(portFournis_ConnectionManager_Database);
				if (result == null) result = casePortsComposantsFournis(portFournis_ConnectionManager_Database);
				if (result == null) result = casePortsComposants(portFournis_ConnectionManager_Database);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.PORT_REQUIS_CONNECTION_MANAGER_DATABASE: {
				PortRequis_ConnectionManager_Database portRequis_ConnectionManager_Database = (PortRequis_ConnectionManager_Database)theEObject;
				T result = casePortRequis_ConnectionManager_Database(portRequis_ConnectionManager_Database);
				if (result == null) result = casePortsComposantsRequis(portRequis_ConnectionManager_Database);
				if (result == null) result = casePortsComposants(portRequis_ConnectionManager_Database);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.PORT_FOURNIS_CONNECTION_MANAGER_SECURITY: {
				PortFournis_ConnectionManager_Security portFournis_ConnectionManager_Security = (PortFournis_ConnectionManager_Security)theEObject;
				T result = casePortFournis_ConnectionManager_Security(portFournis_ConnectionManager_Security);
				if (result == null) result = casePortsComposantsFournis(portFournis_ConnectionManager_Security);
				if (result == null) result = casePortsComposants(portFournis_ConnectionManager_Security);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.PORT_REQUIS_CONNECTION_MANAGER_SECURITY: {
				PortRequis_ConnectionManager_Security portRequis_ConnectionManager_Security = (PortRequis_ConnectionManager_Security)theEObject;
				T result = casePortRequis_ConnectionManager_Security(portRequis_ConnectionManager_Security);
				if (result == null) result = casePortsComposantsRequis(portRequis_ConnectionManager_Security);
				if (result == null) result = casePortsComposants(portRequis_ConnectionManager_Security);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.PORT_FOURNIS_SECURITY_CONNECTION: {
				PortFournis_Security_Connection portFournis_Security_Connection = (PortFournis_Security_Connection)theEObject;
				T result = casePortFournis_Security_Connection(portFournis_Security_Connection);
				if (result == null) result = casePortsComposantsFournis(portFournis_Security_Connection);
				if (result == null) result = casePortsComposants(portFournis_Security_Connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.PORT_REQUIS_SECURITY_CONNECTION: {
				PortRequis_Security_Connection portRequis_Security_Connection = (PortRequis_Security_Connection)theEObject;
				T result = casePortRequis_Security_Connection(portRequis_Security_Connection);
				if (result == null) result = casePortsComposantsRequis(portRequis_Security_Connection);
				if (result == null) result = casePortsComposants(portRequis_Security_Connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.PORT_FOURNIS_SECURITY_DATABASE: {
				PortFournis_Security_Database portFournis_Security_Database = (PortFournis_Security_Database)theEObject;
				T result = casePortFournis_Security_Database(portFournis_Security_Database);
				if (result == null) result = casePortsComposantsFournis(portFournis_Security_Database);
				if (result == null) result = casePortsComposants(portFournis_Security_Database);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.PORT_REQUIS_SECURITY_DATABASE: {
				PortRequis_Security_Database portRequis_Security_Database = (PortRequis_Security_Database)theEObject;
				T result = casePortRequis_Security_Database(portRequis_Security_Database);
				if (result == null) result = casePortsComposantsRequis(portRequis_Security_Database);
				if (result == null) result = casePortsComposants(portRequis_Security_Database);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.PORT_FOURNIS_DATABASE_CONNECTION: {
				PortFournis_database_Connection portFournis_database_Connection = (PortFournis_database_Connection)theEObject;
				T result = casePortFournis_database_Connection(portFournis_database_Connection);
				if (result == null) result = casePortsComposantsFournis(portFournis_database_Connection);
				if (result == null) result = casePortsComposants(portFournis_database_Connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.PORT_REQUIS_DATABASE_CONNECTION: {
				PortRequis_database_Connection portRequis_database_Connection = (PortRequis_database_Connection)theEObject;
				T result = casePortRequis_database_Connection(portRequis_database_Connection);
				if (result == null) result = casePortsComposantsRequis(portRequis_database_Connection);
				if (result == null) result = casePortsComposants(portRequis_database_Connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.PORT_FOURNIS_DATABASE_SECURITY: {
				PortFournis_database_Security portFournis_database_Security = (PortFournis_database_Security)theEObject;
				T result = casePortFournis_database_Security(portFournis_database_Security);
				if (result == null) result = casePortsComposantsFournis(portFournis_database_Security);
				if (result == null) result = casePortsComposants(portFournis_database_Security);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.PORT_REQUIS_DATABASE_SECURITY: {
				PortRequis_database_Security portRequis_database_Security = (PortRequis_database_Security)theEObject;
				T result = casePortRequis_database_Security(portRequis_database_Security);
				if (result == null) result = casePortsComposantsRequis(portRequis_database_Security);
				if (result == null) result = casePortsComposants(portRequis_database_Security);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MFOURNIS_ROLE_DATABASE_REQUIS: {
				attachment_connectionM_Fournis_role_database_Requis attachment_connectionM_Fournis_role_database_Requis = (attachment_connectionM_Fournis_role_database_Requis)theEObject;
				T result = caseattachment_connectionM_Fournis_role_database_Requis(attachment_connectionM_Fournis_role_database_Requis);
				if (result == null) result = caseAttachmentFournisRequis(attachment_connectionM_Fournis_role_database_Requis);
				if (result == null) result = caseAttachment(attachment_connectionM_Fournis_role_database_Requis);
				if (result == null) result = caseLien(attachment_connectionM_Fournis_role_database_Requis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MREQUIS_ROLE_SECURITY_FOURNIS: {
				attachment_connectionM_Requis_role_security_fournis attachment_connectionM_Requis_role_security_fournis = (attachment_connectionM_Requis_role_security_fournis)theEObject;
				T result = caseattachment_connectionM_Requis_role_security_fournis(attachment_connectionM_Requis_role_security_fournis);
				if (result == null) result = caseAttachmentsRequisFournis(attachment_connectionM_Requis_role_security_fournis);
				if (result == null) result = caseAttachment(attachment_connectionM_Requis_role_security_fournis);
				if (result == null) result = caseLien(attachment_connectionM_Requis_role_security_fournis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MFOURNIS_ROLE_SECURITY_REQUIS: {
				attachment_connectionM_Fournis_role_security_Requis attachment_connectionM_Fournis_role_security_Requis = (attachment_connectionM_Fournis_role_security_Requis)theEObject;
				T result = caseattachment_connectionM_Fournis_role_security_Requis(attachment_connectionM_Fournis_role_security_Requis);
				if (result == null) result = caseAttachmentFournisRequis(attachment_connectionM_Fournis_role_security_Requis);
				if (result == null) result = caseAttachment(attachment_connectionM_Fournis_role_security_Requis);
				if (result == null) result = caseLien(attachment_connectionM_Fournis_role_security_Requis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MREQUIS_ROLE_DATABASE_FOURNIS: {
				attachment_connectionM_Requis_role_database_fournis attachment_connectionM_Requis_role_database_fournis = (attachment_connectionM_Requis_role_database_fournis)theEObject;
				T result = caseattachment_connectionM_Requis_role_database_fournis(attachment_connectionM_Requis_role_database_fournis);
				if (result == null) result = caseAttachmentsRequisFournis(attachment_connectionM_Requis_role_database_fournis);
				if (result == null) result = caseAttachment(attachment_connectionM_Requis_role_database_fournis);
				if (result == null) result = caseLien(attachment_connectionM_Requis_role_database_fournis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS: {
				attachment_Security_Requis_role_Connection_fournis attachment_Security_Requis_role_Connection_fournis = (attachment_Security_Requis_role_Connection_fournis)theEObject;
				T result = caseattachment_Security_Requis_role_Connection_fournis(attachment_Security_Requis_role_Connection_fournis);
				if (result == null) result = caseAttachmentsRequisFournis(attachment_Security_Requis_role_Connection_fournis);
				if (result == null) result = caseAttachment(attachment_Security_Requis_role_Connection_fournis);
				if (result == null) result = caseLien(attachment_Security_Requis_role_Connection_fournis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS: {
				attachment_Security_Fournis_role_Connection_Requis attachment_Security_Fournis_role_Connection_Requis = (attachment_Security_Fournis_role_Connection_Requis)theEObject;
				T result = caseattachment_Security_Fournis_role_Connection_Requis(attachment_Security_Fournis_role_Connection_Requis);
				if (result == null) result = caseAttachmentFournisRequis(attachment_Security_Fournis_role_Connection_Requis);
				if (result == null) result = caseAttachment(attachment_Security_Fournis_role_Connection_Requis);
				if (result == null) result = caseLien(attachment_Security_Fournis_role_Connection_Requis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS: {
				attachment_Security_Requis_role_Database_fournis attachment_Security_Requis_role_Database_fournis = (attachment_Security_Requis_role_Database_fournis)theEObject;
				T result = caseattachment_Security_Requis_role_Database_fournis(attachment_Security_Requis_role_Database_fournis);
				if (result == null) result = caseAttachmentsRequisFournis(attachment_Security_Requis_role_Database_fournis);
				if (result == null) result = caseAttachment(attachment_Security_Requis_role_Database_fournis);
				if (result == null) result = caseLien(attachment_Security_Requis_role_Database_fournis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS: {
				attachment_Security_Fournis_role_Database_Requis attachment_Security_Fournis_role_Database_Requis = (attachment_Security_Fournis_role_Database_Requis)theEObject;
				T result = caseattachment_Security_Fournis_role_Database_Requis(attachment_Security_Fournis_role_Database_Requis);
				if (result == null) result = caseAttachmentFournisRequis(attachment_Security_Fournis_role_Database_Requis);
				if (result == null) result = caseAttachment(attachment_Security_Fournis_role_Database_Requis);
				if (result == null) result = caseLien(attachment_Security_Fournis_role_Database_Requis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS: {
				attachment_Database_Requis_role_connection_fournis attachment_Database_Requis_role_connection_fournis = (attachment_Database_Requis_role_connection_fournis)theEObject;
				T result = caseattachment_Database_Requis_role_connection_fournis(attachment_Database_Requis_role_connection_fournis);
				if (result == null) result = caseAttachmentsRequisFournis(attachment_Database_Requis_role_connection_fournis);
				if (result == null) result = caseAttachment(attachment_Database_Requis_role_connection_fournis);
				if (result == null) result = caseLien(attachment_Database_Requis_role_connection_fournis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS: {
				attachment_Database_Fournis_role_Connection_Requis attachment_Database_Fournis_role_Connection_Requis = (attachment_Database_Fournis_role_Connection_Requis)theEObject;
				T result = caseattachment_Database_Fournis_role_Connection_Requis(attachment_Database_Fournis_role_Connection_Requis);
				if (result == null) result = caseAttachmentFournisRequis(attachment_Database_Fournis_role_Connection_Requis);
				if (result == null) result = caseAttachment(attachment_Database_Fournis_role_Connection_Requis);
				if (result == null) result = caseLien(attachment_Database_Fournis_role_Connection_Requis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS: {
				attachment_Database_Requis_role_Security_fournis attachment_Database_Requis_role_Security_fournis = (attachment_Database_Requis_role_Security_fournis)theEObject;
				T result = caseattachment_Database_Requis_role_Security_fournis(attachment_Database_Requis_role_Security_fournis);
				if (result == null) result = caseAttachmentsRequisFournis(attachment_Database_Requis_role_Security_fournis);
				if (result == null) result = caseAttachment(attachment_Database_Requis_role_Security_fournis);
				if (result == null) result = caseLien(attachment_Database_Requis_role_Security_fournis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS: {
				attachment_Database_Fournis_role_Security_Requis attachment_Database_Fournis_role_Security_Requis = (attachment_Database_Fournis_role_Security_Requis)theEObject;
				T result = caseattachment_Database_Fournis_role_Security_Requis(attachment_Database_Fournis_role_Security_Requis);
				if (result == null) result = caseAttachmentFournisRequis(attachment_Database_Fournis_role_Security_Requis);
				if (result == null) result = caseAttachment(attachment_Database_Fournis_role_Security_Requis);
				if (result == null) result = caseLien(attachment_Database_Fournis_role_Security_Requis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D: {
				ConnecteurServeurD connecteurServeurD = (ConnecteurServeurD)theEObject;
				T result = caseConnecteurServeurD(connecteurServeurD);
				if (result == null) result = caseConnecteurs(connecteurServeurD);
				if (result == null) result = caseElement(connecteurServeurD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.GLUE_SERVEUR1: {
				Glue glueServeur1 = (Glue)theEObject;
				T result = caseGlueServeur1(glueServeur1);
				if (result == null) result = caseGlue(glueServeur1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.ROLE_FOURNIS_CONNECTION_MANAGER_DATABASE: {
				RoleConnecteursFournis roleFournis_ConnectionManager_Database = (RoleConnecteursFournis)theEObject;
				T result = caseRoleFournis_ConnectionManager_Database(roleFournis_ConnectionManager_Database);
				if (result == null) result = caseRoleConnecteursFournis(roleFournis_ConnectionManager_Database);
				if (result == null) result = caseRoleConnecteurs(roleFournis_ConnectionManager_Database);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.ROLE_REQUIS_CONNECTION_MANAGER_DATABASE: {
				RoleConnecteursRequis roleRequis_ConnectionManager_Database = (RoleConnecteursRequis)theEObject;
				T result = caseRoleRequis_ConnectionManager_Database(roleRequis_ConnectionManager_Database);
				if (result == null) result = caseRoleConnecteursRequis(roleRequis_ConnectionManager_Database);
				if (result == null) result = caseRoleConnecteurs(roleRequis_ConnectionManager_Database);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.ROLE_FOURNIS_CONNECTION_MANAGER_SECURITY: {
				RoleFournis_ConnectionManager_Security roleFournis_ConnectionManager_Security = (RoleFournis_ConnectionManager_Security)theEObject;
				T result = caseRoleFournis_ConnectionManager_Security(roleFournis_ConnectionManager_Security);
				if (result == null) result = caseRoleConnecteursFournis(roleFournis_ConnectionManager_Security);
				if (result == null) result = caseRoleConnecteurs(roleFournis_ConnectionManager_Security);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.ROLE_REQUIS_CONNECTION_MANAGER_SECURITY: {
				RoleRequis_ConnectionManager_Security roleRequis_ConnectionManager_Security = (RoleRequis_ConnectionManager_Security)theEObject;
				T result = caseRoleRequis_ConnectionManager_Security(roleRequis_ConnectionManager_Security);
				if (result == null) result = caseRoleConnecteursRequis(roleRequis_ConnectionManager_Security);
				if (result == null) result = caseRoleConnecteurs(roleRequis_ConnectionManager_Security);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.ROLE_FOURNIS_SECURITY_CONNECTION: {
				RoleFournis_Security_Connection roleFournis_Security_Connection = (RoleFournis_Security_Connection)theEObject;
				T result = caseRoleFournis_Security_Connection(roleFournis_Security_Connection);
				if (result == null) result = caseRoleConnecteursFournis(roleFournis_Security_Connection);
				if (result == null) result = caseRoleConnecteurs(roleFournis_Security_Connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.ROLE_REQUIS_SECURITY_CONNECTION: {
				RoleRequis_Security_Connection roleRequis_Security_Connection = (RoleRequis_Security_Connection)theEObject;
				T result = caseRoleRequis_Security_Connection(roleRequis_Security_Connection);
				if (result == null) result = caseRoleConnecteursRequis(roleRequis_Security_Connection);
				if (result == null) result = caseRoleConnecteurs(roleRequis_Security_Connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.ROLE_FOURNIS_SECURITY_DATABASE: {
				RoleFournis_Security_Database roleFournis_Security_Database = (RoleFournis_Security_Database)theEObject;
				T result = caseRoleFournis_Security_Database(roleFournis_Security_Database);
				if (result == null) result = caseRoleConnecteursFournis(roleFournis_Security_Database);
				if (result == null) result = caseRoleConnecteurs(roleFournis_Security_Database);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.ROLE_REQUIS_SECURITY_DATABASE: {
				RoleRequis_Security_Database roleRequis_Security_Database = (RoleRequis_Security_Database)theEObject;
				T result = caseRoleRequis_Security_Database(roleRequis_Security_Database);
				if (result == null) result = caseRoleConnecteursRequis(roleRequis_Security_Database);
				if (result == null) result = caseRoleConnecteurs(roleRequis_Security_Database);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.ROLE_FOURNIS_DATABASE_CONNECTION: {
				RoleFournis_Database_Connection roleFournis_Database_Connection = (RoleFournis_Database_Connection)theEObject;
				T result = caseRoleFournis_Database_Connection(roleFournis_Database_Connection);
				if (result == null) result = caseRoleConnecteursFournis(roleFournis_Database_Connection);
				if (result == null) result = caseRoleConnecteurs(roleFournis_Database_Connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.ROLE_REQUIS_DATABASE_CONNECTION: {
				RoleRequis_Database_Connection roleRequis_Database_Connection = (RoleRequis_Database_Connection)theEObject;
				T result = caseRoleRequis_Database_Connection(roleRequis_Database_Connection);
				if (result == null) result = caseRoleConnecteursRequis(roleRequis_Database_Connection);
				if (result == null) result = caseRoleConnecteurs(roleRequis_Database_Connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.ROLE_FOURNIS_DATABASE_SECURITY: {
				RoleFournis_Database_Security roleFournis_Database_Security = (RoleFournis_Database_Security)theEObject;
				T result = caseRoleFournis_Database_Security(roleFournis_Database_Security);
				if (result == null) result = caseRoleConnecteursFournis(roleFournis_Database_Security);
				if (result == null) result = caseRoleConnecteurs(roleFournis_Database_Security);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.ROLE_REQUIS_DATABASE_SECURITY: {
				RoleRequis_Database_Security roleRequis_Database_Security = (RoleRequis_Database_Security)theEObject;
				T result = caseRoleRequis_Database_Security(roleRequis_Database_Security);
				if (result == null) result = caseRoleConnecteursRequis(roleRequis_Database_Security);
				if (result == null) result = caseRoleConnecteurs(roleRequis_Database_Security);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.PORT_REQUIS_CONFIG_CS: {
				PortRequisConfigCS portRequisConfigCS = (PortRequisConfigCS)theEObject;
				T result = casePortRequisConfigCS(portRequisConfigCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.PORT_FOURNIS_CS: {
				PortFournisCS portFournisCS = (PortFournisCS)theEObject;
				T result = casePortFournisCS(portFournisCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.SERVEUR_DETAIL: {
				ServeurDetail serveurDetail = (ServeurDetail)theEObject;
				T result = caseServeurDetail(serveurDetail);
				if (result == null) result = caseConfigurations(serveurDetail);
				if (result == null) result = caseElement(serveurDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.GLUE_SERVEUR2: {
				Glue glueServeur2 = (Glue)theEObject;
				T result = caseGlueServeur2(glueServeur2);
				if (result == null) result = caseGlue(glueServeur2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.GLUE_SERVEUR3: {
				Glue glueServeur3 = (Glue)theEObject;
				T result = caseGlueServeur3(glueServeur3);
				if (result == null) result = caseGlue(glueServeur3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.GLUE_SERVEUR4: {
				Glue glueServeur4 = (Glue)theEObject;
				T result = caseGlueServeur4(glueServeur4);
				if (result == null) result = caseGlue(glueServeur4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.GLUE_SERVEUR5: {
				Glue glueServeur5 = (Glue)theEObject;
				T result = caseGlueServeur5(glueServeur5);
				if (result == null) result = caseGlue(glueServeur5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FonctionServeurPackage.GLUE_SERVEUR6: {
				Glue glueServeur6 = (Glue)theEObject;
				T result = caseGlueServeur6(glueServeur6);
				if (result == null) result = caseGlue(glueServeur6);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionManager(ConnectionManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityManager(systeme.FonctionServeur.SecurityManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabase(Database object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Connection Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Connection Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceConnectionManager(InterfaceConnectionManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>interface Security Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>interface Security Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseinterfaceSecurityManager(interfaceSecurityManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceDatabase(InterfaceDatabase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Fournis Connection Manager Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Fournis Connection Manager Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortFournis_ConnectionManager_Database(PortFournis_ConnectionManager_Database object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Requis Connection Manager Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Requis Connection Manager Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortRequis_ConnectionManager_Database(PortRequis_ConnectionManager_Database object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Fournis Connection Manager Security</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Fournis Connection Manager Security</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortFournis_ConnectionManager_Security(PortFournis_ConnectionManager_Security object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Requis Connection Manager Security</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Requis Connection Manager Security</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortRequis_ConnectionManager_Security(PortRequis_ConnectionManager_Security object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Fournis Security Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Fournis Security Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortFournis_Security_Connection(PortFournis_Security_Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Requis Security Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Requis Security Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortRequis_Security_Connection(PortRequis_Security_Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Fournis Security Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Fournis Security Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortFournis_Security_Database(PortFournis_Security_Database object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Requis Security Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Requis Security Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortRequis_Security_Database(PortRequis_Security_Database object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Fournis database Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Fournis database Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortFournis_database_Connection(PortFournis_database_Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Requis database Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Requis database Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortRequis_database_Connection(PortRequis_database_Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Fournis database Security</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Fournis database Security</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortFournis_database_Security(PortFournis_database_Security object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Requis database Security</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Requis database Security</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortRequis_database_Security(PortRequis_database_Security object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>attachment connection MFournis role database Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>attachment connection MFournis role database Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseattachment_connectionM_Fournis_role_database_Requis(attachment_connectionM_Fournis_role_database_Requis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>attachment connection MRequis role security fournis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>attachment connection MRequis role security fournis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseattachment_connectionM_Requis_role_security_fournis(attachment_connectionM_Requis_role_security_fournis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>attachment connection MFournis role security Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>attachment connection MFournis role security Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseattachment_connectionM_Fournis_role_security_Requis(attachment_connectionM_Fournis_role_security_Requis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>attachment connection MRequis role database fournis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>attachment connection MRequis role database fournis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseattachment_connectionM_Requis_role_database_fournis(attachment_connectionM_Requis_role_database_fournis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>attachment Security Requis role Connection fournis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>attachment Security Requis role Connection fournis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseattachment_Security_Requis_role_Connection_fournis(attachment_Security_Requis_role_Connection_fournis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>attachment Security Fournis role Connection Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>attachment Security Fournis role Connection Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseattachment_Security_Fournis_role_Connection_Requis(attachment_Security_Fournis_role_Connection_Requis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>attachment Security Requis role Database fournis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>attachment Security Requis role Database fournis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseattachment_Security_Requis_role_Database_fournis(attachment_Security_Requis_role_Database_fournis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>attachment Security Fournis role Database Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>attachment Security Fournis role Database Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseattachment_Security_Fournis_role_Database_Requis(attachment_Security_Fournis_role_Database_Requis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>attachment Database Requis role connection fournis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>attachment Database Requis role connection fournis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseattachment_Database_Requis_role_connection_fournis(attachment_Database_Requis_role_connection_fournis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>attachment Database Fournis role Connection Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>attachment Database Fournis role Connection Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseattachment_Database_Fournis_role_Connection_Requis(attachment_Database_Fournis_role_Connection_Requis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>attachment Database Requis role Security fournis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>attachment Database Requis role Security fournis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseattachment_Database_Requis_role_Security_fournis(attachment_Database_Requis_role_Security_fournis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>attachment Database Fournis role Security Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>attachment Database Fournis role Security Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseattachment_Database_Fournis_role_Security_Requis(attachment_Database_Fournis_role_Security_Requis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connecteur Serveur D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connecteur Serveur D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnecteurServeurD(ConnecteurServeurD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glue Serveur1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glue Serveur1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlueServeur1(Glue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Fournis Connection Manager Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Fournis Connection Manager Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleFournis_ConnectionManager_Database(RoleConnecteursFournis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Requis Connection Manager Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Requis Connection Manager Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleRequis_ConnectionManager_Database(RoleConnecteursRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Fournis Connection Manager Security</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Fournis Connection Manager Security</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleFournis_ConnectionManager_Security(RoleFournis_ConnectionManager_Security object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Requis Connection Manager Security</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Requis Connection Manager Security</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleRequis_ConnectionManager_Security(RoleRequis_ConnectionManager_Security object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Fournis Security Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Fournis Security Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleFournis_Security_Connection(RoleFournis_Security_Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Requis Security Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Requis Security Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleRequis_Security_Connection(RoleRequis_Security_Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Fournis Security Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Fournis Security Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleFournis_Security_Database(RoleFournis_Security_Database object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Requis Security Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Requis Security Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleRequis_Security_Database(RoleRequis_Security_Database object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Fournis Database Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Fournis Database Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleFournis_Database_Connection(RoleFournis_Database_Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Requis Database Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Requis Database Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleRequis_Database_Connection(RoleRequis_Database_Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Fournis Database Security</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Fournis Database Security</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleFournis_Database_Security(RoleFournis_Database_Security object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Requis Database Security</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Requis Database Security</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleRequis_Database_Security(RoleRequis_Database_Security object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Requis Config CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Requis Config CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortRequisConfigCS(PortRequisConfigCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Fournis CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Fournis CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortFournisCS(PortFournisCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serveur Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serveur Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServeurDetail(ServeurDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glue Serveur2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glue Serveur2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlueServeur2(Glue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glue Serveur3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glue Serveur3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlueServeur3(Glue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glue Serveur4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glue Serveur4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlueServeur4(Glue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glue Serveur5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glue Serveur5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlueServeur5(Glue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glue Serveur6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glue Serveur6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlueServeur6(Glue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composants</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composants</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposants(Composants object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Composants</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Composants</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceComposants(InterfaceComposants object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ports Composants</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ports Composants</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortsComposants(PortsComposants object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ports Composants Fournis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ports Composants Fournis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortsComposantsFournis(PortsComposantsFournis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ports Composants Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ports Composants Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortsComposantsRequis(PortsComposantsRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLien(Lien object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment(Attachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment Fournis Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment Fournis Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachmentFournisRequis(AttachmentFournisRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachments Requis Fournis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachments Requis Fournis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachmentsRequisFournis(AttachmentsRequisFournis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connecteurs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connecteurs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnecteurs(Connecteurs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlue(Glue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Connecteurs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Connecteurs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleConnecteurs(RoleConnecteurs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Connecteurs Fournis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Connecteurs Fournis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleConnecteursFournis(RoleConnecteursFournis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Connecteurs Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Connecteurs Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleConnecteursRequis(RoleConnecteursRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configurations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configurations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurations(Configurations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FonctionServeurSwitch
