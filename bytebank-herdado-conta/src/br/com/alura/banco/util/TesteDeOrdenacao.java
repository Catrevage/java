package br.com.alura.banco.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.alura.banco.model.Cliente;
import br.com.alura.banco.model.Conta;
import br.com.alura.banco.model.ContaCorrente;

public class TesteDeOrdenacao {

	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<Conta>();
		NumeroDaContaComparator comparator = new NumeroDaContaComparator();
		TitularDaContaComparator compareTitular = new TitularDaContaComparator();
		ArrayList<String> arr = new ArrayList<String>();
		
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
		
		arr.add("Maria");
		arr.add("Barbara");
		arr.add("Adelaide");
		arr.add("Luana");
		arr.add("Janaina");		
		
		Collections.sort(lista);
		Collections.reverse(lista);
		Collections.sort(arr);
		
		for(Conta item : lista) {
			System.out.println(item);
		}
		
		System.out.println("-----------------");
		
		for(String item : arr) {
			System.out.println(item);
		}
		
		

	}

}

class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta o1, Conta o2) {
		
		return Integer.compare(o1.getNumero(), o2.getNumero());
		
	}
	
	
}

class TitularDaContaComparator implements Comparator<Conta>{

	@Override
	public int compare(Conta o1, Conta o2) {
		String nomeC1 = o1.getCliente().getNome();
		String nomeC2 = o2.getCliente().getNome();
		
		return nomeC1.compareTo(nomeC2);
	}
	
}