package com.cursojavaloiane.aula19;

import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		int [] idade = new int[10];
		Scanner input = new Scanner(System.in);
		int maior35 = 0;
		
		for (int i = 0; i < idade.length; i++) {
			System.out.println("Informe a idade da posição "+(i+1)+": ");
			idade[i] = input.nextInt();			
					
		}
		
		for (int temp: idade ) {
			if (temp > 35) {
				maior35++;
			}
		}
		
		System.out.println(maior35+" idade(s) maior(es) que 35.");
				
		
	}
}