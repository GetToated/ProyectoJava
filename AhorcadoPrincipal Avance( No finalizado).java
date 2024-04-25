package Proyecto2024.Ahorcado;
import java.util.*;
public class AhorcadoPrincipal {
    Scanner scanner = new Scanner(System.in);
    private int intentos;
    private boolean victoriaODerrota;

    public AhorcadoPrincipal(int intentos) {
        this.intentos = intentos;
        this.victoriaODerrota = false;
    }
    public int getIntentos() {
        return intentos;
    }
    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public void comienzoDelJuego() {
        String[] listaPalabras = {"Leon", "Java", "Programacion", "Logica", "Perro", "Esternocleidomastoideo"};
        Random rd = new Random();
        int randomIndice = rd.nextInt(listaPalabras.length);
        Logros logros = new Logros("Ganado Por Primera vez", false);
        Logros logros2 = new Logros("Cronometro antes de tiempo", false);
        String palabraRandom = listaPalabras[randomIndice];
        System.out.println("Este es el juego del ahorcado hecho por Lucas, Bienvenido!");
        System.out.print("Porfavor podrias introducir tu nombre? ");
        String nombreJugador = scanner.nextLine();
        System.out.print("Y su edad? ");
        int edadJugador = scanner.nextInt();
        if (edadJugador <= 5) {
            System.out.println("Usted es demasiado pequeñ@ para jugar :(");
            return;
        }
        System.out.println("Gracias " + nombreJugador + " por participar!");
        ModosDeJuego modosDeJuego = new ModosDeJuego("Clásico", "Cronometrado", 10, 7);
        String modoClasico = modosDeJuego.getModoClasico();
        String modoCrono = modosDeJuego.getModoCrono();
        String modoSeleccionado = modosDeJuego.eleccionModo();
        System.out.println("En este Ahorcado he diseñado dos tipos de Modos de Juego. El modo " + modoClasico + " y el modo " + modoCrono + ":\n");
        System.out.println("El modo " + modoClasico + " tiene las siguientes instrucciones.\n");
        modosDeJuego.instuccionesClasico();
        System.out.println("\nAqui estan las instrucciones del modo " + modoCrono + ":\n");
        modosDeJuego.instruccionesCrono();
        System.out.print("Porfavor introduce 1 para jugar el modo " + modoClasico + " o introduce 2 para el modo " + modoCrono + ":");
        modosDeJuego.eleccionModo();
        PalabraEscondida palabraEscondida = new PalabraEscondida(10, false, palabraRandom, "", false);
        if (modoSeleccionado.equals("Clasico")) {
            System.out.println("Has seleccionado el modo Clásico.");
        } else
            System.out.println("Has seleccionado el modo Cronometro.");
    }
}
