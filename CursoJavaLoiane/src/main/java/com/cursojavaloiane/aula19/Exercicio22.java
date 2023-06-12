package com.cursojavaloiane.aula19;

import java.util.Random;

public class Exercicio22 {

	public static void main(String[] args) {
		Random gerador = new Random();
		int [] a = new int[10];
		double zero = 0, um = 0;
		
		for (int i = 0; i < 10; i++) {
			a[i] = gerador.nextInt(2);
			if (a[i] == 0) {
				zero++;
			} else um++;
		}
		
		for (int temp : a) System.out.print(temp+" ");
		System.out.println();
		System.out.println("A porcentagem de zeros é: "+((zero/10)*100)+"%");
		System.out.println("A porcentagem de um(s) é: "+((um/10)*100)+"%");
	}

}
