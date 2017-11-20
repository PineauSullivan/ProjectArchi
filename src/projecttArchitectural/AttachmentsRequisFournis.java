/**
 */
package projecttArchitectural;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachments Requis Fournis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projecttArchitectural.AttachmentsRequisFournis#getPortscomposantsrequis <em>Portscomposantsrequis</em>}</li>
 *   <li>{@link projecttArchitectural.AttachmentsRequisFournis#getRoleconnecteursfournis <em>Roleconnecteursfournis</em>}</li>
 * </ul>
 *
 * @see projecttArchitectural.ProjecttArchitecturalPackage#getAttachmentsRequisFournis()
 * @model
 * @generated
 */
public interface AttachmentsRequisFournis extends Attachment {
	/**
	 * Returns the value of the '<em><b>Portscomposantsrequis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portscomposantsrequis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portscomposantsrequis</em>' reference.
	 * @see #setPortscomposantsrequis(PortsComposantsRequis)
	 * @see projecttArchitectural.ProjecttArchitecturalPackage#getAttachmentsRequisFournis_Portscomposantsrequis()
	 * @model
	 * @generated
	 */
	PortsComposantsRequis getPortscomposantsrequis();

	/**
	 * Sets the value of the '{@link projecttArchitectural.AttachmentsRequisFournis#getPortscomposantsrequis <em>Portscomposantsrequis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portscomposantsrequis</em>' reference.
	 * @see #getPortscomposantsrequis()
	 * @generated
	 */
	void setPortscomposantsrequis(PortsComposantsRequis value);

	/**
	 * Returns the value of the '<em><b>Roleconnecteursfournis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roleconnecteursfournis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roleconnecteursfournis</em>' reference.
	 * @see #setRoleconnecteursfournis(RoleConnecteursFournis)
	 * @see projecttArchitectural.ProjecttArchitecturalPackage#getAttachmentsRequisFournis_Roleconnecteursfournis()
	 * @model
	 * @generated
	 */
	RoleConnecteursFournis getRoleconnecteursfournis();

	/**
	 * Sets the value of the '{@link projecttArchitectural.AttachmentsRequisFournis#getRoleconnecteursfournis <em>Roleconnecteursfournis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roleconnecteursfournis</em>' reference.
	 * @see #getRoleconnecteursfournis()
	 * @generated
	 */
	void setRoleconnecteursfournis(RoleConnecteursFournis value);

} // AttachmentsRequisFournis
