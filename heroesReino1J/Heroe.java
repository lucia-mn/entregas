package heroesReino1J;

import java.util.ArrayList;

public class Heroe {

    protected String nombre;
    protected int nivel;
    protected int puntosVida;
    protected ArrayList<Arma> armas;

    //constructor
    public Heroe(String nombre, int nivel, int puntosVida, ArrayList<Arma> armas) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        this.armas = armas != null ? armas : new ArrayList<>(); // Evita null
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public ArrayList<Arma> getArmas() {
        return armas;
    }


    //metodos
    public void addArma(Arma arma) {
        if (arma != null) {
            armas.add(arma);
            System.out.println(arma.getNombre() + " el arma " + nombre + " ha sido añadida al arsenal");
        }
    }

    public void eliminarArma(Arma arma) {
        if (armas.remove(arma)) {
            System.out.println(arma.getNombre() + " el arma " + nombre + " ha sido eliminada del arsenal");
        } else {
            System.out.println(nombre + " el guerrero ha perdido esta arma en una feroz batalla");
        }
    }


    //toString
    @Override
    public String toString() {
        return "Heroe{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", puntosVida=" + puntosVida +
                ", armas=" + armas +
                '}';
    }

}
