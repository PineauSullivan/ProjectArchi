/**
 */
package systeme.ClientServeur;

import org.eclipse.emf.ecore.EFactory;

import projecttArchitectural.Glue;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see systeme.ClientServeur.ClientServeurPackage
 * @generated
 */
public interface ClientServeurFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClientServeurFactory eINSTANCE = systeme.ClientServeur.impl.ClientServeurFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Composant Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composant Client</em>'.
	 * @generated
	 */
	ComposantClient createComposantClient();

	/**
	 * Returns a new object of class '<em>Composant Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composant Server</em>'.
	 * @generated
	 */
	ComposantServer createComposantServer();

	/**
	 * Returns a new object of class '<em>Interface Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Client</em>'.
	 * @generated
	 */
	InterfaceClient createInterfaceClient();

	/**
	 * Returns a new object of class '<em>Interface Serveur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Serveur</em>'.
	 * @generated
	 */
	InterfaceServeur createInterfaceServeur();

	/**
	 * Returns a new object of class '<em>Port Receive Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Receive Request</em>'.
	 * @generated
	 */
	Port_Receive_Request createPort_Receive_Request();

	/**
	 * Returns a new object of class '<em>Port Send Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Send Client</em>'.
	 * @generated
	 */
	Port_Send_Client createPort_Send_Client();

	/**
	 * Returns a new object of class '<em>RPC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RPC</em>'.
	 * @generated
	 */
	RPC createRPC();

	/**
	 * Returns a new object of class '<em>Caller Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Caller Client</em>'.
	 * @generated
	 */
	CallerClient createCallerClient();

	/**
	 * Returns a new object of class '<em>Caller Serveur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Caller Serveur</em>'.
	 * @generated
	 */
	CallerServeur createCallerServeur();

	/**
	 * Returns a new object of class '<em>Attachment Send Request to Caller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment Send Request to Caller</em>'.
	 * @generated
	 */
	Attachment_SendRequest_to_Caller createAttachment_SendRequest_to_Caller();

	/**
	 * Returns a new object of class '<em>Called Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Called Client</em>'.
	 * @generated
	 */
	CalledClient createCalledClient();

	/**
	 * Returns a new object of class '<em>Called Serveur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Called Serveur</em>'.
	 * @generated
	 */
	CalledServeur createCalledServeur();

	/**
	 * Returns a new object of class '<em>Attachment Receive request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment Receive request</em>'.
	 * @generated
	 */
	Attachment_Receive_request createAttachment_Receive_request();

	/**
	 * Returns a new object of class '<em>Attachment server Send to Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment server Send to Client</em>'.
	 * @generated
	 */
	Attachment_server_Send_to_Client createAttachment_server_Send_to_Client();

	/**
	 * Returns a new object of class '<em>Attachment server Receive of Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment server Receive of Client</em>'.
	 * @generated
	 */
	Attachment_server_Receive_of_Client createAttachment_server_Receive_of_Client();

	/**
	 * Returns a new object of class '<em>Port Send Serveur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Send Serveur</em>'.
	 * @generated
	 */
	Port_Send_Serveur createPort_Send_Serveur();

	/**
	 * Returns a new object of class '<em>Port Receive Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Receive Client</em>'.
	 * @generated
	 */
	Port_Receive_Client createPort_Receive_Client();

	/**
	 * Returns a new object of class '<em>Glue CS1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glue CS1</em>'.
	 * @generated
	 */
	Glue createGlueCS1();

	/**
	 * Returns a new object of class '<em>Configuration Client Serveur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Client Serveur</em>'.
	 * @generated
	 */
	ConfigurationClientServeur createConfigurationClientServeur();

	/**
	 * Returns a new object of class '<em>Glue CS2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glue CS2</em>'.
	 * @generated
	 */
	Glue createGlueCS2();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ClientServeurPackage getClientServeurPackage();

} //ClientServeurFactory
