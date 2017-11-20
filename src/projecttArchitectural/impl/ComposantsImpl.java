/**
 */
package projecttArchitectural.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import projecttArchitectural.Composants;
import projecttArchitectural.InterfaceComposants;
import projecttArchitectural.ProjecttArchitecturalPackage;
import projecttArchitectural.Propriétés;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composants</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projecttArchitectural.impl.ComposantsImpl#getPropriétés <em>Propriétés</em>}</li>
 *   <li>{@link projecttArchitectural.impl.ComposantsImpl#getInterfacecomposants <em>Interfacecomposants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComposantsImpl extends ElementImpl implements Composants {
	/**
	 * The cached value of the '{@link #getPropriétés() <em>Propriétés</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropriétés()
	 * @generated
	 * @ordered
	 */
	protected EList<Propriétés> propriétés;

	/**
	 * The cached value of the '{@link #getInterfacecomposants() <em>Interfacecomposants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfacecomposants()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceComposants> interfacecomposants;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposantsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjecttArchitecturalPackage.Literals.COMPOSANTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Propriétés> getPropriétés() {
		if (propriétés == null) {
			propriétés = new EObjectContainmentEList<Propriétés>(Propriétés.class, this, ProjecttArchitecturalPackage.COMPOSANTS__PROPRIÉTÉS);
		}
		return propriétés;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceComposants> getInterfacecomposants() {
		if (interfacecomposants == null) {
			interfacecomposants = new EObjectContainmentEList<InterfaceComposants>(InterfaceComposants.class, this, ProjecttArchitecturalPackage.COMPOSANTS__INTERFACECOMPOSANTS);
		}
		return interfacecomposants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProjecttArchitecturalPackage.COMPOSANTS__PROPRIÉTÉS:
				return ((InternalEList<?>)getPropriétés()).basicRemove(otherEnd, msgs);
			case ProjecttArchitecturalPackage.COMPOSANTS__INTERFACECOMPOSANTS:
				return ((InternalEList<?>)getInterfacecomposants()).basicRemove(otherEnd, msgs);
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
			case ProjecttArchitecturalPackage.COMPOSANTS__PROPRIÉTÉS:
				return getPropriétés();
			case ProjecttArchitecturalPackage.COMPOSANTS__INTERFACECOMPOSANTS:
				return getInterfacecomposants();
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
			case ProjecttArchitecturalPackage.COMPOSANTS__PROPRIÉTÉS:
				getPropriétés().clear();
				getPropriétés().addAll((Collection<? extends Propriétés>)newValue);
				return;
			case ProjecttArchitecturalPackage.COMPOSANTS__INTERFACECOMPOSANTS:
				getInterfacecomposants().clear();
				getInterfacecomposants().addAll((Collection<? extends InterfaceComposants>)newValue);
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
			case ProjecttArchitecturalPackage.COMPOSANTS__PROPRIÉTÉS:
				getPropriétés().clear();
				return;
			case ProjecttArchitecturalPackage.COMPOSANTS__INTERFACECOMPOSANTS:
				getInterfacecomposants().clear();
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
			case ProjecttArchitecturalPackage.COMPOSANTS__PROPRIÉTÉS:
				return propriétés != null && !propriétés.isEmpty();
			case ProjecttArchitecturalPackage.COMPOSANTS__INTERFACECOMPOSANTS:
				return interfacecomposants != null && !interfacecomposants.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComposantsImpl
