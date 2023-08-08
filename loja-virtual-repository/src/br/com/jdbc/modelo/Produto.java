package br.com.jdbc.modelo;

import com.mchange.v2.codegen.bean.PropsToStringGeneratorExtension;

public class Produto {
	private int id;
	private String nome;
	private String descricao;
	
	public Produto(String string, String string2) {
		this.nome = string;
		this.descricao = string2;
	}

	public String getNome() {
		return this.nome;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setId(int int1) {
		this.id = int1;	
	}

	@Override
	public String toString() {
		return String.format("O produto adicionado foi: %d, %s, %s", 
				this.id, this.nome,this.descricao);
		
	}

}
