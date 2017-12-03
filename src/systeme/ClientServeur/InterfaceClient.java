/**
 */
package systeme.ClientServeur;

import org.eclipse.emf.common.util.EList;

import projecttArchitectural.InterfaceComposants;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link systeme.ClientServeur.InterfaceClient#getPort_send_request <em>Port send request</em>}</li>
 *   <li>{@link systeme.ClientServeur.InterfaceClient#getPort_receive_client <em>Port receive client</em>}</li>
 * </ul>
 *
 * @see systeme.ClientServeur.ClientServeurPackage#getInterfaceClient()
 * @model
 * @generated
 */
public interface InterfaceClient extends InterfaceComposants {
	/**
	 * Returns the value of the '<em><b>Port send request</b></em>' containment reference list.
	 * The list contents are of type {@link systeme.ClientServeur.Port_Send_Client}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port send request</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port send request</em>' containment reference list.
	 * @see systeme.ClientServeur.ClientServeurPackage#getInterfaceClient_Port_send_request()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port_Send_Client> getPort_send_request();

	/**
	 * Returns the value of the '<em><b>Port receive client</b></em>' containment reference list.
	 * The list contents are of type {@link systeme.ClientServeur.Port_Receive_Client}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port receive client</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port receive client</em>' containment reference list.
	 * @see systeme.ClientServeur.ClientServeurPackage#getInterfaceClient_Port_receive_client()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port_Receive_Client> getPort_receive_client();

} // InterfaceClient
