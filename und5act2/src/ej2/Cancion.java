package ej2;

public class Cancion {

    private String titulo;
    private double duracion;
    private String album;
    private int popularidad;


    //constructor
    public Cancion(String titulo, double duracion, String album, int popularidad) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.album = album;
        this.popularidad = popularidad;
    }


    //getters
    public String getTitulo() {
        return titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    private String getAlbum() {
        return album;
    }

    public int getPopularidad() {
        return popularidad;
    }
}
