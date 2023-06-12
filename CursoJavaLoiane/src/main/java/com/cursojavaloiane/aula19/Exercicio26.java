package com.cursojavaloiane.aula19;

import java.util.Random;

public class Exercicio26 {

	public static void main(String[] args) {
		Random gerador = new Random();
		int [] a = new int[10];
		int [] b = new int[10];
		int [] c = new int[10];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = gerador.nextInt(100);
			b[i] = gerador.nextInt(100);
			
			if(a[i] > b[i]) {
				c[i] = 1;
			} else if (a[i] < b[i]) {
				c[i] = -1;
			} else c[i] = 0;
		}
		
		System.out.print("Vetor a: ");
		for (int temp : a) System.out.print(temp+" ");
		System.out.println();
		System.out.print("Vetor b: ");
		for (int temp : b) System.out.print(temp+" ");
		System.out.println();
		System.out.print("Vetor c: ");
		for (int temp : c) System.out.print(temp+" ");
	}

}
