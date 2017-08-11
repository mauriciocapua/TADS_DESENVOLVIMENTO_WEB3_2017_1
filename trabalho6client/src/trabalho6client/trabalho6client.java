package trabalho6client;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.List;

import org.example.trabalho6.Lugar;

import server.DatabaseErrorException_Exception;
import server.DateErrorException_Exception;
import server.EventNotFoundException_Exception;
import server.LugarNotFoundException_Exception;
import server.Vendas;
import server.VendasService;

public class trabalho6client {

	public static void main(String[] args) throws DatabaseErrorException_Exception, DateErrorException_Exception,
			EventNotFoundException_Exception, LugarNotFoundException_Exception {
		Authenticator.setDefault(new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return (new PasswordAuthentication("user", "12345".toCharArray()));
			}
		});

		VendasService service = new VendasService();
		Vendas port = service.getVendasPort();

		List<Lugar> lugares = port.listaLugares("1");
		for (int i = 0; i < lugares.size(); i++) {
			System.out.println(lugares.get(i).toString());
		}
		System.out.println(port.listaLugares("1").toString());
		// System.out.println(port.listaEventos("evento1", null, null));
	}

}
