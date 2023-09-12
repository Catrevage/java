package br.com.alura.loja.teste;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.alura.loja.dao.CategoriaDAO;
import br.com.alura.loja.dao.ProdutosDAO;
import br.com.alura.loja.model.Categoria;
import br.com.alura.loja.model.Produto;
import br.com.alura.loja.util.JPAUtil;

public class CadastroDeProdutos {
	public static void main(String[] args) {
		cadastraProduto();
		EntityManager em = JPAUtil.getEntityManager();
		ProdutosDAO produtoDao = new ProdutosDAO(em);
		
		//double todos = produtoDao.buscarPorPrecoComNome("boneca");
		
		//System.out.println(todos);
	}

	private static void cadastraProduto() {
		EntityManager em = JPAUtil.getEntityManager();
		ProdutosDAO produtoDao = new ProdutosDAO(em);
		CategoriaDAO categoriaDao = new CategoriaDAO(em);

		Categoria categoria = new Categoria("BRINQUEDOS");

		

		Produto produto = new Produto("Boneca", "Angelica", 360.0, categoria);

		em.getTransaction().begin();
		categoriaDao.salvar(categoria);
		produtoDao.salvar(produto);
		em.getTransaction().commit();
		em.close();
	}
}
