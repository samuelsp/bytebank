package br.com.bytebank.banco.modelo;

public abstract class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	public Conta(int agencia, int numero){
		if (agencia < 0) {
			throw new IllegalArgumentException("Número de agência inválido");
		}
		
		if (numero < 0) {
			throw new IllegalArgumentException("Número da conta corrente inválido");
		}
		
		this.agencia = agencia;
		this.numero = numero;
		Conta.total++;		
	}
	
	public abstract void deposita(double valor);
	
	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Erro: Saldo insuficiente - Saldo: " + this.getSaldo() + 
					", Valor do saque: " + valor);
		}
		
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
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
