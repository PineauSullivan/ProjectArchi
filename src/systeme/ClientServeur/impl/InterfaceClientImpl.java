/**
 */
package systeme.ClientServeur.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import projecttArchitectural.impl.InterfaceComposantsImpl;

import systeme.ClientServeur.ClientServeurPackage;
import systeme.ClientServeur.InterfaceClient;
import systeme.ClientServeur.Port_Receive_Client;
import systeme.ClientServeur.Port_Send_Client;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.ClientServeur.impl.InterfaceClientImpl#getPort_send_request <em>Port send request</em>}</li>
 *   <li>{@link systeme.ClientServeur.impl.InterfaceClientImpl#getPort_receive_client <em>Port receive client</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceClientImpl extends InterfaceComposantsImpl implements InterfaceClient {
	/**
	 * The cached value of the '{@link #getPort_send_request() <em>Port send request</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_send_request()
	 * @generated
	 * @ordered
	 */
	protected EList<Port_Send_Client> port_send_request;

	/**
	 * The cached value of the '{@link #getPort_receive_client() <em>Port receive client</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_receive_client()
	 * @generated
	 * @ordered
	 */
	protected EList<Port_Receive_Client> port_receive_client;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClientServeurPackage.Literals.INTERFACE_CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port_Send_Client> getPort_send_request() {
		if (port_send_request == null) {
			port_send_request = new EObjectContainmentEList<Port_Send_Client>(Port_Send_Client.class, this, ClientServeurPackage.INTERFACE_CLIENT__PORT_SEND_REQUEST);
		}
		return port_send_request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port_Receive_Client> getPort_receive_client() {
		if (port_receive_client == null) {
			port_receive_client = new EObjectContainmentEList<Port_Receive_Client>(Port_Receive_Client.class, this, ClientServeurPackage.INTERFACE_CLIENT__PORT_RECEIVE_CLIENT);
		}
		return port_receive_client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClientServeurPackage.INTERFACE_CLIENT__PORT_SEND_REQUEST:
				return ((InternalEList<?>)getPort_send_request()).basicRemove(otherEnd, msgs);
			case ClientServeurPackage.INTERFACE_CLIENT__PORT_RECEIVE_CLIENT:
				return ((InternalEList<?>)getPort_receive_client()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClientServeurPackage.INTERFACE_CLIENT__PORT_SEND_REQUEST:
				return getPort_send_request();
			case ClientServeurPackage.INTERFACE_CLIENT__PORT_RECEIVE_CLIENT:
				return getPort_receive_client();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClientServeurPackage.INTERFACE_CLIENT__PORT_SEND_REQUEST:
				getPort_send_request().clear();
				getPort_send_request().addAll((Collection<? extends Port_Send_Client>)newValue);
				return;
			case ClientServeurPackage.INTERFACE_CLIENT__PORT_RECEIVE_CLIENT:
				getPort_receive_client().clear();
				getPort_receive_client().addAll((Collection<? extends Port_Receive_Client>)newValue);
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
			case ClientServeurPackage.INTERFACE_CLIENT__PORT_SEND_REQUEST:
				getPort_send_request().clear();
				return;
			case ClientServeurPackage.INTERFACE_CLIENT__PORT_RECEIVE_CLIENT:
				getPort_receive_client().clear();
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
			case ClientServeurPackage.INTERFACE_CLIENT__PORT_SEND_REQUEST:
				return port_send_request != null && !port_send_request.isEmpty();
			case ClientServeurPackage.INTERFACE_CLIENT__PORT_RECEIVE_CLIENT:
				return port_receive_client != null && !port_receive_client.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterfaceClientImpl
