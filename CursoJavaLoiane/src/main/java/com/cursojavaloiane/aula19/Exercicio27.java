package com.cursojavaloiane.aula19;

import java.util.Random;

public class Exercicio27 {

	public static void main(String[] args) {
		Random gerador = new Random();
		int [] a = new int[10];
		char [] b = new char[10];
		
		for (int i=0; i < a.length; i++) {
			a[i] = gerador.nextInt(100);
			
			if (a[i] < 7) {
				b[i] = 'a';
			} else if (a[i] == 7) {
				b[i] = 'b';
			} else if (a[i] > 7 && a[i] < 10) {
				b[i] = 'c';
			} else if (a[i] == 10) {
				b[i] = 'd';
			} else if (a[i] > 10) {
				b[i] = 'e';
			}
		}
		
		System.out.print("Vetor a: ");
		for (int temp : a) System.out.print(temp+" ");
		System.out.println();
		System.out.print("Vetor b: ");
		for (char temp : b )System.out.print(temp+" ");
	}

}
