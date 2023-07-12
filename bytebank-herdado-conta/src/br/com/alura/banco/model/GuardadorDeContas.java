package br.com.alura.banco.model;

public class GuardadorDeContas {
	private Object[] referencias;
	private int p;
	
	public GuardadorDeContas() {
		this.referencias = new Object[10];
	}
	
	public void adiciona(Object c) {	
		this.referencias[this.p] = c;
		this.p++;

	}
	
	public void getReferencias() {
		for (Object item : this.referencias) {
			if (item != null) {
				System.out.println(item);
			} else break;
			
		}	
	}
	
	public int getP() {
		return p;
	}
	
}
