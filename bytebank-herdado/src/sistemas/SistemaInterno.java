package sistemas;


public class SistemaInterno {
	private int senha = 2222;
	
	public void autentica(Autenticavel g) {
		boolean login = g.autentica(this.senha);
		if (login) {
			System.out.println("Acesso autorizado");
		} else System.out.println("Acesso negado!");

	}
}
