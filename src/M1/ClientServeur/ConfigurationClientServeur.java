/**
 * 
 */
package M1.ClientServeur;

import M1.ClientServeur.Composant.ComposantClient;
import M1.ClientServeur.Composant.ComposantServeur;
import M1.ClientServeur.Connecteur.RPC;
import M2.Configuration;
import M2.PortComposantFournis;
import M2.PortComposantRequis;
import M2.RoleConnecteurFournis;
import M2.RoleConnecteurRequis;

/**
 * @author sullivan
 *
 */
public class ConfigurationClientServeur extends Configuration{

	public ConfigurationClientServeur(){
		super("ConfigurationClientServeur");
		
		RPC rpc = new RPC();
		ComposantClient composantClient = new ComposantClient();
		ComposantServeur composantServeur = new ComposantServeur();
		
		this.add(rpc);
		this.add(composantClient);
		this.add(composantServeur);
		
		PortComposantRequis pcr1 = (PortComposantRequis) composantClient.getInterface("InterfaceClient").getPort("Port_Send_Client");
		RoleConnecteurFournis rcf1 = (RoleConnecteurFournis) rpc.getRole("CallerServeur");
		this.attachment(pcr1,rcf1);

		PortComposantFournis pcf1 = (PortComposantFournis) composantServeur.getInterface("InterfaceServeur").getPort("Port_Receive_Request");
		RoleConnecteurRequis rcr1 = (RoleConnecteurRequis) rpc.getRole("CalledServeur");
		this.attachment(pcf1,rcr1);

		PortComposantRequis pcr2 = (PortComposantRequis) composantServeur.getInterface("InterfaceServeur").getPort("Port_Send_Serveur");
		RoleConnecteurFournis rcf2 = (RoleConnecteurFournis) rpc.getRole("CallerClient");
		this.attachment(pcr2,rcf2);
		
		PortComposantFournis pcf2 = (PortComposantFournis) composantClient.getInterface("InterfaceClient").getPort("Port_Receive_Client");
		RoleConnecteurRequis rcr2 = (RoleConnecteurRequis) rpc.getRole("CalledClient");
		this.attachment(pcr2,rcf2);

		
	}
}
