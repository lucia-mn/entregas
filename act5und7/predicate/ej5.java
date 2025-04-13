package act5und7.predicate;

import java.util.function.Predicate;
import java.util.function.BiPredicate;

public class ej5 {
    public static void main(String[] args) {

        BiPredicate<String, String> sonIguales = (a, b) -> a.equals(b);

        System.out.println(sonIguales.test("lucia", "lucia"));
        System.out.println(sonIguales.test("lucia", "andrea"));


        Predicate<String> compara  = Predicate.isEqual("hola");
        System.out.println(compara.test("java"));
        System.out.println(compara.test("hola"));

    }
}

