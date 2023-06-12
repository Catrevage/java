package com.cursojavaloiane.aula19;

public class Exercicio24 {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,5,4,3,2,1};
		int cont = a.length - 1; //cria um contador com o número de posições do vetor
		boolean flag = true;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] != a[cont]) flag = false; 
			cont--;//decrementa o contador para ler o vetor de trás pra fente
		}
		
		if (flag) {
			System.out.println("O vetor é um palídromo");
		} else System.out.println("O vetor não é um palídromo");
		
	}

}
