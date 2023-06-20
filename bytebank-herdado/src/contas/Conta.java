package contas;


public abstract class Conta {
	private int numero;
	private int agencia;
	protected double saldo;
	
	public Conta(int numero, int agencia) {
		this.setNumero(numero);
		this.setAgencia(agencia);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public double getSaldo() {
		return saldo;
	}


	public abstract void deposita(double valor);
	
	
}
