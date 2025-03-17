package ej6und6Buses;

import java.util.Map;

public class Tiempo {

    protected int segundos;
    protected int minutos;
    protected int segundosTotales;
    Map<String, Parada> tiempo;

    //constructor
    public Tiempo(int segundos, int minutos, int segundosTotales, Map<String, Parada> tiempo) {
        this.segundos = segundos;
        this.minutos = minutos;
        this.segundosTotales = segundosTotales;
        this.tiempo = tiempo;
    }

    //getters y setters
    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundosTotales() {
        return segundosTotales;
    }

    public void setSegundosTotales(int segundosTotales) {
        this.segundosTotales = segundosTotales;
    }

    public Map<String, Parada> getTiempo() {
        return tiempo;
    }

    public void setTiempo(Map<String, Parada> tiempo) {
        this.tiempo = tiempo;
    }

    //toString
    @Override
    public String toString() {
        return "Tiempos{" +
                "segundos=" + segundos +
                ", minutos=" + minutos +
                ", segundosTotales=" + segundosTotales +
                ", tiempo=" + tiempo +
                '}';
    }
}
