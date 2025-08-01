package modelo;

import java.util.List;

public class SerieDeTV extends ContenidoAudiovisual {
    private List<Temporada> temporadas;

    public SerieDeTV(String titulo, int año, List<Temporada> temporadas) {
        super(titulo, año);
        this.temporadas = temporadas;
    }

    public List<Temporada> getTemporadas() {
        return temporadas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Serie de TV:");
        System.out.println("Título: " + getTitulo() + ", Año: " + getAño());
        System.out.println("Temporadas:");
        for (Temporada temporada : temporadas) {
            temporada.mostrarInformacion();
        }
    }
}
