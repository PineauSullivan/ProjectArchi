/**
 */
package systeme.ClientServeur.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import projecttArchitectural.Glue;
import projecttArchitectural.ProjecttArchitecturalPackage;

import projecttArchitectural.impl.ProjecttArchitecturalPackageImpl;

import systeme.ClientServeur.Attachment_Receive_request;
import systeme.ClientServeur.Attachment_SendRequest_to_Caller;
import systeme.ClientServeur.Attachment_server_Receive_of_Client;
import systeme.ClientServeur.Attachment_server_Send_to_Client;
import systeme.ClientServeur.CalledClient;
import systeme.ClientServeur.CalledServeur;
import systeme.ClientServeur.CallerClient;
import systeme.ClientServeur.CallerServeur;
import systeme.ClientServeur.ClientServeurFactory;
import systeme.ClientServeur.ClientServeurPackage;
import systeme.ClientServeur.ComposantClient;
import systeme.ClientServeur.ComposantServer;
import systeme.ClientServeur.ConfigurationClientServeur;
import systeme.ClientServeur.InterfaceClient;
import systeme.ClientServeur.InterfaceServeur;
import systeme.ClientServeur.Port_Receive_Client;
import systeme.ClientServeur.Port_Receive_Request;
import systeme.ClientServeur.Port_Send_Client;
import systeme.ClientServeur.Port_Send_Serveur;

import systeme.FonctionServeur.FonctionServeurPackage;

import systeme.FonctionServeur.impl.FonctionServeurPackageImpl;

import systeme.SystemePackage;

import systeme.impl.SystemePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClientServeurPackageImpl extends EPackageImpl implements ClientServeurPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composantClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composantServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceServeurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass port_Receive_RequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass port_Send_ClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rpcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callerClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callerServeurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_SendRequest_to_CallerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calledClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calledServeurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_Receive_requestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_server_Send_to_ClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_server_Receive_of_ClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass port_Send_ServeurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass port_Receive_ClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glueCS1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationClientServeurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glueCS2EClass = null;

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
	 * @see systeme.ClientServeur.ClientServeurPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ClientServeurPackageImpl() {
		super(eNS_URI, ClientServeurFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ClientServeurPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ClientServeurPackage init() {
		if (isInited) return (ClientServeurPackage)EPackage.Registry.INSTANCE.getEPackage(ClientServeurPackage.eNS_URI);

		// Obtain or create and register package
		ClientServeurPackageImpl theClientServeurPackage = (ClientServeurPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ClientServeurPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ClientServeurPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SystemePackageImpl theSystemePackage = (SystemePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SystemePackage.eNS_URI) instanceof SystemePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SystemePackage.eNS_URI) : SystemePackage.eINSTANCE);
		FonctionServeurPackageImpl theFonctionServeurPackage = (FonctionServeurPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FonctionServeurPackage.eNS_URI) instanceof FonctionServeurPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FonctionServeurPackage.eNS_URI) : FonctionServeurPackage.eINSTANCE);
		ProjecttArchitecturalPackageImpl theProjecttArchitecturalPackage = (ProjecttArchitecturalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProjecttArchitecturalPackage.eNS_URI) instanceof ProjecttArchitecturalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProjecttArchitecturalPackage.eNS_URI) : ProjecttArchitecturalPackage.eINSTANCE);

		// Create package meta-data objects
		theClientServeurPackage.createPackageContents();
		theSystemePackage.createPackageContents();
		theFonctionServeurPackage.createPackageContents();
		theProjecttArchitecturalPackage.createPackageContents();

		// Initialize created meta-data
		theClientServeurPackage.initializePackageContents();
		theSystemePackage.initializePackageContents();
		theFonctionServeurPackage.initializePackageContents();
		theProjecttArchitecturalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theClientServeurPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ClientServeurPackage.eNS_URI, theClientServeurPackage);
		return theClientServeurPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposantClient() {
		return composantClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposantClient_Interfaceclient() {
		return (EReference)composantClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposantServer() {
		return composantServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposantServer_Interfaceserveur() {
		return (EReference)composantServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceClient() {
		return interfaceClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceClient_Port_send_request() {
		return (EReference)interfaceClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceClient_Port_receive_client() {
		return (EReference)interfaceClientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceServeur() {
		return interfaceServeurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceServeur_Port_receive_request() {
		return (EReference)interfaceServeurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceServeur_Port_send_serveur() {
		return (EReference)interfaceServeurEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort_Receive_Request() {
		return port_Receive_RequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort_Send_Client() {
		return port_Send_ClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRPC() {
		return rpcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPC_Gluecs1() {
		return (EReference)rpcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPC_Gluecs2() {
		return (EReference)rpcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPC_Callerclient() {
		return (EReference)rpcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPC_Callerserveur() {
		return (EReference)rpcEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPC_Calledclient() {
		return (EReference)rpcEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPC_Calledserveur() {
		return (EReference)rpcEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallerClient() {
		return callerClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallerServeur() {
		return callerServeurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment_SendRequest_to_Caller() {
		return attachment_SendRequest_to_CallerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_SendRequest_to_Caller_Port_send_request() {
		return (EReference)attachment_SendRequest_to_CallerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_SendRequest_to_Caller_Callerserveur() {
		return (EReference)attachment_SendRequest_to_CallerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalledClient() {
		return calledClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalledServeur() {
		return calledServeurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment_Receive_request() {
		return attachment_Receive_requestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_Receive_request_Port_receive_request() {
		return (EReference)attachment_Receive_requestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_Receive_request_Calledserveur() {
		return (EReference)attachment_Receive_requestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment_server_Send_to_Client() {
		return attachment_server_Send_to_ClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_server_Send_to_Client_Port_send_serveur() {
		return (EReference)attachment_server_Send_to_ClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_server_Send_to_Client_Callerclient() {
		return (EReference)attachment_server_Send_to_ClientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment_server_Receive_of_Client() {
		return attachment_server_Receive_of_ClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_server_Receive_of_Client_Port_receive_client() {
		return (EReference)attachment_server_Receive_of_ClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_server_Receive_of_Client_Calledclient() {
		return (EReference)attachment_server_Receive_of_ClientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort_Send_Serveur() {
		return port_Send_ServeurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort_Receive_Client() {
		return port_Receive_ClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlueCS1() {
		return glueCS1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlueCS1_Callerclient() {
		return (EReference)glueCS1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlueCS1_Calledclient() {
		return (EReference)glueCS1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationClientServeur() {
		return configurationClientServeurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationClientServeur_Composantclient() {
		return (EReference)configurationClientServeurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationClientServeur_Composantserver() {
		return (EReference)configurationClientServeurEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationClientServeur_Rpc() {
		return (EReference)configurationClientServeurEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationClientServeur_Attachment_sendrequest_to_caller() {
		return (EReference)configurationClientServeurEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationClientServeur_Attachment_receive_request() {
		return (EReference)configurationClientServeurEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationClientServeur_Attachment_server_send_to_client() {
		return (EReference)configurationClientServeurEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationClientServeur_Attachment_server_receive_of_client() {
		return (EReference)configurationClientServeurEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlueCS2() {
		return glueCS2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlueCS2_Callerserveur() {
		return (EReference)glueCS2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlueCS2_Calledserveur() {
		return (EReference)glueCS2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientServeurFactory getClientServeurFactory() {
		return (ClientServeurFactory)getEFactoryInstance();
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
		composantClientEClass = createEClass(COMPOSANT_CLIENT);
		createEReference(composantClientEClass, COMPOSANT_CLIENT__INTERFACECLIENT);

		composantServerEClass = createEClass(COMPOSANT_SERVER);
		createEReference(composantServerEClass, COMPOSANT_SERVER__INTERFACESERVEUR);

		interfaceClientEClass = createEClass(INTERFACE_CLIENT);
		createEReference(interfaceClientEClass, INTERFACE_CLIENT__PORT_SEND_REQUEST);
		createEReference(interfaceClientEClass, INTERFACE_CLIENT__PORT_RECEIVE_CLIENT);

		interfaceServeurEClass = createEClass(INTERFACE_SERVEUR);
		createEReference(interfaceServeurEClass, INTERFACE_SERVEUR__PORT_RECEIVE_REQUEST);
		createEReference(interfaceServeurEClass, INTERFACE_SERVEUR__PORT_SEND_SERVEUR);

		port_Receive_RequestEClass = createEClass(PORT_RECEIVE_REQUEST);

		port_Send_ClientEClass = createEClass(PORT_SEND_CLIENT);

		rpcEClass = createEClass(RPC);
		createEReference(rpcEClass, RPC__GLUECS1);
		createEReference(rpcEClass, RPC__GLUECS2);
		createEReference(rpcEClass, RPC__CALLERCLIENT);
		createEReference(rpcEClass, RPC__CALLERSERVEUR);
		createEReference(rpcEClass, RPC__CALLEDCLIENT);
		createEReference(rpcEClass, RPC__CALLEDSERVEUR);

		callerClientEClass = createEClass(CALLER_CLIENT);

		callerServeurEClass = createEClass(CALLER_SERVEUR);

		attachment_SendRequest_to_CallerEClass = createEClass(ATTACHMENT_SEND_REQUEST_TO_CALLER);
		createEReference(attachment_SendRequest_to_CallerEClass, ATTACHMENT_SEND_REQUEST_TO_CALLER__PORT_SEND_REQUEST);
		createEReference(attachment_SendRequest_to_CallerEClass, ATTACHMENT_SEND_REQUEST_TO_CALLER__CALLERSERVEUR);

		calledClientEClass = createEClass(CALLED_CLIENT);

		calledServeurEClass = createEClass(CALLED_SERVEUR);

		attachment_Receive_requestEClass = createEClass(ATTACHMENT_RECEIVE_REQUEST);
		createEReference(attachment_Receive_requestEClass, ATTACHMENT_RECEIVE_REQUEST__PORT_RECEIVE_REQUEST);
		createEReference(attachment_Receive_requestEClass, ATTACHMENT_RECEIVE_REQUEST__CALLEDSERVEUR);

		attachment_server_Send_to_ClientEClass = createEClass(ATTACHMENT_SERVER_SEND_TO_CLIENT);
		createEReference(attachment_server_Send_to_ClientEClass, ATTACHMENT_SERVER_SEND_TO_CLIENT__PORT_SEND_SERVEUR);
		createEReference(attachment_server_Send_to_ClientEClass, ATTACHMENT_SERVER_SEND_TO_CLIENT__CALLERCLIENT);

		attachment_server_Receive_of_ClientEClass = createEClass(ATTACHMENT_SERVER_RECEIVE_OF_CLIENT);
		createEReference(attachment_server_Receive_of_ClientEClass, ATTACHMENT_SERVER_RECEIVE_OF_CLIENT__PORT_RECEIVE_CLIENT);
		createEReference(attachment_server_Receive_of_ClientEClass, ATTACHMENT_SERVER_RECEIVE_OF_CLIENT__CALLEDCLIENT);

		port_Send_ServeurEClass = createEClass(PORT_SEND_SERVEUR);

		port_Receive_ClientEClass = createEClass(PORT_RECEIVE_CLIENT);

		glueCS1EClass = createEClass(GLUE_CS1);
		createEReference(glueCS1EClass, GLUE_CS1__CALLERCLIENT);
		createEReference(glueCS1EClass, GLUE_CS1__CALLEDCLIENT);

		configurationClientServeurEClass = createEClass(CONFIGURATION_CLIENT_SERVEUR);
		createEReference(configurationClientServeurEClass, CONFIGURATION_CLIENT_SERVEUR__COMPOSANTCLIENT);
		createEReference(configurationClientServeurEClass, CONFIGURATION_CLIENT_SERVEUR__COMPOSANTSERVER);
		createEReference(configurationClientServeurEClass, CONFIGURATION_CLIENT_SERVEUR__RPC);
		createEReference(configurationClientServeurEClass, CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_SENDREQUEST_TO_CALLER);
		createEReference(configurationClientServeurEClass, CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_RECEIVE_REQUEST);
		createEReference(configurationClientServeurEClass, CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_SERVER_SEND_TO_CLIENT);
		createEReference(configurationClientServeurEClass, CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_SERVER_RECEIVE_OF_CLIENT);

		glueCS2EClass = createEClass(GLUE_CS2);
		createEReference(glueCS2EClass, GLUE_CS2__CALLERSERVEUR);
		createEReference(glueCS2EClass, GLUE_CS2__CALLEDSERVEUR);
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
		composantClientEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getComposants());
		composantServerEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getComposants());
		interfaceClientEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getInterfaceComposants());
		interfaceServeurEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getInterfaceComposants());
		port_Receive_RequestEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getPortsComposantsFournis());
		port_Send_ClientEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getPortsComposantsRequis());
		rpcEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getConnecteurs());
		callerClientEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getRoleConnecteursFournis());
		callerServeurEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getRoleConnecteursFournis());
		attachment_SendRequest_to_CallerEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getAttachmentsRequisFournis());
		calledClientEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getRoleConnecteursRequis());
		calledServeurEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getRoleConnecteursRequis());
		attachment_Receive_requestEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getAttachmentFournisRequis());
		attachment_server_Send_to_ClientEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getAttachmentsRequisFournis());
		attachment_server_Receive_of_ClientEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getAttachmentFournisRequis());
		port_Send_ServeurEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getPortsComposantsRequis());
		port_Receive_ClientEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getPortsComposantsFournis());
		glueCS1EClass.getESuperTypes().add(theProjecttArchitecturalPackage.getGlue());
		configurationClientServeurEClass.getESuperTypes().add(theProjecttArchitecturalPackage.getConfigurations());
		glueCS2EClass.getESuperTypes().add(theProjecttArchitecturalPackage.getGlue());

		// Initialize classes, features, and operations; add parameters
		initEClass(composantClientEClass, ComposantClient.class, "ComposantClient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComposantClient_Interfaceclient(), this.getInterfaceClient(), null, "interfaceclient", null, 0, -1, ComposantClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(composantServerEClass, ComposantServer.class, "ComposantServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComposantServer_Interfaceserveur(), this.getInterfaceServeur(), null, "interfaceserveur", null, 0, -1, ComposantServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceClientEClass, InterfaceClient.class, "InterfaceClient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceClient_Port_send_request(), this.getPort_Send_Client(), null, "port_send_request", null, 0, -1, InterfaceClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceClient_Port_receive_client(), this.getPort_Receive_Client(), null, "port_receive_client", null, 0, -1, InterfaceClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceServeurEClass, InterfaceServeur.class, "InterfaceServeur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceServeur_Port_receive_request(), this.getPort_Receive_Request(), null, "port_receive_request", null, 0, -1, InterfaceServeur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceServeur_Port_send_serveur(), this.getPort_Send_Serveur(), null, "port_send_serveur", null, 0, -1, InterfaceServeur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(port_Receive_RequestEClass, Port_Receive_Request.class, "Port_Receive_Request", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(port_Send_ClientEClass, Port_Send_Client.class, "Port_Send_Client", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rpcEClass, systeme.ClientServeur.RPC.class, "RPC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRPC_Gluecs1(), this.getGlueCS1(), null, "gluecs1", null, 0, 1, systeme.ClientServeur.RPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPC_Gluecs2(), this.getGlueCS2(), null, "gluecs2", null, 0, 1, systeme.ClientServeur.RPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPC_Callerclient(), this.getCallerClient(), null, "callerclient", null, 0, 1, systeme.ClientServeur.RPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPC_Callerserveur(), this.getCallerServeur(), null, "callerserveur", null, 0, 1, systeme.ClientServeur.RPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPC_Calledclient(), this.getCalledClient(), null, "calledclient", null, 0, 1, systeme.ClientServeur.RPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPC_Calledserveur(), this.getCalledServeur(), null, "calledserveur", null, 0, 1, systeme.ClientServeur.RPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callerClientEClass, CallerClient.class, "CallerClient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(callerServeurEClass, CallerServeur.class, "CallerServeur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attachment_SendRequest_to_CallerEClass, Attachment_SendRequest_to_Caller.class, "Attachment_SendRequest_to_Caller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachment_SendRequest_to_Caller_Port_send_request(), this.getPort_Send_Client(), null, "port_send_request", null, 0, 1, Attachment_SendRequest_to_Caller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_SendRequest_to_Caller_Callerserveur(), this.getCallerServeur(), null, "callerserveur", null, 0, 1, Attachment_SendRequest_to_Caller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calledClientEClass, CalledClient.class, "CalledClient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calledServeurEClass, CalledServeur.class, "CalledServeur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attachment_Receive_requestEClass, Attachment_Receive_request.class, "Attachment_Receive_request", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachment_Receive_request_Port_receive_request(), this.getPort_Receive_Request(), null, "port_receive_request", null, 0, 1, Attachment_Receive_request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_Receive_request_Calledserveur(), this.getCalledServeur(), null, "calledserveur", null, 0, 1, Attachment_Receive_request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachment_server_Send_to_ClientEClass, Attachment_server_Send_to_Client.class, "Attachment_server_Send_to_Client", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachment_server_Send_to_Client_Port_send_serveur(), this.getPort_Send_Serveur(), null, "port_send_serveur", null, 0, 1, Attachment_server_Send_to_Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_server_Send_to_Client_Callerclient(), this.getCallerClient(), null, "callerclient", null, 0, 1, Attachment_server_Send_to_Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachment_server_Receive_of_ClientEClass, Attachment_server_Receive_of_Client.class, "Attachment_server_Receive_of_Client", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachment_server_Receive_of_Client_Port_receive_client(), this.getPort_Receive_Client(), null, "port_receive_client", null, 0, 1, Attachment_server_Receive_of_Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_server_Receive_of_Client_Calledclient(), this.getCalledClient(), null, "calledclient", null, 0, 1, Attachment_server_Receive_of_Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(port_Send_ServeurEClass, Port_Send_Serveur.class, "Port_Send_Serveur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(port_Receive_ClientEClass, Port_Receive_Client.class, "Port_Receive_Client", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(glueCS1EClass, Glue.class, "GlueCS1", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlueCS1_Callerclient(), this.getCallerClient(), null, "callerclient", null, 0, 1, Glue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlueCS1_Calledclient(), this.getCalledClient(), null, "calledclient", null, 0, 1, Glue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationClientServeurEClass, ConfigurationClientServeur.class, "ConfigurationClientServeur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationClientServeur_Composantclient(), this.getComposantClient(), null, "composantclient", null, 0, 1, ConfigurationClientServeur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationClientServeur_Composantserver(), this.getComposantServer(), null, "composantserver", null, 0, 1, ConfigurationClientServeur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationClientServeur_Rpc(), this.getRPC(), null, "rpc", null, 0, 1, ConfigurationClientServeur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationClientServeur_Attachment_sendrequest_to_caller(), this.getAttachment_SendRequest_to_Caller(), null, "attachment_sendrequest_to_caller", null, 0, 1, ConfigurationClientServeur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationClientServeur_Attachment_receive_request(), this.getAttachment_Receive_request(), null, "attachment_receive_request", null, 0, 1, ConfigurationClientServeur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationClientServeur_Attachment_server_send_to_client(), this.getAttachment_server_Send_to_Client(), null, "attachment_server_send_to_client", null, 0, 1, ConfigurationClientServeur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationClientServeur_Attachment_server_receive_of_client(), this.getAttachment_server_Receive_of_Client(), null, "attachment_server_receive_of_client", null, 0, 1, ConfigurationClientServeur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glueCS2EClass, Glue.class, "GlueCS2", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlueCS2_Callerserveur(), this.getCallerServeur(), null, "callerserveur", null, 0, 1, Glue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlueCS2_Calledserveur(), this.getCalledServeur(), null, "calledserveur", null, 0, 1, Glue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ClientServeurPackageImpl
