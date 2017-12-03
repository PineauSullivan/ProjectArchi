/**
 */
package systeme.FonctionServeur;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Glue Serveur5</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link systeme.FonctionServeur.GlueServeur5#getRolefournis_database_connection <em>Rolefournis database connection</em>}</li>
 *   <li>{@link systeme.FonctionServeur.GlueServeur5#getRolerequis_database_connection <em>Rolerequis database connection</em>}</li>
 * </ul>
 *
 * @see systeme.FonctionServeur.FonctionServeurPackage#getGlueServeur5()
 * @model
 * @generated
 */
public interface GlueServeur5 extends EObject {
	/**
	 * Returns the value of the '<em><b>Rolefournis database connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rolefournis database connection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rolefournis database connection</em>' reference.
	 * @see #setRolefournis_database_connection(RoleFournis_Database_Connection)
	 * @see systeme.FonctionServeur.FonctionServeurPackage#getGlueServeur5_Rolefournis_database_connection()
	 * @model
	 * @generated
	 */
	RoleFournis_Database_Connection getRolefournis_database_connection();

	/**
	 * Sets the value of the '{@link systeme.FonctionServeur.GlueServeur5#getRolefournis_database_connection <em>Rolefournis database connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rolefournis database connection</em>' reference.
	 * @see #getRolefournis_database_connection()
	 * @generated
	 */
	void setRolefournis_database_connection(RoleFournis_Database_Connection value);

	/**
	 * Returns the value of the '<em><b>Rolerequis database connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rolerequis database connection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rolerequis database connection</em>' reference.
	 * @see #setRolerequis_database_connection(RoleRequis_Database_Connection)
	 * @see systeme.FonctionServeur.FonctionServeurPackage#getGlueServeur5_Rolerequis_database_connection()
	 * @model
	 * @generated
	 */
	RoleRequis_Database_Connection getRolerequis_database_connection();

	/**
	 * Sets the value of the '{@link systeme.FonctionServeur.GlueServeur5#getRolerequis_database_connection <em>Rolerequis database connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rolerequis database connection</em>' reference.
	 * @see #getRolerequis_database_connection()
	 * @generated
	 */
	void setRolerequis_database_connection(RoleRequis_Database_Connection value);

} // GlueServeur5
