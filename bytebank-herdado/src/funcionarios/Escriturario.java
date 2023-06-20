package funcionarios;

import sistemas.Autenticavel;

public class Escriturario extends Funcionario implements Autenticavel {
	private String setor;
	private int senha;
	
	public Escriturario(String nome, String cpf, double salario, String setor) {
		super(nome, cpf, salario);
		this.setSetor(setor);
		this.setSenha(senha);
	}

	@Override
	public double getBonificacao() {
		double boni = this.getSalario() * 1.2;
		return boni;
	}
	
	public void setSetor(String setor) {
		this.setor = setor;
	}


	@Override
	public void setSenha(int senha) {
		this.senha = senha;
		
	}


	@Override
	public boolean autentica(int sennha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	
}
