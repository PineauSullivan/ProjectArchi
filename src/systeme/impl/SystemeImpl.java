/**
 */
package systeme.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projecttArchitectural.impl.ConfigurationsImpl;

import systeme.BindingFournisCS;
import systeme.BindingRequisCS;

import systeme.ClientServeur.ConfigurationClientServeur;

import systeme.FonctionServeur.ServeurDetail;

import systeme.Systeme;
import systeme.SystemePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Systeme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.impl.SystemeImpl#getConfigurationclientserveur <em>Configurationclientserveur</em>}</li>
 *   <li>{@link systeme.impl.SystemeImpl#getServeurdetail <em>Serveurdetail</em>}</li>
 *   <li>{@link systeme.impl.SystemeImpl#getBindingrequiscs <em>Bindingrequiscs</em>}</li>
 *   <li>{@link systeme.impl.SystemeImpl#getBindingfourniscs <em>Bindingfourniscs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemeImpl extends ConfigurationsImpl implements Systeme {
	/**
	 * The cached value of the '{@link #getConfigurationclientserveur() <em>Configurationclientserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationclientserveur()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationClientServeur configurationclientserveur;

	/**
	 * The cached value of the '{@link #getServeurdetail() <em>Serveurdetail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServeurdetail()
	 * @generated
	 * @ordered
	 */
	protected ServeurDetail serveurdetail;

	/**
	 * The cached value of the '{@link #getBindingrequiscs() <em>Bindingrequiscs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingrequiscs()
	 * @generated
	 * @ordered
	 */
	protected BindingRequisCS bindingrequiscs;

	/**
	 * The cached value of the '{@link #getBindingfourniscs() <em>Bindingfourniscs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingfourniscs()
	 * @generated
	 * @ordered
	 */
	protected BindingFournisCS bindingfourniscs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemePackage.Literals.SYSTEME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationClientServeur getConfigurationclientserveur() {
		if (configurationclientserveur != null && configurationclientserveur.eIsProxy()) {
			InternalEObject oldConfigurationclientserveur = (InternalEObject)configurationclientserveur;
			configurationclientserveur = (ConfigurationClientServeur)eResolveProxy(oldConfigurationclientserveur);
			if (configurationclientserveur != oldConfigurationclientserveur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemePackage.SYSTEME__CONFIGURATIONCLIENTSERVEUR, oldConfigurationclientserveur, configurationclientserveur));
			}
		}
		return configurationclientserveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationClientServeur basicGetConfigurationclientserveur() {
		return configurationclientserveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationclientserveur(ConfigurationClientServeur newConfigurationclientserveur) {
		ConfigurationClientServeur oldConfigurationclientserveur = configurationclientserveur;
		configurationclientserveur = newConfigurationclientserveur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemePackage.SYSTEME__CONFIGURATIONCLIENTSERVEUR, oldConfigurationclientserveur, configurationclientserveur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServeurDetail getServeurdetail() {
		if (serveurdetail != null && serveurdetail.eIsProxy()) {
			InternalEObject oldServeurdetail = (InternalEObject)serveurdetail;
			serveurdetail = (ServeurDetail)eResolveProxy(oldServeurdetail);
			if (serveurdetail != oldServeurdetail) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemePackage.SYSTEME__SERVEURDETAIL, oldServeurdetail, serveurdetail));
			}
		}
		return serveurdetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServeurDetail basicGetServeurdetail() {
		return serveurdetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServeurdetail(ServeurDetail newServeurdetail) {
		ServeurDetail oldServeurdetail = serveurdetail;
		serveurdetail = newServeurdetail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemePackage.SYSTEME__SERVEURDETAIL, oldServeurdetail, serveurdetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingRequisCS getBindingrequiscs() {
		if (bindingrequiscs != null && bindingrequiscs.eIsProxy()) {
			InternalEObject oldBindingrequiscs = (InternalEObject)bindingrequiscs;
			bindingrequiscs = (BindingRequisCS)eResolveProxy(oldBindingrequiscs);
			if (bindingrequiscs != oldBindingrequiscs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemePackage.SYSTEME__BINDINGREQUISCS, oldBindingrequiscs, bindingrequiscs));
			}
		}
		return bindingrequiscs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingRequisCS basicGetBindingrequiscs() {
		return bindingrequiscs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingrequiscs(BindingRequisCS newBindingrequiscs) {
		BindingRequisCS oldBindingrequiscs = bindingrequiscs;
		bindingrequiscs = newBindingrequiscs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemePackage.SYSTEME__BINDINGREQUISCS, oldBindingrequiscs, bindingrequiscs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingFournisCS getBindingfourniscs() {
		if (bindingfourniscs != null && bindingfourniscs.eIsProxy()) {
			InternalEObject oldBindingfourniscs = (InternalEObject)bindingfourniscs;
			bindingfourniscs = (BindingFournisCS)eResolveProxy(oldBindingfourniscs);
			if (bindingfourniscs != oldBindingfourniscs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemePackage.SYSTEME__BINDINGFOURNISCS, oldBindingfourniscs, bindingfourniscs));
			}
		}
		return bindingfourniscs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingFournisCS basicGetBindingfourniscs() {
		return bindingfourniscs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingfourniscs(BindingFournisCS newBindingfourniscs) {
		BindingFournisCS oldBindingfourniscs = bindingfourniscs;
		bindingfourniscs = newBindingfourniscs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemePackage.SYSTEME__BINDINGFOURNISCS, oldBindingfourniscs, bindingfourniscs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemePackage.SYSTEME__CONFIGURATIONCLIENTSERVEUR:
				if (resolve) return getConfigurationclientserveur();
				return basicGetConfigurationclientserveur();
			case SystemePackage.SYSTEME__SERVEURDETAIL:
				if (resolve) return getServeurdetail();
				return basicGetServeurdetail();
			case SystemePackage.SYSTEME__BINDINGREQUISCS:
				if (resolve) return getBindingrequiscs();
				return basicGetBindingrequiscs();
			case SystemePackage.SYSTEME__BINDINGFOURNISCS:
				if (resolve) return getBindingfourniscs();
				return basicGetBindingfourniscs();
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
			case SystemePackage.SYSTEME__CONFIGURATIONCLIENTSERVEUR:
				setConfigurationclientserveur((ConfigurationClientServeur)newValue);
				return;
			case SystemePackage.SYSTEME__SERVEURDETAIL:
				setServeurdetail((ServeurDetail)newValue);
				return;
			case SystemePackage.SYSTEME__BINDINGREQUISCS:
				setBindingrequiscs((BindingRequisCS)newValue);
				return;
			case SystemePackage.SYSTEME__BINDINGFOURNISCS:
				setBindingfourniscs((BindingFournisCS)newValue);
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
			case SystemePackage.SYSTEME__CONFIGURATIONCLIENTSERVEUR:
				setConfigurationclientserveur((ConfigurationClientServeur)null);
				return;
			case SystemePackage.SYSTEME__SERVEURDETAIL:
				setServeurdetail((ServeurDetail)null);
				return;
			case SystemePackage.SYSTEME__BINDINGREQUISCS:
				setBindingrequiscs((BindingRequisCS)null);
				return;
			case SystemePackage.SYSTEME__BINDINGFOURNISCS:
				setBindingfourniscs((BindingFournisCS)null);
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
			case SystemePackage.SYSTEME__CONFIGURATIONCLIENTSERVEUR:
				return configurationclientserveur != null;
			case SystemePackage.SYSTEME__SERVEURDETAIL:
				return serveurdetail != null;
			case SystemePackage.SYSTEME__BINDINGREQUISCS:
				return bindingrequiscs != null;
			case SystemePackage.SYSTEME__BINDINGFOURNISCS:
				return bindingfourniscs != null;
		}
		return super.eIsSet(featureID);
	}

} //SystemeImpl
