import funcionarios.*;
import sistemas.*;

public class TesteSistema {

	public static void main(String[] args) {
		Autenticavel g = new Gerente(
				"Andrew", 
				"777.777.777-77", 
				4200);
		
		g.setSenha(2222);
		
		Autenticavel d1 = new Diretor(
				"Jefferson", 
				"888.888.888-88", 
				6900);
		
		d1.setSenha(2222);
		
		SistemaInterno sys = new SistemaInterno();
		
		
		System.out.println("Autenticação do gerente: ");
		sys.autentica(g);
		System.out.println("Autenticação do diretor: ");
		sys.autentica(d1);
		
		
		
	}

}
