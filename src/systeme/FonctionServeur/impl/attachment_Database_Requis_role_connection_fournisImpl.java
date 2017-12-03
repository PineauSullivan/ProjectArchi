/**
 */
package systeme.FonctionServeur.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projecttArchitectural.RoleConnecteursFournis;
import projecttArchitectural.impl.AttachmentsRequisFournisImpl;

import systeme.FonctionServeur.FonctionServeurPackage;
import systeme.FonctionServeur.PortRequis_database_Connection;
import systeme.FonctionServeur.attachment_Database_Requis_role_connection_fournis;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>attachment Database Requis role connection fournis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.FonctionServeur.impl.attachment_Database_Requis_role_connection_fournisImpl#getPortrequis_database_connection <em>Portrequis database connection</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.attachment_Database_Requis_role_connection_fournisImpl#getRolefournis_connectionmanager_database <em>Rolefournis connectionmanager database</em>}</li>
 * </ul>
 *
 * @generated
 */
public class attachment_Database_Requis_role_connection_fournisImpl extends AttachmentsRequisFournisImpl implements attachment_Database_Requis_role_connection_fournis {
	/**
	 * The cached value of the '{@link #getPortrequis_database_connection() <em>Portrequis database connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrequis_database_connection()
	 * @generated
	 * @ordered
	 */
	protected PortRequis_database_Connection portrequis_database_connection;

	/**
	 * The cached value of the '{@link #getRolefournis_connectionmanager_database() <em>Rolefournis connectionmanager database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolefournis_connectionmanager_database()
	 * @generated
	 * @ordered
	 */
	protected RoleConnecteursFournis rolefournis_connectionmanager_database;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected attachment_Database_Requis_role_connection_fournisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FonctionServeurPackage.Literals.ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequis_database_Connection getPortrequis_database_connection() {
		if (portrequis_database_connection != null && portrequis_database_connection.eIsProxy()) {
			InternalEObject oldPortrequis_database_connection = (InternalEObject)portrequis_database_connection;
			portrequis_database_connection = (PortRequis_database_Connection)eResolveProxy(oldPortrequis_database_connection);
			if (portrequis_database_connection != oldPortrequis_database_connection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS__PORTREQUIS_DATABASE_CONNECTION, oldPortrequis_database_connection, portrequis_database_connection));
			}
		}
		return portrequis_database_connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequis_database_Connection basicGetPortrequis_database_connection() {
		return portrequis_database_connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortrequis_database_connection(PortRequis_database_Connection newPortrequis_database_connection) {
		PortRequis_database_Connection oldPortrequis_database_connection = portrequis_database_connection;
		portrequis_database_connection = newPortrequis_database_connection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS__PORTREQUIS_DATABASE_CONNECTION, oldPortrequis_database_connection, portrequis_database_connection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnecteursFournis getRolefournis_connectionmanager_database() {
		if (rolefournis_connectionmanager_database != null && ((EObject)rolefournis_connectionmanager_database).eIsProxy()) {
			InternalEObject oldRolefournis_connectionmanager_database = (InternalEObject)rolefournis_connectionmanager_database;
			rolefournis_connectionmanager_database = (RoleConnecteursFournis)eResolveProxy(oldRolefournis_connectionmanager_database);
			if (rolefournis_connectionmanager_database != oldRolefournis_connectionmanager_database) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS__ROLEFOURNIS_CONNECTIONMANAGER_DATABASE, oldRolefournis_connectionmanager_database, rolefournis_connectionmanager_database));
			}
		}
		return rolefournis_connectionmanager_database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnecteursFournis basicGetRolefournis_connectionmanager_database() {
		return rolefournis_connectionmanager_database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolefournis_connectionmanager_database(RoleConnecteursFournis newRolefournis_connectionmanager_database) {
		RoleConnecteursFournis oldRolefournis_connectionmanager_database = rolefournis_connectionmanager_database;
		rolefournis_connectionmanager_database = newRolefournis_connectionmanager_database;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS__ROLEFOURNIS_CONNECTIONMANAGER_DATABASE, oldRolefournis_connectionmanager_database, rolefournis_connectionmanager_database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FonctionServeurPackage.ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS__PORTREQUIS_DATABASE_CONNECTION:
				if (resolve) return getPortrequis_database_connection();
				return basicGetPortrequis_database_connection();
			case FonctionServeurPackage.ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS__ROLEFOURNIS_CONNECTIONMANAGER_DATABASE:
				if (resolve) return getRolefournis_connectionmanager_database();
				return basicGetRolefournis_connectionmanager_database();
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
			case FonctionServeurPackage.ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS__PORTREQUIS_DATABASE_CONNECTION:
				setPortrequis_database_connection((PortRequis_database_Connection)newValue);
				return;
			case FonctionServeurPackage.ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS__ROLEFOURNIS_CONNECTIONMANAGER_DATABASE:
				setRolefournis_connectionmanager_database((RoleConnecteursFournis)newValue);
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
			case FonctionServeurPackage.ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS__PORTREQUIS_DATABASE_CONNECTION:
				setPortrequis_database_connection((PortRequis_database_Connection)null);
				return;
			case FonctionServeurPackage.ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS__ROLEFOURNIS_CONNECTIONMANAGER_DATABASE:
				setRolefournis_connectionmanager_database((RoleConnecteursFournis)null);
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
			case FonctionServeurPackage.ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS__PORTREQUIS_DATABASE_CONNECTION:
				return portrequis_database_connection != null;
			case FonctionServeurPackage.ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS__ROLEFOURNIS_CONNECTIONMANAGER_DATABASE:
				return rolefournis_connectionmanager_database != null;
		}
		return super.eIsSet(featureID);
	}

} //attachment_Database_Requis_role_connection_fournisImpl
