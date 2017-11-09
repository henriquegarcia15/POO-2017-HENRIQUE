package LetraC;

public class Apartamento {

    private int numero;
    private int andar;
    private int metros_quadrados;
    private Proprietario dono_apartamento;

    public Apartamento(int numero, int andar, int metros_quadrados, Proprietario dono_apartamento) {
        this.numero = numero;
        this.andar = andar;
        this.metros_quadrados = metros_quadrados;
        this.dono_apartamento = dono_apartamento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getMetros_quadrados() {
        return metros_quadrados;
    }

    public void setMetros_quadrados(int metros_quadrados) {
        this.metros_quadrados = metros_quadrados;
    }

    public Proprietario getDono_apartamento() {
        return dono_apartamento;
    }

    public void setDono_apartamento(Proprietario dono_apartamento) {
        this.dono_apartamento = dono_apartamento;
    }
}
