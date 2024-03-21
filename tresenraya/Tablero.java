package tresenraya;

public class Tablero {
    private int filas;
    private int columnas;
    private char[][] tablero;

    public Tablero() {
        filas = 3;
        columnas = 3;
        tablero = new char[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int e = 0; e < columnas; e++) {
                tablero[i][e] = '_';
            }
        }
    }


    public void ponFicha(char ficha, Coordenada coordenada) {
        tablero[coordenada.getFila()][coordenada.getColumna()] = ficha;
    }

    public void quitaFicha(Coordenada coordenada) {
        tablero[coordenada.getFila()][coordenada.getColumna()] = '_';
    }

    public boolean esVacia(Coordenada coordenada) {
        return tablero[coordenada.getFila()][coordenada.getColumna()] == '_';
    }

    public boolean hayFicha(char ficha, Coordenada coordenada) {
        return tablero[coordenada.getFila()][coordenada.getColumna()] == ficha;
    }

    public boolean hayTresEnRaya() {
        for (int i = 0; i < filas; i++) {
            if (tablero[i][0] == tablero[i][1] && tablero[i][0] == tablero[i][2] && tablero[i][0] != '_') {
                return true;
            }
        }

        for (int i = 0; i < columnas; i++) {
            if (tablero[0][i] == tablero[1][i] && tablero[0][i] == tablero[2][i] && tablero[0][i] != '_') {
                return true;
            }
        }

        return (tablero[0][0] != '_' && tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]) ||
                (tablero[0][2] != '_' && tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0]);
    }

    public void mostrar() {
        for (int i = 0; i < filas; i++) {
            for (int e = 0; e < columnas; e++) {
                System.out.print(tablero[i][e]);
            }
            System.out.println();
        }
    }
}
