/**
 */
package systeme.ClientServeur.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projecttArchitectural.Glue;

import projecttArchitectural.impl.ConnecteursImpl;

import systeme.ClientServeur.CalledClient;
import systeme.ClientServeur.CalledServeur;
import systeme.ClientServeur.CallerClient;
import systeme.ClientServeur.CallerServeur;
import systeme.ClientServeur.ClientServeurPackage;
import systeme.ClientServeur.RPC;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RPC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.ClientServeur.impl.RPCImpl#getGluecs1 <em>Gluecs1</em>}</li>
 *   <li>{@link systeme.ClientServeur.impl.RPCImpl#getGluecs2 <em>Gluecs2</em>}</li>
 *   <li>{@link systeme.ClientServeur.impl.RPCImpl#getCallerclient <em>Callerclient</em>}</li>
 *   <li>{@link systeme.ClientServeur.impl.RPCImpl#getCallerserveur <em>Callerserveur</em>}</li>
 *   <li>{@link systeme.ClientServeur.impl.RPCImpl#getCalledclient <em>Calledclient</em>}</li>
 *   <li>{@link systeme.ClientServeur.impl.RPCImpl#getCalledserveur <em>Calledserveur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RPCImpl extends ConnecteursImpl implements RPC {
	/**
	 * The cached value of the '{@link #getGluecs1() <em>Gluecs1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGluecs1()
	 * @generated
	 * @ordered
	 */
	protected Glue gluecs1;

	/**
	 * The cached value of the '{@link #getGluecs2() <em>Gluecs2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGluecs2()
	 * @generated
	 * @ordered
	 */
	protected Glue gluecs2;

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
	 * The cached value of the '{@link #getCallerserveur() <em>Callerserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallerserveur()
	 * @generated
	 * @ordered
	 */
	protected CallerServeur callerserveur;

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
	protected RPCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClientServeurPackage.Literals.RPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue getGluecs1() {
		if (gluecs1 != null && ((EObject)gluecs1).eIsProxy()) {
			InternalEObject oldGluecs1 = (InternalEObject)gluecs1;
			gluecs1 = (Glue)eResolveProxy(oldGluecs1);
			if (gluecs1 != oldGluecs1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClientServeurPackage.RPC__GLUECS1, oldGluecs1, gluecs1));
			}
		}
		return gluecs1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue basicGetGluecs1() {
		return gluecs1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGluecs1(Glue newGluecs1) {
		Glue oldGluecs1 = gluecs1;
		gluecs1 = newGluecs1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClientServeurPackage.RPC__GLUECS1, oldGluecs1, gluecs1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue getGluecs2() {
		if (gluecs2 != null && ((EObject)gluecs2).eIsProxy()) {
			InternalEObject oldGluecs2 = (InternalEObject)gluecs2;
			gluecs2 = (Glue)eResolveProxy(oldGluecs2);
			if (gluecs2 != oldGluecs2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClientServeurPackage.RPC__GLUECS2, oldGluecs2, gluecs2));
			}
		}
		return gluecs2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue basicGetGluecs2() {
		return gluecs2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGluecs2(Glue newGluecs2) {
		Glue oldGluecs2 = gluecs2;
		gluecs2 = newGluecs2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClientServeurPackage.RPC__GLUECS2, oldGluecs2, gluecs2));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClientServeurPackage.RPC__CALLERCLIENT, oldCallerclient, callerclient));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClientServeurPackage.RPC__CALLERCLIENT, oldCallerclient, callerclient));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClientServeurPackage.RPC__CALLERSERVEUR, oldCallerserveur, callerserveur));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClientServeurPackage.RPC__CALLERSERVEUR, oldCallerserveur, callerserveur));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClientServeurPackage.RPC__CALLEDCLIENT, oldCalledclient, calledclient));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClientServeurPackage.RPC__CALLEDCLIENT, oldCalledclient, calledclient));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClientServeurPackage.RPC__CALLEDSERVEUR, oldCalledserveur, calledserveur));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClientServeurPackage.RPC__CALLEDSERVEUR, oldCalledserveur, calledserveur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClientServeurPackage.RPC__GLUECS1:
				if (resolve) return getGluecs1();
				return basicGetGluecs1();
			case ClientServeurPackage.RPC__GLUECS2:
				if (resolve) return getGluecs2();
				return basicGetGluecs2();
			case ClientServeurPackage.RPC__CALLERCLIENT:
				if (resolve) return getCallerclient();
				return basicGetCallerclient();
			case ClientServeurPackage.RPC__CALLERSERVEUR:
				if (resolve) return getCallerserveur();
				return basicGetCallerserveur();
			case ClientServeurPackage.RPC__CALLEDCLIENT:
				if (resolve) return getCalledclient();
				return basicGetCalledclient();
			case ClientServeurPackage.RPC__CALLEDSERVEUR:
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
			case ClientServeurPackage.RPC__GLUECS1:
				setGluecs1((Glue)newValue);
				return;
			case ClientServeurPackage.RPC__GLUECS2:
				setGluecs2((Glue)newValue);
				return;
			case ClientServeurPackage.RPC__CALLERCLIENT:
				setCallerclient((CallerClient)newValue);
				return;
			case ClientServeurPackage.RPC__CALLERSERVEUR:
				setCallerserveur((CallerServeur)newValue);
				return;
			case ClientServeurPackage.RPC__CALLEDCLIENT:
				setCalledclient((CalledClient)newValue);
				return;
			case ClientServeurPackage.RPC__CALLEDSERVEUR:
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
			case ClientServeurPackage.RPC__GLUECS1:
				setGluecs1((Glue)null);
				return;
			case ClientServeurPackage.RPC__GLUECS2:
				setGluecs2((Glue)null);
				return;
			case ClientServeurPackage.RPC__CALLERCLIENT:
				setCallerclient((CallerClient)null);
				return;
			case ClientServeurPackage.RPC__CALLERSERVEUR:
				setCallerserveur((CallerServeur)null);
				return;
			case ClientServeurPackage.RPC__CALLEDCLIENT:
				setCalledclient((CalledClient)null);
				return;
			case ClientServeurPackage.RPC__CALLEDSERVEUR:
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
			case ClientServeurPackage.RPC__GLUECS1:
				return gluecs1 != null;
			case ClientServeurPackage.RPC__GLUECS2:
				return gluecs2 != null;
			case ClientServeurPackage.RPC__CALLERCLIENT:
				return callerclient != null;
			case ClientServeurPackage.RPC__CALLERSERVEUR:
				return callerserveur != null;
			case ClientServeurPackage.RPC__CALLEDCLIENT:
				return calledclient != null;
			case ClientServeurPackage.RPC__CALLEDSERVEUR:
				return calledserveur != null;
		}
		return super.eIsSet(featureID);
	}

} //RPCImpl
