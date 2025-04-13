package act5und7.predicate;

import java.util.function.Predicate;

public class ej2 {

    public static void main(String[] args) {

        Predicate<String> l = m -> m.length() > 100 && m.length() < 300;

        String texto = "Hola mundo";
        System.out.println(l.test(texto));
    }
}
