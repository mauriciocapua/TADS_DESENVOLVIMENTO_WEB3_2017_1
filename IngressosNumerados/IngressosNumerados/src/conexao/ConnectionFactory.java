package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	
	public Connection getConnection() {
		//Necessário adicionar o jar do sgbd no buildpath do projeto
		try {
		//string url deve ser modificada para conectar com mysql
		
		String url = "jdbc:postgresql://localhost/web3";
		String usuario = "postgres";
		String senha = "postgres";
			Class.forName("org.postgresql.Driver");
			return DriverManager.getConnection(
				url, 
				usuario, 
				senha);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		
		} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	
	}
}