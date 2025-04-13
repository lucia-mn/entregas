package act5und7.predicate.ej11CiudadPredicate;

public class Ciudad {

    protected String nombre;
    protected int numHab;

    //constructor
    public Ciudad(String nombre, int numHab) {
        this.nombre = nombre;
        this.numHab = numHab;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumHab() {
        return numHab;
    }

    public void setNumHab(int numHab) {
        this.numHab = numHab;
    }

    //toString
    @Override
    public String toString() {
        return "Ciudad{" +
                "nombre='" + nombre + '\'' +
                ", numHab=" + numHab +
                '}';
    }
}
