import java.util.Scanner;

public class Jugador {
    Scanner teclado= new Scanner(System.in);

    //atributos
    private String nombre;
    private char ficha;

    //Constructores

    public Jugador(String nombre, char ficha) {
        this.nombre = nombre;
        this.ficha = ficha;
    }

    public Jugador(char ficha) {
        this.ficha = ficha;
    }
    //

    public void putNombre(){
        System.out.println("Introduce el nombre del jugador:");
        this.nombre =teclado.nextLine();
    }
    public void colocarFicha (Tablero tablero){
        Coordenada nuevaCoordenada;
        do{
            System.out.println("Introduce una coordenada nueva");
            nuevaCoordenada = Coordenada.pedirPorTeclado();
        }while(!tablero.esVacia(nuevaCoordenada));
            tablero.ponFicha(ficha,nuevaCoordenada);
    }

    public void mueveFicha(Tablero tablero){
        System.out.println("Introduce los datos de la ficha que quieres mover");
            Coordenada moverFicha= Coordenada.pedirPorTeclado();
            do{
                tablero.quitaFicha(moverFicha);
                colocarFicha(tablero);
            }while((tablero.hayFicha(ficha,moverFicha)));
    }
    public void haGanado(Tablero tablero){
        System.out.println("Partida terminada, ha ganado");
        tablero.mostrar();
    }
}
