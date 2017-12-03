/**
 */
package projecttArchitectural.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import projecttArchitectural.BindingRequis;
import projecttArchitectural.PortsComposantsRequis;
import projecttArchitectural.ProjecttArchitecturalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Requis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projecttArchitectural.impl.BindingRequisImpl#getPortscomposantsrequis <em>Portscomposantsrequis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingRequisImpl extends BindingImpl implements BindingRequis {
	/**
	 * The cached value of the '{@link #getPortscomposantsrequis() <em>Portscomposantsrequis</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortscomposantsrequis()
	 * @generated
	 * @ordered
	 */
	protected EList<PortsComposantsRequis> portscomposantsrequis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingRequisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjecttArchitecturalPackage.Literals.BINDING_REQUIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortsComposantsRequis> getPortscomposantsrequis() {
		if (portscomposantsrequis == null) {
			portscomposantsrequis = new EObjectResolvingEList<PortsComposantsRequis>(PortsComposantsRequis.class, this, ProjecttArchitecturalPackage.BINDING_REQUIS__PORTSCOMPOSANTSREQUIS);
		}
		return portscomposantsrequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProjecttArchitecturalPackage.BINDING_REQUIS__PORTSCOMPOSANTSREQUIS:
				return getPortscomposantsrequis();
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
			case ProjecttArchitecturalPackage.BINDING_REQUIS__PORTSCOMPOSANTSREQUIS:
				getPortscomposantsrequis().clear();
				getPortscomposantsrequis().addAll((Collection<? extends PortsComposantsRequis>)newValue);
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
			case ProjecttArchitecturalPackage.BINDING_REQUIS__PORTSCOMPOSANTSREQUIS:
				getPortscomposantsrequis().clear();
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
			case ProjecttArchitecturalPackage.BINDING_REQUIS__PORTSCOMPOSANTSREQUIS:
				return portscomposantsrequis != null && !portscomposantsrequis.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BindingRequisImpl
