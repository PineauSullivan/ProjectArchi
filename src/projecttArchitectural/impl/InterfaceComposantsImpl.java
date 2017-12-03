/**
 */
package projecttArchitectural.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import projecttArchitectural.InterfaceComposants;
import projecttArchitectural.PortsComposants;
import projecttArchitectural.ProjecttArchitecturalPackage;
import projecttArchitectural.ServiceComposants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Composants</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projecttArchitectural.impl.InterfaceComposantsImpl#getServicecomposants <em>Servicecomposants</em>}</li>
 *   <li>{@link projecttArchitectural.impl.InterfaceComposantsImpl#getPortscompasants <em>Portscompasants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceComposantsImpl extends MinimalEObjectImpl.Container implements InterfaceComposants {
	/**
	 * The cached value of the '{@link #getServicecomposants() <em>Servicecomposants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicecomposants()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceComposants> servicecomposants;

	/**
	 * The cached value of the '{@link #getPortscompasants() <em>Portscompasants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortscompasants()
	 * @generated
	 * @ordered
	 */
	protected EList<PortsComposants> portscompasants;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceComposantsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjecttArchitecturalPackage.Literals.INTERFACE_COMPOSANTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceComposants> getServicecomposants() {
		if (servicecomposants == null) {
			servicecomposants = new EObjectContainmentEList<ServiceComposants>(ServiceComposants.class, this, ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS__SERVICECOMPOSANTS);
		}
		return servicecomposants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortsComposants> getPortscompasants() {
		if (portscompasants == null) {
			portscompasants = new EObjectContainmentEList<PortsComposants>(PortsComposants.class, this, ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS__PORTSCOMPASANTS);
		}
		return portscompasants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS__SERVICECOMPOSANTS:
				return ((InternalEList<?>)getServicecomposants()).basicRemove(otherEnd, msgs);
			case ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS__PORTSCOMPASANTS:
				return ((InternalEList<?>)getPortscompasants()).basicRemove(otherEnd, msgs);
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
			case ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS__SERVICECOMPOSANTS:
				return getServicecomposants();
			case ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS__PORTSCOMPASANTS:
				return getPortscompasants();
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
			case ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS__SERVICECOMPOSANTS:
				getServicecomposants().clear();
				getServicecomposants().addAll((Collection<? extends ServiceComposants>)newValue);
				return;
			case ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS__PORTSCOMPASANTS:
				getPortscompasants().clear();
				getPortscompasants().addAll((Collection<? extends PortsComposants>)newValue);
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
			case ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS__SERVICECOMPOSANTS:
				getServicecomposants().clear();
				return;
			case ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS__PORTSCOMPASANTS:
				getPortscompasants().clear();
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
			case ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS__SERVICECOMPOSANTS:
				return servicecomposants != null && !servicecomposants.isEmpty();
			case ProjecttArchitecturalPackage.INTERFACE_COMPOSANTS__PORTSCOMPASANTS:
				return portscompasants != null && !portscompasants.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterfaceComposantsImpl
