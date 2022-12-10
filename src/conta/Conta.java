package conta;

import sistema.Cliente;

public abstract class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	public Conta(int agencia, int numero){
		this.agencia = agencia;
		this.numero = numero;
		Conta.total++;		
	}
	
	public abstract void deposita(double valor);
	
	public boolean saca(double valor){
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		
		return false;
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saca(valor)) {
			destino.deposita(valor);
			return true;
		}
		
		return false;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double valor) {
		if (valor > 0) {
			this.saldo += valor;			
		}
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (this.numero > 0) {
			this.numero = numero;
		}
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return Conta.total;
	}

	
}
