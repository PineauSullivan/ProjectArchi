/**
 */
package systeme.FonctionServeur.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projecttArchitectural.impl.InterfaceComposantsImpl;

import systeme.FonctionServeur.FonctionServeurPackage;
import systeme.FonctionServeur.InterfaceDatabase;
import systeme.FonctionServeur.PortFournis_database_Connection;
import systeme.FonctionServeur.PortFournis_database_Security;
import systeme.FonctionServeur.PortRequis_database_Connection;
import systeme.FonctionServeur.PortRequis_database_Security;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.FonctionServeur.impl.InterfaceDatabaseImpl#getPortfournis_database_connection <em>Portfournis database connection</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.InterfaceDatabaseImpl#getPortrequis_database_connection <em>Portrequis database connection</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.InterfaceDatabaseImpl#getPortfournis_database_security <em>Portfournis database security</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.InterfaceDatabaseImpl#getPortrequis_database_security <em>Portrequis database security</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceDatabaseImpl extends InterfaceComposantsImpl implements InterfaceDatabase {
	/**
	 * The cached value of the '{@link #getPortfournis_database_connection() <em>Portfournis database connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortfournis_database_connection()
	 * @generated
	 * @ordered
	 */
	protected PortFournis_database_Connection portfournis_database_connection;

	/**
	 * The cached value of the '{@link #getPortrequis_database_connection() <em>Portrequis database connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrequis_database_connection()
	 * @generated
	 * @ordered
	 */
	protected PortRequis_database_Connection portrequis_database_connection;

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
	 * The cached value of the '{@link #getPortrequis_database_security() <em>Portrequis database security</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrequis_database_security()
	 * @generated
	 * @ordered
	 */
	protected PortRequis_database_Security portrequis_database_security;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceDatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FonctionServeurPackage.Literals.INTERFACE_DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFournis_database_Connection getPortfournis_database_connection() {
		if (portfournis_database_connection != null && portfournis_database_connection.eIsProxy()) {
			InternalEObject oldPortfournis_database_connection = (InternalEObject)portfournis_database_connection;
			portfournis_database_connection = (PortFournis_database_Connection)eResolveProxy(oldPortfournis_database_connection);
			if (portfournis_database_connection != oldPortfournis_database_connection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.INTERFACE_DATABASE__PORTFOURNIS_DATABASE_CONNECTION, oldPortfournis_database_connection, portfournis_database_connection));
			}
		}
		return portfournis_database_connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFournis_database_Connection basicGetPortfournis_database_connection() {
		return portfournis_database_connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortfournis_database_connection(PortFournis_database_Connection newPortfournis_database_connection) {
		PortFournis_database_Connection oldPortfournis_database_connection = portfournis_database_connection;
		portfournis_database_connection = newPortfournis_database_connection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.INTERFACE_DATABASE__PORTFOURNIS_DATABASE_CONNECTION, oldPortfournis_database_connection, portfournis_database_connection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequis_database_Connection getPortrequis_database_connection() {
		if (portrequis_database_connection != null && portrequis_database_connection.eIsProxy()) {
			InternalEObject oldPortrequis_database_connection = (InternalEObject)portrequis_database_connection;
			portrequis_database_connection = (PortRequis_database_Connection)eResolveProxy(oldPortrequis_database_connection);
			if (portrequis_database_connection != oldPortrequis_database_connection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.INTERFACE_DATABASE__PORTREQUIS_DATABASE_CONNECTION, oldPortrequis_database_connection, portrequis_database_connection));
			}
		}
		return portrequis_database_connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequis_database_Connection basicGetPortrequis_database_connection() {
		return portrequis_database_connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortrequis_database_connection(PortRequis_database_Connection newPortrequis_database_connection) {
		PortRequis_database_Connection oldPortrequis_database_connection = portrequis_database_connection;
		portrequis_database_connection = newPortrequis_database_connection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.INTERFACE_DATABASE__PORTREQUIS_DATABASE_CONNECTION, oldPortrequis_database_connection, portrequis_database_connection));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.INTERFACE_DATABASE__PORTFOURNIS_DATABASE_SECURITY, oldPortfournis_database_security, portfournis_database_security));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.INTERFACE_DATABASE__PORTFOURNIS_DATABASE_SECURITY, oldPortfournis_database_security, portfournis_database_security));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.INTERFACE_DATABASE__PORTREQUIS_DATABASE_SECURITY, oldPortrequis_database_security, portrequis_database_security));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.INTERFACE_DATABASE__PORTREQUIS_DATABASE_SECURITY, oldPortrequis_database_security, portrequis_database_security));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FonctionServeurPackage.INTERFACE_DATABASE__PORTFOURNIS_DATABASE_CONNECTION:
				if (resolve) return getPortfournis_database_connection();
				return basicGetPortfournis_database_connection();
			case FonctionServeurPackage.INTERFACE_DATABASE__PORTREQUIS_DATABASE_CONNECTION:
				if (resolve) return getPortrequis_database_connection();
				return basicGetPortrequis_database_connection();
			case FonctionServeurPackage.INTERFACE_DATABASE__PORTFOURNIS_DATABASE_SECURITY:
				if (resolve) return getPortfournis_database_security();
				return basicGetPortfournis_database_security();
			case FonctionServeurPackage.INTERFACE_DATABASE__PORTREQUIS_DATABASE_SECURITY:
				if (resolve) return getPortrequis_database_security();
				return basicGetPortrequis_database_security();
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
			case FonctionServeurPackage.INTERFACE_DATABASE__PORTFOURNIS_DATABASE_CONNECTION:
				setPortfournis_database_connection((PortFournis_database_Connection)newValue);
				return;
			case FonctionServeurPackage.INTERFACE_DATABASE__PORTREQUIS_DATABASE_CONNECTION:
				setPortrequis_database_connection((PortRequis_database_Connection)newValue);
				return;
			case FonctionServeurPackage.INTERFACE_DATABASE__PORTFOURNIS_DATABASE_SECURITY:
				setPortfournis_database_security((PortFournis_database_Security)newValue);
				return;
			case FonctionServeurPackage.INTERFACE_DATABASE__PORTREQUIS_DATABASE_SECURITY:
				setPortrequis_database_security((PortRequis_database_Security)newValue);
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
			case FonctionServeurPackage.INTERFACE_DATABASE__PORTFOURNIS_DATABASE_CONNECTION:
				setPortfournis_database_connection((PortFournis_database_Connection)null);
				return;
			case FonctionServeurPackage.INTERFACE_DATABASE__PORTREQUIS_DATABASE_CONNECTION:
				setPortrequis_database_connection((PortRequis_database_Connection)null);
				return;
			case FonctionServeurPackage.INTERFACE_DATABASE__PORTFOURNIS_DATABASE_SECURITY:
				setPortfournis_database_security((PortFournis_database_Security)null);
				return;
			case FonctionServeurPackage.INTERFACE_DATABASE__PORTREQUIS_DATABASE_SECURITY:
				setPortrequis_database_security((PortRequis_database_Security)null);
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
			case FonctionServeurPackage.INTERFACE_DATABASE__PORTFOURNIS_DATABASE_CONNECTION:
				return portfournis_database_connection != null;
			case FonctionServeurPackage.INTERFACE_DATABASE__PORTREQUIS_DATABASE_CONNECTION:
				return portrequis_database_connection != null;
			case FonctionServeurPackage.INTERFACE_DATABASE__PORTFOURNIS_DATABASE_SECURITY:
				return portfournis_database_security != null;
			case FonctionServeurPackage.INTERFACE_DATABASE__PORTREQUIS_DATABASE_SECURITY:
				return portrequis_database_security != null;
		}
		return super.eIsSet(featureID);
	}

} //InterfaceDatabaseImpl
