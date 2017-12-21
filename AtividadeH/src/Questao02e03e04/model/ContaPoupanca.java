package Questao02e03e04.model;

public class ContaPoupanca extends Conta{

    public ContaPoupanca() {
        super();
    }

    @Override
    public double obterSaldoReal() {
        return getSaldo();
    }
}
