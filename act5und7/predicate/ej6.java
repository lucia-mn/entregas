package act5und7.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ej6 {

    public static void main(String[] args) {

        Predicate<Integer> entre25y30 = valor -> (valor>=25) && (valor<=30);

        List<Integer> valores = new ArrayList<>();
        valores.add(7);
        valores.add(17);
        valores.add(27);
        valores.add(107);

        valores.stream().filter(entre25y30).forEach(integer -> System.out.println(integer));
    }

}
