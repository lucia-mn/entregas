package act5und7.supplier;

import java.util.function.Supplier;

public class ej5 {

    public static void main(String[] args) {

        Supplier<Double> generorandoms= () -> Math.random();
        Double numero = generorandoms.get();

        System.out.println(numero);
        System.out.println(generorandoms.get());

    }
}
