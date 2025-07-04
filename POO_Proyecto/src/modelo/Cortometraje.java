package modelo;

public class Cortometraje extends ContenidoAudiovisual {
    private int duracion; // minutos
    private String genero;

    public Cortometraje(String titulo, int año, int duracion, String genero) {
        super(titulo, año);
        this.duracion = duracion;
        this.genero = genero;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Título: " + getTitulo() + ", Año: " + getAño());
        System.out.println("Duración: " + duracion + " minutos");
        System.out.println("Género: " + genero);
    }
}
