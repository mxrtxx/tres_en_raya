package tresenraya;

import java.util.Scanner;

public class Coordenada {

    private  int fila;

    protected  int columna;

    public  int getFila() {
        return fila;
    }

    public  int getColumna() {
        return columna;
    }

    public Coordenada(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public static Coordenada pedirPorTeclado() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("dime el valor de la fila");
        int filaNueva = teclado.nextInt();

        System.out.println("dime el valor de la columna");
        int columnaNueva = teclado.nextInt();

        return  new Coordenada(filaNueva,columnaNueva);
    }

    }


