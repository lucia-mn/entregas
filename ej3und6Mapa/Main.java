package ej3und6Mapa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private Map<Integer, Ubicacion> ubicaciones = new HashMap<>();

    public Main() {
        ubicaciones.put(0, new Ubicacion(0, "Estás sentado en la clase de programación"));
        ubicaciones.put(1, new Ubicacion(1, "Estás en la cima de una montaña"));
        ubicaciones.put(2, new Ubicacion(2, "Estás bañándote en la playa"));
        ubicaciones.put(3, new Ubicacion(3, "Estás dentro de un edificio muy alto"));
        ubicaciones.put(4, new Ubicacion(4, "Estás de pie en un puente"));
        ubicaciones.put(5, new Ubicacion(5, "Estás en un bosque"));


        ubicaciones.get(1).addExit("N", 5);
        ubicaciones.get(1).addExit("E", 3);
        ubicaciones.get(1).addExit("S", 4);
        ubicaciones.get(1).addExit("O", 2);
        ubicaciones.get(1).addExit("Q", 0);

        ubicaciones.get(2).addExit("N", 5);
        ubicaciones.get(2).addExit("Q", 0);

        ubicaciones.get(3).addExit("O", 1);
        ubicaciones.get(3).addExit("Q", 0);

        ubicaciones.get(4).addExit("N", 1);
        ubicaciones.get(4).addExit("O", 2);
        ubicaciones.get(4).addExit("Q", 0);

        ubicaciones.get(5).addExit("S", 1);
        ubicaciones.get(5).addExit("O", 2);
        ubicaciones.get(5).addExit("Q", 0);
    }

    public void mapa() {
        System.out.println("""
                                   +==========+               ↑
                                   |          |               |
                     |-----------→ | 5.Bosque |               | N
                     |             |          |               |
                     |             +==========+               |
                     |                  ↑
                     ↓                  ↓
                +=========+        +===========+        +============+
                |         |        |           |        |            |
                | 2.Playa | ←----- | 1.Montaña | ←----→ | 3.Edificio |
                |         |        |           |        |            |
                +=========+        +===========+        +============+
                     ↑                  ↑
                     |                  ↓
                     |             +==========+
                     |             |          |
                     |------------ | 4.Puente |
                                   |          |
                                   +==========+
                """);
    }


    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        int ubicacionActual = 1;
        boolean seguir = true;

        while (seguir) {
            mapa();
            Ubicacion ubicacion = ubicaciones.get(ubicacionActual);
            System.out.println(ubicacion.getDescripcion());
            System.out.print("Puedes ir a estas ubicaciones: ");

            for (String salida : ubicacion.getExits().keySet()) {
                System.out.print(salida + " ");
            }
            System.out.println();

            String entrada = scanner.nextLine().toUpperCase();
            ubicacionActual = mover(ubicacionActual, entrada);

            if (ubicacionActual == 0) {
                System.out.println("Saliendo del juego...");
                System.out.println("Has vuelto a la clase de programación");
                seguir = false;
            }
        }
        scanner.close();
    }

    private int mover(int ubicacionActual, String direccion) {
        if (ubicaciones.get(ubicacionActual).getExits().containsKey(direccion)) {
            return ubicaciones.get(ubicacionActual).getExits().get(direccion);
        } else {
            System.out.println("No puedes ir en esa dirección");
            return ubicacionActual;
        }
    }

    public static void main(String[] args) {
        Main juego = new Main();
        juego.jugar();
    }

}
