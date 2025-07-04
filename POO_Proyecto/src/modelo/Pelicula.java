package modelo;

import java.util.List;

public class Pelicula extends ContenidoAudiovisual {
    private String director;
    private List<Actor> actores;

    public Pelicula(String titulo, int año, String director, List<Actor> actores) {
        super(titulo, año);
        this.director = director;
        this.actores = actores;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Título: " + getTitulo() + ", Año: " + getAño());
        System.out.println("Director: " + director);
        System.out.println("Actores:");
        for (Actor actor : actores) {
            actor.mostrarInformacion();
        }
    }
}
