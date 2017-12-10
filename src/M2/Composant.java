package M2;

/**
 * @author Sébastien Vallée & Sullivan Pineau
 *
 */
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import Donnees.Message;

public class Composant extends Element {

	List<Propriete> proprietes;
	
	Hashtable<String, InterfaceComposant> interfaces;

	Configuration configuration;
	
	public Composant(String n) {
		super(n);
		proprietes = new ArrayList<Propriete>();
		
		interfaces = new Hashtable<String, InterfaceComposant>();
		
		this.configuration=null;
	}

	public void setConfiguration(Configuration configuration){
		this.configuration = configuration;
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
	
	public void envoie(Message message, String name){
		if(this.configuration!=null)
			this.configuration.envoie(message, name);
	}

	public void recois(Message message, String name){
		if(this.configuration!=null)
			this.configuration.recois(message, name);
	}
	
	public PortComposantRequis getPortRequis(String name){
		for(InterfaceComposant ic : interfaces.values()){
			if(ic.getPort(name)!=null){
				return (PortComposantRequis) ic.getPort(name);
			}
		}
		System.out.println("Port requis inconnu : "+name);
		return null;
	}
	
	public PortComposantFournis getPortFournis(String name){
		for(InterfaceComposant ic : interfaces.values()){
			if(ic.getPort(name)!=null){
				return (PortComposantFournis) ic.getPort(name);
			}
		}
		System.out.println("Port fournis inconnu : "+name);
		return null;
	}
}
