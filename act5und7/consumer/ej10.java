package act5und7.consumer;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class ej10 {

    public static void main(String[] args) {

        BiConsumer<Integer, String> bimap = (n, s) -> System.out.println(n + " " + s);
        System.out.println("*--- bimap ---*");
        bimap.accept(10, "diez");

        HashMap<Integer, String > mapa = new HashMap<>();
        mapa.put(5, "cinco");
        mapa.put(6, "seis");
        mapa.put(7, "siete");
        mapa.put(8, "ocho");
        mapa.put(9, "nueve");

        System.out.println("*--- con map.get ---*");
        System.out.println(mapa.getOrDefault(5, "cinco"));
        System.out.println(mapa.get(5));

        System.out.println("*--- con forEach ---*");
        mapa.forEach((clave, valor) -> System.out.println(clave + ": " + valor));
    }
}
