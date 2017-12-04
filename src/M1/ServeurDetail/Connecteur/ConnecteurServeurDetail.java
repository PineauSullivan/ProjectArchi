/**
 * 
 */
package M1.ServeurDetail.Connecteur;

import M2.Connecteur;
import M2.Glue;
import M2.RoleConnecteurFournis;
import M2.RoleConnecteurRequis;

/**
 * @author sullivan
 *
 */
public class ConnecteurServeurDetail extends Connecteur{

	public ConnecteurServeurDetail(){
		super("ConnecteurServeurDetail");
		
		RoleConnecteurFournis RoleFournis_ConnectionManager_Database = new RoleConnecteurFournis("RoleFournis_ConnectionManager_Database");
		RoleConnecteurRequis RoleRequis_ConnectionManager_Database = new RoleConnecteurRequis("RoleRequis_ConnectionManager_Database");
		this.add(RoleFournis_ConnectionManager_Database);
		this.add(RoleRequis_ConnectionManager_Database);
		Glue glueCS1 = new Glue("GlueServeur1", RoleFournis_ConnectionManager_Database, RoleRequis_ConnectionManager_Database);
		
		RoleConnecteurFournis RoleFournis_ConnectionManager_Security = new RoleConnecteurFournis("RoleFournis_ConnectionManager_Security");
		RoleConnecteurRequis RoleRequis_ConnectionManager_Security = new RoleConnecteurRequis("RoleRequis_ConnectionManager_Security");
		this.add(RoleFournis_ConnectionManager_Security);
		this.add(RoleRequis_ConnectionManager_Security);
		Glue glueCS2 = new Glue("GlueServeur2", RoleFournis_ConnectionManager_Security, RoleRequis_ConnectionManager_Security);
		
		RoleConnecteurFournis RoleFournis_Security_Connection = new RoleConnecteurFournis("RoleFournis_Security_Connection");
		RoleConnecteurRequis RoleRequis_Security_Connection = new RoleConnecteurRequis("RoleRequis_Security_Connection");
		this.add(RoleFournis_Security_Connection);
		this.add(RoleRequis_Security_Connection);
		Glue glueCS3 = new Glue("GlueServeur3", RoleFournis_Security_Connection, RoleRequis_Security_Connection);
		
		RoleConnecteurFournis RoleFournis_Security_Database = new RoleConnecteurFournis("RoleFournis_Security_Database");
		RoleConnecteurRequis RoleRequis_Security_Database = new RoleConnecteurRequis("RoleRequis_Security_Database");
		this.add(RoleFournis_Security_Database);
		this.add(RoleRequis_Security_Database);
		Glue glueCS4 = new Glue("GlueServeur4", RoleFournis_Security_Database, RoleRequis_Security_Database);
		
		RoleConnecteurFournis RoleFournis_Database_Connection = new RoleConnecteurFournis("RoleFournis_Database_Connection");
		RoleConnecteurRequis RoleRequis_Database_Connection = new RoleConnecteurRequis("RoleRequis_Database_Connection");
		this.add(RoleFournis_Database_Connection);
		this.add(RoleRequis_Database_Connection);
		Glue glueCS5 = new Glue("GlueServeur5", RoleFournis_Database_Connection, RoleRequis_Database_Connection);
		
		RoleConnecteurFournis RoleFournis_Database_Security = new RoleConnecteurFournis("RoleFournis_Database_Security");
		RoleConnecteurRequis RoleRequis_Database_Security = new RoleConnecteurRequis("RoleRequis_Database_Security");
		this.add(RoleFournis_Database_Security);
		this.add(RoleRequis_Database_Security);
		Glue glueCS6 = new Glue("GlueServeur6", RoleFournis_Database_Security, RoleRequis_Database_Security);
		

		this.add(glueCS1);
		this.add(glueCS2);
		this.add(glueCS3);
		this.add(glueCS4);
		this.add(glueCS5);
		this.add(glueCS6);
	}
}
