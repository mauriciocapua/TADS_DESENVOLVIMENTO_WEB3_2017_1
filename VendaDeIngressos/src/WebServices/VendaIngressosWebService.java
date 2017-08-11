package WebServices;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.sun.el.parser.Token;

import dao.EventoDAO;
import dao.LugarDAO;
import negocios.CartaoCredito;
import negocios.Evento;
import negocios.Lugar;

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

	public VendaIngressosWebService(Evento envento, LocalDateTime dataInicioVenda, LocalDateTime dataFimVenda,
			CartaoCredito cartaoCredito, String cPF, String statusPedido) {
		this.envento = envento;
		this.dataInicioVenda = dataInicioVenda;
		this.dataFimVenda = dataFimVenda;
		this.cartaoCredito = cartaoCredito;
		this.CPF = cPF;
		this.StatusPedido = statusPedido;
	}

	public void incluiEvento(Evento evento, LocalDateTime inicioVendas, LocalDateTime fimVendas) throws Exception {
		this.envento = evento;
		this.dataInicioVenda = inicioVendas;
		this.dataFimVenda = fimVendas;
		EventoDAO evdao = new EventoDAO();
		evdao.criaEvento(evento, inicioVendas, fimVendas);
	}

	void atribuiPrecoLugar(Integer eventoId, Integer lugarInicial, Integer lugarFinal, Double preco) {
		Evento event = new Evento();
		EventoDAO evdao = new EventoDAO();
		event = evdao.listarUmEvento(eventoId);
		for (int i = 0; i < event.getListaLugares().size(); i++) {
			if (event.getListaLugares().get(i).getNumero() >= lugarInicial
					|| event.getListaLugares().get(i).getNumero() <= lugarFinal) {
				event.getListaLugares().get(i).setValor(preco);
			}
		}

	}

	public List<Evento> listaEventos(String nomeEvento, LocalDate data, String local) {
		List<Evento> vetEventos = new ArrayList<>();
		String sql;
		EventoDAO evdao = new EventoDAO();
		if (nomeEvento.equals(null) && local.equals(null) && data.equals(null)) {
			System.out.println("Select *");
			sql = "SELECT * from eventos;";
			vetEventos = evdao.listaTodos(sql);
		} else if (nomeEvento != null && local.equals(null) && data.equals(null)) {
			System.out.println("Select nome");
			sql = "SELCT * form eventos WHERE nome =" + nomeEvento + ";";
			vetEventos = evdao.listaTodos(sql);
		} else if (data != null && nomeEvento.equals(null) && local.equals(null)) {
			System.out.println("SELECT data");
			sql = "SELECT * from eventos WHERE data =" + data + ";";
			vetEventos = evdao.listaTodos(sql);
		} else if (local != null && nomeEvento.equals(null) && data.equals(null)) {
			System.out.println("SELECT local");
			sql = "SELECT * FROM eventos WHERE local =" + local + ";";
			vetEventos = evdao.listaTodos(sql);
		} else if (nomeEvento != null && data != null && local.equals(null)) {
			System.out.println("SELECT NOME, DATA");
			sql = "SELECT * FROM eventos WHERE nome=" + nomeEvento + " AND data=" + data + ";";
			vetEventos = evdao.listaTodos(sql);
		} else if (nomeEvento != null && local != null && data.equals(null)) {
			System.out.println("SELECT NOME, Local");
			sql = "SELECT * FROM eventos WHERE nome=" + nomeEvento + " AND local=" + local + ";";
			vetEventos = evdao.listaTodos(sql);
		} else if (local != null && data != null && nomeEvento.equals(null)) {
			System.out.println("SELECT data, Local");
			sql = "SELECT * FROM eventos WHERE local=" + local + " AND data=" + data + ";";
			vetEventos = evdao.listaTodos(sql);
		}
		return vetEventos;
	}
	
	public List<Lugar> listaLugares(Integer eventoId){
		List<Lugar> vetlugares = new ArrayList<>();
		LugarDAO lugDAO = new LugarDAO();
		vetlugares = lugDAO.listaTodos("SELECT * from lugares WHERE id_event =" + eventoId + ";");
		return vetlugares;
	}
	
	public Token pedidoCompraLugar(Integer eventoId, Integer lugar, String cpf, CartaoCredito cartao){
		Token tok = new Token();
		Evento event = new Evento();
		EventoDAO evdao = new EventoDAO();
		Lugar lug = new Lugar();
		LugarDAO lugdao = new LugarDAO();
		//seleciona o evento pelo eventId
		event = evdao.listarUmEvento(eventoId);
		//usar o serviço de validação do CartãoCredito
		
		if(true){
		//trocar (upDate Lugar com id = eventId) status do lugar para comprado caso CartaoCredito liberado
		lugdao.atualizaLugar(lug, eventoId);
		}
		return tok;
	
	}

}
