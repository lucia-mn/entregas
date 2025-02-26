package heroesReino1J;

import java.util.ArrayList;

public class Asesino extends Heroe {

    protected int sigilo;

    //constructor
    public Asesino(String nombre, int nivel, int puntosVida, ArrayList<Arma> armas, int sigilo) {
        super(nombre, nivel, puntosVida, armas);
        this.sigilo = sigilo;
    }

    //getter
    public int getSigilo() {
        return sigilo;
    }

    //metodo
    public void disparar() {
        System.out.println(nombre + " acecha entre las sombras, con un total de " + sigilo + " asesinatos");
    }

}
