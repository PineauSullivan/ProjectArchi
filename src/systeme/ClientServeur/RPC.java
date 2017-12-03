/**
 */
package systeme.ClientServeur;

import projecttArchitectural.Connecteurs;
import projecttArchitectural.Glue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RPC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link systeme.ClientServeur.RPC#getGluecs1 <em>Gluecs1</em>}</li>
 *   <li>{@link systeme.ClientServeur.RPC#getGluecs2 <em>Gluecs2</em>}</li>
 *   <li>{@link systeme.ClientServeur.RPC#getCallerclient <em>Callerclient</em>}</li>
 *   <li>{@link systeme.ClientServeur.RPC#getCallerserveur <em>Callerserveur</em>}</li>
 *   <li>{@link systeme.ClientServeur.RPC#getCalledclient <em>Calledclient</em>}</li>
 *   <li>{@link systeme.ClientServeur.RPC#getCalledserveur <em>Calledserveur</em>}</li>
 * </ul>
 *
 * @see systeme.ClientServeur.ClientServeurPackage#getRPC()
 * @model
 * @generated
 */
public interface RPC extends Connecteurs {
	/**
	 * Returns the value of the '<em><b>Gluecs1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gluecs1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gluecs1</em>' reference.
	 * @see #setGluecs1(Glue)
	 * @see systeme.ClientServeur.ClientServeurPackage#getRPC_Gluecs1()
	 * @model type="systeme.ClientServeur.GlueCS1"
	 * @generated
	 */
	Glue getGluecs1();

	/**
	 * Sets the value of the '{@link systeme.ClientServeur.RPC#getGluecs1 <em>Gluecs1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gluecs1</em>' reference.
	 * @see #getGluecs1()
	 * @generated
	 */
	void setGluecs1(Glue value);

	/**
	 * Returns the value of the '<em><b>Gluecs2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gluecs2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gluecs2</em>' reference.
	 * @see #setGluecs2(Glue)
	 * @see systeme.ClientServeur.ClientServeurPackage#getRPC_Gluecs2()
	 * @model type="systeme.ClientServeur.GlueCS2"
	 * @generated
	 */
	Glue getGluecs2();

	/**
	 * Sets the value of the '{@link systeme.ClientServeur.RPC#getGluecs2 <em>Gluecs2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gluecs2</em>' reference.
	 * @see #getGluecs2()
	 * @generated
	 */
	void setGluecs2(Glue value);

	/**
	 * Returns the value of the '<em><b>Callerclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callerclient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callerclient</em>' reference.
	 * @see #setCallerclient(CallerClient)
	 * @see systeme.ClientServeur.ClientServeurPackage#getRPC_Callerclient()
	 * @model
	 * @generated
	 */
	CallerClient getCallerclient();

	/**
	 * Sets the value of the '{@link systeme.ClientServeur.RPC#getCallerclient <em>Callerclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callerclient</em>' reference.
	 * @see #getCallerclient()
	 * @generated
	 */
	void setCallerclient(CallerClient value);

	/**
	 * Returns the value of the '<em><b>Callerserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callerserveur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callerserveur</em>' reference.
	 * @see #setCallerserveur(CallerServeur)
	 * @see systeme.ClientServeur.ClientServeurPackage#getRPC_Callerserveur()
	 * @model
	 * @generated
	 */
	CallerServeur getCallerserveur();

	/**
	 * Sets the value of the '{@link systeme.ClientServeur.RPC#getCallerserveur <em>Callerserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callerserveur</em>' reference.
	 * @see #getCallerserveur()
	 * @generated
	 */
	void setCallerserveur(CallerServeur value);

	/**
	 * Returns the value of the '<em><b>Calledclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calledclient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calledclient</em>' reference.
	 * @see #setCalledclient(CalledClient)
	 * @see systeme.ClientServeur.ClientServeurPackage#getRPC_Calledclient()
	 * @model
	 * @generated
	 */
	CalledClient getCalledclient();

	/**
	 * Sets the value of the '{@link systeme.ClientServeur.RPC#getCalledclient <em>Calledclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calledclient</em>' reference.
	 * @see #getCalledclient()
	 * @generated
	 */
	void setCalledclient(CalledClient value);

	/**
	 * Returns the value of the '<em><b>Calledserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calledserveur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calledserveur</em>' reference.
	 * @see #setCalledserveur(CalledServeur)
	 * @see systeme.ClientServeur.ClientServeurPackage#getRPC_Calledserveur()
	 * @model
	 * @generated
	 */
	CalledServeur getCalledserveur();

	/**
	 * Sets the value of the '{@link systeme.ClientServeur.RPC#getCalledserveur <em>Calledserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calledserveur</em>' reference.
	 * @see #getCalledserveur()
	 * @generated
	 */
	void setCalledserveur(CalledServeur value);

} // RPC
