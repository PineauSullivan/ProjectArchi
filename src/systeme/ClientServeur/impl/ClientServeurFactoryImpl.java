/**
 */
package systeme.ClientServeur.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import projecttArchitectural.Glue;

import systeme.ClientServeur.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClientServeurFactoryImpl extends EFactoryImpl implements ClientServeurFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClientServeurFactory init() {
		try {
			ClientServeurFactory theClientServeurFactory = (ClientServeurFactory)EPackage.Registry.INSTANCE.getEFactory(ClientServeurPackage.eNS_URI);
			if (theClientServeurFactory != null) {
				return theClientServeurFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ClientServeurFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientServeurFactoryImpl() {
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
			case ClientServeurPackage.COMPOSANT_CLIENT: return createComposantClient();
			case ClientServeurPackage.COMPOSANT_SERVER: return createComposantServer();
			case ClientServeurPackage.INTERFACE_CLIENT: return createInterfaceClient();
			case ClientServeurPackage.INTERFACE_SERVEUR: return createInterfaceServeur();
			case ClientServeurPackage.PORT_RECEIVE_REQUEST: return createPort_Receive_Request();
			case ClientServeurPackage.PORT_SEND_CLIENT: return createPort_Send_Client();
			case ClientServeurPackage.RPC: return createRPC();
			case ClientServeurPackage.CALLER_CLIENT: return createCallerClient();
			case ClientServeurPackage.CALLER_SERVEUR: return createCallerServeur();
			case ClientServeurPackage.ATTACHMENT_SEND_REQUEST_TO_CALLER: return createAttachment_SendRequest_to_Caller();
			case ClientServeurPackage.CALLED_CLIENT: return createCalledClient();
			case ClientServeurPackage.CALLED_SERVEUR: return createCalledServeur();
			case ClientServeurPackage.ATTACHMENT_RECEIVE_REQUEST: return createAttachment_Receive_request();
			case ClientServeurPackage.ATTACHMENT_SERVER_SEND_TO_CLIENT: return createAttachment_server_Send_to_Client();
			case ClientServeurPackage.ATTACHMENT_SERVER_RECEIVE_OF_CLIENT: return createAttachment_server_Receive_of_Client();
			case ClientServeurPackage.PORT_SEND_SERVEUR: return createPort_Send_Serveur();
			case ClientServeurPackage.PORT_RECEIVE_CLIENT: return createPort_Receive_Client();
			case ClientServeurPackage.GLUE_CS1: return (EObject)createGlueCS1();
			case ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR: return createConfigurationClientServeur();
			case ClientServeurPackage.GLUE_CS2: return (EObject)createGlueCS2();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposantClient createComposantClient() {
		ComposantClientImpl composantClient = new ComposantClientImpl();
		return composantClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposantServer createComposantServer() {
		ComposantServerImpl composantServer = new ComposantServerImpl();
		return composantServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceClient createInterfaceClient() {
		InterfaceClientImpl interfaceClient = new InterfaceClientImpl();
		return interfaceClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceServeur createInterfaceServeur() {
		InterfaceServeurImpl interfaceServeur = new InterfaceServeurImpl();
		return interfaceServeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Receive_Request createPort_Receive_Request() {
		Port_Receive_RequestImpl port_Receive_Request = new Port_Receive_RequestImpl();
		return port_Receive_Request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Send_Client createPort_Send_Client() {
		Port_Send_ClientImpl port_Send_Client = new Port_Send_ClientImpl();
		return port_Send_Client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPC createRPC() {
		RPCImpl rpc = new RPCImpl();
		return rpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallerClient createCallerClient() {
		CallerClientImpl callerClient = new CallerClientImpl();
		return callerClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallerServeur createCallerServeur() {
		CallerServeurImpl callerServeur = new CallerServeurImpl();
		return callerServeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_SendRequest_to_Caller createAttachment_SendRequest_to_Caller() {
		Attachment_SendRequest_to_CallerImpl attachment_SendRequest_to_Caller = new Attachment_SendRequest_to_CallerImpl();
		return attachment_SendRequest_to_Caller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalledClient createCalledClient() {
		CalledClientImpl calledClient = new CalledClientImpl();
		return calledClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalledServeur createCalledServeur() {
		CalledServeurImpl calledServeur = new CalledServeurImpl();
		return calledServeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_Receive_request createAttachment_Receive_request() {
		Attachment_Receive_requestImpl attachment_Receive_request = new Attachment_Receive_requestImpl();
		return attachment_Receive_request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_server_Send_to_Client createAttachment_server_Send_to_Client() {
		Attachment_server_Send_to_ClientImpl attachment_server_Send_to_Client = new Attachment_server_Send_to_ClientImpl();
		return attachment_server_Send_to_Client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_server_Receive_of_Client createAttachment_server_Receive_of_Client() {
		Attachment_server_Receive_of_ClientImpl attachment_server_Receive_of_Client = new Attachment_server_Receive_of_ClientImpl();
		return attachment_server_Receive_of_Client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Send_Serveur createPort_Send_Serveur() {
		Port_Send_ServeurImpl port_Send_Serveur = new Port_Send_ServeurImpl();
		return port_Send_Serveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Receive_Client createPort_Receive_Client() {
		Port_Receive_ClientImpl port_Receive_Client = new Port_Receive_ClientImpl();
		return port_Receive_Client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue createGlueCS1() {
		GlueCS1Impl glueCS1 = new GlueCS1Impl();
		return glueCS1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationClientServeur createConfigurationClientServeur() {
		ConfigurationClientServeurImpl configurationClientServeur = new ConfigurationClientServeurImpl();
		return configurationClientServeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue createGlueCS2() {
		GlueCS2Impl glueCS2 = new GlueCS2Impl();
		return glueCS2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientServeurPackage getClientServeurPackage() {
		return (ClientServeurPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ClientServeurPackage getPackage() {
		return ClientServeurPackage.eINSTANCE;
	}

} //ClientServeurFactoryImpl
