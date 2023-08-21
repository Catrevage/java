package br.com.jdbc.modelo;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
	private int id;
	private String nome;
	private List<Produto> produtos = new ArrayList<Produto>();
	
	public Categoria(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getID() {
		return this.id;
	}

	public void addProduto(Produto produto) {
		this.produtos.add(produto);
		
	}

	public List<Produto> getProdutos() {
		return this.produtos;
	}
	
	

}
