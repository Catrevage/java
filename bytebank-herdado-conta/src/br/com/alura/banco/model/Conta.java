package br.com.alura.banco.model;
/**
 * Esta Classe representa uma conta
 * 
 * 
 * @author Damião Júnior
 * 
 *
 */

public abstract class Conta implements Comparable<Conta> {
	private int numero;
	private int agencia;
	private double saldo;
	private Cliente titular;
	private static int total;
	
	public Conta(int numero, int agencia, Cliente cliente) {
		this.setNumero(numero);
		this.setAgencia(agencia);
		this.setCliente(cliente);
		total++;
	}
	
	//Methods
	public void deposita(double valor) {
		this.saldo += valor;
	}
	/**
	 * Este metodo efetua um saque na conta.Ele verifica se o saldo 
	 * é menor que o saldo, caso seja ele lança uma exception do tipo 
	 * RuntimeException. 
	 * @param valor
	 */
	public void saca(double valor) {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo Insuficiente!"
		+"Valor disponível: R$"+this.saldo);			
		} else {
			this.saldo -= valor;
		
		}
		
		
	}
	
	public void transfere(double valor, Conta destino) {
			this.saca(valor);
			destino.deposita(valor);
		
	}

	public String toString() {
		return (
				"Agência: "+this.agencia+
				" Número: "+this.numero+
				" Titular: "
				+this.titular.getNome()+
				" Saldo: "+this.saldo);
	}
	
	@Override
	public boolean equals(Object ref) {
		Conta c = (Conta) ref;
		if (c.agencia == this.agencia && c.numero == this.numero && c.getCliente().getCpf() == this.getCliente().getCpf()) {
			return true;
		}
		return false;
	}
	
	@Override
	public int compareTo(Conta o) {
		return Double.compare(this.saldo, o.saldo);
	};
	
	//Getters
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public Cliente getCliente() {
		return this.titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	//Setters
	public void setNumero(int valor) {
		this.numero = valor;
	}
	
	public void setAgencia(int valor) {
		this.agencia = valor;
	}
	
	public void setCliente(Cliente valor) {
		this.titular = valor;
	}
	
		
}
