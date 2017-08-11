package evento;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import exceptions.DatabaseErrorException;
import exceptions.PersonNotFoundException;
import exceptions.UserAuthenticationException;
import modelos.Evento;
import modelos.EventoDAO;
import modelos.Lugar;
import modelos.LugarDAO;
import modelos.Person;
import modelos.PersonDAO;
import modelos.User;

@WebService
public class VendaWS {

	@Resource(mappedName = "jdbc/eventos")
	private DataSource dataSource;

	private PersonDAO personDAO;
	private EventoDAO eventoDAO;
	private LugarDAO lugarDAO;

	public VendaWS() throws NamingException {
		personDAO = new PersonDAO((DataSource) new InitialContext().lookup("jdbc/eventos"));
		eventoDAO = new EventoDAO((DataSource) new InitialContext().lookup("jdbc/eventos"));
		lugarDAO = new LugarDAO((DataSource) new InitialContext().lookup("jdbc/eventos"));
	}
	
	@WebMethod
	@WebResult(name = "evento")
	public List<Evento> getEventos(@WebParam(name = "nome")String nome,
			@WebParam(name = "local") String local, 
			@WebParam(name = "data") String data) throws DatabaseErrorException {
		Evento evento = new Evento();
		if(data != null && !data.isEmpty()) 
			evento.setData(LocalDate.parse(""+data));
		evento.setNome(nome);
		evento.setLocal(local);
		return(eventoDAO.getEventos(evento));
	}
	
	@WebMethod
	@WebResult(name = "evento")
	public int novoEvento(@WebParam(name = "nome")String nome,
			@WebParam(name = "local") String local, 
			@WebParam(name = "data") String data,
			@WebParam(name = "inicioVendas") String inicioVendas,
			@WebParam(name = "fimVendas") String fimVendas,
			@WebParam(name = "lugares") int lugares
			) throws DatabaseErrorException {
		
			int id_evento = eventoDAO.incluiEvento(nome, data, local, fimVendas, fimVendas);
			lugarDAO.incluiLugares(id_evento, lugares, local);
			return 1;
			
	}	
	
	@WebMethod
	@WebResult(name = "lugar")
	public List<Lugar> getLugares(@WebParam(name = "idEvento")int id_evento) throws DatabaseErrorException {
		return(lugarDAO.getLugares(id_evento));
	}
	
	@WebMethod
	@WebResult(name = "lugar")
	public int atribuiPreco(@WebParam(name = "idEvento")int id_evento,
			@WebParam(name = "preco")double preco,
			@WebParam(name = "lugarInicial")int lugarInicial,
			@WebParam(name = "lugarFinal")int lugarFinal) throws DatabaseErrorException {
		return(lugarDAO.atribuiPreco(id_evento,preco,lugarInicial,lugarFinal));
	}

}