package evento;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

@WebService
public class AuthenticationWS {

	@Resource
	WebServiceContext webServiceContext;

	@WebMethod
	public boolean authenticate() {

		MessageContext messageContext = webServiceContext.getMessageContext();

		Map httpHeaders = (Map) messageContext.get(MessageContext.HTTP_REQUEST_HEADERS);
		List loginList = (List) httpHeaders.get("Username");
		List passwordList = (List) httpHeaders.get("Password");

		String login = "";
		if (loginList != null) {
			login = loginList.get(0).toString();
		}

		String password = "";
		if (passwordList != null) {
			password = passwordList.get(0).toString();
		}

		return(("admin".equals(login)) && ("12345".equals(password)));
	}

}