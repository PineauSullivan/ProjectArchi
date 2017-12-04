package M2;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Composant extends Element {

	List<Propriete> proprietes;
	
	Hashtable<String, InterfaceComposant> interfaces;

	public Composant(String n) {
		super(n);
		proprietes = new ArrayList<Propriete>();
		
		interfaces = new Hashtable<String, InterfaceComposant>();
	}

	public List<Propriete> getProprietes() {
		return proprietes;
	}

	public void setProprietes(List<Propriete> proprietes) {
		this.proprietes = proprietes;
	}

	public Hashtable<String, InterfaceComposant> getInterfaces() {
		return interfaces;
	}

	public void setInterfaces(Hashtable<String, InterfaceComposant> interfaces) {
		this.interfaces = interfaces;
	}
	
	public boolean add(Propriete propriete){
		proprietes.add(propriete);
		return true;
	}
	
	public boolean add(InterfaceComposant interf){
		if(!interfaces.containsKey(interf.getNom())){
			interfaces.put(interf.getNom(), interf);
			return true;
		}
		else return false;
	}
	
	public InterfaceComposant getInterface(String nom){
		if(interfaces.containsKey(nom)){
			return interfaces.get(nom);
		}
		else return null;
	}
	
	
}
