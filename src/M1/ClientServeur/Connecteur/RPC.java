/**
 * 
 */
package M1.ClientServeur.Connecteur;

import M2.Connecteur;
import M2.Glue;
import M2.RoleConnecteurFournis;
import M2.RoleConnecteurRequis;

/**
 * @author Sébastien Vallée & Sullivan Pineau
 *
 */
public class RPC extends Connecteur{

	public RPC(){
		super("RPC");

		RoleConnecteurFournis callerClient = new RoleConnecteurFournis("CallerClient");
		RoleConnecteurRequis calledClient = new RoleConnecteurRequis("CalledClient");
		this.add(callerClient);
		this.add(calledClient);
		Glue glueCS1 = new Glue("GlueCS1", callerClient, calledClient);
		
		RoleConnecteurFournis callerServeur = new RoleConnecteurFournis("CallerServeur");
		RoleConnecteurRequis calledServeur = new RoleConnecteurRequis("CalledServeur");
		this.add(callerServeur);
		this.add(calledServeur);
		Glue glueCS2 = new Glue("GlueCS2", callerServeur, calledServeur);

		this.add(glueCS1);
		this.add(glueCS2);
	}
}
