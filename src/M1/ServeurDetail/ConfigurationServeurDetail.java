/**
 * 
 */
package M1.ServeurDetail;

import M1.ServeurDetail.Composant.ConnectionManager;
import M1.ServeurDetail.Composant.Database;
import M1.ServeurDetail.Composant.SecurityManagerSD;
import M1.ServeurDetail.Connecteur.ConnecteurServeurDetail;
import M2.Configuration;
import M2.PortComposantFournis;
import M2.PortComposantRequis;
import M2.RoleConnecteurFournis;
import M2.RoleConnecteurRequis;

/**
 * @author sullivan
 *
 */
public class ConfigurationServeurDetail extends Configuration{

	public ConfigurationServeurDetail(){
		super("ConfigurationServeurDetail");
		
		ConnectionManager connectionManager = new ConnectionManager();
		Database database = new Database();
		SecurityManagerSD securityManager = new SecurityManagerSD();
		ConnecteurServeurDetail connecteurServeurDetail = new ConnecteurServeurDetail();
		
		this.add(connectionManager);
		this.add(database);
		this.add(securityManager);
		this.addConnecteur(connecteurServeurDetail);
		
		PortComposantFournis pcf1 = (PortComposantFournis) connectionManager.getInterface("InterfaceConnectionManager").getPort("PortFournis_ConnectionManager_Database");
		RoleConnecteurRequis rcr1 = (RoleConnecteurRequis) connecteurServeurDetail.getRole("RoleRequis_Database_Connection");
		this.attachment(pcf1,rcr1);
		
		PortComposantRequis pcr1 = (PortComposantRequis) connectionManager.getInterface("InterfaceConnectionManager").getPort("PortRequis_ConnectionManager_Database");
		RoleConnecteurFournis rcf1 = (RoleConnecteurFournis) connecteurServeurDetail.getRole("RoleFournis_Database_Connection");
		this.attachment(pcr1, rcf1);
		
		PortComposantRequis pcr2 = (PortComposantRequis) connectionManager.getInterface("InterfaceConnectionManager").getPort("PortRequis_ConnectionManager_Security");
		RoleConnecteurFournis rcf2 = (RoleConnecteurFournis) connecteurServeurDetail.getRole("RoleFournis_Security_Connection");
		this.attachment(pcr2, rcf2);
		
		PortComposantFournis pcf2 = (PortComposantFournis) connectionManager.getInterface("InterfaceConnectionManager").getPort("PortFournis_ConnectionManager_Security");
		RoleConnecteurRequis rcr2 = (RoleConnecteurRequis) connecteurServeurDetail.getRole("RoleRequis_Security_Connection");
		this.attachment(pcf2,rcr2);

		PortComposantRequis pcr3 = (PortComposantRequis) securityManager.getInterface("InterfaceSecurityManager").getPort("PortRequis_Security_Connection");
		RoleConnecteurFournis rcf3 = (RoleConnecteurFournis) connecteurServeurDetail.getRole("RoleFournis_ConnectionManager_Security");
		this.attachment(pcr3, rcf3);
		
		PortComposantFournis pcf3 = (PortComposantFournis) securityManager.getInterface("InterfaceSecurityManager").getPort("PortFournis_Security_Connection");
		RoleConnecteurRequis rcr3 = (RoleConnecteurRequis) connecteurServeurDetail.getRole("RoleRequis_ConnectionManager_Security");
		this.attachment(pcf3,rcr3);

		PortComposantRequis pcr4 = (PortComposantRequis) securityManager.getInterface("InterfaceSecurityManager").getPort("PortRequis_Security_Database");
		RoleConnecteurFournis rcf4 = (RoleConnecteurFournis) connecteurServeurDetail.getRole("RoleFournis_Database_Security");
		this.attachment(pcr4, rcf4);
		
		PortComposantFournis pcf4 = (PortComposantFournis) securityManager.getInterface("InterfaceSecurityManager").getPort("PortFournis_Security_Database");
		RoleConnecteurRequis rcr4 = (RoleConnecteurRequis) connecteurServeurDetail.getRole("RoleRequis_Database_Security");
		this.attachment(pcf4,rcr4);
		
		PortComposantRequis pcr5 = (PortComposantRequis) database.getInterface("InterfaceDatabase").getPort("PortRequis_database_Connection");
		RoleConnecteurFournis rcf5 = (RoleConnecteurFournis) connecteurServeurDetail.getRole("RoleFournis_ConnectionManager_Database");
		this.attachment(pcr5, rcf5);
		
		PortComposantFournis pcf5 = (PortComposantFournis) database.getInterface("InterfaceDatabase").getPort("PortFournis_database_Connection");
		RoleConnecteurRequis rcr5 = (RoleConnecteurRequis) connecteurServeurDetail.getRole("RoleRequis_ConnectionManager_Database");
		this.attachment(pcf5,rcr5);
		
		PortComposantRequis pcr6 = (PortComposantRequis) database.getInterface("InterfaceDatabase").getPort("PortRequis_database_Security");
		RoleConnecteurFournis rcf6 = (RoleConnecteurFournis) connecteurServeurDetail.getRole("RoleFournis_Security_Database");
		this.attachment(pcr6, rcf6);
		
		PortComposantFournis pcf6 = (PortComposantFournis) database.getInterface("InterfaceDatabase").getPort("PortFournis_database_Security");
		RoleConnecteurRequis rcr6 = (RoleConnecteurRequis) connecteurServeurDetail.getRole("RoleRequis_Security_Database");
		this.attachment(pcf6,rcr6);
		
		connectionManager.setConfiguration(this);
		securityManager.setConfiguration(this);
		database.setConfiguration(this);
	}
}
