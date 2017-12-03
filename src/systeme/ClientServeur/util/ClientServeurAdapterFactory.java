/**
 */
package systeme.ClientServeur.util;

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

import systeme.ClientServeur.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see systeme.ClientServeur.ClientServeurPackage
 * @generated
 */
public class ClientServeurAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ClientServeurPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientServeurAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ClientServeurPackage.eINSTANCE;
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
	protected ClientServeurSwitch<Adapter> modelSwitch =
		new ClientServeurSwitch<Adapter>() {
			@Override
			public Adapter caseComposantClient(ComposantClient object) {
				return createComposantClientAdapter();
			}
			@Override
			public Adapter caseComposantServer(ComposantServer object) {
				return createComposantServerAdapter();
			}
			@Override
			public Adapter caseInterfaceClient(InterfaceClient object) {
				return createInterfaceClientAdapter();
			}
			@Override
			public Adapter caseInterfaceServeur(InterfaceServeur object) {
				return createInterfaceServeurAdapter();
			}
			@Override
			public Adapter casePort_Receive_Request(Port_Receive_Request object) {
				return createPort_Receive_RequestAdapter();
			}
			@Override
			public Adapter casePort_Send_Client(Port_Send_Client object) {
				return createPort_Send_ClientAdapter();
			}
			@Override
			public Adapter caseRPC(RPC object) {
				return createRPCAdapter();
			}
			@Override
			public Adapter caseCallerClient(CallerClient object) {
				return createCallerClientAdapter();
			}
			@Override
			public Adapter caseCallerServeur(CallerServeur object) {
				return createCallerServeurAdapter();
			}
			@Override
			public Adapter caseAttachment_SendRequest_to_Caller(Attachment_SendRequest_to_Caller object) {
				return createAttachment_SendRequest_to_CallerAdapter();
			}
			@Override
			public Adapter caseCalledClient(CalledClient object) {
				return createCalledClientAdapter();
			}
			@Override
			public Adapter caseCalledServeur(CalledServeur object) {
				return createCalledServeurAdapter();
			}
			@Override
			public Adapter caseAttachment_Receive_request(Attachment_Receive_request object) {
				return createAttachment_Receive_requestAdapter();
			}
			@Override
			public Adapter caseAttachment_server_Send_to_Client(Attachment_server_Send_to_Client object) {
				return createAttachment_server_Send_to_ClientAdapter();
			}
			@Override
			public Adapter caseAttachment_server_Receive_of_Client(Attachment_server_Receive_of_Client object) {
				return createAttachment_server_Receive_of_ClientAdapter();
			}
			@Override
			public Adapter casePort_Send_Serveur(Port_Send_Serveur object) {
				return createPort_Send_ServeurAdapter();
			}
			@Override
			public Adapter casePort_Receive_Client(Port_Receive_Client object) {
				return createPort_Receive_ClientAdapter();
			}
			@Override
			public Adapter caseGlueCS1(Glue object) {
				return createGlueCS1Adapter();
			}
			@Override
			public Adapter caseConfigurationClientServeur(ConfigurationClientServeur object) {
				return createConfigurationClientServeurAdapter();
			}
			@Override
			public Adapter caseGlueCS2(Glue object) {
				return createGlueCS2Adapter();
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
			public Adapter caseConnecteurs(Connecteurs object) {
				return createConnecteursAdapter();
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
			public Adapter caseLien(Lien object) {
				return createLienAdapter();
			}
			@Override
			public Adapter caseAttachment(Attachment object) {
				return createAttachmentAdapter();
			}
			@Override
			public Adapter caseAttachmentsRequisFournis(AttachmentsRequisFournis object) {
				return createAttachmentsRequisFournisAdapter();
			}
			@Override
			public Adapter caseRoleConnecteursRequis(RoleConnecteursRequis object) {
				return createRoleConnecteursRequisAdapter();
			}
			@Override
			public Adapter caseAttachmentFournisRequis(AttachmentFournisRequis object) {
				return createAttachmentFournisRequisAdapter();
			}
			@Override
			public Adapter caseGlue(Glue object) {
				return createGlueAdapter();
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
	 * Creates a new adapter for an object of class '{@link systeme.ClientServeur.ComposantClient <em>Composant Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.ClientServeur.ComposantClient
	 * @generated
	 */
	public Adapter createComposantClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.ClientServeur.ComposantServer <em>Composant Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.ClientServeur.ComposantServer
	 * @generated
	 */
	public Adapter createComposantServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.ClientServeur.InterfaceClient <em>Interface Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.ClientServeur.InterfaceClient
	 * @generated
	 */
	public Adapter createInterfaceClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.ClientServeur.InterfaceServeur <em>Interface Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.ClientServeur.InterfaceServeur
	 * @generated
	 */
	public Adapter createInterfaceServeurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.ClientServeur.Port_Receive_Request <em>Port Receive Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.ClientServeur.Port_Receive_Request
	 * @generated
	 */
	public Adapter createPort_Receive_RequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.ClientServeur.Port_Send_Client <em>Port Send Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.ClientServeur.Port_Send_Client
	 * @generated
	 */
	public Adapter createPort_Send_ClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.ClientServeur.RPC <em>RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.ClientServeur.RPC
	 * @generated
	 */
	public Adapter createRPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.ClientServeur.CallerClient <em>Caller Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.ClientServeur.CallerClient
	 * @generated
	 */
	public Adapter createCallerClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.ClientServeur.CallerServeur <em>Caller Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.ClientServeur.CallerServeur
	 * @generated
	 */
	public Adapter createCallerServeurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.ClientServeur.Attachment_SendRequest_to_Caller <em>Attachment Send Request to Caller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.ClientServeur.Attachment_SendRequest_to_Caller
	 * @generated
	 */
	public Adapter createAttachment_SendRequest_to_CallerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.ClientServeur.CalledClient <em>Called Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.ClientServeur.CalledClient
	 * @generated
	 */
	public Adapter createCalledClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.ClientServeur.CalledServeur <em>Called Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.ClientServeur.CalledServeur
	 * @generated
	 */
	public Adapter createCalledServeurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.ClientServeur.Attachment_Receive_request <em>Attachment Receive request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.ClientServeur.Attachment_Receive_request
	 * @generated
	 */
	public Adapter createAttachment_Receive_requestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.ClientServeur.Attachment_server_Send_to_Client <em>Attachment server Send to Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.ClientServeur.Attachment_server_Send_to_Client
	 * @generated
	 */
	public Adapter createAttachment_server_Send_to_ClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.ClientServeur.Attachment_server_Receive_of_Client <em>Attachment server Receive of Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.ClientServeur.Attachment_server_Receive_of_Client
	 * @generated
	 */
	public Adapter createAttachment_server_Receive_of_ClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.ClientServeur.Port_Send_Serveur <em>Port Send Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.ClientServeur.Port_Send_Serveur
	 * @generated
	 */
	public Adapter createPort_Send_ServeurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.ClientServeur.Port_Receive_Client <em>Port Receive Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.ClientServeur.Port_Receive_Client
	 * @generated
	 */
	public Adapter createPort_Receive_ClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.Glue <em>Glue CS1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.Glue
	 * @generated
	 */
	public Adapter createGlueCS1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link systeme.ClientServeur.ConfigurationClientServeur <em>Configuration Client Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see systeme.ClientServeur.ConfigurationClientServeur
	 * @generated
	 */
	public Adapter createConfigurationClientServeurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projecttArchitectural.Glue <em>Glue CS2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projecttArchitectural.Glue
	 * @generated
	 */
	public Adapter createGlueCS2Adapter() {
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

} //ClientServeurAdapterFactory
