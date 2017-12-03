/**
 */
package systeme.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import systeme.BindingFournisCS;

import systeme.ClientServeur.Port_Receive_Request;

import systeme.FonctionServeur.PortFournisCS;

import systeme.SystemePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Fournis CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.impl.BindingFournisCSImpl#getPort_receive_request <em>Port receive request</em>}</li>
 *   <li>{@link systeme.impl.BindingFournisCSImpl#getPortfourniscs <em>Portfourniscs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingFournisCSImpl extends MinimalEObjectImpl.Container implements BindingFournisCS {
	/**
	 * The cached value of the '{@link #getPort_receive_request() <em>Port receive request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_receive_request()
	 * @generated
	 * @ordered
	 */
	protected Port_Receive_Request port_receive_request;

	/**
	 * The cached value of the '{@link #getPortfourniscs() <em>Portfourniscs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortfourniscs()
	 * @generated
	 * @ordered
	 */
	protected PortFournisCS portfourniscs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingFournisCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemePackage.Literals.BINDING_FOURNIS_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Receive_Request getPort_receive_request() {
		if (port_receive_request != null && port_receive_request.eIsProxy()) {
			InternalEObject oldPort_receive_request = (InternalEObject)port_receive_request;
			port_receive_request = (Port_Receive_Request)eResolveProxy(oldPort_receive_request);
			if (port_receive_request != oldPort_receive_request) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemePackage.BINDING_FOURNIS_CS__PORT_RECEIVE_REQUEST, oldPort_receive_request, port_receive_request));
			}
		}
		return port_receive_request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Receive_Request basicGetPort_receive_request() {
		return port_receive_request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort_receive_request(Port_Receive_Request newPort_receive_request) {
		Port_Receive_Request oldPort_receive_request = port_receive_request;
		port_receive_request = newPort_receive_request;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemePackage.BINDING_FOURNIS_CS__PORT_RECEIVE_REQUEST, oldPort_receive_request, port_receive_request));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFournisCS getPortfourniscs() {
		if (portfourniscs != null && portfourniscs.eIsProxy()) {
			InternalEObject oldPortfourniscs = (InternalEObject)portfourniscs;
			portfourniscs = (PortFournisCS)eResolveProxy(oldPortfourniscs);
			if (portfourniscs != oldPortfourniscs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemePackage.BINDING_FOURNIS_CS__PORTFOURNISCS, oldPortfourniscs, portfourniscs));
			}
		}
		return portfourniscs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFournisCS basicGetPortfourniscs() {
		return portfourniscs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortfourniscs(PortFournisCS newPortfourniscs) {
		PortFournisCS oldPortfourniscs = portfourniscs;
		portfourniscs = newPortfourniscs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemePackage.BINDING_FOURNIS_CS__PORTFOURNISCS, oldPortfourniscs, portfourniscs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemePackage.BINDING_FOURNIS_CS__PORT_RECEIVE_REQUEST:
				if (resolve) return getPort_receive_request();
				return basicGetPort_receive_request();
			case SystemePackage.BINDING_FOURNIS_CS__PORTFOURNISCS:
				if (resolve) return getPortfourniscs();
				return basicGetPortfourniscs();
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
			case SystemePackage.BINDING_FOURNIS_CS__PORT_RECEIVE_REQUEST:
				setPort_receive_request((Port_Receive_Request)newValue);
				return;
			case SystemePackage.BINDING_FOURNIS_CS__PORTFOURNISCS:
				setPortfourniscs((PortFournisCS)newValue);
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
			case SystemePackage.BINDING_FOURNIS_CS__PORT_RECEIVE_REQUEST:
				setPort_receive_request((Port_Receive_Request)null);
				return;
			case SystemePackage.BINDING_FOURNIS_CS__PORTFOURNISCS:
				setPortfourniscs((PortFournisCS)null);
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
			case SystemePackage.BINDING_FOURNIS_CS__PORT_RECEIVE_REQUEST:
				return port_receive_request != null;
			case SystemePackage.BINDING_FOURNIS_CS__PORTFOURNISCS:
				return portfourniscs != null;
		}
		return super.eIsSet(featureID);
	}

} //BindingFournisCSImpl
