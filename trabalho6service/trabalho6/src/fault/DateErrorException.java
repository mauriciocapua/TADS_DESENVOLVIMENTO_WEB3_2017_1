package fault;

import javax.xml.ws.WebFault;

@WebFault
public class DateErrorException extends Exception {
	private static final long serialVersionUID = 8022279333976615773L;

	public DateErrorException() {
		super("Date Error");
	}

}
