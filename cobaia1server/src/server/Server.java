package server;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public class Server {

	@WebMethod(operationName="pingpong")
	@WebResult(name="pong")
	public String ping1(@WebParam(name="text") String s) {
		return("pong "+s);
	}

	@WebMethod
	@WebResult(name="pong")
	public List<String> ping3(@WebParam(name="text") String s) {
		List<String> l = new ArrayList<String>();
		l.add("pong 1 "+s);
		l.add("pong 2 "+s);
		l.add("pong 3 "+s);
		return(l);
	}

}