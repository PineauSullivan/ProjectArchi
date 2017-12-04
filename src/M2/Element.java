package M2;

import java.util.ArrayList;
import java.util.List;

public abstract class Element {
	
	String nom;
	
	List<Contrainte> contraintes;

	public Element(String n) {
		super();
		nom = n;
		contraintes = new ArrayList<Contrainte>();
	}

	public List<Contrainte> getContraintes() {
		return contraintes;
	}

	public void setContraintes(List<Contrainte> contraintes) {
		this.contraintes = contraintes;
	}
	
	
	
}
