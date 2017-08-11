package modelos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import exceptions.DatabaseErrorException;

public class EventoDAO {
	
	private DataSource ds = null;

	public EventoDAO(DataSource ds) {
		this.ds = ds;
	}

	public List<Evento> getEventos(Evento evento) throws DatabaseErrorException {
		Connection c = null;
		Statement s = null;
		ResultSet rs = null;
		List<Evento> l = new ArrayList<Evento>();
		
		String and = "";
		String query = "SELECT * FROM evento";
		
		Boolean temNome = false, temData = false, temLocal = false;
		
		if(evento.getNome() != null ) temNome = true;
		if(evento.getData() != null) temData = true;
		if(evento.getLocal() != null && evento.getLocal() != "?") temLocal = true;
		
		if (temNome || temData || temLocal) {
			query = "SELECT * FROM evento WHERE ";
		}
		
		if(temNome) {		
			query = query + and + "nome = '" + evento.getNome() + "' ";
			and = "and ";
		}
		if(temData) {
			query = query + and + "data = '" + java.sql.Date.valueOf(evento.getData()) + "' ";
			and = "and ";
		}
		if(temLocal) {
			query = query + and + "local = '" + evento.getLocal() + "' ";
		}
		
		try {
			c = ds.getConnection();
			if (c != null) {
				s = c.createStatement();
				rs = s.executeQuery(query);
				while (rs.next())
				l.add(new Evento(rs.getInt("id"), rs.getString("nome"), LocalDate.parse(""+rs.getDate("data")), 
						rs.getTimestamp("hora_inicio").toLocalDateTime(), rs.getTimestamp("hora_fim").toLocalDateTime(), rs.getString("local"), null));
				rs.close();
				s.close();
			}
			c.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw new DatabaseErrorException();
		}
		return(l);	
	}
	
	public int incluiEvento(String nome, String data, String local, String inicioVendas, String fimVendas) throws DatabaseErrorException{
		Connection c = null;
		ResultSet rs = null;
		int id = 0;
		
		
		Date novaData = Date.valueOf(data);
		
		String sql = "insert into evento (nome, data, local, hora_inicio, hora_fim) values (?,?,?,?,?) returning id;";
		try {
			c = ds.getConnection();
			if (c != null) {
				PreparedStatement ps = c.prepareStatement(sql);
				ps.setString(1, nome);
				ps.setDate(2, novaData);
				ps.setString(3, local);
				ps.setTimestamp(4, Timestamp.valueOf(inicioVendas));
				ps.setTimestamp(5, Timestamp.valueOf(fimVendas));
		        rs = ps.executeQuery();
		        if (rs.next()){
		        	id = rs.getInt("id");
		        }
				ps.close();
			}
			c.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw new DatabaseErrorException();
		}
		return id;
	}
}