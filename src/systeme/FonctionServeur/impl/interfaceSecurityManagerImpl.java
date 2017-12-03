/**
 */
package systeme.FonctionServeur.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projecttArchitectural.impl.InterfaceComposantsImpl;

import systeme.FonctionServeur.FonctionServeurPackage;
import systeme.FonctionServeur.PortFournis_Security_Connection;
import systeme.FonctionServeur.PortFournis_Security_Database;
import systeme.FonctionServeur.PortRequis_Security_Connection;
import systeme.FonctionServeur.PortRequis_Security_Database;
import systeme.FonctionServeur.interfaceSecurityManager;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>interface Security Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.FonctionServeur.impl.interfaceSecurityManagerImpl#getPortfournis_security_connection <em>Portfournis security connection</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.interfaceSecurityManagerImpl#getPortrequis_security_connection <em>Portrequis security connection</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.interfaceSecurityManagerImpl#getPortfournis_security_database <em>Portfournis security database</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.interfaceSecurityManagerImpl#getPortrequis_security_database <em>Portrequis security database</em>}</li>
 * </ul>
 *
 * @generated
 */
public class interfaceSecurityManagerImpl extends InterfaceComposantsImpl implements interfaceSecurityManager {
	/**
	 * The cached value of the '{@link #getPortfournis_security_connection() <em>Portfournis security connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortfournis_security_connection()
	 * @generated
	 * @ordered
	 */
	protected PortFournis_Security_Connection portfournis_security_connection;

	/**
	 * The cached value of the '{@link #getPortrequis_security_connection() <em>Portrequis security connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrequis_security_connection()
	 * @generated
	 * @ordered
	 */
	protected PortRequis_Security_Connection portrequis_security_connection;

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
	 * The cached value of the '{@link #getPortrequis_security_database() <em>Portrequis security database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrequis_security_database()
	 * @generated
	 * @ordered
	 */
	protected PortRequis_Security_Database portrequis_security_database;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected interfaceSecurityManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FonctionServeurPackage.Literals.INTERFACE_SECURITY_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFournis_Security_Connection getPortfournis_security_connection() {
		if (portfournis_security_connection != null && portfournis_security_connection.eIsProxy()) {
			InternalEObject oldPortfournis_security_connection = (InternalEObject)portfournis_security_connection;
			portfournis_security_connection = (PortFournis_Security_Connection)eResolveProxy(oldPortfournis_security_connection);
			if (portfournis_security_connection != oldPortfournis_security_connection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.INTERFACE_SECURITY_MANAGER__PORTFOURNIS_SECURITY_CONNECTION, oldPortfournis_security_connection, portfournis_security_connection));
			}
		}
		return portfournis_security_connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFournis_Security_Connection basicGetPortfournis_security_connection() {
		return portfournis_security_connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortfournis_security_connection(PortFournis_Security_Connection newPortfournis_security_connection) {
		PortFournis_Security_Connection oldPortfournis_security_connection = portfournis_security_connection;
		portfournis_security_connection = newPortfournis_security_connection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.INTERFACE_SECURITY_MANAGER__PORTFOURNIS_SECURITY_CONNECTION, oldPortfournis_security_connection, portfournis_security_connection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequis_Security_Connection getPortrequis_security_connection() {
		if (portrequis_security_connection != null && portrequis_security_connection.eIsProxy()) {
			InternalEObject oldPortrequis_security_connection = (InternalEObject)portrequis_security_connection;
			portrequis_security_connection = (PortRequis_Security_Connection)eResolveProxy(oldPortrequis_security_connection);
			if (portrequis_security_connection != oldPortrequis_security_connection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.INTERFACE_SECURITY_MANAGER__PORTREQUIS_SECURITY_CONNECTION, oldPortrequis_security_connection, portrequis_security_connection));
			}
		}
		return portrequis_security_connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequis_Security_Connection basicGetPortrequis_security_connection() {
		return portrequis_security_connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortrequis_security_connection(PortRequis_Security_Connection newPortrequis_security_connection) {
		PortRequis_Security_Connection oldPortrequis_security_connection = portrequis_security_connection;
		portrequis_security_connection = newPortrequis_security_connection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.INTERFACE_SECURITY_MANAGER__PORTREQUIS_SECURITY_CONNECTION, oldPortrequis_security_connection, portrequis_security_connection));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.INTERFACE_SECURITY_MANAGER__PORTFOURNIS_SECURITY_DATABASE, oldPortfournis_security_database, portfournis_security_database));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.INTERFACE_SECURITY_MANAGER__PORTFOURNIS_SECURITY_DATABASE, oldPortfournis_security_database, portfournis_security_database));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.INTERFACE_SECURITY_MANAGER__PORTREQUIS_SECURITY_DATABASE, oldPortrequis_security_database, portrequis_security_database));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.INTERFACE_SECURITY_MANAGER__PORTREQUIS_SECURITY_DATABASE, oldPortrequis_security_database, portrequis_security_database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FonctionServeurPackage.INTERFACE_SECURITY_MANAGER__PORTFOURNIS_SECURITY_CONNECTION:
				if (resolve) return getPortfournis_security_connection();
				return basicGetPortfournis_security_connection();
			case FonctionServeurPackage.INTERFACE_SECURITY_MANAGER__PORTREQUIS_SECURITY_CONNECTION:
				if (resolve) return getPortrequis_security_connection();
				return basicGetPortrequis_security_connection();
			case FonctionServeurPackage.INTERFACE_SECURITY_MANAGER__PORTFOURNIS_SECURITY_DATABASE:
				if (resolve) return getPortfournis_security_database();
				return basicGetPortfournis_security_database();
			case FonctionServeurPackage.INTERFACE_SECURITY_MANAGER__PORTREQUIS_SECURITY_DATABASE:
				if (resolve) return getPortrequis_security_database();
				return basicGetPortrequis_security_database();
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
			case FonctionServeurPackage.INTERFACE_SECURITY_MANAGER__PORTFOURNIS_SECURITY_CONNECTION:
				setPortfournis_security_connection((PortFournis_Security_Connection)newValue);
				return;
			case FonctionServeurPackage.INTERFACE_SECURITY_MANAGER__PORTREQUIS_SECURITY_CONNECTION:
				setPortrequis_security_connection((PortRequis_Security_Connection)newValue);
				return;
			case FonctionServeurPackage.INTERFACE_SECURITY_MANAGER__PORTFOURNIS_SECURITY_DATABASE:
				setPortfournis_security_database((PortFournis_Security_Database)newValue);
				return;
			case FonctionServeurPackage.INTERFACE_SECURITY_MANAGER__PORTREQUIS_SECURITY_DATABASE:
				setPortrequis_security_database((PortRequis_Security_Database)newValue);
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
			case FonctionServeurPackage.INTERFACE_SECURITY_MANAGER__PORTFOURNIS_SECURITY_CONNECTION:
				setPortfournis_security_connection((PortFournis_Security_Connection)null);
				return;
			case FonctionServeurPackage.INTERFACE_SECURITY_MANAGER__PORTREQUIS_SECURITY_CONNECTION:
				setPortrequis_security_connection((PortRequis_Security_Connection)null);
				return;
			case FonctionServeurPackage.INTERFACE_SECURITY_MANAGER__PORTFOURNIS_SECURITY_DATABASE:
				setPortfournis_security_database((PortFournis_Security_Database)null);
				return;
			case FonctionServeurPackage.INTERFACE_SECURITY_MANAGER__PORTREQUIS_SECURITY_DATABASE:
				setPortrequis_security_database((PortRequis_Security_Database)null);
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
			case FonctionServeurPackage.INTERFACE_SECURITY_MANAGER__PORTFOURNIS_SECURITY_CONNECTION:
				return portfournis_security_connection != null;
			case FonctionServeurPackage.INTERFACE_SECURITY_MANAGER__PORTREQUIS_SECURITY_CONNECTION:
				return portrequis_security_connection != null;
			case FonctionServeurPackage.INTERFACE_SECURITY_MANAGER__PORTFOURNIS_SECURITY_DATABASE:
				return portfournis_security_database != null;
			case FonctionServeurPackage.INTERFACE_SECURITY_MANAGER__PORTREQUIS_SECURITY_DATABASE:
				return portrequis_security_database != null;
		}
		return super.eIsSet(featureID);
	}

} //interfaceSecurityManagerImpl
