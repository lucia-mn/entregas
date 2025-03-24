package ej3.polimorfismoPintura;

class Cilindro extends Forma {

    //atributos
    protected double radio;
    protected double altura;

    //constructor
    public Cilindro(String nombre, double radio, double altura) {
        super(nombre);
        this.radio = radio;
        this.altura = altura;
    }

    //método
    @Override
    public double area() {
        return 2 * Math.PI * Math.pow(radio, 2) + 2 * Math.PI * radio * altura;
        //area cilindro = 2πr2+2πrh
    }


    @Override
    public String toString() {
        return "Cilindro{" +
                "altura=" + altura +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}