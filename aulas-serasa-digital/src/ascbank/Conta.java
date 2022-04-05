package ascbank;

public class Conta {
	
	private int agencia;
	private int numeroConta;
	private double saldo;
	private String titular;
	
	
	//=== Metodos Construtores
	public Conta() {

	}

	public Conta(int agencia, int numeroConta, String titular) { // construtor com sobrecarga
		super();
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = 0;
	}
	
	
	//=============================================
	//Métodos da classe
	
	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
		}
	}
	
	public boolean sacar (double valor) {
		if (valor > 0 && saldo >= valor) {
			saldo -= valor;
			return true;
		}
		
		return false;
	}

	
	public boolean transferir(double valor, Conta destinatario) {
		
		if (valor > 0 && saldo >= valor) {
			saldo -= valor;
			destinatario.depositar(valor);
			return true;
		}
		
		return false;
	}
	
	//=== Encapsulamento
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int conta) {
		this.numeroConta = conta;
	}

	public double getSaldo() {
		return saldo;
	}


	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}


	
	
	
}
