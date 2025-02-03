package estudianteCompareTo;
import ej4act5und5.Rectangulo;

import java.util.Arrays;

public class mainEstudiante {

    public static void main(String[] args) {
        Estudiante[] estudiantes = {

        new Estudiante("Patri", 12, 170),
        new Estudiante("Manuel", 43, 173),
        new Estudiante("Javier", 72, 189),
        new Estudiante("Alicia", 52, 168),
        new Estudiante("Alberto", 35, 189)

        };

        System.out.println("Estudiantes sin ordenar:");
        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }

        Arrays.sort(estudiantes);

        System.out.println(" ");
        System.out.println("Estudiantes ordenados por altura y luego edad:");
        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }

    }

}
