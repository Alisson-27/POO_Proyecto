package modelo;

public abstract class ContenidoAudiovisual {
    private String titulo;
    private int año;

    public ContenidoAudiovisual(String titulo, int año) {
        this.titulo = titulo;
        this.año = año;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAño() {
        return año;
    }

    public abstract void mostrarInformacion();
}
