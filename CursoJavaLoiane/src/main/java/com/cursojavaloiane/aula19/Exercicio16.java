package com.cursojavaloiane.aula19;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] a = new int[10];
        int low15 = 0, upper15 = 0, contB = 0, contC = 0;


        for ( int i = 0; i < a.length; i++) {
            System.out.print("Informe o valor da posição "+i+" : ");
            a[i] = input.nextInt();
            if (a[i] < 15 ) {
                low15 += a[i];
            } else if (a[i] == 15) {
                contB++;
            } else if (a[i] > 15) {
                upper15 += a[i];
                contC++;
            }

        }

        System.out.println("A soma dos valores menores que 15: "+low15);
        System.out.println("Quantidade de elementos iguais a 15: "+contB);
        System.out.println("Media dos elementos maiores que 15: "+(upper15/contC));

    }
}
