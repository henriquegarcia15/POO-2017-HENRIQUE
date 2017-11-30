package Cap07.model;

public class AtualizadorDeContas {

    private double saldoTotal = 0;
    private double selic;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    public void roda(Conta c){
        System.out.println(c.getSaldo());
        c.atualiza(0.8);
        System.out.println(c.getSaldo() + this.saldoTotal);
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }
}
