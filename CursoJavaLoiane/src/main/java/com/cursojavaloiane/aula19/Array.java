package com.cursojavaloiane.aula19;



public class Array {
    public static void main(String[] args) {
        double [] temperaturas = new double[10];
        temperaturas[0] = 12;
        temperaturas[1] = 18;
        temperaturas[2] = 13;
        temperaturas[3] = 17;
        temperaturas[4] = 16;
        for (int i = 0; i < temperaturas.length; i++){
            System.out.println(temperaturas[i]);
        }

        for (double temp : temperaturas) {
            System.out.println(temp);
        }

    }
}
