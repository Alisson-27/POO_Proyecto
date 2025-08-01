package modelo;

import java.io.*;
import java.util.*;

public class ArchivoManager {

    public static List<ContenidoAudiovisual> leerContenidoDesdeArchivo(String rutaArchivo) {
        List<ContenidoAudiovisual> listaContenido = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            br.readLine(); // Saltar encabezado

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",", -1);

                String tipo = datos[0];
                String titulo = datos[1];
                int año = Integer.parseInt(datos[2]);
                String campo4 = datos[3]; // Director o Tema
                String investigadorNombre = datos[4];
                String especialidad = datos[5];
                String temporadasStr = datos[6];
                String actoresStr = datos.length > 7 ? datos[7] : "";

                switch (tipo) {
                    case "Pelicula":
                        List<Actor> actores = new ArrayList<>();
                        if (!actoresStr.isEmpty()) {
                            String[] nombres = actoresStr.split(";");
                            for (String nombre : nombres) {
                                actores.add(new Actor(nombre.trim()));
                            }
                        }
                        listaContenido.add(new Pelicula(titulo, año, campo4, actores));
                        break;

                    case "Serie":
                        int numTemporadas = (!temporadasStr.isEmpty()) ? Integer.parseInt(temporadasStr) : 0;
                        List<Temporada> temporadas = new ArrayList<>();
                        for (int i = 1; i <= numTemporadas; i++) {
                            temporadas.add(new Temporada(i, 0));
                        }
                        listaContenido.add(new SerieDeTV(titulo, año, temporadas));
                        break;

                    case "Documental":
                        Investigador investigador = new Investigador(investigadorNombre, especialidad);
                        listaContenido.add(new Documental(titulo, año, campo4, investigador));
                        break;

                    default:
                        System.out.println("Tipo desconocido: " + tipo);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaContenido;
    }

    public static void guardarContenidoEnArchivo(String rutaArchivo, List<ContenidoAudiovisual> listaContenido) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {
            bw.write("Tipo,Titulo,Año,Director/Tema,Investigador,Especialidad,Temporadas,Actores");
            bw.newLine();

            for (ContenidoAudiovisual contenido : listaContenido) {
                if (contenido instanceof Pelicula peli) {
                    String actoresStr = String.join(";", peli.getActoresNombres());
                    bw.write(String.format("Pelicula,%s,%d,%s,,,,%s",
                            peli.getTitulo(), peli.getAño(), peli.getDirector(), actoresStr));
                } else if (contenido instanceof SerieDeTV serie) {
                    int temporadas = (serie.getTemporadas() != null) ? serie.getTemporadas().size() : 0;
                    bw.write(String.format("Serie,%s,%d,,,,%d,", serie.getTitulo(), serie.getAño(), temporadas));
                } else if (contenido instanceof Documental doc) {
                    String investigadorNombre = (doc.getInvestigador() != null) ? doc.getInvestigador().getNombre() : "";
                    String especialidad = (doc.getInvestigador() != null) ? doc.getInvestigador().getEspecialidad() : "";
                    bw.write(String.format("Documental,%s,%d,%s,%s,%s,,",
                            doc.getTitulo(), doc.getAño(), doc.getTema(), investigadorNombre, especialidad));
                }
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error guardando archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
