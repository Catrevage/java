package br.com.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.criaConexao();

		try (PreparedStatement stm = connection.prepareStatement("INSERT INTO PRODUTO(nome, descricao) VALUES(?, ?)",
				Statement.RETURN_GENERATED_KEYS)) {

			stm.setString(1, "Informe o produto");
			stm.setString(2, "Informe a descricao");

			stm.execute();
			ResultSet result = stm.getGeneratedKeys();

			while (result.next()) {
				Integer id = result.getInt(1);
				System.out.println(id);
			}
		}
	}
}
