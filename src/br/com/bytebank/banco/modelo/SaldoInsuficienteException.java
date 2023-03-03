package br.com.bytebank.banco.modelo;

public class SaldoInsuficienteException extends Exception {
	private static final long serialVersionUID = -8361758458658255660L;

	public SaldoInsuficienteException(String msg) {
		super(msg);
	}

}
