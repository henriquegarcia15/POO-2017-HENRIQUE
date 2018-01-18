package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TesteArquivo {
    public static void main(String[] args) {
        try {
            metodo();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void metodo() throws java.io.FileNotFoundException{

//        try{
//            new FileInputStream("arquivo.txt");
//        } catch (java.io.FileNotFoundException e){
//            System.out.println("Não foi possível abrir o arquivo para leitura");
//        }

        new java.io.FileInputStream("arquivo.txt");
    }
}
