package modelo;

public class VideoYouTube extends ContenidoAudiovisual {
    private String canal;
    private int vistas;

    public VideoYouTube(String titulo, int año, String canal, int vistas) {
        super(titulo, año);
        this.canal = canal;
        this.vistas = vistas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Título: " + getTitulo() + ", Año: " + getAño());
        System.out.println("Canal: " + canal);
        System.out.println("Vistas: " + vistas);
    }
}