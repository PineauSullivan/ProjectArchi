/**
 */
package systeme.FonctionServeur.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projecttArchitectural.impl.AttachmentFournisRequisImpl;

import systeme.FonctionServeur.FonctionServeurPackage;
import systeme.FonctionServeur.PortFournis_Security_Connection;
import systeme.FonctionServeur.RoleRequis_ConnectionManager_Security;
import systeme.FonctionServeur.attachment_Security_Fournis_role_Connection_Requis;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>attachment Security Fournis role Connection Requis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.FonctionServeur.impl.attachment_Security_Fournis_role_Connection_RequisImpl#getPortfournis_security_connection <em>Portfournis security connection</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.attachment_Security_Fournis_role_Connection_RequisImpl#getRolerequis_connectionmanager_security <em>Rolerequis connectionmanager security</em>}</li>
 * </ul>
 *
 * @generated
 */
public class attachment_Security_Fournis_role_Connection_RequisImpl extends AttachmentFournisRequisImpl implements attachment_Security_Fournis_role_Connection_Requis {
	/**
	 * The cached value of the '{@link #getPortfournis_security_connection() <em>Portfournis security connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortfournis_security_connection()
	 * @generated
	 * @ordered
	 */
	protected PortFournis_Security_Connection portfournis_security_connection;

	/**
	 * The cached value of the '{@link #getRolerequis_connectionmanager_security() <em>Rolerequis connectionmanager security</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolerequis_connectionmanager_security()
	 * @generated
	 * @ordered
	 */
	protected RoleRequis_ConnectionManager_Security rolerequis_connectionmanager_security;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected attachment_Security_Fournis_role_Connection_RequisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FonctionServeurPackage.Literals.ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFournis_Security_Connection getPortfournis_security_connection() {
		if (portfournis_security_connection != null && portfournis_security_connection.eIsProxy()) {
			InternalEObject oldPortfournis_security_connection = (InternalEObject)portfournis_security_connection;
			portfournis_security_connection = (PortFournis_Security_Connection)eResolveProxy(oldPortfournis_security_connection);
			if (portfournis_security_connection != oldPortfournis_security_connection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS__PORTFOURNIS_SECURITY_CONNECTION, oldPortfournis_security_connection, portfournis_security_connection));
			}
		}
		return portfournis_security_connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFournis_Security_Connection basicGetPortfournis_security_connection() {
		return portfournis_security_connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortfournis_security_connection(PortFournis_Security_Connection newPortfournis_security_connection) {
		PortFournis_Security_Connection oldPortfournis_security_connection = portfournis_security_connection;
		portfournis_security_connection = newPortfournis_security_connection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS__PORTFOURNIS_SECURITY_CONNECTION, oldPortfournis_security_connection, portfournis_security_connection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis_ConnectionManager_Security getRolerequis_connectionmanager_security() {
		if (rolerequis_connectionmanager_security != null && rolerequis_connectionmanager_security.eIsProxy()) {
			InternalEObject oldRolerequis_connectionmanager_security = (InternalEObject)rolerequis_connectionmanager_security;
			rolerequis_connectionmanager_security = (RoleRequis_ConnectionManager_Security)eResolveProxy(oldRolerequis_connectionmanager_security);
			if (rolerequis_connectionmanager_security != oldRolerequis_connectionmanager_security) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS__ROLEREQUIS_CONNECTIONMANAGER_SECURITY, oldRolerequis_connectionmanager_security, rolerequis_connectionmanager_security));
			}
		}
		return rolerequis_connectionmanager_security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis_ConnectionManager_Security basicGetRolerequis_connectionmanager_security() {
		return rolerequis_connectionmanager_security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolerequis_connectionmanager_security(RoleRequis_ConnectionManager_Security newRolerequis_connectionmanager_security) {
		RoleRequis_ConnectionManager_Security oldRolerequis_connectionmanager_security = rolerequis_connectionmanager_security;
		rolerequis_connectionmanager_security = newRolerequis_connectionmanager_security;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS__ROLEREQUIS_CONNECTIONMANAGER_SECURITY, oldRolerequis_connectionmanager_security, rolerequis_connectionmanager_security));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FonctionServeurPackage.ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS__PORTFOURNIS_SECURITY_CONNECTION:
				if (resolve) return getPortfournis_security_connection();
				return basicGetPortfournis_security_connection();
			case FonctionServeurPackage.ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS__ROLEREQUIS_CONNECTIONMANAGER_SECURITY:
				if (resolve) return getRolerequis_connectionmanager_security();
				return basicGetRolerequis_connectionmanager_security();
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
			case FonctionServeurPackage.ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS__PORTFOURNIS_SECURITY_CONNECTION:
				setPortfournis_security_connection((PortFournis_Security_Connection)newValue);
				return;
			case FonctionServeurPackage.ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS__ROLEREQUIS_CONNECTIONMANAGER_SECURITY:
				setRolerequis_connectionmanager_security((RoleRequis_ConnectionManager_Security)newValue);
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
			case FonctionServeurPackage.ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS__PORTFOURNIS_SECURITY_CONNECTION:
				setPortfournis_security_connection((PortFournis_Security_Connection)null);
				return;
			case FonctionServeurPackage.ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS__ROLEREQUIS_CONNECTIONMANAGER_SECURITY:
				setRolerequis_connectionmanager_security((RoleRequis_ConnectionManager_Security)null);
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
			case FonctionServeurPackage.ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS__PORTFOURNIS_SECURITY_CONNECTION:
				return portfournis_security_connection != null;
			case FonctionServeurPackage.ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS__ROLEREQUIS_CONNECTIONMANAGER_SECURITY:
				return rolerequis_connectionmanager_security != null;
		}
		return super.eIsSet(featureID);
	}

} //attachment_Security_Fournis_role_Connection_RequisImpl
