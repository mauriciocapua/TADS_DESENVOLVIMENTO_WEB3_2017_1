package servers;

import java.time.LocalDate;
import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import dao.*;
import negocio.*;

@WebService
public class Vendas {

	@Resource(mappedName = "jdbc/trabalho6")
	private DataSource dataSource;
	private EventoDAO eventoDAO;

	public Vendas() throws NamingException {
		eventoDAO = new EventoDAO((DataSource) new InitialContext().lookup("jdbc/trabalho6"));
	}

	@WebMethod
	@WebResult(name = "evento")
	public List<Evento> gettrabalho6(@WebParam(name = "nome") String nome, @WebParam(name = "local") String local,
			@WebParam(name = "data") String data) throws DatabaseErrorException {
		Evento evento = new Evento();
		if (data != null && !data.isEmpty())
			evento.setData(LocalDate.parse("" + data));
		evento.setNome(nome);
		evento.setLocal(local);
		List<Evento> eventos = eventoDAO.getEventos(evento);
		// for (int i = 0; i < eventos.size(); i++) {
		// System.out.println(eventos.get(i).getNome());
		// }
		return (eventoDAO.getEventos(evento));
	}

}