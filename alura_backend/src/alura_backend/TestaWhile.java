package alura_backend;

public class TestaWhile {

	public static void main(String[] args) {
		int contador = 0, soma = 0;
		
		
		while(contador <= 1000) {
			soma += contador;
			contador++;
		}
		
		System.out.println("A soma de 0 até 100 é: "+soma);
	}

}
