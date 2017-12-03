/**
 */
package systeme.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import systeme.BindingRequisCS;

import systeme.ClientServeur.Port_Send_Serveur;

import systeme.FonctionServeur.PortRequisConfigCS;

import systeme.SystemePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Requis CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.impl.BindingRequisCSImpl#getPortrequisconfigcs <em>Portrequisconfigcs</em>}</li>
 *   <li>{@link systeme.impl.BindingRequisCSImpl#getPort_receive_request <em>Port receive request</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingRequisCSImpl extends MinimalEObjectImpl.Container implements BindingRequisCS {
	/**
	 * The cached value of the '{@link #getPortrequisconfigcs() <em>Portrequisconfigcs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrequisconfigcs()
	 * @generated
	 * @ordered
	 */
	protected PortRequisConfigCS portrequisconfigcs;

	/**
	 * The cached value of the '{@link #getPort_receive_request() <em>Port receive request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_receive_request()
	 * @generated
	 * @ordered
	 */
	protected Port_Send_Serveur port_receive_request;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingRequisCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemePackage.Literals.BINDING_REQUIS_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequisConfigCS getPortrequisconfigcs() {
		if (portrequisconfigcs != null && portrequisconfigcs.eIsProxy()) {
			InternalEObject oldPortrequisconfigcs = (InternalEObject)portrequisconfigcs;
			portrequisconfigcs = (PortRequisConfigCS)eResolveProxy(oldPortrequisconfigcs);
			if (portrequisconfigcs != oldPortrequisconfigcs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemePackage.BINDING_REQUIS_CS__PORTREQUISCONFIGCS, oldPortrequisconfigcs, portrequisconfigcs));
			}
		}
		return portrequisconfigcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequisConfigCS basicGetPortrequisconfigcs() {
		return portrequisconfigcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortrequisconfigcs(PortRequisConfigCS newPortrequisconfigcs) {
		PortRequisConfigCS oldPortrequisconfigcs = portrequisconfigcs;
		portrequisconfigcs = newPortrequisconfigcs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemePackage.BINDING_REQUIS_CS__PORTREQUISCONFIGCS, oldPortrequisconfigcs, portrequisconfigcs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Send_Serveur getPort_receive_request() {
		if (port_receive_request != null && port_receive_request.eIsProxy()) {
			InternalEObject oldPort_receive_request = (InternalEObject)port_receive_request;
			port_receive_request = (Port_Send_Serveur)eResolveProxy(oldPort_receive_request);
			if (port_receive_request != oldPort_receive_request) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemePackage.BINDING_REQUIS_CS__PORT_RECEIVE_REQUEST, oldPort_receive_request, port_receive_request));
			}
		}
		return port_receive_request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port_Send_Serveur basicGetPort_receive_request() {
		return port_receive_request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort_receive_request(Port_Send_Serveur newPort_receive_request) {
		Port_Send_Serveur oldPort_receive_request = port_receive_request;
		port_receive_request = newPort_receive_request;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemePackage.BINDING_REQUIS_CS__PORT_RECEIVE_REQUEST, oldPort_receive_request, port_receive_request));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemePackage.BINDING_REQUIS_CS__PORTREQUISCONFIGCS:
				if (resolve) return getPortrequisconfigcs();
				return basicGetPortrequisconfigcs();
			case SystemePackage.BINDING_REQUIS_CS__PORT_RECEIVE_REQUEST:
				if (resolve) return getPort_receive_request();
				return basicGetPort_receive_request();
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
			case SystemePackage.BINDING_REQUIS_CS__PORTREQUISCONFIGCS:
				setPortrequisconfigcs((PortRequisConfigCS)newValue);
				return;
			case SystemePackage.BINDING_REQUIS_CS__PORT_RECEIVE_REQUEST:
				setPort_receive_request((Port_Send_Serveur)newValue);
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
			case SystemePackage.BINDING_REQUIS_CS__PORTREQUISCONFIGCS:
				setPortrequisconfigcs((PortRequisConfigCS)null);
				return;
			case SystemePackage.BINDING_REQUIS_CS__PORT_RECEIVE_REQUEST:
				setPort_receive_request((Port_Send_Serveur)null);
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
			case SystemePackage.BINDING_REQUIS_CS__PORTREQUISCONFIGCS:
				return portrequisconfigcs != null;
			case SystemePackage.BINDING_REQUIS_CS__PORT_RECEIVE_REQUEST:
				return port_receive_request != null;
		}
		return super.eIsSet(featureID);
	}

} //BindingRequisCSImpl
