package br.com.alura.banco.model;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(int numero, int agencia, Cliente cliente) {
		super(numero, agencia, cliente);
	}
	
	@Override
	public void saca(double valor) {
		valor += 0.20;
		super.saca(valor);
	}
	
	@Override
	public String toString() {
	
		return ("Conta Corrente: " + super.toString());
	}
}
