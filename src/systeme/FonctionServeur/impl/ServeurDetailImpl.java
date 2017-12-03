/**
 */
package systeme.FonctionServeur.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projecttArchitectural.impl.ConfigurationsImpl;

import systeme.FonctionServeur.ConnecteurServeurD;
import systeme.FonctionServeur.ConnectionManager;
import systeme.FonctionServeur.Database;
import systeme.FonctionServeur.FonctionServeurPackage;
import systeme.FonctionServeur.ServeurDetail;
import systeme.FonctionServeur.attachment_Database_Fournis_role_Connection_Requis;
import systeme.FonctionServeur.attachment_Database_Fournis_role_Security_Requis;
import systeme.FonctionServeur.attachment_Database_Requis_role_Security_fournis;
import systeme.FonctionServeur.attachment_Database_Requis_role_connection_fournis;
import systeme.FonctionServeur.attachment_Security_Fournis_role_Connection_Requis;
import systeme.FonctionServeur.attachment_Security_Fournis_role_Database_Requis;
import systeme.FonctionServeur.attachment_Security_Requis_role_Connection_fournis;
import systeme.FonctionServeur.attachment_Security_Requis_role_Database_fournis;
import systeme.FonctionServeur.attachment_connectionM_Fournis_role_database_Requis;
import systeme.FonctionServeur.attachment_connectionM_Fournis_role_security_Requis;
import systeme.FonctionServeur.attachment_connectionM_Requis_role_database_fournis;
import systeme.FonctionServeur.attachment_connectionM_Requis_role_security_fournis;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Serveur Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.FonctionServeur.impl.ServeurDetailImpl#getConnectionmanager <em>Connectionmanager</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.ServeurDetailImpl#getSecuritymanager <em>Securitymanager</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.ServeurDetailImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.ServeurDetailImpl#getConnecteurserveurd <em>Connecteurserveurd</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.ServeurDetailImpl#getAttachment_connectionm_fournis_role_database_requis <em>Attachment connectionm fournis role database requis</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.ServeurDetailImpl#getAttachment_connectionm_requis_role_database_fournis <em>Attachment connectionm requis role database fournis</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.ServeurDetailImpl#getAttachment_connectionm_requis_role_security_fournis <em>Attachment connectionm requis role security fournis</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.ServeurDetailImpl#getAttachment_connectionm_fournis_role_security_requis <em>Attachment connectionm fournis role security requis</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.ServeurDetailImpl#getAttachment_security_requis_role_connection_fournis <em>Attachment security requis role connection fournis</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.ServeurDetailImpl#getAttachment_security_fournis_role_connection_requis <em>Attachment security fournis role connection requis</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.ServeurDetailImpl#getAttachment_security_requis_role_database_fournis <em>Attachment security requis role database fournis</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.ServeurDetailImpl#getAttachment_security_fournis_role_database_requis <em>Attachment security fournis role database requis</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.ServeurDetailImpl#getAttachment_database_requis_role_connection_fournis <em>Attachment database requis role connection fournis</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.ServeurDetailImpl#getAttachment_database_fournis_role_connection_requis <em>Attachment database fournis role connection requis</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.ServeurDetailImpl#getAttachment_database_requis_role_security_fournis <em>Attachment database requis role security fournis</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.ServeurDetailImpl#getAttachment_database_fournis_role_security_requis <em>Attachment database fournis role security requis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServeurDetailImpl extends ConfigurationsImpl implements ServeurDetail {
	/**
	 * The cached value of the '{@link #getConnectionmanager() <em>Connectionmanager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionmanager()
	 * @generated
	 * @ordered
	 */
	protected ConnectionManager connectionmanager;

	/**
	 * The cached value of the '{@link #getSecuritymanager() <em>Securitymanager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritymanager()
	 * @generated
	 * @ordered
	 */
	protected systeme.FonctionServeur.SecurityManager securitymanager;

	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected Database database;

	/**
	 * The cached value of the '{@link #getConnecteurserveurd() <em>Connecteurserveurd</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnecteurserveurd()
	 * @generated
	 * @ordered
	 */
	protected ConnecteurServeurD connecteurserveurd;

	/**
	 * The cached value of the '{@link #getAttachment_connectionm_fournis_role_database_requis() <em>Attachment connectionm fournis role database requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment_connectionm_fournis_role_database_requis()
	 * @generated
	 * @ordered
	 */
	protected attachment_connectionM_Fournis_role_database_Requis attachment_connectionm_fournis_role_database_requis;

	/**
	 * The cached value of the '{@link #getAttachment_connectionm_requis_role_database_fournis() <em>Attachment connectionm requis role database fournis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment_connectionm_requis_role_database_fournis()
	 * @generated
	 * @ordered
	 */
	protected attachment_connectionM_Requis_role_database_fournis attachment_connectionm_requis_role_database_fournis;

	/**
	 * The cached value of the '{@link #getAttachment_connectionm_requis_role_security_fournis() <em>Attachment connectionm requis role security fournis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment_connectionm_requis_role_security_fournis()
	 * @generated
	 * @ordered
	 */
	protected attachment_connectionM_Requis_role_security_fournis attachment_connectionm_requis_role_security_fournis;

	/**
	 * The cached value of the '{@link #getAttachment_connectionm_fournis_role_security_requis() <em>Attachment connectionm fournis role security requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment_connectionm_fournis_role_security_requis()
	 * @generated
	 * @ordered
	 */
	protected attachment_connectionM_Fournis_role_security_Requis attachment_connectionm_fournis_role_security_requis;

	/**
	 * The cached value of the '{@link #getAttachment_security_requis_role_connection_fournis() <em>Attachment security requis role connection fournis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment_security_requis_role_connection_fournis()
	 * @generated
	 * @ordered
	 */
	protected attachment_Security_Requis_role_Connection_fournis attachment_security_requis_role_connection_fournis;

	/**
	 * The cached value of the '{@link #getAttachment_security_fournis_role_connection_requis() <em>Attachment security fournis role connection requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment_security_fournis_role_connection_requis()
	 * @generated
	 * @ordered
	 */
	protected attachment_Security_Fournis_role_Connection_Requis attachment_security_fournis_role_connection_requis;

	/**
	 * The cached value of the '{@link #getAttachment_security_requis_role_database_fournis() <em>Attachment security requis role database fournis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment_security_requis_role_database_fournis()
	 * @generated
	 * @ordered
	 */
	protected attachment_Security_Requis_role_Database_fournis attachment_security_requis_role_database_fournis;

	/**
	 * The cached value of the '{@link #getAttachment_security_fournis_role_database_requis() <em>Attachment security fournis role database requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment_security_fournis_role_database_requis()
	 * @generated
	 * @ordered
	 */
	protected attachment_Security_Fournis_role_Database_Requis attachment_security_fournis_role_database_requis;

	/**
	 * The cached value of the '{@link #getAttachment_database_requis_role_connection_fournis() <em>Attachment database requis role connection fournis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment_database_requis_role_connection_fournis()
	 * @generated
	 * @ordered
	 */
	protected attachment_Database_Requis_role_connection_fournis attachment_database_requis_role_connection_fournis;

	/**
	 * The cached value of the '{@link #getAttachment_database_fournis_role_connection_requis() <em>Attachment database fournis role connection requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment_database_fournis_role_connection_requis()
	 * @generated
	 * @ordered
	 */
	protected attachment_Database_Fournis_role_Connection_Requis attachment_database_fournis_role_connection_requis;

	/**
	 * The cached value of the '{@link #getAttachment_database_requis_role_security_fournis() <em>Attachment database requis role security fournis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment_database_requis_role_security_fournis()
	 * @generated
	 * @ordered
	 */
	protected attachment_Database_Requis_role_Security_fournis attachment_database_requis_role_security_fournis;

	/**
	 * The cached value of the '{@link #getAttachment_database_fournis_role_security_requis() <em>Attachment database fournis role security requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment_database_fournis_role_security_requis()
	 * @generated
	 * @ordered
	 */
	protected attachment_Database_Fournis_role_Security_Requis attachment_database_fournis_role_security_requis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServeurDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FonctionServeurPackage.Literals.SERVEUR_DETAIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionManager getConnectionmanager() {
		if (connectionmanager != null && connectionmanager.eIsProxy()) {
			InternalEObject oldConnectionmanager = (InternalEObject)connectionmanager;
			connectionmanager = (ConnectionManager)eResolveProxy(oldConnectionmanager);
			if (connectionmanager != oldConnectionmanager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.SERVEUR_DETAIL__CONNECTIONMANAGER, oldConnectionmanager, connectionmanager));
			}
		}
		return connectionmanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionManager basicGetConnectionmanager() {
		return connectionmanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionmanager(ConnectionManager newConnectionmanager) {
		ConnectionManager oldConnectionmanager = connectionmanager;
		connectionmanager = newConnectionmanager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.SERVEUR_DETAIL__CONNECTIONMANAGER, oldConnectionmanager, connectionmanager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public systeme.FonctionServeur.SecurityManager getSecuritymanager() {
		if (securitymanager != null && securitymanager.eIsProxy()) {
			InternalEObject oldSecuritymanager = (InternalEObject)securitymanager;
			securitymanager = (systeme.FonctionServeur.SecurityManager)eResolveProxy(oldSecuritymanager);
			if (securitymanager != oldSecuritymanager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.SERVEUR_DETAIL__SECURITYMANAGER, oldSecuritymanager, securitymanager));
			}
		}
		return securitymanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public systeme.FonctionServeur.SecurityManager basicGetSecuritymanager() {
		return securitymanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecuritymanager(systeme.FonctionServeur.SecurityManager newSecuritymanager) {
		systeme.FonctionServeur.SecurityManager oldSecuritymanager = securitymanager;
		securitymanager = newSecuritymanager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.SERVEUR_DETAIL__SECURITYMANAGER, oldSecuritymanager, securitymanager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database getDatabase() {
		if (database != null && database.eIsProxy()) {
			InternalEObject oldDatabase = (InternalEObject)database;
			database = (Database)eResolveProxy(oldDatabase);
			if (database != oldDatabase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.SERVEUR_DETAIL__DATABASE, oldDatabase, database));
			}
		}
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database basicGetDatabase() {
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabase(Database newDatabase) {
		Database oldDatabase = database;
		database = newDatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.SERVEUR_DETAIL__DATABASE, oldDatabase, database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnecteurServeurD getConnecteurserveurd() {
		if (connecteurserveurd != null && connecteurserveurd.eIsProxy()) {
			InternalEObject oldConnecteurserveurd = (InternalEObject)connecteurserveurd;
			connecteurserveurd = (ConnecteurServeurD)eResolveProxy(oldConnecteurserveurd);
			if (connecteurserveurd != oldConnecteurserveurd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.SERVEUR_DETAIL__CONNECTEURSERVEURD, oldConnecteurserveurd, connecteurserveurd));
			}
		}
		return connecteurserveurd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnecteurServeurD basicGetConnecteurserveurd() {
		return connecteurserveurd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnecteurserveurd(ConnecteurServeurD newConnecteurserveurd) {
		ConnecteurServeurD oldConnecteurserveurd = connecteurserveurd;
		connecteurserveurd = newConnecteurserveurd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.SERVEUR_DETAIL__CONNECTEURSERVEURD, oldConnecteurserveurd, connecteurserveurd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_connectionM_Fournis_role_database_Requis getAttachment_connectionm_fournis_role_database_requis() {
		if (attachment_connectionm_fournis_role_database_requis != null && attachment_connectionm_fournis_role_database_requis.eIsProxy()) {
			InternalEObject oldAttachment_connectionm_fournis_role_database_requis = (InternalEObject)attachment_connectionm_fournis_role_database_requis;
			attachment_connectionm_fournis_role_database_requis = (attachment_connectionM_Fournis_role_database_Requis)eResolveProxy(oldAttachment_connectionm_fournis_role_database_requis);
			if (attachment_connectionm_fournis_role_database_requis != oldAttachment_connectionm_fournis_role_database_requis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_FOURNIS_ROLE_DATABASE_REQUIS, oldAttachment_connectionm_fournis_role_database_requis, attachment_connectionm_fournis_role_database_requis));
			}
		}
		return attachment_connectionm_fournis_role_database_requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_connectionM_Fournis_role_database_Requis basicGetAttachment_connectionm_fournis_role_database_requis() {
		return attachment_connectionm_fournis_role_database_requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment_connectionm_fournis_role_database_requis(attachment_connectionM_Fournis_role_database_Requis newAttachment_connectionm_fournis_role_database_requis) {
		attachment_connectionM_Fournis_role_database_Requis oldAttachment_connectionm_fournis_role_database_requis = attachment_connectionm_fournis_role_database_requis;
		attachment_connectionm_fournis_role_database_requis = newAttachment_connectionm_fournis_role_database_requis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_FOURNIS_ROLE_DATABASE_REQUIS, oldAttachment_connectionm_fournis_role_database_requis, attachment_connectionm_fournis_role_database_requis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_connectionM_Requis_role_database_fournis getAttachment_connectionm_requis_role_database_fournis() {
		if (attachment_connectionm_requis_role_database_fournis != null && attachment_connectionm_requis_role_database_fournis.eIsProxy()) {
			InternalEObject oldAttachment_connectionm_requis_role_database_fournis = (InternalEObject)attachment_connectionm_requis_role_database_fournis;
			attachment_connectionm_requis_role_database_fournis = (attachment_connectionM_Requis_role_database_fournis)eResolveProxy(oldAttachment_connectionm_requis_role_database_fournis);
			if (attachment_connectionm_requis_role_database_fournis != oldAttachment_connectionm_requis_role_database_fournis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_REQUIS_ROLE_DATABASE_FOURNIS, oldAttachment_connectionm_requis_role_database_fournis, attachment_connectionm_requis_role_database_fournis));
			}
		}
		return attachment_connectionm_requis_role_database_fournis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_connectionM_Requis_role_database_fournis basicGetAttachment_connectionm_requis_role_database_fournis() {
		return attachment_connectionm_requis_role_database_fournis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment_connectionm_requis_role_database_fournis(attachment_connectionM_Requis_role_database_fournis newAttachment_connectionm_requis_role_database_fournis) {
		attachment_connectionM_Requis_role_database_fournis oldAttachment_connectionm_requis_role_database_fournis = attachment_connectionm_requis_role_database_fournis;
		attachment_connectionm_requis_role_database_fournis = newAttachment_connectionm_requis_role_database_fournis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_REQUIS_ROLE_DATABASE_FOURNIS, oldAttachment_connectionm_requis_role_database_fournis, attachment_connectionm_requis_role_database_fournis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_connectionM_Requis_role_security_fournis getAttachment_connectionm_requis_role_security_fournis() {
		if (attachment_connectionm_requis_role_security_fournis != null && attachment_connectionm_requis_role_security_fournis.eIsProxy()) {
			InternalEObject oldAttachment_connectionm_requis_role_security_fournis = (InternalEObject)attachment_connectionm_requis_role_security_fournis;
			attachment_connectionm_requis_role_security_fournis = (attachment_connectionM_Requis_role_security_fournis)eResolveProxy(oldAttachment_connectionm_requis_role_security_fournis);
			if (attachment_connectionm_requis_role_security_fournis != oldAttachment_connectionm_requis_role_security_fournis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_REQUIS_ROLE_SECURITY_FOURNIS, oldAttachment_connectionm_requis_role_security_fournis, attachment_connectionm_requis_role_security_fournis));
			}
		}
		return attachment_connectionm_requis_role_security_fournis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_connectionM_Requis_role_security_fournis basicGetAttachment_connectionm_requis_role_security_fournis() {
		return attachment_connectionm_requis_role_security_fournis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment_connectionm_requis_role_security_fournis(attachment_connectionM_Requis_role_security_fournis newAttachment_connectionm_requis_role_security_fournis) {
		attachment_connectionM_Requis_role_security_fournis oldAttachment_connectionm_requis_role_security_fournis = attachment_connectionm_requis_role_security_fournis;
		attachment_connectionm_requis_role_security_fournis = newAttachment_connectionm_requis_role_security_fournis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_REQUIS_ROLE_SECURITY_FOURNIS, oldAttachment_connectionm_requis_role_security_fournis, attachment_connectionm_requis_role_security_fournis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_connectionM_Fournis_role_security_Requis getAttachment_connectionm_fournis_role_security_requis() {
		if (attachment_connectionm_fournis_role_security_requis != null && attachment_connectionm_fournis_role_security_requis.eIsProxy()) {
			InternalEObject oldAttachment_connectionm_fournis_role_security_requis = (InternalEObject)attachment_connectionm_fournis_role_security_requis;
			attachment_connectionm_fournis_role_security_requis = (attachment_connectionM_Fournis_role_security_Requis)eResolveProxy(oldAttachment_connectionm_fournis_role_security_requis);
			if (attachment_connectionm_fournis_role_security_requis != oldAttachment_connectionm_fournis_role_security_requis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_FOURNIS_ROLE_SECURITY_REQUIS, oldAttachment_connectionm_fournis_role_security_requis, attachment_connectionm_fournis_role_security_requis));
			}
		}
		return attachment_connectionm_fournis_role_security_requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_connectionM_Fournis_role_security_Requis basicGetAttachment_connectionm_fournis_role_security_requis() {
		return attachment_connectionm_fournis_role_security_requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment_connectionm_fournis_role_security_requis(attachment_connectionM_Fournis_role_security_Requis newAttachment_connectionm_fournis_role_security_requis) {
		attachment_connectionM_Fournis_role_security_Requis oldAttachment_connectionm_fournis_role_security_requis = attachment_connectionm_fournis_role_security_requis;
		attachment_connectionm_fournis_role_security_requis = newAttachment_connectionm_fournis_role_security_requis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_FOURNIS_ROLE_SECURITY_REQUIS, oldAttachment_connectionm_fournis_role_security_requis, attachment_connectionm_fournis_role_security_requis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_Security_Requis_role_Connection_fournis getAttachment_security_requis_role_connection_fournis() {
		if (attachment_security_requis_role_connection_fournis != null && attachment_security_requis_role_connection_fournis.eIsProxy()) {
			InternalEObject oldAttachment_security_requis_role_connection_fournis = (InternalEObject)attachment_security_requis_role_connection_fournis;
			attachment_security_requis_role_connection_fournis = (attachment_Security_Requis_role_Connection_fournis)eResolveProxy(oldAttachment_security_requis_role_connection_fournis);
			if (attachment_security_requis_role_connection_fournis != oldAttachment_security_requis_role_connection_fournis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS, oldAttachment_security_requis_role_connection_fournis, attachment_security_requis_role_connection_fournis));
			}
		}
		return attachment_security_requis_role_connection_fournis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_Security_Requis_role_Connection_fournis basicGetAttachment_security_requis_role_connection_fournis() {
		return attachment_security_requis_role_connection_fournis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment_security_requis_role_connection_fournis(attachment_Security_Requis_role_Connection_fournis newAttachment_security_requis_role_connection_fournis) {
		attachment_Security_Requis_role_Connection_fournis oldAttachment_security_requis_role_connection_fournis = attachment_security_requis_role_connection_fournis;
		attachment_security_requis_role_connection_fournis = newAttachment_security_requis_role_connection_fournis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS, oldAttachment_security_requis_role_connection_fournis, attachment_security_requis_role_connection_fournis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_Security_Fournis_role_Connection_Requis getAttachment_security_fournis_role_connection_requis() {
		if (attachment_security_fournis_role_connection_requis != null && attachment_security_fournis_role_connection_requis.eIsProxy()) {
			InternalEObject oldAttachment_security_fournis_role_connection_requis = (InternalEObject)attachment_security_fournis_role_connection_requis;
			attachment_security_fournis_role_connection_requis = (attachment_Security_Fournis_role_Connection_Requis)eResolveProxy(oldAttachment_security_fournis_role_connection_requis);
			if (attachment_security_fournis_role_connection_requis != oldAttachment_security_fournis_role_connection_requis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS, oldAttachment_security_fournis_role_connection_requis, attachment_security_fournis_role_connection_requis));
			}
		}
		return attachment_security_fournis_role_connection_requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_Security_Fournis_role_Connection_Requis basicGetAttachment_security_fournis_role_connection_requis() {
		return attachment_security_fournis_role_connection_requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment_security_fournis_role_connection_requis(attachment_Security_Fournis_role_Connection_Requis newAttachment_security_fournis_role_connection_requis) {
		attachment_Security_Fournis_role_Connection_Requis oldAttachment_security_fournis_role_connection_requis = attachment_security_fournis_role_connection_requis;
		attachment_security_fournis_role_connection_requis = newAttachment_security_fournis_role_connection_requis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS, oldAttachment_security_fournis_role_connection_requis, attachment_security_fournis_role_connection_requis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_Security_Requis_role_Database_fournis getAttachment_security_requis_role_database_fournis() {
		if (attachment_security_requis_role_database_fournis != null && attachment_security_requis_role_database_fournis.eIsProxy()) {
			InternalEObject oldAttachment_security_requis_role_database_fournis = (InternalEObject)attachment_security_requis_role_database_fournis;
			attachment_security_requis_role_database_fournis = (attachment_Security_Requis_role_Database_fournis)eResolveProxy(oldAttachment_security_requis_role_database_fournis);
			if (attachment_security_requis_role_database_fournis != oldAttachment_security_requis_role_database_fournis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS, oldAttachment_security_requis_role_database_fournis, attachment_security_requis_role_database_fournis));
			}
		}
		return attachment_security_requis_role_database_fournis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_Security_Requis_role_Database_fournis basicGetAttachment_security_requis_role_database_fournis() {
		return attachment_security_requis_role_database_fournis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment_security_requis_role_database_fournis(attachment_Security_Requis_role_Database_fournis newAttachment_security_requis_role_database_fournis) {
		attachment_Security_Requis_role_Database_fournis oldAttachment_security_requis_role_database_fournis = attachment_security_requis_role_database_fournis;
		attachment_security_requis_role_database_fournis = newAttachment_security_requis_role_database_fournis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS, oldAttachment_security_requis_role_database_fournis, attachment_security_requis_role_database_fournis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_Security_Fournis_role_Database_Requis getAttachment_security_fournis_role_database_requis() {
		if (attachment_security_fournis_role_database_requis != null && attachment_security_fournis_role_database_requis.eIsProxy()) {
			InternalEObject oldAttachment_security_fournis_role_database_requis = (InternalEObject)attachment_security_fournis_role_database_requis;
			attachment_security_fournis_role_database_requis = (attachment_Security_Fournis_role_Database_Requis)eResolveProxy(oldAttachment_security_fournis_role_database_requis);
			if (attachment_security_fournis_role_database_requis != oldAttachment_security_fournis_role_database_requis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS, oldAttachment_security_fournis_role_database_requis, attachment_security_fournis_role_database_requis));
			}
		}
		return attachment_security_fournis_role_database_requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_Security_Fournis_role_Database_Requis basicGetAttachment_security_fournis_role_database_requis() {
		return attachment_security_fournis_role_database_requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment_security_fournis_role_database_requis(attachment_Security_Fournis_role_Database_Requis newAttachment_security_fournis_role_database_requis) {
		attachment_Security_Fournis_role_Database_Requis oldAttachment_security_fournis_role_database_requis = attachment_security_fournis_role_database_requis;
		attachment_security_fournis_role_database_requis = newAttachment_security_fournis_role_database_requis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS, oldAttachment_security_fournis_role_database_requis, attachment_security_fournis_role_database_requis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_Database_Requis_role_connection_fournis getAttachment_database_requis_role_connection_fournis() {
		if (attachment_database_requis_role_connection_fournis != null && attachment_database_requis_role_connection_fournis.eIsProxy()) {
			InternalEObject oldAttachment_database_requis_role_connection_fournis = (InternalEObject)attachment_database_requis_role_connection_fournis;
			attachment_database_requis_role_connection_fournis = (attachment_Database_Requis_role_connection_fournis)eResolveProxy(oldAttachment_database_requis_role_connection_fournis);
			if (attachment_database_requis_role_connection_fournis != oldAttachment_database_requis_role_connection_fournis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS, oldAttachment_database_requis_role_connection_fournis, attachment_database_requis_role_connection_fournis));
			}
		}
		return attachment_database_requis_role_connection_fournis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_Database_Requis_role_connection_fournis basicGetAttachment_database_requis_role_connection_fournis() {
		return attachment_database_requis_role_connection_fournis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment_database_requis_role_connection_fournis(attachment_Database_Requis_role_connection_fournis newAttachment_database_requis_role_connection_fournis) {
		attachment_Database_Requis_role_connection_fournis oldAttachment_database_requis_role_connection_fournis = attachment_database_requis_role_connection_fournis;
		attachment_database_requis_role_connection_fournis = newAttachment_database_requis_role_connection_fournis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS, oldAttachment_database_requis_role_connection_fournis, attachment_database_requis_role_connection_fournis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_Database_Fournis_role_Connection_Requis getAttachment_database_fournis_role_connection_requis() {
		if (attachment_database_fournis_role_connection_requis != null && attachment_database_fournis_role_connection_requis.eIsProxy()) {
			InternalEObject oldAttachment_database_fournis_role_connection_requis = (InternalEObject)attachment_database_fournis_role_connection_requis;
			attachment_database_fournis_role_connection_requis = (attachment_Database_Fournis_role_Connection_Requis)eResolveProxy(oldAttachment_database_fournis_role_connection_requis);
			if (attachment_database_fournis_role_connection_requis != oldAttachment_database_fournis_role_connection_requis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS, oldAttachment_database_fournis_role_connection_requis, attachment_database_fournis_role_connection_requis));
			}
		}
		return attachment_database_fournis_role_connection_requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_Database_Fournis_role_Connection_Requis basicGetAttachment_database_fournis_role_connection_requis() {
		return attachment_database_fournis_role_connection_requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment_database_fournis_role_connection_requis(attachment_Database_Fournis_role_Connection_Requis newAttachment_database_fournis_role_connection_requis) {
		attachment_Database_Fournis_role_Connection_Requis oldAttachment_database_fournis_role_connection_requis = attachment_database_fournis_role_connection_requis;
		attachment_database_fournis_role_connection_requis = newAttachment_database_fournis_role_connection_requis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS, oldAttachment_database_fournis_role_connection_requis, attachment_database_fournis_role_connection_requis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_Database_Requis_role_Security_fournis getAttachment_database_requis_role_security_fournis() {
		if (attachment_database_requis_role_security_fournis != null && attachment_database_requis_role_security_fournis.eIsProxy()) {
			InternalEObject oldAttachment_database_requis_role_security_fournis = (InternalEObject)attachment_database_requis_role_security_fournis;
			attachment_database_requis_role_security_fournis = (attachment_Database_Requis_role_Security_fournis)eResolveProxy(oldAttachment_database_requis_role_security_fournis);
			if (attachment_database_requis_role_security_fournis != oldAttachment_database_requis_role_security_fournis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS, oldAttachment_database_requis_role_security_fournis, attachment_database_requis_role_security_fournis));
			}
		}
		return attachment_database_requis_role_security_fournis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_Database_Requis_role_Security_fournis basicGetAttachment_database_requis_role_security_fournis() {
		return attachment_database_requis_role_security_fournis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment_database_requis_role_security_fournis(attachment_Database_Requis_role_Security_fournis newAttachment_database_requis_role_security_fournis) {
		attachment_Database_Requis_role_Security_fournis oldAttachment_database_requis_role_security_fournis = attachment_database_requis_role_security_fournis;
		attachment_database_requis_role_security_fournis = newAttachment_database_requis_role_security_fournis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS, oldAttachment_database_requis_role_security_fournis, attachment_database_requis_role_security_fournis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_Database_Fournis_role_Security_Requis getAttachment_database_fournis_role_security_requis() {
		if (attachment_database_fournis_role_security_requis != null && attachment_database_fournis_role_security_requis.eIsProxy()) {
			InternalEObject oldAttachment_database_fournis_role_security_requis = (InternalEObject)attachment_database_fournis_role_security_requis;
			attachment_database_fournis_role_security_requis = (attachment_Database_Fournis_role_Security_Requis)eResolveProxy(oldAttachment_database_fournis_role_security_requis);
			if (attachment_database_fournis_role_security_requis != oldAttachment_database_fournis_role_security_requis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS, oldAttachment_database_fournis_role_security_requis, attachment_database_fournis_role_security_requis));
			}
		}
		return attachment_database_fournis_role_security_requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attachment_Database_Fournis_role_Security_Requis basicGetAttachment_database_fournis_role_security_requis() {
		return attachment_database_fournis_role_security_requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment_database_fournis_role_security_requis(attachment_Database_Fournis_role_Security_Requis newAttachment_database_fournis_role_security_requis) {
		attachment_Database_Fournis_role_Security_Requis oldAttachment_database_fournis_role_security_requis = attachment_database_fournis_role_security_requis;
		attachment_database_fournis_role_security_requis = newAttachment_database_fournis_role_security_requis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS, oldAttachment_database_fournis_role_security_requis, attachment_database_fournis_role_security_requis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FonctionServeurPackage.SERVEUR_DETAIL__CONNECTIONMANAGER:
				if (resolve) return getConnectionmanager();
				return basicGetConnectionmanager();
			case FonctionServeurPackage.SERVEUR_DETAIL__SECURITYMANAGER:
				if (resolve) return getSecuritymanager();
				return basicGetSecuritymanager();
			case FonctionServeurPackage.SERVEUR_DETAIL__DATABASE:
				if (resolve) return getDatabase();
				return basicGetDatabase();
			case FonctionServeurPackage.SERVEUR_DETAIL__CONNECTEURSERVEURD:
				if (resolve) return getConnecteurserveurd();
				return basicGetConnecteurserveurd();
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_FOURNIS_ROLE_DATABASE_REQUIS:
				if (resolve) return getAttachment_connectionm_fournis_role_database_requis();
				return basicGetAttachment_connectionm_fournis_role_database_requis();
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_REQUIS_ROLE_DATABASE_FOURNIS:
				if (resolve) return getAttachment_connectionm_requis_role_database_fournis();
				return basicGetAttachment_connectionm_requis_role_database_fournis();
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_REQUIS_ROLE_SECURITY_FOURNIS:
				if (resolve) return getAttachment_connectionm_requis_role_security_fournis();
				return basicGetAttachment_connectionm_requis_role_security_fournis();
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_FOURNIS_ROLE_SECURITY_REQUIS:
				if (resolve) return getAttachment_connectionm_fournis_role_security_requis();
				return basicGetAttachment_connectionm_fournis_role_security_requis();
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS:
				if (resolve) return getAttachment_security_requis_role_connection_fournis();
				return basicGetAttachment_security_requis_role_connection_fournis();
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS:
				if (resolve) return getAttachment_security_fournis_role_connection_requis();
				return basicGetAttachment_security_fournis_role_connection_requis();
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS:
				if (resolve) return getAttachment_security_requis_role_database_fournis();
				return basicGetAttachment_security_requis_role_database_fournis();
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS:
				if (resolve) return getAttachment_security_fournis_role_database_requis();
				return basicGetAttachment_security_fournis_role_database_requis();
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS:
				if (resolve) return getAttachment_database_requis_role_connection_fournis();
				return basicGetAttachment_database_requis_role_connection_fournis();
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS:
				if (resolve) return getAttachment_database_fournis_role_connection_requis();
				return basicGetAttachment_database_fournis_role_connection_requis();
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS:
				if (resolve) return getAttachment_database_requis_role_security_fournis();
				return basicGetAttachment_database_requis_role_security_fournis();
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS:
				if (resolve) return getAttachment_database_fournis_role_security_requis();
				return basicGetAttachment_database_fournis_role_security_requis();
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
			case FonctionServeurPackage.SERVEUR_DETAIL__CONNECTIONMANAGER:
				setConnectionmanager((ConnectionManager)newValue);
				return;
			case FonctionServeurPackage.SERVEUR_DETAIL__SECURITYMANAGER:
				setSecuritymanager((systeme.FonctionServeur.SecurityManager)newValue);
				return;
			case FonctionServeurPackage.SERVEUR_DETAIL__DATABASE:
				setDatabase((Database)newValue);
				return;
			case FonctionServeurPackage.SERVEUR_DETAIL__CONNECTEURSERVEURD:
				setConnecteurserveurd((ConnecteurServeurD)newValue);
				return;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_FOURNIS_ROLE_DATABASE_REQUIS:
				setAttachment_connectionm_fournis_role_database_requis((attachment_connectionM_Fournis_role_database_Requis)newValue);
				return;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_REQUIS_ROLE_DATABASE_FOURNIS:
				setAttachment_connectionm_requis_role_database_fournis((attachment_connectionM_Requis_role_database_fournis)newValue);
				return;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_REQUIS_ROLE_SECURITY_FOURNIS:
				setAttachment_connectionm_requis_role_security_fournis((attachment_connectionM_Requis_role_security_fournis)newValue);
				return;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_FOURNIS_ROLE_SECURITY_REQUIS:
				setAttachment_connectionm_fournis_role_security_requis((attachment_connectionM_Fournis_role_security_Requis)newValue);
				return;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS:
				setAttachment_security_requis_role_connection_fournis((attachment_Security_Requis_role_Connection_fournis)newValue);
				return;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS:
				setAttachment_security_fournis_role_connection_requis((attachment_Security_Fournis_role_Connection_Requis)newValue);
				return;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS:
				setAttachment_security_requis_role_database_fournis((attachment_Security_Requis_role_Database_fournis)newValue);
				return;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS:
				setAttachment_security_fournis_role_database_requis((attachment_Security_Fournis_role_Database_Requis)newValue);
				return;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS:
				setAttachment_database_requis_role_connection_fournis((attachment_Database_Requis_role_connection_fournis)newValue);
				return;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS:
				setAttachment_database_fournis_role_connection_requis((attachment_Database_Fournis_role_Connection_Requis)newValue);
				return;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS:
				setAttachment_database_requis_role_security_fournis((attachment_Database_Requis_role_Security_fournis)newValue);
				return;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS:
				setAttachment_database_fournis_role_security_requis((attachment_Database_Fournis_role_Security_Requis)newValue);
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
			case FonctionServeurPackage.SERVEUR_DETAIL__CONNECTIONMANAGER:
				setConnectionmanager((ConnectionManager)null);
				return;
			case FonctionServeurPackage.SERVEUR_DETAIL__SECURITYMANAGER:
				setSecuritymanager((systeme.FonctionServeur.SecurityManager)null);
				return;
			case FonctionServeurPackage.SERVEUR_DETAIL__DATABASE:
				setDatabase((Database)null);
				return;
			case FonctionServeurPackage.SERVEUR_DETAIL__CONNECTEURSERVEURD:
				setConnecteurserveurd((ConnecteurServeurD)null);
				return;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_FOURNIS_ROLE_DATABASE_REQUIS:
				setAttachment_connectionm_fournis_role_database_requis((attachment_connectionM_Fournis_role_database_Requis)null);
				return;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_REQUIS_ROLE_DATABASE_FOURNIS:
				setAttachment_connectionm_requis_role_database_fournis((attachment_connectionM_Requis_role_database_fournis)null);
				return;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_REQUIS_ROLE_SECURITY_FOURNIS:
				setAttachment_connectionm_requis_role_security_fournis((attachment_connectionM_Requis_role_security_fournis)null);
				return;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_FOURNIS_ROLE_SECURITY_REQUIS:
				setAttachment_connectionm_fournis_role_security_requis((attachment_connectionM_Fournis_role_security_Requis)null);
				return;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS:
				setAttachment_security_requis_role_connection_fournis((attachment_Security_Requis_role_Connection_fournis)null);
				return;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS:
				setAttachment_security_fournis_role_connection_requis((attachment_Security_Fournis_role_Connection_Requis)null);
				return;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS:
				setAttachment_security_requis_role_database_fournis((attachment_Security_Requis_role_Database_fournis)null);
				return;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS:
				setAttachment_security_fournis_role_database_requis((attachment_Security_Fournis_role_Database_Requis)null);
				return;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS:
				setAttachment_database_requis_role_connection_fournis((attachment_Database_Requis_role_connection_fournis)null);
				return;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS:
				setAttachment_database_fournis_role_connection_requis((attachment_Database_Fournis_role_Connection_Requis)null);
				return;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS:
				setAttachment_database_requis_role_security_fournis((attachment_Database_Requis_role_Security_fournis)null);
				return;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS:
				setAttachment_database_fournis_role_security_requis((attachment_Database_Fournis_role_Security_Requis)null);
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
			case FonctionServeurPackage.SERVEUR_DETAIL__CONNECTIONMANAGER:
				return connectionmanager != null;
			case FonctionServeurPackage.SERVEUR_DETAIL__SECURITYMANAGER:
				return securitymanager != null;
			case FonctionServeurPackage.SERVEUR_DETAIL__DATABASE:
				return database != null;
			case FonctionServeurPackage.SERVEUR_DETAIL__CONNECTEURSERVEURD:
				return connecteurserveurd != null;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_FOURNIS_ROLE_DATABASE_REQUIS:
				return attachment_connectionm_fournis_role_database_requis != null;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_REQUIS_ROLE_DATABASE_FOURNIS:
				return attachment_connectionm_requis_role_database_fournis != null;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_REQUIS_ROLE_SECURITY_FOURNIS:
				return attachment_connectionm_requis_role_security_fournis != null;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_CONNECTIONM_FOURNIS_ROLE_SECURITY_REQUIS:
				return attachment_connectionm_fournis_role_security_requis != null;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_SECURITY_REQUIS_ROLE_CONNECTION_FOURNIS:
				return attachment_security_requis_role_connection_fournis != null;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_SECURITY_FOURNIS_ROLE_CONNECTION_REQUIS:
				return attachment_security_fournis_role_connection_requis != null;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_SECURITY_REQUIS_ROLE_DATABASE_FOURNIS:
				return attachment_security_requis_role_database_fournis != null;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_SECURITY_FOURNIS_ROLE_DATABASE_REQUIS:
				return attachment_security_fournis_role_database_requis != null;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_DATABASE_REQUIS_ROLE_CONNECTION_FOURNIS:
				return attachment_database_requis_role_connection_fournis != null;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_DATABASE_FOURNIS_ROLE_CONNECTION_REQUIS:
				return attachment_database_fournis_role_connection_requis != null;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_DATABASE_REQUIS_ROLE_SECURITY_FOURNIS:
				return attachment_database_requis_role_security_fournis != null;
			case FonctionServeurPackage.SERVEUR_DETAIL__ATTACHMENT_DATABASE_FOURNIS_ROLE_SECURITY_REQUIS:
				return attachment_database_fournis_role_security_requis != null;
		}
		return super.eIsSet(featureID);
	}

} //ServeurDetailImpl
