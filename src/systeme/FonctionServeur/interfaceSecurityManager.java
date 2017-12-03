/**
 */
package systeme.FonctionServeur;

import projecttArchitectural.InterfaceComposants;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>interface Security Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link systeme.FonctionServeur.interfaceSecurityManager#getPortfournis_security_connection <em>Portfournis security connection</em>}</li>
 *   <li>{@link systeme.FonctionServeur.interfaceSecurityManager#getPortrequis_security_connection <em>Portrequis security connection</em>}</li>
 *   <li>{@link systeme.FonctionServeur.interfaceSecurityManager#getPortfournis_security_database <em>Portfournis security database</em>}</li>
 *   <li>{@link systeme.FonctionServeur.interfaceSecurityManager#getPortrequis_security_database <em>Portrequis security database</em>}</li>
 * </ul>
 *
 * @see systeme.FonctionServeur.FonctionServeurPackage#getinterfaceSecurityManager()
 * @model
 * @generated
 */
public interface interfaceSecurityManager extends InterfaceComposants {
	/**
	 * Returns the value of the '<em><b>Portfournis security connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portfournis security connection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portfournis security connection</em>' reference.
	 * @see #setPortfournis_security_connection(PortFournis_Security_Connection)
	 * @see systeme.FonctionServeur.FonctionServeurPackage#getinterfaceSecurityManager_Portfournis_security_connection()
	 * @model
	 * @generated
	 */
	PortFournis_Security_Connection getPortfournis_security_connection();

	/**
	 * Sets the value of the '{@link systeme.FonctionServeur.interfaceSecurityManager#getPortfournis_security_connection <em>Portfournis security connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portfournis security connection</em>' reference.
	 * @see #getPortfournis_security_connection()
	 * @generated
	 */
	void setPortfournis_security_connection(PortFournis_Security_Connection value);

	/**
	 * Returns the value of the '<em><b>Portrequis security connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portrequis security connection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portrequis security connection</em>' reference.
	 * @see #setPortrequis_security_connection(PortRequis_Security_Connection)
	 * @see systeme.FonctionServeur.FonctionServeurPackage#getinterfaceSecurityManager_Portrequis_security_connection()
	 * @model
	 * @generated
	 */
	PortRequis_Security_Connection getPortrequis_security_connection();

	/**
	 * Sets the value of the '{@link systeme.FonctionServeur.interfaceSecurityManager#getPortrequis_security_connection <em>Portrequis security connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portrequis security connection</em>' reference.
	 * @see #getPortrequis_security_connection()
	 * @generated
	 */
	void setPortrequis_security_connection(PortRequis_Security_Connection value);

	/**
	 * Returns the value of the '<em><b>Portfournis security database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portfournis security database</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portfournis security database</em>' reference.
	 * @see #setPortfournis_security_database(PortFournis_Security_Database)
	 * @see systeme.FonctionServeur.FonctionServeurPackage#getinterfaceSecurityManager_Portfournis_security_database()
	 * @model
	 * @generated
	 */
	PortFournis_Security_Database getPortfournis_security_database();

	/**
	 * Sets the value of the '{@link systeme.FonctionServeur.interfaceSecurityManager#getPortfournis_security_database <em>Portfournis security database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portfournis security database</em>' reference.
	 * @see #getPortfournis_security_database()
	 * @generated
	 */
	void setPortfournis_security_database(PortFournis_Security_Database value);

	/**
	 * Returns the value of the '<em><b>Portrequis security database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portrequis security database</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portrequis security database</em>' reference.
	 * @see #setPortrequis_security_database(PortRequis_Security_Database)
	 * @see systeme.FonctionServeur.FonctionServeurPackage#getinterfaceSecurityManager_Portrequis_security_database()
	 * @model
	 * @generated
	 */
	PortRequis_Security_Database getPortrequis_security_database();

	/**
	 * Sets the value of the '{@link systeme.FonctionServeur.interfaceSecurityManager#getPortrequis_security_database <em>Portrequis security database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portrequis security database</em>' reference.
	 * @see #getPortrequis_security_database()
	 * @generated
	 */
	void setPortrequis_security_database(PortRequis_Security_Database value);

} // interfaceSecurityManager
