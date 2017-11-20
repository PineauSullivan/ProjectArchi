/**
 */
package projecttArchitectural.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projecttArchitectural.AttachmentFournisRequis;
import projecttArchitectural.PortsComposantsFournis;
import projecttArchitectural.ProjecttArchitecturalPackage;
import projecttArchitectural.RoleConnecteursRequis;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment Fournis Requis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projecttArchitectural.impl.AttachmentFournisRequisImpl#getPortscomposantsfournis <em>Portscomposantsfournis</em>}</li>
 *   <li>{@link projecttArchitectural.impl.AttachmentFournisRequisImpl#getRoleconnecteursrequis <em>Roleconnecteursrequis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachmentFournisRequisImpl extends AttachmentImpl implements AttachmentFournisRequis {
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
	protected AttachmentFournisRequisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjecttArchitecturalPackage.Literals.ATTACHMENT_FOURNIS_REQUIS;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS__PORTSCOMPOSANTSFOURNIS, oldPortscomposantsfournis, portscomposantsfournis));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS__PORTSCOMPOSANTSFOURNIS, oldPortscomposantsfournis, portscomposantsfournis));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS__ROLECONNECTEURSREQUIS, oldRoleconnecteursrequis, roleconnecteursrequis));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS__ROLECONNECTEURSREQUIS, oldRoleconnecteursrequis, roleconnecteursrequis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS__PORTSCOMPOSANTSFOURNIS:
				if (resolve) return getPortscomposantsfournis();
				return basicGetPortscomposantsfournis();
			case ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS__ROLECONNECTEURSREQUIS:
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
			case ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS__PORTSCOMPOSANTSFOURNIS:
				setPortscomposantsfournis((PortsComposantsFournis)newValue);
				return;
			case ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS__ROLECONNECTEURSREQUIS:
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
			case ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS__PORTSCOMPOSANTSFOURNIS:
				setPortscomposantsfournis((PortsComposantsFournis)null);
				return;
			case ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS__ROLECONNECTEURSREQUIS:
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
			case ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS__PORTSCOMPOSANTSFOURNIS:
				return portscomposantsfournis != null;
			case ProjecttArchitecturalPackage.ATTACHMENT_FOURNIS_REQUIS__ROLECONNECTEURSREQUIS:
				return roleconnecteursrequis != null;
		}
		return super.eIsSet(featureID);
	}

} //AttachmentFournisRequisImpl
