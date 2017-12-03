/**
 */
package systeme.ClientServeur.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import projecttArchitectural.impl.ComposantsImpl;

import systeme.ClientServeur.ClientServeurPackage;
import systeme.ClientServeur.ComposantClient;
import systeme.ClientServeur.InterfaceClient;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composant Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.ClientServeur.impl.ComposantClientImpl#getInterfaceclient <em>Interfaceclient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComposantClientImpl extends ComposantsImpl implements ComposantClient {
	/**
	 * The cached value of the '{@link #getInterfaceclient() <em>Interfaceclient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceclient()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceClient> interfaceclient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposantClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClientServeurPackage.Literals.COMPOSANT_CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceClient> getInterfaceclient() {
		if (interfaceclient == null) {
			interfaceclient = new EObjectContainmentEList<InterfaceClient>(InterfaceClient.class, this, ClientServeurPackage.COMPOSANT_CLIENT__INTERFACECLIENT);
		}
		return interfaceclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClientServeurPackage.COMPOSANT_CLIENT__INTERFACECLIENT:
				return ((InternalEList<?>)getInterfaceclient()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClientServeurPackage.COMPOSANT_CLIENT__INTERFACECLIENT:
				return getInterfaceclient();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClientServeurPackage.COMPOSANT_CLIENT__INTERFACECLIENT:
				getInterfaceclient().clear();
				getInterfaceclient().addAll((Collection<? extends InterfaceClient>)newValue);
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
			case ClientServeurPackage.COMPOSANT_CLIENT__INTERFACECLIENT:
				getInterfaceclient().clear();
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
			case ClientServeurPackage.COMPOSANT_CLIENT__INTERFACECLIENT:
				return interfaceclient != null && !interfaceclient.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComposantClientImpl
