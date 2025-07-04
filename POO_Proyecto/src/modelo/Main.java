package modelo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Crear actores
        Actor actor1 = new Actor("Pedro Pascal", 48);
        Actor actor2 = new Actor("Emma Watson", 33);
        List<Actor> listaActores = new ArrayList<>();
        listaActores.add(actor1);
        listaActores.add(actor2);

        // Crear película
        Pelicula pelicula = new Pelicula("Aventura Épica", 2023, "Juan Pérez", listaActores);
        System.out.println("\n--- Película ---");
        pelicula.mostrarInformacion();

        // Crear temporadas para serie
        Temporada t1 = new Temporada(1, 10);
        Temporada t2 = new Temporada(2, 8);
        List<Temporada> temporadas = new ArrayList<>();
        temporadas.add(t1);
        temporadas.add(t2);

        // Crear serie
        SerieDeTV serie = new SerieDeTV("Misterios del Tiempo", 2022, temporadas);
        System.out.println("\n--- Serie de TV ---");
        serie.mostrarInformacion();

        // Crear investigador y documental
        Investigador inv = new Investigador("Laura García", "Arqueología");
        Documental doc = new Documental("Secretos del Pasado", 2024, "Historia Antigua", inv);
        System.out.println("\n--- Documental ---");
        doc.mostrarInformacion();

        // Crear cortometraje
        Cortometraje corto = new Cortometraje("Sombras del Silencio", 2021, 15, "Suspenso");
        System.out.println("\n--- Cortometraje ---");
        corto.mostrarInformacion();

        // Crear video de YouTube
        VideoYouTube video = new VideoYouTube("Tutorial Java", 2024, "Canal ProfeCode", 120000);
        System.out.println("\n--- Video de YouTube ---");
        video.mostrarInformacion();
    }
}
