package exceptions;

import javax.xml.ws.WebFault;

@WebFault
public class UserAuthenticationException extends Exception {
	private static final long serialVersionUID = 8034562796976615774L;

	public UserAuthenticationException() {
		super("User authentication error");
	}

}