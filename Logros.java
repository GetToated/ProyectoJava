package Proyecto2024.Ahorcado;

public class Logros {
    private String logroNombre;
    private boolean verificarLogro;
    private int progresoLogro;

    public Logros( String logroNombre, boolean verificarLogro) {

        this.verificarLogro = verificarLogro;
        this.logroNombre = logroNombre;
        this.progresoLogro = 0;
    }
    public String getLogroNombre() {
        return logroNombre;
    }
    public void setLogroNombre(String logroNombre) {
        this.logroNombre = logroNombre;
    }
    public boolean getVerificarLogro() {
        return verificarLogro;
    }
    public void setVerificarLogro(boolean verificarLogro) {
        this.verificarLogro = verificarLogro;
    }
    public void capProgreso(int cantidadPuntos) {
        progresoLogro += cantidadPuntos;
        if (progresoLogro >= 100) {
            verificarLogro = true;
        }
    }
    public void reiniciarLogro() {
        progresoLogro = 0;
        verificarLogro = false;
    }
}
