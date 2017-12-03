/**
 */
package systeme.FonctionServeur.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projecttArchitectural.impl.AttachmentsRequisFournisImpl;

import systeme.FonctionServeur.FonctionServeurPackage;
import systeme.FonctionServeur.PortRequis_database_Security;
import systeme.FonctionServeur.RoleFournis_Security_Database;
import systeme.FonctionServeur.attachment_Database_Requis_role_Security_fournis;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>attachment Database Requis role Security fournis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.FonctionServeur.impl.attachment_Database_Requis_role_Security_fournisImpl#getPortrequis_database_security <em>Portrequis database security</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.attachment_Database_Requis_role_Security_fournisImpl#getRolefournis_security_database <em>Rolefournis security database</em>}</li>
 * </ul>
 *
 * @generated
 */
public class attachment_Database_Requis_role_Security_fournisImpl extends AttachmentsRequisFournisImpl implements attachment_Database_Requis_role_Security_fournis {
	/**
	 * The cached value of the '{@link #getPortrequis_database_security() <em>Portrequis database security</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrequis_database_security()
	 * @generated
	 * @ordered
	 */
	protected PortRequis_database_Security portrequis_database_security;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected attachment_Database_Requis_role_Security_fournisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FonctionServeurPackage.Literals.ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequis_database_Security getPortrequis_database_security() {
		if (portrequis_database_security != null && portrequis_database_security.eIsProxy()) {
			InternalEObject oldPortrequis_database_security = (InternalEObject)portrequis_database_security;
			portrequis_database_security = (PortRequis_database_Security)eResolveProxy(oldPortrequis_database_security);
			if (portrequis_database_security != oldPortrequis_database_security) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS__PORTREQUIS_DATABASE_SECURITY, oldPortrequis_database_security, portrequis_database_security));
			}
		}
		return portrequis_database_security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequis_database_Security basicGetPortrequis_database_security() {
		return portrequis_database_security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortrequis_database_security(PortRequis_database_Security newPortrequis_database_security) {
		PortRequis_database_Security oldPortrequis_database_security = portrequis_database_security;
		portrequis_database_security = newPortrequis_database_security;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS__PORTREQUIS_DATABASE_SECURITY, oldPortrequis_database_security, portrequis_database_security));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS__ROLEFOURNIS_SECURITY_DATABASE, oldRolefournis_security_database, rolefournis_security_database));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS__ROLEFOURNIS_SECURITY_DATABASE, oldRolefournis_security_database, rolefournis_security_database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FonctionServeurPackage.ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS__PORTREQUIS_DATABASE_SECURITY:
				if (resolve) return getPortrequis_database_security();
				return basicGetPortrequis_database_security();
			case FonctionServeurPackage.ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS__ROLEFOURNIS_SECURITY_DATABASE:
				if (resolve) return getRolefournis_security_database();
				return basicGetRolefournis_security_database();
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
			case FonctionServeurPackage.ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS__PORTREQUIS_DATABASE_SECURITY:
				setPortrequis_database_security((PortRequis_database_Security)newValue);
				return;
			case FonctionServeurPackage.ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS__ROLEFOURNIS_SECURITY_DATABASE:
				setRolefournis_security_database((RoleFournis_Security_Database)newValue);
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
			case FonctionServeurPackage.ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS__PORTREQUIS_DATABASE_SECURITY:
				setPortrequis_database_security((PortRequis_database_Security)null);
				return;
			case FonctionServeurPackage.ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS__ROLEFOURNIS_SECURITY_DATABASE:
				setRolefournis_security_database((RoleFournis_Security_Database)null);
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
			case FonctionServeurPackage.ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS__PORTREQUIS_DATABASE_SECURITY:
				return portrequis_database_security != null;
			case FonctionServeurPackage.ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS__ROLEFOURNIS_SECURITY_DATABASE:
				return rolefournis_security_database != null;
		}
		return super.eIsSet(featureID);
	}

} //attachment_Database_Requis_role_Security_fournisImpl
