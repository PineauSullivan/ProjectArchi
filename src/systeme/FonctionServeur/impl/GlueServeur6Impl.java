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
import systeme.FonctionServeur.RoleFournis_Database_Security;
import systeme.FonctionServeur.RoleRequis_Database_Security;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glue Serveur6</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.FonctionServeur.impl.GlueServeur6Impl#getRolefournis_database_security <em>Rolefournis database security</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.GlueServeur6Impl#getRolerequis_database_security <em>Rolerequis database security</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlueServeur6Impl extends GlueImpl implements Glue {
	/**
	 * The cached value of the '{@link #getRolefournis_database_security() <em>Rolefournis database security</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolefournis_database_security()
	 * @generated
	 * @ordered
	 */
	protected RoleFournis_Database_Security rolefournis_database_security;

	/**
	 * The cached value of the '{@link #getRolerequis_database_security() <em>Rolerequis database security</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolerequis_database_security()
	 * @generated
	 * @ordered
	 */
	protected RoleRequis_Database_Security rolerequis_database_security;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlueServeur6Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FonctionServeurPackage.Literals.GLUE_SERVEUR6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFournis_Database_Security getRolefournis_database_security() {
		if (rolefournis_database_security != null && rolefournis_database_security.eIsProxy()) {
			InternalEObject oldRolefournis_database_security = (InternalEObject)rolefournis_database_security;
			rolefournis_database_security = (RoleFournis_Database_Security)eResolveProxy(oldRolefournis_database_security);
			if (rolefournis_database_security != oldRolefournis_database_security) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.GLUE_SERVEUR6__ROLEFOURNIS_DATABASE_SECURITY, oldRolefournis_database_security, rolefournis_database_security));
			}
		}
		return rolefournis_database_security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFournis_Database_Security basicGetRolefournis_database_security() {
		return rolefournis_database_security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolefournis_database_security(RoleFournis_Database_Security newRolefournis_database_security) {
		RoleFournis_Database_Security oldRolefournis_database_security = rolefournis_database_security;
		rolefournis_database_security = newRolefournis_database_security;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.GLUE_SERVEUR6__ROLEFOURNIS_DATABASE_SECURITY, oldRolefournis_database_security, rolefournis_database_security));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis_Database_Security getRolerequis_database_security() {
		if (rolerequis_database_security != null && rolerequis_database_security.eIsProxy()) {
			InternalEObject oldRolerequis_database_security = (InternalEObject)rolerequis_database_security;
			rolerequis_database_security = (RoleRequis_Database_Security)eResolveProxy(oldRolerequis_database_security);
			if (rolerequis_database_security != oldRolerequis_database_security) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.GLUE_SERVEUR6__ROLEREQUIS_DATABASE_SECURITY, oldRolerequis_database_security, rolerequis_database_security));
			}
		}
		return rolerequis_database_security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis_Database_Security basicGetRolerequis_database_security() {
		return rolerequis_database_security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolerequis_database_security(RoleRequis_Database_Security newRolerequis_database_security) {
		RoleRequis_Database_Security oldRolerequis_database_security = rolerequis_database_security;
		rolerequis_database_security = newRolerequis_database_security;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.GLUE_SERVEUR6__ROLEREQUIS_DATABASE_SECURITY, oldRolerequis_database_security, rolerequis_database_security));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FonctionServeurPackage.GLUE_SERVEUR6__ROLEFOURNIS_DATABASE_SECURITY:
				if (resolve) return getRolefournis_database_security();
				return basicGetRolefournis_database_security();
			case FonctionServeurPackage.GLUE_SERVEUR6__ROLEREQUIS_DATABASE_SECURITY:
				if (resolve) return getRolerequis_database_security();
				return basicGetRolerequis_database_security();
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
			case FonctionServeurPackage.GLUE_SERVEUR6__ROLEFOURNIS_DATABASE_SECURITY:
				setRolefournis_database_security((RoleFournis_Database_Security)newValue);
				return;
			case FonctionServeurPackage.GLUE_SERVEUR6__ROLEREQUIS_DATABASE_SECURITY:
				setRolerequis_database_security((RoleRequis_Database_Security)newValue);
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
			case FonctionServeurPackage.GLUE_SERVEUR6__ROLEFOURNIS_DATABASE_SECURITY:
				setRolefournis_database_security((RoleFournis_Database_Security)null);
				return;
			case FonctionServeurPackage.GLUE_SERVEUR6__ROLEREQUIS_DATABASE_SECURITY:
				setRolerequis_database_security((RoleRequis_Database_Security)null);
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
			case FonctionServeurPackage.GLUE_SERVEUR6__ROLEFOURNIS_DATABASE_SECURITY:
				return rolefournis_database_security != null;
			case FonctionServeurPackage.GLUE_SERVEUR6__ROLEREQUIS_DATABASE_SECURITY:
				return rolerequis_database_security != null;
		}
		return super.eIsSet(featureID);
	}

} //GlueServeur6Impl
