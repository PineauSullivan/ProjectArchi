package M2;

import java.util.Hashtable;

public class Connecteur extends Element {
	
	Hashtable<String, Glue> glues;
	Hashtable<String, RoleConnecteur> roles;
	
	public Connecteur(String n) {
		super(n);
	}

	public Hashtable<String, Glue> getGlues() {
		return glues;
	}

	public void setGlues(Hashtable<String, Glue> glues) {
		this.glues = glues;
	}

	public Hashtable<String, RoleConnecteur> getRoles() {
		return roles;
	}

	public void setRoles(Hashtable<String, RoleConnecteur> roles) {
		this.roles = roles;
	}
	
	public boolean add(String nom, Glue glue){
		if(!glues.containsKey(glue)){
			glues.put(nom, glue);
			return true;
		}
		else return false;
	}
	
	public boolean add(String nom, RoleConnecteur role){
		if(!roles.containsKey(role)){
			roles.put(nom, role);
			return true;
		}
		else return false;
	}
	
}
