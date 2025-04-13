package act5und7.function;

import java.util.function.BiFunction;

public class ej6 {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Double> potencia = (a, b) -> Math.pow(a, b);
        double resultado = potencia.apply(2, 3);

        System.out.println("Resultado: " + resultado);
    }
}
