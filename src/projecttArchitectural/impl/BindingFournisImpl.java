/**
 */
package projecttArchitectural.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import projecttArchitectural.BindingFournis;
import projecttArchitectural.PortsComposantsFournis;
import projecttArchitectural.ProjecttArchitecturalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Fournis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projecttArchitectural.impl.BindingFournisImpl#getPortscomposantsfournis <em>Portscomposantsfournis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingFournisImpl extends BindingImpl implements BindingFournis {
	/**
	 * The cached value of the '{@link #getPortscomposantsfournis() <em>Portscomposantsfournis</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortscomposantsfournis()
	 * @generated
	 * @ordered
	 */
	protected EList<PortsComposantsFournis> portscomposantsfournis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingFournisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjecttArchitecturalPackage.Literals.BINDING_FOURNIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortsComposantsFournis> getPortscomposantsfournis() {
		if (portscomposantsfournis == null) {
			portscomposantsfournis = new EObjectResolvingEList<PortsComposantsFournis>(PortsComposantsFournis.class, this, ProjecttArchitecturalPackage.BINDING_FOURNIS__PORTSCOMPOSANTSFOURNIS);
		}
		return portscomposantsfournis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProjecttArchitecturalPackage.BINDING_FOURNIS__PORTSCOMPOSANTSFOURNIS:
				return getPortscomposantsfournis();
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
			case ProjecttArchitecturalPackage.BINDING_FOURNIS__PORTSCOMPOSANTSFOURNIS:
				getPortscomposantsfournis().clear();
				getPortscomposantsfournis().addAll((Collection<? extends PortsComposantsFournis>)newValue);
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
			case ProjecttArchitecturalPackage.BINDING_FOURNIS__PORTSCOMPOSANTSFOURNIS:
				getPortscomposantsfournis().clear();
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
			case ProjecttArchitecturalPackage.BINDING_FOURNIS__PORTSCOMPOSANTSFOURNIS:
				return portscomposantsfournis != null && !portscomposantsfournis.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BindingFournisImpl
