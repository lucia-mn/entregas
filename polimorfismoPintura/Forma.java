package polimorfismoPintura;

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



//subclases
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
}


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
}


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
        // area cilindro = 2πr2+2πrh
    }


    @Override
    public String toString() {
        return "Cilindro{" +
                "\nradio=" + radio +
                "\n, altura=" + altura +
                '}';
    }
}