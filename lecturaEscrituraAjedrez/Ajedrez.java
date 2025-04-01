package lecturaEscrituraAjedrez;

import java.io.*;
import java.util.*;

public class Ajedrez {
    public static void main(String[] args) {

        File j = new File("/home/lucmennah/IdeaProjects/lecturaEscritura/ajedrez/jugadoresAjedrez.txt");
        File ja = new File("/home/lucmennah/IdeaProjects/lecturaEscritura/ajedrez/jugadoresAlojamiento.txt");

        try (Scanner entrada = new Scanner(j);
             PrintWriter salida = new PrintWriter(new FileWriter(ja))) {

            List<String> jugadoresAlojamiento = new ArrayList<>();

            while (entrada.hasNextLine()) {
                String linea = entrada.nextLine();
                String[] datos = linea.split(";");


                if (datos.length >= 8 && datos[7].contains("H")) {
                    String ranking = datos[0];
                    String nombre = datos[2];
                    jugadoresAlojamiento.add(ranking + ";" + nombre);
                }
            }


            for (String jugador : jugadoresAlojamiento) {
                salida.println(jugador);
            }

        } catch (FileNotFoundException e) {
            System.out.println("error: " + e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("mal: " + e.getMessage());

        } catch (IOException e) {
            System.out.println("peor: " + e.getMessage());
        }

    }
}
