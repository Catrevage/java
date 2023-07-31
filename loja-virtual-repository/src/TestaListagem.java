import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory criaConexao = new ConnectionFactory();
		Connection connection =  criaConexao.criaConexao();
		
		criaConexao.criaConexao();
				
		Statement stm = connection.createStatement();
		stm.execute("SELECT * FROM PRODUTO");
		
		ResultSet result = stm.getResultSet();
		
		
		System.out.print("ID"+"	"+"NOME"+"		"+"DESCRIÇÃO");
		System.out.println();
		
		while(result.next()) {
			Integer id = result.getInt("ID");
			System.out.print(id+"	");
			String nome = result.getString("NOME");
			System.out.print(nome+"	");
			String descricao = result.getString("DESCRICAO");
			System.out.print(descricao+"	");
			System.out.println();
		}
		
		connection.close();
		

	}

}
