/**
 */
package systeme.ClientServeur;

import projecttArchitectural.Configurations;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Client Serveur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link systeme.ClientServeur.ConfigurationClientServeur#getComposantclient <em>Composantclient</em>}</li>
 *   <li>{@link systeme.ClientServeur.ConfigurationClientServeur#getComposantserver <em>Composantserver</em>}</li>
 *   <li>{@link systeme.ClientServeur.ConfigurationClientServeur#getRpc <em>Rpc</em>}</li>
 *   <li>{@link systeme.ClientServeur.ConfigurationClientServeur#getAttachment_sendrequest_to_caller <em>Attachment sendrequest to caller</em>}</li>
 *   <li>{@link systeme.ClientServeur.ConfigurationClientServeur#getAttachment_receive_request <em>Attachment receive request</em>}</li>
 *   <li>{@link systeme.ClientServeur.ConfigurationClientServeur#getAttachment_server_send_to_client <em>Attachment server send to client</em>}</li>
 *   <li>{@link systeme.ClientServeur.ConfigurationClientServeur#getAttachment_server_receive_of_client <em>Attachment server receive of client</em>}</li>
 * </ul>
 *
 * @see systeme.ClientServeur.ClientServeurPackage#getConfigurationClientServeur()
 * @model
 * @generated
 */
public interface ConfigurationClientServeur extends Configurations {
	/**
	 * Returns the value of the '<em><b>Composantclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composantclient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composantclient</em>' reference.
	 * @see #setComposantclient(ComposantClient)
	 * @see systeme.ClientServeur.ClientServeurPackage#getConfigurationClientServeur_Composantclient()
	 * @model
	 * @generated
	 */
	ComposantClient getComposantclient();

	/**
	 * Sets the value of the '{@link systeme.ClientServeur.ConfigurationClientServeur#getComposantclient <em>Composantclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composantclient</em>' reference.
	 * @see #getComposantclient()
	 * @generated
	 */
	void setComposantclient(ComposantClient value);

	/**
	 * Returns the value of the '<em><b>Composantserver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composantserver</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composantserver</em>' reference.
	 * @see #setComposantserver(ComposantServer)
	 * @see systeme.ClientServeur.ClientServeurPackage#getConfigurationClientServeur_Composantserver()
	 * @model
	 * @generated
	 */
	ComposantServer getComposantserver();

	/**
	 * Sets the value of the '{@link systeme.ClientServeur.ConfigurationClientServeur#getComposantserver <em>Composantserver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composantserver</em>' reference.
	 * @see #getComposantserver()
	 * @generated
	 */
	void setComposantserver(ComposantServer value);

	/**
	 * Returns the value of the '<em><b>Rpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rpc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rpc</em>' reference.
	 * @see #setRpc(RPC)
	 * @see systeme.ClientServeur.ClientServeurPackage#getConfigurationClientServeur_Rpc()
	 * @model
	 * @generated
	 */
	RPC getRpc();

	/**
	 * Sets the value of the '{@link systeme.ClientServeur.ConfigurationClientServeur#getRpc <em>Rpc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rpc</em>' reference.
	 * @see #getRpc()
	 * @generated
	 */
	void setRpc(RPC value);

	/**
	 * Returns the value of the '<em><b>Attachment sendrequest to caller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment sendrequest to caller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment sendrequest to caller</em>' reference.
	 * @see #setAttachment_sendrequest_to_caller(Attachment_SendRequest_to_Caller)
	 * @see systeme.ClientServeur.ClientServeurPackage#getConfigurationClientServeur_Attachment_sendrequest_to_caller()
	 * @model
	 * @generated
	 */
	Attachment_SendRequest_to_Caller getAttachment_sendrequest_to_caller();

	/**
	 * Sets the value of the '{@link systeme.ClientServeur.ConfigurationClientServeur#getAttachment_sendrequest_to_caller <em>Attachment sendrequest to caller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment sendrequest to caller</em>' reference.
	 * @see #getAttachment_sendrequest_to_caller()
	 * @generated
	 */
	void setAttachment_sendrequest_to_caller(Attachment_SendRequest_to_Caller value);

	/**
	 * Returns the value of the '<em><b>Attachment receive request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment receive request</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment receive request</em>' reference.
	 * @see #setAttachment_receive_request(Attachment_Receive_request)
	 * @see systeme.ClientServeur.ClientServeurPackage#getConfigurationClientServeur_Attachment_receive_request()
	 * @model
	 * @generated
	 */
	Attachment_Receive_request getAttachment_receive_request();

	/**
	 * Sets the value of the '{@link systeme.ClientServeur.ConfigurationClientServeur#getAttachment_receive_request <em>Attachment receive request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment receive request</em>' reference.
	 * @see #getAttachment_receive_request()
	 * @generated
	 */
	void setAttachment_receive_request(Attachment_Receive_request value);

	/**
	 * Returns the value of the '<em><b>Attachment server send to client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment server send to client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment server send to client</em>' reference.
	 * @see #setAttachment_server_send_to_client(Attachment_server_Send_to_Client)
	 * @see systeme.ClientServeur.ClientServeurPackage#getConfigurationClientServeur_Attachment_server_send_to_client()
	 * @model
	 * @generated
	 */
	Attachment_server_Send_to_Client getAttachment_server_send_to_client();

	/**
	 * Sets the value of the '{@link systeme.ClientServeur.ConfigurationClientServeur#getAttachment_server_send_to_client <em>Attachment server send to client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment server send to client</em>' reference.
	 * @see #getAttachment_server_send_to_client()
	 * @generated
	 */
	void setAttachment_server_send_to_client(Attachment_server_Send_to_Client value);

	/**
	 * Returns the value of the '<em><b>Attachment server receive of client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment server receive of client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment server receive of client</em>' reference.
	 * @see #setAttachment_server_receive_of_client(Attachment_server_Receive_of_Client)
	 * @see systeme.ClientServeur.ClientServeurPackage#getConfigurationClientServeur_Attachment_server_receive_of_client()
	 * @model
	 * @generated
	 */
	Attachment_server_Receive_of_Client getAttachment_server_receive_of_client();

	/**
	 * Sets the value of the '{@link systeme.ClientServeur.ConfigurationClientServeur#getAttachment_server_receive_of_client <em>Attachment server receive of client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment server receive of client</em>' reference.
	 * @see #getAttachment_server_receive_of_client()
	 * @generated
	 */
	void setAttachment_server_receive_of_client(Attachment_server_Receive_of_Client value);

} // ConfigurationClientServeur
