package sistemas;

public class AutenticacaoUtil {
	private int senha; 
	
	public boolean autentica(int sennha) {
		if (this.senha == sennha) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
		
	}
}
