package Cap07.model;

public class ContaCorrente extends Conta {

    public ContaCorrente() {
    }

    public void atualiza(double taxa){
        super.atualiza(taxa * 2);
    }

    public void deposita(double valor){
        this.saldo += valor - 0.10;
    }


}
