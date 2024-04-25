package Proyecto2024.Ahorcado;

public class PalabraEscondida extends AhorcadoPrincipal {
    private String palabra;
    private String mostrarPalabra;
    private boolean verificarLetra;

    public PalabraEscondida(int intentos, boolean victoriaODerrota, String palabra, String mostrarPalabra, boolean verificarLetra) {
        super(intentos);
        this.palabra = palabra;
        this.mostrarPalabra = "_".repeat(palabra.length());
        this.verificarLetra = verificarLetra;
    }
    public void mostrarPalabraMetodo() {
        String palabraAMostrar = "";
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (mostrarPalabra.charAt(i) != '-') {
                palabraAMostrar += letra + " ";
            } else
                palabraAMostrar += "- ";
            }
        System.out.println("La palabra oculta era: " + palabraAMostrar);
        }

    }



