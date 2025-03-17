package ej6und6Buses;

import java.util.Set;

public class Linea {

    protected String codigo;
    protected Tiempo tiempos;
    protected Set<Parada> paradas;

    //constructor
    public Linea(String codigo, Tiempo tiempos, Set<Parada> paradas) {
        this.codigo = codigo;
        this.tiempos = tiempos;
        this.paradas = paradas;
    }

    //getters y setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Tiempo getTiempos() {
        return tiempos;
    }

    public void setTiempos(Tiempo tiempos) {
        this.tiempos = tiempos;
    }

    public Set<Parada> getParada() {
        return paradas;
    }

    public void setParada(Set<Parada> parada) {
        this.paradas = paradas;
    }

    //toString
    @Override
    public String toString() {
        return "Linea{" +
                "codigo='" + codigo + '\'' +
                ", tiempos=" + tiempos +
                ", paradas=" + paradas +
                '}';
    }
}
