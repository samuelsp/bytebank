package br.com.alura.conta;

public class CalculadorDeImposto {
	private double totalImposto;
	
	public void calcular(Tributavel t) {
		this.totalImposto += t.getValorImposto();
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}

}
