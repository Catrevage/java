package br.com.alura.loja.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.alura.loja.model.Pedido;

public class PedidoDAO {
	private EntityManager em;

	public PedidoDAO(EntityManager em) {
		this.em = em;
	}

	public void salvar(Pedido pedido) {
		this.em.persist(pedido);
	}
	
	public double valorTotalVendido() {
		String jpql = "SELECT SUM(p.valorTotal) FROM Pedido p";
		return em.createQuery(jpql, Double.class)
				.getSingleResult();

	}
	
	public List<Object[]> relatorioDeVendas() {
		String jpql = "SELECT produto.nome, SUM(item.quantidade), "
				+ "MAX(pedido.data) FROM Pedido pedido "
				+ "JOIN pedido.itens item "
				+ "JOIN item.produto produto "
				+ "GROUP BY produto.nome "
				+ "ORDER BY item.quantidade DESC";
		return em.createQuery(jpql, Object[].class)
				.getResultList();
	}

}
