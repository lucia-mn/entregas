package ej3.polimorfismoPintura;

class Esfera extends Forma {

    //atributo
    protected double radio;

    //constructor
    public Esfera(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    //método
    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }


    @Override
    public String toString() {
        return "Esfera{" +
                "radio=" + radio +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
