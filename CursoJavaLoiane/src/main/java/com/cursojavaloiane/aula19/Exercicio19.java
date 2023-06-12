package com.cursojavaloiane.aula19;

import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
		String [] alunos = new String[10];
		double [] nota1 = new double[10];
		double [] nota2 = new double[10];
		double [] result = new double[10];
		String [] situation = new String[10];
		int cont = 0;
	
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < alunos.length; i++) {
			System.out.print("Informe o aluno: ");
			alunos[i] = input.next();
			System.out.print("Informe a nota 1 de "+alunos[i]+" : ");
			nota1[i] = input.nextDouble();
			System.out.print("Informe a nota 2 de "+alunos[i]+" : ");
			nota2[i] = input.nextDouble();
			result[i] = (nota1[i] + nota2[i]) /2;
			if (result[i] >= 7) {
				situation[i] = "APROVADO";
			} else situation[i] = "REPROVADO";
			
		}
		
		for (String temp : alunos) {
			System.out.println("Aluno: "+alunos[cont]+" Media: "+result[cont]+
					" Situação: "+situation[cont]);
			cont++;
			
		}
	}
}
