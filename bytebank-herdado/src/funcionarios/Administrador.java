package funcionarios;

import sistemas.*;

public class Administrador extends Funcionario implements Autenticavel{
	private AutenticacaoUtil util;
	
	public Administrador(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		this.util = new AutenticacaoUtil();
		
	}

	@Override
	public double getBonificacao() {
		double boni = this.getSalario() * 1.3;
		return boni;
	}

	@Override
	public void setSenha(int senha) {
		this.util.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.util.autentica(senha);
		
	}

}
