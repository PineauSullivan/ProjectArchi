/**
 */
package systeme.FonctionServeur;

import projecttArchitectural.Configurations;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Serveur Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link systeme.FonctionServeur.ServeurDetail#getConnectionmanager <em>Connectionmanager</em>}</li>
 *   <li>{@link systeme.FonctionServeur.ServeurDetail#getSecuritymanager <em>Securitymanager</em>}</li>
 *   <li>{@link systeme.FonctionServeur.ServeurDetail#getDatabase <em>Database</em>}</li>
 *   <li>{@link systeme.FonctionServeur.ServeurDetail#getConnecteurserveurd <em>Connecteurserveurd</em>}</li>
 *   <li>{@link systeme.FonctionServeur.ServeurDetail#getAttachment_connectionm_fournis_role_database_requis <em>Attachment connectionm fournis role database requis</em>}</li>
 *   <li>{@link systeme.FonctionServeur.ServeurDetail#getAttachment_connectionm_requis_role_database_fournis <em>Attachment connectionm requis role database fournis</em>}</li>
 *   <li>{@link systeme.FonctionServeur.ServeurDetail#getAttachment_connectionm_requis_role_security_fournis <em>Attachment connectionm requis role security fournis</em>}</li>
 *   <li>{@link systeme.FonctionServeur.ServeurDetail#getAttachment_connectionm_fournis_role_security_requis <em>Attachment connectionm fournis role security requis</em>}</li>
 *   <li>{@link systeme.FonctionServeur.ServeurDetail#getAttachment_security_requis_role_connection_fournis <em>Attachment security requis role connection fournis</em>}</li>
 *   <li>{@link systeme.FonctionServeur.ServeurDetail#getAttachment_security_fournis_role_connection_requis <em>Attachment security fournis role connection requis</em>}</li>
 *   <li>{@link systeme.FonctionServeur.ServeurDetail#getAttachment_security_requis_role_database_fournis <em>Attachment security requis role database fournis</em>}</li>
 *   <li>{@link systeme.FonctionServeur.ServeurDetail#getAttachment_security_fournis_role_database_requis <em>Attachment security fournis role database requis</em>}</li>
 *   <li>{@link systeme.FonctionServeur.ServeurDetail#getAttachment_database_requis_role_connection_fournis <em>Attachment database requis role connection fournis</em>}</li>
 *   <li>{@link systeme.FonctionServeur.ServeurDetail#getAttachment_database_fournis_role_connection_requis <em>Attachment database fournis role connection requis</em>}</li>
 *   <li>{@link systeme.FonctionServeur.ServeurDetail#getAttachment_database_requis_role_security_fournis <em>Attachment database requis role security fournis</em>}</li>
 *   <li>{@link systeme.FonctionServeur.ServeurDetail#getAttachment_database_fournis_role_security_requis <em>Attachment database fournis role security requis</em>}</li>
 * </ul>
 *
 * @see systeme.FonctionServeur.FonctionServeurPackage#getServeurDetail()
 * @model
 * @generated
 */
public interface ServeurDetail extends Configurations {
	/**
	 * Returns the value of the '<em><b>Connectionmanager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectionmanager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectionmanager</em>' reference.
	 * @see #setConnectionmanager(ConnectionManager)
	 * @see systeme.FonctionServeur.FonctionServeurPackage#getServeurDetail_Connectionmanager()
	 * @model
	 * @generated
	 */
	ConnectionManager getConnectionmanager();

	/**
	 * Sets the value of the '{@link systeme.FonctionServeur.ServeurDetail#getConnectionmanager <em>Connectionmanager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectionmanager</em>' reference.
	 * @see #getConnectionmanager()
	 * @generated
	 */
	void setConnectionmanager(ConnectionManager value);

	/**
	 * Returns the value of the '<em><b>Securitymanager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securitymanager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securitymanager</em>' reference.
	 * @see #setSecuritymanager(systeme.FonctionServeur.SecurityManager)
	 * @see systeme.FonctionServeur.FonctionServeurPackage#getServeurDetail_Securitymanager()
	 * @model
	 * @generated
	 */
	systeme.FonctionServeur.SecurityManager getSecuritymanager();

	/**
	 * Sets the value of the '{@link systeme.FonctionServeur.ServeurDetail#getSecuritymanager <em>Securitymanager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securitymanager</em>' reference.
	 * @see #getSecuritymanager()
	 * @generated
	 */
	void setSecuritymanager(systeme.FonctionServeur.SecurityManager value);

	/**
	 * Returns the value of the '<em><b>Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' reference.
	 * @see #setDatabase(Database)
	 * @see systeme.FonctionServeur.FonctionServeurPackage#getServeurDetail_Database()
	 * @model
	 * @generated
	 */
	Database getDatabase();

	/**
	 * Sets the value of the '{@link systeme.FonctionServeur.ServeurDetail#getDatabase <em>Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' reference.
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(Database value);

	/**
	 * Returns the value of the '<em><b>Connecteurserveurd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connecteurserveurd</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connecteurserveurd</em>' reference.
	 * @see #setConnecteurserveurd(ConnecteurServeurD)
	 * @see systeme.FonctionServeur.FonctionServeurPackage#getServeurDetail_Connecteurserveurd()
	 * @model
	 * @generated
	 */
	ConnecteurServeurD getConnecteurserveurd();

	/**
	 * Sets the value of the '{@link systeme.FonctionServeur.ServeurDetail#getConnecteurserveurd <em>Connecteurserveurd</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connecteurserveurd</em>' reference.
	 * @see #getConnecteurserveurd()
	 * @generated
	 */
	void setConnecteurserveurd(ConnecteurServeurD value);

	/**
	 * Returns the value of the '<em><b>Attachment connectionm fournis role database requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment connectionm fournis role database requis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment connectionm fournis role database requis</em>' reference.
	 * @see #setAttachment_connectionm_fournis_role_database_requis(attachment_connectionM_Fournis_role_database_Requis)
	 * @see systeme.FonctionServeur.FonctionServeurPackage#getServeurDetail_Attachment_connectionm_fournis_role_database_requis()
	 * @model
	 * @generated
	 */
	attachment_connectionM_Fournis_role_database_Requis getAttachment_connectionm_fournis_role_database_requis();

	/**
	 * Sets the value of the '{@link systeme.FonctionServeur.ServeurDetail#getAttachment_connectionm_fournis_role_database_requis <em>Attachment connectionm fournis role database requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment connectionm fournis role database requis</em>' reference.
	 * @see #getAttachment_connectionm_fournis_role_database_requis()
	 * @generated
	 */
	void setAttachment_connectionm_fournis_role_database_requis(attachment_connectionM_Fournis_role_database_Requis value);

	/**
	 * Returns the value of the '<em><b>Attachment connectionm requis role database fournis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment connectionm requis role database fournis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment connectionm requis role database fournis</em>' reference.
	 * @see #setAttachment_connectionm_requis_role_database_fournis(attachment_connectionM_Requis_role_database_fournis)
	 * @see systeme.FonctionServeur.FonctionServeurPackage#getServeurDetail_Attachment_connectionm_requis_role_database_fournis()
	 * @model
	 * @generated
	 */
	attachment_connectionM_Requis_role_database_fournis getAttachment_connectionm_requis_role_database_fournis();

	/**
	 * Sets the value of the '{@link systeme.FonctionServeur.ServeurDetail#getAttachment_connectionm_requis_role_database_fournis <em>Attachment connectionm requis role database fournis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment connectionm requis role database fournis</em>' reference.
	 * @see #getAttachment_connectionm_requis_role_database_fournis()
	 * @generated
	 */
	void setAttachment_connectionm_requis_role_database_fournis(attachment_connectionM_Requis_role_database_fournis value);

	/**
	 * Returns the value of the '<em><b>Attachment connectionm requis role security fournis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment connectionm requis role security fournis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment connectionm requis role security fournis</em>' reference.
	 * @see #setAttachment_connectionm_requis_role_security_fournis(attachment_connectionM_Requis_role_security_fournis)
	 * @see systeme.FonctionServeur.FonctionServeurPackage#getServeurDetail_Attachment_connectionm_requis_role_security_fournis()
	 * @model
	 * @generated
	 */
	attachment_connectionM_Requis_role_security_fournis getAttachment_connectionm_requis_role_security_fournis();

	/**
	 * Sets the value of the '{@link systeme.FonctionServeur.ServeurDetail#getAttachment_connectionm_requis_role_security_fournis <em>Attachment connectionm requis role security fournis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment connectionm requis role security fournis</em>' reference.
	 * @see #getAttachment_connectionm_requis_role_security_fournis()
	 * @generated
	 */
	void setAttachment_connectionm_requis_role_security_fournis(attachment_connectionM_Requis_role_security_fournis value);

	/**
	 * Returns the value of the '<em><b>Attachment connectionm fournis role security requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment connectionm fournis role security requis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment connectionm fournis role security requis</em>' reference.
	 * @see #setAttachment_connectionm_fournis_role_security_requis(attachment_connectionM_Fournis_role_security_Requis)
	 * @see systeme.FonctionServeur.FonctionServeurPackage#getServeurDetail_Attachment_connectionm_fournis_role_security_requis()
	 * @model
	 * @generated
	 */
	attachment_connectionM_Fournis_role_security_Requis getAttachment_connectionm_fournis_role_security_requis();

	/**
	 * Sets the value of the '{@link systeme.FonctionServeur.ServeurDetail#getAttachment_connectionm_fournis_role_security_requis <em>Attachment connectionm fournis role security requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment connectionm fournis role security requis</em>' reference.
	 * @see #getAttachment_connectionm_fournis_role_security_requis()
	 * @generated
	 */
	void setAttachment_connectionm_fournis_role_security_requis(attachment_connectionM_Fournis_role_security_Requis value);

	/**
	 * Returns the value of the '<em><b>Attachment security requis role connection fournis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment security requis role connection fournis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment security requis role connection fournis</em>' reference.
	 * @see #setAttachment_security_requis_role_connection_fournis(attachment_Security_Requis_role_Connection_fournis)
	 * @see systeme.FonctionServeur.FonctionServeurPackage#getServeurDetail_Attachment_security_requis_role_connection_fournis()
	 * @model
	 * @generated
	 */
	attachment_Security_Requis_role_Connection_fournis getAttachment_security_requis_role_connection_fournis();

	/**
	 * Sets the value of the '{@link systeme.FonctionServeur.ServeurDetail#getAttachment_security_requis_role_connection_fournis <em>Attachment security requis role connection fournis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment security requis role connection fournis</em>' reference.
	 * @see #getAttachment_security_requis_role_connection_fournis()
	 * @generated
	 */
	void setAttachment_security_requis_role_connection_fournis(attachment_Security_Requis_role_Connection_fournis value);

	/**
	 * Returns the value of the '<em><b>Attachment security fournis role connection requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment security fournis role connection requis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment security fournis role connection requis</em>' reference.
	 * @see #setAttachment_security_fournis_role_connection_requis(attachment_Security_Fournis_role_Connection_Requis)
	 * @see systeme.FonctionServeur.FonctionServeurPackage#getServeurDetail_Attachment_security_fournis_role_connection_requis()
	 * @model
	 * @generated
	 */
	attachment_Security_Fournis_role_Connection_Requis getAttachment_security_fournis_role_connection_requis();

	/**
	 * Sets the value of the '{@link systeme.FonctionServeur.ServeurDetail#getAttachment_security_fournis_role_connection_requis <em>Attachment security fournis role connection requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment security fournis role connection requis</em>' reference.
	 * @see #getAttachment_security_fournis_role_connection_requis()
	 * @generated
	 */
	void setAttachment_security_fournis_role_connection_requis(attachment_Security_Fournis_role_Connection_Requis value);

	/**
	 * Returns the value of the '<em><b>Attachment security requis role database fournis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment security requis role database fournis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment security requis role database fournis</em>' reference.
	 * @see #setAttachment_security_requis_role_database_fournis(attachment_Security_Requis_role_Database_fournis)
	 * @see systeme.FonctionServeur.FonctionServeurPackage#getServeurDetail_Attachment_security_requis_role_database_fournis()
	 * @model
	 * @generated
	 */
	attachment_Security_Requis_role_Database_fournis getAttachment_security_requis_role_database_fournis();

	/**
	 * Sets the value of the '{@link systeme.FonctionServeur.ServeurDetail#getAttachment_security_requis_role_database_fournis <em>Attachment security requis role database fournis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment security requis role database fournis</em>' reference.
	 * @see #getAttachment_security_requis_role_database_fournis()
	 * @generated
	 */
	void setAttachment_security_requis_role_database_fournis(attachment_Security_Requis_role_Database_fournis value);

	/**
	 * Returns the value of the '<em><b>Attachment security fournis role database requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment security fournis role database requis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment security fournis role database requis</em>' reference.
	 * @see #setAttachment_security_fournis_role_database_requis(attachment_Security_Fournis_role_Database_Requis)
	 * @see systeme.FonctionServeur.FonctionServeurPackage#getServeurDetail_Attachment_security_fournis_role_database_requis()
	 * @model
	 * @generated
	 */
	attachment_Security_Fournis_role_Database_Requis getAttachment_security_fournis_role_database_requis();

	/**
	 * Sets the value of the '{@link systeme.FonctionServeur.ServeurDetail#getAttachment_security_fournis_role_database_requis <em>Attachment security fournis role database requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment security fournis role database requis</em>' reference.
	 * @see #getAttachment_security_fournis_role_database_requis()
	 * @generated
	 */
	void setAttachment_security_fournis_role_database_requis(attachment_Security_Fournis_role_Database_Requis value);

	/**
	 * Returns the value of the '<em><b>Attachment database requis role connection fournis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment database requis role connection fournis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment database requis role connection fournis</em>' reference.
	 * @see #setAttachment_database_requis_role_connection_fournis(attachment_Database_Requis_role_connection_fournis)
	 * @see systeme.FonctionServeur.FonctionServeurPackage#getServeurDetail_Attachment_database_requis_role_connection_fournis()
	 * @model
	 * @generated
	 */
	attachment_Database_Requis_role_connection_fournis getAttachment_database_requis_role_connection_fournis();

	/**
	 * Sets the value of the '{@link systeme.FonctionServeur.ServeurDetail#getAttachment_database_requis_role_connection_fournis <em>Attachment database requis role connection fournis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment database requis role connection fournis</em>' reference.
	 * @see #getAttachment_database_requis_role_connection_fournis()
	 * @generated
	 */
	void setAttachment_database_requis_role_connection_fournis(attachment_Database_Requis_role_connection_fournis value);

	/**
	 * Returns the value of the '<em><b>Attachment database fournis role connection requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment database fournis role connection requis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment database fournis role connection requis</em>' reference.
	 * @see #setAttachment_database_fournis_role_connection_requis(attachment_Database_Fournis_role_Connection_Requis)
	 * @see systeme.FonctionServeur.FonctionServeurPackage#getServeurDetail_Attachment_database_fournis_role_connection_requis()
	 * @model
	 * @generated
	 */
	attachment_Database_Fournis_role_Connection_Requis getAttachment_database_fournis_role_connection_requis();

	/**
	 * Sets the value of the '{@link systeme.FonctionServeur.ServeurDetail#getAttachment_database_fournis_role_connection_requis <em>Attachment database fournis role connection requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment database fournis role connection requis</em>' reference.
	 * @see #getAttachment_database_fournis_role_connection_requis()
	 * @generated
	 */
	void setAttachment_database_fournis_role_connection_requis(attachment_Database_Fournis_role_Connection_Requis value);

	/**
	 * Returns the value of the '<em><b>Attachment database requis role security fournis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment database requis role security fournis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment database requis role security fournis</em>' reference.
	 * @see #setAttachment_database_requis_role_security_fournis(attachment_Database_Requis_role_Security_fournis)
	 * @see systeme.FonctionServeur.FonctionServeurPackage#getServeurDetail_Attachment_database_requis_role_security_fournis()
	 * @model
	 * @generated
	 */
	attachment_Database_Requis_role_Security_fournis getAttachment_database_requis_role_security_fournis();

	/**
	 * Sets the value of the '{@link systeme.FonctionServeur.ServeurDetail#getAttachment_database_requis_role_security_fournis <em>Attachment database requis role security fournis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment database requis role security fournis</em>' reference.
	 * @see #getAttachment_database_requis_role_security_fournis()
	 * @generated
	 */
	void setAttachment_database_requis_role_security_fournis(attachment_Database_Requis_role_Security_fournis value);

	/**
	 * Returns the value of the '<em><b>Attachment database fournis role security requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment database fournis role security requis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment database fournis role security requis</em>' reference.
	 * @see #setAttachment_database_fournis_role_security_requis(attachment_Database_Fournis_role_Security_Requis)
	 * @see systeme.FonctionServeur.FonctionServeurPackage#getServeurDetail_Attachment_database_fournis_role_security_requis()
	 * @model
	 * @generated
	 */
	attachment_Database_Fournis_role_Security_Requis getAttachment_database_fournis_role_security_requis();

	/**
	 * Sets the value of the '{@link systeme.FonctionServeur.ServeurDetail#getAttachment_database_fournis_role_security_requis <em>Attachment database fournis role security requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment database fournis role security requis</em>' reference.
	 * @see #getAttachment_database_fournis_role_security_requis()
	 * @generated
	 */
	void setAttachment_database_fournis_role_security_requis(attachment_Database_Fournis_role_Security_Requis value);

} // ServeurDetail
