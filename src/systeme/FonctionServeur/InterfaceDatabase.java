/**
 */
package systeme.FonctionServeur;

import projecttArchitectural.InterfaceComposants;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link systeme.FonctionServeur.InterfaceDatabase#getPortfournis_database_connection <em>Portfournis database connection</em>}</li>
 *   <li>{@link systeme.FonctionServeur.InterfaceDatabase#getPortrequis_database_connection <em>Portrequis database connection</em>}</li>
 *   <li>{@link systeme.FonctionServeur.InterfaceDatabase#getPortfournis_database_security <em>Portfournis database security</em>}</li>
 *   <li>{@link systeme.FonctionServeur.InterfaceDatabase#getPortrequis_database_security <em>Portrequis database security</em>}</li>
 * </ul>
 *
 * @see systeme.FonctionServeur.FonctionServeurPackage#getInterfaceDatabase()
 * @model
 * @generated
 */
public interface InterfaceDatabase extends InterfaceComposants {
	/**
	 * Returns the value of the '<em><b>Portfournis database connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portfournis database connection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portfournis database connection</em>' reference.
	 * @see #setPortfournis_database_connection(PortFournis_database_Connection)
	 * @see systeme.FonctionServeur.FonctionServeurPackage#getInterfaceDatabase_Portfournis_database_connection()
	 * @model
	 * @generated
	 */
	PortFournis_database_Connection getPortfournis_database_connection();

	/**
	 * Sets the value of the '{@link systeme.FonctionServeur.InterfaceDatabase#getPortfournis_database_connection <em>Portfournis database connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portfournis database connection</em>' reference.
	 * @see #getPortfournis_database_connection()
	 * @generated
	 */
	void setPortfournis_database_connection(PortFournis_database_Connection value);

	/**
	 * Returns the value of the '<em><b>Portrequis database connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portrequis database connection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portrequis database connection</em>' reference.
	 * @see #setPortrequis_database_connection(PortRequis_database_Connection)
	 * @see systeme.FonctionServeur.FonctionServeurPackage#getInterfaceDatabase_Portrequis_database_connection()
	 * @model
	 * @generated
	 */
	PortRequis_database_Connection getPortrequis_database_connection();

	/**
	 * Sets the value of the '{@link systeme.FonctionServeur.InterfaceDatabase#getPortrequis_database_connection <em>Portrequis database connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portrequis database connection</em>' reference.
	 * @see #getPortrequis_database_connection()
	 * @generated
	 */
	void setPortrequis_database_connection(PortRequis_database_Connection value);

	/**
	 * Returns the value of the '<em><b>Portfournis database security</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portfournis database security</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portfournis database security</em>' reference.
	 * @see #setPortfournis_database_security(PortFournis_database_Security)
	 * @see systeme.FonctionServeur.FonctionServeurPackage#getInterfaceDatabase_Portfournis_database_security()
	 * @model
	 * @generated
	 */
	PortFournis_database_Security getPortfournis_database_security();

	/**
	 * Sets the value of the '{@link systeme.FonctionServeur.InterfaceDatabase#getPortfournis_database_security <em>Portfournis database security</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portfournis database security</em>' reference.
	 * @see #getPortfournis_database_security()
	 * @generated
	 */
	void setPortfournis_database_security(PortFournis_database_Security value);

	/**
	 * Returns the value of the '<em><b>Portrequis database security</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portrequis database security</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portrequis database security</em>' reference.
	 * @see #setPortrequis_database_security(PortRequis_database_Security)
	 * @see systeme.FonctionServeur.FonctionServeurPackage#getInterfaceDatabase_Portrequis_database_security()
	 * @model
	 * @generated
	 */
	PortRequis_database_Security getPortrequis_database_security();

	/**
	 * Sets the value of the '{@link systeme.FonctionServeur.InterfaceDatabase#getPortrequis_database_security <em>Portrequis database security</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portrequis database security</em>' reference.
	 * @see #getPortrequis_database_security()
	 * @generated
	 */
	void setPortrequis_database_security(PortRequis_database_Security value);

} // InterfaceDatabase
