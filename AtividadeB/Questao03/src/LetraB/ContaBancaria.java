package LetraB;

public class ContaBancaria {

    private int numero;
    private Titular dono_conta;
    private double saldo;
    private String senha;

    public ContaBancaria(int numero, Titular dono_conta, double saldo, String senha) {
        this.numero = numero;
        this.dono_conta = dono_conta;
        this.saldo = saldo;
        this.senha = senha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Titular getDono_conta() {
        return dono_conta;
    }

    public void setDono_conta(Titular dono_conta) {
        this.dono_conta = dono_conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    public boolean validaSenha(String senha) {
        if (senha==this.senha)
            return true;
        else
            return false;
    }

    public double getSaldo(String senha) {
        if (validaSenha(senha))
            return saldo;

        return -1;
    }
}
