package com.mulambank;

class Conta {
    int numero;
    String titular;
    double saldo;

    int getNumber() {
        return this.numero;
    }

    String getTitular() {
        return this.titular;
    }

    double getSaldo() {
        return this.saldo;
    }
    void setNumber(int valor){
        this.numero = valor;
    }
    void setTit(String valor) {
        this.titular = valor;
    }

    void setSaldo(double valor) {
        this.saldo += valor;
    }

    void Deposita(double valor) {
        setSaldo(valor);
    }

    void Saca(double valor) {
        if (getSaldo() < valor) {
            System.out.println("Saldo insuficiente");
        } else {
            setSaldo(valor * (-1));
            System.out.println("Saque autorizado");
        }
    }


}
