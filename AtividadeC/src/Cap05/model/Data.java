package Cap05.model;

public class Data {

    public int dia;
    public int mes;
    public int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public String toString() {
        String s = dia + "/" + mes + "/" + ano;
        return s;
    }
}
