/**
 */
package systeme.FonctionServeur.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projecttArchitectural.impl.AttachmentsRequisFournisImpl;

import systeme.FonctionServeur.FonctionServeurPackage;
import systeme.FonctionServeur.PortRequis_Security_Database;
import systeme.FonctionServeur.RoleFournis_Database_Security;
import systeme.FonctionServeur.attachment_Security_Requis_role_Database_fournis;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>attachment Security Requis role Database fournis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.FonctionServeur.impl.attachment_Security_Requis_role_Database_fournisImpl#getPortrequis_security_database <em>Portrequis security database</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.attachment_Security_Requis_role_Database_fournisImpl#getRolefournis_database_security <em>Rolefournis database security</em>}</li>
 * </ul>
 *
 * @generated
 */
public class attachment_Security_Requis_role_Database_fournisImpl extends AttachmentsRequisFournisImpl implements attachment_Security_Requis_role_Database_fournis {
	/**
	 * The cached value of the '{@link #getPortrequis_security_database() <em>Portrequis security database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrequis_security_database()
	 * @generated
	 * @ordered
	 */
	protected PortRequis_Security_Database portrequis_security_database;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected attachment_Security_Requis_role_Database_fournisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FonctionServeurPackage.Literals.ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequis_Security_Database getPortrequis_security_database() {
		if (portrequis_security_database != null && portrequis_security_database.eIsProxy()) {
			InternalEObject oldPortrequis_security_database = (InternalEObject)portrequis_security_database;
			portrequis_security_database = (PortRequis_Security_Database)eResolveProxy(oldPortrequis_security_database);
			if (portrequis_security_database != oldPortrequis_security_database) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS__PORTREQUIS_SECURITY_DATABASE, oldPortrequis_security_database, portrequis_security_database));
			}
		}
		return portrequis_security_database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequis_Security_Database basicGetPortrequis_security_database() {
		return portrequis_security_database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortrequis_security_database(PortRequis_Security_Database newPortrequis_security_database) {
		PortRequis_Security_Database oldPortrequis_security_database = portrequis_security_database;
		portrequis_security_database = newPortrequis_security_database;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS__PORTREQUIS_SECURITY_DATABASE, oldPortrequis_security_database, portrequis_security_database));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS__ROLEFOURNIS_DATABASE_SECURITY, oldRolefournis_database_security, rolefournis_database_security));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS__ROLEFOURNIS_DATABASE_SECURITY, oldRolefournis_database_security, rolefournis_database_security));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FonctionServeurPackage.ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS__PORTREQUIS_SECURITY_DATABASE:
				if (resolve) return getPortrequis_security_database();
				return basicGetPortrequis_security_database();
			case FonctionServeurPackage.ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS__ROLEFOURNIS_DATABASE_SECURITY:
				if (resolve) return getRolefournis_database_security();
				return basicGetRolefournis_database_security();
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
			case FonctionServeurPackage.ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS__PORTREQUIS_SECURITY_DATABASE:
				setPortrequis_security_database((PortRequis_Security_Database)newValue);
				return;
			case FonctionServeurPackage.ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS__ROLEFOURNIS_DATABASE_SECURITY:
				setRolefournis_database_security((RoleFournis_Database_Security)newValue);
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
			case FonctionServeurPackage.ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS__PORTREQUIS_SECURITY_DATABASE:
				setPortrequis_security_database((PortRequis_Security_Database)null);
				return;
			case FonctionServeurPackage.ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS__ROLEFOURNIS_DATABASE_SECURITY:
				setRolefournis_database_security((RoleFournis_Database_Security)null);
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
			case FonctionServeurPackage.ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS__PORTREQUIS_SECURITY_DATABASE:
				return portrequis_security_database != null;
			case FonctionServeurPackage.ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS__ROLEFOURNIS_DATABASE_SECURITY:
				return rolefournis_database_security != null;
		}
		return super.eIsSet(featureID);
	}

} //attachment_Security_Requis_role_Database_fournisImpl
