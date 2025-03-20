package polimorfismoPintura;

public class Pintura {

    //atributo
    protected double cobertura;

    //constructor
    public Pintura(double cobertura) {

        this.cobertura = cobertura;
    }

    //método
    public double cantidadPintura(Forma forma) {
        double area = forma.area();
        return area / cobertura;
    }
}
