package M2;

/**
 * @author Sébastien Vallée & Sullivan Pineau
 *
 */
public class BindingFournis extends Binding {
	public Type _type = Type.FOURNIS;
	
	public BindingFournis(PortComposantFournis port1, PortComposantFournis port2) {
		super(port1, port2);
	}
		
}
