package act5und7.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ej9 {

    public static void main(String[] args) {

        Predicate<String> P = a -> !a.substring(0, 1).equalsIgnoreCase("P");

        List<String> a = new ArrayList<>();
        a.add("Hola");
        a.add("Andrea");
        a.add("lucia");
        a.add("antonio");
        a.add("estrellas");
        a.add("patata");

        a.stream().filter(P).forEach(palabra -> System.out.println(palabra));
    }
}
