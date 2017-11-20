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

import projecttArchitectural.Configurations;
import projecttArchitectural.Lien;
import projecttArchitectural.ProjecttArchitecturalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configurations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projecttArchitectural.impl.ConfigurationsImpl#getLien <em>Lien</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationsImpl extends ElementImpl implements Configurations {
	/**
	 * The cached value of the '{@link #getLien() <em>Lien</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLien()
	 * @generated
	 * @ordered
	 */
	protected EList<Lien> lien;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjecttArchitecturalPackage.Literals.CONFIGURATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lien> getLien() {
		if (lien == null) {
			lien = new EObjectContainmentEList<Lien>(Lien.class, this, ProjecttArchitecturalPackage.CONFIGURATIONS__LIEN);
		}
		return lien;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProjecttArchitecturalPackage.CONFIGURATIONS__LIEN:
				return ((InternalEList<?>)getLien()).basicRemove(otherEnd, msgs);
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
			case ProjecttArchitecturalPackage.CONFIGURATIONS__LIEN:
				return getLien();
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
			case ProjecttArchitecturalPackage.CONFIGURATIONS__LIEN:
				getLien().clear();
				getLien().addAll((Collection<? extends Lien>)newValue);
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
			case ProjecttArchitecturalPackage.CONFIGURATIONS__LIEN:
				getLien().clear();
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
			case ProjecttArchitecturalPackage.CONFIGURATIONS__LIEN:
				return lien != null && !lien.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationsImpl
