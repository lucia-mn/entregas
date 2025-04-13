package act5und7.predicate.ej11CiudadPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class mainCiudad {

    public static void main(String[] args) {

        Predicate<Ciudad> ciudad = c -> c.getNombre().startsWith("E") && c.getNumHab() > 100000;

        List <Ciudad> ciudades = new ArrayList<>();
        ciudades.add(new Ciudad("Elche", 100001));
        ciudades.add(new Ciudad("ALicante", 100089));
        ciudades.add(new Ciudad("MAdrid", 884412));
        ciudades.add(new Ciudad("Elda", 90675));

        imprimirCiudades(ciudades, ciudad);

    }

    //metodo
    public static void imprimirCiudades(List<Ciudad> ciudades, Predicate<Ciudad> ciudad) {
        for (Ciudad c : ciudades) {
            if (ciudad.test(c)) {
                System.out.println(c);
            }
        }
    }
}
