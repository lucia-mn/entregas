package ej1;

public class Techo {

    //atributos
    private int altua;
    private int color;


    //constructor
    public Techo(int altua, int color) {
        this.altua = altua;
        this.color = color;
    }


    //setters
    public void setAltua(int altua) {
        this.altua = altua;
    }

    public void setColor(int color) {
        this.color = color;
    }


    //getters y métodos
    public int getAltua() {
        return altua;
    }

    public int getColor() {
        return color;
    }
}