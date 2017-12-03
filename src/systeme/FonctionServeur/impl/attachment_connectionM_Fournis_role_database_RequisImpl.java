/**
 */
package systeme.FonctionServeur.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projecttArchitectural.impl.AttachmentFournisRequisImpl;

import systeme.FonctionServeur.FonctionServeurPackage;
import systeme.FonctionServeur.PortFournis_ConnectionManager_Database;
import systeme.FonctionServeur.RoleRequis_Database_Connection;
import systeme.FonctionServeur.attachment_connectionM_Fournis_role_database_Requis;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>attachment connection MFournis role database Requis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.FonctionServeur.impl.attachment_connectionM_Fournis_role_database_RequisImpl#getPortfournis_connectionmanager_database <em>Portfournis connectionmanager database</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.attachment_connectionM_Fournis_role_database_RequisImpl#getRolerequis_database_connection <em>Rolerequis database connection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class attachment_connectionM_Fournis_role_database_RequisImpl extends AttachmentFournisRequisImpl implements attachment_connectionM_Fournis_role_database_Requis {
	/**
	 * The cached value of the '{@link #getPortfournis_connectionmanager_database() <em>Portfournis connectionmanager database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortfournis_connectionmanager_database()
	 * @generated
	 * @ordered
	 */
	protected PortFournis_ConnectionManager_Database portfournis_connectionmanager_database;

	/**
	 * The cached value of the '{@link #getRolerequis_database_connection() <em>Rolerequis database connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolerequis_database_connection()
	 * @generated
	 * @ordered
	 */
	protected RoleRequis_Database_Connection rolerequis_database_connection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected attachment_connectionM_Fournis_role_database_RequisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FonctionServeurPackage.Literals.ATTACHMENT_CONNECTION_MFOURNIS_ROLE_DATABASE_REQUIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFournis_ConnectionManager_Database getPortfournis_connectionmanager_database() {
		if (portfournis_connectionmanager_database != null && portfournis_connectionmanager_database.eIsProxy()) {
			InternalEObject oldPortfournis_connectionmanager_database = (InternalEObject)portfournis_connectionmanager_database;
			portfournis_connectionmanager_database = (PortFournis_ConnectionManager_Database)eResolveProxy(oldPortfournis_connectionmanager_database);
			if (portfournis_connectionmanager_database != oldPortfournis_connectionmanager_database) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.ATTACHMENT_CONNECTION_MFOURNIS_ROLE_DATABASE_REQUIS__PORTFOURNIS_CONNECTIONMANAGER_DATABASE, oldPortfournis_connectionmanager_database, portfournis_connectionmanager_database));
			}
		}
		return portfournis_connectionmanager_database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFournis_ConnectionManager_Database basicGetPortfournis_connectionmanager_database() {
		return portfournis_connectionmanager_database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortfournis_connectionmanager_database(PortFournis_ConnectionManager_Database newPortfournis_connectionmanager_database) {
		PortFournis_ConnectionManager_Database oldPortfournis_connectionmanager_database = portfournis_connectionmanager_database;
		portfournis_connectionmanager_database = newPortfournis_connectionmanager_database;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.ATTACHMENT_CONNECTION_MFOURNIS_ROLE_DATABASE_REQUIS__PORTFOURNIS_CONNECTIONMANAGER_DATABASE, oldPortfournis_connectionmanager_database, portfournis_connectionmanager_database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis_Database_Connection getRolerequis_database_connection() {
		if (rolerequis_database_connection != null && rolerequis_database_connection.eIsProxy()) {
			InternalEObject oldRolerequis_database_connection = (InternalEObject)rolerequis_database_connection;
			rolerequis_database_connection = (RoleRequis_Database_Connection)eResolveProxy(oldRolerequis_database_connection);
			if (rolerequis_database_connection != oldRolerequis_database_connection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.ATTACHMENT_CONNECTION_MFOURNIS_ROLE_DATABASE_REQUIS__ROLEREQUIS_DATABASE_CONNECTION, oldRolerequis_database_connection, rolerequis_database_connection));
			}
		}
		return rolerequis_database_connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis_Database_Connection basicGetRolerequis_database_connection() {
		return rolerequis_database_connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolerequis_database_connection(RoleRequis_Database_Connection newRolerequis_database_connection) {
		RoleRequis_Database_Connection oldRolerequis_database_connection = rolerequis_database_connection;
		rolerequis_database_connection = newRolerequis_database_connection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.ATTACHMENT_CONNECTION_MFOURNIS_ROLE_DATABASE_REQUIS__ROLEREQUIS_DATABASE_CONNECTION, oldRolerequis_database_connection, rolerequis_database_connection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MFOURNIS_ROLE_DATABASE_REQUIS__PORTFOURNIS_CONNECTIONMANAGER_DATABASE:
				if (resolve) return getPortfournis_connectionmanager_database();
				return basicGetPortfournis_connectionmanager_database();
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MFOURNIS_ROLE_DATABASE_REQUIS__ROLEREQUIS_DATABASE_CONNECTION:
				if (resolve) return getRolerequis_database_connection();
				return basicGetRolerequis_database_connection();
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
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MFOURNIS_ROLE_DATABASE_REQUIS__PORTFOURNIS_CONNECTIONMANAGER_DATABASE:
				setPortfournis_connectionmanager_database((PortFournis_ConnectionManager_Database)newValue);
				return;
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MFOURNIS_ROLE_DATABASE_REQUIS__ROLEREQUIS_DATABASE_CONNECTION:
				setRolerequis_database_connection((RoleRequis_Database_Connection)newValue);
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
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MFOURNIS_ROLE_DATABASE_REQUIS__PORTFOURNIS_CONNECTIONMANAGER_DATABASE:
				setPortfournis_connectionmanager_database((PortFournis_ConnectionManager_Database)null);
				return;
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MFOURNIS_ROLE_DATABASE_REQUIS__ROLEREQUIS_DATABASE_CONNECTION:
				setRolerequis_database_connection((RoleRequis_Database_Connection)null);
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
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MFOURNIS_ROLE_DATABASE_REQUIS__PORTFOURNIS_CONNECTIONMANAGER_DATABASE:
				return portfournis_connectionmanager_database != null;
			case FonctionServeurPackage.ATTACHMENT_CONNECTION_MFOURNIS_ROLE_DATABASE_REQUIS__ROLEREQUIS_DATABASE_CONNECTION:
				return rolerequis_database_connection != null;
		}
		return super.eIsSet(featureID);
	}

} //attachment_connectionM_Fournis_role_database_RequisImpl
