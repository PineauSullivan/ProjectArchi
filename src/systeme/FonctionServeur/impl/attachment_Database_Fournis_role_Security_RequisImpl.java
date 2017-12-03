/**
 */
package systeme.FonctionServeur.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projecttArchitectural.impl.AttachmentFournisRequisImpl;

import systeme.FonctionServeur.FonctionServeurPackage;
import systeme.FonctionServeur.PortFournis_database_Security;
import systeme.FonctionServeur.RoleRequis_Security_Database;
import systeme.FonctionServeur.attachment_Database_Fournis_role_Security_Requis;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>attachment Database Fournis role Security Requis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.FonctionServeur.impl.attachment_Database_Fournis_role_Security_RequisImpl#getPortfournis_database_security <em>Portfournis database security</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.attachment_Database_Fournis_role_Security_RequisImpl#getRolerequis_security_database <em>Rolerequis security database</em>}</li>
 * </ul>
 *
 * @generated
 */
public class attachment_Database_Fournis_role_Security_RequisImpl extends AttachmentFournisRequisImpl implements attachment_Database_Fournis_role_Security_Requis {
	/**
	 * The cached value of the '{@link #getPortfournis_database_security() <em>Portfournis database security</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortfournis_database_security()
	 * @generated
	 * @ordered
	 */
	protected PortFournis_database_Security portfournis_database_security;

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
	protected attachment_Database_Fournis_role_Security_RequisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FonctionServeurPackage.Literals.ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFournis_database_Security getPortfournis_database_security() {
		if (portfournis_database_security != null && portfournis_database_security.eIsProxy()) {
			InternalEObject oldPortfournis_database_security = (InternalEObject)portfournis_database_security;
			portfournis_database_security = (PortFournis_database_Security)eResolveProxy(oldPortfournis_database_security);
			if (portfournis_database_security != oldPortfournis_database_security) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS__PORTFOURNIS_DATABASE_SECURITY, oldPortfournis_database_security, portfournis_database_security));
			}
		}
		return portfournis_database_security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFournis_database_Security basicGetPortfournis_database_security() {
		return portfournis_database_security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortfournis_database_security(PortFournis_database_Security newPortfournis_database_security) {
		PortFournis_database_Security oldPortfournis_database_security = portfournis_database_security;
		portfournis_database_security = newPortfournis_database_security;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS__PORTFOURNIS_DATABASE_SECURITY, oldPortfournis_database_security, portfournis_database_security));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS__ROLEREQUIS_SECURITY_DATABASE, oldRolerequis_security_database, rolerequis_security_database));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS__ROLEREQUIS_SECURITY_DATABASE, oldRolerequis_security_database, rolerequis_security_database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FonctionServeurPackage.ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS__PORTFOURNIS_DATABASE_SECURITY:
				if (resolve) return getPortfournis_database_security();
				return basicGetPortfournis_database_security();
			case FonctionServeurPackage.ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS__ROLEREQUIS_SECURITY_DATABASE:
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
			case FonctionServeurPackage.ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS__PORTFOURNIS_DATABASE_SECURITY:
				setPortfournis_database_security((PortFournis_database_Security)newValue);
				return;
			case FonctionServeurPackage.ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS__ROLEREQUIS_SECURITY_DATABASE:
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
			case FonctionServeurPackage.ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS__PORTFOURNIS_DATABASE_SECURITY:
				setPortfournis_database_security((PortFournis_database_Security)null);
				return;
			case FonctionServeurPackage.ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS__ROLEREQUIS_SECURITY_DATABASE:
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
			case FonctionServeurPackage.ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS__PORTFOURNIS_DATABASE_SECURITY:
				return portfournis_database_security != null;
			case FonctionServeurPackage.ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS__ROLEREQUIS_SECURITY_DATABASE:
				return rolerequis_security_database != null;
		}
		return super.eIsSet(featureID);
	}

} //attachment_Database_Fournis_role_Security_RequisImpl
