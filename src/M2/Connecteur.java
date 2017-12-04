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
	
	public boolean add(Glue glue){
		if(!glues.containsKey(glue.getNom())){
			if(roles.containsKey(glue.getRoleFourni().getNom()) 
					& roles.containsKey(glue.getRoleRequi().getNom())){
				glues.put(glue.getNom(), glue);
				return true;
			}
			else return false;
		}
		else return false;
	}
	
	public boolean add(RoleConnecteur role){
		if(!roles.containsKey(role.getNom())){
			roles.put(role.getNom(), role);
			return true;
		}
		else return false;
	}
	
	public RoleConnecteur getRole(String nom){
		if(roles.containsKey(nom)){
			return roles.get(nom);
		}
		else return null;
	}
	
}
