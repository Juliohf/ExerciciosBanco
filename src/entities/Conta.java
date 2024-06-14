package entities;

public class Conta {

	private String nome;
	private int conta;
	private double deposito;
	
	
	public Conta(String nome, int conta, double deposito) {
		this.nome = nome;
		this.conta = conta;
		dep(deposito);		
	}
	
	public Conta(String nome, int conta) {
		this.nome = nome;
		this.conta = conta;	
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getConta() {
		return conta;
	}
	
	public double getDeposito() {
		return deposito;
	}
		
	public void dep(double valor) {
		this.deposito += valor;
	}
	
	public void saque(double valor) {
		this.deposito -= (valor + 5.00);
	}
	
	public String toString() {
		return "Account "
				+ conta
				+", Name: "
				+ nome
				+", Balance: $ "
				+ String.format("%.2f", deposito);
	}
}
