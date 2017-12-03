/**
 */
package systeme.FonctionServeur.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projecttArchitectural.impl.AttachmentsRequisFournisImpl;

import systeme.FonctionServeur.FonctionServeurPackage;
import systeme.FonctionServeur.PortRequis_ConnectionManager_Security;
import systeme.FonctionServeur.RoleFournis_Security_Connection;
import systeme.FonctionServeur.attachment_connectionM_Requis_role_security_fournis;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>attachment connection MRequis role security fournis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.FonctionServeur.impl.attachment_connectionM_Requis_role_security_fournisImpl#getPortrequis_connectionmanager_security <em>Portrequis connectionmanager security</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.attachment_connectionM_Requis_role_security_fournisImpl#getRolefournis_security_connection <em>Rolefournis security connection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class attachment_connectionM_Requis_role_security_fournisImpl extends AttachmentsRequisFournisImpl implements attachment_connectionM_Requis_role_security_fournis {
	/**
	 * The cached value of the '{@link #getPortrequis_connectionmanager_security() <em>Portrequis connectionmanager security</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrequis_connectionmanager_security()
	 * @generated
	 * @ordered
	 */
	protected PortRequis_ConnectionManager_Security portrequis_connectionmanager_security;

	/**
	 * The cached value of the '{@link #getRolefournis_security_connection() <em>Rolefournis security connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolefournis_security_connection()
	 * @generated
	 * @ordered
	 */
	protected RoleFournis_Security_Connection rolefournis_security_connection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected attachment_connectionM_Requis_role_security_fournisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FonctionServeurPackage.Literals.ATTACHMENT_CONNECTION_MREQUIS_ROLE_SECURITY_FOURNIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequis_ConnectionManager_Security getPortrequis_connectionmanager_security() {
		if (portrequis_connectionmanager_security != null && portrequis_connectionmanager_security.eIsProxy()) {
			InternalEObject oldPortrequis_connectionmanager_security = (InternalEObject)portrequis_connectionmanager_security;
			portrequis_connectionmanager_security = (PortRequis_ConnectionManager_Security)eResolveProxy(oldPortrequis_connectionmanager_security);
			if (portrequis_connectionmanager_security != oldPortrequis_connectionmanager_security) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.ATTACHMENT_CONNECTION_MREQUIS_ROLE_SECURITY_FOURNIS__PORTREQUIS_CONNECTIONMANAGER_SECURITY, oldPortrequis_connectionmanager_security, portrequis_connectionmanager_security));
			}
		}
		return portrequis_connectionmanager_security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequis_ConnectionManager_Security basicGetPortrequis_connectionmanager_security() {
		return portrequis_connectionmanager_security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortrequis_connectionmanager_security(PortRequis_ConnectionManager_Security newPortrequis_connectionmanager_security) {
		PortRequis_ConnectionManager_Security oldPortrequis_connectionmanager_security = portrequis_connectionmanager_security;
		portrequis_connectionmanager_security = newPortrequis_connectionmanager_security;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.ATTACHMENT_CONNECTION_MREQUIS_ROLE_SECURITY_FOURNIS__PORTREQUIS_CONNECTIONMANAGER_SECURITY, oldPortrequis_connectionmanager_security, portrequis_connectionmanager_security));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFournis_Security_Connection getRolefournis_security_connection() {
		if (rolefournis_security_connection != null && rolefournis_security_connection.eIsProxy()) {
			InternalEObject oldRolefournis_security_connection = (InternalEObject)rolefournis_security_connection;
			rolefournis_security_connection = (RoleFournis_Security_Connection)eResolveProxy(oldRolefournis_security_connection);
			if (rolefournis_security_connection != oldRolefournis_security_connection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.ATTACHMENT_CONNECTION_MREQUIS_ROLE_SECURITY_FOURNIS__ROLEFOURNIS_SECURITY_CONNECTION, oldRolefournis_security_connection, rolefournis_security_connection));
			}
		}
		return rolefournis_security_connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFournis_Security_Connection basicGetRolefournis_security_connection() {
		return rolefournis_security_connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolefournis_security_connection(RoleFournis_Security_Connection newRolefournis_security_connection) {
		RoleFournis_Security_Connection oldRolefournis_security_connection = rolefournis_security_connection;
		rolefournis_security_connection = newRolefournis_security_connection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.ATTACHMENT_CONNECTION_MREQUIS_ROLE_SECURITY_FOURNIS__ROLEFOURNIS_SECURITY_CONNECTION, oldRolefournis_security_connection, rolefournis_security_connection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MREQUIS_ROLE_SECURITY_FOURNIS__PORTREQUIS_CONNECTIONMANAGER_SECURITY:
				if (resolve) return getPortrequis_connectionmanager_security();
				return basicGetPortrequis_connectionmanager_security();
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MREQUIS_ROLE_SECURITY_FOURNIS__ROLEFOURNIS_SECURITY_CONNECTION:
				if (resolve) return getRolefournis_security_connection();
				return basicGetRolefournis_security_connection();
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
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MREQUIS_ROLE_SECURITY_FOURNIS__PORTREQUIS_CONNECTIONMANAGER_SECURITY:
				setPortrequis_connectionmanager_security((PortRequis_ConnectionManager_Security)newValue);
				return;
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MREQUIS_ROLE_SECURITY_FOURNIS__ROLEFOURNIS_SECURITY_CONNECTION:
				setRolefournis_security_connection((RoleFournis_Security_Connection)newValue);
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
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MREQUIS_ROLE_SECURITY_FOURNIS__PORTREQUIS_CONNECTIONMANAGER_SECURITY:
				setPortrequis_connectionmanager_security((PortRequis_ConnectionManager_Security)null);
				return;
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MREQUIS_ROLE_SECURITY_FOURNIS__ROLEFOURNIS_SECURITY_CONNECTION:
				setRolefournis_security_connection((RoleFournis_Security_Connection)null);
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
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MREQUIS_ROLE_SECURITY_FOURNIS__PORTREQUIS_CONNECTIONMANAGER_SECURITY:
				return portrequis_connectionmanager_security != null;
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MREQUIS_ROLE_SECURITY_FOURNIS__ROLEFOURNIS_SECURITY_CONNECTION:
				return rolefournis_security_connection != null;
		}
		return super.eIsSet(featureID);
	}

} //attachment_connectionM_Requis_role_security_fournisImpl
