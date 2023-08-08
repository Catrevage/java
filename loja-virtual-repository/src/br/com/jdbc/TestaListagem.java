package br.com.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory criaConexao = new ConnectionFactory();
		Connection connection = criaConexao.criaConexao();

		try (PreparedStatement stm = connection.prepareStatement("SELECT * FROM PRODUTO")) {
			stm.execute();

			ResultSet result = stm.getResultSet();

			System.out.print("ID" + "\t" + "NOME" + "\t\t\t\t\t" + "DESCRIÇÃO" + "\n");

			while (result.next()) {
				Integer id = result.getInt("ID");
				System.out.printf("%d\t",id);
				String nome = result.getString("NOME");
				System.out.printf("%s\t", nome);
				String descricao = result.getString("DESCRICAO");
				System.out.printf("%s\n", descricao);
			}
		}

	}

}
