package ej6und6Buses;

import java.util.Set;

public class Linea {

    private String codigo;
    private Tiempo tiempos;
    private Set<Parada> paradas;

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

    public Set<Parada> getParadas() {
        return paradas;
    }

    public void setParadas(Set<Parada> paradas) {
        this.paradas = paradas;
    }


    //metodos
    public int obtenerTiempoEntreParadas(String paradaOrigen, String paradaDestino) {
        // Formato "001-002"
        String clave = paradaOrigen + "-" + paradaDestino;
        if (this.tiempos.getTiempo().containsKey(clave)) {
            return this.tiempos.getTiempo().get(clave).getNumero();
        }
        return -1;
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
