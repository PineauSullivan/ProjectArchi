/**
 */
package systeme.ClientServeur.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projecttArchitectural.Glue;

import projecttArchitectural.impl.GlueImpl;

import systeme.ClientServeur.CalledServeur;
import systeme.ClientServeur.CallerServeur;
import systeme.ClientServeur.ClientServeurPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glue CS2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.ClientServeur.impl.GlueCS2Impl#getCallerserveur <em>Callerserveur</em>}</li>
 *   <li>{@link systeme.ClientServeur.impl.GlueCS2Impl#getCalledserveur <em>Calledserveur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlueCS2Impl extends GlueImpl implements Glue {
	/**
	 * The cached value of the '{@link #getCallerserveur() <em>Callerserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallerserveur()
	 * @generated
	 * @ordered
	 */
	protected CallerServeur callerserveur;

	/**
	 * The cached value of the '{@link #getCalledserveur() <em>Calledserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledserveur()
	 * @generated
	 * @ordered
	 */
	protected CalledServeur calledserveur;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlueCS2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClientServeurPackage.Literals.GLUE_CS2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallerServeur getCallerserveur() {
		if (callerserveur != null && callerserveur.eIsProxy()) {
			InternalEObject oldCallerserveur = (InternalEObject)callerserveur;
			callerserveur = (CallerServeur)eResolveProxy(oldCallerserveur);
			if (callerserveur != oldCallerserveur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClientServeurPackage.GLUE_CS2__CALLERSERVEUR, oldCallerserveur, callerserveur));
			}
		}
		return callerserveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallerServeur basicGetCallerserveur() {
		return callerserveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallerserveur(CallerServeur newCallerserveur) {
		CallerServeur oldCallerserveur = callerserveur;
		callerserveur = newCallerserveur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClientServeurPackage.GLUE_CS2__CALLERSERVEUR, oldCallerserveur, callerserveur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalledServeur getCalledserveur() {
		if (calledserveur != null && calledserveur.eIsProxy()) {
			InternalEObject oldCalledserveur = (InternalEObject)calledserveur;
			calledserveur = (CalledServeur)eResolveProxy(oldCalledserveur);
			if (calledserveur != oldCalledserveur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClientServeurPackage.GLUE_CS2__CALLEDSERVEUR, oldCalledserveur, calledserveur));
			}
		}
		return calledserveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalledServeur basicGetCalledserveur() {
		return calledserveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalledserveur(CalledServeur newCalledserveur) {
		CalledServeur oldCalledserveur = calledserveur;
		calledserveur = newCalledserveur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClientServeurPackage.GLUE_CS2__CALLEDSERVEUR, oldCalledserveur, calledserveur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClientServeurPackage.GLUE_CS2__CALLERSERVEUR:
				if (resolve) return getCallerserveur();
				return basicGetCallerserveur();
			case ClientServeurPackage.GLUE_CS2__CALLEDSERVEUR:
				if (resolve) return getCalledserveur();
				return basicGetCalledserveur();
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
			case ClientServeurPackage.GLUE_CS2__CALLERSERVEUR:
				setCallerserveur((CallerServeur)newValue);
				return;
			case ClientServeurPackage.GLUE_CS2__CALLEDSERVEUR:
				setCalledserveur((CalledServeur)newValue);
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
			case ClientServeurPackage.GLUE_CS2__CALLERSERVEUR:
				setCallerserveur((CallerServeur)null);
				return;
			case ClientServeurPackage.GLUE_CS2__CALLEDSERVEUR:
				setCalledserveur((CalledServeur)null);
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
			case ClientServeurPackage.GLUE_CS2__CALLERSERVEUR:
				return callerserveur != null;
			case ClientServeurPackage.GLUE_CS2__CALLEDSERVEUR:
				return calledserveur != null;
		}
		return super.eIsSet(featureID);
	}

} //GlueCS2Impl
