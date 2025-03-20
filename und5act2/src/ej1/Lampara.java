package ej1;

public class Lampara {

    //atributos
    private String estilo;
    private boolean bateria;
    private int calificacion;


    //constructor
    public Lampara(String estilo, boolean bateria, int calificacion) {
        this.estilo = estilo;
        this.bateria = bateria;
        this.calificacion = calificacion;
    }


    //setters
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public void setBateria(boolean bateria) {
        this.bateria = bateria;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }


    //getters y métodos
    public void encender() {
        System.out.println("La lámpara se ha encendido");
    }

    public String getEstilo() {
        return estilo;
    }

    public boolean hayBateria() {
        return bateria;
    }

    public int getCalificacion() {
        return calificacion;
    }

}
