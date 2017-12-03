/**
 */
package systeme.FonctionServeur.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import projecttArchitectural.Glue;
import projecttArchitectural.impl.GlueImpl;
import systeme.FonctionServeur.FonctionServeurPackage;
import systeme.FonctionServeur.RoleFournis_Database_Connection;
import systeme.FonctionServeur.RoleRequis_Database_Connection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glue Serveur5</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.FonctionServeur.impl.GlueServeur5Impl#getRolefournis_database_connection <em>Rolefournis database connection</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.GlueServeur5Impl#getRolerequis_database_connection <em>Rolerequis database connection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlueServeur5Impl extends GlueImpl implements Glue {
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
	protected GlueServeur5Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FonctionServeurPackage.Literals.GLUE_SERVEUR5;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.GLUE_SERVEUR5__ROLEFOURNIS_DATABASE_CONNECTION, oldRolefournis_database_connection, rolefournis_database_connection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.GLUE_SERVEUR5__ROLEFOURNIS_DATABASE_CONNECTION, oldRolefournis_database_connection, rolefournis_database_connection));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.GLUE_SERVEUR5__ROLEREQUIS_DATABASE_CONNECTION, oldRolerequis_database_connection, rolerequis_database_connection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.GLUE_SERVEUR5__ROLEREQUIS_DATABASE_CONNECTION, oldRolerequis_database_connection, rolerequis_database_connection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FonctionServeurPackage.GLUE_SERVEUR5__ROLEFOURNIS_DATABASE_CONNECTION:
				if (resolve) return getRolefournis_database_connection();
				return basicGetRolefournis_database_connection();
			case FonctionServeurPackage.GLUE_SERVEUR5__ROLEREQUIS_DATABASE_CONNECTION:
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
			case FonctionServeurPackage.GLUE_SERVEUR5__ROLEFOURNIS_DATABASE_CONNECTION:
				setRolefournis_database_connection((RoleFournis_Database_Connection)newValue);
				return;
			case FonctionServeurPackage.GLUE_SERVEUR5__ROLEREQUIS_DATABASE_CONNECTION:
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
			case FonctionServeurPackage.GLUE_SERVEUR5__ROLEFOURNIS_DATABASE_CONNECTION:
				setRolefournis_database_connection((RoleFournis_Database_Connection)null);
				return;
			case FonctionServeurPackage.GLUE_SERVEUR5__ROLEREQUIS_DATABASE_CONNECTION:
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
			case FonctionServeurPackage.GLUE_SERVEUR5__ROLEFOURNIS_DATABASE_CONNECTION:
				return rolefournis_database_connection != null;
			case FonctionServeurPackage.GLUE_SERVEUR5__ROLEREQUIS_DATABASE_CONNECTION:
				return rolerequis_database_connection != null;
		}
		return super.eIsSet(featureID);
	}

} //GlueServeur5Impl
