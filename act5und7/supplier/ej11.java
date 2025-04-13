package act5und7.supplier;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class ej11 {

    public static void main(String[] args) {

        BiConsumer<Integer, String> bimap = (n, s) -> System.out.println(n + " " + s);

        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(5, "cinco");
        mapa.put(6, "seis");
        mapa.put(7, "siete");
        mapa.put(8, "ocho");
        mapa.put(9, "nueve");

        mapa.forEach((clave, valor) -> System.out.println(clave + ": " + valor));

        Supplier<LocalDate> fecha = () -> LocalDate.now();
        System.out.println("Fecha actual: " + fecha.get());
    }
}
