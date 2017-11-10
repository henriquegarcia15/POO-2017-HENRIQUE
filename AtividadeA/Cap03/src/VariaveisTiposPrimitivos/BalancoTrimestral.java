package VariaveisTiposPrimitivos;

public class BalancoTrimestral {
    public static void main(String[] args) {

        //Questão 01

        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;

        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

        System.out.println(gastosTrimestre);


        //Questão 02

        double mediaMensal = gastosTrimestre / 3;

        System.out.println("Valor da média mensal = "+ mediaMensal);
    }
}
