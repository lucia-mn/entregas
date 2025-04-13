package act5und7.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class ej11 {

    public static void main(String[] args) {

        List<String> nombres = Arrays.asList("andrea", "reme", "lucia", "antonio");
        BiFunction<String, Integer, String> longitud = (texto, limite) -> texto.length() > limite ? texto : null;
        int condicion = 5;

        for (String palabra : nombres) {
            String resultado = longitud.apply(palabra, condicion);

            if (resultado != null) {
                System.out.println(resultado);

            } else {
                System.out.println("null");
            }
        }

    }
}
