package M2;

/**
 * @author Sébastien Vallée & Sullivan Pineau
 *
 */
public class AttachmentRequisFournis extends Attachment {
	public Type _type = Type.FOURNIS;

	public AttachmentRequisFournis(PortComposantRequis port, RoleConnecteurFournis role) {
		super(port, role);
	}
}
