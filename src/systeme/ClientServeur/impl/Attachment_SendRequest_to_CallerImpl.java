/**
 */
package systeme.ClientServeur.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projecttArchitectural.impl.AttachmentsRequisFournisImpl;

import systeme.ClientServeur.Attachment_SendRequest_to_Caller;
import systeme.ClientServeur.CallerServeur;
import systeme.ClientServeur.ClientServeurPackage;
import systeme.ClientServeur.Port_Send_Client;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment Send Request to Caller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.ClientServeur.impl.Attachment_SendRequest_to_CallerImpl#getPort_send_request <em>Port send request</em>}</li>
 *   <li>{@link systeme.ClientServeur.impl.Attachment_SendRequest_to_CallerImpl#getCallerserveur <em>Callerserveur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Attachment_SendRequest_to_CallerImpl extends AttachmentsRequisFournisImpl implements Attachment_SendRequest_to_Caller {
	/**
	 * The cached value of the '{@link #getPort_send_request() <em>Port send request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_send_request()
	 * @generated
	 * @ordered
	 */
	protected Port_Send_Client port_send_request;

	/**
	 * The cached value of the '{@link #getCallerserveur() <em>Callerserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallerserveur()
	 * @generated
	 * @ordered
	 */
	protected CallerServeur callerserveur;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Attachment_SendRequest_to_CallerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClientServeurPackage.Literals.ATTACHMENT_SEND_REQUEST_TO_CALLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Send_Client getPort_send_request() {
		if (port_send_request != null && port_send_request.eIsProxy()) {
			InternalEObject oldPort_send_request = (InternalEObject)port_send_request;
			port_send_request = (Port_Send_Client)eResolveProxy(oldPort_send_request);
			if (port_send_request != oldPort_send_request) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClientServeurPackage.ATTACHMENT_SEND_REQUEST_TO_CALLER__PORT_SEND_REQUEST, oldPort_send_request, port_send_request));
			}
		}
		return port_send_request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Send_Client basicGetPort_send_request() {
		return port_send_request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort_send_request(Port_Send_Client newPort_send_request) {
		Port_Send_Client oldPort_send_request = port_send_request;
		port_send_request = newPort_send_request;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClientServeurPackage.ATTACHMENT_SEND_REQUEST_TO_CALLER__PORT_SEND_REQUEST, oldPort_send_request, port_send_request));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallerServeur getCallerserveur() {
		if (callerserveur != null && callerserveur.eIsProxy()) {
			InternalEObject oldCallerserveur = (InternalEObject)callerserveur;
			callerserveur = (CallerServeur)eResolveProxy(oldCallerserveur);
			if (callerserveur != oldCallerserveur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClientServeurPackage.ATTACHMENT_SEND_REQUEST_TO_CALLER__CALLERSERVEUR, oldCallerserveur, callerserveur));
			}
		}
		return callerserveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallerServeur basicGetCallerserveur() {
		return callerserveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallerserveur(CallerServeur newCallerserveur) {
		CallerServeur oldCallerserveur = callerserveur;
		callerserveur = newCallerserveur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClientServeurPackage.ATTACHMENT_SEND_REQUEST_TO_CALLER__CALLERSERVEUR, oldCallerserveur, callerserveur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClientServeurPackage.ATTACHMENT_SEND_REQUEST_TO_CALLER__PORT_SEND_REQUEST:
				if (resolve) return getPort_send_request();
				return basicGetPort_send_request();
			case ClientServeurPackage.ATTACHMENT_SEND_REQUEST_TO_CALLER__CALLERSERVEUR:
				if (resolve) return getCallerserveur();
				return basicGetCallerserveur();
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
			case ClientServeurPackage.ATTACHMENT_SEND_REQUEST_TO_CALLER__PORT_SEND_REQUEST:
				setPort_send_request((Port_Send_Client)newValue);
				return;
			case ClientServeurPackage.ATTACHMENT_SEND_REQUEST_TO_CALLER__CALLERSERVEUR:
				setCallerserveur((CallerServeur)newValue);
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
			case ClientServeurPackage.ATTACHMENT_SEND_REQUEST_TO_CALLER__PORT_SEND_REQUEST:
				setPort_send_request((Port_Send_Client)null);
				return;
			case ClientServeurPackage.ATTACHMENT_SEND_REQUEST_TO_CALLER__CALLERSERVEUR:
				setCallerserveur((CallerServeur)null);
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
			case ClientServeurPackage.ATTACHMENT_SEND_REQUEST_TO_CALLER__PORT_SEND_REQUEST:
				return port_send_request != null;
			case ClientServeurPackage.ATTACHMENT_SEND_REQUEST_TO_CALLER__CALLERSERVEUR:
				return callerserveur != null;
		}
		return super.eIsSet(featureID);
	}

} //Attachment_SendRequest_to_CallerImpl
