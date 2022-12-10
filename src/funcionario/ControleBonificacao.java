package funcionario;

public class ControleBonificacao {
	
	private int soma;
	
	public void registra(Funcionario f) {
		this.soma += f.getBonificacao();		
	}
	
	public int getSoma() {
		return soma;
	}

}
