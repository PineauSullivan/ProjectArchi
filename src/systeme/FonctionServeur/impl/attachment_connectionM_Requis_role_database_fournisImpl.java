/**
 */
package systeme.FonctionServeur.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projecttArchitectural.impl.AttachmentsRequisFournisImpl;

import systeme.FonctionServeur.FonctionServeurPackage;
import systeme.FonctionServeur.PortRequis_ConnectionManager_Database;
import systeme.FonctionServeur.RoleFournis_Database_Connection;
import systeme.FonctionServeur.attachment_connectionM_Requis_role_database_fournis;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>attachment connection MRequis role database fournis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.FonctionServeur.impl.attachment_connectionM_Requis_role_database_fournisImpl#getPortrequis_connectionmanager_database <em>Portrequis connectionmanager database</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.attachment_connectionM_Requis_role_database_fournisImpl#getRolefournis_database_connection <em>Rolefournis database connection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class attachment_connectionM_Requis_role_database_fournisImpl extends AttachmentsRequisFournisImpl implements attachment_connectionM_Requis_role_database_fournis {
	/**
	 * The cached value of the '{@link #getPortrequis_connectionmanager_database() <em>Portrequis connectionmanager database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrequis_connectionmanager_database()
	 * @generated
	 * @ordered
	 */
	protected PortRequis_ConnectionManager_Database portrequis_connectionmanager_database;

	/**
	 * The cached value of the '{@link #getRolefournis_database_connection() <em>Rolefournis database connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolefournis_database_connection()
	 * @generated
	 * @ordered
	 */
	protected RoleFournis_Database_Connection rolefournis_database_connection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected attachment_connectionM_Requis_role_database_fournisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FonctionServeurPackage.Literals.ATTACHMENT_CONNECTION_MREQUIS_ROLE_DATABASE_FOURNIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequis_ConnectionManager_Database getPortrequis_connectionmanager_database() {
		if (portrequis_connectionmanager_database != null && portrequis_connectionmanager_database.eIsProxy()) {
			InternalEObject oldPortrequis_connectionmanager_database = (InternalEObject)portrequis_connectionmanager_database;
			portrequis_connectionmanager_database = (PortRequis_ConnectionManager_Database)eResolveProxy(oldPortrequis_connectionmanager_database);
			if (portrequis_connectionmanager_database != oldPortrequis_connectionmanager_database) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.ATTACHMENT_CONNECTION_MREQUIS_ROLE_DATABASE_FOURNIS__PORTREQUIS_CONNECTIONMANAGER_DATABASE, oldPortrequis_connectionmanager_database, portrequis_connectionmanager_database));
			}
		}
		return portrequis_connectionmanager_database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequis_ConnectionManager_Database basicGetPortrequis_connectionmanager_database() {
		return portrequis_connectionmanager_database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortrequis_connectionmanager_database(PortRequis_ConnectionManager_Database newPortrequis_connectionmanager_database) {
		PortRequis_ConnectionManager_Database oldPortrequis_connectionmanager_database = portrequis_connectionmanager_database;
		portrequis_connectionmanager_database = newPortrequis_connectionmanager_database;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.ATTACHMENT_CONNECTION_MREQUIS_ROLE_DATABASE_FOURNIS__PORTREQUIS_CONNECTIONMANAGER_DATABASE, oldPortrequis_connectionmanager_database, portrequis_connectionmanager_database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFournis_Database_Connection getRolefournis_database_connection() {
		if (rolefournis_database_connection != null && rolefournis_database_connection.eIsProxy()) {
			InternalEObject oldRolefournis_database_connection = (InternalEObject)rolefournis_database_connection;
			rolefournis_database_connection = (RoleFournis_Database_Connection)eResolveProxy(oldRolefournis_database_connection);
			if (rolefournis_database_connection != oldRolefournis_database_connection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.ATTACHMENT_CONNECTION_MREQUIS_ROLE_DATABASE_FOURNIS__ROLEFOURNIS_DATABASE_CONNECTION, oldRolefournis_database_connection, rolefournis_database_connection));
			}
		}
		return rolefournis_database_connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFournis_Database_Connection basicGetRolefournis_database_connection() {
		return rolefournis_database_connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolefournis_database_connection(RoleFournis_Database_Connection newRolefournis_database_connection) {
		RoleFournis_Database_Connection oldRolefournis_database_connection = rolefournis_database_connection;
		rolefournis_database_connection = newRolefournis_database_connection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.ATTACHMENT_CONNECTION_MREQUIS_ROLE_DATABASE_FOURNIS__ROLEFOURNIS_DATABASE_CONNECTION, oldRolefournis_database_connection, rolefournis_database_connection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MREQUIS_ROLE_DATABASE_FOURNIS__PORTREQUIS_CONNECTIONMANAGER_DATABASE:
				if (resolve) return getPortrequis_connectionmanager_database();
				return basicGetPortrequis_connectionmanager_database();
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MREQUIS_ROLE_DATABASE_FOURNIS__ROLEFOURNIS_DATABASE_CONNECTION:
				if (resolve) return getRolefournis_database_connection();
				return basicGetRolefournis_database_connection();
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
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MREQUIS_ROLE_DATABASE_FOURNIS__PORTREQUIS_CONNECTIONMANAGER_DATABASE:
				setPortrequis_connectionmanager_database((PortRequis_ConnectionManager_Database)newValue);
				return;
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MREQUIS_ROLE_DATABASE_FOURNIS__ROLEFOURNIS_DATABASE_CONNECTION:
				setRolefournis_database_connection((RoleFournis_Database_Connection)newValue);
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
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MREQUIS_ROLE_DATABASE_FOURNIS__PORTREQUIS_CONNECTIONMANAGER_DATABASE:
				setPortrequis_connectionmanager_database((PortRequis_ConnectionManager_Database)null);
				return;
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MREQUIS_ROLE_DATABASE_FOURNIS__ROLEFOURNIS_DATABASE_CONNECTION:
				setRolefournis_database_connection((RoleFournis_Database_Connection)null);
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
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MREQUIS_ROLE_DATABASE_FOURNIS__PORTREQUIS_CONNECTIONMANAGER_DATABASE:
				return portrequis_connectionmanager_database != null;
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MREQUIS_ROLE_DATABASE_FOURNIS__ROLEFOURNIS_DATABASE_CONNECTION:
				return rolefournis_database_connection != null;
		}
		return super.eIsSet(featureID);
	}

} //attachment_connectionM_Requis_role_database_fournisImpl
