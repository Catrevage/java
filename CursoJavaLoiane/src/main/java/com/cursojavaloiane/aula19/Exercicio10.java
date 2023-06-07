package com.cursojavaloiane.aula19;

public class Exercicio10 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9,0};
        int [] b = {1,2,3,4,5,6,7,8,9,0};
        double [] c = new double[10];

        for(int i = 0; i < a.length; i++) {
            if (b[i] == 0) {
                continue;
            } else{
                c[i] = a[i] % b[i];
            }

        }

        for (double temp : c) {
            System.out.print(temp+" ");
        }
    }
}
