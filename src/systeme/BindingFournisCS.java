/**
 */
package systeme;

import org.eclipse.emf.ecore.EObject;

import systeme.ClientServeur.Port_Receive_Request;

import systeme.FonctionServeur.PortFournisCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Fournis CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link systeme.BindingFournisCS#getPort_receive_request <em>Port receive request</em>}</li>
 *   <li>{@link systeme.BindingFournisCS#getPortfourniscs <em>Portfourniscs</em>}</li>
 * </ul>
 *
 * @see systeme.SystemePackage#getBindingFournisCS()
 * @model
 * @generated
 */
public interface BindingFournisCS extends EObject {
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
	 * @see systeme.SystemePackage#getBindingFournisCS_Port_receive_request()
	 * @model
	 * @generated
	 */
	Port_Receive_Request getPort_receive_request();

	/**
	 * Sets the value of the '{@link systeme.BindingFournisCS#getPort_receive_request <em>Port receive request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port receive request</em>' reference.
	 * @see #getPort_receive_request()
	 * @generated
	 */
	void setPort_receive_request(Port_Receive_Request value);

	/**
	 * Returns the value of the '<em><b>Portfourniscs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portfourniscs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portfourniscs</em>' reference.
	 * @see #setPortfourniscs(PortFournisCS)
	 * @see systeme.SystemePackage#getBindingFournisCS_Portfourniscs()
	 * @model
	 * @generated
	 */
	PortFournisCS getPortfourniscs();

	/**
	 * Sets the value of the '{@link systeme.BindingFournisCS#getPortfourniscs <em>Portfourniscs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portfourniscs</em>' reference.
	 * @see #getPortfourniscs()
	 * @generated
	 */
	void setPortfourniscs(PortFournisCS value);

} // BindingFournisCS
