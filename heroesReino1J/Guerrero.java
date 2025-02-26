package heroesReino1J;

import java.util.ArrayList;

public class Guerrero extends Heroe {

    protected int fuerza;

    //constructor
    public Guerrero(String nombre, int nivel, int puntosVida, ArrayList<Arma> armas, int fuerza) {
        super(nombre, nivel, puntosVida, armas);
        this.fuerza = fuerza;
    }

    //getter
    public int getFuerza() {
        return fuerza;
    }

    //metodo
    public void atacar() {
        System.out.println(nombre + " ataca con un golpe fuerte, causando " + fuerza + " puntos de daño");
    }

}
