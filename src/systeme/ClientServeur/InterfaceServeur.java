/**
 */
package systeme.ClientServeur;

import org.eclipse.emf.common.util.EList;

import projecttArchitectural.InterfaceComposants;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Serveur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link systeme.ClientServeur.InterfaceServeur#getPort_receive_request <em>Port receive request</em>}</li>
 *   <li>{@link systeme.ClientServeur.InterfaceServeur#getPort_send_serveur <em>Port send serveur</em>}</li>
 * </ul>
 *
 * @see systeme.ClientServeur.ClientServeurPackage#getInterfaceServeur()
 * @model
 * @generated
 */
public interface InterfaceServeur extends InterfaceComposants {
	/**
	 * Returns the value of the '<em><b>Port receive request</b></em>' containment reference list.
	 * The list contents are of type {@link systeme.ClientServeur.Port_Receive_Request}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port receive request</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port receive request</em>' containment reference list.
	 * @see systeme.ClientServeur.ClientServeurPackage#getInterfaceServeur_Port_receive_request()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port_Receive_Request> getPort_receive_request();

	/**
	 * Returns the value of the '<em><b>Port send serveur</b></em>' containment reference list.
	 * The list contents are of type {@link systeme.ClientServeur.Port_Send_Serveur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port send serveur</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port send serveur</em>' containment reference list.
	 * @see systeme.ClientServeur.ClientServeurPackage#getInterfaceServeur_Port_send_serveur()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port_Send_Serveur> getPort_send_serveur();

} // InterfaceServeur
