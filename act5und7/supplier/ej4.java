package act5und7.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class ej4 {

    public static void main(String[] args) {

        Supplier<String> texto = () -> "Java es un lenguaje de programación";

        String resultado = texto.get();
        System.out.println(resultado);

    }
}
