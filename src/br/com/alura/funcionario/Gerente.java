package br.com.alura.funcionario;

import br.com.alura.sistema.AutenticacaoUtil;
import br.com.alura.sistema.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel {
	
	AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
		
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	@Override
	public double getBonificacao() {
		return super.getSalario();
	}
}
