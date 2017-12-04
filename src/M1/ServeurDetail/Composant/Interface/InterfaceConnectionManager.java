/**
 * 
 */
package M1.ServeurDetail.Composant.Interface;

import M2.InterfaceComposant;
import M2.PortComposantFournis;
import M2.PortComposantRequis;

/**
 * @author sullivan
 *
 */
public class InterfaceConnectionManager extends InterfaceComposant{
	
	public InterfaceConnectionManager(){
		super("InterfaceConnectionManager");
		
		//Ports composant fournis
		PortComposantFournis PCF1 = new PortComposantFournis("PortFournis_ConnectionManager_Database");
		PortComposantFournis PCF2 = new PortComposantFournis("PortFournis_ConnectionManager_Security");
		PortComposantFournis PCF3 = new PortComposantFournis("PortFournisCS");
		
		//Ports composant requis
		PortComposantRequis PCR1 = new PortComposantRequis("PortRequis_ConnectionManager_Database");
		PortComposantRequis PCR2 = new PortComposantRequis("PortRequis_ConnectionManager_Security");
		PortComposantRequis PCR3 = new PortComposantRequis("PortRequisConfigCS");
		
		
		this.add(PCF1);
		this.add(PCF2);
		this.add(PCF3);
		
		this.add(PCR1);
		this.add(PCR2);
		this.add(PCR3);
	}
}
