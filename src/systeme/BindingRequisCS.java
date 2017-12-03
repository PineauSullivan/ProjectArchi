/**
 */
package systeme;

import org.eclipse.emf.ecore.EObject;

import systeme.ClientServeur.Port_Send_Serveur;

import systeme.FonctionServeur.PortRequisConfigCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Requis CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link systeme.BindingRequisCS#getPortrequisconfigcs <em>Portrequisconfigcs</em>}</li>
 *   <li>{@link systeme.BindingRequisCS#getPort_receive_request <em>Port receive request</em>}</li>
 * </ul>
 *
 * @see systeme.SystemePackage#getBindingRequisCS()
 * @model
 * @generated
 */
public interface BindingRequisCS extends EObject {
	/**
	 * Returns the value of the '<em><b>Portrequisconfigcs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portrequisconfigcs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portrequisconfigcs</em>' reference.
	 * @see #setPortrequisconfigcs(PortRequisConfigCS)
	 * @see systeme.SystemePackage#getBindingRequisCS_Portrequisconfigcs()
	 * @model
	 * @generated
	 */
	PortRequisConfigCS getPortrequisconfigcs();

	/**
	 * Sets the value of the '{@link systeme.BindingRequisCS#getPortrequisconfigcs <em>Portrequisconfigcs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portrequisconfigcs</em>' reference.
	 * @see #getPortrequisconfigcs()
	 * @generated
	 */
	void setPortrequisconfigcs(PortRequisConfigCS value);

	/**
	 * Returns the value of the '<em><b>Port receive request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port receive request</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port receive request</em>' reference.
	 * @see #setPort_receive_request(Port_Send_Serveur)
	 * @see systeme.SystemePackage#getBindingRequisCS_Port_receive_request()
	 * @model
	 * @generated
	 */
	Port_Send_Serveur getPort_receive_request();

	/**
	 * Sets the value of the '{@link systeme.BindingRequisCS#getPort_receive_request <em>Port receive request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port receive request</em>' reference.
	 * @see #getPort_receive_request()
	 * @generated
	 */
	void setPort_receive_request(Port_Send_Serveur value);

} // BindingRequisCS
