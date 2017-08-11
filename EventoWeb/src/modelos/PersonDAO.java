package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import exceptions.DatabaseErrorException;

public class PersonDAO {
	
	private DataSource ds = null;

	public PersonDAO(DataSource ds) {
		this.ds = ds;
	}

	public List<Person> getAll() throws DatabaseErrorException {
		Connection c = null;
		Statement s = null;
		ResultSet rs = null;
		List<Person> l = new ArrayList<Person>();

		try {
			c = ds.getConnection();
			if (c != null) {
				s = c.createStatement();
				rs = s.executeQuery("SELECT * FROM person");
				while (rs.next())
					l.add(new Person(rs.getInt("id"), rs.getString("name")));
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

	public Person getById(int id) throws DatabaseErrorException {
		Connection c = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Person p = null;

		try {
			c = ds.getConnection();
			if (c != null) {
				ps = c.prepareStatement("SELECT * FROM person WHERE id = ?");
				ps.setInt(1, id);
				rs = ps.executeQuery();
				if (rs.next())
					p = new Person(rs.getInt("id"), rs.getString("name"));
				rs.close();
				ps.close();
			}
			c.close();
		} catch (Exception e) {
			throw new DatabaseErrorException();
		}
		return(p);
	}

}