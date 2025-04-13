package act5und7.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ej8 {

    public static void main(String[] args) {

        Predicate<String> A5 = a -> a.startsWith("A") || a.length() == 5;

        List<String> a = new ArrayList<>();
        a.add("Hola");
        a.add("Andrea");
        a.add("lucia");
        a.add("antonio");
        a.add("estrellas");

        a.stream().filter(A5).forEach(palabra -> System.out.println(palabra));
    }
}
