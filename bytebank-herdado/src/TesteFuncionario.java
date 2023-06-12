
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario jose = new Funcionario(
				"Jose Arimateia", 
				"444.444.444-44", 
				5200.0);
		
		Gerente francisco = new Gerente(
				"Francisco de Assis", 
				"555.555.555-55", 
				6300,
				357208);
		
		if(francisco.autentica(357208)) {
			System.out.println("Seja bem vindo!");
		} else System.out.println("Senha icorreta!");
		
		System.out.println(francisco.getBonificacao());
		
		francisco.setSenha(18);
		
		System.out.println(francisco.getSenha());
	}

}
