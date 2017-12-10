package M2;

/**
 * @author Sébastien Vallée & Sullivan Pineau
 *
 */
public abstract class RoleConnecteur {
	
	String nom;

	public RoleConnecteur(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
