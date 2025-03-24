package ej3.polimorfismoPintura;

class Rectangulo extends Forma {

    //atributos
    protected double largo;
    protected double ancho;

    //constructor
    public Rectangulo(String nombre, double largo, double ancho) {
        super(nombre);
        this.largo = largo;
        this.ancho = ancho;
    }

    //método
    @Override
    public double area() {
        return largo * ancho;
    }


    @Override
    public String toString() {
        return "Rectangulo{" +
                "ancho=" + ancho +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
