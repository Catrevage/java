package alura_backend;

public class TestaLacosEncadeados {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			for(int h = 0; h <= 10; h++) {
				System.out.println(i+" x "+h+" = "+(i*h));
			}
		}

	}

}
