package ej6und6Buses;

import java.util.Set;

public class Parada {

    protected int numero;
    protected String nombre;
    protected String direccion;
    private Set<Linea> lineas;

    //constructor
    public Parada(int numero, String nombre, String direccion, Set<Linea> lineas) {
        this.numero = numero;
        this.nombre = nombre;
        this.direccion = direccion;
        this.lineas = lineas;
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

    public Set<Linea> getLineas() {
        return lineas;
    }

    public void setLineas(Set<Linea> lineas) {
        this.lineas = lineas;
    }

    //toString
    @Override
    public String toString() {
        return "Paradas{" +
                "numero=" + numero +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", lineas/ buses=" + lineas +
                '}';
    }
}
