package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import conexao.ConnectionFactory;
import negocios.Lugar;

public class LugarDAO {

	public boolean inserirLugar(Integer id_event, Integer numero, Double valor, String status, String local)
			throws SQLException {
		boolean resultado = false;
		Connection conexao = new ConnectionFactory().getConnection();
		String sql1 = "INSERT into lugares(id_event,numero,valor,status,local) VALUES(?,?,?,?,?);";
		PreparedStatement sqlInsert1 = conexao.prepareStatement(sql1);
		sqlInsert1.setInt(1, id_event);
		sqlInsert1.setInt(2, numero);
		sqlInsert1.setDouble(3, valor);
		sqlInsert1.setString(4, status);
		sqlInsert1.setString(5, local);
		if (sqlInsert1.executeUpdate() == 1) {
			conexao.close();
			resultado = true;
			return resultado;
		}
		return resultado;
	}

	public List<Lugar> listaTodos(String sql) {
		List<Lugar> vetlug = new ArrayList<>();
		Connection conexao = new ConnectionFactory().getConnection();
		PreparedStatement sqlSelect;
		try {
			sqlSelect = conexao.prepareStatement(sql);
			ResultSet rs = sqlSelect.executeQuery();
			Lugar lug;

			while (rs.next()) {
				lug = new Lugar();
				lug.setNumero(rs.getInt("numero"));
				lug.setValor(rs.getDouble("valor"));
				lug.setStatus(rs.getString("status"));
				lug.setLocal(rs.getString("local"));
				vetlug.add(lug);

			}
			sqlSelect.close();
			conexao.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}

		return vetlug;
	}
	
	public void atualizaLugar(Lugar lugar, Integer eventId){		
		
		Connection conexao = new ConnectionFactory().getConnection();
		String sql = "UPDATE lugares SET numero =?, valor=?, status=?, local=? WHERE id_event = ?;";
		try {
			PreparedStatement sqlUpdate1 = conexao.prepareStatement(sql);
			sqlUpdate1.setInt(1,lugar.getNumero());
			sqlUpdate1.setDouble(2, lugar.getValor());
			sqlUpdate1.setString(3, lugar.getStatus());
			sqlUpdate1.setString(4, lugar.getLocal());
			sqlUpdate1.setInt(5, eventId);
			sqlUpdate1.executeUpdate();
			sqlUpdate1.close();
			conexao.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
