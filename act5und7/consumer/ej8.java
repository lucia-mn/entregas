package act5und7.consumer;

import java.util.function.BiConsumer;

public class ej8 {

    public static void main(String[] args) {

        BiConsumer<Integer, Integer> bimap = (n, s) -> System.out.println(n + s);
        bimap.accept(-9, 7);

        BiConsumer<Integer, Integer> bimap2 = (n, s) -> System.out.println(n - s);
        bimap2.accept(-9, 7);

        BiConsumer<Integer, Integer> bimap3 = (n, s) -> System.out.println(n * s);
        bimap3.accept(-9, 7);

        BiConsumer<Integer, Integer> bimap4 = (n, s) -> System.out.println(n / s);
        bimap4.accept(-9, 7);

    }
}
