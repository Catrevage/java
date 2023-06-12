

public class Conta {
	private int numero;
	private int agencia;
	private double saldo;
	private Cliente titular;
	
	
	//Methods
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
		
		
	}
	
	public boolean transfere(double valor, Conta destino) {
			if (this.saldo >= valor) {
				this.saldo -= valor;
				destino.saldo += valor;
				return true;
			} else return false;
		
	}
	
	//Getters
	public double getSaldo() {
		return this.saldo;
	}
	
	public double getNumero() {
		return this.numero;
	}
	
	public double getAgencia() {
		return this.agencia;
	}
	
	public Cliente getCliente() {
		return this.titular;
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
