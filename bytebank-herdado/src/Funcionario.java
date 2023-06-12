
public class Funcionario {
	private String nome;
	private String cpf;
	protected double salario;

//Builders
	public Funcionario(String nome, String cpf, double salario) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setSalario(salario);
		
	}

//Getters and Setters
	public double getBonificacao() {
		return this.salario * 0.05;
	}
	
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
