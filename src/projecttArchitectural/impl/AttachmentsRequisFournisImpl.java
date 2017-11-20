/**
 */
package projecttArchitectural.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projecttArchitectural.AttachmentsRequisFournis;
import projecttArchitectural.PortsComposantsRequis;
import projecttArchitectural.ProjecttArchitecturalPackage;
import projecttArchitectural.RoleConnecteursFournis;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachments Requis Fournis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projecttArchitectural.impl.AttachmentsRequisFournisImpl#getPortscomposantsrequis <em>Portscomposantsrequis</em>}</li>
 *   <li>{@link projecttArchitectural.impl.AttachmentsRequisFournisImpl#getRoleconnecteursfournis <em>Roleconnecteursfournis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachmentsRequisFournisImpl extends AttachmentImpl implements AttachmentsRequisFournis {
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
	protected AttachmentsRequisFournisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjecttArchitecturalPackage.Literals.ATTACHMENTS_REQUIS_FOURNIS;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS__PORTSCOMPOSANTSREQUIS, oldPortscomposantsrequis, portscomposantsrequis));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS__PORTSCOMPOSANTSREQUIS, oldPortscomposantsrequis, portscomposantsrequis));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS__ROLECONNECTEURSFOURNIS, oldRoleconnecteursfournis, roleconnecteursfournis));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS__ROLECONNECTEURSFOURNIS, oldRoleconnecteursfournis, roleconnecteursfournis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS__PORTSCOMPOSANTSREQUIS:
				if (resolve) return getPortscomposantsrequis();
				return basicGetPortscomposantsrequis();
			case ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS__ROLECONNECTEURSFOURNIS:
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
			case ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS__PORTSCOMPOSANTSREQUIS:
				setPortscomposantsrequis((PortsComposantsRequis)newValue);
				return;
			case ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS__ROLECONNECTEURSFOURNIS:
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
			case ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS__PORTSCOMPOSANTSREQUIS:
				setPortscomposantsrequis((PortsComposantsRequis)null);
				return;
			case ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS__ROLECONNECTEURSFOURNIS:
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
			case ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS__PORTSCOMPOSANTSREQUIS:
				return portscomposantsrequis != null;
			case ProjecttArchitecturalPackage.ATTACHMENTS_REQUIS_FOURNIS__ROLECONNECTEURSFOURNIS:
				return roleconnecteursfournis != null;
		}
		return super.eIsSet(featureID);
	}

} //AttachmentsRequisFournisImpl
