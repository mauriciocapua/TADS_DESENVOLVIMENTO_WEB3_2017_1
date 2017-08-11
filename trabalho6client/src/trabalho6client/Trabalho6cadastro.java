package trabalho6client;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

import server.Cadastros;
import server.CadastrosService;
import server.DatabaseErrorException_Exception;
import server.DateErrorException_Exception;
import server.EventNotFoundException_Exception;
import server.LugarNotFoundException_Exception;
import server.PersonNotFoundException_Exception;
import server.UserAuthenticationException_Exception;

public class Trabalho6cadastro {

	public static void main(String[] args)
			throws DatabaseErrorException_Exception, DateErrorException_Exception, EventNotFoundException_Exception,
			LugarNotFoundException_Exception, PersonNotFoundException_Exception, UserAuthenticationException_Exception {
		Authenticator.setDefault(new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return (new PasswordAuthentication("user", "12345".toCharArray()));
			}
		});

		CadastrosService service = new CadastrosService();
		Cadastros port = service.getCadastrosPort();

		// port.atribuiPrecoLugar(1, 1, 3, 100.0);
		// port.incluiEvento("evento3", "2017-05-29", "zona leste", 300,
		// "2017-05-29T00:00:00", "2017-10-01T00:00:00");

	}
}