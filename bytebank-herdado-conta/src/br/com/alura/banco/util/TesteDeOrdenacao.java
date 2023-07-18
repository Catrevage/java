package br.com.alura.banco.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

import br.com.alura.banco.model.Cliente;
import br.com.alura.banco.model.Conta;
import br.com.alura.banco.model.ContaCorrente;

public class TesteDeOrdenacao {

	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Cliente c1 = new Cliente("Johanes", "000-000-000-99", "Ator");
		Cliente c2 = new Cliente("Rodrigo", "000-000-000-99", "Pedreiro");
		Cliente c3 = new Cliente("Marcio", "000-000-000-99", "Bancário");
		Cliente c4 = new Cliente("Bernardo", "000-000-000-99", "jardineiro");
		
				
		Conta cc1 = new ContaCorrente(1111, 11, c1);
		Conta cc2 = new ContaCorrente(2222, 22, c2);
		Conta cc3 = new ContaCorrente(3333, 33, c3);
		Conta cc4 = new ContaCorrente(4444, 44, c4);
		
		cc1.deposita(200);
		cc2.deposita(350);
		cc3.deposita(600);
		cc4.deposita(50);
		
		lista.add(cc3);
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc4);
			
		
		Comparator<Conta> numComp = (o1, o2) -> Integer.compare(o1.getNumero(), o2.getNumero());
		Comparator<Conta> titComp = (o1, o2) -> o1.compareTo(o2);
		
		lista.sort(numComp);
		lista.forEach((item)-> System.out.println(item));

	}
}
