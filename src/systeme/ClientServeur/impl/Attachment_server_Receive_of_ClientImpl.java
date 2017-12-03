/**
 */
package systeme.ClientServeur.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projecttArchitectural.impl.AttachmentFournisRequisImpl;

import systeme.ClientServeur.Attachment_server_Receive_of_Client;
import systeme.ClientServeur.CalledClient;
import systeme.ClientServeur.ClientServeurPackage;
import systeme.ClientServeur.Port_Receive_Client;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment server Receive of Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.ClientServeur.impl.Attachment_server_Receive_of_ClientImpl#getPort_receive_client <em>Port receive client</em>}</li>
 *   <li>{@link systeme.ClientServeur.impl.Attachment_server_Receive_of_ClientImpl#getCalledclient <em>Calledclient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Attachment_server_Receive_of_ClientImpl extends AttachmentFournisRequisImpl implements Attachment_server_Receive_of_Client {
	/**
	 * The cached value of the '{@link #getPort_receive_client() <em>Port receive client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_receive_client()
	 * @generated
	 * @ordered
	 */
	protected Port_Receive_Client port_receive_client;

	/**
	 * The cached value of the '{@link #getCalledclient() <em>Calledclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledclient()
	 * @generated
	 * @ordered
	 */
	protected CalledClient calledclient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Attachment_server_Receive_of_ClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClientServeurPackage.Literals.ATTACHMENT_SERVER_RECEIVE_OF_CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Receive_Client getPort_receive_client() {
		if (port_receive_client != null && port_receive_client.eIsProxy()) {
			InternalEObject oldPort_receive_client = (InternalEObject)port_receive_client;
			port_receive_client = (Port_Receive_Client)eResolveProxy(oldPort_receive_client);
			if (port_receive_client != oldPort_receive_client) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClientServeurPackage.ATTACHMENT_SERVER_RECEIVE_OF_CLIENT__PORT_RECEIVE_CLIENT, oldPort_receive_client, port_receive_client));
			}
		}
		return port_receive_client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Receive_Client basicGetPort_receive_client() {
		return port_receive_client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort_receive_client(Port_Receive_Client newPort_receive_client) {
		Port_Receive_Client oldPort_receive_client = port_receive_client;
		port_receive_client = newPort_receive_client;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClientServeurPackage.ATTACHMENT_SERVER_RECEIVE_OF_CLIENT__PORT_RECEIVE_CLIENT, oldPort_receive_client, port_receive_client));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalledClient getCalledclient() {
		if (calledclient != null && calledclient.eIsProxy()) {
			InternalEObject oldCalledclient = (InternalEObject)calledclient;
			calledclient = (CalledClient)eResolveProxy(oldCalledclient);
			if (calledclient != oldCalledclient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClientServeurPackage.ATTACHMENT_SERVER_RECEIVE_OF_CLIENT__CALLEDCLIENT, oldCalledclient, calledclient));
			}
		}
		return calledclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalledClient basicGetCalledclient() {
		return calledclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalledclient(CalledClient newCalledclient) {
		CalledClient oldCalledclient = calledclient;
		calledclient = newCalledclient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClientServeurPackage.ATTACHMENT_SERVER_RECEIVE_OF_CLIENT__CALLEDCLIENT, oldCalledclient, calledclient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClientServeurPackage.ATTACHMENT_SERVER_RECEIVE_OF_CLIENT__PORT_RECEIVE_CLIENT:
				if (resolve) return getPort_receive_client();
				return basicGetPort_receive_client();
			case ClientServeurPackage.ATTACHMENT_SERVER_RECEIVE_OF_CLIENT__CALLEDCLIENT:
				if (resolve) return getCalledclient();
				return basicGetCalledclient();
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
			case ClientServeurPackage.ATTACHMENT_SERVER_RECEIVE_OF_CLIENT__PORT_RECEIVE_CLIENT:
				setPort_receive_client((Port_Receive_Client)newValue);
				return;
			case ClientServeurPackage.ATTACHMENT_SERVER_RECEIVE_OF_CLIENT__CALLEDCLIENT:
				setCalledclient((CalledClient)newValue);
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
			case ClientServeurPackage.ATTACHMENT_SERVER_RECEIVE_OF_CLIENT__PORT_RECEIVE_CLIENT:
				setPort_receive_client((Port_Receive_Client)null);
				return;
			case ClientServeurPackage.ATTACHMENT_SERVER_RECEIVE_OF_CLIENT__CALLEDCLIENT:
				setCalledclient((CalledClient)null);
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
			case ClientServeurPackage.ATTACHMENT_SERVER_RECEIVE_OF_CLIENT__PORT_RECEIVE_CLIENT:
				return port_receive_client != null;
			case ClientServeurPackage.ATTACHMENT_SERVER_RECEIVE_OF_CLIENT__CALLEDCLIENT:
				return calledclient != null;
		}
		return super.eIsSet(featureID);
	}

} //Attachment_server_Receive_of_ClientImpl
