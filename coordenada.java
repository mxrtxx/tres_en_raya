import java.util.Scanner;

public class coordenada {

    private static int fila;

    protected static int columna;

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public coordenada(int fila, int columna) {
        coordenada.fila = fila;
        coordenada.columna = columna;
    }

    public static coordenada pedirPorTeclado() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("dime el valor de la fila");
        coordenada.fila = teclado.nextInt();

        System.out.println("dime el valor de la columna");
        coordenada.columna = teclado.nextInt();

        return  new coordenada (fila,columna);
    }

    }


