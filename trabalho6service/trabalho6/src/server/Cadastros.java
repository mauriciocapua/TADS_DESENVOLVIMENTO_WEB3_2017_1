package server;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import dao.EventoDAO;
import dao.LugarDAO;
import fault.DatabaseErrorException;
import fault.DateErrorException;
import fault.PersonNotFoundException;
import fault.UserAuthenticationException;
import model.Evento;

@WebService
public class Cadastros {

	@Resource(mappedName = "jdbc/trabalho6")
	private DataSource dataSource;
	private EventoDAO eventoDAO;
	private LugarDAO lugarDAO;

	public Cadastros() throws NamingException {
		eventoDAO = new EventoDAO((DataSource) new InitialContext().lookup("jdbc/trabalho6"));
		lugarDAO = new LugarDAO((DataSource) new InitialContext().lookup("jdbc/trabalho6"));
	}

	@WebMethod
	@WebResult(name = "incluiEvento")
	public void incluiEvento(@WebParam(name = "nome") String nome, @WebParam(name = "data") String data,
			@WebParam(name = "local") String local, @WebParam(name = "lugares") int lugares,
			@WebParam(name = "inicioVendas") String inicioVendas, @WebParam(name = "fimVendas") String fimVendas)
			throws PersonNotFoundException, DatabaseErrorException, UserAuthenticationException, DateErrorException {

		Evento evento = new Evento();
		evento.setNome(nome);
		if (data != null && !data.isEmpty())
			try {
				evento.setData(LocalDate.parse(data));
			} catch (Exception e) {
				throw new DateErrorException();
			}
		if (inicioVendas != null && !inicioVendas.isEmpty())
			evento.setHoraInicio(LocalDateTime.parse(inicioVendas));

		else
			evento.setHoraInicio(null);
		if (fimVendas != null && !fimVendas.isEmpty())
			evento.setHoraFim(LocalDateTime.parse(fimVendas));

		else
			evento.setHoraFim(null);
		evento.setLocal(local);
		evento.setLugares(null);

		evento = eventoDAO.incluiEvento(evento);
		System.out.println(evento.toString());

		lugarDAO.incluiLugares(evento.getId(), lugares, null);

	}

	@WebMethod
	@WebResult(name = "atribuiPrecoLugar")
	public void atribuiPrecoLugar(@WebParam(name = "eventoId") Integer eventoId,
			@WebParam(name = "lugarInicial") Integer lugarInicial, @WebParam(name = "lugarFinal") Integer lugarFinal,
			@WebParam(name = "preco") Double preco) throws DatabaseErrorException {
		Evento evento = new Evento();
		evento.setId(eventoId);

		lugarDAO.updatePrecoLugares(evento, lugarInicial, lugarFinal, preco);
	}
}
