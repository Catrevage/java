
public class ContaCorrente extends Conta {
	
	public ContaCorrente(int numero, int agencia, Cliente cliente) {
		super(numero, agencia, cliente);
	}
	
	@Override
	public void saca(double valor) {
		valor += 0.20;
		super.saca(valor);
	}
}
