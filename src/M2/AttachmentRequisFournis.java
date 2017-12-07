package M2;

public class AttachmentRequisFournis extends Attachment {
	public Type _type = Type.FOURNIS;

	public AttachmentRequisFournis(PortComposantRequis port, RoleConnecteurFournis role) {
		super(port, role);
	}
}
