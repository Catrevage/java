

public class Conta {
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
