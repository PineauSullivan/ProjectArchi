/**
 */
package systeme.ClientServeur.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projecttArchitectural.Glue;

import projecttArchitectural.impl.GlueImpl;

import systeme.ClientServeur.CalledClient;
import systeme.ClientServeur.CallerClient;
import systeme.ClientServeur.ClientServeurPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glue CS1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.ClientServeur.impl.GlueCS1Impl#getCallerclient <em>Callerclient</em>}</li>
 *   <li>{@link systeme.ClientServeur.impl.GlueCS1Impl#getCalledclient <em>Calledclient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlueCS1Impl extends GlueImpl implements Glue {
	/**
	 * The cached value of the '{@link #getCallerclient() <em>Callerclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallerclient()
	 * @generated
	 * @ordered
	 */
	protected CallerClient callerclient;

	/**
	 * The cached value of the '{@link #getCalledclient() <em>Calledclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledclient()
	 * @generated
	 * @ordered
	 */
	protected CalledClient calledclient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlueCS1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClientServeurPackage.Literals.GLUE_CS1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallerClient getCallerclient() {
		if (callerclient != null && callerclient.eIsProxy()) {
			InternalEObject oldCallerclient = (InternalEObject)callerclient;
			callerclient = (CallerClient)eResolveProxy(oldCallerclient);
			if (callerclient != oldCallerclient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClientServeurPackage.GLUE_CS1__CALLERCLIENT, oldCallerclient, callerclient));
			}
		}
		return callerclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallerClient basicGetCallerclient() {
		return callerclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallerclient(CallerClient newCallerclient) {
		CallerClient oldCallerclient = callerclient;
		callerclient = newCallerclient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClientServeurPackage.GLUE_CS1__CALLERCLIENT, oldCallerclient, callerclient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalledClient getCalledclient() {
		if (calledclient != null && calledclient.eIsProxy()) {
			InternalEObject oldCalledclient = (InternalEObject)calledclient;
			calledclient = (CalledClient)eResolveProxy(oldCalledclient);
			if (calledclient != oldCalledclient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClientServeurPackage.GLUE_CS1__CALLEDCLIENT, oldCalledclient, calledclient));
			}
		}
		return calledclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalledClient basicGetCalledclient() {
		return calledclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalledclient(CalledClient newCalledclient) {
		CalledClient oldCalledclient = calledclient;
		calledclient = newCalledclient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClientServeurPackage.GLUE_CS1__CALLEDCLIENT, oldCalledclient, calledclient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClientServeurPackage.GLUE_CS1__CALLERCLIENT:
				if (resolve) return getCallerclient();
				return basicGetCallerclient();
			case ClientServeurPackage.GLUE_CS1__CALLEDCLIENT:
				if (resolve) return getCalledclient();
				return basicGetCalledclient();
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
			case ClientServeurPackage.GLUE_CS1__CALLERCLIENT:
				setCallerclient((CallerClient)newValue);
				return;
			case ClientServeurPackage.GLUE_CS1__CALLEDCLIENT:
				setCalledclient((CalledClient)newValue);
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
			case ClientServeurPackage.GLUE_CS1__CALLERCLIENT:
				setCallerclient((CallerClient)null);
				return;
			case ClientServeurPackage.GLUE_CS1__CALLEDCLIENT:
				setCalledclient((CalledClient)null);
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
			case ClientServeurPackage.GLUE_CS1__CALLERCLIENT:
				return callerclient != null;
			case ClientServeurPackage.GLUE_CS1__CALLEDCLIENT:
				return calledclient != null;
		}
		return super.eIsSet(featureID);
	}

} //GlueCS1Impl
