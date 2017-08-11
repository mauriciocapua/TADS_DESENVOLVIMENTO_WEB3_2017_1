//package evento;
//
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import javax.xml.ws.BindingProvider;
//import javax.xml.ws.handler.MessageContext;
//
//public class Client {
//
//	public static void main(String[] args) {
//		AuthenticationWSService service = new AuthenticationWSService();
//		AuthenticationWS port = service.getAuthenticationWSPort();
//
//		Map<String, Object> requestContext = ((BindingProvider) port).getRequestContext();
//
//		Map<String, List<String>> httpHeaders = new HashMap<String, List<String>>();
//		httpHeaders.put("Username", Collections.singletonList("admin"));
//		httpHeaders.put("Password", Collections.singletonList("12345"));
//		requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, httpHeaders);
//
//		System.out.println(port.authenticate());
//	}
//
//}