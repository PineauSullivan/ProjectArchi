/**
 */
package systeme.FonctionServeur.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projecttArchitectural.impl.AttachmentsRequisFournisImpl;

import systeme.FonctionServeur.FonctionServeurPackage;
import systeme.FonctionServeur.PortRequis_Security_Connection;
import systeme.FonctionServeur.RoleFournis_ConnectionManager_Security;
import systeme.FonctionServeur.attachment_Security_Requis_role_Connection_fournis;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>attachment Security Requis role Connection fournis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.FonctionServeur.impl.attachment_Security_Requis_role_Connection_fournisImpl#getPortrequis_security_connection <em>Portrequis security connection</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.attachment_Security_Requis_role_Connection_fournisImpl#getRolefournis_connectionmanager_security <em>Rolefournis connectionmanager security</em>}</li>
 * </ul>
 *
 * @generated
 */
public class attachment_Security_Requis_role_Connection_fournisImpl extends AttachmentsRequisFournisImpl implements attachment_Security_Requis_role_Connection_fournis {
	/**
	 * The cached value of the '{@link #getPortrequis_security_connection() <em>Portrequis security connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrequis_security_connection()
	 * @generated
	 * @ordered
	 */
	protected PortRequis_Security_Connection portrequis_security_connection;

	/**
	 * The cached value of the '{@link #getRolefournis_connectionmanager_security() <em>Rolefournis connectionmanager security</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolefournis_connectionmanager_security()
	 * @generated
	 * @ordered
	 */
	protected RoleFournis_ConnectionManager_Security rolefournis_connectionmanager_security;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected attachment_Security_Requis_role_Connection_fournisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FonctionServeurPackage.Literals.ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequis_Security_Connection getPortrequis_security_connection() {
		if (portrequis_security_connection != null && portrequis_security_connection.eIsProxy()) {
			InternalEObject oldPortrequis_security_connection = (InternalEObject)portrequis_security_connection;
			portrequis_security_connection = (PortRequis_Security_Connection)eResolveProxy(oldPortrequis_security_connection);
			if (portrequis_security_connection != oldPortrequis_security_connection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS__PORTREQUIS_SECURITY_CONNECTION, oldPortrequis_security_connection, portrequis_security_connection));
			}
		}
		return portrequis_security_connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequis_Security_Connection basicGetPortrequis_security_connection() {
		return portrequis_security_connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortrequis_security_connection(PortRequis_Security_Connection newPortrequis_security_connection) {
		PortRequis_Security_Connection oldPortrequis_security_connection = portrequis_security_connection;
		portrequis_security_connection = newPortrequis_security_connection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS__PORTREQUIS_SECURITY_CONNECTION, oldPortrequis_security_connection, portrequis_security_connection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFournis_ConnectionManager_Security getRolefournis_connectionmanager_security() {
		if (rolefournis_connectionmanager_security != null && rolefournis_connectionmanager_security.eIsProxy()) {
			InternalEObject oldRolefournis_connectionmanager_security = (InternalEObject)rolefournis_connectionmanager_security;
			rolefournis_connectionmanager_security = (RoleFournis_ConnectionManager_Security)eResolveProxy(oldRolefournis_connectionmanager_security);
			if (rolefournis_connectionmanager_security != oldRolefournis_connectionmanager_security) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS__ROLEFOURNIS_CONNECTIONMANAGER_SECURITY, oldRolefournis_connectionmanager_security, rolefournis_connectionmanager_security));
			}
		}
		return rolefournis_connectionmanager_security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFournis_ConnectionManager_Security basicGetRolefournis_connectionmanager_security() {
		return rolefournis_connectionmanager_security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolefournis_connectionmanager_security(RoleFournis_ConnectionManager_Security newRolefournis_connectionmanager_security) {
		RoleFournis_ConnectionManager_Security oldRolefournis_connectionmanager_security = rolefournis_connectionmanager_security;
		rolefournis_connectionmanager_security = newRolefournis_connectionmanager_security;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS__ROLEFOURNIS_CONNECTIONMANAGER_SECURITY, oldRolefournis_connectionmanager_security, rolefournis_connectionmanager_security));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FonctionServeurPackage.ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS__PORTREQUIS_SECURITY_CONNECTION:
				if (resolve) return getPortrequis_security_connection();
				return basicGetPortrequis_security_connection();
			case FonctionServeurPackage.ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS__ROLEFOURNIS_CONNECTIONMANAGER_SECURITY:
				if (resolve) return getRolefournis_connectionmanager_security();
				return basicGetRolefournis_connectionmanager_security();
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
			case FonctionServeurPackage.ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS__PORTREQUIS_SECURITY_CONNECTION:
				setPortrequis_security_connection((PortRequis_Security_Connection)newValue);
				return;
			case FonctionServeurPackage.ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS__ROLEFOURNIS_CONNECTIONMANAGER_SECURITY:
				setRolefournis_connectionmanager_security((RoleFournis_ConnectionManager_Security)newValue);
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
			case FonctionServeurPackage.ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS__PORTREQUIS_SECURITY_CONNECTION:
				setPortrequis_security_connection((PortRequis_Security_Connection)null);
				return;
			case FonctionServeurPackage.ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS__ROLEFOURNIS_CONNECTIONMANAGER_SECURITY:
				setRolefournis_connectionmanager_security((RoleFournis_ConnectionManager_Security)null);
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
			case FonctionServeurPackage.ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS__PORTREQUIS_SECURITY_CONNECTION:
				return portrequis_security_connection != null;
			case FonctionServeurPackage.ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS__ROLEFOURNIS_CONNECTIONMANAGER_SECURITY:
				return rolefournis_connectionmanager_security != null;
		}
		return super.eIsSet(featureID);
	}

} //attachment_Security_Requis_role_Connection_fournisImpl
