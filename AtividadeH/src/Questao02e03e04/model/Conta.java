package Questao02e03e04.model;

public abstract class Conta {

    public int numero;
	private double saldo;
	
	public Conta() {
	}
	
	public boolean sacar(double valor){
		if (saldo >= valor){
			saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public final void depositar(double valor){
		saldo += valor;
	}
	
	public boolean transferir(double valor, Conta contaDestino) {
		if (this.sacar(valor)) {
			contaDestino.depositar(valor);
			return true;
		}else {
			return false;
		}
	}

	public abstract double obterSaldoReal();
	
	public boolean estaNegativa() {
		return this.saldo < 0;
	}
	
	public String obterSituacao() {
		return (this.estaNegativa() ? "Conta NEGATIVA" : "Conta POSITIVA") + " Saldo: "+this.getSaldo();
	}

	public double getSaldo() {
		return saldo;
	}
}