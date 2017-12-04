package M2;

public abstract class Attachment extends Lien {
	
	PortComposant port;
	RoleConnecteur role;
	
	public Attachment(PortComposant port, RoleConnecteur role) {
		super();
		this.port = port;
		this.role = role;
	}

	public PortComposant getPort() {
		return port;
	}

	public void setPort(PortComposant port) {
		this.port = port;
	}

	public RoleConnecteur getRole() {
		return role;
	}

	public void setRole(RoleConnecteur role) {
		this.role = role;
	}	
}
