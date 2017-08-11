package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import com.sun.appserv.jdbc.DataSource;
import classes.Evento;
import classes.Lugar;
import conexao.ConnectionFactory;

public class EventoDAO {
	
	//DataSource datasource = null;
	//Connection conexao = null;
	//Statement statement = null;
	//PreparedStatement prestatement = null;
	//ResultSet resultset = null;
	
	//public EventoDAO(DataSource datasource){
	//	this.datasource = datasource;
	//}
	

	public boolean criaEvento(Evento evento, LocalDateTime inicioVendas, LocalDateTime fimVendas) throws Exception {
		boolean resultado = false;
		LugarDAO lugdao = new LugarDAO();
		//LugarDAO lugdao = new LugarDAO((DataSource) new InitialContext().lookup("jdbc/web3"));
		//datasource = (DataSource) new InitialContext().lookup("jdbc/web3");
		//conexao = datasource.getConnection();
		Connection conexao = new ConnectionFactory().getConnection();
		String sql = "INSERT into eventos(id,nome,data,local) VALUES(?,?,?,?);";
		PreparedStatement sqlInsert = conexao.prepareStatement(sql);
		sqlInsert.setInt(1, evento.getId());
		sqlInsert.setString(2, evento.getNome());
		sqlInsert.setDate(3, java.sql.Date.valueOf(evento.getData()));
		sqlInsert.setString(4, evento.getLocal());
		if (sqlInsert.executeUpdate() == 1) {
			String sql2 = "INSERT into event_time(id_event,iniciovendas,fimvendas) VALUES (?,?,?);";
			PreparedStatement sqlInsert2 = conexao.prepareStatement(sql2);
			sqlInsert2.setInt(1, evento.getId());
			sqlInsert2.setTimestamp(2, java.sql.Timestamp.valueOf(inicioVendas));
			sqlInsert2.setTimestamp(3, java.sql.Timestamp.valueOf(fimVendas));
			sqlInsert2.execute();
			resultado = true;
		}
		for (int i = 0; i < evento.getListaLugares().size(); i++) {
			lugdao.inserirLugar(evento.getId(),evento.getListaLugares().get(i).getNumero() , evento.getListaLugares().get(i).getValor(), evento.getListaLugares().get(i).getStatus(), evento.getListaLugares().get(i).getLocal());
		}
		conexao.close();
		return resultado;
	}
	
	
	public List<Evento> montaSqlListaEventos(Evento event){
		String sql;
		List<Evento> vetEventos = new ArrayList<>();
		if (event.getNome().equals(null) && event.getLocal().equals(null) && event.getData().equals(null)) {
			System.out.println("Select *");
			sql = "SELECT * from eventos;";
			vetEventos = listaTodos(sql);
			return vetEventos;
		} else if (event.getNome() != null && event.getLocal().equals(null) && event.getData().equals(null)) {
			System.out.println("Select nome");
			sql = "SELCT * form eventos WHERE nome =" + event.getNome() + ";";
			vetEventos = listaTodos(sql);
			return vetEventos;
		} else if (event.getData() != null && event.getNome().equals(null) && event.getLocal().equals(null)) {
			System.out.println("SELECT data");
			sql = "SELECT * from eventos WHERE data =" + event.getData() + ";";
			vetEventos = listaTodos(sql);
			return vetEventos;
		} else if (event.getLocal() != null && event.getNome().equals(null) && event.getData().equals(null)) {
			System.out.println("SELECT local");
			sql = "SELECT * FROM eventos WHERE local =" + event.getLocal() + ";";
			vetEventos = listaTodos(sql);
			return vetEventos;
		} else if (event.getNome() != null && event.getData() != null && event.getLocal().equals(null)) {
			System.out.println("SELECT NOME, DATA");
			sql = "SELECT * FROM eventos WHERE nome=" + event.getNome() + " AND data=" + event.getData() + ";";
			vetEventos = listaTodos(sql);
			return vetEventos;
		} else if (event.getNome() != null && event.getLocal() != null && event.getData().equals(null)) {
			System.out.println("SELECT NOME, Local");
			sql = "SELECT * FROM eventos WHERE nome=" + event.getNome() + " AND local=" + event.getLocal() + ";";
			vetEventos = listaTodos(sql);
			return vetEventos;
		} else if (event.getLocal() != null && event.getData() != null && event.getNome().equals(null)) {
			System.out.println("SELECT data, Local");
			sql = "SELECT * FROM eventos WHERE local=" + event.getLocal() + " AND data=" + event.getData() + ";";
			vetEventos = listaTodos(sql);
			return vetEventos;
		}
		return vetEventos;
	}

	public List<Evento> listaTodos(String sql){
		List<Evento> vetEventos = new ArrayList<>();
		List<Lugar> vetLugares = new ArrayList<>();
		Connection conexao = new ConnectionFactory().getConnection();
		//try {
			//datasource = (DataSource) new InitialContext().lookup("jdbc/web3");
			//conexao = datasource.getConnection();
		//} catch (NamingException | SQLException e1) {
			// TODO Auto-generated catch block
	//		e1.printStackTrace();
		//}
		

		PreparedStatement sqlSelect, sqlSelect1;
		try {
			sqlSelect = conexao.prepareStatement(sql);
			ResultSet rs = sqlSelect.executeQuery();

			Evento event;
			Lugar lug;

			while (rs.next()) {
				event = new Evento();
				lug = new Lugar();
				
				String sql1 = "SELECT * from lugares WHERE id_event =" + event.getId() + ";";
				sqlSelect1 = conexao.prepareStatement(sql1);
				ResultSet rs1 = sqlSelect1.executeQuery();
				event.setId(rs.getInt("id"));
				event.setNome(rs.getString("nome"));
				event.setData(rs.getDate("data").toLocalDate());
				event.setLocal(rs.getString("local"));
				while (rs1.next()) {
					lug.setNumero(rs1.getInt("numero"));
					lug.setValor(rs1.getDouble("valor"));
					lug.setStatus(rs1.getString("status"));
					lug.setLocal(rs1.getString("local"));
					vetLugares.add(lug);
				}				
				event.setListaLugares(vetLugares);
				vetEventos.add(event);
			}
			sqlSelect.close();
			conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		return vetEventos;
	}
	
	public Evento listarUmEvento(Integer eventoId){
		Connection conexao = new ConnectionFactory().getConnection();
		//try {
			//datasource = (DataSource) new InitialContext().lookup("jdbc/web3");
			//conexao = datasource.getConnection();
		//} catch (NamingException | SQLException e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
		//}
		
		Evento event = new Evento();
		Lugar lug;
		List<Lugar> vetLugar = new ArrayList<>();
		event.setId(eventoId);
		String sql = "SELECT * from eventos WHERE id ="+ event.getId()+";";
		PreparedStatement sqlSelect, sqlSelect1;

		try {
			sqlSelect = conexao.prepareStatement(sql);
			ResultSet rs = sqlSelect.executeQuery();
			
			while (rs.next()) {
			
				lug = new Lugar();
				String sql1 = "SELECT * from lugares WHERE id_event =" + event.getId() + ";";
				sqlSelect1 = conexao.prepareStatement(sql1);
				ResultSet rs1 = sqlSelect1.executeQuery();
				event.setId(rs.getInt("id"));
				event.setData(rs.getDate("data").toLocalDate());
				event.setLocal(rs.getString("local"));
				while (rs1.next()) {
					lug.setNumero(rs1.getInt("numero"));
					lug.setValor(rs1.getDouble("valor"));
					lug.setStatus(rs1.getString("status"));
					lug.setLocal(rs1.getString("local"));
					vetLugar.add(lug);
				}
				event.setListaLugares(vetLugar);
				
			}
			
			sqlSelect.close();
			conexao.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		return event;
			
	}
	
	
}
