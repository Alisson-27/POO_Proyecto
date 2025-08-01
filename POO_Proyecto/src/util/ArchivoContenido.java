package util;

import modelo.*;
import java.io.*;
import java.util.*;

public class ArchivoContenido {

    public static List<ContenidoAudiovisual> leerContenidoDesdeArchivo(String rutaArchivo) {
        List<ContenidoAudiovisual> listaContenido = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            br.readLine(); // Saltar encabezado

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                String tipo = datos[0];
                String titulo = datos[1];
                int año = Integer.parseInt(datos[2]);

                switch (tipo) {
                    case "Pelicula":
                        String director = datos[3];
                        listaContenido.add(new Pelicula(titulo, año, director, new ArrayList<>()));
                        break;
                    case "Serie":
                        listaContenido.add(new SerieDeTV(titulo, año, new ArrayList<>()));
                        break;
                    case "Documental":
                        String tema = datos[4];
                        String nombreInvestigador = datos[5];
                        Investigador inv = new Investigador(nombreInvestigador, "");
                        listaContenido.add(new Documental(titulo, año, tema, inv));
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaContenido;
    }
}

