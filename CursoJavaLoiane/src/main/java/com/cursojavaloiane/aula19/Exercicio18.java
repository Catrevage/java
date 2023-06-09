package com.cursojavaloiane.aula19;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		int [] idade = new int[10];
		Scanner input = new Scanner(System.in);
		int maior= 0, menor = 0, positionMaior = 0, positionMenor = 0, cont = 0;
		
		for (int i = 0; i < idade.length; i++) {
			System.out.print("Informe a idade da posição "+i+": ");
			idade[i] = input.nextInt();			
					
		}
		
		for (int temp : idade) {
			if (cont == 0) {
				maior = temp;
				menor = temp;
			} else {
				if(temp > maior) {
					maior = temp;
					positionMaior = cont;
					
				}
				
				if (temp < menor) {
					menor = temp;
					positionMenor = cont;
				}
				
			}
		  cont++;
		}
		
		System.out.println("A maior idade é: "+maior+" na posição "+positionMaior);
		System.out.println("A menor idade é: "+menor+" na posição "+positionMenor);
		
	}

}
