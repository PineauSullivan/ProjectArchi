/**
 */
package systeme.FonctionServeur.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projecttArchitectural.RoleConnecteursRequis;
import projecttArchitectural.impl.AttachmentFournisRequisImpl;

import systeme.FonctionServeur.FonctionServeurPackage;
import systeme.FonctionServeur.PortFournis_database_Connection;
import systeme.FonctionServeur.attachment_Database_Fournis_role_Connection_Requis;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>attachment Database Fournis role Connection Requis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.FonctionServeur.impl.attachment_Database_Fournis_role_Connection_RequisImpl#getPortfournis_database_connection <em>Portfournis database connection</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.attachment_Database_Fournis_role_Connection_RequisImpl#getRolerequis_connectionmanager_database <em>Rolerequis connectionmanager database</em>}</li>
 * </ul>
 *
 * @generated
 */
public class attachment_Database_Fournis_role_Connection_RequisImpl extends AttachmentFournisRequisImpl implements attachment_Database_Fournis_role_Connection_Requis {
	/**
	 * The cached value of the '{@link #getPortfournis_database_connection() <em>Portfournis database connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortfournis_database_connection()
	 * @generated
	 * @ordered
	 */
	protected PortFournis_database_Connection portfournis_database_connection;

	/**
	 * The cached value of the '{@link #getRolerequis_connectionmanager_database() <em>Rolerequis connectionmanager database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolerequis_connectionmanager_database()
	 * @generated
	 * @ordered
	 */
	protected RoleConnecteursRequis rolerequis_connectionmanager_database;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected attachment_Database_Fournis_role_Connection_RequisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FonctionServeurPackage.Literals.ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFournis_database_Connection getPortfournis_database_connection() {
		if (portfournis_database_connection != null && portfournis_database_connection.eIsProxy()) {
			InternalEObject oldPortfournis_database_connection = (InternalEObject)portfournis_database_connection;
			portfournis_database_connection = (PortFournis_database_Connection)eResolveProxy(oldPortfournis_database_connection);
			if (portfournis_database_connection != oldPortfournis_database_connection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS__PORTFOURNIS_DATABASE_CONNECTION, oldPortfournis_database_connection, portfournis_database_connection));
			}
		}
		return portfournis_database_connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFournis_database_Connection basicGetPortfournis_database_connection() {
		return portfournis_database_connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortfournis_database_connection(PortFournis_database_Connection newPortfournis_database_connection) {
		PortFournis_database_Connection oldPortfournis_database_connection = portfournis_database_connection;
		portfournis_database_connection = newPortfournis_database_connection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS__PORTFOURNIS_DATABASE_CONNECTION, oldPortfournis_database_connection, portfournis_database_connection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnecteursRequis getRolerequis_connectionmanager_database() {
		if (rolerequis_connectionmanager_database != null && ((EObject)rolerequis_connectionmanager_database).eIsProxy()) {
			InternalEObject oldRolerequis_connectionmanager_database = (InternalEObject)rolerequis_connectionmanager_database;
			rolerequis_connectionmanager_database = (RoleConnecteursRequis)eResolveProxy(oldRolerequis_connectionmanager_database);
			if (rolerequis_connectionmanager_database != oldRolerequis_connectionmanager_database) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS__ROLEREQUIS_CONNECTIONMANAGER_DATABASE, oldRolerequis_connectionmanager_database, rolerequis_connectionmanager_database));
			}
		}
		return rolerequis_connectionmanager_database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnecteursRequis basicGetRolerequis_connectionmanager_database() {
		return rolerequis_connectionmanager_database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolerequis_connectionmanager_database(RoleConnecteursRequis newRolerequis_connectionmanager_database) {
		RoleConnecteursRequis oldRolerequis_connectionmanager_database = rolerequis_connectionmanager_database;
		rolerequis_connectionmanager_database = newRolerequis_connectionmanager_database;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS__ROLEREQUIS_CONNECTIONMANAGER_DATABASE, oldRolerequis_connectionmanager_database, rolerequis_connectionmanager_database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FonctionServeurPackage.ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS__PORTFOURNIS_DATABASE_CONNECTION:
				if (resolve) return getPortfournis_database_connection();
				return basicGetPortfournis_database_connection();
			case FonctionServeurPackage.ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS__ROLEREQUIS_CONNECTIONMANAGER_DATABASE:
				if (resolve) return getRolerequis_connectionmanager_database();
				return basicGetRolerequis_connectionmanager_database();
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
			case FonctionServeurPackage.ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS__PORTFOURNIS_DATABASE_CONNECTION:
				setPortfournis_database_connection((PortFournis_database_Connection)newValue);
				return;
			case FonctionServeurPackage.ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS__ROLEREQUIS_CONNECTIONMANAGER_DATABASE:
				setRolerequis_connectionmanager_database((RoleConnecteursRequis)newValue);
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
			case FonctionServeurPackage.ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS__PORTFOURNIS_DATABASE_CONNECTION:
				setPortfournis_database_connection((PortFournis_database_Connection)null);
				return;
			case FonctionServeurPackage.ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS__ROLEREQUIS_CONNECTIONMANAGER_DATABASE:
				setRolerequis_connectionmanager_database((RoleConnecteursRequis)null);
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
			case FonctionServeurPackage.ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS__PORTFOURNIS_DATABASE_CONNECTION:
				return portfournis_database_connection != null;
			case FonctionServeurPackage.ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS__ROLEREQUIS_CONNECTIONMANAGER_DATABASE:
				return rolerequis_connectionmanager_database != null;
		}
		return super.eIsSet(featureID);
	}

} //attachment_Database_Fournis_role_Connection_RequisImpl
