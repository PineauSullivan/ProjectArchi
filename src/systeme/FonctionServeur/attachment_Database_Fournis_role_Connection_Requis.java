/**
 */
package systeme.FonctionServeur;

import projecttArchitectural.AttachmentFournisRequis;
import projecttArchitectural.RoleConnecteursRequis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>attachment Database Fournis role Connection Requis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link systeme.FonctionServeur.attachment_Database_Fournis_role_Connection_Requis#getPortfournis_database_connection <em>Portfournis database connection</em>}</li>
 *   <li>{@link systeme.FonctionServeur.attachment_Database_Fournis_role_Connection_Requis#getRolerequis_connectionmanager_database <em>Rolerequis connectionmanager database</em>}</li>
 * </ul>
 *
 * @see systeme.FonctionServeur.FonctionServeurPackage#getattachment_Database_Fournis_role_Connection_Requis()
 * @model
 * @generated
 */
public interface attachment_Database_Fournis_role_Connection_Requis extends AttachmentFournisRequis {
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
	 * @see systeme.FonctionServeur.FonctionServeurPackage#getattachment_Database_Fournis_role_Connection_Requis_Portfournis_database_connection()
	 * @model
	 * @generated
	 */
	PortFournis_database_Connection getPortfournis_database_connection();

	/**
	 * Sets the value of the '{@link systeme.FonctionServeur.attachment_Database_Fournis_role_Connection_Requis#getPortfournis_database_connection <em>Portfournis database connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portfournis database connection</em>' reference.
	 * @see #getPortfournis_database_connection()
	 * @generated
	 */
	void setPortfournis_database_connection(PortFournis_database_Connection value);

	/**
	 * Returns the value of the '<em><b>Rolerequis connectionmanager database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rolerequis connectionmanager database</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rolerequis connectionmanager database</em>' reference.
	 * @see #setRolerequis_connectionmanager_database(RoleConnecteursRequis)
	 * @see systeme.FonctionServeur.FonctionServeurPackage#getattachment_Database_Fournis_role_Connection_Requis_Rolerequis_connectionmanager_database()
	 * @model type="systeme.FonctionServeur.RoleRequis_ConnectionManager_Database"
	 * @generated
	 */
	RoleConnecteursRequis getRolerequis_connectionmanager_database();

	/**
	 * Sets the value of the '{@link systeme.FonctionServeur.attachment_Database_Fournis_role_Connection_Requis#getRolerequis_connectionmanager_database <em>Rolerequis connectionmanager database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rolerequis connectionmanager database</em>' reference.
	 * @see #getRolerequis_connectionmanager_database()
	 * @generated
	 */
	void setRolerequis_connectionmanager_database(RoleConnecteursRequis value);

} // attachment_Database_Fournis_role_Connection_Requis
