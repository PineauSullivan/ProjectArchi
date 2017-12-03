/**
 */
package systeme.FonctionServeur.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projecttArchitectural.impl.AttachmentFournisRequisImpl;

import systeme.FonctionServeur.FonctionServeurPackage;
import systeme.FonctionServeur.PortFournis_Security_Database;
import systeme.FonctionServeur.RoleRequis_Database_Security;
import systeme.FonctionServeur.attachment_Security_Fournis_role_Database_Requis;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>attachment Security Fournis role Database Requis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.FonctionServeur.impl.attachment_Security_Fournis_role_Database_RequisImpl#getRolerequis_database_security <em>Rolerequis database security</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.attachment_Security_Fournis_role_Database_RequisImpl#getPortfournis_security_database <em>Portfournis security database</em>}</li>
 * </ul>
 *
 * @generated
 */
public class attachment_Security_Fournis_role_Database_RequisImpl extends AttachmentFournisRequisImpl implements attachment_Security_Fournis_role_Database_Requis {
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
	 * The cached value of the '{@link #getPortfournis_security_database() <em>Portfournis security database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortfournis_security_database()
	 * @generated
	 * @ordered
	 */
	protected PortFournis_Security_Database portfournis_security_database;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected attachment_Security_Fournis_role_Database_RequisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FonctionServeurPackage.Literals.ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS__ROLEREQUIS_DATABASE_SECURITY, oldRolerequis_database_security, rolerequis_database_security));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS__ROLEREQUIS_DATABASE_SECURITY, oldRolerequis_database_security, rolerequis_database_security));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFournis_Security_Database getPortfournis_security_database() {
		if (portfournis_security_database != null && portfournis_security_database.eIsProxy()) {
			InternalEObject oldPortfournis_security_database = (InternalEObject)portfournis_security_database;
			portfournis_security_database = (PortFournis_Security_Database)eResolveProxy(oldPortfournis_security_database);
			if (portfournis_security_database != oldPortfournis_security_database) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS__PORTFOURNIS_SECURITY_DATABASE, oldPortfournis_security_database, portfournis_security_database));
			}
		}
		return portfournis_security_database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFournis_Security_Database basicGetPortfournis_security_database() {
		return portfournis_security_database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortfournis_security_database(PortFournis_Security_Database newPortfournis_security_database) {
		PortFournis_Security_Database oldPortfournis_security_database = portfournis_security_database;
		portfournis_security_database = newPortfournis_security_database;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS__PORTFOURNIS_SECURITY_DATABASE, oldPortfournis_security_database, portfournis_security_database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FonctionServeurPackage.ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS__ROLEREQUIS_DATABASE_SECURITY:
				if (resolve) return getRolerequis_database_security();
				return basicGetRolerequis_database_security();
			case FonctionServeurPackage.ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS__PORTFOURNIS_SECURITY_DATABASE:
				if (resolve) return getPortfournis_security_database();
				return basicGetPortfournis_security_database();
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
			case FonctionServeurPackage.ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS__ROLEREQUIS_DATABASE_SECURITY:
				setRolerequis_database_security((RoleRequis_Database_Security)newValue);
				return;
			case FonctionServeurPackage.ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS__PORTFOURNIS_SECURITY_DATABASE:
				setPortfournis_security_database((PortFournis_Security_Database)newValue);
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
			case FonctionServeurPackage.ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS__ROLEREQUIS_DATABASE_SECURITY:
				setRolerequis_database_security((RoleRequis_Database_Security)null);
				return;
			case FonctionServeurPackage.ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS__PORTFOURNIS_SECURITY_DATABASE:
				setPortfournis_security_database((PortFournis_Security_Database)null);
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
			case FonctionServeurPackage.ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS__ROLEREQUIS_DATABASE_SECURITY:
				return rolerequis_database_security != null;
			case FonctionServeurPackage.ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS__PORTFOURNIS_SECURITY_DATABASE:
				return portfournis_security_database != null;
		}
		return super.eIsSet(featureID);
	}

} //attachment_Security_Fournis_role_Database_RequisImpl
