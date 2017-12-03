/**
 */
package systeme.FonctionServeur.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projecttArchitectural.impl.InterfaceComposantsImpl;

import systeme.FonctionServeur.FonctionServeurPackage;
import systeme.FonctionServeur.InterfaceConnectionManager;
import systeme.FonctionServeur.PortFournisCS;
import systeme.FonctionServeur.PortFournis_ConnectionManager_Database;
import systeme.FonctionServeur.PortFournis_ConnectionManager_Security;
import systeme.FonctionServeur.PortRequisConfigCS;
import systeme.FonctionServeur.PortRequis_ConnectionManager_Database;
import systeme.FonctionServeur.PortRequis_ConnectionManager_Security;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Connection Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.FonctionServeur.impl.InterfaceConnectionManagerImpl#getPortrequisconfigcs <em>Portrequisconfigcs</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.InterfaceConnectionManagerImpl#getPortfourniscs <em>Portfourniscs</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.InterfaceConnectionManagerImpl#getPortfournis_connectionmanager_database <em>Portfournis connectionmanager database</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.InterfaceConnectionManagerImpl#getPortrequis_connectionmanager_database <em>Portrequis connectionmanager database</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.InterfaceConnectionManagerImpl#getPortfournis_connectionmanager_security <em>Portfournis connectionmanager security</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.InterfaceConnectionManagerImpl#getPortrequis_connectionmanager_security <em>Portrequis connectionmanager security</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceConnectionManagerImpl extends InterfaceComposantsImpl implements InterfaceConnectionManager {
	/**
	 * The cached value of the '{@link #getPortrequisconfigcs() <em>Portrequisconfigcs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrequisconfigcs()
	 * @generated
	 * @ordered
	 */
	protected PortRequisConfigCS portrequisconfigcs;

	/**
	 * The cached value of the '{@link #getPortfourniscs() <em>Portfourniscs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortfourniscs()
	 * @generated
	 * @ordered
	 */
	protected PortFournisCS portfourniscs;

	/**
	 * The cached value of the '{@link #getPortfournis_connectionmanager_database() <em>Portfournis connectionmanager database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortfournis_connectionmanager_database()
	 * @generated
	 * @ordered
	 */
	protected PortFournis_ConnectionManager_Database portfournis_connectionmanager_database;

	/**
	 * The cached value of the '{@link #getPortrequis_connectionmanager_database() <em>Portrequis connectionmanager database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrequis_connectionmanager_database()
	 * @generated
	 * @ordered
	 */
	protected PortRequis_ConnectionManager_Database portrequis_connectionmanager_database;

	/**
	 * The cached value of the '{@link #getPortfournis_connectionmanager_security() <em>Portfournis connectionmanager security</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortfournis_connectionmanager_security()
	 * @generated
	 * @ordered
	 */
	protected PortFournis_ConnectionManager_Security portfournis_connectionmanager_security;

	/**
	 * The cached value of the '{@link #getPortrequis_connectionmanager_security() <em>Portrequis connectionmanager security</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortrequis_connectionmanager_security()
	 * @generated
	 * @ordered
	 */
	protected PortRequis_ConnectionManager_Security portrequis_connectionmanager_security;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceConnectionManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FonctionServeurPackage.Literals.INTERFACE_CONNECTION_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequisConfigCS getPortrequisconfigcs() {
		if (portrequisconfigcs != null && portrequisconfigcs.eIsProxy()) {
			InternalEObject oldPortrequisconfigcs = (InternalEObject)portrequisconfigcs;
			portrequisconfigcs = (PortRequisConfigCS)eResolveProxy(oldPortrequisconfigcs);
			if (portrequisconfigcs != oldPortrequisconfigcs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTREQUISCONFIGCS, oldPortrequisconfigcs, portrequisconfigcs));
			}
		}
		return portrequisconfigcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequisConfigCS basicGetPortrequisconfigcs() {
		return portrequisconfigcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortrequisconfigcs(PortRequisConfigCS newPortrequisconfigcs) {
		PortRequisConfigCS oldPortrequisconfigcs = portrequisconfigcs;
		portrequisconfigcs = newPortrequisconfigcs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTREQUISCONFIGCS, oldPortrequisconfigcs, portrequisconfigcs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFournisCS getPortfourniscs() {
		if (portfourniscs != null && portfourniscs.eIsProxy()) {
			InternalEObject oldPortfourniscs = (InternalEObject)portfourniscs;
			portfourniscs = (PortFournisCS)eResolveProxy(oldPortfourniscs);
			if (portfourniscs != oldPortfourniscs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTFOURNISCS, oldPortfourniscs, portfourniscs));
			}
		}
		return portfourniscs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFournisCS basicGetPortfourniscs() {
		return portfourniscs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortfourniscs(PortFournisCS newPortfourniscs) {
		PortFournisCS oldPortfourniscs = portfourniscs;
		portfourniscs = newPortfourniscs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTFOURNISCS, oldPortfourniscs, portfourniscs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFournis_ConnectionManager_Database getPortfournis_connectionmanager_database() {
		if (portfournis_connectionmanager_database != null && portfournis_connectionmanager_database.eIsProxy()) {
			InternalEObject oldPortfournis_connectionmanager_database = (InternalEObject)portfournis_connectionmanager_database;
			portfournis_connectionmanager_database = (PortFournis_ConnectionManager_Database)eResolveProxy(oldPortfournis_connectionmanager_database);
			if (portfournis_connectionmanager_database != oldPortfournis_connectionmanager_database) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTFOURNIS_CONNECTIONMANAGER_DATABASE, oldPortfournis_connectionmanager_database, portfournis_connectionmanager_database));
			}
		}
		return portfournis_connectionmanager_database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFournis_ConnectionManager_Database basicGetPortfournis_connectionmanager_database() {
		return portfournis_connectionmanager_database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortfournis_connectionmanager_database(PortFournis_ConnectionManager_Database newPortfournis_connectionmanager_database) {
		PortFournis_ConnectionManager_Database oldPortfournis_connectionmanager_database = portfournis_connectionmanager_database;
		portfournis_connectionmanager_database = newPortfournis_connectionmanager_database;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTFOURNIS_CONNECTIONMANAGER_DATABASE, oldPortfournis_connectionmanager_database, portfournis_connectionmanager_database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequis_ConnectionManager_Database getPortrequis_connectionmanager_database() {
		if (portrequis_connectionmanager_database != null && portrequis_connectionmanager_database.eIsProxy()) {
			InternalEObject oldPortrequis_connectionmanager_database = (InternalEObject)portrequis_connectionmanager_database;
			portrequis_connectionmanager_database = (PortRequis_ConnectionManager_Database)eResolveProxy(oldPortrequis_connectionmanager_database);
			if (portrequis_connectionmanager_database != oldPortrequis_connectionmanager_database) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTREQUIS_CONNECTIONMANAGER_DATABASE, oldPortrequis_connectionmanager_database, portrequis_connectionmanager_database));
			}
		}
		return portrequis_connectionmanager_database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequis_ConnectionManager_Database basicGetPortrequis_connectionmanager_database() {
		return portrequis_connectionmanager_database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortrequis_connectionmanager_database(PortRequis_ConnectionManager_Database newPortrequis_connectionmanager_database) {
		PortRequis_ConnectionManager_Database oldPortrequis_connectionmanager_database = portrequis_connectionmanager_database;
		portrequis_connectionmanager_database = newPortrequis_connectionmanager_database;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTREQUIS_CONNECTIONMANAGER_DATABASE, oldPortrequis_connectionmanager_database, portrequis_connectionmanager_database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFournis_ConnectionManager_Security getPortfournis_connectionmanager_security() {
		if (portfournis_connectionmanager_security != null && portfournis_connectionmanager_security.eIsProxy()) {
			InternalEObject oldPortfournis_connectionmanager_security = (InternalEObject)portfournis_connectionmanager_security;
			portfournis_connectionmanager_security = (PortFournis_ConnectionManager_Security)eResolveProxy(oldPortfournis_connectionmanager_security);
			if (portfournis_connectionmanager_security != oldPortfournis_connectionmanager_security) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTFOURNIS_CONNECTIONMANAGER_SECURITY, oldPortfournis_connectionmanager_security, portfournis_connectionmanager_security));
			}
		}
		return portfournis_connectionmanager_security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFournis_ConnectionManager_Security basicGetPortfournis_connectionmanager_security() {
		return portfournis_connectionmanager_security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortfournis_connectionmanager_security(PortFournis_ConnectionManager_Security newPortfournis_connectionmanager_security) {
		PortFournis_ConnectionManager_Security oldPortfournis_connectionmanager_security = portfournis_connectionmanager_security;
		portfournis_connectionmanager_security = newPortfournis_connectionmanager_security;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTFOURNIS_CONNECTIONMANAGER_SECURITY, oldPortfournis_connectionmanager_security, portfournis_connectionmanager_security));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequis_ConnectionManager_Security getPortrequis_connectionmanager_security() {
		if (portrequis_connectionmanager_security != null && portrequis_connectionmanager_security.eIsProxy()) {
			InternalEObject oldPortrequis_connectionmanager_security = (InternalEObject)portrequis_connectionmanager_security;
			portrequis_connectionmanager_security = (PortRequis_ConnectionManager_Security)eResolveProxy(oldPortrequis_connectionmanager_security);
			if (portrequis_connectionmanager_security != oldPortrequis_connectionmanager_security) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTREQUIS_CONNECTIONMANAGER_SECURITY, oldPortrequis_connectionmanager_security, portrequis_connectionmanager_security));
			}
		}
		return portrequis_connectionmanager_security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRequis_ConnectionManager_Security basicGetPortrequis_connectionmanager_security() {
		return portrequis_connectionmanager_security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortrequis_connectionmanager_security(PortRequis_ConnectionManager_Security newPortrequis_connectionmanager_security) {
		PortRequis_ConnectionManager_Security oldPortrequis_connectionmanager_security = portrequis_connectionmanager_security;
		portrequis_connectionmanager_security = newPortrequis_connectionmanager_security;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTREQUIS_CONNECTIONMANAGER_SECURITY, oldPortrequis_connectionmanager_security, portrequis_connectionmanager_security));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTREQUISCONFIGCS:
				if (resolve) return getPortrequisconfigcs();
				return basicGetPortrequisconfigcs();
			case FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTFOURNISCS:
				if (resolve) return getPortfourniscs();
				return basicGetPortfourniscs();
			case FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTFOURNIS_CONNECTIONMANAGER_DATABASE:
				if (resolve) return getPortfournis_connectionmanager_database();
				return basicGetPortfournis_connectionmanager_database();
			case FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTREQUIS_CONNECTIONMANAGER_DATABASE:
				if (resolve) return getPortrequis_connectionmanager_database();
				return basicGetPortrequis_connectionmanager_database();
			case FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTFOURNIS_CONNECTIONMANAGER_SECURITY:
				if (resolve) return getPortfournis_connectionmanager_security();
				return basicGetPortfournis_connectionmanager_security();
			case FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTREQUIS_CONNECTIONMANAGER_SECURITY:
				if (resolve) return getPortrequis_connectionmanager_security();
				return basicGetPortrequis_connectionmanager_security();
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
			case FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTREQUISCONFIGCS:
				setPortrequisconfigcs((PortRequisConfigCS)newValue);
				return;
			case FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTFOURNISCS:
				setPortfourniscs((PortFournisCS)newValue);
				return;
			case FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTFOURNIS_CONNECTIONMANAGER_DATABASE:
				setPortfournis_connectionmanager_database((PortFournis_ConnectionManager_Database)newValue);
				return;
			case FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTREQUIS_CONNECTIONMANAGER_DATABASE:
				setPortrequis_connectionmanager_database((PortRequis_ConnectionManager_Database)newValue);
				return;
			case FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTFOURNIS_CONNECTIONMANAGER_SECURITY:
				setPortfournis_connectionmanager_security((PortFournis_ConnectionManager_Security)newValue);
				return;
			case FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTREQUIS_CONNECTIONMANAGER_SECURITY:
				setPortrequis_connectionmanager_security((PortRequis_ConnectionManager_Security)newValue);
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
			case FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTREQUISCONFIGCS:
				setPortrequisconfigcs((PortRequisConfigCS)null);
				return;
			case FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTFOURNISCS:
				setPortfourniscs((PortFournisCS)null);
				return;
			case FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTFOURNIS_CONNECTIONMANAGER_DATABASE:
				setPortfournis_connectionmanager_database((PortFournis_ConnectionManager_Database)null);
				return;
			case FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTREQUIS_CONNECTIONMANAGER_DATABASE:
				setPortrequis_connectionmanager_database((PortRequis_ConnectionManager_Database)null);
				return;
			case FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTFOURNIS_CONNECTIONMANAGER_SECURITY:
				setPortfournis_connectionmanager_security((PortFournis_ConnectionManager_Security)null);
				return;
			case FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTREQUIS_CONNECTIONMANAGER_SECURITY:
				setPortrequis_connectionmanager_security((PortRequis_ConnectionManager_Security)null);
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
			case FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTREQUISCONFIGCS:
				return portrequisconfigcs != null;
			case FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTFOURNISCS:
				return portfourniscs != null;
			case FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTFOURNIS_CONNECTIONMANAGER_DATABASE:
				return portfournis_connectionmanager_database != null;
			case FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTREQUIS_CONNECTIONMANAGER_DATABASE:
				return portrequis_connectionmanager_database != null;
			case FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTFOURNIS_CONNECTIONMANAGER_SECURITY:
				return portfournis_connectionmanager_security != null;
			case FonctionServeurPackage.INTERFACE_CONNECTION_MANAGER__PORTREQUIS_CONNECTIONMANAGER_SECURITY:
				return portrequis_connectionmanager_security != null;
		}
		return super.eIsSet(featureID);
	}

} //InterfaceConnectionManagerImpl
