package act5und7.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ej2 {

    public static void main(String[] args) {

        System.out.println("*----- ver lista enteros -----*");
        List<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }


        Consumer<List<Integer>> verlista = lista -> System.out.println(lista);
        verlista.accept(numeros);
    }
}
