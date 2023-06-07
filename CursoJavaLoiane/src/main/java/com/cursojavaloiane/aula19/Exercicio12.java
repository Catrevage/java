package com.cursojavaloiane.aula19;

public class Exercicio12 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9,0};
        int soma = 0;

        for (int i = 0; i < a.length; i++) {
            soma += a[i];
        }

        System.out.println("A soma dos elementos é: "+soma);
    }
}
