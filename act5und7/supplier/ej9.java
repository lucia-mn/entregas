package act5und7.supplier;

import java.util.function.BiConsumer;

public class ej9 {
    public static void main(String[] args) {

        BiConsumer<Integer, Integer> sumar = (a, b) -> System.out.println("Sumar: " + (a + b));
        BiConsumer<Integer, Integer> restar = (a, b) -> System.out.println("Restar: " + (a - b));
        BiConsumer<Integer, Integer> multiplicar = (a, b) -> System.out.println("Multiplicar: " + (a * b));

        calculadora(-9, 7, sumar);
        calculadora(-9, 7, restar);
        calculadora(-9, 7, multiplicar);
    }

    public static void calculadora(int a, int b, BiConsumer<Integer, Integer> operation) {
        operation.accept(a, b);
    }

}
