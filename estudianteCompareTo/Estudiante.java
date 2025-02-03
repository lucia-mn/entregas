package estudianteCompareTo;

public class Estudiante implements Comparable<Estudiante>{

    protected String nombre;
    protected int edad;
    protected double altura;

    //constructor
    public Estudiante(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    //compareTo
    public int compareTo(Estudiante o) {
        int resultado = 0;

        if (this.altura<o.altura) {
            resultado = 1;
        }
        else if (this.altura>o.altura) {
            resultado = -1;

        } else {
            if (this.edad<o.edad) {
                resultado = 1;
            }
            else if (this.edad>o.edad) {
                resultado = -1;
            }
            else {
                resultado = 0;
            }
        }
        return resultado;
    }

    //toString
    @Override
    public String toString() {
        return "Estudiante{" +
                "\nnombre='" + nombre + '\'' +
                ", \nedad=" + edad +
                ", \naltura=" + altura +
                '}';
    }
}
