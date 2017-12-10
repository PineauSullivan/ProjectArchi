package M2;

/**
 * @author Sébastien Vallée & Sullivan Pineau
 *
 */
public class AttachmentFournisRequis extends Attachment {
	public Type _type = Type.REQUIS;

	public AttachmentFournisRequis(PortComposantFournis port, RoleConnecteurRequis role) {
		super(port, role);
	}
	
	
}
