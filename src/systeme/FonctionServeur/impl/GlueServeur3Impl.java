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
import systeme.FonctionServeur.RoleFournis_Security_Connection;
import systeme.FonctionServeur.RoleRequis_Security_Connection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glue Serveur3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.FonctionServeur.impl.GlueServeur3Impl#getRolefournis_security_connection <em>Rolefournis security connection</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.GlueServeur3Impl#getRolerequis_security_connection <em>Rolerequis security connection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlueServeur3Impl extends GlueImpl implements Glue {
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
	protected GlueServeur3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FonctionServeurPackage.Literals.GLUE_SERVEUR3;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.GLUE_SERVEUR3__ROLEFOURNIS_SECURITY_CONNECTION, oldRolefournis_security_connection, rolefournis_security_connection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.GLUE_SERVEUR3__ROLEFOURNIS_SECURITY_CONNECTION, oldRolefournis_security_connection, rolefournis_security_connection));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.GLUE_SERVEUR3__ROLEREQUIS_SECURITY_CONNECTION, oldRolerequis_security_connection, rolerequis_security_connection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.GLUE_SERVEUR3__ROLEREQUIS_SECURITY_CONNECTION, oldRolerequis_security_connection, rolerequis_security_connection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FonctionServeurPackage.GLUE_SERVEUR3__ROLEFOURNIS_SECURITY_CONNECTION:
				if (resolve) return getRolefournis_security_connection();
				return basicGetRolefournis_security_connection();
			case FonctionServeurPackage.GLUE_SERVEUR3__ROLEREQUIS_SECURITY_CONNECTION:
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
			case FonctionServeurPackage.GLUE_SERVEUR3__ROLEFOURNIS_SECURITY_CONNECTION:
				setRolefournis_security_connection((RoleFournis_Security_Connection)newValue);
				return;
			case FonctionServeurPackage.GLUE_SERVEUR3__ROLEREQUIS_SECURITY_CONNECTION:
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
			case FonctionServeurPackage.GLUE_SERVEUR3__ROLEFOURNIS_SECURITY_CONNECTION:
				setRolefournis_security_connection((RoleFournis_Security_Connection)null);
				return;
			case FonctionServeurPackage.GLUE_SERVEUR3__ROLEREQUIS_SECURITY_CONNECTION:
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
			case FonctionServeurPackage.GLUE_SERVEUR3__ROLEFOURNIS_SECURITY_CONNECTION:
				return rolefournis_security_connection != null;
			case FonctionServeurPackage.GLUE_SERVEUR3__ROLEREQUIS_SECURITY_CONNECTION:
				return rolerequis_security_connection != null;
		}
		return super.eIsSet(featureID);
	}

} //GlueServeur3Impl
