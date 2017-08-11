package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import exceptions.DatabaseErrorException;

public class LugarDAO {
	
	private DataSource ds = null;

	public LugarDAO(DataSource ds) {
		this.ds = ds;
	}

	public List<Lugar> getLugares(int id) throws DatabaseErrorException {
		Connection c = null;
		Statement s = null;
		ResultSet rs = null;
		List<Lugar> l = new ArrayList<Lugar>();
		
		try {
			c = ds.getConnection();
			if (c != null) {
				s = c.createStatement();
				rs = s.executeQuery("select * from lugar where id_evento = '"+id+"' and status = 'livre' and preco > 0") ;
				while (rs.next())
					l.add(new Lugar(rs.getInt("numero"), rs.getDouble("preco"),rs.getString("local")));
				rs.close();
				s.close();
			}
			c.close();
		} catch (Exception e) {
			throw new DatabaseErrorException();
		}
		return(l);
	}

	public void incluiLugares(int id_evento, int lugares, String local) throws DatabaseErrorException {
		Connection c = null;
		
		String sql = "insert into lugar (numero, id_evento, preco, status, local) values (?,?,?,?,?)";
		
		try {
			c = ds.getConnection();
			PreparedStatement ps = c.prepareStatement(sql);
			for (int i = 0; i < lugares; i++){
				if (c != null) {
					ps.setInt(1, i+1);
					ps.setInt(2, id_evento);
					ps.setDouble(3, 0);
					ps.setString(4, "livre");
					ps.setString(5, local);
			        ps.execute();
				}
			}
			ps.close();
			c.close();
			} catch (Exception e) {
				e.printStackTrace();
				throw new DatabaseErrorException();
			}
	}
	
	public int atribuiPreco(int id_evento, double preco, int lugarInicial, int lugarFinal) throws DatabaseErrorException {
		Connection c = null;
		
		String sql = "UPDATE lugar set preco = (?) where numero = (?) and id_evento = (?);";
		
		try {
			c = ds.getConnection();
			PreparedStatement ps = c.prepareStatement(sql);
			while (lugarInicial <= lugarFinal){
				if (c != null) {
					ps.setDouble(1, preco);
					ps.setInt(2, lugarInicial);
					ps.setInt(3, id_evento);
			        ps.executeUpdate();
				}
				lugarInicial++;
			}
			ps.close();
			c.close();
			} catch (Exception e) {
				e.printStackTrace();
				throw new DatabaseErrorException();
			}
		return 1;
	}
	
	
}