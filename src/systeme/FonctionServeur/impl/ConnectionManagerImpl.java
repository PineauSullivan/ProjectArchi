/**
 */
package systeme.FonctionServeur.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projecttArchitectural.impl.ComposantsImpl;

import systeme.FonctionServeur.ConnectionManager;
import systeme.FonctionServeur.FonctionServeurPackage;
import systeme.FonctionServeur.InterfaceConnectionManager;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.FonctionServeur.impl.ConnectionManagerImpl#getInterfaceconnectionmanager <em>Interfaceconnectionmanager</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionManagerImpl extends ComposantsImpl implements ConnectionManager {
	/**
	 * The cached value of the '{@link #getInterfaceconnectionmanager() <em>Interfaceconnectionmanager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceconnectionmanager()
	 * @generated
	 * @ordered
	 */
	protected InterfaceConnectionManager interfaceconnectionmanager;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FonctionServeurPackage.Literals.CONNECTION_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceConnectionManager getInterfaceconnectionmanager() {
		if (interfaceconnectionmanager != null && interfaceconnectionmanager.eIsProxy()) {
			InternalEObject oldInterfaceconnectionmanager = (InternalEObject)interfaceconnectionmanager;
			interfaceconnectionmanager = (InterfaceConnectionManager)eResolveProxy(oldInterfaceconnectionmanager);
			if (interfaceconnectionmanager != oldInterfaceconnectionmanager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.CONNECTION_MANAGER__INTERFACECONNECTIONMANAGER, oldInterfaceconnectionmanager, interfaceconnectionmanager));
			}
		}
		return interfaceconnectionmanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceConnectionManager basicGetInterfaceconnectionmanager() {
		return interfaceconnectionmanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceconnectionmanager(InterfaceConnectionManager newInterfaceconnectionmanager) {
		InterfaceConnectionManager oldInterfaceconnectionmanager = interfaceconnectionmanager;
		interfaceconnectionmanager = newInterfaceconnectionmanager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.CONNECTION_MANAGER__INTERFACECONNECTIONMANAGER, oldInterfaceconnectionmanager, interfaceconnectionmanager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FonctionServeurPackage.CONNECTION_MANAGER__INTERFACECONNECTIONMANAGER:
				if (resolve) return getInterfaceconnectionmanager();
				return basicGetInterfaceconnectionmanager();
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
			case FonctionServeurPackage.CONNECTION_MANAGER__INTERFACECONNECTIONMANAGER:
				setInterfaceconnectionmanager((InterfaceConnectionManager)newValue);
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
			case FonctionServeurPackage.CONNECTION_MANAGER__INTERFACECONNECTIONMANAGER:
				setInterfaceconnectionmanager((InterfaceConnectionManager)null);
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
			case FonctionServeurPackage.CONNECTION_MANAGER__INTERFACECONNECTIONMANAGER:
				return interfaceconnectionmanager != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectionManagerImpl
