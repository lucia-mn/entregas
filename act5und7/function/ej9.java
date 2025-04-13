package act5und7.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ej9 {

    public static void main(String[] args) {

        String operacion = exponente(2, 4);
        System.out.println(operacion);
    }

    //metodo
    public static String exponente(int base, int exponente) {

        BiFunction<Integer, Integer, Double> potencia = (a, b) -> Math.pow(a, b);
        Function<Double, String> forma = resultado -> "Resultado: " + resultado;

        return forma.apply(potencia.apply(base, exponente));
    }
}
