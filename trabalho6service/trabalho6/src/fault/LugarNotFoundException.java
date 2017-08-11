package fault;

import javax.xml.ws.WebFault;

@WebFault
public class LugarNotFoundException extends Exception {
	private static final long serialVersionUID = 8022702696976615772L;

	public LugarNotFoundException() {
		super("Lugar not found");
	}

}