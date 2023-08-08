package br.com.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaDelete {

	public static void main(String[] args) throws SQLException {
		int id = 23;

		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.criaConexao();

		try (PreparedStatement stm = connection.prepareStatement("DELETE FROM produto WHERE ID = ?")) {

			stm.setInt(1, id);

			stm.execute();

			int linhasModificadas = stm.getUpdateCount();
			System.out.println(linhasModificadas);
		}

	}

}
