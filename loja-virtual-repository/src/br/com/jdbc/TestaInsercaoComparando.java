package br.com.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.management.RuntimeErrorException;

public class TestaInsercaoComparando {
	public static void main(String[] args) throws SQLException {

		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.criaConexao();
		connection.setAutoCommit(false);

		try (PreparedStatement stm = connection.prepareStatement("INSERT INTO PRODUTO(nome, descricao) VALUES(? , ?)",
				Statement.RETURN_GENERATED_KEYS)) {

			adicionaVariavel("MOUSE PAD", "GAMER GRANDE", stm);
			adicionaVariavel("RADIO AM/FM", "PILHAS AAA", stm);

			connection.commit();

		} catch (Exception e) { 	
			e.printStackTrace();
			System.out.println("ROLLBACK EXECUTADO");
			connection.rollback();
		}
	}



	private static void adicionaVariavel(String nome, String descricao, PreparedStatement stm) throws SQLException {
		stm.setString(1, nome);
		stm.setString(2, descricao);

		if (nome.equals("RADIO")) {
			throw new RuntimeException("PRODUTO NÃO ADICIONADO");
		}

		stm.execute();

		try (ResultSet result = stm.getGeneratedKeys()) {

			while (result.next()) {
				Integer id = result.getInt(1);
				System.out.println("ID gerado: " + id);
			}
		}
	}

}
