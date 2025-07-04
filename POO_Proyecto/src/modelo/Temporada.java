package modelo;

public class Temporada {
    private int numero;
    private int cantEpisodios;

    public Temporada(int numero, int cantEpisodios) {
        this.numero = numero;
        this.cantEpisodios = cantEpisodios;
    }

    public void mostrarInformacion() {
        System.out.println("Temporada " + numero + ", Episodios: " + cantEpisodios);
    }
}
