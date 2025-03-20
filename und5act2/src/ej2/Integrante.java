package ej2;

public class Integrante {

    private String nombre;
    private int edad;
    private String posicion;


    //constructor
    public Integrante(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }


    //getters
    private String getNombre() {
        return nombre;
    }

    private int getEdad() {
        return edad;
    }

    private String getPosicion() {
        return posicion;
    }
}
