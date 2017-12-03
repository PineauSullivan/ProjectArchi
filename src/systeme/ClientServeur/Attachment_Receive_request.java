/**
 */
package systeme.ClientServeur;

import projecttArchitectural.AttachmentFournisRequis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment Receive request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link systeme.ClientServeur.Attachment_Receive_request#getPort_receive_request <em>Port receive request</em>}</li>
 *   <li>{@link systeme.ClientServeur.Attachment_Receive_request#getCalledserveur <em>Calledserveur</em>}</li>
 * </ul>
 *
 * @see systeme.ClientServeur.ClientServeurPackage#getAttachment_Receive_request()
 * @model
 * @generated
 */
public interface Attachment_Receive_request extends AttachmentFournisRequis {
	/**
	 * Returns the value of the '<em><b>Port receive request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port receive request</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port receive request</em>' reference.
	 * @see #setPort_receive_request(Port_Receive_Request)
	 * @see systeme.ClientServeur.ClientServeurPackage#getAttachment_Receive_request_Port_receive_request()
	 * @model
	 * @generated
	 */
	Port_Receive_Request getPort_receive_request();

	/**
	 * Sets the value of the '{@link systeme.ClientServeur.Attachment_Receive_request#getPort_receive_request <em>Port receive request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port receive request</em>' reference.
	 * @see #getPort_receive_request()
	 * @generated
	 */
	void setPort_receive_request(Port_Receive_Request value);

	/**
	 * Returns the value of the '<em><b>Calledserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calledserveur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calledserveur</em>' reference.
	 * @see #setCalledserveur(CalledServeur)
	 * @see systeme.ClientServeur.ClientServeurPackage#getAttachment_Receive_request_Calledserveur()
	 * @model
	 * @generated
	 */
	CalledServeur getCalledserveur();

	/**
	 * Sets the value of the '{@link systeme.ClientServeur.Attachment_Receive_request#getCalledserveur <em>Calledserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calledserveur</em>' reference.
	 * @see #getCalledserveur()
	 * @generated
	 */
	void setCalledserveur(CalledServeur value);

} // Attachment_Receive_request
