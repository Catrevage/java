package br.com.jdbc;
import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory criaConexao = new ConnectionFactory();
		Connection connection = criaConexao.criaConexao();
		
		criaConexao.criaConexao();
		System.out.println("Fechando conexão...");
		
		connection.close();
		
	}

}
