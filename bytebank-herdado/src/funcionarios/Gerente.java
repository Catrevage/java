package funcionarios;

import sistemas.*;

public class Gerente extends Funcionario implements Autenticavel {
	private AutenticacaoUtil util;
	
	//Constructors
	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		this.util = new AutenticacaoUtil();
	}
	
	
	//Getters and Setters
	
	@Override
	public double getBonificacao() {
		double boni = this.getSalario() * 1.3;
		return boni;
	}

	@Override
	public boolean autentica(int senha) {
		return this.util.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.util.setSenha(senha);;
		
	}
	
	
	
	
	
}
