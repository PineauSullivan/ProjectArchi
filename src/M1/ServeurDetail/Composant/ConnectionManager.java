/**
 * 
 */
package M1.ServeurDetail.Composant;

import M1.ServeurDetail.Composant.Interface.InterfaceConnectionManager;
import M2.Composant;

/**
 * @author sullivan
 *
 */
public class ConnectionManager extends Composant {
	public ConnectionManager(){
		super("ConnectionManager");
		
		InterfaceConnectionManager interfaceConnectionManager = new InterfaceConnectionManager();
		
		this.add(interfaceConnectionManager);
	}
}
