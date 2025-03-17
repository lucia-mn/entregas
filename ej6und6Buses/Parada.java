package ej6und6Buses;

public class Parada {

    private int numero;
    private String nombre;
    private String direccion;

    //constructor
    public Parada(int numero, String nombre, String direccion) {
        this.numero = numero;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    //getters y setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //toString
    @Override
    public String toString() {
        return "Parada{" +
                "numero=" + numero +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
