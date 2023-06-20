package contas;

import clientes.Cliente;

public class ContaPoupanca extends Conta {
	Cliente titular;
	
	public ContaPoupanca(int numero, int agencia, Cliente titular) {
		super(numero, agencia);
		this.setTitular(titular);
		
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	
	//Methods
	
	@Override
	public void deposita(double valor) {
		this.saldo += valor;
		
	}
	
	

	
	
}
