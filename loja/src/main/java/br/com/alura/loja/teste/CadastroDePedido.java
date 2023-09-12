package br.com.alura.loja.teste;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.alura.loja.dao.ClienteDAO;
import br.com.alura.loja.dao.PedidoDAO;
import br.com.alura.loja.dao.ProdutosDAO;
import br.com.alura.loja.model.Cliente;
import br.com.alura.loja.model.ItemPedido;
import br.com.alura.loja.model.Pedido;
import br.com.alura.loja.model.Produto;
import br.com.alura.loja.util.JPAUtil;

public class CadastroDePedido {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		ProdutosDAO produtoDao = new ProdutosDAO(em);
		PedidoDAO pedidoDao = new PedidoDAO(em);
		ClienteDAO clienteDao = new ClienteDAO(em);

		em.getTransaction().begin();

		Cliente cli = new Cliente("JOSÉ DOS SANTOS", "9999999999");
		clienteDao.salvar(cli);
		Produto prod = produtoDao.buscaPorId(7);
		Pedido ped = new Pedido(cli);
		ItemPedido item = new ItemPedido(10, ped, prod);
		ped.adicionarItem(item);
		pedidoDao.salvar(ped);

		em.getTransaction().commit();
		
		List<Object[]> rel = pedidoDao.relatorioDeVendas();
		for (Object[] obj : rel) {
			System.out.println(obj[0]);
			System.out.println(obj[1]);
			System.out.println(obj[2]);
		}

	}

}
