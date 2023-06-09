package bytebank;


public class CriaConta {

	public static void main(String[] args) {
		Conta contaDoJoao = new Conta();
		Conta contaDaMaria = new Conta();
		contaDoJoao.deposita(600);		
		boolean retornoDaTranferencia = contaDoJoao.transfere(150, contaDaMaria);
		
		if (retornoDaTranferencia) {
			System.out.println("Transferência Realizada com Sucesso");
		} else System.out.println("Saldo Insuficiente");
		
		System.out.println("Saldo da conta do João: R$"+contaDoJoao.saldo);
		System.out.println("Saldo da conta da Maria: R$"+contaDaMaria.saldo);

	}

}
