package br.com.alura.banco.model;

public class Cliente {
	private String nome;
	private String cpf;
	private String profissao;
	
	//Builders
	public Cliente(String nome, String cpf, String profissao) {
		this.setName(nome);
		this.setCpf(cpf);
		this.setProfissao(profissao);
		
	}
	
	//Setters
	public void setName(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	//Getters
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getProfissao() {
		return this.profissao;
	}
}
