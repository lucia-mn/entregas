package heroesReino1J;

import java.util.ArrayList;

public class Mago extends Heroe {

    protected int mana;

    //constructor
    public Mago(String nombre, int nivel, int puntosVida, ArrayList<Arma> armas, int mana) {
        super(nombre, nivel, puntosVida, armas);
        this.mana = mana;
    }

    //getter
    public int getMana() {
        return mana;
    }

    //metodo
    public void hechizar() {
        System.out.println(nombre + " hechiza con un hechizo hechizante, con " + mana + " puntos de maná");
    }

}
