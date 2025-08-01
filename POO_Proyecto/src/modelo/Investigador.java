package modelo;

public class Investigador {
    private String nombre;
    private String especialidad;

    public Investigador(String nombre, String especialidad) {
        this.nombre = nombre != null ? nombre : "Desconocido";
        this.especialidad = especialidad != null ? especialidad : "";
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void mostrarInformacion() {
        System.out.println("Investigador: " + nombre + (especialidad.isEmpty() ? "" : ", Especialidad: " + especialidad));
    }
}
