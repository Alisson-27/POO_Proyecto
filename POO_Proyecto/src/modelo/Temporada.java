package modelo;

public class Temporada {
    private int numero;
    private int duracion; // Ejemplo de campo extra

    public Temporada(int numero, int duracion) {
        this.numero = numero;
        this.duracion = duracion;
    }

    public void mostrarInformacion() {
        System.out.println("Temporada número " + numero + ", duración: " + duracion);
    }
}
