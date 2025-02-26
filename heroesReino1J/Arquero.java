package heroesReino1J;

import java.util.ArrayList;

public class Arquero extends Heroe {

    protected int precision;

    //constructor
    public Arquero(String nombre, int nivel, int puntosVida, ArrayList<Arma> armas, int precision) {
        super(nombre, nivel, puntosVida, armas);
        this.precision = precision;
    }

    //getter
    public int getPrecision() {
        return precision;
    }

    //metodo
    public void disparar() {
        System.out.println(nombre + " dispara la flecha de su arco, con una precisión del " + precision + " %");
    }

}
