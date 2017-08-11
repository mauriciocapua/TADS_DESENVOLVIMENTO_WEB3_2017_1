package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import conexao.ConnectionFactory;
import negocios.Evento;
import negocios.Lugar;

public class EventoDAO {

	public boolean criaEvento(Evento evento, LocalDateTime inicioVendas, LocalDateTime fimVendas) throws Exception {
		boolean resultado = false;
		Connection conexao = new ConnectionFactory().getConnection();
		String sql = "INSERT into eventos(id,nome,data,local) VALUES(?,?,?,?);";
		PreparedStatement sqlInsert = conexao.prepareStatement(sql);
		sqlInsert.setInt(1, evento.getID());
		sqlInsert.setString(2, evento.getNome());
		sqlInsert.setDate(3, java.sql.Date.valueOf(evento.getData()));
		sqlInsert.setString(4, evento.getLocal());
		for (int i = 0; i < evento.getListaLugares().size(); i++) {
			String sql1 = "INSERT into lugares(id_event,numero,valor,status,local) VALUES(?,?,?,?,?);";
			PreparedStatement sqlInsert1 = conexao.prepareStatement(sql1);
			sqlInsert1.setInt(1, evento.getID());
			sqlInsert1.setInt(2, evento.getListaLugares().get(i).getNumero());
			sqlInsert1.setDouble(3, evento.getListaLugares().get(i).getValor());
			sqlInsert1.setString(4, evento.getListaLugares().get(i).getStatus());
			sqlInsert1.setString(5, evento.getListaLugares().get(i).getLocal());
			sqlInsert1.execute();

		}
		if (sqlInsert.executeUpdate() == 1) {

			String sql2 = "INSERT into event_time(id_event,iniciovendas,fimvendas) VALUES (?,?,?);";
			PreparedStatement sqlInsert2 = conexao.prepareStatement(sql2);
			sqlInsert2.setInt(1, evento.getID());
			sqlInsert2.setObject(2, inicioVendas);
			sqlInsert2.setObject(3, fimVendas);
			sqlInsert2.execute();

			resultado = true;

		}
		conexao.close();
		return resultado;
	}

	public List<Evento> listaTodos(String sql) {
		List<Evento> vetEventos = new ArrayList<>();
		List<Lugar> vetLugares = new ArrayList<>();
		Connection conexao = new ConnectionFactory().getConnection();
		

		PreparedStatement sqlSelect, sqlSelect1;
		try {
			sqlSelect = conexao.prepareStatement(sql);
			ResultSet rs = sqlSelect.executeQuery();

			Evento event;
			Lugar lug;

			while (rs.next()) {
				event = new Evento();
				lug = new Lugar();
				String sql1 = "SELECT * from lugares WHERE id_event =" + event.getID() + ";";
				sqlSelect1 = conexao.prepareStatement(sql1);
				ResultSet rs1 = sqlSelect1.executeQuery();
				event.setID(rs.getInt("id"));
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
		List<Lugar> vetLugares = new ArrayList<>();
		Connection conexao = new ConnectionFactory().getConnection();
		Evento event = new Evento();
		Lugar lug;
		event.setID(eventoId);
		String sql = "SELECT * from eventos WHERE id ="+ event.getID()+";";
		PreparedStatement sqlSelect, sqlSelect1;

		try {
			sqlSelect = conexao.prepareStatement(sql);
			ResultSet rs = sqlSelect.executeQuery();
			
			while (rs.next()) {
			
				lug = new Lugar();
				String sql1 = "SELECT * from lugares WHERE id_event =" + event.getID() + ";";
				sqlSelect1 = conexao.prepareStatement(sql1);
				ResultSet rs1 = sqlSelect1.executeQuery();
				event.setID(rs.getInt("id"));
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
