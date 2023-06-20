
import clientes.Cliente;
import contas.*;


public class TesteConta {

	public static void main(String[] args) {
		
		Cliente cli44567 = new Cliente(
				"Jose dos santos", 
				"333.333.333-333", 
				"Pedreiro");
				
		Conta conta44567 = new ContaCorrente(666777, 33, cli44567) ;
		
		conta44567.deposita(600);
		
		System.out.println(conta44567.getSaldo());
		
	}

}
