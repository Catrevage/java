package br.com.alura.banco.util;

import java.util.ArrayList;

import br.com.alura.banco.model.Cliente;
import br.com.alura.banco.model.Conta;
import br.com.alura.banco.model.ContaCorrente;

public class TesteArrayListEquals {


	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Cliente c1 = new Cliente(
				"Johanes", 
				"000-000-000-99", 
				"Ator");
				
		Conta cc1 = new ContaCorrente(1111, 11, c1);
		Conta cc2 = new ContaCorrente(2222, 22, c1);
		Conta cc3 = new ContaCorrente(2222, 22, c1);
		
		
		lista.add(cc1);
		lista.add(cc2);
		

		
		
		for (Conta item : lista ) {
			System.out.println(item.equals(cc3));
		}
		

	}

}
