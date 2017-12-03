/**
 */
package systeme;

import projecttArchitectural.Configurations;

import systeme.ClientServeur.ConfigurationClientServeur;

import systeme.FonctionServeur.ServeurDetail;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Systeme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link systeme.Systeme#getConfigurationclientserveur <em>Configurationclientserveur</em>}</li>
 *   <li>{@link systeme.Systeme#getServeurdetail <em>Serveurdetail</em>}</li>
 *   <li>{@link systeme.Systeme#getBindingrequiscs <em>Bindingrequiscs</em>}</li>
 *   <li>{@link systeme.Systeme#getBindingfourniscs <em>Bindingfourniscs</em>}</li>
 * </ul>
 *
 * @see systeme.SystemePackage#getSysteme()
 * @model
 * @generated
 */
public interface Systeme extends Configurations {
	/**
	 * Returns the value of the '<em><b>Configurationclientserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurationclientserveur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurationclientserveur</em>' reference.
	 * @see #setConfigurationclientserveur(ConfigurationClientServeur)
	 * @see systeme.SystemePackage#getSysteme_Configurationclientserveur()
	 * @model
	 * @generated
	 */
	ConfigurationClientServeur getConfigurationclientserveur();

	/**
	 * Sets the value of the '{@link systeme.Systeme#getConfigurationclientserveur <em>Configurationclientserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configurationclientserveur</em>' reference.
	 * @see #getConfigurationclientserveur()
	 * @generated
	 */
	void setConfigurationclientserveur(ConfigurationClientServeur value);

	/**
	 * Returns the value of the '<em><b>Serveurdetail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serveurdetail</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serveurdetail</em>' reference.
	 * @see #setServeurdetail(ServeurDetail)
	 * @see systeme.SystemePackage#getSysteme_Serveurdetail()
	 * @model
	 * @generated
	 */
	ServeurDetail getServeurdetail();

	/**
	 * Sets the value of the '{@link systeme.Systeme#getServeurdetail <em>Serveurdetail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serveurdetail</em>' reference.
	 * @see #getServeurdetail()
	 * @generated
	 */
	void setServeurdetail(ServeurDetail value);

	/**
	 * Returns the value of the '<em><b>Bindingrequiscs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindingrequiscs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindingrequiscs</em>' reference.
	 * @see #setBindingrequiscs(BindingRequisCS)
	 * @see systeme.SystemePackage#getSysteme_Bindingrequiscs()
	 * @model
	 * @generated
	 */
	BindingRequisCS getBindingrequiscs();

	/**
	 * Sets the value of the '{@link systeme.Systeme#getBindingrequiscs <em>Bindingrequiscs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bindingrequiscs</em>' reference.
	 * @see #getBindingrequiscs()
	 * @generated
	 */
	void setBindingrequiscs(BindingRequisCS value);

	/**
	 * Returns the value of the '<em><b>Bindingfourniscs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindingfourniscs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindingfourniscs</em>' reference.
	 * @see #setBindingfourniscs(BindingFournisCS)
	 * @see systeme.SystemePackage#getSysteme_Bindingfourniscs()
	 * @model
	 * @generated
	 */
	BindingFournisCS getBindingfourniscs();

	/**
	 * Sets the value of the '{@link systeme.Systeme#getBindingfourniscs <em>Bindingfourniscs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bindingfourniscs</em>' reference.
	 * @see #getBindingfourniscs()
	 * @generated
	 */
	void setBindingfourniscs(BindingFournisCS value);

} // Systeme
