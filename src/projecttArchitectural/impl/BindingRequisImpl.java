/**
 */
package projecttArchitectural.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projecttArchitectural.BindingRequis;
import projecttArchitectural.PortsComposantsRequis;
import projecttArchitectural.ProjecttArchitecturalPackage;
import projecttArchitectural.RoleConnecteursRequis;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Requis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projecttArchitectural.impl.BindingRequisImpl#getPortscomposantsrequis <em>Portscomposantsrequis</em>}</li>
 *   <li>{@link projecttArchitectural.impl.BindingRequisImpl#getRoleconnecteursrequis <em>Roleconnecteursrequis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingRequisImpl extends BindingImpl implements BindingRequis {
	/**
	 * The cached value of the '{@link #getPortscomposantsrequis() <em>Portscomposantsrequis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortscomposantsrequis()
	 * @generated
	 * @ordered
	 */
	protected PortsComposantsRequis portscomposantsrequis;

	/**
	 * The cached value of the '{@link #getRoleconnecteursrequis() <em>Roleconnecteursrequis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleconnecteursrequis()
	 * @generated
	 * @ordered
	 */
	protected RoleConnecteursRequis roleconnecteursrequis;

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
	public PortsComposantsRequis getPortscomposantsrequis() {
		if (portscomposantsrequis != null && portscomposantsrequis.eIsProxy()) {
			InternalEObject oldPortscomposantsrequis = (InternalEObject)portscomposantsrequis;
			portscomposantsrequis = (PortsComposantsRequis)eResolveProxy(oldPortscomposantsrequis);
			if (portscomposantsrequis != oldPortscomposantsrequis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjecttArchitecturalPackage.BINDING_REQUIS__PORTSCOMPOSANTSREQUIS, oldPortscomposantsrequis, portscomposantsrequis));
			}
		}
		return portscomposantsrequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortsComposantsRequis basicGetPortscomposantsrequis() {
		return portscomposantsrequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortscomposantsrequis(PortsComposantsRequis newPortscomposantsrequis) {
		PortsComposantsRequis oldPortscomposantsrequis = portscomposantsrequis;
		portscomposantsrequis = newPortscomposantsrequis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjecttArchitecturalPackage.BINDING_REQUIS__PORTSCOMPOSANTSREQUIS, oldPortscomposantsrequis, portscomposantsrequis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnecteursRequis getRoleconnecteursrequis() {
		if (roleconnecteursrequis != null && roleconnecteursrequis.eIsProxy()) {
			InternalEObject oldRoleconnecteursrequis = (InternalEObject)roleconnecteursrequis;
			roleconnecteursrequis = (RoleConnecteursRequis)eResolveProxy(oldRoleconnecteursrequis);
			if (roleconnecteursrequis != oldRoleconnecteursrequis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjecttArchitecturalPackage.BINDING_REQUIS__ROLECONNECTEURSREQUIS, oldRoleconnecteursrequis, roleconnecteursrequis));
			}
		}
		return roleconnecteursrequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnecteursRequis basicGetRoleconnecteursrequis() {
		return roleconnecteursrequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleconnecteursrequis(RoleConnecteursRequis newRoleconnecteursrequis) {
		RoleConnecteursRequis oldRoleconnecteursrequis = roleconnecteursrequis;
		roleconnecteursrequis = newRoleconnecteursrequis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjecttArchitecturalPackage.BINDING_REQUIS__ROLECONNECTEURSREQUIS, oldRoleconnecteursrequis, roleconnecteursrequis));
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
				if (resolve) return getPortscomposantsrequis();
				return basicGetPortscomposantsrequis();
			case ProjecttArchitecturalPackage.BINDING_REQUIS__ROLECONNECTEURSREQUIS:
				if (resolve) return getRoleconnecteursrequis();
				return basicGetRoleconnecteursrequis();
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
			case ProjecttArchitecturalPackage.BINDING_REQUIS__PORTSCOMPOSANTSREQUIS:
				setPortscomposantsrequis((PortsComposantsRequis)newValue);
				return;
			case ProjecttArchitecturalPackage.BINDING_REQUIS__ROLECONNECTEURSREQUIS:
				setRoleconnecteursrequis((RoleConnecteursRequis)newValue);
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
				setPortscomposantsrequis((PortsComposantsRequis)null);
				return;
			case ProjecttArchitecturalPackage.BINDING_REQUIS__ROLECONNECTEURSREQUIS:
				setRoleconnecteursrequis((RoleConnecteursRequis)null);
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
				return portscomposantsrequis != null;
			case ProjecttArchitecturalPackage.BINDING_REQUIS__ROLECONNECTEURSREQUIS:
				return roleconnecteursrequis != null;
		}
		return super.eIsSet(featureID);
	}

} //BindingRequisImpl
