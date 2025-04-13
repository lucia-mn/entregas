package act5und7.supplier.ej12al14;

import java.util.Date;
import java.util.function.Function;

public class Programador {

    protected String nombre;
    protected double salario;
    protected Date fechaInicio;


    //constructor
    public Programador(String nombre, double salario, Date fechaInicio) {
        this.nombre = nombre;
        this.salario = salario;
        this.fechaInicio = fechaInicio;
    }

    //costructor2
    public Programador(String nombre) {
        this.nombre = nombre;
        this.salario = 0.0;
        this.fechaInicio = new Date();
    }


    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }


    //toString
    @Override
    public String toString() {
        return "Programador{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", fechaInicio=" + fechaInicio +
                '}';
    }
}
