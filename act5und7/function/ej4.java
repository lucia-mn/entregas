package act5und7.function;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class ej4 {

    public static void main(String[] args) {

        List<String> lista = Arrays.asList("andrea", "lucia", "antonio", "reme");

        Map<String, Integer> mapa = listaMap(lista, s -> s.length());
        mapa.forEach((key, value) -> System.out.println(key + ": " + value));
    }


    //metodo
    public static Map<String, Integer> listaMap(List<String> lista, Function<String, Integer> funcion) {
        Map<String, Integer> mapa = new HashMap<>();

        for (String palabra : lista) {
            mapa.put(palabra, funcion.apply(palabra));
        }
        return mapa;
    }
}
