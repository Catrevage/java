package br.com.alura.loja.dao;

import javax.persistence.EntityManager;

import br.com.alura.loja.model.Categoria;

public class CategoriaDAO {


	private EntityManager em;

	public CategoriaDAO(EntityManager em) {
		this.em = em;
	}
	
	public void salvar(Categoria categoria) {
		this.em.persist(categoria);
	}
	
	private void atualizar(Categoria categoria) {
		this.em.merge(categoria);		

	}
	
	private void deletar(Categoria categoria) {
		categoria = em.merge(categoria);
		this.em.remove(categoria);

	}
}
