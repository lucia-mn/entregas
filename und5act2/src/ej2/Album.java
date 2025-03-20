package ej2;

public class Album {

    private String titulo;
    private int fLanzamiento;
    private String genero;
    private double duracionTotal;


    //constructor
    public Album(String titulo, int fLanzamiento, String genero, double duracionTotal) {
        this.titulo = titulo;
        this.fLanzamiento = fLanzamiento;
        this.genero = genero;
        this.duracionTotal = duracionTotal;
    }


    //getters
    private String getTitulo() {
        return titulo;
    }

    private int getfLanzamiento() {
        return fLanzamiento;
    }

    private String getGenero() {
        return genero;
    }

    private double getDuracionTotal() {
        return duracionTotal;
    }


    //métodos
    public void lanzar() {
        System.out.println("El álbum ha sido lanzado ");
    }

    public String titulo() {
        return titulo;
    }

}
