/**
 */
package systeme.FonctionServeur.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see systeme.FonctionServeur.FonctionServeurPackage
 * @generated
 */
public class FonctionServeurAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FonctionServeurPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FonctionServeurAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FonctionServeurPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FonctionServeurSwitch<Adapter> modelSwitch =
		new FonctionServeurSwitch<Adapter>() {
			@Override
			public Adapter caseConnectionManager(ConnectionManager object) {
				return createConnectionManagerAdapter();
			}
			@Override
			public Adapter caseSecurityManager(systeme.FonctionServeur.SecurityManager object) {
				return createSecurityManagerAdapter();
			}
			@Override
			public Adapter caseDatabase(Database object) {
				return createDatabaseAdapter();
			}
			@Override
			public Adapter caseInterfaceConnectionManager(InterfaceConnectionManager object) {
				return createInterfaceConnectionManagerAdapter();
			}
			@Override
			public Adapter caseinterfaceSecurityManager(interfaceSecurityManager object) {
				return createinterfaceSecurityManagerAdapter();
			}
			@Override
			public Adapter caseInterfaceDatabase(InterfaceDatabase object) {
				return createInterfaceDatabaseAdapter();
			}
			@Override
			public Adapter casePortFournis_ConnectionManager_Database(PortFournis_ConnectionManager_Database object) {
				return createPortFournis_ConnectionManager_DatabaseAdapter();
			}
			@Override
			public Adapter casePortRequis_ConnectionManager_Database(PortRequis_ConnectionManager_Database object) {
				return createPortRequis_ConnectionManager_DatabaseAdapter();
			}
			@Override
			public Adapter casePortFournis_ConnectionManager_Security(PortFournis_ConnectionManager_Security object) {
				return createPortFournis_ConnectionManager_SecurityAdapter();
			}
			@Override
			public Adapter casePortRequis_ConnectionManager_Security(PortRequis_ConnectionManager_Security object) {
				return createPortRequis_ConnectionManager_SecurityAdapter();
			}
			@Override
			public Adapter casePortFournis_Security_Connection(PortFournis_Security_Connection object) {
				return createPortFournis_Security_ConnectionAdapter();
			}
			@Override
			public Adapter casePortRequis_Security_Connection(PortRequis_Security_Connection object) {
				return createPortRequis_Security_ConnectionAdapter();
			}
			@Override
			public Adapter casePortFournis_Security_Database(PortFournis_Security_Database object) {
				return createPortFournis_Security_DatabaseAdapter();
			}
			@Override
			public Adapter casePortRequis_Security_Database(PortRequis_Security_Database object) {
				return createPortRequis_Security_DatabaseAdapter();
			}
			@Override
			public Adapter casePortFournis_database_Connection(PortFournis_database_Connection object) {
				return createPortFournis_database_ConnectionAdapter();
			}
			@Override
			public Adapter casePortRequis_database_Connection(PortRequis_database_Connection object) {
				return createPortRequis_database_ConnectionAdapter();
			}
			@Override
			public Adapter casePortFournis_database_Security(PortFournis_database_Security object) {
				return createPortFournis_database_SecurityAdapter();
			}
			@Override
			public Adapter casePortRequis_database_Security(PortRequis_database_Security object) {
				return createPortRequis_database_SecurityAdapter();
			}
			@Override
			public Adapter caseattachment_connectionM_Fournis_role_database_Requis(attachment_connectionM_Fournis_role_database_Requis object) {
				return createattachment_connectionM_Fournis_role_database_RequisAdapter();
			}
			@Override
			public Adapter caseattachment_connectionM_Requis_role_security_fournis(attachment_connectionM_Requis_role_security_fournis object) {
				return createattachment_connectionM_Requis_role_security_fournisAdapter();
			}
			@Override
			public Adapter caseattachment_connectionM_Fournis_role_security_Requis(attachment_connectionM_Fournis_role_security_Requis object) {
				return createattachment_connectionM_Fournis_role_security_RequisAdapter();
			}
			@Override
			public Adapter caseattachment_connectionM_Requis_role_database_fournis(attachment_connectionM_Requis_role_database_fournis object) {
				return createattachment_connectionM_Requis_role_database_fournisAdapter();
			}
			@Override
			public Adapter caseattachment_Security_Requis_role_Connection_fournis(attachment_Security_Requis_role_Connection_fournis object) {
				return createattachment_Security_Requis_role_Connection_fournisAdapter();
			}
			@Override
			public Adapter caseattachment_Security_Fournis_role_Connection_Requis(attachment_Security_Fournis_role_Connection_Requis object) {
				return createattachment_Security_Fournis_role_Connection_RequisAdapter();
			}
			@Override
			public Adapter caseattachment_Security_Requis_role_Database_fournis(attachment_Security_Requis_role_Database_fournis object) {
				return createattachment_Security_Requis_role_Database_fournisAdapter();
			}
			@Override
			public Adapter caseattachment_Security_Fournis_role_Database_Requis(attachment_Security_Fournis_role_Database_Requis object) {
				return createattachment_Security_Fournis_role_Database_RequisAdapter();
			}
			@Override
			public Adapter caseattachment_Database_Requis_role_connection_fournis(attachment_Database_Requis_role_connection_fournis object) {
				return createattachment_Database_Requis_role_connection_fournisAdapter();
			}
			@Override
			public Adapter caseattachment_Database_Fournis_role_Connection_Requis(attachment_Database_Fournis_role_Connection_Requis object) {
				return createattachment_Database_Fournis_role_Connection_RequisAdapter();
			}
			@Override
			public Adapter caseattachment_Database_Requis_role_Security_fournis(attachment_Database_Requis_role_Security_fournis object) {
				return createattachment_Database_Requis_role_Security_fournisAdapter();
			}
			@Override
			public Adapter caseattachment_Database_Fournis_role_Security_Requis(attachment_Database_Fournis_role_Security_Requis object) {
				return createattachment_Database_Fournis_role_Security_RequisAdapter();
			}
			@Override
			public Adapter caseConnecteurServeurD(ConnecteurServeurD object) {
				return createConnecteurServeurDAdapter();
			}
			@Override
			public Adapter caseGlueServeur1(Glue object) {
				return createGlueServeur1Adapter();
			}
			@Override
			public Adapter caseRoleFournis_ConnectionManager_Database(RoleConnecteursFournis object) {
				return createRoleFournis_ConnectionManager_DatabaseAdapter();
			}
			@Override
			public Adapter caseRoleRequis_ConnectionManager_Database(RoleConnecteursRequis object) {
				return createRoleRequis_ConnectionManager_DatabaseAdapter();
			}
			@Override
			public Adapter caseRoleFournis_ConnectionManager_Security(RoleFournis_ConnectionManager_Security object) {
				return createRoleFournis_ConnectionManager_SecurityAdapter();
			}
			@Override
			public Adapter caseRoleRequis_ConnectionManager_Security(RoleRequis_ConnectionManager_Security object) {
				return createRoleRequis_ConnectionManager_SecurityAdapter();
			}
			@Override
			public Adapter caseRoleFournis_Security_Connection(RoleFournis_Security_Connection object) {
				return createRoleFournis_Security_ConnectionAdapter();
			}
			@Override
			public Adapter caseRoleRequis_Security_Connection(RoleRequis_Security_Connection object) {
				return createRoleRequis_Security_ConnectionAdapter();
			}
			@Override
			public Adapter caseRoleFournis_Security_Database(RoleFournis_Security_Database object) {
				return createRoleFournis_Security_DatabaseAdapter();
			}
			@Override
			public Adapter caseRoleRequis_Security_Database(RoleRequis_Security_Database object) {
				return createRoleRequis_Security_DatabaseAdapter();
			}
			@Override
			public Adapter caseRoleFournis_Database_Connection(RoleFournis_Database_Connection object) {
				return createRoleFournis_Database_ConnectionAdapter();
			}
			@Override
			public Adapter caseRoleRequis_Database_Connection(RoleRequis_Database_Connection object) {
				return createRoleRequis_Database_ConnectionAdapter();
			}
			@Override
			public Adapter caseRoleFournis_Database_Security(RoleFournis_Database_Security object) {
				return createRoleFournis_Database_SecurityAdapter();
			}
			@Override
			public Adapter caseRoleRequis_Database_Security(RoleRequis_Database_Security object) {
				return createRoleRequis_Database_SecurityAdapter();
			}
			@Override
			public Adapter casePortRequisConfigCS(PortRequisConfigCS object) {
				return createPortRequisConfigCSAdapter();
			}
			@Override
			public Adapter casePortFournisCS(PortFournisCS object) {
				return createPortFournisCSAdapter();
			}
			@Override
			public Adapter caseServeurDetail(ServeurDetail object) {
				return createServeurDetailAdapter();
			}
			@Override
			public Adapter caseGlueServeur2(Glue object) {
				return createGlueServeur2Adapter();
			}
			@Override
			public Adapter caseGlueServeur3(Glue object) {
				return createGlueServeur3Adapter();
			}
			@Override
			public Adapter caseGlueServeur4(Glue object) {
				return createGlueServeur4Adapter();
			}
			@Override
			public Adapter caseGlueServeur5(Glue object) {
				return createGlueServeur5Adapter();
			}
			@Override
			public Adapter caseGlueServeur6(Glue object) {
				return createGlueServeur6Adapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseComposants(Composants object) {
				return createComposantsAdapter();
			}
			@Override
			public Adapter caseInterfaceComposants(InterfaceComposants object) {
				return createInterfaceComposantsAdapter();
			}
			@Override
			public Adapter casePortsComposants(PortsComposants object) {
				return createPortsComposantsAdapter();
			}
			@Override
			public Adapter casePortsComposantsFournis(PortsComposantsFournis object) {
				return createPortsComposantsFournisAdapter();
			}
			@Override
			public Adapter casePortsComposantsRequis(PortsComposantsRequis object) {
				return createPortsComposantsRequisAdapter();
			}
			@Override
			public Adapter caseLien(Lien object) {
				return createLienAdapter();
			}
			@Override
			public Adapter caseAttachment(Attachment object) {
				return createAttachmentAdapter();
			}
			@Override
			public Adapter caseAttachmentFournisRequis(AttachmentFournisRequis object) {
				return createAttachmentFournisRequisAdapter();
			}
			@Override
			public Adapter caseAttachmentsRequisFournis(AttachmentsRequisFournis object) {
				return createAttachmentsRequisFournisAdapter();
			}
			@Override
			public Adapter caseConnecteurs(Connecteurs object) {
				return createConnecteursAdapter();
			}
			@Override
			public Adapter caseGlue(Glue object) {
				return createGlueAdapter();
			}
			@Override
			public Adapter caseRoleConnecteurs(RoleConnecteurs object) {
				return createRoleConnecteursAdapter();
			}
			@Override
			public Adapter caseRoleConnecteursFournis(RoleConnecteursFournis object) {
				return createRoleConnecteursFournisAdapter();
			}
			@Override
			public Adapter caseRoleConnecteursRequis(RoleConnecteursRequis object) {
				return createRoleConnecteursRequisAdapter();
			}
			@Override
			public Adapter caseConfigurations(Configurations object) {
				return createConfigurationsAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.ConnectionManager <em>Connection Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.ConnectionManager
	 * @generated
	 */
	public Adapter createConnectionManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.SecurityManager <em>Security Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.SecurityManager
	 * @generated
	 */
	public Adapter createSecurityManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.Database
	 * @generated
	 */
	public Adapter createDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.InterfaceConnectionManager <em>Interface Connection Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.InterfaceConnectionManager
	 * @generated
	 */
	public Adapter createInterfaceConnectionManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.interfaceSecurityManager <em>interface Security Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.interfaceSecurityManager
	 * @generated
	 */
	public Adapter createinterfaceSecurityManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.InterfaceDatabase <em>Interface Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.InterfaceDatabase
	 * @generated
	 */
	public Adapter createInterfaceDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.PortFournis_ConnectionManager_Database <em>Port Fournis Connection Manager Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.PortFournis_ConnectionManager_Database
	 * @generated
	 */
	public Adapter createPortFournis_ConnectionManager_DatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.PortRequis_ConnectionManager_Database <em>Port Requis Connection Manager Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.PortRequis_ConnectionManager_Database
	 * @generated
	 */
	public Adapter createPortRequis_ConnectionManager_DatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.PortFournis_ConnectionManager_Security <em>Port Fournis Connection Manager Security</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.PortFournis_ConnectionManager_Security
	 * @generated
	 */
	public Adapter createPortFournis_ConnectionManager_SecurityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.PortRequis_ConnectionManager_Security <em>Port Requis Connection Manager Security</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.PortRequis_ConnectionManager_Security
	 * @generated
	 */
	public Adapter createPortRequis_ConnectionManager_SecurityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.PortFournis_Security_Connection <em>Port Fournis Security Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.PortFournis_Security_Connection
	 * @generated
	 */
	public Adapter createPortFournis_Security_ConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.PortRequis_Security_Connection <em>Port Requis Security Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.PortRequis_Security_Connection
	 * @generated
	 */
	public Adapter createPortRequis_Security_ConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.PortFournis_Security_Database <em>Port Fournis Security Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.PortFournis_Security_Database
	 * @generated
	 */
	public Adapter createPortFournis_Security_DatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.PortRequis_Security_Database <em>Port Requis Security Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.PortRequis_Security_Database
	 * @generated
	 */
	public Adapter createPortRequis_Security_DatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.PortFournis_database_Connection <em>Port Fournis database Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.PortFournis_database_Connection
	 * @generated
	 */
	public Adapter createPortFournis_database_ConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.PortRequis_database_Connection <em>Port Requis database Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.PortRequis_database_Connection
	 * @generated
	 */
	public Adapter createPortRequis_database_ConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.PortFournis_database_Security <em>Port Fournis database Security</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.PortFournis_database_Security
	 * @generated
	 */
	public Adapter createPortFournis_database_SecurityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.PortRequis_database_Security <em>Port Requis database Security</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.PortRequis_database_Security
	 * @generated
	 */
	public Adapter createPortRequis_database_SecurityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.attachment_connectionM_Fournis_role_database_Requis <em>attachment connection MFournis role database Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.attachment_connectionM_Fournis_role_database_Requis
	 * @generated
	 */
	public Adapter createattachment_connectionM_Fournis_role_database_RequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.attachment_connectionM_Requis_role_security_fournis <em>attachment connection MRequis role security fournis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.attachment_connectionM_Requis_role_security_fournis
	 * @generated
	 */
	public Adapter createattachment_connectionM_Requis_role_security_fournisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.attachment_connectionM_Fournis_role_security_Requis <em>attachment connection MFournis role security Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.attachment_connectionM_Fournis_role_security_Requis
	 * @generated
	 */
	public Adapter createattachment_connectionM_Fournis_role_security_RequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.attachment_connectionM_Requis_role_database_fournis <em>attachment connection MRequis role database fournis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.attachment_connectionM_Requis_role_database_fournis
	 * @generated
	 */
	public Adapter createattachment_connectionM_Requis_role_database_fournisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.attachment_Security_Requis_role_Connection_fournis <em>attachment Security Requis role Connection fournis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.attachment_Security_Requis_role_Connection_fournis
	 * @generated
	 */
	public Adapter createattachment_Security_Requis_role_Connection_fournisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.attachment_Security_Fournis_role_Connection_Requis <em>attachment Security Fournis role Connection Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.attachment_Security_Fournis_role_Connection_Requis
	 * @generated
	 */
	public Adapter createattachment_Security_Fournis_role_Connection_RequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.attachment_Security_Requis_role_Database_fournis <em>attachment Security Requis role Database fournis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.attachment_Security_Requis_role_Database_fournis
	 * @generated
	 */
	public Adapter createattachment_Security_Requis_role_Database_fournisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.attachment_Security_Fournis_role_Database_Requis <em>attachment Security Fournis role Database Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.attachment_Security_Fournis_role_Database_Requis
	 * @generated
	 */
	public Adapter createattachment_Security_Fournis_role_Database_RequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.attachment_Database_Requis_role_connection_fournis <em>attachment Database Requis role connection fournis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.attachment_Database_Requis_role_connection_fournis
	 * @generated
	 */
	public Adapter createattachment_Database_Requis_role_connection_fournisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.attachment_Database_Fournis_role_Connection_Requis <em>attachment Database Fournis role Connection Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.attachment_Database_Fournis_role_Connection_Requis
	 * @generated
	 */
	public Adapter createattachment_Database_Fournis_role_Connection_RequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.attachment_Database_Requis_role_Security_fournis <em>attachment Database Requis role Security fournis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.attachment_Database_Requis_role_Security_fournis
	 * @generated
	 */
	public Adapter createattachment_Database_Requis_role_Security_fournisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.attachment_Database_Fournis_role_Security_Requis <em>attachment Database Fournis role Security Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.attachment_Database_Fournis_role_Security_Requis
	 * @generated
	 */
	public Adapter createattachment_Database_Fournis_role_Security_RequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.ConnecteurServeurD <em>Connecteur Serveur D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.ConnecteurServeurD
	 * @generated
	 */
	public Adapter createConnecteurServeurDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.Glue <em>Glue Serveur1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.Glue
	 * @generated
	 */
	public Adapter createGlueServeur1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.RoleConnecteursFournis <em>Role Fournis Connection Manager Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.RoleConnecteursFournis
	 * @generated
	 */
	public Adapter createRoleFournis_ConnectionManager_DatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.RoleConnecteursRequis <em>Role Requis Connection Manager Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.RoleConnecteursRequis
	 * @generated
	 */
	public Adapter createRoleRequis_ConnectionManager_DatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.RoleFournis_ConnectionManager_Security <em>Role Fournis Connection Manager Security</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.RoleFournis_ConnectionManager_Security
	 * @generated
	 */
	public Adapter createRoleFournis_ConnectionManager_SecurityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.RoleRequis_ConnectionManager_Security <em>Role Requis Connection Manager Security</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.RoleRequis_ConnectionManager_Security
	 * @generated
	 */
	public Adapter createRoleRequis_ConnectionManager_SecurityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.RoleFournis_Security_Connection <em>Role Fournis Security Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.RoleFournis_Security_Connection
	 * @generated
	 */
	public Adapter createRoleFournis_Security_ConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.RoleRequis_Security_Connection <em>Role Requis Security Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.RoleRequis_Security_Connection
	 * @generated
	 */
	public Adapter createRoleRequis_Security_ConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.RoleFournis_Security_Database <em>Role Fournis Security Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.RoleFournis_Security_Database
	 * @generated
	 */
	public Adapter createRoleFournis_Security_DatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.RoleRequis_Security_Database <em>Role Requis Security Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.RoleRequis_Security_Database
	 * @generated
	 */
	public Adapter createRoleRequis_Security_DatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.RoleFournis_Database_Connection <em>Role Fournis Database Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.RoleFournis_Database_Connection
	 * @generated
	 */
	public Adapter createRoleFournis_Database_ConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.RoleRequis_Database_Connection <em>Role Requis Database Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.RoleRequis_Database_Connection
	 * @generated
	 */
	public Adapter createRoleRequis_Database_ConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.RoleFournis_Database_Security <em>Role Fournis Database Security</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.RoleFournis_Database_Security
	 * @generated
	 */
	public Adapter createRoleFournis_Database_SecurityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.RoleRequis_Database_Security <em>Role Requis Database Security</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.RoleRequis_Database_Security
	 * @generated
	 */
	public Adapter createRoleRequis_Database_SecurityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.PortRequisConfigCS <em>Port Requis Config CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.PortRequisConfigCS
	 * @generated
	 */
	public Adapter createPortRequisConfigCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.PortFournisCS <em>Port Fournis CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.PortFournisCS
	 * @generated
	 */
	public Adapter createPortFournisCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.FonctionServeur.ServeurDetail <em>Serveur Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.FonctionServeur.ServeurDetail
	 * @generated
	 */
	public Adapter createServeurDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.Glue <em>Glue Serveur2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.Glue
	 * @generated
	 */
	public Adapter createGlueServeur2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.Glue <em>Glue Serveur3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.Glue
	 * @generated
	 */
	public Adapter createGlueServeur3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.Glue <em>Glue Serveur4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.Glue
	 * @generated
	 */
	public Adapter createGlueServeur4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.Glue <em>Glue Serveur5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.Glue
	 * @generated
	 */
	public Adapter createGlueServeur5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.Glue <em>Glue Serveur6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.Glue
	 * @generated
	 */
	public Adapter createGlueServeur6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.Composants <em>Composants</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.Composants
	 * @generated
	 */
	public Adapter createComposantsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.InterfaceComposants <em>Interface Composants</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.InterfaceComposants
	 * @generated
	 */
	public Adapter createInterfaceComposantsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.PortsComposants <em>Ports Composants</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.PortsComposants
	 * @generated
	 */
	public Adapter createPortsComposantsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.PortsComposantsFournis <em>Ports Composants Fournis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.PortsComposantsFournis
	 * @generated
	 */
	public Adapter createPortsComposantsFournisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.PortsComposantsRequis <em>Ports Composants Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.PortsComposantsRequis
	 * @generated
	 */
	public Adapter createPortsComposantsRequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.Lien <em>Lien</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.Lien
	 * @generated
	 */
	public Adapter createLienAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.Attachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.Attachment
	 * @generated
	 */
	public Adapter createAttachmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.AttachmentFournisRequis <em>Attachment Fournis Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.AttachmentFournisRequis
	 * @generated
	 */
	public Adapter createAttachmentFournisRequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.AttachmentsRequisFournis <em>Attachments Requis Fournis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.AttachmentsRequisFournis
	 * @generated
	 */
	public Adapter createAttachmentsRequisFournisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.Connecteurs <em>Connecteurs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.Connecteurs
	 * @generated
	 */
	public Adapter createConnecteursAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.Glue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.Glue
	 * @generated
	 */
	public Adapter createGlueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.RoleConnecteurs <em>Role Connecteurs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.RoleConnecteurs
	 * @generated
	 */
	public Adapter createRoleConnecteursAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.RoleConnecteursFournis <em>Role Connecteurs Fournis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.RoleConnecteursFournis
	 * @generated
	 */
	public Adapter createRoleConnecteursFournisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.RoleConnecteursRequis <em>Role Connecteurs Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.RoleConnecteursRequis
	 * @generated
	 */
	public Adapter createRoleConnecteursRequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.Configurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.Configurations
	 * @generated
	 */
	public Adapter createConfigurationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FonctionServeurAdapterFactory
