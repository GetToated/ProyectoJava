package Proyecto2024.Ahorcado;

public class Puntuacion extends AhorcadoPrincipal {
    private int mostrarPuntuacionInicio;
    private int MostrarPuntuacionFinal;
    public  Puntuacion(int intentos,  boolean victoriaODerrota, int mostrarPuntuacionInicio, int mostrarPuntuacionFinal ) {
        super(intentos);
        this.mostrarPuntuacionInicio = mostrarPuntuacionInicio;
        this.MostrarPuntuacionFinal = mostrarPuntuacionFinal;
    }
    public int getMostrarPuntuacionInicio() {
        return mostrarPuntuacionInicio;
    }
    public void setMostrarPuntuacionInicio(int mostrarPuntuacionInicio) {
        this.mostrarPuntuacionInicio = mostrarPuntuacionInicio;
    }
    public int getMostrarPuntuacionFinal() {
        return MostrarPuntuacionFinal;
    }
    public void setMostrarPuntuacionFinal(int mostrarPuntuacionFinal) {
        this.MostrarPuntuacionFinal = mostrarPuntuacionFinal;
    }

}
