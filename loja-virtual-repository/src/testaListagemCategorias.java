import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.jdbc.ConnectionFactory;
import br.com.jdbc.dao.CategoriaDAO;
import br.com.jdbc.modelo.Categoria;
import br.com.jdbc.modelo.Produto;

public class testaListagemCategorias {

	public static void main(String[] args) throws SQLException {

		try (Connection connection = new ConnectionFactory().criaConexao()) {
			CategoriaDAO categoriaDAO = new CategoriaDAO(connection);
			List<Categoria> listaDeCategorias = categoriaDAO.listaComProdutos();
			listaDeCategorias.stream().forEach(ct -> {
				System.out.println(ct.getId() + " - " + ct.getNome().toUpperCase());
				for (Produto produto : ct.getProdutos()) {
					System.out.println(
							ct.getId() + " - " + ct.getNome().toUpperCase() + " - " + produto.getNome().toUpperCase());

				}

			});

		}

	}

}
