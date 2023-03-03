package br.com.bytebank.banco.modelo;

public class ControleBonificacao {
	
	private int soma;
	
	public void registra(Funcionario f) {
		this.soma += f.getBonificacao();		
	}
	
	public int getSoma() {
		return soma;
	}

}
