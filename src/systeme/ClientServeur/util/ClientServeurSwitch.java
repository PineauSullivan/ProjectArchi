/**
 */
package systeme.ClientServeur.util;

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

import systeme.ClientServeur.*;

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
 * @see systeme.ClientServeur.ClientServeurPackage
 * @generated
 */
public class ClientServeurSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ClientServeurPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientServeurSwitch() {
		if (modelPackage == null) {
			modelPackage = ClientServeurPackage.eINSTANCE;
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
			case ClientServeurPackage.COMPOSANT_CLIENT: {
				ComposantClient composantClient = (ComposantClient)theEObject;
				T result = caseComposantClient(composantClient);
				if (result == null) result = caseComposants(composantClient);
				if (result == null) result = caseElement(composantClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClientServeurPackage.COMPOSANT_SERVER: {
				ComposantServer composantServer = (ComposantServer)theEObject;
				T result = caseComposantServer(composantServer);
				if (result == null) result = caseComposants(composantServer);
				if (result == null) result = caseElement(composantServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClientServeurPackage.INTERFACE_CLIENT: {
				InterfaceClient interfaceClient = (InterfaceClient)theEObject;
				T result = caseInterfaceClient(interfaceClient);
				if (result == null) result = caseInterfaceComposants(interfaceClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClientServeurPackage.INTERFACE_SERVEUR: {
				InterfaceServeur interfaceServeur = (InterfaceServeur)theEObject;
				T result = caseInterfaceServeur(interfaceServeur);
				if (result == null) result = caseInterfaceComposants(interfaceServeur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClientServeurPackage.PORT_RECEIVE_REQUEST: {
				Port_Receive_Request port_Receive_Request = (Port_Receive_Request)theEObject;
				T result = casePort_Receive_Request(port_Receive_Request);
				if (result == null) result = casePortsComposantsFournis(port_Receive_Request);
				if (result == null) result = casePortsComposants(port_Receive_Request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClientServeurPackage.PORT_SEND_CLIENT: {
				Port_Send_Client port_Send_Client = (Port_Send_Client)theEObject;
				T result = casePort_Send_Client(port_Send_Client);
				if (result == null) result = casePortsComposantsRequis(port_Send_Client);
				if (result == null) result = casePortsComposants(port_Send_Client);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClientServeurPackage.RPC: {
				RPC rpc = (RPC)theEObject;
				T result = caseRPC(rpc);
				if (result == null) result = caseConnecteurs(rpc);
				if (result == null) result = caseElement(rpc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClientServeurPackage.CALLER_CLIENT: {
				CallerClient callerClient = (CallerClient)theEObject;
				T result = caseCallerClient(callerClient);
				if (result == null) result = caseRoleConnecteursFournis(callerClient);
				if (result == null) result = caseRoleConnecteurs(callerClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClientServeurPackage.CALLER_SERVEUR: {
				CallerServeur callerServeur = (CallerServeur)theEObject;
				T result = caseCallerServeur(callerServeur);
				if (result == null) result = caseRoleConnecteursFournis(callerServeur);
				if (result == null) result = caseRoleConnecteurs(callerServeur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClientServeurPackage.ATTACHMENT_SEND_REQUEST_TO_CALLER: {
				Attachment_SendRequest_to_Caller attachment_SendRequest_to_Caller = (Attachment_SendRequest_to_Caller)theEObject;
				T result = caseAttachment_SendRequest_to_Caller(attachment_SendRequest_to_Caller);
				if (result == null) result = caseAttachmentsRequisFournis(attachment_SendRequest_to_Caller);
				if (result == null) result = caseAttachment(attachment_SendRequest_to_Caller);
				if (result == null) result = caseLien(attachment_SendRequest_to_Caller);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClientServeurPackage.CALLED_CLIENT: {
				CalledClient calledClient = (CalledClient)theEObject;
				T result = caseCalledClient(calledClient);
				if (result == null) result = caseRoleConnecteursRequis(calledClient);
				if (result == null) result = caseRoleConnecteurs(calledClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClientServeurPackage.CALLED_SERVEUR: {
				CalledServeur calledServeur = (CalledServeur)theEObject;
				T result = caseCalledServeur(calledServeur);
				if (result == null) result = caseRoleConnecteursRequis(calledServeur);
				if (result == null) result = caseRoleConnecteurs(calledServeur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClientServeurPackage.ATTACHMENT_RECEIVE_REQUEST: {
				Attachment_Receive_request attachment_Receive_request = (Attachment_Receive_request)theEObject;
				T result = caseAttachment_Receive_request(attachment_Receive_request);
				if (result == null) result = caseAttachmentFournisRequis(attachment_Receive_request);
				if (result == null) result = caseAttachment(attachment_Receive_request);
				if (result == null) result = caseLien(attachment_Receive_request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClientServeurPackage.ATTACHMENT_SERVER_SEND_TO_CLIENT: {
				Attachment_server_Send_to_Client attachment_server_Send_to_Client = (Attachment_server_Send_to_Client)theEObject;
				T result = caseAttachment_server_Send_to_Client(attachment_server_Send_to_Client);
				if (result == null) result = caseAttachmentsRequisFournis(attachment_server_Send_to_Client);
				if (result == null) result = caseAttachment(attachment_server_Send_to_Client);
				if (result == null) result = caseLien(attachment_server_Send_to_Client);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClientServeurPackage.ATTACHMENT_SERVER_RECEIVE_OF_CLIENT: {
				Attachment_server_Receive_of_Client attachment_server_Receive_of_Client = (Attachment_server_Receive_of_Client)theEObject;
				T result = caseAttachment_server_Receive_of_Client(attachment_server_Receive_of_Client);
				if (result == null) result = caseAttachmentFournisRequis(attachment_server_Receive_of_Client);
				if (result == null) result = caseAttachment(attachment_server_Receive_of_Client);
				if (result == null) result = caseLien(attachment_server_Receive_of_Client);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClientServeurPackage.PORT_SEND_SERVEUR: {
				Port_Send_Serveur port_Send_Serveur = (Port_Send_Serveur)theEObject;
				T result = casePort_Send_Serveur(port_Send_Serveur);
				if (result == null) result = casePortsComposantsRequis(port_Send_Serveur);
				if (result == null) result = casePortsComposants(port_Send_Serveur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClientServeurPackage.PORT_RECEIVE_CLIENT: {
				Port_Receive_Client port_Receive_Client = (Port_Receive_Client)theEObject;
				T result = casePort_Receive_Client(port_Receive_Client);
				if (result == null) result = casePortsComposantsFournis(port_Receive_Client);
				if (result == null) result = casePortsComposants(port_Receive_Client);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClientServeurPackage.GLUE_CS1: {
				Glue glueCS1 = (Glue)theEObject;
				T result = caseGlueCS1(glueCS1);
				if (result == null) result = caseGlue(glueCS1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR: {
				ConfigurationClientServeur configurationClientServeur = (ConfigurationClientServeur)theEObject;
				T result = caseConfigurationClientServeur(configurationClientServeur);
				if (result == null) result = caseConfigurations(configurationClientServeur);
				if (result == null) result = caseElement(configurationClientServeur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClientServeurPackage.GLUE_CS2: {
				Glue glueCS2 = (Glue)theEObject;
				T result = caseGlueCS2(glueCS2);
				if (result == null) result = caseGlue(glueCS2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composant Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composant Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposantClient(ComposantClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composant Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composant Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposantServer(ComposantServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceClient(InterfaceClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Serveur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Serveur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceServeur(InterfaceServeur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Receive Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Receive Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort_Receive_Request(Port_Receive_Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Send Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Send Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort_Send_Client(Port_Send_Client object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPC(RPC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Caller Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Caller Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallerClient(CallerClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Caller Serveur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Caller Serveur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallerServeur(CallerServeur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment Send Request to Caller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment Send Request to Caller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment_SendRequest_to_Caller(Attachment_SendRequest_to_Caller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Called Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Called Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalledClient(CalledClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Called Serveur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Called Serveur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalledServeur(CalledServeur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment Receive request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment Receive request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment_Receive_request(Attachment_Receive_request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment server Send to Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment server Send to Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment_server_Send_to_Client(Attachment_server_Send_to_Client object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment server Receive of Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment server Receive of Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment_server_Receive_of_Client(Attachment_server_Receive_of_Client object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Send Serveur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Send Serveur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort_Send_Serveur(Port_Send_Serveur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Receive Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Receive Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort_Receive_Client(Port_Receive_Client object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glue CS1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glue CS1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlueCS1(Glue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Client Serveur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Client Serveur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationClientServeur(ConfigurationClientServeur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glue CS2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glue CS2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlueCS2(Glue object) {
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

} //ClientServeurSwitch
