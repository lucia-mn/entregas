package ej3.JUnit;

public class Color {

    public static String queColorSoy(String nombre) {

        if (nombre == null || nombre.isEmpty()) {
            return "no existe";

        } else if (nombre.charAt(0) >= 'A' && nombre.charAt(0) <= 'F') {
            return "rojo";

        } else if (nombre.charAt(0) >= 'G' && nombre.charAt(0) <= 'M') {
            return "verde";

        } else if (nombre.charAt(0) >= 'N' && nombre.charAt(0) <= 'S') {
            return "azul";

        } else if (nombre.charAt(0) >= 'T' && nombre.charAt(0) <= 'Z') {
            return "amarillo";

        } else {
            return "blanco";
        }
    }

}
