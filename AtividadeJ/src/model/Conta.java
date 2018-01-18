package model;

public abstract class Conta {

    protected double saldo;

    public Conta() {
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public void saca(double valor){
        if (this.saldo < valor)
            throw new IllegalArgumentException("Saldo Insuficiente");
        else {
            this.saldo -= valor;
        }
    }

    public void atualiza(double taxa){
        this.saldo += this.saldo * taxa;
    }

    public double getSaldo() {
        return saldo;
    }
}
