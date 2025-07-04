package modelo;

public class Documental extends ContenidoAudiovisual {
    private String tema;
    private Investigador investigador;

    public Documental(String titulo, int año, String tema, Investigador investigador) {
        super(titulo, año);
        this.tema = tema;
        this.investigador = investigador;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Título: " + getTitulo() + ", Año: " + getAño());
        System.out.println("Tema: " + tema);
        investigador.mostrarInformacion();
    }
}
