package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import negocio.*;

public class EventoDAO {

	private DataSource dataSource = null;

	public EventoDAO(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<Evento> getEventos(Evento evento) throws DatabaseErrorException {

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		List<Evento> eventos = new ArrayList<Evento>();

		String query = "SELECT * FROM evento where nome = 'evento1';";

		try {
			connection = dataSource.getConnection();
			if (connection != null) {
				statement = connection.createStatement();
				resultSet = statement.executeQuery(query);
				while (resultSet.next())
					eventos.add(new Evento(resultSet.getInt("id"), resultSet.getString("nome"),
							LocalDate.parse("" + resultSet.getDate("data")),
							resultSet.getTimestamp("hora_inicio").toLocalDateTime(),
							resultSet.getTimestamp("hora_fim").toLocalDateTime(), resultSet.getString("local"), null));
				System.out.println(eventos.get(eventos.size() - 1).getId());
				resultSet.close();
				statement.close();
			}
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw new DatabaseErrorException();
		}
		return (eventos);
	}

}