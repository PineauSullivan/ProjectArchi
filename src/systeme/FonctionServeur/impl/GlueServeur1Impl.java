/**
 */
package systeme.FonctionServeur.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projecttArchitectural.Glue;

import projecttArchitectural.RoleConnecteursFournis;
import projecttArchitectural.RoleConnecteursRequis;
import projecttArchitectural.impl.GlueImpl;

import systeme.FonctionServeur.FonctionServeurPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glue Serveur1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.FonctionServeur.impl.GlueServeur1Impl#getRolefournis_connectionmanager_database <em>Rolefournis connectionmanager database</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.GlueServeur1Impl#getRolerequis_connectionmanager_database <em>Rolerequis connectionmanager database</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlueServeur1Impl extends GlueImpl implements Glue {
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
	protected GlueServeur1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FonctionServeurPackage.Literals.GLUE_SERVEUR1;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.GLUE_SERVEUR1__ROLEFOURNIS_CONNECTIONMANAGER_DATABASE, oldRolefournis_connectionmanager_database, rolefournis_connectionmanager_database));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.GLUE_SERVEUR1__ROLEFOURNIS_CONNECTIONMANAGER_DATABASE, oldRolefournis_connectionmanager_database, rolefournis_connectionmanager_database));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.GLUE_SERVEUR1__ROLEREQUIS_CONNECTIONMANAGER_DATABASE, oldRolerequis_connectionmanager_database, rolerequis_connectionmanager_database));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.GLUE_SERVEUR1__ROLEREQUIS_CONNECTIONMANAGER_DATABASE, oldRolerequis_connectionmanager_database, rolerequis_connectionmanager_database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FonctionServeurPackage.GLUE_SERVEUR1__ROLEFOURNIS_CONNECTIONMANAGER_DATABASE:
				if (resolve) return getRolefournis_connectionmanager_database();
				return basicGetRolefournis_connectionmanager_database();
			case FonctionServeurPackage.GLUE_SERVEUR1__ROLEREQUIS_CONNECTIONMANAGER_DATABASE:
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
			case FonctionServeurPackage.GLUE_SERVEUR1__ROLEFOURNIS_CONNECTIONMANAGER_DATABASE:
				setRolefournis_connectionmanager_database((RoleConnecteursFournis)newValue);
				return;
			case FonctionServeurPackage.GLUE_SERVEUR1__ROLEREQUIS_CONNECTIONMANAGER_DATABASE:
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
			case FonctionServeurPackage.GLUE_SERVEUR1__ROLEFOURNIS_CONNECTIONMANAGER_DATABASE:
				setRolefournis_connectionmanager_database((RoleConnecteursFournis)null);
				return;
			case FonctionServeurPackage.GLUE_SERVEUR1__ROLEREQUIS_CONNECTIONMANAGER_DATABASE:
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
			case FonctionServeurPackage.GLUE_SERVEUR1__ROLEFOURNIS_CONNECTIONMANAGER_DATABASE:
				return rolefournis_connectionmanager_database != null;
			case FonctionServeurPackage.GLUE_SERVEUR1__ROLEREQUIS_CONNECTIONMANAGER_DATABASE:
				return rolerequis_connectionmanager_database != null;
		}
		return super.eIsSet(featureID);
	}

} //GlueServeur1Impl
