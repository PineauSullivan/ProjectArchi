/**
 */
package systeme.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import systeme.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemeFactoryImpl extends EFactoryImpl implements SystemeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SystemeFactory init() {
		try {
			SystemeFactory theSystemeFactory = (SystemeFactory)EPackage.Registry.INSTANCE.getEFactory(SystemePackage.eNS_URI);
			if (theSystemeFactory != null) {
				return theSystemeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SystemeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SystemePackage.SYSTEME: return createSysteme();
			case SystemePackage.BINDING_REQUIS_CS: return createBindingRequisCS();
			case SystemePackage.BINDING_FOURNIS_CS: return createBindingFournisCS();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Systeme createSysteme() {
		SystemeImpl systeme = new SystemeImpl();
		return systeme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingRequisCS createBindingRequisCS() {
		BindingRequisCSImpl bindingRequisCS = new BindingRequisCSImpl();
		return bindingRequisCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingFournisCS createBindingFournisCS() {
		BindingFournisCSImpl bindingFournisCS = new BindingFournisCSImpl();
		return bindingFournisCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemePackage getSystemePackage() {
		return (SystemePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SystemePackage getPackage() {
		return SystemePackage.eINSTANCE;
	}

} //SystemeFactoryImpl
