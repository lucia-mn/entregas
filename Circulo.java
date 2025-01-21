public class Circulo {

    //atributo
    protected double radio;


    //constructor
    public Circulo(double radio) {
        if (radio >= 0.0) {
            this.radio = radio;
        } else {
            this.radio = 0.0;
        }
    }


    //getter
    public double getRadio() {
        return this.radio;
    }

    //setter
    public void setRadio(double radio) {
        if (radio >= 0.0) {
            this.radio = radio;
        } else {
            this.radio = 0.0;
        }
    }


    //método getArea
    public double getArea() {
        return this.radio * this.radio * Math.PI;
    }
}



class Cilindro extends Circulo {

    //atributo
    protected double altura;


    //constructor
    public Cilindro(double radio, double altura) {
        super(radio);
        if (altura >= 0.0) {
            this.altura = altura;
        } else {
            this.altura = 0.0;
        }
    }


    //getter
    public double getAltura() {
        return this.altura;
    }

    //setter
    public void setAltura(double altura) {
        if (altura >= 0.0) {
            this.altura = altura;
        } else {
            this.altura = 0.0;
        }
    }


    //método getVolume
    public double getVolume() {
        return super.getArea() * this.altura;
    }


    //cambiar el método getArea
    // 2⋅π⋅r2 (area base)
    // +2⋅π⋅r⋅h (area lateral)
    @Override
    public double getArea() {
        double base = 2 * super.getArea();
        double lateral = 2 * Math.PI * getRadio() * this.altura;
        return base + lateral;
    }

}