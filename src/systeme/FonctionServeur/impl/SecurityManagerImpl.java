/**
 */
package systeme.FonctionServeur.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projecttArchitectural.impl.ComposantsImpl;

import systeme.FonctionServeur.FonctionServeurPackage;
import systeme.FonctionServeur.interfaceSecurityManager;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.FonctionServeur.impl.SecurityManagerImpl#getInterfacesecuritymanager <em>Interfacesecuritymanager</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityManagerImpl extends ComposantsImpl implements systeme.FonctionServeur.SecurityManager {
	/**
	 * The cached value of the '{@link #getInterfacesecuritymanager() <em>Interfacesecuritymanager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfacesecuritymanager()
	 * @generated
	 * @ordered
	 */
	protected interfaceSecurityManager interfacesecuritymanager;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FonctionServeurPackage.Literals.SECURITY_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interfaceSecurityManager getInterfacesecuritymanager() {
		if (interfacesecuritymanager != null && interfacesecuritymanager.eIsProxy()) {
			InternalEObject oldInterfacesecuritymanager = (InternalEObject)interfacesecuritymanager;
			interfacesecuritymanager = (interfaceSecurityManager)eResolveProxy(oldInterfacesecuritymanager);
			if (interfacesecuritymanager != oldInterfacesecuritymanager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.SECURITY_MANAGER__INTERFACESECURITYMANAGER, oldInterfacesecuritymanager, interfacesecuritymanager));
			}
		}
		return interfacesecuritymanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interfaceSecurityManager basicGetInterfacesecuritymanager() {
		return interfacesecuritymanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfacesecuritymanager(interfaceSecurityManager newInterfacesecuritymanager) {
		interfaceSecurityManager oldInterfacesecuritymanager = interfacesecuritymanager;
		interfacesecuritymanager = newInterfacesecuritymanager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.SECURITY_MANAGER__INTERFACESECURITYMANAGER, oldInterfacesecuritymanager, interfacesecuritymanager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FonctionServeurPackage.SECURITY_MANAGER__INTERFACESECURITYMANAGER:
				if (resolve) return getInterfacesecuritymanager();
				return basicGetInterfacesecuritymanager();
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
			case FonctionServeurPackage.SECURITY_MANAGER__INTERFACESECURITYMANAGER:
				setInterfacesecuritymanager((interfaceSecurityManager)newValue);
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
			case FonctionServeurPackage.SECURITY_MANAGER__INTERFACESECURITYMANAGER:
				setInterfacesecuritymanager((interfaceSecurityManager)null);
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
			case FonctionServeurPackage.SECURITY_MANAGER__INTERFACESECURITYMANAGER:
				return interfacesecuritymanager != null;
		}
		return super.eIsSet(featureID);
	}

} //SecurityManagerImpl
