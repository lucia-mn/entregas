package act5und7.function;

import java.util.function.Consumer;
import java.util.function.Function;

public class ej1 {

    public static void main(String[] args) {

        Consumer<String> mostrarString = s -> System.out.println(s);
        Function<String, Integer> extraerLongitud = t -> t.length();
        mostrarString.accept(String.valueOf(extraerLongitud.apply("Programación")));

    }
}
