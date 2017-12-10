package M2;

/**
 * @author Sébastien Vallée & Sullivan Pineau
 *
 */
public class BindingRequis extends Binding {
	public Type _type = Type.REQUIS;

	public BindingRequis(PortComposantRequis port1, PortComposantRequis port2) {
		super(port1, port2);
	}
	
}
