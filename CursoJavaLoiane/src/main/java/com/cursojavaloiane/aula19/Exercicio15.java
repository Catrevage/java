package com.cursojavaloiane.aula19;
public class Exercicio15 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9,0};
        int contI = 0, contP = 0;
        double percentI, percentP;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0){
                contI++;
            } else {
                contP++;
            }

        }
        percentP = (contP/10.0)*100.0;
        percentI = (contI/10.0)*100.0;
        System.out.println("O percentual de elementos ímpares é: "+percentI+"%");
        System.out.println("O percentual de elementos pares é: "+percentP+"%");
    }

}
