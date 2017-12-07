/**
 * 
 */
package M1.ClientServeur.Interface;

import M2.Composant;
import M2.InterfaceComposant;
import M2.PortComposantFournis;
import M2.PortComposantRequis;

/**
 * @author sullivan
 *
 */
public class InterfaceClient extends InterfaceComposant{

	public InterfaceClient(){
		super("InterfaceClient");
		
		PortComposantFournis PCF = new PortComposantFournis("Port_Receive_Client");
		PortComposantRequis PCR = new PortComposantRequis("Port_Send_Client");
		
		this.add(PCF);
		this.add(PCR);

		PCF.setInterfaceComposant(this);
		PCR.setInterfaceComposant(this);
	}
}