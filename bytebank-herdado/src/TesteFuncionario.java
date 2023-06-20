import funcionarios.*;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario allan = new Escriturario(
				"Allan A. Allan", 
				"666.666.666-77", 
				3900,
				"Empréstimos");
		
		Funcionario carlos = new Gerente(
				"Carlos Apolinario", 
				"777.777.777-77", 
				7200);
	
		System.out.println("Chamando bonificação do Escriturario: "
				+allan.getBonificacao());
		System.out.println("Chamando bonificação do Gerente: "
				+carlos.getBonificacao());
	}
	

}
