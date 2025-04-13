package act5und7.supplier;

import java.util.HashMap;
import java.util.function.Supplier;

public class ej6 {

    public static void main(String[] args) {

        Supplier<HashMap<String, String>> crearMapa = () -> {
            HashMap<String, String> mapa = new HashMap<>();
            mapa.put("nombre", "Juan");
            mapa.put("apellido", "Pérez");
            mapa.put("ciudad", "Madrid");
            return mapa;
        };

        HashMap<String, String> miMapa = crearMapa.get();

        miMapa.forEach((clave, valor) -> System.out.println(clave + ": " + valor));
    }
}
