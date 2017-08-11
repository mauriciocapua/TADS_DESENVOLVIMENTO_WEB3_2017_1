package fault;

import javax.xml.ws.WebFault;

@WebFault
public class EventNotFoundException extends Exception {
	private static final long serialVersionUID = 8022702696976615772L;

	public EventNotFoundException() {
		super("Event not found");
	}

}
