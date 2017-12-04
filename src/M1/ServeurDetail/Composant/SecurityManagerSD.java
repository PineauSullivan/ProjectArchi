/**
 * 
 */
package M1.ServeurDetail.Composant;

import M1.ServeurDetail.Composant.Interface.InterfaceSecurityManager;
import M2.Composant;

/**
 * @author sullivan
 *
 */
public class SecurityManagerSD extends Composant {
	public SecurityManagerSD(){
		super("SecurityManager");
		
		InterfaceSecurityManager interfaceSecurityManager = new InterfaceSecurityManager();
		
		this.add(interfaceSecurityManager);
	}

}
