/**
 */
package systeme.ClientServeur.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projecttArchitectural.impl.AttachmentFournisRequisImpl;

import systeme.ClientServeur.Attachment_Receive_request;
import systeme.ClientServeur.CalledServeur;
import systeme.ClientServeur.ClientServeurPackage;
import systeme.ClientServeur.Port_Receive_Request;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment Receive request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.ClientServeur.impl.Attachment_Receive_requestImpl#getPort_receive_request <em>Port receive request</em>}</li>
 *   <li>{@link systeme.ClientServeur.impl.Attachment_Receive_requestImpl#getCalledserveur <em>Calledserveur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Attachment_Receive_requestImpl extends AttachmentFournisRequisImpl implements Attachment_Receive_request {
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
	 * The cached value of the '{@link #getCalledserveur() <em>Calledserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledserveur()
	 * @generated
	 * @ordered
	 */
	protected CalledServeur calledserveur;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Attachment_Receive_requestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClientServeurPackage.Literals.ATTACHMENT_RECEIVE_REQUEST;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClientServeurPackage.ATTACHMENT_RECEIVE_REQUEST__PORT_RECEIVE_REQUEST, oldPort_receive_request, port_receive_request));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClientServeurPackage.ATTACHMENT_RECEIVE_REQUEST__PORT_RECEIVE_REQUEST, oldPort_receive_request, port_receive_request));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalledServeur getCalledserveur() {
		if (calledserveur != null && calledserveur.eIsProxy()) {
			InternalEObject oldCalledserveur = (InternalEObject)calledserveur;
			calledserveur = (CalledServeur)eResolveProxy(oldCalledserveur);
			if (calledserveur != oldCalledserveur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClientServeurPackage.ATTACHMENT_RECEIVE_REQUEST__CALLEDSERVEUR, oldCalledserveur, calledserveur));
			}
		}
		return calledserveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalledServeur basicGetCalledserveur() {
		return calledserveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalledserveur(CalledServeur newCalledserveur) {
		CalledServeur oldCalledserveur = calledserveur;
		calledserveur = newCalledserveur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClientServeurPackage.ATTACHMENT_RECEIVE_REQUEST__CALLEDSERVEUR, oldCalledserveur, calledserveur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClientServeurPackage.ATTACHMENT_RECEIVE_REQUEST__PORT_RECEIVE_REQUEST:
				if (resolve) return getPort_receive_request();
				return basicGetPort_receive_request();
			case ClientServeurPackage.ATTACHMENT_RECEIVE_REQUEST__CALLEDSERVEUR:
				if (resolve) return getCalledserveur();
				return basicGetCalledserveur();
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
			case ClientServeurPackage.ATTACHMENT_RECEIVE_REQUEST__PORT_RECEIVE_REQUEST:
				setPort_receive_request((Port_Receive_Request)newValue);
				return;
			case ClientServeurPackage.ATTACHMENT_RECEIVE_REQUEST__CALLEDSERVEUR:
				setCalledserveur((CalledServeur)newValue);
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
			case ClientServeurPackage.ATTACHMENT_RECEIVE_REQUEST__PORT_RECEIVE_REQUEST:
				setPort_receive_request((Port_Receive_Request)null);
				return;
			case ClientServeurPackage.ATTACHMENT_RECEIVE_REQUEST__CALLEDSERVEUR:
				setCalledserveur((CalledServeur)null);
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
			case ClientServeurPackage.ATTACHMENT_RECEIVE_REQUEST__PORT_RECEIVE_REQUEST:
				return port_receive_request != null;
			case ClientServeurPackage.ATTACHMENT_RECEIVE_REQUEST__CALLEDSERVEUR:
				return calledserveur != null;
		}
		return super.eIsSet(featureID);
	}

} //Attachment_Receive_requestImpl
