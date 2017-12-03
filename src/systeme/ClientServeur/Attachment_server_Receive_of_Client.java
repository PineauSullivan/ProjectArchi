/**
 */
package systeme.ClientServeur;

import projecttArchitectural.AttachmentFournisRequis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment server Receive of Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link systeme.ClientServeur.Attachment_server_Receive_of_Client#getPort_receive_client <em>Port receive client</em>}</li>
 *   <li>{@link systeme.ClientServeur.Attachment_server_Receive_of_Client#getCalledclient <em>Calledclient</em>}</li>
 * </ul>
 *
 * @see systeme.ClientServeur.ClientServeurPackage#getAttachment_server_Receive_of_Client()
 * @model
 * @generated
 */
public interface Attachment_server_Receive_of_Client extends AttachmentFournisRequis {
	/**
	 * Returns the value of the '<em><b>Port receive client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port receive client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port receive client</em>' reference.
	 * @see #setPort_receive_client(Port_Receive_Client)
	 * @see systeme.ClientServeur.ClientServeurPackage#getAttachment_server_Receive_of_Client_Port_receive_client()
	 * @model
	 * @generated
	 */
	Port_Receive_Client getPort_receive_client();

	/**
	 * Sets the value of the '{@link systeme.ClientServeur.Attachment_server_Receive_of_Client#getPort_receive_client <em>Port receive client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port receive client</em>' reference.
	 * @see #getPort_receive_client()
	 * @generated
	 */
	void setPort_receive_client(Port_Receive_Client value);

	/**
	 * Returns the value of the '<em><b>Calledclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calledclient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calledclient</em>' reference.
	 * @see #setCalledclient(CalledClient)
	 * @see systeme.ClientServeur.ClientServeurPackage#getAttachment_server_Receive_of_Client_Calledclient()
	 * @model
	 * @generated
	 */
	CalledClient getCalledclient();

	/**
	 * Sets the value of the '{@link systeme.ClientServeur.Attachment_server_Receive_of_Client#getCalledclient <em>Calledclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calledclient</em>' reference.
	 * @see #getCalledclient()
	 * @generated
	 */
	void setCalledclient(CalledClient value);

} // Attachment_server_Receive_of_Client
