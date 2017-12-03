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
import systeme.FonctionServeur.RoleFournis_ConnectionManager_Security;
import systeme.FonctionServeur.RoleRequis_ConnectionManager_Security;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glue Serveur2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.FonctionServeur.impl.GlueServeur2Impl#getRolefournis_connectionmanager_security <em>Rolefournis connectionmanager security</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.GlueServeur2Impl#getRolerequis_connectionmanager_security <em>Rolerequis connectionmanager security</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlueServeur2Impl extends GlueImpl implements Glue {
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
	 * The cached value of the '{@link #getRolerequis_connectionmanager_security() <em>Rolerequis connectionmanager security</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolerequis_connectionmanager_security()
	 * @generated
	 * @ordered
	 */
	protected RoleRequis_ConnectionManager_Security rolerequis_connectionmanager_security;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlueServeur2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FonctionServeurPackage.Literals.GLUE_SERVEUR2;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.GLUE_SERVEUR2__ROLEFOURNIS_CONNECTIONMANAGER_SECURITY, oldRolefournis_connectionmanager_security, rolefournis_connectionmanager_security));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.GLUE_SERVEUR2__ROLEFOURNIS_CONNECTIONMANAGER_SECURITY, oldRolefournis_connectionmanager_security, rolefournis_connectionmanager_security));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis_ConnectionManager_Security getRolerequis_connectionmanager_security() {
		if (rolerequis_connectionmanager_security != null && rolerequis_connectionmanager_security.eIsProxy()) {
			InternalEObject oldRolerequis_connectionmanager_security = (InternalEObject)rolerequis_connectionmanager_security;
			rolerequis_connectionmanager_security = (RoleRequis_ConnectionManager_Security)eResolveProxy(oldRolerequis_connectionmanager_security);
			if (rolerequis_connectionmanager_security != oldRolerequis_connectionmanager_security) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.GLUE_SERVEUR2__ROLEREQUIS_CONNECTIONMANAGER_SECURITY, oldRolerequis_connectionmanager_security, rolerequis_connectionmanager_security));
			}
		}
		return rolerequis_connectionmanager_security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis_ConnectionManager_Security basicGetRolerequis_connectionmanager_security() {
		return rolerequis_connectionmanager_security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolerequis_connectionmanager_security(RoleRequis_ConnectionManager_Security newRolerequis_connectionmanager_security) {
		RoleRequis_ConnectionManager_Security oldRolerequis_connectionmanager_security = rolerequis_connectionmanager_security;
		rolerequis_connectionmanager_security = newRolerequis_connectionmanager_security;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.GLUE_SERVEUR2__ROLEREQUIS_CONNECTIONMANAGER_SECURITY, oldRolerequis_connectionmanager_security, rolerequis_connectionmanager_security));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FonctionServeurPackage.GLUE_SERVEUR2__ROLEFOURNIS_CONNECTIONMANAGER_SECURITY:
				if (resolve) return getRolefournis_connectionmanager_security();
				return basicGetRolefournis_connectionmanager_security();
			case FonctionServeurPackage.GLUE_SERVEUR2__ROLEREQUIS_CONNECTIONMANAGER_SECURITY:
				if (resolve) return getRolerequis_connectionmanager_security();
				return basicGetRolerequis_connectionmanager_security();
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
			case FonctionServeurPackage.GLUE_SERVEUR2__ROLEFOURNIS_CONNECTIONMANAGER_SECURITY:
				setRolefournis_connectionmanager_security((RoleFournis_ConnectionManager_Security)newValue);
				return;
			case FonctionServeurPackage.GLUE_SERVEUR2__ROLEREQUIS_CONNECTIONMANAGER_SECURITY:
				setRolerequis_connectionmanager_security((RoleRequis_ConnectionManager_Security)newValue);
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
			case FonctionServeurPackage.GLUE_SERVEUR2__ROLEFOURNIS_CONNECTIONMANAGER_SECURITY:
				setRolefournis_connectionmanager_security((RoleFournis_ConnectionManager_Security)null);
				return;
			case FonctionServeurPackage.GLUE_SERVEUR2__ROLEREQUIS_CONNECTIONMANAGER_SECURITY:
				setRolerequis_connectionmanager_security((RoleRequis_ConnectionManager_Security)null);
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
			case FonctionServeurPackage.GLUE_SERVEUR2__ROLEFOURNIS_CONNECTIONMANAGER_SECURITY:
				return rolefournis_connectionmanager_security != null;
			case FonctionServeurPackage.GLUE_SERVEUR2__ROLEREQUIS_CONNECTIONMANAGER_SECURITY:
				return rolerequis_connectionmanager_security != null;
		}
		return super.eIsSet(featureID);
	}

} //GlueServeur2Impl
