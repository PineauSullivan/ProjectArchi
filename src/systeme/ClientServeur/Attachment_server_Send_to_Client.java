/**
 */
package systeme.ClientServeur;

import projecttArchitectural.AttachmentsRequisFournis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment server Send to Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link systeme.ClientServeur.Attachment_server_Send_to_Client#getPort_send_serveur <em>Port send serveur</em>}</li>
 *   <li>{@link systeme.ClientServeur.Attachment_server_Send_to_Client#getCallerclient <em>Callerclient</em>}</li>
 * </ul>
 *
 * @see systeme.ClientServeur.ClientServeurPackage#getAttachment_server_Send_to_Client()
 * @model
 * @generated
 */
public interface Attachment_server_Send_to_Client extends AttachmentsRequisFournis {
	/**
	 * Returns the value of the '<em><b>Port send serveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port send serveur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port send serveur</em>' reference.
	 * @see #setPort_send_serveur(Port_Send_Serveur)
	 * @see systeme.ClientServeur.ClientServeurPackage#getAttachment_server_Send_to_Client_Port_send_serveur()
	 * @model
	 * @generated
	 */
	Port_Send_Serveur getPort_send_serveur();

	/**
	 * Sets the value of the '{@link systeme.ClientServeur.Attachment_server_Send_to_Client#getPort_send_serveur <em>Port send serveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port send serveur</em>' reference.
	 * @see #getPort_send_serveur()
	 * @generated
	 */
	void setPort_send_serveur(Port_Send_Serveur value);

	/**
	 * Returns the value of the '<em><b>Callerclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callerclient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callerclient</em>' reference.
	 * @see #setCallerclient(CallerClient)
	 * @see systeme.ClientServeur.ClientServeurPackage#getAttachment_server_Send_to_Client_Callerclient()
	 * @model
	 * @generated
	 */
	CallerClient getCallerclient();

	/**
	 * Sets the value of the '{@link systeme.ClientServeur.Attachment_server_Send_to_Client#getCallerclient <em>Callerclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callerclient</em>' reference.
	 * @see #getCallerclient()
	 * @generated
	 */
	void setCallerclient(CallerClient value);

} // Attachment_server_Send_to_Client
