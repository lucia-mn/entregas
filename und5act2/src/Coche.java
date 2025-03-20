public class Coche {

    //atributos
    protected String modelo;
    protected boolean motor;
    protected int ruedas;
    protected int cilindros;


    //constructor
    public Coche(int cilindros, String modelo) {
        this.cilindros = cilindros;
        this.motor = true;
        this.ruedas = 4;
        this.modelo = modelo;
    }


    //getters
    public String getModelo() {
        return modelo;
    }

    public boolean isMotor() {
        return motor;
    }

    public int getRuedas() {
        return ruedas;
    }

    public int getCilindros() {
        return cilindros;
    }


    //métodos
    public void arrancar() {
        System.out.println("El coche " + modelo + " está arrancando");
    }

    public void acelerar() {
        System.out.println("El coche está acelerando");
    }

    public void frenar() {
        System.out.println("El coche está frenando");
    }
}


//subclases
class Deportivo extends Coche {

    //constructor
    public Deportivo(int cilindros, String modelo) {
        super(cilindros, modelo);
    }

    @Override
    public void acelerar() {
        System.out.println("El deportivo " + getModelo() + " está acelerando");
    }
}


class SUV extends Coche {

    //constructor
    public SUV(int cilindros, String modelo) {
        super(cilindros, modelo);
    }

    @Override
    public void frenar() {
        System.out.println("El SUV " + getModelo() + " está frenando");
    }
}


class Electrico extends Coche {

    //constructor
    public Electrico(int cilindros, String modelo) {
        super(cilindros, modelo);
    }

    @Override
    public void arrancar() {
        System.out.println("El coche eléctrico " + getModelo() + " está arrancando");
    }
}
