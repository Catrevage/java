package br.com.alura.loja.dao;

import javax.persistence.EntityManager;

import br.com.alura.loja.model.ItemPedido;

public class ItemPedidoDAO {
	private EntityManager em;

	public ItemPedidoDAO(EntityManager em) {
		this.em = em;
	}

	public void salvar(ItemPedido item) {
		this.em.persist(item);
	}
}
