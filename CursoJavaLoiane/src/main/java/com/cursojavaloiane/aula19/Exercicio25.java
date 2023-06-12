package com.cursojavaloiane.aula19;

import java.util.Random;

public class Exercicio25 {

	public static void main(String[] args) {
		Random gerador = new Random();
		int [] a = new int[10];
		int [] b = new int[10];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = gerador.nextInt(100);//preenche o vetor com elementos aleatórios
			if (a[i] % 2 == 0) {
				b[i] = 1;
			} else b[i] = 0;
		}
		
		//imprime o vetor a e b
		System.out.print("Vetor a: ");
		for (int temp : a) System.out.print(temp+" ");
		System.out.println();
		System.out.print("Vetor b: ");
		for (int temp : b) System.out.print(temp+" ");
	}

}
