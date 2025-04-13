package act5und7.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ej7 {

    public static void main(String[] args) {

        Predicate<Integer> valor22 = valor -> (valor==22);

        List<Integer> valores = new ArrayList<>();
        valores.add(7);
        valores.add(17);
        valores.add(27);
        valores.add(107);
        valores.add(22);
        valores.add(22);

        valores.stream().filter(valor22).forEach(integer -> System.out.println(integer));
    }

}
