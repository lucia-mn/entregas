package act5und7.predicate;

import java.util.function.Predicate;

public class ej3 {

    public static void main(String[] args) {

        Predicate<Integer> mayoromenor = m -> m > 100 || m < 50;

        System.out.println(mayoromenor.test(120));
        System.out.println(mayoromenor.test(12));
    }
}
