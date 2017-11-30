package Cap07.model;

public class ContaPoupanca extends Conta {

    public ContaPoupanca() {
    }

    public void atualiza(double taxa){
        this.saldo += this.saldo * taxa * 3;
    }
}
