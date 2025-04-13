package act5und7.function;

import java.util.function.Consumer;
import java.util.function.Function;

public class ej2 {

    public static void main(String[] args) {

        Function<Integer, Integer> mul = x -> x * 2;
        Function co = mul.andThen(mul);
        System.out.println(co.apply(4));

    }
}
