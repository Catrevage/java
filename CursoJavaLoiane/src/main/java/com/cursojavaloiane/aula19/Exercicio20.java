package com.cursojavaloiane.aula19;

import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args) {
		double [] a = new double[20];
		double dolar = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Informe a cotação do Dolar: ");
		dolar = input.nextDouble();
		
		
		for (int i = 0; i < a.length; i++) {
			a[i] = dolar * (i+1);
		}
		
		for (double temp : a) {
			System.out.printf("$%.2f", temp);
			System.out.println();
		}
	}
}
