package br.com.bytebank.banco.modelo;

public interface Autenticavel {
	void setSenha(int senha);
	boolean autentica(int senha);
}
