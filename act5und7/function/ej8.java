package act5und7.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ej8 {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Double> potencia = (a, b) -> Math.pow(a, b);
        Function<Double, String> forma = resultado -> "Resultado: " + resultado;

        double numeros = potencia.apply(2, 4);
        String resultadoej8 = forma.apply(numeros);

        System.out.println(resultadoej8);
    }
}

