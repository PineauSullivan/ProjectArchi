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
import systeme.FonctionServeur.RoleFournis_Security_Database;
import systeme.FonctionServeur.RoleRequis_Security_Database;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glue Serveur4</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.FonctionServeur.impl.GlueServeur4Impl#getRolefournis_security_database <em>Rolefournis security database</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.GlueServeur4Impl#getRolerequis_security_database <em>Rolerequis security database</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlueServeur4Impl extends GlueImpl implements Glue {
	/**
	 * The cached value of the '{@link #getRolefournis_security_database() <em>Rolefournis security database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolefournis_security_database()
	 * @generated
	 * @ordered
	 */
	protected RoleFournis_Security_Database rolefournis_security_database;

	/**
	 * The cached value of the '{@link #getRolerequis_security_database() <em>Rolerequis security database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolerequis_security_database()
	 * @generated
	 * @ordered
	 */
	protected RoleRequis_Security_Database rolerequis_security_database;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlueServeur4Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FonctionServeurPackage.Literals.GLUE_SERVEUR4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFournis_Security_Database getRolefournis_security_database() {
		if (rolefournis_security_database != null && rolefournis_security_database.eIsProxy()) {
			InternalEObject oldRolefournis_security_database = (InternalEObject)rolefournis_security_database;
			rolefournis_security_database = (RoleFournis_Security_Database)eResolveProxy(oldRolefournis_security_database);
			if (rolefournis_security_database != oldRolefournis_security_database) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.GLUE_SERVEUR4__ROLEFOURNIS_SECURITY_DATABASE, oldRolefournis_security_database, rolefournis_security_database));
			}
		}
		return rolefournis_security_database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFournis_Security_Database basicGetRolefournis_security_database() {
		return rolefournis_security_database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolefournis_security_database(RoleFournis_Security_Database newRolefournis_security_database) {
		RoleFournis_Security_Database oldRolefournis_security_database = rolefournis_security_database;
		rolefournis_security_database = newRolefournis_security_database;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.GLUE_SERVEUR4__ROLEFOURNIS_SECURITY_DATABASE, oldRolefournis_security_database, rolefournis_security_database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis_Security_Database getRolerequis_security_database() {
		if (rolerequis_security_database != null && rolerequis_security_database.eIsProxy()) {
			InternalEObject oldRolerequis_security_database = (InternalEObject)rolerequis_security_database;
			rolerequis_security_database = (RoleRequis_Security_Database)eResolveProxy(oldRolerequis_security_database);
			if (rolerequis_security_database != oldRolerequis_security_database) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.GLUE_SERVEUR4__ROLEREQUIS_SECURITY_DATABASE, oldRolerequis_security_database, rolerequis_security_database));
			}
		}
		return rolerequis_security_database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis_Security_Database basicGetRolerequis_security_database() {
		return rolerequis_security_database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolerequis_security_database(RoleRequis_Security_Database newRolerequis_security_database) {
		RoleRequis_Security_Database oldRolerequis_security_database = rolerequis_security_database;
		rolerequis_security_database = newRolerequis_security_database;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.GLUE_SERVEUR4__ROLEREQUIS_SECURITY_DATABASE, oldRolerequis_security_database, rolerequis_security_database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FonctionServeurPackage.GLUE_SERVEUR4__ROLEFOURNIS_SECURITY_DATABASE:
				if (resolve) return getRolefournis_security_database();
				return basicGetRolefournis_security_database();
			case FonctionServeurPackage.GLUE_SERVEUR4__ROLEREQUIS_SECURITY_DATABASE:
				if (resolve) return getRolerequis_security_database();
				return basicGetRolerequis_security_database();
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
			case FonctionServeurPackage.GLUE_SERVEUR4__ROLEFOURNIS_SECURITY_DATABASE:
				setRolefournis_security_database((RoleFournis_Security_Database)newValue);
				return;
			case FonctionServeurPackage.GLUE_SERVEUR4__ROLEREQUIS_SECURITY_DATABASE:
				setRolerequis_security_database((RoleRequis_Security_Database)newValue);
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
			case FonctionServeurPackage.GLUE_SERVEUR4__ROLEFOURNIS_SECURITY_DATABASE:
				setRolefournis_security_database((RoleFournis_Security_Database)null);
				return;
			case FonctionServeurPackage.GLUE_SERVEUR4__ROLEREQUIS_SECURITY_DATABASE:
				setRolerequis_security_database((RoleRequis_Security_Database)null);
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
			case FonctionServeurPackage.GLUE_SERVEUR4__ROLEFOURNIS_SECURITY_DATABASE:
				return rolefournis_security_database != null;
			case FonctionServeurPackage.GLUE_SERVEUR4__ROLEREQUIS_SECURITY_DATABASE:
				return rolerequis_security_database != null;
		}
		return super.eIsSet(featureID);
	}

} //GlueServeur4Impl
