package act5und7.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ej3 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        Consumer<String> nombre = name -> System.out.println(name.charAt(3));
        names.add("jose");
        names.add("juan");
        names.add("pepe");
        names.add("luis");
        names.add("juan");
        names.add("lara");
        names.add("alba");
        names.add("cova");

        names.forEach(nombre);
    }
}
