/**
 * 
 */
package M1.ClientServeur.Interface;

import M2.InterfaceComposant;
import M2.PortComposantFournis;
import M2.PortComposantRequis;

/**
 * @author sullivan
 *
 */
public class InterfaceServeur extends InterfaceComposant{

	public InterfaceServeur(){
		super("InterfaceServeur");
		
		PortComposantFournis PCF = new PortComposantFournis("Port_Receive_Request");
		PortComposantRequis PCR = new PortComposantRequis("Port_Send_Serveur");
		
		this.add(PCF);
		this.add(PCR);
	}
}
