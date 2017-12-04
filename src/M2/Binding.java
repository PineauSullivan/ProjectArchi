package M2;

public abstract class Binding extends Lien {
	
	PortComposant port1;
	PortComposant port2;
	
	public Binding(PortComposant port1, PortComposant port2) {
		super();
		this.port1 = port1;
		this.port2 = port2;
	}

	public PortComposant getPort1() {
		return port1;
	}

	public void setPort1(PortComposant port1) {
		this.port1 = port1;
	}

	public PortComposant getPort2() {
		return port2;
	}

	public void setPort2(PortComposant port2) {
		this.port2 = port2;
	}
	
	
}
