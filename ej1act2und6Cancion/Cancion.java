package linkedList.ej1act2und6Cancion;

public class Cancion {

    //atributos
    protected String titulo;
    protected double duracion;

    //constructor
    public Cancion(String titulo, double duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    //metodo
    public String getTitulo() {
        return titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    //toString
    @Override
    public String toString() {
        return "titulo: " + titulo + " duracion: " + duracion;
    }
}
