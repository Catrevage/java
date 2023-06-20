
public class ContaCorrente extends Conta {
	
	public ContaCorrente(int numero, int agencia, Cliente cliente) {
		super(numero, agencia, cliente);
	}
	
	@Override
	public boolean saca(double valor) {
		valor += 0.20;
		return super.saca(valor);
	}
}
