package modelo;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexao.ConnectionFactory;

public class Cliente {
	int id;
	String nome;

	public Cliente() {

	}

	public Cliente(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static List<Cliente> listarTodos() throws Exception {
		List<Cliente> vetCliente = new ArrayList<>();
		Connection con = new ConnectionFactory().getConnection();
		String sql = "SELECT * FROM cliente";
		PreparedStatement sqlSelect = con.prepareStatement(sql);
		ResultSet rs = sqlSelect.executeQuery();
		Cliente cliente;
		while (rs.next()) {
			cliente = new Cliente();
			cliente.setId(rs.getInt("id"));
			cliente.setNome(rs.getString("nome"));
			vetCliente.add(cliente);
		}
		sqlSelect.close();
		con.close();
		return vetCliente;
	}
	
	public static List<Dependente> listarTodosDependentes() throws Exception {
		List<Dependente> vetDependente = new ArrayList<>();
		Connection con = new ConnectionFactory().getConnection();
		String sql = "SELECT * FROM dependente";
		PreparedStatement sqlSelect = con.prepareStatement(sql);
		ResultSet rs = sqlSelect.executeQuery();
		Dependente dependente;
		while (rs.next()) {
			dependente = new Dependente();
			dependente.setId(rs.getInt("id"));
			dependente.setNome(rs.getString("nome"));
			dependente.setId_cliente(rs.getInt("id_cliente"));
			vetDependente.add(dependente);
		}
		sqlSelect.close();
		con.close();
		return vetDependente;
	}
	
	public static void adicionarDependente(String nome, int id_cliente) throws Exception{
        Connection connection =  new ConnectionFactory().getConnection();
        String sql = "INSERT INTO dependente (nome,id_cliente) VALUES (?,?) RETURNING id;";
        PreparedStatement sqlInsert = connection.prepareStatement(sql);
        sqlInsert.setString(1, nome);
        sqlInsert.setInt(2, id_cliente);
        
        ResultSet rs = sqlInsert.executeQuery();
        if (rs.next()){
        }
        
        sqlInsert.close();
        connection.close();
    } 
	
    public static void deletarDependente(int id) throws Exception{
        Connection connection = new ConnectionFactory().getConnection();
        String sql = "DELETE FROM dependente WHERE id = ?;";
        PreparedStatement sqlDelete = connection.prepareStatement(sql);
        sqlDelete.setInt(1, id);
        sqlDelete.executeUpdate();   
        sqlDelete.close();
        connection.close();
    } 
	
    public static void alterarDependente(int id, String nome, int id_cliente, int codigo) throws Exception{
    	Connection connection = new ConnectionFactory().getConnection();
         String sql = "update dependente set nome = (?), id = (?), id_cliente = (?) where id = (?);";
         PreparedStatement sqlUpdate = connection.prepareStatement(sql);
         sqlUpdate.setString(1, nome);
         sqlUpdate.setInt(2, id);
         sqlUpdate.setInt(3, id_cliente);
         sqlUpdate.setInt(4, codigo);
         sqlUpdate.executeUpdate();

         sqlUpdate.close();
         connection.close(); 
     }
	

}
