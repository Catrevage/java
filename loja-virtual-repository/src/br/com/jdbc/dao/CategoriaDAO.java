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

public class CategoriaDAO {
	private Connection connection;

	public CategoriaDAO(Connection connection) {
		this.connection = connection;

	}

	public void salvar(Produto categoria) throws SQLException {
		String sql = "INSERT INTO CATEGORIA(NOME) VALUES (?)";

		try (PreparedStatement stm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

			stm.setString(1, categoria.getNome());

			stm.execute();

			try (ResultSet result = stm.getGeneratedKeys()) {

				while (result.next()) {
					categoria.setId(result.getInt(1));
				}

			}
		}

	}

	public void deleta(Produto categoria) throws SQLException {
		String sql = "DELETE PRODUTO WHERE ID = (?)";

		try (PreparedStatement stm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

			stm.execute();

			try (ResultSet result = stm.getGeneratedKeys()) {

				while (result.next()) {
					categoria.setId(result.getInt(1));
				}

			}
		}

	}

	public List<Categoria> listar() throws SQLException {
		List<Categoria> categorias = new ArrayList<Categoria>();

		String sql = "SELECT ID, NOME FROM CATEGORIA";

		try (PreparedStatement stm = connection.prepareStatement(sql)) {

			stm.execute();

			try (ResultSet result = stm.getResultSet()) {
				while (result.next()) {
					Categoria categoria = new Categoria(result.getInt(1), result.getString(2));
					categorias.add(categoria);
				}
			}
		}

		return categorias;
	}

	public List<Categoria> listaComProdutos() throws SQLException {
		Categoria ultimaCat = null;
		List<Categoria> listaDeCategorias = new ArrayList<Categoria>();

		String sql = "SELECT C.ID, C.NOME, P.ID, P.NOME, P.DESCRICAO FROM CATEGORIA C INNER JOIN "
				+ "PRODUTO P ON C.ID = P.CATEGORIA_ID";

		try (PreparedStatement stm = connection.prepareStatement(sql)) {

			stm.execute();

			try (ResultSet result = stm.getResultSet()) {
				while (result.next()) {

					if (ultimaCat == null || !ultimaCat.getNome().equals(result.getString(2))) {
						Categoria categoria = new Categoria(result.getInt(1), result.getString(2));
						ultimaCat = categoria;
						listaDeCategorias.add(categoria);
					}
					Produto produto = new Produto(
							result.getInt(3), 
							result.getString(4), 
							result.getString(5));
					ultimaCat.addProduto(produto);
					

				}
			}
		}

		return listaDeCategorias;
	}

}
