package br.com.alura.loja.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.alura.loja.model.Produto;

public class ProdutosDAO {
	
	private EntityManager em;
	

	public ProdutosDAO(EntityManager em) {
		this.em = em;
	}
	
	public void salvar(Produto produto) {
		this.em.persist(produto);
	}
	
	private void atualizar(Produto produto) {
		this.em.merge(produto);

	}
	
	private void deletar(Produto produto) {
		produto = em.merge(produto);
		this.em.remove(produto);

	}

	public Produto buscaPorId(int id) {
		return em.find(Produto.class, id);
				
	}
	
	public List<Produto> buscarTodos(){
		String jpql = "SELECT p FROM Produto p";
		return em.createQuery(jpql, Produto.class).getResultList();
	}
	
	public List<Produto> buscarPorNome(String nome){
		String jpql = "SELECT p FROM Produto p WHERE p.nome = :nome";//pode ser ?1...
		return em.createQuery(jpql, Produto.class)
				.setParameter("nome", nome)
				.getResultList();
	}
	
	public List<Produto> buscarPorCategoria(String nome){
		String jpql = "SELECT p FROM Produto p WHERE p.categoria.nome = :nome";
		return em.createQuery(jpql, Produto.class)
				.setParameter("nome", nome)
				.getResultList();
	}
	
	public double buscarPorPrecoComNome(String nome){
		String jpql = "SELECT p.preco FROM Produto p WHERE p.nome = :nome";
		return em.createQuery(jpql, Double.class)
				.setParameter("nome", nome)
				.getSingleResult();
	}
	
}
