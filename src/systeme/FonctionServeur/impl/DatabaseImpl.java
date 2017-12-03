/**
 */
package systeme.FonctionServeur.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projecttArchitectural.impl.ComposantsImpl;

import systeme.FonctionServeur.Database;
import systeme.FonctionServeur.FonctionServeurPackage;
import systeme.FonctionServeur.InterfaceDatabase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.FonctionServeur.impl.DatabaseImpl#getInterfacedatabase <em>Interfacedatabase</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatabaseImpl extends ComposantsImpl implements Database {
	/**
	 * The cached value of the '{@link #getInterfacedatabase() <em>Interfacedatabase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfacedatabase()
	 * @generated
	 * @ordered
	 */
	protected InterfaceDatabase interfacedatabase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FonctionServeurPackage.Literals.DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDatabase getInterfacedatabase() {
		if (interfacedatabase != null && interfacedatabase.eIsProxy()) {
			InternalEObject oldInterfacedatabase = (InternalEObject)interfacedatabase;
			interfacedatabase = (InterfaceDatabase)eResolveProxy(oldInterfacedatabase);
			if (interfacedatabase != oldInterfacedatabase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.DATABASE__INTERFACEDATABASE, oldInterfacedatabase, interfacedatabase));
			}
		}
		return interfacedatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDatabase basicGetInterfacedatabase() {
		return interfacedatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfacedatabase(InterfaceDatabase newInterfacedatabase) {
		InterfaceDatabase oldInterfacedatabase = interfacedatabase;
		interfacedatabase = newInterfacedatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.DATABASE__INTERFACEDATABASE, oldInterfacedatabase, interfacedatabase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FonctionServeurPackage.DATABASE__INTERFACEDATABASE:
				if (resolve) return getInterfacedatabase();
				return basicGetInterfacedatabase();
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
			case FonctionServeurPackage.DATABASE__INTERFACEDATABASE:
				setInterfacedatabase((InterfaceDatabase)newValue);
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
			case FonctionServeurPackage.DATABASE__INTERFACEDATABASE:
				setInterfacedatabase((InterfaceDatabase)null);
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
			case FonctionServeurPackage.DATABASE__INTERFACEDATABASE:
				return interfacedatabase != null;
		}
		return super.eIsSet(featureID);
	}

} //DatabaseImpl
