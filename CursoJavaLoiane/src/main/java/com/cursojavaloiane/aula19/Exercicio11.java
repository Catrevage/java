package com.cursojavaloiane.aula19;

public class Exercicio11 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9,0};
        int cont = 0;

        for(int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                cont++;
            }
        }

        System.out.println("O vetor possui "+cont+" elementos pares.");


    }
}
