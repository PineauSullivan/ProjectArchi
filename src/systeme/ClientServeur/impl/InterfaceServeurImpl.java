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
import systeme.ClientServeur.InterfaceServeur;
import systeme.ClientServeur.Port_Receive_Request;
import systeme.ClientServeur.Port_Send_Serveur;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Serveur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.ClientServeur.impl.InterfaceServeurImpl#getPort_receive_request <em>Port receive request</em>}</li>
 *   <li>{@link systeme.ClientServeur.impl.InterfaceServeurImpl#getPort_send_serveur <em>Port send serveur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceServeurImpl extends InterfaceComposantsImpl implements InterfaceServeur {
	/**
	 * The cached value of the '{@link #getPort_receive_request() <em>Port receive request</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_receive_request()
	 * @generated
	 * @ordered
	 */
	protected EList<Port_Receive_Request> port_receive_request;

	/**
	 * The cached value of the '{@link #getPort_send_serveur() <em>Port send serveur</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_send_serveur()
	 * @generated
	 * @ordered
	 */
	protected EList<Port_Send_Serveur> port_send_serveur;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceServeurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClientServeurPackage.Literals.INTERFACE_SERVEUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port_Receive_Request> getPort_receive_request() {
		if (port_receive_request == null) {
			port_receive_request = new EObjectContainmentEList<Port_Receive_Request>(Port_Receive_Request.class, this, ClientServeurPackage.INTERFACE_SERVEUR__PORT_RECEIVE_REQUEST);
		}
		return port_receive_request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port_Send_Serveur> getPort_send_serveur() {
		if (port_send_serveur == null) {
			port_send_serveur = new EObjectContainmentEList<Port_Send_Serveur>(Port_Send_Serveur.class, this, ClientServeurPackage.INTERFACE_SERVEUR__PORT_SEND_SERVEUR);
		}
		return port_send_serveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClientServeurPackage.INTERFACE_SERVEUR__PORT_RECEIVE_REQUEST:
				return ((InternalEList<?>)getPort_receive_request()).basicRemove(otherEnd, msgs);
			case ClientServeurPackage.INTERFACE_SERVEUR__PORT_SEND_SERVEUR:
				return ((InternalEList<?>)getPort_send_serveur()).basicRemove(otherEnd, msgs);
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
			case ClientServeurPackage.INTERFACE_SERVEUR__PORT_RECEIVE_REQUEST:
				return getPort_receive_request();
			case ClientServeurPackage.INTERFACE_SERVEUR__PORT_SEND_SERVEUR:
				return getPort_send_serveur();
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
			case ClientServeurPackage.INTERFACE_SERVEUR__PORT_RECEIVE_REQUEST:
				getPort_receive_request().clear();
				getPort_receive_request().addAll((Collection<? extends Port_Receive_Request>)newValue);
				return;
			case ClientServeurPackage.INTERFACE_SERVEUR__PORT_SEND_SERVEUR:
				getPort_send_serveur().clear();
				getPort_send_serveur().addAll((Collection<? extends Port_Send_Serveur>)newValue);
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
			case ClientServeurPackage.INTERFACE_SERVEUR__PORT_RECEIVE_REQUEST:
				getPort_receive_request().clear();
				return;
			case ClientServeurPackage.INTERFACE_SERVEUR__PORT_SEND_SERVEUR:
				getPort_send_serveur().clear();
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
			case ClientServeurPackage.INTERFACE_SERVEUR__PORT_RECEIVE_REQUEST:
				return port_receive_request != null && !port_receive_request.isEmpty();
			case ClientServeurPackage.INTERFACE_SERVEUR__PORT_SEND_SERVEUR:
				return port_send_serveur != null && !port_send_serveur.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterfaceServeurImpl
