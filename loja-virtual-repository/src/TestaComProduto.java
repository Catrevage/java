import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.jdbc.ConnectionFactory;
import br.com.jdbc.modelo.Produto;

public class TestaComProduto {

	public static void main(String[] args) throws SQLException {
		Produto produto = new Produto("CABO HDMI", "FULLHD");

		try (Connection connection = new ConnectionFactory().criaConexao()) {

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
		System.out.println(produto);
	}

}
