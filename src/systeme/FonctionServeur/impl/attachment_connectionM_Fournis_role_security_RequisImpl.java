/**
 */
package systeme.FonctionServeur.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projecttArchitectural.impl.AttachmentFournisRequisImpl;

import systeme.FonctionServeur.FonctionServeurPackage;
import systeme.FonctionServeur.PortFournis_ConnectionManager_Security;
import systeme.FonctionServeur.RoleRequis_Security_Connection;
import systeme.FonctionServeur.attachment_connectionM_Fournis_role_security_Requis;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>attachment connection MFournis role security Requis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.FonctionServeur.impl.attachment_connectionM_Fournis_role_security_RequisImpl#getPortfournis_connectionmanager_security <em>Portfournis connectionmanager security</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.attachment_connectionM_Fournis_role_security_RequisImpl#getRolerequis_security_connection <em>Rolerequis security connection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class attachment_connectionM_Fournis_role_security_RequisImpl extends AttachmentFournisRequisImpl implements attachment_connectionM_Fournis_role_security_Requis {
	/**
	 * The cached value of the '{@link #getPortfournis_connectionmanager_security() <em>Portfournis connectionmanager security</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortfournis_connectionmanager_security()
	 * @generated
	 * @ordered
	 */
	protected PortFournis_ConnectionManager_Security portfournis_connectionmanager_security;

	/**
	 * The cached value of the '{@link #getRolerequis_security_connection() <em>Rolerequis security connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolerequis_security_connection()
	 * @generated
	 * @ordered
	 */
	protected RoleRequis_Security_Connection rolerequis_security_connection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected attachment_connectionM_Fournis_role_security_RequisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FonctionServeurPackage.Literals.ATTACHMENT_CONNECTION_MFOURNIS_ROLE_SECURITY_REQUIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFournis_ConnectionManager_Security getPortfournis_connectionmanager_security() {
		if (portfournis_connectionmanager_security != null && portfournis_connectionmanager_security.eIsProxy()) {
			InternalEObject oldPortfournis_connectionmanager_security = (InternalEObject)portfournis_connectionmanager_security;
			portfournis_connectionmanager_security = (PortFournis_ConnectionManager_Security)eResolveProxy(oldPortfournis_connectionmanager_security);
			if (portfournis_connectionmanager_security != oldPortfournis_connectionmanager_security) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.ATTACHMENT_CONNECTION_MFOURNIS_ROLE_SECURITY_REQUIS__PORTFOURNIS_CONNECTIONMANAGER_SECURITY, oldPortfournis_connectionmanager_security, portfournis_connectionmanager_security));
			}
		}
		return portfournis_connectionmanager_security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFournis_ConnectionManager_Security basicGetPortfournis_connectionmanager_security() {
		return portfournis_connectionmanager_security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortfournis_connectionmanager_security(PortFournis_ConnectionManager_Security newPortfournis_connectionmanager_security) {
		PortFournis_ConnectionManager_Security oldPortfournis_connectionmanager_security = portfournis_connectionmanager_security;
		portfournis_connectionmanager_security = newPortfournis_connectionmanager_security;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.ATTACHMENT_CONNECTION_MFOURNIS_ROLE_SECURITY_REQUIS__PORTFOURNIS_CONNECTIONMANAGER_SECURITY, oldPortfournis_connectionmanager_security, portfournis_connectionmanager_security));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis_Security_Connection getRolerequis_security_connection() {
		if (rolerequis_security_connection != null && rolerequis_security_connection.eIsProxy()) {
			InternalEObject oldRolerequis_security_connection = (InternalEObject)rolerequis_security_connection;
			rolerequis_security_connection = (RoleRequis_Security_Connection)eResolveProxy(oldRolerequis_security_connection);
			if (rolerequis_security_connection != oldRolerequis_security_connection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.ATTACHMENT_CONNECTION_MFOURNIS_ROLE_SECURITY_REQUIS__ROLEREQUIS_SECURITY_CONNECTION, oldRolerequis_security_connection, rolerequis_security_connection));
			}
		}
		return rolerequis_security_connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis_Security_Connection basicGetRolerequis_security_connection() {
		return rolerequis_security_connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolerequis_security_connection(RoleRequis_Security_Connection newRolerequis_security_connection) {
		RoleRequis_Security_Connection oldRolerequis_security_connection = rolerequis_security_connection;
		rolerequis_security_connection = newRolerequis_security_connection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.ATTACHMENT_CONNECTION_MFOURNIS_ROLE_SECURITY_REQUIS__ROLEREQUIS_SECURITY_CONNECTION, oldRolerequis_security_connection, rolerequis_security_connection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MFOURNIS_ROLE_SECURITY_REQUIS__PORTFOURNIS_CONNECTIONMANAGER_SECURITY:
				if (resolve) return getPortfournis_connectionmanager_security();
				return basicGetPortfournis_connectionmanager_security();
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MFOURNIS_ROLE_SECURITY_REQUIS__ROLEREQUIS_SECURITY_CONNECTION:
				if (resolve) return getRolerequis_security_connection();
				return basicGetRolerequis_security_connection();
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
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MFOURNIS_ROLE_SECURITY_REQUIS__PORTFOURNIS_CONNECTIONMANAGER_SECURITY:
				setPortfournis_connectionmanager_security((PortFournis_ConnectionManager_Security)newValue);
				return;
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MFOURNIS_ROLE_SECURITY_REQUIS__ROLEREQUIS_SECURITY_CONNECTION:
				setRolerequis_security_connection((RoleRequis_Security_Connection)newValue);
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
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MFOURNIS_ROLE_SECURITY_REQUIS__PORTFOURNIS_CONNECTIONMANAGER_SECURITY:
				setPortfournis_connectionmanager_security((PortFournis_ConnectionManager_Security)null);
				return;
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MFOURNIS_ROLE_SECURITY_REQUIS__ROLEREQUIS_SECURITY_CONNECTION:
				setRolerequis_security_connection((RoleRequis_Security_Connection)null);
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
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MFOURNIS_ROLE_SECURITY_REQUIS__PORTFOURNIS_CONNECTIONMANAGER_SECURITY:
				return portfournis_connectionmanager_security != null;
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MFOURNIS_ROLE_SECURITY_REQUIS__ROLEREQUIS_SECURITY_CONNECTION:
				return rolerequis_security_connection != null;
		}
		return super.eIsSet(featureID);
	}

} //attachment_connectionM_Fournis_role_security_RequisImpl
