package fault;

import javax.xml.ws.WebFault;

@WebFault
public class DatabaseErrorException extends Exception {
	private static final long serialVersionUID = 8022279333976615773L;

	public DatabaseErrorException() {
		super("Database Error");
	}

}