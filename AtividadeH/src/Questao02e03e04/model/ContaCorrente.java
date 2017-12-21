package Questao02e03e04.model;

public class ContaCorrente extends Conta implements Tributavel{

    private double tarifa;
    private double saldo;

    public ContaCorrente() {

    }

    @Override
    public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }

    @Override
    public boolean sacar(double valor) {
        //retirar tarifa
        tarifarSaque();
        return super.sacar(valor);
    }

    @Override
    public double obterSaldoReal() {
        return 0;
    }

    private void tarifarSaque() {
        //Tarifar..
    }

    public double obterSaldo() {
        //Saldo mais limite
        return super.getSaldo();
    }

    private void tarifarDeposito() {

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
