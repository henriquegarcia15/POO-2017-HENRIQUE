package Questao02.model;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Pessoa titular) {
        super(titular);
    }

    @Override
    public double obterSaldoReal() {
        return obterSaldo();
    }
}
