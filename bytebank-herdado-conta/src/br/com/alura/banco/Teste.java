package br.com.alura.banco;

import br.com.alura.banco.model.Cliente;
import br.com.alura.banco.model.Conta;
import br.com.alura.banco.model.ContaCorrente;
import br.com.alura.banco.model.ContaPoupanca;
import br.com.alura.banco.model.GuardadorDeContas;

public class Teste {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Cliente cliente1 = new Cliente("Jorge", "88888", "Pedreiro");
		Cliente cliente2 = new Cliente("Amado", "99999", "Cantor");
		
		Conta cc1 = new ContaCorrente(88888,7777, cliente1);
		Conta cc2 = new ContaCorrente(99999,6666666, cliente2);
		Conta cp1 = new ContaPoupanca(77, 6654, cliente1);
		
		guardador.adiciona(cc1);
		guardador.adiciona(cc2);
		guardador.adiciona(cp1);
		guardador.adiciona(cliente1);
		guardador.adiciona(cliente2);
		
		guardador.getReferencias();
			
		}
		
}


