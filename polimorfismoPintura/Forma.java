package ej3.polimorfismoPintura;

public class Forma {

    //atributo
    protected String nombre;

    //constructor
    public Forma(String nombre) {
        this.nombre = nombre;
    }

    //método
    public double area() {
        return 0;
    }


    @Override
    public String toString() {
        return "Forma{" +
                "\nnombre='" + nombre + '\'' +
                '}';
    }
}
