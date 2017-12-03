/**
 */
package systeme.ClientServeur.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projecttArchitectural.impl.ConfigurationsImpl;

import systeme.ClientServeur.Attachment_Receive_request;
import systeme.ClientServeur.Attachment_SendRequest_to_Caller;
import systeme.ClientServeur.Attachment_server_Receive_of_Client;
import systeme.ClientServeur.Attachment_server_Send_to_Client;
import systeme.ClientServeur.ClientServeurPackage;
import systeme.ClientServeur.ComposantClient;
import systeme.ClientServeur.ComposantServer;
import systeme.ClientServeur.ConfigurationClientServeur;
import systeme.ClientServeur.RPC;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Client Serveur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.ClientServeur.impl.ConfigurationClientServeurImpl#getComposantclient <em>Composantclient</em>}</li>
 *   <li>{@link systeme.ClientServeur.impl.ConfigurationClientServeurImpl#getComposantserver <em>Composantserver</em>}</li>
 *   <li>{@link systeme.ClientServeur.impl.ConfigurationClientServeurImpl#getRpc <em>Rpc</em>}</li>
 *   <li>{@link systeme.ClientServeur.impl.ConfigurationClientServeurImpl#getAttachment_sendrequest_to_caller <em>Attachment sendrequest to caller</em>}</li>
 *   <li>{@link systeme.ClientServeur.impl.ConfigurationClientServeurImpl#getAttachment_receive_request <em>Attachment receive request</em>}</li>
 *   <li>{@link systeme.ClientServeur.impl.ConfigurationClientServeurImpl#getAttachment_server_send_to_client <em>Attachment server send to client</em>}</li>
 *   <li>{@link systeme.ClientServeur.impl.ConfigurationClientServeurImpl#getAttachment_server_receive_of_client <em>Attachment server receive of client</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationClientServeurImpl extends ConfigurationsImpl implements ConfigurationClientServeur {
	/**
	 * The cached value of the '{@link #getComposantclient() <em>Composantclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposantclient()
	 * @generated
	 * @ordered
	 */
	protected ComposantClient composantclient;

	/**
	 * The cached value of the '{@link #getComposantserver() <em>Composantserver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposantserver()
	 * @generated
	 * @ordered
	 */
	protected ComposantServer composantserver;

	/**
	 * The cached value of the '{@link #getRpc() <em>Rpc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRpc()
	 * @generated
	 * @ordered
	 */
	protected RPC rpc;

	/**
	 * The cached value of the '{@link #getAttachment_sendrequest_to_caller() <em>Attachment sendrequest to caller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment_sendrequest_to_caller()
	 * @generated
	 * @ordered
	 */
	protected Attachment_SendRequest_to_Caller attachment_sendrequest_to_caller;

	/**
	 * The cached value of the '{@link #getAttachment_receive_request() <em>Attachment receive request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment_receive_request()
	 * @generated
	 * @ordered
	 */
	protected Attachment_Receive_request attachment_receive_request;

	/**
	 * The cached value of the '{@link #getAttachment_server_send_to_client() <em>Attachment server send to client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment_server_send_to_client()
	 * @generated
	 * @ordered
	 */
	protected Attachment_server_Send_to_Client attachment_server_send_to_client;

	/**
	 * The cached value of the '{@link #getAttachment_server_receive_of_client() <em>Attachment server receive of client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment_server_receive_of_client()
	 * @generated
	 * @ordered
	 */
	protected Attachment_server_Receive_of_Client attachment_server_receive_of_client;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationClientServeurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClientServeurPackage.Literals.CONFIGURATION_CLIENT_SERVEUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposantClient getComposantclient() {
		if (composantclient != null && composantclient.eIsProxy()) {
			InternalEObject oldComposantclient = (InternalEObject)composantclient;
			composantclient = (ComposantClient)eResolveProxy(oldComposantclient);
			if (composantclient != oldComposantclient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__COMPOSANTCLIENT, oldComposantclient, composantclient));
			}
		}
		return composantclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposantClient basicGetComposantclient() {
		return composantclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComposantclient(ComposantClient newComposantclient) {
		ComposantClient oldComposantclient = composantclient;
		composantclient = newComposantclient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__COMPOSANTCLIENT, oldComposantclient, composantclient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposantServer getComposantserver() {
		if (composantserver != null && composantserver.eIsProxy()) {
			InternalEObject oldComposantserver = (InternalEObject)composantserver;
			composantserver = (ComposantServer)eResolveProxy(oldComposantserver);
			if (composantserver != oldComposantserver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__COMPOSANTSERVER, oldComposantserver, composantserver));
			}
		}
		return composantserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposantServer basicGetComposantserver() {
		return composantserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComposantserver(ComposantServer newComposantserver) {
		ComposantServer oldComposantserver = composantserver;
		composantserver = newComposantserver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__COMPOSANTSERVER, oldComposantserver, composantserver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPC getRpc() {
		if (rpc != null && rpc.eIsProxy()) {
			InternalEObject oldRpc = (InternalEObject)rpc;
			rpc = (RPC)eResolveProxy(oldRpc);
			if (rpc != oldRpc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__RPC, oldRpc, rpc));
			}
		}
		return rpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPC basicGetRpc() {
		return rpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRpc(RPC newRpc) {
		RPC oldRpc = rpc;
		rpc = newRpc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__RPC, oldRpc, rpc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_SendRequest_to_Caller getAttachment_sendrequest_to_caller() {
		if (attachment_sendrequest_to_caller != null && attachment_sendrequest_to_caller.eIsProxy()) {
			InternalEObject oldAttachment_sendrequest_to_caller = (InternalEObject)attachment_sendrequest_to_caller;
			attachment_sendrequest_to_caller = (Attachment_SendRequest_to_Caller)eResolveProxy(oldAttachment_sendrequest_to_caller);
			if (attachment_sendrequest_to_caller != oldAttachment_sendrequest_to_caller) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_SENDREQUEST_TO_CALLER, oldAttachment_sendrequest_to_caller, attachment_sendrequest_to_caller));
			}
		}
		return attachment_sendrequest_to_caller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_SendRequest_to_Caller basicGetAttachment_sendrequest_to_caller() {
		return attachment_sendrequest_to_caller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment_sendrequest_to_caller(Attachment_SendRequest_to_Caller newAttachment_sendrequest_to_caller) {
		Attachment_SendRequest_to_Caller oldAttachment_sendrequest_to_caller = attachment_sendrequest_to_caller;
		attachment_sendrequest_to_caller = newAttachment_sendrequest_to_caller;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_SENDREQUEST_TO_CALLER, oldAttachment_sendrequest_to_caller, attachment_sendrequest_to_caller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_Receive_request getAttachment_receive_request() {
		if (attachment_receive_request != null && attachment_receive_request.eIsProxy()) {
			InternalEObject oldAttachment_receive_request = (InternalEObject)attachment_receive_request;
			attachment_receive_request = (Attachment_Receive_request)eResolveProxy(oldAttachment_receive_request);
			if (attachment_receive_request != oldAttachment_receive_request) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_RECEIVE_REQUEST, oldAttachment_receive_request, attachment_receive_request));
			}
		}
		return attachment_receive_request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_Receive_request basicGetAttachment_receive_request() {
		return attachment_receive_request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment_receive_request(Attachment_Receive_request newAttachment_receive_request) {
		Attachment_Receive_request oldAttachment_receive_request = attachment_receive_request;
		attachment_receive_request = newAttachment_receive_request;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_RECEIVE_REQUEST, oldAttachment_receive_request, attachment_receive_request));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_server_Send_to_Client getAttachment_server_send_to_client() {
		if (attachment_server_send_to_client != null && attachment_server_send_to_client.eIsProxy()) {
			InternalEObject oldAttachment_server_send_to_client = (InternalEObject)attachment_server_send_to_client;
			attachment_server_send_to_client = (Attachment_server_Send_to_Client)eResolveProxy(oldAttachment_server_send_to_client);
			if (attachment_server_send_to_client != oldAttachment_server_send_to_client) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_SERVER_SEND_TO_CLIENT, oldAttachment_server_send_to_client, attachment_server_send_to_client));
			}
		}
		return attachment_server_send_to_client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_server_Send_to_Client basicGetAttachment_server_send_to_client() {
		return attachment_server_send_to_client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment_server_send_to_client(Attachment_server_Send_to_Client newAttachment_server_send_to_client) {
		Attachment_server_Send_to_Client oldAttachment_server_send_to_client = attachment_server_send_to_client;
		attachment_server_send_to_client = newAttachment_server_send_to_client;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_SERVER_SEND_TO_CLIENT, oldAttachment_server_send_to_client, attachment_server_send_to_client));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_server_Receive_of_Client getAttachment_server_receive_of_client() {
		if (attachment_server_receive_of_client != null && attachment_server_receive_of_client.eIsProxy()) {
			InternalEObject oldAttachment_server_receive_of_client = (InternalEObject)attachment_server_receive_of_client;
			attachment_server_receive_of_client = (Attachment_server_Receive_of_Client)eResolveProxy(oldAttachment_server_receive_of_client);
			if (attachment_server_receive_of_client != oldAttachment_server_receive_of_client) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_SERVER_RECEIVE_OF_CLIENT, oldAttachment_server_receive_of_client, attachment_server_receive_of_client));
			}
		}
		return attachment_server_receive_of_client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_server_Receive_of_Client basicGetAttachment_server_receive_of_client() {
		return attachment_server_receive_of_client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment_server_receive_of_client(Attachment_server_Receive_of_Client newAttachment_server_receive_of_client) {
		Attachment_server_Receive_of_Client oldAttachment_server_receive_of_client = attachment_server_receive_of_client;
		attachment_server_receive_of_client = newAttachment_server_receive_of_client;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_SERVER_RECEIVE_OF_CLIENT, oldAttachment_server_receive_of_client, attachment_server_receive_of_client));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__COMPOSANTCLIENT:
				if (resolve) return getComposantclient();
				return basicGetComposantclient();
			case ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__COMPOSANTSERVER:
				if (resolve) return getComposantserver();
				return basicGetComposantserver();
			case ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__RPC:
				if (resolve) return getRpc();
				return basicGetRpc();
			case ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_SENDREQUEST_TO_CALLER:
				if (resolve) return getAttachment_sendrequest_to_caller();
				return basicGetAttachment_sendrequest_to_caller();
			case ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_RECEIVE_REQUEST:
				if (resolve) return getAttachment_receive_request();
				return basicGetAttachment_receive_request();
			case ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_SERVER_SEND_TO_CLIENT:
				if (resolve) return getAttachment_server_send_to_client();
				return basicGetAttachment_server_send_to_client();
			case ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_SERVER_RECEIVE_OF_CLIENT:
				if (resolve) return getAttachment_server_receive_of_client();
				return basicGetAttachment_server_receive_of_client();
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
			case ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__COMPOSANTCLIENT:
				setComposantclient((ComposantClient)newValue);
				return;
			case ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__COMPOSANTSERVER:
				setComposantserver((ComposantServer)newValue);
				return;
			case ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__RPC:
				setRpc((RPC)newValue);
				return;
			case ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_SENDREQUEST_TO_CALLER:
				setAttachment_sendrequest_to_caller((Attachment_SendRequest_to_Caller)newValue);
				return;
			case ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_RECEIVE_REQUEST:
				setAttachment_receive_request((Attachment_Receive_request)newValue);
				return;
			case ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_SERVER_SEND_TO_CLIENT:
				setAttachment_server_send_to_client((Attachment_server_Send_to_Client)newValue);
				return;
			case ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_SERVER_RECEIVE_OF_CLIENT:
				setAttachment_server_receive_of_client((Attachment_server_Receive_of_Client)newValue);
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
			case ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__COMPOSANTCLIENT:
				setComposantclient((ComposantClient)null);
				return;
			case ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__COMPOSANTSERVER:
				setComposantserver((ComposantServer)null);
				return;
			case ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__RPC:
				setRpc((RPC)null);
				return;
			case ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_SENDREQUEST_TO_CALLER:
				setAttachment_sendrequest_to_caller((Attachment_SendRequest_to_Caller)null);
				return;
			case ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_RECEIVE_REQUEST:
				setAttachment_receive_request((Attachment_Receive_request)null);
				return;
			case ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_SERVER_SEND_TO_CLIENT:
				setAttachment_server_send_to_client((Attachment_server_Send_to_Client)null);
				return;
			case ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_SERVER_RECEIVE_OF_CLIENT:
				setAttachment_server_receive_of_client((Attachment_server_Receive_of_Client)null);
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
			case ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__COMPOSANTCLIENT:
				return composantclient != null;
			case ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__COMPOSANTSERVER:
				return composantserver != null;
			case ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__RPC:
				return rpc != null;
			case ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_SENDREQUEST_TO_CALLER:
				return attachment_sendrequest_to_caller != null;
			case ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_RECEIVE_REQUEST:
				return attachment_receive_request != null;
			case ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_SERVER_SEND_TO_CLIENT:
				return attachment_server_send_to_client != null;
			case ClientServeurPackage.CONFIGURATION_CLIENT_SERVEUR__ATTACHMENT_SERVER_RECEIVE_OF_CLIENT:
				return attachment_server_receive_of_client != null;
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationClientServeurImpl
