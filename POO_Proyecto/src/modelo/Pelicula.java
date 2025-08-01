package modelo;

import java.util.ArrayList;
import java.util.List;

public class Pelicula extends ContenidoAudiovisual {
    private String director;
    private List<Actor> actores;

    public Pelicula(String titulo, int año, String director, List<Actor> actores) {
        super(titulo, año);
        this.director = director;
        this.actores = actores;
    }

    public String getDirector() {
        return director;
    }

    public List<Actor> getActores() {
        return actores;
    }

    // Método para obtener solo los nombres de los actores
    public List<String> getActoresNombres() {
        List<String> nombres = new ArrayList<>();
        for (Actor actor : actores) {
            nombres.add(actor.getNombre()); // Asegúrate que Actor tiene getNombre()
        }
        return nombres;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Película:");
        System.out.println("Título: " + getTitulo() + ", Año: " + getAño());
        System.out.println("Director: " + director);
        System.out.println("Actores:");
        for (Actor actor : actores) {
            actor.mostrarInformacion();
        }
    }
}
