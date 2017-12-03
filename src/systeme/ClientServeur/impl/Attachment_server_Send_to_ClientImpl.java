/**
 */
package systeme.ClientServeur.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projecttArchitectural.impl.AttachmentsRequisFournisImpl;

import systeme.ClientServeur.Attachment_server_Send_to_Client;
import systeme.ClientServeur.CallerClient;
import systeme.ClientServeur.ClientServeurPackage;
import systeme.ClientServeur.Port_Send_Serveur;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment server Send to Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.ClientServeur.impl.Attachment_server_Send_to_ClientImpl#getPort_send_serveur <em>Port send serveur</em>}</li>
 *   <li>{@link systeme.ClientServeur.impl.Attachment_server_Send_to_ClientImpl#getCallerclient <em>Callerclient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Attachment_server_Send_to_ClientImpl extends AttachmentsRequisFournisImpl implements Attachment_server_Send_to_Client {
	/**
	 * The cached value of the '{@link #getPort_send_serveur() <em>Port send serveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_send_serveur()
	 * @generated
	 * @ordered
	 */
	protected Port_Send_Serveur port_send_serveur;

	/**
	 * The cached value of the '{@link #getCallerclient() <em>Callerclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallerclient()
	 * @generated
	 * @ordered
	 */
	protected CallerClient callerclient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Attachment_server_Send_to_ClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClientServeurPackage.Literals.ATTACHMENT_SERVER_SEND_TO_CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Send_Serveur getPort_send_serveur() {
		if (port_send_serveur != null && port_send_serveur.eIsProxy()) {
			InternalEObject oldPort_send_serveur = (InternalEObject)port_send_serveur;
			port_send_serveur = (Port_Send_Serveur)eResolveProxy(oldPort_send_serveur);
			if (port_send_serveur != oldPort_send_serveur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClientServeurPackage.ATTACHMENT_SERVER_SEND_TO_CLIENT__PORT_SEND_SERVEUR, oldPort_send_serveur, port_send_serveur));
			}
		}
		return port_send_serveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Send_Serveur basicGetPort_send_serveur() {
		return port_send_serveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort_send_serveur(Port_Send_Serveur newPort_send_serveur) {
		Port_Send_Serveur oldPort_send_serveur = port_send_serveur;
		port_send_serveur = newPort_send_serveur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClientServeurPackage.ATTACHMENT_SERVER_SEND_TO_CLIENT__PORT_SEND_SERVEUR, oldPort_send_serveur, port_send_serveur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallerClient getCallerclient() {
		if (callerclient != null && callerclient.eIsProxy()) {
			InternalEObject oldCallerclient = (InternalEObject)callerclient;
			callerclient = (CallerClient)eResolveProxy(oldCallerclient);
			if (callerclient != oldCallerclient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClientServeurPackage.ATTACHMENT_SERVER_SEND_TO_CLIENT__CALLERCLIENT, oldCallerclient, callerclient));
			}
		}
		return callerclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallerClient basicGetCallerclient() {
		return callerclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallerclient(CallerClient newCallerclient) {
		CallerClient oldCallerclient = callerclient;
		callerclient = newCallerclient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClientServeurPackage.ATTACHMENT_SERVER_SEND_TO_CLIENT__CALLERCLIENT, oldCallerclient, callerclient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClientServeurPackage.ATTACHMENT_SERVER_SEND_TO_CLIENT__PORT_SEND_SERVEUR:
				if (resolve) return getPort_send_serveur();
				return basicGetPort_send_serveur();
			case ClientServeurPackage.ATTACHMENT_SERVER_SEND_TO_CLIENT__CALLERCLIENT:
				if (resolve) return getCallerclient();
				return basicGetCallerclient();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClientServeurPackage.ATTACHMENT_SERVER_SEND_TO_CLIENT__PORT_SEND_SERVEUR:
				setPort_send_serveur((Port_Send_Serveur)newValue);
				return;
			case ClientServeurPackage.ATTACHMENT_SERVER_SEND_TO_CLIENT__CALLERCLIENT:
				setCallerclient((CallerClient)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ClientServeurPackage.ATTACHMENT_SERVER_SEND_TO_CLIENT__PORT_SEND_SERVEUR:
				setPort_send_serveur((Port_Send_Serveur)null);
				return;
			case ClientServeurPackage.ATTACHMENT_SERVER_SEND_TO_CLIENT__CALLERCLIENT:
				setCallerclient((CallerClient)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ClientServeurPackage.ATTACHMENT_SERVER_SEND_TO_CLIENT__PORT_SEND_SERVEUR:
				return port_send_serveur != null;
			case ClientServeurPackage.ATTACHMENT_SERVER_SEND_TO_CLIENT__CALLERCLIENT:
				return callerclient != null;
		}
		return super.eIsSet(featureID);
	}

} //Attachment_server_Send_to_ClientImpl
