package com.mulambank;

public class Main {
    public static void main(String[] args) {
        Conta cc;
        cc = new Conta();
        cc.setNumber(132432);
        cc.setTit("Joaquim Jose da Silva Xavier");
        cc.setSaldo(0);
        cc.Deposita(1200);
        cc.Saca(1300);
        System.out.println("O numero da conta é: "+cc.numero);
        System.out.println("O titular da conta é: "+cc.titular);
        System.out.println("O saldo da conta é: "+cc.saldo);
    }
}