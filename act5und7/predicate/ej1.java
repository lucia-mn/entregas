package act5und7.predicate;

import java.util.function.Predicate;

public class ej1 {

    public static void main(String[] args) {

        Predicate<Integer> m = numero -> numero > 100;

        System.out.println(m.test(150));
        System.out.println(m.test(50));

    }
}
