package alura_backend;

public class TestaFor {

	public static void main(String[] args) {
		int soma = 0;
		for (int contador = 0; contador <= 1000; contador++) {
			soma += contador;
		}
		
		System.out.println("A soma dos números é: "+soma);

	}

}
