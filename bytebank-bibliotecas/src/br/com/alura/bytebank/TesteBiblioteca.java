package br.com.alura.bytebank;

import br.com.alura.banco.model.Cliente;
import br.com.alura.banco.model.Conta;
import br.com.alura.banco.model.ContaCorrente;

public class TesteBiblioteca {

	public static void main(String[] args) {
		Cliente c = new Cliente(null, null, null);
		
		Conta conta = new ContaCorrente(0, 0, c);

	}

}
