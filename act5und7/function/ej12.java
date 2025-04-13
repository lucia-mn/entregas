package act5und7.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class ej12 {

    public static void main(String[] args) {

        List<String> nombres = Arrays.asList("andrea", "reme", "lucia", "antonio");
        BiFunction<String, String, String> empiezaPor = (texto, condicion) -> texto.startsWith(condicion) ? texto : null;
        String condicion = "a";

        for (String palabra : nombres) {
            String resultado = empiezaPor.apply(palabra, condicion);

            if (resultado != null) {
                System.out.println(resultado);

            } else {
                System.out.println("null");
            }
        }

    }
}
