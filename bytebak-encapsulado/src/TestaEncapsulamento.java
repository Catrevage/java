
public class TestaEncapsulamento {
	public static void main(String[] args) {
		Cliente jose = new Cliente(
				"Jose dos Santos", 
				"244.244.244-24", 
				"Pirangueiro");
		
		Cliente maria = new Cliente(
				"Maria Barbosa", 
				"233.233.233-23", 
				"Merendeira");
		
		Conta contaDoJose = new Conta(77777, 56, jose);
		
		Conta contaDaMaria = new Conta(88888, 56, maria);
		
		
		System.out.println(contaDoJose.getCliente().getProfissao());
		System.out.println(Conta.getTotal());
		
	}
}
