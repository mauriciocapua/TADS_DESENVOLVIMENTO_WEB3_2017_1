package WebServices;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
//import javax.naming.InitialContext;
//import javax.naming.NamingException;

import com.sun.appserv.jdbc.DataSource;
import com.sun.el.parser.Token;
import dao.EventoDAO;
import dao.LugarDAO;
import negocios.CartaoCredito;
import classes.Evento;
import classes.Lugar;

@WebService
public class VendaIngressosWebService {

	Evento envento;
	LocalDateTime dataInicioVenda;
	LocalDateTime dataFimVenda;
	CartaoCredito cartaoCredito;
	String CPF;
	String StatusPedido;

	public VendaIngressosWebService() {

	}

	@Resource(mappedName = "jdbc/web3")
	private DataSource dataSource;

	@WebMethod
	@WebResult(name = "NovoEvento")
	public void incluiEvento(Evento evento, LocalDateTime inicioVendas, LocalDateTime fimVendas) throws Exception {
		this.envento = evento;
		this.dataInicioVenda = inicioVendas;
		this.dataFimVenda = fimVendas;
		EventoDAO evdao = new EventoDAO();
	//	EventoDAO evdao = new EventoDAO((DataSource) new InitialContext().lookup("jdbc/web3"));
		evdao.criaEvento(evento, inicioVendas, fimVendas);
	}

	@WebMethod
	@WebResult(name = "NovoPreco")
	void atribuiPrecoLugar(Integer eventoId, Integer lugarInicial, Integer lugarFinal, Double preco) {
		Evento event = new Evento();
		EventoDAO evdao = new EventoDAO();
	//	try {
	//		evdao = new EventoDAO((DataSource) new InitialContext().lookup("jdbc/web3"));
	//	} catch (NamingException e) {
			// TODO Auto-generated catch block
	//		e.printStackTrace();
	//	}
		event = evdao.listarUmEvento(eventoId);
		for (int i = 0; i < event.getListaLugares().size(); i++) {
			if (event.getListaLugares().get(i).getNumero() >= lugarInicial
					|| event.getListaLugares().get(i).getNumero() <= lugarFinal) {
				event.getListaLugares().get(i).setValor(preco);
			}
		}

	}

	@WebMethod
	@WebResult(name = "Eventos")
	public List<Evento> listaEventos(String nomeEvento, LocalDate data, String local) {
		List<Evento> vetEventos = new ArrayList<>();
		EventoDAO evdao = new EventoDAO();
	//	try {
	//		evdao = new EventoDAO((DataSource) new InitialContext().lookup("jdbc/web3"));
	//	} catch (NamingException e) {
			// TODO Auto-generated catch block
	//		e.printStackTrace();
	//	}
		Evento event = new Evento();
		event.setNome(nomeEvento);
		event.setData(data);
		event.setLocal(local);
		evdao.montaSqlListaEventos(event);
		return vetEventos;
	}

	@WebMethod
	@WebResult(name = "Lugares")
	public List<Lugar> listaLugares(Integer eventoId) {
		List<Lugar> vetlugares = new ArrayList<>();
		LugarDAO lugDAO = new LugarDAO();
	//	try {
	//		lugDAO = new LugarDAO((DataSource) new InitialContext().lookup("jdbc/web3"));
	//	} catch (NamingException e) {
			// TODO Auto-generated catch block
	//		e.printStackTrace();
	//	}
		vetlugares = lugDAO.listaTodos("SELECT * from lugares WHERE id_event =" + eventoId + ";");
		return vetlugares;
	}

	@WebMethod
	@WebResult(name = "CompraLugar")
	public Token pedidoCompraLugar(Integer eventoId, Integer lugar, String cpf, CartaoCredito cartao) {
		Token tok = new Token();
		Evento event = new Evento();
		EventoDAO evdao = new EventoDAO();
	//	try {
	//		evdao = new EventoDAO((DataSource) new InitialContext().lookup("jdbc/web3"));
	//	} catch (NamingException e) {
	//		// TODO Auto-generated catch block
	//		e.printStackTrace();
	//	}
		Lugar lug = new Lugar();
		LugarDAO lugdao = new LugarDAO();
	//	try {
	//		lugdao = new LugarDAO((DataSource) new InitialContext().lookup("jdbc/web3"));
	//	} catch (NamingException e) {
			// TODO Auto-generated catch block
	//		e.printStackTrace();
	//	}
		// seleciona o evento pelo eventId
		event = evdao.listarUmEvento(eventoId);
		// usar o serviço de validação do CartãoCredito

		if (true) {
			// trocar (upDate Lugar com id = eventId) status do lugar para
			// comprado caso CartaoCredito liberado
			lugdao.atualizaLugar(lug, eventoId);
		}
		return tok;

	}

}
