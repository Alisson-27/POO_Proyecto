package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void mostrarMenu() {
        System.out.println("\n--- Menú ---");
        System.out.println("1. Listar contenidos");
        System.out.println("2. Buscar contenido por título");
        System.out.println("3. Agregar contenido");
        System.out.println("4. Salir");
        System.out.print("Elija opción: ");
    }

    public static void buscarPorTitulo(List<ContenidoAudiovisual> lista, String titulo) {
        boolean encontrado = false;
        for (ContenidoAudiovisual contenido : lista) {
            if (contenido.getTitulo().equalsIgnoreCase(titulo)) {
                contenido.mostrarInformacion();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró contenido con ese título.");
        }
    }

    public static void agregarContenido(List<ContenidoAudiovisual> lista, Scanner sc) {
        System.out.print("Ingrese tipo de contenido (1=Película, 2=Documental, 3=Serie): ");
        int tipo = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese título: ");
        String titulo = sc.nextLine();

        int anio = 0;
        while (anio <= 0) {
            try {
                System.out.print("Ingrese año: ");
                anio = Integer.parseInt(sc.nextLine());
                if (anio <= 0) System.out.println("El año debe ser mayor que 0.");
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un número válido.");
            }
        }


        switch (tipo) {
            case 1: // Película
                System.out.print("Ingrese director: ");
                String director = sc.nextLine();

                List<Actor> actores = new ArrayList<>();
                System.out.print("Cuántos actores desea agregar?: ");
                int cantActores = Integer.parseInt(sc.nextLine());
                for (int i = 0; i < cantActores; i++) {
                    System.out.print("Nombre del actor " + (i + 1) + ": ");
                    String nombreActor = sc.nextLine();
                    actores.add(new Actor(nombreActor));
                }

                Pelicula pelicula = new Pelicula(titulo, anio, director, actores);
                lista.add(pelicula);
                System.out.println("Película agregada.");
                break;

            case 2: // Documental
                System.out.print("Ingrese tema: ");
                String tema = sc.nextLine();

                System.out.print("Ingrese nombre del investigador: ");
                String nombreInvestigador = sc.nextLine();

                System.out.print("Ingrese especialidad del investigador: ");
                String especialidad = sc.nextLine();

                Investigador investigador = new Investigador(nombreInvestigador, especialidad);

                Documental documental = new Documental(titulo, anio, tema, investigador);
                lista.add(documental);
                System.out.println("Documental agregado.");
                break;


            case 3: // SerieDeTV
                List<Temporada> temporadas = new ArrayList<>();
                System.out.print("Cuántas temporadas desea agregar?: ");
                int cantTemporadas = Integer.parseInt(sc.nextLine());

                for (int i = 0; i < cantTemporadas; i++) {
                    System.out.print("Número de la temporada " + (i + 1) + ": ");
                    int numTemporada = Integer.parseInt(sc.nextLine());

                    System.out.print("Duración de la temporada " + (i + 1) + ": ");
                    int duracionTemporada = Integer.parseInt(sc.nextLine());

                    temporadas.add(new Temporada(numTemporada, duracionTemporada));
                }

                SerieDeTV serie = new SerieDeTV(titulo, anio, temporadas);
                lista.add(serie);
                System.out.println("Serie de TV agregada.");
                break;



            default:
                System.out.println("Tipo no válido.");
        }
    }

    public static void main(String[] args) {
        String rutaArchivo = "src/contenidos.csv";

        // Leer contenido desde archivo CSV - asumiendo que ArchivoManager está bien implementado
        List<ContenidoAudiovisual> contenidos = ArchivoManager.leerContenidoDesdeArchivo(rutaArchivo);

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 4) {
            mostrarMenu();
            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
                continue;
            }

            switch (opcion) {
                case 1:
                    if (contenidos.isEmpty()) {
                        System.out.println("No hay contenidos para mostrar.");
                    } else {
                        for (ContenidoAudiovisual contenido : contenidos) {
                            contenido.mostrarInformacion();
                            System.out.println("-----------------------");
                        }
                    }
                    break;

                case 2:
                    System.out.print("Ingrese título para buscar: ");
                    String titulo = sc.nextLine();
                    buscarPorTitulo(contenidos, titulo);
                    break;

                case 3:
                    agregarContenido(contenidos, sc);
                    break;

                case 4:
                    System.out.println("Saliendo y guardando contenido...");
                    ArchivoManager.guardarContenidoEnArchivo("src/contenidos_guardados.csv", contenidos);
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
        sc.close();
    }
}
