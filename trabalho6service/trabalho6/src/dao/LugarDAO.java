package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

import fault.*;
import model.*;

public class LugarDAO {

	private DataSource dateSource = null;

	public LugarDAO(DataSource dateSource) {
		this.dateSource = dateSource;
	}

	public List<Lugar> getLugares(Evento evento) throws DatabaseErrorException {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		List<Lugar> lugares = new ArrayList<Lugar>();
		Lugar lugarTMP = null;
		String query = "SELECT * FROM lugar where id_evento='" + evento.getId() + "'and status = false;";

		try {
			connection = dateSource.getConnection();
			if (connection != null) {
				statement = connection.createStatement();
				resultSet = statement.executeQuery(query);
				if (resultSet.next()) {
					do {
						lugarTMP = new Lugar();
						lugarTMP.setId(resultSet.getInt("id"));
						lugarTMP.setLocal(resultSet.getString("local"));
						lugarTMP.setStatus(resultSet.getBoolean("status"));
						lugarTMP.setPreco(resultSet.getDouble("preco"));
						lugares.add(lugarTMP);
					} while (resultSet.next());
				}
				resultSet.close();
				statement.close();
			}
			connection.close();
		} catch (Exception e) {
			throw new DatabaseErrorException();
		}
		return (lugares);
	}

	public List<Lugar> incluiLugares(int id_evento, int lugares, String local) throws DatabaseErrorException {
		Connection connection = null;
		String query = "insert into lugar (id_evento, local) values (?,?);";
		List<Lugar> lugaresInseridos = new ArrayList<Lugar>();
		Lugar lugar = null;
		try {
			connection = dateSource.getConnection();
			if (connection != null) {
				PreparedStatement preparedStatement = connection.prepareStatement(query);

				for (int i = 0; i < lugares; i++) {
					lugar = new Lugar();
					lugar.setLocal(local);

					preparedStatement.setInt(1, id_evento);
					preparedStatement.setString(2, local);
					preparedStatement.execute();
					// resultSet = preparedStatement.executeQuery();
					//
					// if (resultSet.next()) {
					// lugar.setId(resultSet.getInt("id"));
					// lugar.setPreco(resultSet.getDouble("preco"));
					// lugar.setStatus(resultSet.getBoolean("status"));
					// }
					// System.out.println(lugares);
					// lugaresInseridos.add(lugar);
				}
				preparedStatement.close();
			}
			connection.close();
		} catch (Exception e) {
			throw new DatabaseErrorException();
		}
		return lugaresInseridos;
	}

	public void updatePrecoLugares(Evento evento, Integer lugarInicial, Integer lugarFinal, Double preco)
			throws DatabaseErrorException {
		Connection connection = null;
		ResultSet resultSet = null;
		String query = "update lugar set preco = ? where id_evento = ? and id between ? and ? returning id;";

		try {
			connection = dateSource.getConnection();
			if (connection != null) {

				PreparedStatement preparedStatement = connection.prepareStatement(query);
				preparedStatement.setDouble(1, preco);
				preparedStatement.setInt(2, evento.getId());
				preparedStatement.setInt(3, lugarInicial);
				preparedStatement.setInt(4, lugarFinal);
				resultSet = preparedStatement.executeQuery();
				if (!resultSet.next()) {
					throw new DatabaseErrorException();
				}
				preparedStatement.close();
			}
			connection.close();
		} catch (Exception e) {
			throw new DatabaseErrorException();
		}
	}

	public void updateStatusLugares(Evento evento, Lugar lugar) throws DatabaseErrorException {
		Connection connection = null;
		ResultSet resultSet = null;
		String query = "update lugar set status = ? where id_evento = ? and id = ? returning id;";

		try {
			connection = dateSource.getConnection();
			if (connection != null) {

				PreparedStatement preparedStatement = connection.prepareStatement(query);
				preparedStatement.setBoolean(1, true);
				preparedStatement.setInt(2, evento.getId());
				preparedStatement.setInt(3, lugar.getId());
				resultSet = preparedStatement.executeQuery();
				if (!resultSet.next()) {
					throw new DatabaseErrorException();
				}
				preparedStatement.close();
			}
			connection.close();
		} catch (Exception e) {
			throw new DatabaseErrorException();
		}
	}
}
