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

			System.out.printf("%-5s"+"%-40s"+"%s"+"\n","ID","NOME","DESCRICAO");

			while (result.next()) {
				Integer id = result.getInt("ID");
				System.out.printf("%-5d",id);
				String nome = result.getString("NOME");
				System.out.printf("%-40s", nome);
				String descricao = result.getString("DESCRICAO");
				System.out.printf("%s\n", descricao);
			}
		}

	}

}
