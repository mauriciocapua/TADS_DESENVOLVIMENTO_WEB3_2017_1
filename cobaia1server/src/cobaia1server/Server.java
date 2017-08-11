package cobaia1server;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Server {

	@WebMethod
	public String ping1(String s) {
		return ("pong " + s);
	}

}
