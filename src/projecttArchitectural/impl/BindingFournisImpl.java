/**
 */
package projecttArchitectural.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projecttArchitectural.BindingFournis;
import projecttArchitectural.PortsComposantsFournis;
import projecttArchitectural.ProjecttArchitecturalPackage;
import projecttArchitectural.RoleConnecteursFournis;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Fournis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projecttArchitectural.impl.BindingFournisImpl#getPortscomposantsfournis <em>Portscomposantsfournis</em>}</li>
 *   <li>{@link projecttArchitectural.impl.BindingFournisImpl#getRoleconnecteursfournis <em>Roleconnecteursfournis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingFournisImpl extends BindingImpl implements BindingFournis {
	/**
	 * The cached value of the '{@link #getPortscomposantsfournis() <em>Portscomposantsfournis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortscomposantsfournis()
	 * @generated
	 * @ordered
	 */
	protected PortsComposantsFournis portscomposantsfournis;

	/**
	 * The cached value of the '{@link #getRoleconnecteursfournis() <em>Roleconnecteursfournis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleconnecteursfournis()
	 * @generated
	 * @ordered
	 */
	protected RoleConnecteursFournis roleconnecteursfournis;

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
	public PortsComposantsFournis getPortscomposantsfournis() {
		if (portscomposantsfournis != null && portscomposantsfournis.eIsProxy()) {
			InternalEObject oldPortscomposantsfournis = (InternalEObject)portscomposantsfournis;
			portscomposantsfournis = (PortsComposantsFournis)eResolveProxy(oldPortscomposantsfournis);
			if (portscomposantsfournis != oldPortscomposantsfournis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjecttArchitecturalPackage.BINDING_FOURNIS__PORTSCOMPOSANTSFOURNIS, oldPortscomposantsfournis, portscomposantsfournis));
			}
		}
		return portscomposantsfournis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortsComposantsFournis basicGetPortscomposantsfournis() {
		return portscomposantsfournis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortscomposantsfournis(PortsComposantsFournis newPortscomposantsfournis) {
		PortsComposantsFournis oldPortscomposantsfournis = portscomposantsfournis;
		portscomposantsfournis = newPortscomposantsfournis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjecttArchitecturalPackage.BINDING_FOURNIS__PORTSCOMPOSANTSFOURNIS, oldPortscomposantsfournis, portscomposantsfournis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnecteursFournis getRoleconnecteursfournis() {
		if (roleconnecteursfournis != null && roleconnecteursfournis.eIsProxy()) {
			InternalEObject oldRoleconnecteursfournis = (InternalEObject)roleconnecteursfournis;
			roleconnecteursfournis = (RoleConnecteursFournis)eResolveProxy(oldRoleconnecteursfournis);
			if (roleconnecteursfournis != oldRoleconnecteursfournis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjecttArchitecturalPackage.BINDING_FOURNIS__ROLECONNECTEURSFOURNIS, oldRoleconnecteursfournis, roleconnecteursfournis));
			}
		}
		return roleconnecteursfournis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnecteursFournis basicGetRoleconnecteursfournis() {
		return roleconnecteursfournis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleconnecteursfournis(RoleConnecteursFournis newRoleconnecteursfournis) {
		RoleConnecteursFournis oldRoleconnecteursfournis = roleconnecteursfournis;
		roleconnecteursfournis = newRoleconnecteursfournis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjecttArchitecturalPackage.BINDING_FOURNIS__ROLECONNECTEURSFOURNIS, oldRoleconnecteursfournis, roleconnecteursfournis));
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
				if (resolve) return getPortscomposantsfournis();
				return basicGetPortscomposantsfournis();
			case ProjecttArchitecturalPackage.BINDING_FOURNIS__ROLECONNECTEURSFOURNIS:
				if (resolve) return getRoleconnecteursfournis();
				return basicGetRoleconnecteursfournis();
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
			case ProjecttArchitecturalPackage.BINDING_FOURNIS__PORTSCOMPOSANTSFOURNIS:
				setPortscomposantsfournis((PortsComposantsFournis)newValue);
				return;
			case ProjecttArchitecturalPackage.BINDING_FOURNIS__ROLECONNECTEURSFOURNIS:
				setRoleconnecteursfournis((RoleConnecteursFournis)newValue);
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
				setPortscomposantsfournis((PortsComposantsFournis)null);
				return;
			case ProjecttArchitecturalPackage.BINDING_FOURNIS__ROLECONNECTEURSFOURNIS:
				setRoleconnecteursfournis((RoleConnecteursFournis)null);
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
				return portscomposantsfournis != null;
			case ProjecttArchitecturalPackage.BINDING_FOURNIS__ROLECONNECTEURSFOURNIS:
				return roleconnecteursfournis != null;
		}
		return super.eIsSet(featureID);
	}

} //BindingFournisImpl
