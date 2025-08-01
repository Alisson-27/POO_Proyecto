package modelo;

public class Actor {
    private String nombre;

    public Actor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarInformacion() {
        System.out.println(" - " + nombre);
    }
}
