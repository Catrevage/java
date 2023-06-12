package com.cursojavaloiane.aula19;

import java.util.Random;

public class Exercicio23 {

	public static void main(String[] args) {
		Random gerador = new Random();
		int [] a = new int[10];
		boolean flag = true;
		
		for (int i = 0; i < 10; i++) {//Preenche o vetor com elementos aleatorios de 0 a 99
			a[i] = gerador.nextInt(100); 
		}
		
		for (int temp : a) {//Verifica se existe algum elemento ímpar no vetor
			if (temp % 2 != 0) {
				flag = false;
				break;
			}
		}
		
		for (int temp : a) System.out.print(temp+" ");//imprime o vetor
		System.out.println();
		
	if(flag) {
		System.out.println("Tdodos os elementos do vetor a são pares.");
	} else System.out.println("Pelo menos um dos elementos do vetor é ímpar.");
		
	

	}

}
