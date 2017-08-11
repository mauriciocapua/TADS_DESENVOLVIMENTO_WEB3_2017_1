package server;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.sun.el.parser.Token;

import dao.EventoDAO;
import dao.LugarDAO;
import fault.DatabaseErrorException;
import fault.DateErrorException;
import fault.EventNotFoundException;
import fault.LugarNotFoundException;
import model.CartaoCredito;
import model.Evento;
import model.Lugar;

@WebService
public class Vendas {
	@Resource(mappedName = "jdbc/trabalho6")
	private DataSource dataSource;
	private EventoDAO eventoDAO;
	private LugarDAO lugarDAO;

	public Vendas() throws NamingException {
		eventoDAO = new EventoDAO((DataSource) new InitialContext().lookup("jdbc/trabalho6"));
		lugarDAO = new LugarDAO((DataSource) new InitialContext().lookup("jdbc/trabalho6"));
	}

	@WebMethod
	@WebResult(name = "listaEventos")
	public List<Evento> listaEventos(@WebParam(name = "nome") String nome, @WebParam(name = "local") String local,
			@WebParam(name = "data") String data)
			throws DatabaseErrorException, DateErrorException, EventNotFoundException {
		Evento evento = new Evento();
		if (data != null && !data.isEmpty())
			try {
				evento.setData(LocalDate.parse("" + data));
			} catch (Exception e) {
				throw new DateErrorException();
			}

		evento.setNome(nome);
		evento.setLocal(local);
		List<Evento> eventos = eventoDAO.getEventos(evento);
		if (eventos.size() > 0) {
			return eventos;
		} else
			throw new EventNotFoundException();

	}

	@WebMethod
	@WebResult(name = "listaLugares")
	public List<Lugar> listaLugares(@WebParam(name = "eventoId") String eventoId)
			throws DatabaseErrorException, EventNotFoundException, LugarNotFoundException, NumberFormatException {
		Evento evento = new Evento();
		evento.setId(Integer.parseInt(eventoId));
		evento = eventoDAO.getEventoID(evento);
		if (evento == null) {
			throw new EventNotFoundException();
		} else {
			List<Lugar> lugares = lugarDAO.getLugares(evento);
			if (lugares.size() > 0) {
				return lugares;
			} else
				throw new LugarNotFoundException();
		}
	}

	public Token pedidoCompraLugar(@WebParam(name = "eventoId") Integer eventoId,
			@WebParam(name = "lugarId") Integer lugarId, @WebParam(name = "cpf") String cpf,
			@WebParam(name = "cpf") CartaoCredito cartao) throws DatabaseErrorException, EventNotFoundException {

		Token token = new Token();
		ValidarCPF validarCPF = new ValidarCPF();
		Cartao validarCartao = new Cartao();
		Lugar lugar = new Lugar();
		lugar.setId(lugarId);

		if (validarCPF.validar()) {
			Evento evento = new Evento();
			evento.setId(eventoId);
			try {
				if (validarCartao.validarCartao(cartao)
						&& (validarCartao.getCardID(cartao) == 0 || validarCartao.getCardID(cartao) == 1)
						&& (cartao.getDataVencimento().isBefore(LocalDate.now()))) {
					lugarDAO.updateStatusLugares(evento, lugar);

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return token;

	}

}
