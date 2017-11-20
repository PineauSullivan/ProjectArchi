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

import projecttArchitectural.Glue;
import projecttArchitectural.ProjecttArchitecturalPackage;
import projecttArchitectural.RoleConnecteurs;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projecttArchitectural.impl.GlueImpl#getRoleconnecteurs <em>Roleconnecteurs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlueImpl extends MinimalEObjectImpl.Container implements Glue {
	/**
	 * The cached value of the '{@link #getRoleconnecteurs() <em>Roleconnecteurs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleconnecteurs()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleConnecteurs> roleconnecteurs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjecttArchitecturalPackage.Literals.GLUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleConnecteurs> getRoleconnecteurs() {
		if (roleconnecteurs == null) {
			roleconnecteurs = new EObjectContainmentEList<RoleConnecteurs>(RoleConnecteurs.class, this, ProjecttArchitecturalPackage.GLUE__ROLECONNECTEURS);
		}
		return roleconnecteurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProjecttArchitecturalPackage.GLUE__ROLECONNECTEURS:
				return ((InternalEList<?>)getRoleconnecteurs()).basicRemove(otherEnd, msgs);
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
			case ProjecttArchitecturalPackage.GLUE__ROLECONNECTEURS:
				return getRoleconnecteurs();
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
			case ProjecttArchitecturalPackage.GLUE__ROLECONNECTEURS:
				getRoleconnecteurs().clear();
				getRoleconnecteurs().addAll((Collection<? extends RoleConnecteurs>)newValue);
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
			case ProjecttArchitecturalPackage.GLUE__ROLECONNECTEURS:
				getRoleconnecteurs().clear();
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
			case ProjecttArchitecturalPackage.GLUE__ROLECONNECTEURS:
				return roleconnecteurs != null && !roleconnecteurs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GlueImpl
