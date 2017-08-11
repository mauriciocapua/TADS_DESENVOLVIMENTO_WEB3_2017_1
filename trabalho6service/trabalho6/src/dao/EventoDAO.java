package dao;

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

import fault.*;
import model.*;

public class EventoDAO {

	private DataSource dateSource = null;

	public EventoDAO(DataSource dateSource) {
		this.dateSource = dateSource;
	}

	public List<Evento> getEventos(Evento evento) throws DatabaseErrorException {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		List<Evento> eventos = new ArrayList<Evento>();

		String and = "";
		String query = "SELECT * FROM evento order by id";

		Boolean temNome = false, temData = false, temLocal = false;

		if (evento.getNome() != null && !evento.getNome().isEmpty())
			temNome = true;
		if (evento.getData() != null)
			temData = true;
		if (evento.getLocal() != null && !evento.getLocal().isEmpty())
			temLocal = true;

		if (temNome || temData || temLocal) {
			query = "SELECT * FROM evento WHERE ";
		}

		if (temNome) {
			query = query + and + "nome = '" + evento.getNome() + "'";
			and = "and ";
		}
		if (temData) {
			query = query + and + " data = '" + java.sql.Date.valueOf(evento.getData()) + "'";
			and = "and ";
		}
		if (temLocal) {
			query = query + and + " local = '" + evento.getLocal() + "'";
		}
		query = query + ";";
		Evento eventoTMP = null;
		try {
			connection = dateSource.getConnection();
			if (connection != null) {
				statement = connection.createStatement();
				resultSet = statement.executeQuery(query);
				if (resultSet.next()) {
					do {
						eventoTMP = new Evento();
						eventoTMP.setId(resultSet.getInt("id"));
						eventoTMP.setNome(resultSet.getString("nome"));
						eventoTMP.setData(LocalDate.parse("" + resultSet.getDate("data")));
						eventoTMP.setHoraInicio(resultSet.getTimestamp("hora_inicio").toLocalDateTime());
						eventoTMP.setHoraFim(resultSet.getTimestamp("hora_fim").toLocalDateTime());
						eventoTMP.setLocal(resultSet.getString("local"));
						eventoTMP.setLugares(null);
						eventos.add(eventoTMP);
					} while (resultSet.next());
				}
				resultSet.close();
				statement.close();
			}
			connection.close();
		} catch (Exception e) {
			System.out.println(e);
			throw new DatabaseErrorException();
		}
		return (eventos);
	}

	public Evento getEventoID(Evento evento) throws DatabaseErrorException {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		String query = "SELECT * FROM evento where id=" + evento.getId() + ";";

		Evento eventoTMP = null;
		try {
			connection = dateSource.getConnection();
			if (connection != null) {
				statement = connection.createStatement();
				resultSet = statement.executeQuery(query);
				if (resultSet.next()) {
					do {
						eventoTMP = new Evento();
						eventoTMP.setId(resultSet.getInt("id"));
						eventoTMP.setNome(resultSet.getString("nome"));
						eventoTMP.setData(LocalDate.parse("" + resultSet.getDate("data")));
						eventoTMP.setHoraInicio(resultSet.getTimestamp("hora_inicio").toLocalDateTime());
						eventoTMP.setHoraFim(resultSet.getTimestamp("hora_fim").toLocalDateTime());
						eventoTMP.setLocal(resultSet.getString("local"));
						eventoTMP.setLugares(null);
					} while (resultSet.next());
				}
				resultSet.close();
				statement.close();
			}
			connection.close();
		} catch (Exception e) {
			System.out.println(e);
			throw new DatabaseErrorException();
		}

		return (eventoTMP);
	}


	public Evento incluiEvento(Evento evento) throws DatabaseErrorException {
		Connection connection = null;
		ResultSet resultSet = null;
		String query = "insert into evento (nome, data, hora_inicio, hora_fim,local) values (?,?,?,?,?) returning id;";

		try {
			connection = dateSource.getConnection();
			if (connection != null) {

				PreparedStatement preparedStatement = connection.prepareStatement(query);

				preparedStatement.setString(1, evento.getNome());
				if (evento.getData() != null)
					preparedStatement.setDate(2, Date.valueOf(evento.getData()));
				else
					preparedStatement.setDate(2, null);

				if (evento.getHoraInicio() != null)
					preparedStatement.setTimestamp(3, Timestamp.valueOf(evento.getHoraInicio()));
				else
					preparedStatement.setTimestamp(3, null);

				if (evento.getHoraFim() != null)
					preparedStatement.setTimestamp(4, Timestamp.valueOf(evento.getHoraFim()));
				else
					preparedStatement.setTimestamp(4, null);

				preparedStatement.setString(5, evento.getLocal());
				resultSet = preparedStatement.executeQuery();

				if (resultSet.next()) {
					evento.setId(resultSet.getInt("id"));
				}
				preparedStatement.close();
			}
			connection.close();
		} catch (Exception e) {
			throw new DatabaseErrorException();
		}
		return evento;
	}

}