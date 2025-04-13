package act5und7.function;

import java.util.function.Function;

public class ej7 {

    public static void main(String[] args) {

        Function<Integer, String> forma = numero -> "Resultado: " + numero;
        String resultado = forma.apply(8);

        System.out.println(resultado);
    }
}

