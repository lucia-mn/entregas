package act5und7.consumer;

import java.util.function.Consumer;

public class ej1 {

    public static void main(String[] args) {

        Consumer<String> printer1 = message -> System.out.println(message);
        printer1.accept("Estoy en clase de programación”");
    }


}
