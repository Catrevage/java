package com.cursojavaloiane.aula19;

public class Exercicio8 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9,0};
        int [] b = {1,2,3,4,5,6,7,8,9,0};
        int [] c = new int[10];

        for(int i = 0; i < a.length; i++) {
            c[i] = a[i]  - b[i];

        }

        for (int temp : c) {
            System.out.print(temp+" ");
        }
    }
}
