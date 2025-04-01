package lecturaEscrituraAjedrez;

import java.io.*;
import java.util.*;

public class Ajedrez {
    public static void main(String[] args) {

        File j = new File("lecturaEscrituraAjedrez/jugadoresAjedrez.txt");
        File ja = new File("lecturaEscrituraAjedrez/jugadoresAlojamiento.txt");

        try {
            Scanner entrada = new Scanner(j);
            List<String> jugadoresAlojamiento = new ArrayList<>();

            while (entrada.hasNextLine()) {
                String linea = entrada.nextLine();
                String[] datos = linea.split(";");

                if (datos[7].contains("H")) {
                    String ranking = datos[0];
                    String nombre = datos[2];
                    jugadoresAlojamiento.add(ranking + ";" + nombre);
                }
            }
            entrada.close();


            PrintWriter salida = new PrintWriter(new FileWriter(ja));
            for (String jugador : jugadoresAlojamiento) {
                salida.println(jugador + " ");
            }

            salida.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage() + "MAL");

        } catch (IOException e) {
            System.out.println(e.getMessage() + "PEOR");
        }
    }

}
