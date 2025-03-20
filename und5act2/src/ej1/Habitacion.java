package ej1;

public class Habitacion {

    //atributos
    private String nombre;
    private Pared pared1;
    private Pared pared2;
    private Pared pared3;
    private Pared pared4;
    private Techo techo;
    private Cama cama;
    private Lampara lampara;


    //constructor
    public Habitacion(String nombre, Pared pared1, Pared pared2, Pared pared3, Pared pared4, Techo techo, Cama cama, Lampara lampara) {
        this.nombre = nombre;
        this.pared1 = pared1;
        this.pared2 = pared2;
        this.pared3 = pared3;
        this.pared4 = pared4;
        this.techo = techo;
        this.cama = cama;
        this.lampara = lampara;
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public Pared getPared1() {
        return pared1;
    }

    public Pared getPared2() {
        return pared2;
    }

    public Pared getPared3() {
        return pared3;
    }

    public Pared getPared4() {
        return pared4;
    }

    public Techo getTecho() {
        return techo;
    }


    //métodos
    public Lampara getLampara() {
        return lampara;
    }

    public void hacerLaCama() {
        System.out.println("Se está haciendo la cama...");
        cama.hacer();
    }
}
