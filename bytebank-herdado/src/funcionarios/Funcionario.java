package funcionarios;

public abstract class Funcionario {
	private String nome;
	private String cpf;
	protected double salario;
	
//Constructor
	public Funcionario(String nome, String cpf, double salario) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setSalario(salario);
	}

//Getters and Setters

	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
