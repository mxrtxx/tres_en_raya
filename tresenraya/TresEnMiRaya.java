package tresenraya;

public class TresEnMiRaya {

    protected Tablero tablero;
    protected Jugador[] jugadores;
    protected Turno turno;
    protected static final char FICHA_JUG_1 = 'X';
    protected static final char FICHA_JUG_2 = 'O';

    public TresEnMiRaya() {
        this.tablero = new Tablero();
        this.jugadores = new Jugador[2];
        this.jugadores[0] = new Jugador(FICHA_JUG_1);
        this.jugadores[1] = new Jugador(FICHA_JUG_2);
        this.turno = new Turno();
    }

    public void jugar() {
        boolean seguirJugando = true;

        System.out.print("¡Hola Jugador 0! ");
        jugadores[0].putNombre();
        System.out.print("¡Hola Jugador 1! ");
        jugadores[1].putNombre();

        do {
            System.out.println("Es turno del jugador " + turno.quienToca());
            jugadores[turno.quienToca()].colocarFicha(tablero);
            turno.cambiar();
            tablero.mostrar();
            seguirJugando = !tablero.hayTresEnRaya();

        } while (seguirJugando);
    }

    public static void main(String[] args) {
        TresEnMiRaya juego = new TresEnMiRaya();
        juego.jugar();
    }
}
