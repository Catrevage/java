
public class TesteConta {

	public static void main(String[] args) {
		Cliente clienteC1 = new Cliente(
				"Jorge Andrade", 
				"111.111.111-11", 
				"Marreteiro");
		
	    ContaCorrente cc = new ContaCorrente(77765, 56, clienteC1);
	    cc.deposita(300);
		
	    ContaCorrente cp = new ContaCorrente(77766, 56, clienteC1);
	    cp.deposita(300);
		
	    cc.saca(10);
	    
	    System.out.println("Saldo cc: "+cc.getSaldo());
	    System.out.println("Saldo cp: "+cp.getSaldo());
	    
	    
	}

}
