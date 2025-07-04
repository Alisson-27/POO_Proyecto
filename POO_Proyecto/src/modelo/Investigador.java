package modelo;

public class Investigador {
    private String nombre;
    private String especialidad;

    public Investigador(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public void mostrarInformacion() {
        System.out.println("Investigador: " + nombre + ", Especialidad: " + especialidad);
    }
}
