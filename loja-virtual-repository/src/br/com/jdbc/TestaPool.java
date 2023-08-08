package br.com.jdbc;
import java.sql.SQLException;

public class TestaPool {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		
		for (int i = 0; i < 20; i++) {
			factory.criaConexao();
			System.out.println("Criada a conexão "+i);
		}
		

	}

}
