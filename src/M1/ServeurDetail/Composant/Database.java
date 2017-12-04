/**
 * 
 */
package M1.ServeurDetail.Composant;

import M1.ServeurDetail.Composant.Interface.InterfaceDatabase;
import M2.Composant;

/**
 * @author sullivan
 *
 */
public class Database extends Composant{
	public Database(){
		super("Database");
		
		InterfaceDatabase interfaceDatabase = new InterfaceDatabase();
		
		this.add(interfaceDatabase);
	}
}
