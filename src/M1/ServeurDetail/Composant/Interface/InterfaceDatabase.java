/**
 * 
 */
package M1.ServeurDetail.Composant.Interface;

import M2.Composant;
import M2.InterfaceComposant;
import M2.PortComposantFournis;
import M2.PortComposantRequis;

/**
 * @author sullivan
 *
 */
public class InterfaceDatabase extends InterfaceComposant {
	
	public InterfaceDatabase(){
		super("InterfaceDatabase");
		
		//Ports composant fournis
		PortComposantFournis PCF1 = new PortComposantFournis("PortFournis_database_Connection");
		PortComposantFournis PCF2 = new PortComposantFournis("PortFournis_database_Security");
		
		//Ports composant requis
		PortComposantRequis PCR1 = new PortComposantRequis("PortRequis_database_Connection");
		PortComposantRequis PCR2 = new PortComposantRequis("PortRequis_database_Security");
		
		
		this.add(PCF1);
		this.add(PCF2);
		
		this.add(PCR1);
		this.add(PCR2);
		
		PCF1.setInterfaceComposant(this);
		PCF2.setInterfaceComposant(this);
		
		PCR1.setInterfaceComposant(this);
		PCR2.setInterfaceComposant(this);
	}
}
