/**
 */
package systeme.FonctionServeur.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projecttArchitectural.Glue;

import projecttArchitectural.RoleConnecteursFournis;
import projecttArchitectural.RoleConnecteursRequis;
import projecttArchitectural.impl.ConnecteursImpl;

import systeme.FonctionServeur.ConnecteurServeurD;
import systeme.FonctionServeur.FonctionServeurPackage;
import systeme.FonctionServeur.RoleFournis_ConnectionManager_Security;
import systeme.FonctionServeur.RoleFournis_Database_Connection;
import systeme.FonctionServeur.RoleFournis_Database_Security;
import systeme.FonctionServeur.RoleFournis_Security_Connection;
import systeme.FonctionServeur.RoleFournis_Security_Database;
import systeme.FonctionServeur.RoleRequis_ConnectionManager_Security;
import systeme.FonctionServeur.RoleRequis_Database_Connection;
import systeme.FonctionServeur.RoleRequis_Database_Security;
import systeme.FonctionServeur.RoleRequis_Security_Connection;
import systeme.FonctionServeur.RoleRequis_Security_Database;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connecteur Serveur D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link systeme.FonctionServeur.impl.ConnecteurServeurDImpl#getGlueserveur1 <em>Glueserveur1</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.ConnecteurServeurDImpl#getGlueserveur2 <em>Glueserveur2</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.ConnecteurServeurDImpl#getGlueserveur3 <em>Glueserveur3</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.ConnecteurServeurDImpl#getGlueserveur4 <em>Glueserveur4</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.ConnecteurServeurDImpl#getGlueserveur5 <em>Glueserveur5</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.ConnecteurServeurDImpl#getGlueserveur6 <em>Glueserveur6</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.ConnecteurServeurDImpl#getRolefournis_connectionmanager_database <em>Rolefournis connectionmanager database</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.ConnecteurServeurDImpl#getRolerequis_connectionmanager_database <em>Rolerequis connectionmanager database</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.ConnecteurServeurDImpl#getRolefournis_connectionmanager_security <em>Rolefournis connectionmanager security</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.ConnecteurServeurDImpl#getRolerequis_connectionmanager_security <em>Rolerequis connectionmanager security</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.ConnecteurServeurDImpl#getRolefournis_security_connection <em>Rolefournis security connection</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.ConnecteurServeurDImpl#getRolerequis_security_connection <em>Rolerequis security connection</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.ConnecteurServeurDImpl#getRolefournis_security_database <em>Rolefournis security database</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.ConnecteurServeurDImpl#getRolerequis_security_database <em>Rolerequis security database</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.ConnecteurServeurDImpl#getRolefournis_database_connection <em>Rolefournis database connection</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.ConnecteurServeurDImpl#getRolerequis_database_connection <em>Rolerequis database connection</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.ConnecteurServeurDImpl#getRolefournis_database_security <em>Rolefournis database security</em>}</li>
 *   <li>{@link systeme.FonctionServeur.impl.ConnecteurServeurDImpl#getRolerequis_database_security <em>Rolerequis database security</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnecteurServeurDImpl extends ConnecteursImpl implements ConnecteurServeurD {
	/**
	 * The cached value of the '{@link #getGlueserveur1() <em>Glueserveur1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlueserveur1()
	 * @generated
	 * @ordered
	 */
	protected Glue glueserveur1;

	/**
	 * The cached value of the '{@link #getGlueserveur2() <em>Glueserveur2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlueserveur2()
	 * @generated
	 * @ordered
	 */
	protected Glue glueserveur2;

	/**
	 * The cached value of the '{@link #getGlueserveur3() <em>Glueserveur3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlueserveur3()
	 * @generated
	 * @ordered
	 */
	protected Glue glueserveur3;

	/**
	 * The cached value of the '{@link #getGlueserveur4() <em>Glueserveur4</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlueserveur4()
	 * @generated
	 * @ordered
	 */
	protected Glue glueserveur4;

	/**
	 * The cached value of the '{@link #getGlueserveur5() <em>Glueserveur5</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlueserveur5()
	 * @generated
	 * @ordered
	 */
	protected Glue glueserveur5;

	/**
	 * The cached value of the '{@link #getGlueserveur6() <em>Glueserveur6</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlueserveur6()
	 * @generated
	 * @ordered
	 */
	protected Glue glueserveur6;

	/**
	 * The cached value of the '{@link #getRolefournis_connectionmanager_database() <em>Rolefournis connectionmanager database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolefournis_connectionmanager_database()
	 * @generated
	 * @ordered
	 */
	protected RoleConnecteursFournis rolefournis_connectionmanager_database;

	/**
	 * The cached value of the '{@link #getRolerequis_connectionmanager_database() <em>Rolerequis connectionmanager database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolerequis_connectionmanager_database()
	 * @generated
	 * @ordered
	 */
	protected RoleConnecteursRequis rolerequis_connectionmanager_database;

	/**
	 * The cached value of the '{@link #getRolefournis_connectionmanager_security() <em>Rolefournis connectionmanager security</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolefournis_connectionmanager_security()
	 * @generated
	 * @ordered
	 */
	protected RoleFournis_ConnectionManager_Security rolefournis_connectionmanager_security;

	/**
	 * The cached value of the '{@link #getRolerequis_connectionmanager_security() <em>Rolerequis connectionmanager security</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolerequis_connectionmanager_security()
	 * @generated
	 * @ordered
	 */
	protected RoleRequis_ConnectionManager_Security rolerequis_connectionmanager_security;

	/**
	 * The cached value of the '{@link #getRolefournis_security_connection() <em>Rolefournis security connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolefournis_security_connection()
	 * @generated
	 * @ordered
	 */
	protected RoleFournis_Security_Connection rolefournis_security_connection;

	/**
	 * The cached value of the '{@link #getRolerequis_security_connection() <em>Rolerequis security connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolerequis_security_connection()
	 * @generated
	 * @ordered
	 */
	protected RoleRequis_Security_Connection rolerequis_security_connection;

	/**
	 * The cached value of the '{@link #getRolefournis_security_database() <em>Rolefournis security database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolefournis_security_database()
	 * @generated
	 * @ordered
	 */
	protected RoleFournis_Security_Database rolefournis_security_database;

	/**
	 * The cached value of the '{@link #getRolerequis_security_database() <em>Rolerequis security database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolerequis_security_database()
	 * @generated
	 * @ordered
	 */
	protected RoleRequis_Security_Database rolerequis_security_database;

	/**
	 * The cached value of the '{@link #getRolefournis_database_connection() <em>Rolefournis database connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolefournis_database_connection()
	 * @generated
	 * @ordered
	 */
	protected RoleFournis_Database_Connection rolefournis_database_connection;

	/**
	 * The cached value of the '{@link #getRolerequis_database_connection() <em>Rolerequis database connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolerequis_database_connection()
	 * @generated
	 * @ordered
	 */
	protected RoleRequis_Database_Connection rolerequis_database_connection;

	/**
	 * The cached value of the '{@link #getRolefournis_database_security() <em>Rolefournis database security</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolefournis_database_security()
	 * @generated
	 * @ordered
	 */
	protected RoleFournis_Database_Security rolefournis_database_security;

	/**
	 * The cached value of the '{@link #getRolerequis_database_security() <em>Rolerequis database security</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolerequis_database_security()
	 * @generated
	 * @ordered
	 */
	protected RoleRequis_Database_Security rolerequis_database_security;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnecteurServeurDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FonctionServeurPackage.Literals.CONNECTEUR_SERVEUR_D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue getGlueserveur1() {
		if (glueserveur1 != null && ((EObject)glueserveur1).eIsProxy()) {
			InternalEObject oldGlueserveur1 = (InternalEObject)glueserveur1;
			glueserveur1 = (Glue)eResolveProxy(oldGlueserveur1);
			if (glueserveur1 != oldGlueserveur1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR1, oldGlueserveur1, glueserveur1));
			}
		}
		return glueserveur1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue basicGetGlueserveur1() {
		return glueserveur1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlueserveur1(Glue newGlueserveur1) {
		Glue oldGlueserveur1 = glueserveur1;
		glueserveur1 = newGlueserveur1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR1, oldGlueserveur1, glueserveur1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue getGlueserveur2() {
		if (glueserveur2 != null && ((EObject)glueserveur2).eIsProxy()) {
			InternalEObject oldGlueserveur2 = (InternalEObject)glueserveur2;
			glueserveur2 = (Glue)eResolveProxy(oldGlueserveur2);
			if (glueserveur2 != oldGlueserveur2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR2, oldGlueserveur2, glueserveur2));
			}
		}
		return glueserveur2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue basicGetGlueserveur2() {
		return glueserveur2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlueserveur2(Glue newGlueserveur2) {
		Glue oldGlueserveur2 = glueserveur2;
		glueserveur2 = newGlueserveur2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR2, oldGlueserveur2, glueserveur2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue getGlueserveur3() {
		if (glueserveur3 != null && ((EObject)glueserveur3).eIsProxy()) {
			InternalEObject oldGlueserveur3 = (InternalEObject)glueserveur3;
			glueserveur3 = (Glue)eResolveProxy(oldGlueserveur3);
			if (glueserveur3 != oldGlueserveur3) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR3, oldGlueserveur3, glueserveur3));
			}
		}
		return glueserveur3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue basicGetGlueserveur3() {
		return glueserveur3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlueserveur3(Glue newGlueserveur3) {
		Glue oldGlueserveur3 = glueserveur3;
		glueserveur3 = newGlueserveur3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR3, oldGlueserveur3, glueserveur3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue getGlueserveur4() {
		if (glueserveur4 != null && ((EObject)glueserveur4).eIsProxy()) {
			InternalEObject oldGlueserveur4 = (InternalEObject)glueserveur4;
			glueserveur4 = (Glue)eResolveProxy(oldGlueserveur4);
			if (glueserveur4 != oldGlueserveur4) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR4, oldGlueserveur4, glueserveur4));
			}
		}
		return glueserveur4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue basicGetGlueserveur4() {
		return glueserveur4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlueserveur4(Glue newGlueserveur4) {
		Glue oldGlueserveur4 = glueserveur4;
		glueserveur4 = newGlueserveur4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR4, oldGlueserveur4, glueserveur4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue getGlueserveur5() {
		if (glueserveur5 != null && ((EObject)glueserveur5).eIsProxy()) {
			InternalEObject oldGlueserveur5 = (InternalEObject)glueserveur5;
			glueserveur5 = (Glue)eResolveProxy(oldGlueserveur5);
			if (glueserveur5 != oldGlueserveur5) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR5, oldGlueserveur5, glueserveur5));
			}
		}
		return glueserveur5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue basicGetGlueserveur5() {
		return glueserveur5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlueserveur5(Glue newGlueserveur5) {
		Glue oldGlueserveur5 = glueserveur5;
		glueserveur5 = newGlueserveur5;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR5, oldGlueserveur5, glueserveur5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue getGlueserveur6() {
		if (glueserveur6 != null && ((EObject)glueserveur6).eIsProxy()) {
			InternalEObject oldGlueserveur6 = (InternalEObject)glueserveur6;
			glueserveur6 = (Glue)eResolveProxy(oldGlueserveur6);
			if (glueserveur6 != oldGlueserveur6) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR6, oldGlueserveur6, glueserveur6));
			}
		}
		return glueserveur6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue basicGetGlueserveur6() {
		return glueserveur6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlueserveur6(Glue newGlueserveur6) {
		Glue oldGlueserveur6 = glueserveur6;
		glueserveur6 = newGlueserveur6;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR6, oldGlueserveur6, glueserveur6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnecteursFournis getRolefournis_connectionmanager_database() {
		if (rolefournis_connectionmanager_database != null && ((EObject)rolefournis_connectionmanager_database).eIsProxy()) {
			InternalEObject oldRolefournis_connectionmanager_database = (InternalEObject)rolefournis_connectionmanager_database;
			rolefournis_connectionmanager_database = (RoleConnecteursFournis)eResolveProxy(oldRolefournis_connectionmanager_database);
			if (rolefournis_connectionmanager_database != oldRolefournis_connectionmanager_database) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_CONNECTIONMANAGER_DATABASE, oldRolefournis_connectionmanager_database, rolefournis_connectionmanager_database));
			}
		}
		return rolefournis_connectionmanager_database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnecteursFournis basicGetRolefournis_connectionmanager_database() {
		return rolefournis_connectionmanager_database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolefournis_connectionmanager_database(RoleConnecteursFournis newRolefournis_connectionmanager_database) {
		RoleConnecteursFournis oldRolefournis_connectionmanager_database = rolefournis_connectionmanager_database;
		rolefournis_connectionmanager_database = newRolefournis_connectionmanager_database;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_CONNECTIONMANAGER_DATABASE, oldRolefournis_connectionmanager_database, rolefournis_connectionmanager_database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnecteursRequis getRolerequis_connectionmanager_database() {
		if (rolerequis_connectionmanager_database != null && ((EObject)rolerequis_connectionmanager_database).eIsProxy()) {
			InternalEObject oldRolerequis_connectionmanager_database = (InternalEObject)rolerequis_connectionmanager_database;
			rolerequis_connectionmanager_database = (RoleConnecteursRequis)eResolveProxy(oldRolerequis_connectionmanager_database);
			if (rolerequis_connectionmanager_database != oldRolerequis_connectionmanager_database) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_CONNECTIONMANAGER_DATABASE, oldRolerequis_connectionmanager_database, rolerequis_connectionmanager_database));
			}
		}
		return rolerequis_connectionmanager_database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnecteursRequis basicGetRolerequis_connectionmanager_database() {
		return rolerequis_connectionmanager_database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolerequis_connectionmanager_database(RoleConnecteursRequis newRolerequis_connectionmanager_database) {
		RoleConnecteursRequis oldRolerequis_connectionmanager_database = rolerequis_connectionmanager_database;
		rolerequis_connectionmanager_database = newRolerequis_connectionmanager_database;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_CONNECTIONMANAGER_DATABASE, oldRolerequis_connectionmanager_database, rolerequis_connectionmanager_database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFournis_ConnectionManager_Security getRolefournis_connectionmanager_security() {
		if (rolefournis_connectionmanager_security != null && rolefournis_connectionmanager_security.eIsProxy()) {
			InternalEObject oldRolefournis_connectionmanager_security = (InternalEObject)rolefournis_connectionmanager_security;
			rolefournis_connectionmanager_security = (RoleFournis_ConnectionManager_Security)eResolveProxy(oldRolefournis_connectionmanager_security);
			if (rolefournis_connectionmanager_security != oldRolefournis_connectionmanager_security) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_CONNECTIONMANAGER_SECURITY, oldRolefournis_connectionmanager_security, rolefournis_connectionmanager_security));
			}
		}
		return rolefournis_connectionmanager_security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFournis_ConnectionManager_Security basicGetRolefournis_connectionmanager_security() {
		return rolefournis_connectionmanager_security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolefournis_connectionmanager_security(RoleFournis_ConnectionManager_Security newRolefournis_connectionmanager_security) {
		RoleFournis_ConnectionManager_Security oldRolefournis_connectionmanager_security = rolefournis_connectionmanager_security;
		rolefournis_connectionmanager_security = newRolefournis_connectionmanager_security;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_CONNECTIONMANAGER_SECURITY, oldRolefournis_connectionmanager_security, rolefournis_connectionmanager_security));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis_ConnectionManager_Security getRolerequis_connectionmanager_security() {
		if (rolerequis_connectionmanager_security != null && rolerequis_connectionmanager_security.eIsProxy()) {
			InternalEObject oldRolerequis_connectionmanager_security = (InternalEObject)rolerequis_connectionmanager_security;
			rolerequis_connectionmanager_security = (RoleRequis_ConnectionManager_Security)eResolveProxy(oldRolerequis_connectionmanager_security);
			if (rolerequis_connectionmanager_security != oldRolerequis_connectionmanager_security) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_CONNECTIONMANAGER_SECURITY, oldRolerequis_connectionmanager_security, rolerequis_connectionmanager_security));
			}
		}
		return rolerequis_connectionmanager_security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis_ConnectionManager_Security basicGetRolerequis_connectionmanager_security() {
		return rolerequis_connectionmanager_security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolerequis_connectionmanager_security(RoleRequis_ConnectionManager_Security newRolerequis_connectionmanager_security) {
		RoleRequis_ConnectionManager_Security oldRolerequis_connectionmanager_security = rolerequis_connectionmanager_security;
		rolerequis_connectionmanager_security = newRolerequis_connectionmanager_security;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_CONNECTIONMANAGER_SECURITY, oldRolerequis_connectionmanager_security, rolerequis_connectionmanager_security));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFournis_Security_Connection getRolefournis_security_connection() {
		if (rolefournis_security_connection != null && rolefournis_security_connection.eIsProxy()) {
			InternalEObject oldRolefournis_security_connection = (InternalEObject)rolefournis_security_connection;
			rolefournis_security_connection = (RoleFournis_Security_Connection)eResolveProxy(oldRolefournis_security_connection);
			if (rolefournis_security_connection != oldRolefournis_security_connection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_SECURITY_CONNECTION, oldRolefournis_security_connection, rolefournis_security_connection));
			}
		}
		return rolefournis_security_connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFournis_Security_Connection basicGetRolefournis_security_connection() {
		return rolefournis_security_connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolefournis_security_connection(RoleFournis_Security_Connection newRolefournis_security_connection) {
		RoleFournis_Security_Connection oldRolefournis_security_connection = rolefournis_security_connection;
		rolefournis_security_connection = newRolefournis_security_connection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_SECURITY_CONNECTION, oldRolefournis_security_connection, rolefournis_security_connection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis_Security_Connection getRolerequis_security_connection() {
		if (rolerequis_security_connection != null && rolerequis_security_connection.eIsProxy()) {
			InternalEObject oldRolerequis_security_connection = (InternalEObject)rolerequis_security_connection;
			rolerequis_security_connection = (RoleRequis_Security_Connection)eResolveProxy(oldRolerequis_security_connection);
			if (rolerequis_security_connection != oldRolerequis_security_connection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_SECURITY_CONNECTION, oldRolerequis_security_connection, rolerequis_security_connection));
			}
		}
		return rolerequis_security_connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis_Security_Connection basicGetRolerequis_security_connection() {
		return rolerequis_security_connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolerequis_security_connection(RoleRequis_Security_Connection newRolerequis_security_connection) {
		RoleRequis_Security_Connection oldRolerequis_security_connection = rolerequis_security_connection;
		rolerequis_security_connection = newRolerequis_security_connection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_SECURITY_CONNECTION, oldRolerequis_security_connection, rolerequis_security_connection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFournis_Security_Database getRolefournis_security_database() {
		if (rolefournis_security_database != null && rolefournis_security_database.eIsProxy()) {
			InternalEObject oldRolefournis_security_database = (InternalEObject)rolefournis_security_database;
			rolefournis_security_database = (RoleFournis_Security_Database)eResolveProxy(oldRolefournis_security_database);
			if (rolefournis_security_database != oldRolefournis_security_database) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_SECURITY_DATABASE, oldRolefournis_security_database, rolefournis_security_database));
			}
		}
		return rolefournis_security_database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFournis_Security_Database basicGetRolefournis_security_database() {
		return rolefournis_security_database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolefournis_security_database(RoleFournis_Security_Database newRolefournis_security_database) {
		RoleFournis_Security_Database oldRolefournis_security_database = rolefournis_security_database;
		rolefournis_security_database = newRolefournis_security_database;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_SECURITY_DATABASE, oldRolefournis_security_database, rolefournis_security_database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis_Security_Database getRolerequis_security_database() {
		if (rolerequis_security_database != null && rolerequis_security_database.eIsProxy()) {
			InternalEObject oldRolerequis_security_database = (InternalEObject)rolerequis_security_database;
			rolerequis_security_database = (RoleRequis_Security_Database)eResolveProxy(oldRolerequis_security_database);
			if (rolerequis_security_database != oldRolerequis_security_database) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_SECURITY_DATABASE, oldRolerequis_security_database, rolerequis_security_database));
			}
		}
		return rolerequis_security_database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis_Security_Database basicGetRolerequis_security_database() {
		return rolerequis_security_database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolerequis_security_database(RoleRequis_Security_Database newRolerequis_security_database) {
		RoleRequis_Security_Database oldRolerequis_security_database = rolerequis_security_database;
		rolerequis_security_database = newRolerequis_security_database;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_SECURITY_DATABASE, oldRolerequis_security_database, rolerequis_security_database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFournis_Database_Connection getRolefournis_database_connection() {
		if (rolefournis_database_connection != null && rolefournis_database_connection.eIsProxy()) {
			InternalEObject oldRolefournis_database_connection = (InternalEObject)rolefournis_database_connection;
			rolefournis_database_connection = (RoleFournis_Database_Connection)eResolveProxy(oldRolefournis_database_connection);
			if (rolefournis_database_connection != oldRolefournis_database_connection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_DATABASE_CONNECTION, oldRolefournis_database_connection, rolefournis_database_connection));
			}
		}
		return rolefournis_database_connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFournis_Database_Connection basicGetRolefournis_database_connection() {
		return rolefournis_database_connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolefournis_database_connection(RoleFournis_Database_Connection newRolefournis_database_connection) {
		RoleFournis_Database_Connection oldRolefournis_database_connection = rolefournis_database_connection;
		rolefournis_database_connection = newRolefournis_database_connection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_DATABASE_CONNECTION, oldRolefournis_database_connection, rolefournis_database_connection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis_Database_Connection getRolerequis_database_connection() {
		if (rolerequis_database_connection != null && rolerequis_database_connection.eIsProxy()) {
			InternalEObject oldRolerequis_database_connection = (InternalEObject)rolerequis_database_connection;
			rolerequis_database_connection = (RoleRequis_Database_Connection)eResolveProxy(oldRolerequis_database_connection);
			if (rolerequis_database_connection != oldRolerequis_database_connection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_DATABASE_CONNECTION, oldRolerequis_database_connection, rolerequis_database_connection));
			}
		}
		return rolerequis_database_connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis_Database_Connection basicGetRolerequis_database_connection() {
		return rolerequis_database_connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolerequis_database_connection(RoleRequis_Database_Connection newRolerequis_database_connection) {
		RoleRequis_Database_Connection oldRolerequis_database_connection = rolerequis_database_connection;
		rolerequis_database_connection = newRolerequis_database_connection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_DATABASE_CONNECTION, oldRolerequis_database_connection, rolerequis_database_connection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFournis_Database_Security getRolefournis_database_security() {
		if (rolefournis_database_security != null && rolefournis_database_security.eIsProxy()) {
			InternalEObject oldRolefournis_database_security = (InternalEObject)rolefournis_database_security;
			rolefournis_database_security = (RoleFournis_Database_Security)eResolveProxy(oldRolefournis_database_security);
			if (rolefournis_database_security != oldRolefournis_database_security) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_DATABASE_SECURITY, oldRolefournis_database_security, rolefournis_database_security));
			}
		}
		return rolefournis_database_security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFournis_Database_Security basicGetRolefournis_database_security() {
		return rolefournis_database_security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolefournis_database_security(RoleFournis_Database_Security newRolefournis_database_security) {
		RoleFournis_Database_Security oldRolefournis_database_security = rolefournis_database_security;
		rolefournis_database_security = newRolefournis_database_security;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_DATABASE_SECURITY, oldRolefournis_database_security, rolefournis_database_security));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis_Database_Security getRolerequis_database_security() {
		if (rolerequis_database_security != null && rolerequis_database_security.eIsProxy()) {
			InternalEObject oldRolerequis_database_security = (InternalEObject)rolerequis_database_security;
			rolerequis_database_security = (RoleRequis_Database_Security)eResolveProxy(oldRolerequis_database_security);
			if (rolerequis_database_security != oldRolerequis_database_security) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_DATABASE_SECURITY, oldRolerequis_database_security, rolerequis_database_security));
			}
		}
		return rolerequis_database_security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequis_Database_Security basicGetRolerequis_database_security() {
		return rolerequis_database_security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolerequis_database_security(RoleRequis_Database_Security newRolerequis_database_security) {
		RoleRequis_Database_Security oldRolerequis_database_security = rolerequis_database_security;
		rolerequis_database_security = newRolerequis_database_security;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_DATABASE_SECURITY, oldRolerequis_database_security, rolerequis_database_security));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR1:
				if (resolve) return getGlueserveur1();
				return basicGetGlueserveur1();
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR2:
				if (resolve) return getGlueserveur2();
				return basicGetGlueserveur2();
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR3:
				if (resolve) return getGlueserveur3();
				return basicGetGlueserveur3();
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR4:
				if (resolve) return getGlueserveur4();
				return basicGetGlueserveur4();
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR5:
				if (resolve) return getGlueserveur5();
				return basicGetGlueserveur5();
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR6:
				if (resolve) return getGlueserveur6();
				return basicGetGlueserveur6();
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_CONNECTIONMANAGER_DATABASE:
				if (resolve) return getRolefournis_connectionmanager_database();
				return basicGetRolefournis_connectionmanager_database();
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_CONNECTIONMANAGER_DATABASE:
				if (resolve) return getRolerequis_connectionmanager_database();
				return basicGetRolerequis_connectionmanager_database();
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_CONNECTIONMANAGER_SECURITY:
				if (resolve) return getRolefournis_connectionmanager_security();
				return basicGetRolefournis_connectionmanager_security();
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_CONNECTIONMANAGER_SECURITY:
				if (resolve) return getRolerequis_connectionmanager_security();
				return basicGetRolerequis_connectionmanager_security();
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_SECURITY_CONNECTION:
				if (resolve) return getRolefournis_security_connection();
				return basicGetRolefournis_security_connection();
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_SECURITY_CONNECTION:
				if (resolve) return getRolerequis_security_connection();
				return basicGetRolerequis_security_connection();
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_SECURITY_DATABASE:
				if (resolve) return getRolefournis_security_database();
				return basicGetRolefournis_security_database();
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_SECURITY_DATABASE:
				if (resolve) return getRolerequis_security_database();
				return basicGetRolerequis_security_database();
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_DATABASE_CONNECTION:
				if (resolve) return getRolefournis_database_connection();
				return basicGetRolefournis_database_connection();
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_DATABASE_CONNECTION:
				if (resolve) return getRolerequis_database_connection();
				return basicGetRolerequis_database_connection();
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_DATABASE_SECURITY:
				if (resolve) return getRolefournis_database_security();
				return basicGetRolefournis_database_security();
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_DATABASE_SECURITY:
				if (resolve) return getRolerequis_database_security();
				return basicGetRolerequis_database_security();
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
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR1:
				setGlueserveur1((Glue)newValue);
				return;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR2:
				setGlueserveur2((Glue)newValue);
				return;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR3:
				setGlueserveur3((Glue)newValue);
				return;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR4:
				setGlueserveur4((Glue)newValue);
				return;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR5:
				setGlueserveur5((Glue)newValue);
				return;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR6:
				setGlueserveur6((Glue)newValue);
				return;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_CONNECTIONMANAGER_DATABASE:
				setRolefournis_connectionmanager_database((RoleConnecteursFournis)newValue);
				return;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_CONNECTIONMANAGER_DATABASE:
				setRolerequis_connectionmanager_database((RoleConnecteursRequis)newValue);
				return;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_CONNECTIONMANAGER_SECURITY:
				setRolefournis_connectionmanager_security((RoleFournis_ConnectionManager_Security)newValue);
				return;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_CONNECTIONMANAGER_SECURITY:
				setRolerequis_connectionmanager_security((RoleRequis_ConnectionManager_Security)newValue);
				return;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_SECURITY_CONNECTION:
				setRolefournis_security_connection((RoleFournis_Security_Connection)newValue);
				return;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_SECURITY_CONNECTION:
				setRolerequis_security_connection((RoleRequis_Security_Connection)newValue);
				return;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_SECURITY_DATABASE:
				setRolefournis_security_database((RoleFournis_Security_Database)newValue);
				return;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_SECURITY_DATABASE:
				setRolerequis_security_database((RoleRequis_Security_Database)newValue);
				return;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_DATABASE_CONNECTION:
				setRolefournis_database_connection((RoleFournis_Database_Connection)newValue);
				return;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_DATABASE_CONNECTION:
				setRolerequis_database_connection((RoleRequis_Database_Connection)newValue);
				return;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_DATABASE_SECURITY:
				setRolefournis_database_security((RoleFournis_Database_Security)newValue);
				return;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_DATABASE_SECURITY:
				setRolerequis_database_security((RoleRequis_Database_Security)newValue);
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
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR1:
				setGlueserveur1((Glue)null);
				return;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR2:
				setGlueserveur2((Glue)null);
				return;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR3:
				setGlueserveur3((Glue)null);
				return;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR4:
				setGlueserveur4((Glue)null);
				return;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR5:
				setGlueserveur5((Glue)null);
				return;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR6:
				setGlueserveur6((Glue)null);
				return;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_CONNECTIONMANAGER_DATABASE:
				setRolefournis_connectionmanager_database((RoleConnecteursFournis)null);
				return;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_CONNECTIONMANAGER_DATABASE:
				setRolerequis_connectionmanager_database((RoleConnecteursRequis)null);
				return;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_CONNECTIONMANAGER_SECURITY:
				setRolefournis_connectionmanager_security((RoleFournis_ConnectionManager_Security)null);
				return;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_CONNECTIONMANAGER_SECURITY:
				setRolerequis_connectionmanager_security((RoleRequis_ConnectionManager_Security)null);
				return;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_SECURITY_CONNECTION:
				setRolefournis_security_connection((RoleFournis_Security_Connection)null);
				return;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_SECURITY_CONNECTION:
				setRolerequis_security_connection((RoleRequis_Security_Connection)null);
				return;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_SECURITY_DATABASE:
				setRolefournis_security_database((RoleFournis_Security_Database)null);
				return;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_SECURITY_DATABASE:
				setRolerequis_security_database((RoleRequis_Security_Database)null);
				return;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_DATABASE_CONNECTION:
				setRolefournis_database_connection((RoleFournis_Database_Connection)null);
				return;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_DATABASE_CONNECTION:
				setRolerequis_database_connection((RoleRequis_Database_Connection)null);
				return;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_DATABASE_SECURITY:
				setRolefournis_database_security((RoleFournis_Database_Security)null);
				return;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_DATABASE_SECURITY:
				setRolerequis_database_security((RoleRequis_Database_Security)null);
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
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR1:
				return glueserveur1 != null;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR2:
				return glueserveur2 != null;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR3:
				return glueserveur3 != null;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR4:
				return glueserveur4 != null;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR5:
				return glueserveur5 != null;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__GLUESERVEUR6:
				return glueserveur6 != null;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_CONNECTIONMANAGER_DATABASE:
				return rolefournis_connectionmanager_database != null;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_CONNECTIONMANAGER_DATABASE:
				return rolerequis_connectionmanager_database != null;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_CONNECTIONMANAGER_SECURITY:
				return rolefournis_connectionmanager_security != null;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_CONNECTIONMANAGER_SECURITY:
				return rolerequis_connectionmanager_security != null;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_SECURITY_CONNECTION:
				return rolefournis_security_connection != null;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_SECURITY_CONNECTION:
				return rolerequis_security_connection != null;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_SECURITY_DATABASE:
				return rolefournis_security_database != null;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_SECURITY_DATABASE:
				return rolerequis_security_database != null;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_DATABASE_CONNECTION:
				return rolefournis_database_connection != null;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_DATABASE_CONNECTION:
				return rolerequis_database_connection != null;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEFOURNIS_DATABASE_SECURITY:
				return rolefournis_database_security != null;
			case FonctionServeurPackage.CONNECTEUR_SERVEUR_D__ROLEREQUIS_DATABASE_SECURITY:
				return rolerequis_database_security != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnecteurServeurDImpl
