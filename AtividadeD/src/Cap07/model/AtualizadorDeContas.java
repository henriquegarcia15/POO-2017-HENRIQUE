package Cap07.model;

public class AtualizadorDeContas {

    private double saldoTotal = 0;
    private double selic;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    public void roda(Conta c){
        System.out.println("Saldo anterior: "+ c.getSaldo());
        c.atualiza(0.01);
        System.out.println("Saldo final: "+ c.getSaldo() + this.saldoTotal);
    }

    public double getSelic() {
        return selic;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }
}
