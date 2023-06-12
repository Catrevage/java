public class Gerente extends Funcionario {
	Gerente(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario);
		this.senha = senha;
	}
	private int senha;
	
	//Getters and Setters
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public int getSenha() {
		return senha;
	}
	
	//Methods
	public boolean autentica(int senha) {
		if(senha == this.senha) {
			return true;
		} else return false;

	}
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
	}
	
	
}
