package act5und7.predicate;

import java.util.function.Predicate;

public class ej4 {

    public static void main(String[] args) {

        Predicate<Integer> no100 = m -> m != 100;

        System.out.println(no100.test(100));
        System.out.println(no100.test(77));

    }
}
