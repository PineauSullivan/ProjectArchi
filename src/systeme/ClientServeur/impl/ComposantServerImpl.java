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
import systeme.ClientServeur.ComposantServer;
import systeme.ClientServeur.InterfaceServeur;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composant Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.ClientServeur.impl.ComposantServerImpl#getInterfaceserveur <em>Interfaceserveur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComposantServerImpl extends ComposantsImpl implements ComposantServer {
	/**
	 * The cached value of the '{@link #getInterfaceserveur() <em>Interfaceserveur</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceserveur()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceServeur> interfaceserveur;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposantServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClientServeurPackage.Literals.COMPOSANT_SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceServeur> getInterfaceserveur() {
		if (interfaceserveur == null) {
			interfaceserveur = new EObjectContainmentEList<InterfaceServeur>(InterfaceServeur.class, this, ClientServeurPackage.COMPOSANT_SERVER__INTERFACESERVEUR);
		}
		return interfaceserveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClientServeurPackage.COMPOSANT_SERVER__INTERFACESERVEUR:
				return ((InternalEList<?>)getInterfaceserveur()).basicRemove(otherEnd, msgs);
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
			case ClientServeurPackage.COMPOSANT_SERVER__INTERFACESERVEUR:
				return getInterfaceserveur();
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
			case ClientServeurPackage.COMPOSANT_SERVER__INTERFACESERVEUR:
				getInterfaceserveur().clear();
				getInterfaceserveur().addAll((Collection<? extends InterfaceServeur>)newValue);
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
			case ClientServeurPackage.COMPOSANT_SERVER__INTERFACESERVEUR:
				getInterfaceserveur().clear();
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
			case ClientServeurPackage.COMPOSANT_SERVER__INTERFACESERVEUR:
				return interfaceserveur != null && !interfaceserveur.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComposantServerImpl
