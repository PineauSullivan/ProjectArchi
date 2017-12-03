/**
 */
package systeme.FonctionServeur;

import projecttArchitectural.AttachmentsRequisFournis;
import projecttArchitectural.RoleConnecteursFournis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>attachment Database Requis role connection fournis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link systeme.FonctionServeur.attachment_Database_Requis_role_connection_fournis#getPortrequis_database_connection <em>Portrequis database connection</em>}</li>
 *   <li>{@link systeme.FonctionServeur.attachment_Database_Requis_role_connection_fournis#getRolefournis_connectionmanager_database <em>Rolefournis connectionmanager database</em>}</li>
 * </ul>
 *
 * @see systeme.FonctionServeur.FonctionServeurPackage#getattachment_Database_Requis_role_connection_fournis()
 * @model
 * @generated
 */
public interface attachment_Database_Requis_role_connection_fournis extends AttachmentsRequisFournis {
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
	 * @see systeme.FonctionServeur.FonctionServeurPackage#getattachment_Database_Requis_role_connection_fournis_Portrequis_database_connection()
	 * @model
	 * @generated
	 */
	PortRequis_database_Connection getPortrequis_database_connection();

	/**
	 * Sets the value of the '{@link systeme.FonctionServeur.attachment_Database_Requis_role_connection_fournis#getPortrequis_database_connection <em>Portrequis database connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portrequis database connection</em>' reference.
	 * @see #getPortrequis_database_connection()
	 * @generated
	 */
	void setPortrequis_database_connection(PortRequis_database_Connection value);

	/**
	 * Returns the value of the '<em><b>Rolefournis connectionmanager database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rolefournis connectionmanager database</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rolefournis connectionmanager database</em>' reference.
	 * @see #setRolefournis_connectionmanager_database(RoleConnecteursFournis)
	 * @see systeme.FonctionServeur.FonctionServeurPackage#getattachment_Database_Requis_role_connection_fournis_Rolefournis_connectionmanager_database()
	 * @model type="systeme.FonctionServeur.RoleFournis_ConnectionManager_Database"
	 * @generated
	 */
	RoleConnecteursFournis getRolefournis_connectionmanager_database();

	/**
	 * Sets the value of the '{@link systeme.FonctionServeur.attachment_Database_Requis_role_connection_fournis#getRolefournis_connectionmanager_database <em>Rolefournis connectionmanager database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rolefournis connectionmanager database</em>' reference.
	 * @see #getRolefournis_connectionmanager_database()
	 * @generated
	 */
	void setRolefournis_connectionmanager_database(RoleConnecteursFournis value);

} // attachment_Database_Requis_role_connection_fournis
