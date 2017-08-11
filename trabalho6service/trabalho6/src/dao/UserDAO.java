package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import javax.sql.DataSource;

import fault.DatabaseErrorException;
import model.Evento;
import model.User;

public class UserDAO {
	private DataSource ds = null;

	public  UserDAO(DataSource ds) {
		this.ds = ds;
	}

	public User getUser(User user) throws DatabaseErrorException {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		return null;
	}
	
}
