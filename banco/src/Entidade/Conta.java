package Entidade;

public class Conta {
	private int numero;
	private String titular;
	private double saldo;

	// construtor para receber argumentos numero da conta e titular, já instanciando
	public Conta(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}

	// construtor para receber numero da conta e titular e deposito inicial
	public Conta(int numero, String titular, double depositoInicial) {
		this.numero = numero;
		this.titular = titular;
		deposito(depositoInicial);// chamando o metodo deposito passando o deposito inicial como argumento
	}

	// gets e sets
	public int getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	// metodos deposito e saque
	public void deposito(double valor) {
		saldo += valor;
	}

	public void saque(double valor) {
		saldo -= valor + 5.0;
	}
	public String toString() {
		return "Conta "
				+ numero
				+ ", titular: "
				+ titular
				+ ", Saldo: $ "
				+ String.format("%.2f", saldo);
}}
