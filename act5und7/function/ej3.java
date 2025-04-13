package act5und7.function;

import java.util.function.Consumer;
import java.util.function.Function;

public class ej3 {

    public static void main(String[] args) {

        Consumer<String> mostrarString = s -> System.out.println(s);
        Function<String, Integer> extraerLongitud = t -> t.length();

        Function<Integer, Integer> mul = x -> x * 2;
        Function co = mul.andThen(mul);

        String texto = "Programación";
        mostrarString.accept(String.valueOf(extraerLongitud.apply("Programación")));

        mostrarString.accept("Resultado: " + co.apply(extraerLongitud.apply(texto)));
    }
}
