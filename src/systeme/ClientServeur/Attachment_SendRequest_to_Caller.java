/**
 */
package systeme.ClientServeur;

import projecttArchitectural.AttachmentsRequisFournis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment Send Request to Caller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link systeme.ClientServeur.Attachment_SendRequest_to_Caller#getPort_send_request <em>Port send request</em>}</li>
 *   <li>{@link systeme.ClientServeur.Attachment_SendRequest_to_Caller#getCallerserveur <em>Callerserveur</em>}</li>
 * </ul>
 *
 * @see systeme.ClientServeur.ClientServeurPackage#getAttachment_SendRequest_to_Caller()
 * @model
 * @generated
 */
public interface Attachment_SendRequest_to_Caller extends AttachmentsRequisFournis {
	/**
	 * Returns the value of the '<em><b>Port send request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port send request</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port send request</em>' reference.
	 * @see #setPort_send_request(Port_Send_Client)
	 * @see systeme.ClientServeur.ClientServeurPackage#getAttachment_SendRequest_to_Caller_Port_send_request()
	 * @model
	 * @generated
	 */
	Port_Send_Client getPort_send_request();

	/**
	 * Sets the value of the '{@link systeme.ClientServeur.Attachment_SendRequest_to_Caller#getPort_send_request <em>Port send request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port send request</em>' reference.
	 * @see #getPort_send_request()
	 * @generated
	 */
	void setPort_send_request(Port_Send_Client value);

	/**
	 * Returns the value of the '<em><b>Callerserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callerserveur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callerserveur</em>' reference.
	 * @see #setCallerserveur(CallerServeur)
	 * @see systeme.ClientServeur.ClientServeurPackage#getAttachment_SendRequest_to_Caller_Callerserveur()
	 * @model
	 * @generated
	 */
	CallerServeur getCallerserveur();

	/**
	 * Sets the value of the '{@link systeme.ClientServeur.Attachment_SendRequest_to_Caller#getCallerserveur <em>Callerserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callerserveur</em>' reference.
	 * @see #getCallerserveur()
	 * @generated
	 */
	void setCallerserveur(CallerServeur value);

} // Attachment_SendRequest_to_Caller
