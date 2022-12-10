package br.com.alura.sistema;

public interface Autenticavel {
	void setSenha(int senha);
	boolean autentica(int senha);
}
