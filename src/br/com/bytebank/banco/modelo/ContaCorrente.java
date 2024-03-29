package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {
	
	private static double taxa = 0.2;
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		super.saca(valor + taxa);
	}
	
	public static double getTaxa() {
		return taxa;
	}

	@Override
	public void deposita(double valor) {
		if (valor > 0) {
			super.setSaldo(valor);
		}
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}

}
