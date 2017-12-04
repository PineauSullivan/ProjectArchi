package M2;

public class Glue {
	String nom;
	
	private RoleConnecteurFournis roleFourni;
	private RoleConnecteurRequis roleRequi;
	
	public Glue(String n, RoleConnecteurFournis roleFourni, RoleConnecteurRequis roleRequi) {
		super();
		this.nom = n;
		this.roleFourni = roleFourni;
		this.roleRequi = roleRequi;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public RoleConnecteurFournis getRoleFourni() {
		return roleFourni;
	}

	public void setRoleFourni(RoleConnecteurFournis roleFourni) {
		this.roleFourni = roleFourni;
	}

	public RoleConnecteurRequis getRoleRequi() {
		return roleRequi;
	}

	public void setRoleRequi(RoleConnecteurRequis roleRequi) {
		this.roleRequi = roleRequi;
	}
			
}
