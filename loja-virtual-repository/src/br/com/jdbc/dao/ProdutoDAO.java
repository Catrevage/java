package br.com.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.jdbc.modelo.Categoria;
import br.com.jdbc.modelo.Produto;

public class ProdutoDAO {
	private Connection connection;

	public ProdutoDAO(Connection connection) {
		this.connection = connection;

	}

	public void salvar(Produto produto) throws SQLException {
		String sql = "INSERT INTO PRODUTO(NOME, DESCRICAO) VALUES (?, ?)";

		try (PreparedStatement stm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

			stm.setString(1, produto.getNome());
			stm.setString(2, produto.getDescricao());

			stm.execute();

			try (ResultSet result = stm.getGeneratedKeys()) {

				while (result.next()) {
					produto.setId(result.getInt(1));
				}

			}
		}

	}

	public List<Produto> listar() throws SQLException {
		List<Produto> ListaDeProdutos = new ArrayList<Produto>();
		
		String sql = "SELECT * FROM PRODUTO";

		try (PreparedStatement stm = connection.prepareStatement(sql)) {

			stm.execute();

			try (ResultSet result = stm.getResultSet()) {
				while (result.next()) {
					Produto produto = new Produto(
							result.getInt(1), 
							result.getString(2), 
							result.getString(3));
					ListaDeProdutos.add(produto);
				}

			}
		}
		return ListaDeProdutos;
	}

	public List<Produto> listarByCat(Categoria ct) throws SQLException {
		List<Produto> listaProdutos = new ArrayList<Produto>();
		
		String sql = "SELECT * FROM PRODUTO WHERE CATEGORIA_ID = ?";

		try (PreparedStatement stm = connection.prepareStatement(sql)) {
			stm.setInt(1, ct.getID());
			stm.execute();

			try (ResultSet result = stm.getResultSet()) {
				while (result.next()) {
					Produto produto = new Produto(result.getInt(1),result.getString(2), result.getString(3));
					listaProdutos.add(produto);
				}

			}
		}

		return listaProdutos;
	}

}
