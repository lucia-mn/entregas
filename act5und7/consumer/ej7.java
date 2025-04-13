package act5und7.consumer;

import java.util.function.BiConsumer;

public class ej7 {

    public static void main(String[] args) {

        BiConsumer<Integer, Integer> bimap = (n, s) -> System.out.println(n + s);
        bimap.accept(-9, 7);

    }
}
