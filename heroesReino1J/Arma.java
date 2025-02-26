package heroesReino1J;

public class Arma {

    protected String nombreArma;
    protected int danyo;

    //constructor
    public Arma(String nombreArma, int danyo) {
        this.nombreArma = nombreArma;
        this.danyo = danyo;
    }

    //getters
    public String getNombre() {
        return nombreArma;
    }

    public int getDanyo() {
        return danyo;
    }

}
