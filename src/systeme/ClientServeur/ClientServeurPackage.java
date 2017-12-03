/**
 */
package systeme.ClientServeur;

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
 * @see systeme.ClientServeur.ClientServeurFactory
 * @model kind="package"
 * @generated
 */
public interface ClientServeurPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ClientServeur";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "something";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "another";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClientServeurPackage eINSTANCE = systeme.ClientServeur.impl.ClientServeurPackageImpl.init();

	/**
	 * The meta object id for the '{@link systeme.ClientServeur.impl.ComposantClientImpl <em>Composant Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.ClientServeur.impl.ComposantClientImpl
	 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getComposantClient()
	 * @generated
	 */
	int COMPOSANT_CLIENT = 0;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_CLIENT__CONFIGURATIONS = ProjecttArchitecturalPackage.COMPOSANTS__CONFIGURATIONS;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_CLIENT__CONTRAINTES = ProjecttArchitecturalPackage.COMPOSANTS__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Interfacecomposants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_CLIENT__INTERFACECOMPOSANTS = ProjecttArchitecturalPackage.COMPOSANTS__INTERFACECOMPOSANTS;

	/**
	 * The feature id for the '<em><b>Propriétés</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_CLIENT__PROPRIÉTÉS = ProjecttArchitecturalPackage.COMPOSANTS__PROPRIÉTÉS;

	/**
	 * The feature id for the '<em><b>Interfaceclient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_CLIENT__INTERFACECLIENT = ProjecttArchitecturalPackage.COMPOSANTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composant Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_CLIENT_FEATURE_COUNT = ProjecttArchitecturalPackage.COMPOSANTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composant Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_CLIENT_OPERATION_COUNT = ProjecttArchitecturalPackage.COMPOSANTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.ClientServeur.impl.ComposantServerImpl <em>Composant Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.ClientServeur.impl.ComposantServerImpl
	 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getComposantServer()
	 * @generated
	 */
	int COMPOSANT_SERVER = 1;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_SERVER__CONFIGURATIONS = ProjecttArchitecturalPackage.COMPOSANTS__CONFIGURATIONS;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_SERVER__CONTRAINTES = ProjecttArchitecturalPackage.COMPOSANTS__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Interfacecomposants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_SERVER__INTERFACECOMPOSANTS = ProjecttArchitecturalPackage.COMPOSANTS__INTERFACECOMPOSANTS;

	/**
	 * The feature id for the '<em><b>Propriétés</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_SERVER__PROPRIÉTÉS = ProjecttArchitecturalPackage.COMPOSANTS__PROPRIÉTÉS;

	/**
	 * The feature id for the '<em><b>Interfaceserveur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_SERVER__INTERFACESERVEUR = ProjecttArchitecturalPackage.COMPOSANTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composant Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_SERVER_FEATURE_COUNT = ProjecttArchitecturalPackage.COMPOSANTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composant Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_SERVER_OPERATION_COUNT = ProjecttArchitecturalPackage.COMPOSANTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.ClientServeur.impl.InterfaceClientImpl <em>Interface Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.ClientServeur.impl.InterfaceClientImpl
	 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getInterfaceClient()
	 * @generated
	 */
	int INTERFACE_CLIENT = 2;

	/**
	 * The feature id for the '<em><b>Servicecomposants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLIENT__SERVICECOMPOSANTS = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS__SERVICECOMPOSANTS;

	/**
	 * The feature id for the '<em><b>Portscompasants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLIENT__PORTSCOMPASANTS = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS__PORTSCOMPASANTS;

	/**
	 * The feature id for the '<em><b>Port send request</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLIENT__PORT_SEND_REQUEST = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port receive client</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLIENT__PORT_RECEIVE_CLIENT = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interface Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLIENT_FEATURE_COUNT = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interface Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLIENT_OPERATION_COUNT = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.ClientServeur.impl.InterfaceServeurImpl <em>Interface Serveur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.ClientServeur.impl.InterfaceServeurImpl
	 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getInterfaceServeur()
	 * @generated
	 */
	int INTERFACE_SERVEUR = 3;

	/**
	 * The feature id for the '<em><b>Servicecomposants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SERVEUR__SERVICECOMPOSANTS = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS__SERVICECOMPOSANTS;

	/**
	 * The feature id for the '<em><b>Portscompasants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SERVEUR__PORTSCOMPASANTS = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS__PORTSCOMPASANTS;

	/**
	 * The feature id for the '<em><b>Port receive request</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SERVEUR__PORT_RECEIVE_REQUEST = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port send serveur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SERVEUR__PORT_SEND_SERVEUR = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interface Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SERVEUR_FEATURE_COUNT = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interface Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_SERVEUR_OPERATION_COUNT = ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.ClientServeur.impl.Port_Receive_RequestImpl <em>Port Receive Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.ClientServeur.impl.Port_Receive_RequestImpl
	 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getPort_Receive_Request()
	 * @generated
	 */
	int PORT_RECEIVE_REQUEST = 4;

	/**
	 * The number of structural features of the '<em>Port Receive Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RECEIVE_REQUEST_FEATURE_COUNT = ProjecttArchitecturalPackage.PORTS_COMPOSANTS_FOURNIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Receive Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RECEIVE_REQUEST_OPERATION_COUNT = ProjecttArchitecturalPackage.PORTS_COMPOSANTS_FOURNIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.ClientServeur.impl.Port_Send_ClientImpl <em>Port Send Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.ClientServeur.impl.Port_Send_ClientImpl
	 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getPort_Send_Client()
	 * @generated
	 */
	int PORT_SEND_CLIENT = 5;

	/**
	 * The number of structural features of the '<em>Port Send Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SEND_CLIENT_FEATURE_COUNT = ProjecttArchitecturalPackage.PORTS_COMPOSANTS_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Send Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SEND_CLIENT_OPERATION_COUNT = ProjecttArchitecturalPackage.PORTS_COMPOSANTS_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.ClientServeur.impl.RPCImpl <em>RPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.ClientServeur.impl.RPCImpl
	 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getRPC()
	 * @generated
	 */
	int RPC = 6;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__CONFIGURATIONS = ProjecttArchitecturalPackage.CONNECTEURS__CONFIGURATIONS;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__CONTRAINTES = ProjecttArchitecturalPackage.CONNECTEURS__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__GLUE = ProjecttArchitecturalPackage.CONNECTEURS__GLUE;

	/**
	 * The feature id for the '<em><b>Roleconnecteurs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__ROLECONNECTEURS = ProjecttArchitecturalPackage.CONNECTEURS__ROLECONNECTEURS;

	/**
	 * The feature id for the '<em><b>Gluecs1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__GLUECS1 = ProjecttArchitecturalPackage.CONNECTEURS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gluecs2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__GLUECS2 = ProjecttArchitecturalPackage.CONNECTEURS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Callerclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__CALLERCLIENT = ProjecttArchitecturalPackage.CONNECTEURS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Callerserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__CALLERSERVEUR = ProjecttArchitecturalPackage.CONNECTEURS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Calledclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__CALLEDCLIENT = ProjecttArchitecturalPackage.CONNECTEURS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Calledserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__CALLEDSERVEUR = ProjecttArchitecturalPackage.CONNECTEURS_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_FEATURE_COUNT = ProjecttArchitecturalPackage.CONNECTEURS_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_OPERATION_COUNT = ProjecttArchitecturalPackage.CONNECTEURS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.ClientServeur.impl.CallerClientImpl <em>Caller Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.ClientServeur.impl.CallerClientImpl
	 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getCallerClient()
	 * @generated
	 */
	int CALLER_CLIENT = 7;

	/**
	 * The number of structural features of the '<em>Caller Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLER_CLIENT_FEATURE_COUNT = ProjecttArchitecturalPackage.ROLE_CONNECTEURS_FOURNIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Caller Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLER_CLIENT_OPERATION_COUNT = ProjecttArchitecturalPackage.ROLE_CONNECTEURS_FOURNIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.ClientServeur.impl.CallerServeurImpl <em>Caller Serveur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.ClientServeur.impl.CallerServeurImpl
	 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getCallerServeur()
	 * @generated
	 */
	int CALLER_SERVEUR = 8;

	/**
	 * The number of structural features of the '<em>Caller Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLER_SERVEUR_FEATURE_COUNT = ProjecttArchitecturalPackage.ROLE_CONNECTEURS_FOURNIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Caller Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLER_SERVEUR_OPERATION_COUNT = ProjecttArchitecturalPackage.ROLE_CONNECTEURS_FOURNIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.ClientServeur.impl.Attachment_SendRequest_to_CallerImpl <em>Attachment Send Request to Caller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.ClientServeur.impl.Attachment_SendRequest_to_CallerImpl
	 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getAttachment_SendRequest_to_Caller()
	 * @generated
	 */
	int ATTACHMENT_SEND_REQUEST_TO_CALLER = 9;

	/**
	 * The feature id for the '<em><b>Portscomposantsrequis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SEND_REQUEST_TO_CALLER__PORTSCOMPOSANTSREQUIS = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS__PORTSCOMPOSANTSREQUIS;

	/**
	 * The feature id for the '<em><b>Roleconnecteursfournis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SEND_REQUEST_TO_CALLER__ROLECONNECTEURSFOURNIS = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS__ROLECONNECTEURSFOURNIS;

	/**
	 * The feature id for the '<em><b>Port send request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SEND_REQUEST_TO_CALLER__PORT_SEND_REQUEST = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Callerserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SEND_REQUEST_TO_CALLER__CALLERSERVEUR = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachment Send Request to Caller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SEND_REQUEST_TO_CALLER_FEATURE_COUNT = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attachment Send Request to Caller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SEND_REQUEST_TO_CALLER_OPERATION_COUNT = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.ClientServeur.impl.CalledClientImpl <em>Called Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.ClientServeur.impl.CalledClientImpl
	 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getCalledClient()
	 * @generated
	 */
	int CALLED_CLIENT = 10;

	/**
	 * The number of structural features of the '<em>Called Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLED_CLIENT_FEATURE_COUNT = ProjecttArchitecturalPackage.ROLE_CONNECTEURS_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Called Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLED_CLIENT_OPERATION_COUNT = ProjecttArchitecturalPackage.ROLE_CONNECTEURS_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.ClientServeur.impl.CalledServeurImpl <em>Called Serveur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.ClientServeur.impl.CalledServeurImpl
	 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getCalledServeur()
	 * @generated
	 */
	int CALLED_SERVEUR = 11;

	/**
	 * The number of structural features of the '<em>Called Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLED_SERVEUR_FEATURE_COUNT = ProjecttArchitecturalPackage.ROLE_CONNECTEURS_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Called Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLED_SERVEUR_OPERATION_COUNT = ProjecttArchitecturalPackage.ROLE_CONNECTEURS_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.ClientServeur.impl.Attachment_Receive_requestImpl <em>Attachment Receive request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.ClientServeur.impl.Attachment_Receive_requestImpl
	 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getAttachment_Receive_request()
	 * @generated
	 */
	int ATTACHMENT_RECEIVE_REQUEST = 12;

	/**
	 * The feature id for the '<em><b>Portscomposantsfournis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RECEIVE_REQUEST__PORTSCOMPOSANTSFOURNIS = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS__PORTSCOMPOSANTSFOURNIS;

	/**
	 * The feature id for the '<em><b>Roleconnecteursrequis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RECEIVE_REQUEST__ROLECONNECTEURSREQUIS = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS__ROLECONNECTEURSREQUIS;

	/**
	 * The feature id for the '<em><b>Port receive request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RECEIVE_REQUEST__PORT_RECEIVE_REQUEST = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Calledserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RECEIVE_REQUEST__CALLEDSERVEUR = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachment Receive request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RECEIVE_REQUEST_FEATURE_COUNT = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attachment Receive request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RECEIVE_REQUEST_OPERATION_COUNT = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.ClientServeur.impl.Attachment_server_Send_to_ClientImpl <em>Attachment server Send to Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.ClientServeur.impl.Attachment_server_Send_to_ClientImpl
	 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getAttachment_server_Send_to_Client()
	 * @generated
	 */
	int ATTACHMENT_SERVER_SEND_TO_CLIENT = 13;

	/**
	 * The feature id for the '<em><b>Portscomposantsrequis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SERVER_SEND_TO_CLIENT__PORTSCOMPOSANTSREQUIS = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS__PORTSCOMPOSANTSREQUIS;

	/**
	 * The feature id for the '<em><b>Roleconnecteursfournis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SERVER_SEND_TO_CLIENT__ROLECONNECTEURSFOURNIS = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS__ROLECONNECTEURSFOURNIS;

	/**
	 * The feature id for the '<em><b>Port send serveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SERVER_SEND_TO_CLIENT__PORT_SEND_SERVEUR = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Callerclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SERVER_SEND_TO_CLIENT__CALLERCLIENT = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachment server Send to Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SERVER_SEND_TO_CLIENT_FEATURE_COUNT = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attachment server Send to Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SERVER_SEND_TO_CLIENT_OPERATION_COUNT = ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.ClientServeur.impl.Attachment_server_Receive_of_ClientImpl <em>Attachment server Receive of Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.ClientServeur.impl.Attachment_server_Receive_of_ClientImpl
	 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getAttachment_server_Receive_of_Client()
	 * @generated
	 */
	int ATTACHMENT_SERVER_RECEIVE_OF_CLIENT = 14;

	/**
	 * The feature id for the '<em><b>Portscomposantsfournis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SERVER_RECEIVE_OF_CLIENT__PORTSCOMPOSANTSFOURNIS = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS__PORTSCOMPOSANTSFOURNIS;

	/**
	 * The feature id for the '<em><b>Roleconnecteursrequis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SERVER_RECEIVE_OF_CLIENT__ROLECONNECTEURSREQUIS = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS__ROLECONNECTEURSREQUIS;

	/**
	 * The feature id for the '<em><b>Port receive client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SERVER_RECEIVE_OF_CLIENT__PORT_RECEIVE_CLIENT = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Calledclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SERVER_RECEIVE_OF_CLIENT__CALLEDCLIENT = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachment server Receive of Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SERVER_RECEIVE_OF_CLIENT_FEATURE_COUNT = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attachment server Receive of Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SERVER_RECEIVE_OF_CLIENT_OPERATION_COUNT = ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.ClientServeur.impl.Port_Send_ServeurImpl <em>Port Send Serveur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.ClientServeur.impl.Port_Send_ServeurImpl
	 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getPort_Send_Serveur()
	 * @generated
	 */
	int PORT_SEND_SERVEUR = 15;

	/**
	 * The number of structural features of the '<em>Port Send Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SEND_SERVEUR_FEATURE_COUNT = ProjecttArchitecturalPackage.PORTS_COMPOSANTS_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Send Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SEND_SERVEUR_OPERATION_COUNT = ProjecttArchitecturalPackage.PORTS_COMPOSANTS_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.ClientServeur.impl.Port_Receive_ClientImpl <em>Port Receive Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.ClientServeur.impl.Port_Receive_ClientImpl
	 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getPort_Receive_Client()
	 * @generated
	 */
	int PORT_RECEIVE_CLIENT = 16;

	/**
	 * The number of structural features of the '<em>Port Receive Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RECEIVE_CLIENT_FEATURE_COUNT = ProjecttArchitecturalPackage.PORTS_COMPOSANTS_FOURNIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Receive Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_RECEIVE_CLIENT_OPERATION_COUNT = ProjecttArchitecturalPackage.PORTS_COMPOSANTS_FOURNIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.ClientServeur.impl.GlueCS1Impl <em>Glue CS1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.ClientServeur.impl.GlueCS1Impl
	 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getGlueCS1()
	 * @generated
	 */
	int GLUE_CS1 = 17;

	/**
	 * The feature id for the '<em><b>Roleconnecteurs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_CS1__ROLECONNECTEURS = ProjecttArchitecturalPackage.GLUE__ROLECONNECTEURS;

	/**
	 * The feature id for the '<em><b>Callerclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_CS1__CALLERCLIENT = ProjecttArchitecturalPackage.GLUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Calledclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_CS1__CALLEDCLIENT = ProjecttArchitecturalPackage.GLUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Glue CS1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_CS1_FEATURE_COUNT = ProjecttArchitecturalPackage.GLUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Glue CS1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_CS1_OPERATION_COUNT = ProjecttArchitecturalPackage.GLUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.ClientServeur.impl.ConfigurationClientServeurImpl <em>Configuration Client Serveur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.ClientServeur.impl.ConfigurationClientServeurImpl
	 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getConfigurationClientServeur()
	 * @generated
	 */
	int CONFIGURATION_CLIENT_SERVEUR = 18;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVEUR__CONFIGURATIONS = ProjecttArchitecturalPackage.CONFIGURATIONS__CONFIGURATIONS;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVEUR__CONTRAINTES = ProjecttArchitecturalPackage.CONFIGURATIONS__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Lien</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVEUR__LIEN = ProjecttArchitecturalPackage.CONFIGURATIONS__LIEN;

	/**
	 * The feature id for the '<em><b>Composantclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVEUR__COMPOSANTCLIENT = ProjecttArchitecturalPackage.CONFIGURATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Composantserver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVEUR__COMPOSANTSERVER = ProjecttArchitecturalPackage.CONFIGURATIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVEUR__RPC = ProjecttArchitecturalPackage.CONFIGURATIONS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attachment sendrequest to caller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_SENDREQUEST_TO_CALLER = ProjecttArchitecturalPackage.CONFIGURATIONS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attachment receive request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_RECEIVE_REQUEST = ProjecttArchitecturalPackage.CONFIGURATIONS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attachment server send to client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_SERVER_SEND_TO_CLIENT = ProjecttArchitecturalPackage.CONFIGURATIONS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attachment server receive of client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_SERVER_RECEIVE_OF_CLIENT = ProjecttArchitecturalPackage.CONFIGURATIONS_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Configuration Client Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVEUR_FEATURE_COUNT = ProjecttArchitecturalPackage.CONFIGURATIONS_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Configuration Client Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVEUR_OPERATION_COUNT = ProjecttArchitecturalPackage.CONFIGURATIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link systeme.ClientServeur.impl.GlueCS2Impl <em>Glue CS2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see systeme.ClientServeur.impl.GlueCS2Impl
	 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getGlueCS2()
	 * @generated
	 */
	int GLUE_CS2 = 19;

	/**
	 * The feature id for the '<em><b>Roleconnecteurs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_CS2__ROLECONNECTEURS = ProjecttArchitecturalPackage.GLUE__ROLECONNECTEURS;

	/**
	 * The feature id for the '<em><b>Callerserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_CS2__CALLERSERVEUR = ProjecttArchitecturalPackage.GLUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Calledserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_CS2__CALLEDSERVEUR = ProjecttArchitecturalPackage.GLUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Glue CS2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_CS2_FEATURE_COUNT = ProjecttArchitecturalPackage.GLUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Glue CS2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_CS2_OPERATION_COUNT = ProjecttArchitecturalPackage.GLUE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link systeme.ClientServeur.ComposantClient <em>Composant Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composant Client</em>'.
	 * @see systeme.ClientServeur.ComposantClient
	 * @generated
	 */
	EClass getComposantClient();

	/**
	 * Returns the meta object for the containment reference list '{@link systeme.ClientServeur.ComposantClient#getInterfaceclient <em>Interfaceclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaceclient</em>'.
	 * @see systeme.ClientServeur.ComposantClient#getInterfaceclient()
	 * @see #getComposantClient()
	 * @generated
	 */
	EReference getComposantClient_Interfaceclient();

	/**
	 * Returns the meta object for class '{@link systeme.ClientServeur.ComposantServer <em>Composant Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composant Server</em>'.
	 * @see systeme.ClientServeur.ComposantServer
	 * @generated
	 */
	EClass getComposantServer();

	/**
	 * Returns the meta object for the containment reference list '{@link systeme.ClientServeur.ComposantServer#getInterfaceserveur <em>Interfaceserveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaceserveur</em>'.
	 * @see systeme.ClientServeur.ComposantServer#getInterfaceserveur()
	 * @see #getComposantServer()
	 * @generated
	 */
	EReference getComposantServer_Interfaceserveur();

	/**
	 * Returns the meta object for class '{@link systeme.ClientServeur.InterfaceClient <em>Interface Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Client</em>'.
	 * @see systeme.ClientServeur.InterfaceClient
	 * @generated
	 */
	EClass getInterfaceClient();

	/**
	 * Returns the meta object for the containment reference list '{@link systeme.ClientServeur.InterfaceClient#getPort_send_request <em>Port send request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port send request</em>'.
	 * @see systeme.ClientServeur.InterfaceClient#getPort_send_request()
	 * @see #getInterfaceClient()
	 * @generated
	 */
	EReference getInterfaceClient_Port_send_request();

	/**
	 * Returns the meta object for the containment reference list '{@link systeme.ClientServeur.InterfaceClient#getPort_receive_client <em>Port receive client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port receive client</em>'.
	 * @see systeme.ClientServeur.InterfaceClient#getPort_receive_client()
	 * @see #getInterfaceClient()
	 * @generated
	 */
	EReference getInterfaceClient_Port_receive_client();

	/**
	 * Returns the meta object for class '{@link systeme.ClientServeur.InterfaceServeur <em>Interface Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Serveur</em>'.
	 * @see systeme.ClientServeur.InterfaceServeur
	 * @generated
	 */
	EClass getInterfaceServeur();

	/**
	 * Returns the meta object for the containment reference list '{@link systeme.ClientServeur.InterfaceServeur#getPort_receive_request <em>Port receive request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port receive request</em>'.
	 * @see systeme.ClientServeur.InterfaceServeur#getPort_receive_request()
	 * @see #getInterfaceServeur()
	 * @generated
	 */
	EReference getInterfaceServeur_Port_receive_request();

	/**
	 * Returns the meta object for the containment reference list '{@link systeme.ClientServeur.InterfaceServeur#getPort_send_serveur <em>Port send serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port send serveur</em>'.
	 * @see systeme.ClientServeur.InterfaceServeur#getPort_send_serveur()
	 * @see #getInterfaceServeur()
	 * @generated
	 */
	EReference getInterfaceServeur_Port_send_serveur();

	/**
	 * Returns the meta object for class '{@link systeme.ClientServeur.Port_Receive_Request <em>Port Receive Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Receive Request</em>'.
	 * @see systeme.ClientServeur.Port_Receive_Request
	 * @generated
	 */
	EClass getPort_Receive_Request();

	/**
	 * Returns the meta object for class '{@link systeme.ClientServeur.Port_Send_Client <em>Port Send Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Send Client</em>'.
	 * @see systeme.ClientServeur.Port_Send_Client
	 * @generated
	 */
	EClass getPort_Send_Client();

	/**
	 * Returns the meta object for class '{@link systeme.ClientServeur.RPC <em>RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPC</em>'.
	 * @see systeme.ClientServeur.RPC
	 * @generated
	 */
	EClass getRPC();

	/**
	 * Returns the meta object for the reference '{@link systeme.ClientServeur.RPC#getGluecs1 <em>Gluecs1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gluecs1</em>'.
	 * @see systeme.ClientServeur.RPC#getGluecs1()
	 * @see #getRPC()
	 * @generated
	 */
	EReference getRPC_Gluecs1();

	/**
	 * Returns the meta object for the reference '{@link systeme.ClientServeur.RPC#getGluecs2 <em>Gluecs2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gluecs2</em>'.
	 * @see systeme.ClientServeur.RPC#getGluecs2()
	 * @see #getRPC()
	 * @generated
	 */
	EReference getRPC_Gluecs2();

	/**
	 * Returns the meta object for the reference '{@link systeme.ClientServeur.RPC#getCallerclient <em>Callerclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Callerclient</em>'.
	 * @see systeme.ClientServeur.RPC#getCallerclient()
	 * @see #getRPC()
	 * @generated
	 */
	EReference getRPC_Callerclient();

	/**
	 * Returns the meta object for the reference '{@link systeme.ClientServeur.RPC#getCallerserveur <em>Callerserveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Callerserveur</em>'.
	 * @see systeme.ClientServeur.RPC#getCallerserveur()
	 * @see #getRPC()
	 * @generated
	 */
	EReference getRPC_Callerserveur();

	/**
	 * Returns the meta object for the reference '{@link systeme.ClientServeur.RPC#getCalledclient <em>Calledclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Calledclient</em>'.
	 * @see systeme.ClientServeur.RPC#getCalledclient()
	 * @see #getRPC()
	 * @generated
	 */
	EReference getRPC_Calledclient();

	/**
	 * Returns the meta object for the reference '{@link systeme.ClientServeur.RPC#getCalledserveur <em>Calledserveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Calledserveur</em>'.
	 * @see systeme.ClientServeur.RPC#getCalledserveur()
	 * @see #getRPC()
	 * @generated
	 */
	EReference getRPC_Calledserveur();

	/**
	 * Returns the meta object for class '{@link systeme.ClientServeur.CallerClient <em>Caller Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Caller Client</em>'.
	 * @see systeme.ClientServeur.CallerClient
	 * @generated
	 */
	EClass getCallerClient();

	/**
	 * Returns the meta object for class '{@link systeme.ClientServeur.CallerServeur <em>Caller Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Caller Serveur</em>'.
	 * @see systeme.ClientServeur.CallerServeur
	 * @generated
	 */
	EClass getCallerServeur();

	/**
	 * Returns the meta object for class '{@link systeme.ClientServeur.Attachment_SendRequest_to_Caller <em>Attachment Send Request to Caller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment Send Request to Caller</em>'.
	 * @see systeme.ClientServeur.Attachment_SendRequest_to_Caller
	 * @generated
	 */
	EClass getAttachment_SendRequest_to_Caller();

	/**
	 * Returns the meta object for the reference '{@link systeme.ClientServeur.Attachment_SendRequest_to_Caller#getPort_send_request <em>Port send request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port send request</em>'.
	 * @see systeme.ClientServeur.Attachment_SendRequest_to_Caller#getPort_send_request()
	 * @see #getAttachment_SendRequest_to_Caller()
	 * @generated
	 */
	EReference getAttachment_SendRequest_to_Caller_Port_send_request();

	/**
	 * Returns the meta object for the reference '{@link systeme.ClientServeur.Attachment_SendRequest_to_Caller#getCallerserveur <em>Callerserveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Callerserveur</em>'.
	 * @see systeme.ClientServeur.Attachment_SendRequest_to_Caller#getCallerserveur()
	 * @see #getAttachment_SendRequest_to_Caller()
	 * @generated
	 */
	EReference getAttachment_SendRequest_to_Caller_Callerserveur();

	/**
	 * Returns the meta object for class '{@link systeme.ClientServeur.CalledClient <em>Called Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Called Client</em>'.
	 * @see systeme.ClientServeur.CalledClient
	 * @generated
	 */
	EClass getCalledClient();

	/**
	 * Returns the meta object for class '{@link systeme.ClientServeur.CalledServeur <em>Called Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Called Serveur</em>'.
	 * @see systeme.ClientServeur.CalledServeur
	 * @generated
	 */
	EClass getCalledServeur();

	/**
	 * Returns the meta object for class '{@link systeme.ClientServeur.Attachment_Receive_request <em>Attachment Receive request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment Receive request</em>'.
	 * @see systeme.ClientServeur.Attachment_Receive_request
	 * @generated
	 */
	EClass getAttachment_Receive_request();

	/**
	 * Returns the meta object for the reference '{@link systeme.ClientServeur.Attachment_Receive_request#getPort_receive_request <em>Port receive request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port receive request</em>'.
	 * @see systeme.ClientServeur.Attachment_Receive_request#getPort_receive_request()
	 * @see #getAttachment_Receive_request()
	 * @generated
	 */
	EReference getAttachment_Receive_request_Port_receive_request();

	/**
	 * Returns the meta object for the reference '{@link systeme.ClientServeur.Attachment_Receive_request#getCalledserveur <em>Calledserveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Calledserveur</em>'.
	 * @see systeme.ClientServeur.Attachment_Receive_request#getCalledserveur()
	 * @see #getAttachment_Receive_request()
	 * @generated
	 */
	EReference getAttachment_Receive_request_Calledserveur();

	/**
	 * Returns the meta object for class '{@link systeme.ClientServeur.Attachment_server_Send_to_Client <em>Attachment server Send to Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment server Send to Client</em>'.
	 * @see systeme.ClientServeur.Attachment_server_Send_to_Client
	 * @generated
	 */
	EClass getAttachment_server_Send_to_Client();

	/**
	 * Returns the meta object for the reference '{@link systeme.ClientServeur.Attachment_server_Send_to_Client#getPort_send_serveur <em>Port send serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port send serveur</em>'.
	 * @see systeme.ClientServeur.Attachment_server_Send_to_Client#getPort_send_serveur()
	 * @see #getAttachment_server_Send_to_Client()
	 * @generated
	 */
	EReference getAttachment_server_Send_to_Client_Port_send_serveur();

	/**
	 * Returns the meta object for the reference '{@link systeme.ClientServeur.Attachment_server_Send_to_Client#getCallerclient <em>Callerclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Callerclient</em>'.
	 * @see systeme.ClientServeur.Attachment_server_Send_to_Client#getCallerclient()
	 * @see #getAttachment_server_Send_to_Client()
	 * @generated
	 */
	EReference getAttachment_server_Send_to_Client_Callerclient();

	/**
	 * Returns the meta object for class '{@link systeme.ClientServeur.Attachment_server_Receive_of_Client <em>Attachment server Receive of Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment server Receive of Client</em>'.
	 * @see systeme.ClientServeur.Attachment_server_Receive_of_Client
	 * @generated
	 */
	EClass getAttachment_server_Receive_of_Client();

	/**
	 * Returns the meta object for the reference '{@link systeme.ClientServeur.Attachment_server_Receive_of_Client#getPort_receive_client <em>Port receive client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port receive client</em>'.
	 * @see systeme.ClientServeur.Attachment_server_Receive_of_Client#getPort_receive_client()
	 * @see #getAttachment_server_Receive_of_Client()
	 * @generated
	 */
	EReference getAttachment_server_Receive_of_Client_Port_receive_client();

	/**
	 * Returns the meta object for the reference '{@link systeme.ClientServeur.Attachment_server_Receive_of_Client#getCalledclient <em>Calledclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Calledclient</em>'.
	 * @see systeme.ClientServeur.Attachment_server_Receive_of_Client#getCalledclient()
	 * @see #getAttachment_server_Receive_of_Client()
	 * @generated
	 */
	EReference getAttachment_server_Receive_of_Client_Calledclient();

	/**
	 * Returns the meta object for class '{@link systeme.ClientServeur.Port_Send_Serveur <em>Port Send Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Send Serveur</em>'.
	 * @see systeme.ClientServeur.Port_Send_Serveur
	 * @generated
	 */
	EClass getPort_Send_Serveur();

	/**
	 * Returns the meta object for class '{@link systeme.ClientServeur.Port_Receive_Client <em>Port Receive Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Receive Client</em>'.
	 * @see systeme.ClientServeur.Port_Receive_Client
	 * @generated
	 */
	EClass getPort_Receive_Client();

	/**
	 * Returns the meta object for class '{@link projecttArchitectural.Glue <em>Glue CS1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glue CS1</em>'.
	 * @see projecttArchitectural.Glue
	 * @model instanceClass="projecttArchitectural.Glue"
	 * @generated
	 */
	EClass getGlueCS1();

	/**
	 * Returns the meta object for the reference '{@link projecttArchitectural.Glue#getCallerclient <em>Callerclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Callerclient</em>'.
	 * @see projecttArchitectural.Glue#getCallerclient()
	 * @see #getGlueCS1()
	 * @generated
	 */
	EReference getGlueCS1_Callerclient();

	/**
	 * Returns the meta object for the reference '{@link projecttArchitectural.Glue#getCalledclient <em>Calledclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Calledclient</em>'.
	 * @see projecttArchitectural.Glue#getCalledclient()
	 * @see #getGlueCS1()
	 * @generated
	 */
	EReference getGlueCS1_Calledclient();

	/**
	 * Returns the meta object for class '{@link systeme.ClientServeur.ConfigurationClientServeur <em>Configuration Client Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Client Serveur</em>'.
	 * @see systeme.ClientServeur.ConfigurationClientServeur
	 * @generated
	 */
	EClass getConfigurationClientServeur();

	/**
	 * Returns the meta object for the reference '{@link systeme.ClientServeur.ConfigurationClientServeur#getComposantclient <em>Composantclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Composantclient</em>'.
	 * @see systeme.ClientServeur.ConfigurationClientServeur#getComposantclient()
	 * @see #getConfigurationClientServeur()
	 * @generated
	 */
	EReference getConfigurationClientServeur_Composantclient();

	/**
	 * Returns the meta object for the reference '{@link systeme.ClientServeur.ConfigurationClientServeur#getComposantserver <em>Composantserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Composantserver</em>'.
	 * @see systeme.ClientServeur.ConfigurationClientServeur#getComposantserver()
	 * @see #getConfigurationClientServeur()
	 * @generated
	 */
	EReference getConfigurationClientServeur_Composantserver();

	/**
	 * Returns the meta object for the reference '{@link systeme.ClientServeur.ConfigurationClientServeur#getRpc <em>Rpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rpc</em>'.
	 * @see systeme.ClientServeur.ConfigurationClientServeur#getRpc()
	 * @see #getConfigurationClientServeur()
	 * @generated
	 */
	EReference getConfigurationClientServeur_Rpc();

	/**
	 * Returns the meta object for the reference '{@link systeme.ClientServeur.ConfigurationClientServeur#getAttachment_sendrequest_to_caller <em>Attachment sendrequest to caller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment sendrequest to caller</em>'.
	 * @see systeme.ClientServeur.ConfigurationClientServeur#getAttachment_sendrequest_to_caller()
	 * @see #getConfigurationClientServeur()
	 * @generated
	 */
	EReference getConfigurationClientServeur_Attachment_sendrequest_to_caller();

	/**
	 * Returns the meta object for the reference '{@link systeme.ClientServeur.ConfigurationClientServeur#getAttachment_receive_request <em>Attachment receive request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment receive request</em>'.
	 * @see systeme.ClientServeur.ConfigurationClientServeur#getAttachment_receive_request()
	 * @see #getConfigurationClientServeur()
	 * @generated
	 */
	EReference getConfigurationClientServeur_Attachment_receive_request();

	/**
	 * Returns the meta object for the reference '{@link systeme.ClientServeur.ConfigurationClientServeur#getAttachment_server_send_to_client <em>Attachment server send to client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment server send to client</em>'.
	 * @see systeme.ClientServeur.ConfigurationClientServeur#getAttachment_server_send_to_client()
	 * @see #getConfigurationClientServeur()
	 * @generated
	 */
	EReference getConfigurationClientServeur_Attachment_server_send_to_client();

	/**
	 * Returns the meta object for the reference '{@link systeme.ClientServeur.ConfigurationClientServeur#getAttachment_server_receive_of_client <em>Attachment server receive of client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachment server receive of client</em>'.
	 * @see systeme.ClientServeur.ConfigurationClientServeur#getAttachment_server_receive_of_client()
	 * @see #getConfigurationClientServeur()
	 * @generated
	 */
	EReference getConfigurationClientServeur_Attachment_server_receive_of_client();

	/**
	 * Returns the meta object for class '{@link projecttArchitectural.Glue <em>Glue CS2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glue CS2</em>'.
	 * @see projecttArchitectural.Glue
	 * @model instanceClass="projecttArchitectural.Glue"
	 * @generated
	 */
	EClass getGlueCS2();

	/**
	 * Returns the meta object for the reference '{@link projecttArchitectural.Glue#getCallerserveur <em>Callerserveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Callerserveur</em>'.
	 * @see projecttArchitectural.Glue#getCallerserveur()
	 * @see #getGlueCS2()
	 * @generated
	 */
	EReference getGlueCS2_Callerserveur();

	/**
	 * Returns the meta object for the reference '{@link projecttArchitectural.Glue#getCalledserveur <em>Calledserveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Calledserveur</em>'.
	 * @see projecttArchitectural.Glue#getCalledserveur()
	 * @see #getGlueCS2()
	 * @generated
	 */
	EReference getGlueCS2_Calledserveur();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ClientServeurFactory getClientServeurFactory();

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
		 * The meta object literal for the '{@link systeme.ClientServeur.impl.ComposantClientImpl <em>Composant Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.ClientServeur.impl.ComposantClientImpl
		 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getComposantClient()
		 * @generated
		 */
		EClass COMPOSANT_CLIENT = eINSTANCE.getComposantClient();

		/**
		 * The meta object literal for the '<em><b>Interfaceclient</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSANT_CLIENT__INTERFACECLIENT = eINSTANCE.getComposantClient_Interfaceclient();

		/**
		 * The meta object literal for the '{@link systeme.ClientServeur.impl.ComposantServerImpl <em>Composant Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.ClientServeur.impl.ComposantServerImpl
		 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getComposantServer()
		 * @generated
		 */
		EClass COMPOSANT_SERVER = eINSTANCE.getComposantServer();

		/**
		 * The meta object literal for the '<em><b>Interfaceserveur</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSANT_SERVER__INTERFACESERVEUR = eINSTANCE.getComposantServer_Interfaceserveur();

		/**
		 * The meta object literal for the '{@link systeme.ClientServeur.impl.InterfaceClientImpl <em>Interface Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.ClientServeur.impl.InterfaceClientImpl
		 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getInterfaceClient()
		 * @generated
		 */
		EClass INTERFACE_CLIENT = eINSTANCE.getInterfaceClient();

		/**
		 * The meta object literal for the '<em><b>Port send request</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CLIENT__PORT_SEND_REQUEST = eINSTANCE.getInterfaceClient_Port_send_request();

		/**
		 * The meta object literal for the '<em><b>Port receive client</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CLIENT__PORT_RECEIVE_CLIENT = eINSTANCE.getInterfaceClient_Port_receive_client();

		/**
		 * The meta object literal for the '{@link systeme.ClientServeur.impl.InterfaceServeurImpl <em>Interface Serveur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.ClientServeur.impl.InterfaceServeurImpl
		 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getInterfaceServeur()
		 * @generated
		 */
		EClass INTERFACE_SERVEUR = eINSTANCE.getInterfaceServeur();

		/**
		 * The meta object literal for the '<em><b>Port receive request</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_SERVEUR__PORT_RECEIVE_REQUEST = eINSTANCE.getInterfaceServeur_Port_receive_request();

		/**
		 * The meta object literal for the '<em><b>Port send serveur</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_SERVEUR__PORT_SEND_SERVEUR = eINSTANCE.getInterfaceServeur_Port_send_serveur();

		/**
		 * The meta object literal for the '{@link systeme.ClientServeur.impl.Port_Receive_RequestImpl <em>Port Receive Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.ClientServeur.impl.Port_Receive_RequestImpl
		 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getPort_Receive_Request()
		 * @generated
		 */
		EClass PORT_RECEIVE_REQUEST = eINSTANCE.getPort_Receive_Request();

		/**
		 * The meta object literal for the '{@link systeme.ClientServeur.impl.Port_Send_ClientImpl <em>Port Send Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.ClientServeur.impl.Port_Send_ClientImpl
		 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getPort_Send_Client()
		 * @generated
		 */
		EClass PORT_SEND_CLIENT = eINSTANCE.getPort_Send_Client();

		/**
		 * The meta object literal for the '{@link systeme.ClientServeur.impl.RPCImpl <em>RPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.ClientServeur.impl.RPCImpl
		 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getRPC()
		 * @generated
		 */
		EClass RPC = eINSTANCE.getRPC();

		/**
		 * The meta object literal for the '<em><b>Gluecs1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC__GLUECS1 = eINSTANCE.getRPC_Gluecs1();

		/**
		 * The meta object literal for the '<em><b>Gluecs2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC__GLUECS2 = eINSTANCE.getRPC_Gluecs2();

		/**
		 * The meta object literal for the '<em><b>Callerclient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC__CALLERCLIENT = eINSTANCE.getRPC_Callerclient();

		/**
		 * The meta object literal for the '<em><b>Callerserveur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC__CALLERSERVEUR = eINSTANCE.getRPC_Callerserveur();

		/**
		 * The meta object literal for the '<em><b>Calledclient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC__CALLEDCLIENT = eINSTANCE.getRPC_Calledclient();

		/**
		 * The meta object literal for the '<em><b>Calledserveur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC__CALLEDSERVEUR = eINSTANCE.getRPC_Calledserveur();

		/**
		 * The meta object literal for the '{@link systeme.ClientServeur.impl.CallerClientImpl <em>Caller Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.ClientServeur.impl.CallerClientImpl
		 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getCallerClient()
		 * @generated
		 */
		EClass CALLER_CLIENT = eINSTANCE.getCallerClient();

		/**
		 * The meta object literal for the '{@link systeme.ClientServeur.impl.CallerServeurImpl <em>Caller Serveur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.ClientServeur.impl.CallerServeurImpl
		 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getCallerServeur()
		 * @generated
		 */
		EClass CALLER_SERVEUR = eINSTANCE.getCallerServeur();

		/**
		 * The meta object literal for the '{@link systeme.ClientServeur.impl.Attachment_SendRequest_to_CallerImpl <em>Attachment Send Request to Caller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.ClientServeur.impl.Attachment_SendRequest_to_CallerImpl
		 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getAttachment_SendRequest_to_Caller()
		 * @generated
		 */
		EClass ATTACHMENT_SEND_REQUEST_TO_CALLER = eINSTANCE.getAttachment_SendRequest_to_Caller();

		/**
		 * The meta object literal for the '<em><b>Port send request</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_SEND_REQUEST_TO_CALLER__PORT_SEND_REQUEST = eINSTANCE.getAttachment_SendRequest_to_Caller_Port_send_request();

		/**
		 * The meta object literal for the '<em><b>Callerserveur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_SEND_REQUEST_TO_CALLER__CALLERSERVEUR = eINSTANCE.getAttachment_SendRequest_to_Caller_Callerserveur();

		/**
		 * The meta object literal for the '{@link systeme.ClientServeur.impl.CalledClientImpl <em>Called Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.ClientServeur.impl.CalledClientImpl
		 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getCalledClient()
		 * @generated
		 */
		EClass CALLED_CLIENT = eINSTANCE.getCalledClient();

		/**
		 * The meta object literal for the '{@link systeme.ClientServeur.impl.CalledServeurImpl <em>Called Serveur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.ClientServeur.impl.CalledServeurImpl
		 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getCalledServeur()
		 * @generated
		 */
		EClass CALLED_SERVEUR = eINSTANCE.getCalledServeur();

		/**
		 * The meta object literal for the '{@link systeme.ClientServeur.impl.Attachment_Receive_requestImpl <em>Attachment Receive request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.ClientServeur.impl.Attachment_Receive_requestImpl
		 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getAttachment_Receive_request()
		 * @generated
		 */
		EClass ATTACHMENT_RECEIVE_REQUEST = eINSTANCE.getAttachment_Receive_request();

		/**
		 * The meta object literal for the '<em><b>Port receive request</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_RECEIVE_REQUEST__PORT_RECEIVE_REQUEST = eINSTANCE.getAttachment_Receive_request_Port_receive_request();

		/**
		 * The meta object literal for the '<em><b>Calledserveur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_RECEIVE_REQUEST__CALLEDSERVEUR = eINSTANCE.getAttachment_Receive_request_Calledserveur();

		/**
		 * The meta object literal for the '{@link systeme.ClientServeur.impl.Attachment_server_Send_to_ClientImpl <em>Attachment server Send to Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.ClientServeur.impl.Attachment_server_Send_to_ClientImpl
		 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getAttachment_server_Send_to_Client()
		 * @generated
		 */
		EClass ATTACHMENT_SERVER_SEND_TO_CLIENT = eINSTANCE.getAttachment_server_Send_to_Client();

		/**
		 * The meta object literal for the '<em><b>Port send serveur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_SERVER_SEND_TO_CLIENT__PORT_SEND_SERVEUR = eINSTANCE.getAttachment_server_Send_to_Client_Port_send_serveur();

		/**
		 * The meta object literal for the '<em><b>Callerclient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_SERVER_SEND_TO_CLIENT__CALLERCLIENT = eINSTANCE.getAttachment_server_Send_to_Client_Callerclient();

		/**
		 * The meta object literal for the '{@link systeme.ClientServeur.impl.Attachment_server_Receive_of_ClientImpl <em>Attachment server Receive of Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.ClientServeur.impl.Attachment_server_Receive_of_ClientImpl
		 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getAttachment_server_Receive_of_Client()
		 * @generated
		 */
		EClass ATTACHMENT_SERVER_RECEIVE_OF_CLIENT = eINSTANCE.getAttachment_server_Receive_of_Client();

		/**
		 * The meta object literal for the '<em><b>Port receive client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_SERVER_RECEIVE_OF_CLIENT__PORT_RECEIVE_CLIENT = eINSTANCE.getAttachment_server_Receive_of_Client_Port_receive_client();

		/**
		 * The meta object literal for the '<em><b>Calledclient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_SERVER_RECEIVE_OF_CLIENT__CALLEDCLIENT = eINSTANCE.getAttachment_server_Receive_of_Client_Calledclient();

		/**
		 * The meta object literal for the '{@link systeme.ClientServeur.impl.Port_Send_ServeurImpl <em>Port Send Serveur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.ClientServeur.impl.Port_Send_ServeurImpl
		 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getPort_Send_Serveur()
		 * @generated
		 */
		EClass PORT_SEND_SERVEUR = eINSTANCE.getPort_Send_Serveur();

		/**
		 * The meta object literal for the '{@link systeme.ClientServeur.impl.Port_Receive_ClientImpl <em>Port Receive Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.ClientServeur.impl.Port_Receive_ClientImpl
		 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getPort_Receive_Client()
		 * @generated
		 */
		EClass PORT_RECEIVE_CLIENT = eINSTANCE.getPort_Receive_Client();

		/**
		 * The meta object literal for the '{@link systeme.ClientServeur.impl.GlueCS1Impl <em>Glue CS1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.ClientServeur.impl.GlueCS1Impl
		 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getGlueCS1()
		 * @generated
		 */
		EClass GLUE_CS1 = eINSTANCE.getGlueCS1();

		/**
		 * The meta object literal for the '<em><b>Callerclient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLUE_CS1__CALLERCLIENT = eINSTANCE.getGlueCS1_Callerclient();

		/**
		 * The meta object literal for the '<em><b>Calledclient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLUE_CS1__CALLEDCLIENT = eINSTANCE.getGlueCS1_Calledclient();

		/**
		 * The meta object literal for the '{@link systeme.ClientServeur.impl.ConfigurationClientServeurImpl <em>Configuration Client Serveur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.ClientServeur.impl.ConfigurationClientServeurImpl
		 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getConfigurationClientServeur()
		 * @generated
		 */
		EClass CONFIGURATION_CLIENT_SERVEUR = eINSTANCE.getConfigurationClientServeur();

		/**
		 * The meta object literal for the '<em><b>Composantclient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_CLIENT_SERVEUR__COMPOSANTCLIENT = eINSTANCE.getConfigurationClientServeur_Composantclient();

		/**
		 * The meta object literal for the '<em><b>Composantserver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_CLIENT_SERVEUR__COMPOSANTSERVER = eINSTANCE.getConfigurationClientServeur_Composantserver();

		/**
		 * The meta object literal for the '<em><b>Rpc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_CLIENT_SERVEUR__RPC = eINSTANCE.getConfigurationClientServeur_Rpc();

		/**
		 * The meta object literal for the '<em><b>Attachment sendrequest to caller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_SENDREQUEST_TO_CALLER = eINSTANCE.getConfigurationClientServeur_Attachment_sendrequest_to_caller();

		/**
		 * The meta object literal for the '<em><b>Attachment receive request</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_RECEIVE_REQUEST = eINSTANCE.getConfigurationClientServeur_Attachment_receive_request();

		/**
		 * The meta object literal for the '<em><b>Attachment server send to client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_SERVER_SEND_TO_CLIENT = eINSTANCE.getConfigurationClientServeur_Attachment_server_send_to_client();

		/**
		 * The meta object literal for the '<em><b>Attachment server receive of client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_SERVER_RECEIVE_OF_CLIENT = eINSTANCE.getConfigurationClientServeur_Attachment_server_receive_of_client();

		/**
		 * The meta object literal for the '{@link systeme.ClientServeur.impl.GlueCS2Impl <em>Glue CS2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see systeme.ClientServeur.impl.GlueCS2Impl
		 * @see systeme.ClientServeur.impl.ClientServeurPackageImpl#getGlueCS2()
		 * @generated
		 */
		EClass GLUE_CS2 = eINSTANCE.getGlueCS2();

		/**
		 * The meta object literal for the '<em><b>Callerserveur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLUE_CS2__CALLERSERVEUR = eINSTANCE.getGlueCS2_Callerserveur();

		/**
		 * The meta object literal for the '<em><b>Calledserveur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLUE_CS2__CALLEDSERVEUR = eINSTANCE.getGlueCS2_Calledserveur();

	}

} //ClientServeurPackage
