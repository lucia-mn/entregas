package ej3.JUnit;


public class Color {

    public static String queColorSoy(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            return "desconocido";
        }

        char primeraLetra = Character.toUpperCase(nombre.charAt(0));

        if ("ABCDEF".indexOf(primeraLetra) != -1) {
            return "rojo";
        } else if ("GHIJKLM".indexOf(primeraLetra) != -1) {
            return "verde";
        } else if ("NOPQRS".indexOf(primeraLetra) != -1) {
            return "azul";
        } else if ("TUVWXYZ".indexOf(primeraLetra) != -1) {
            return "amarillo";
        }

        return "desconocido";
    }



    public static String queColorSoy2(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            return "desconocido";
        }

        char primeraLetra = Character.toUpperCase(nombre.charAt(0));

        // Verificamos si el carácter no está en el rango ASCII de A-Z
        if (primeraLetra < 'A' || primeraLetra > 'Z') {
            return "blanco";
        }

        if ("ABCDEF".indexOf(primeraLetra) != -1) {
            return "rojo";
        } else if ("GHIJKLM".indexOf(primeraLetra) != -1) {
            return "verde";
        } else if ("NOPQRS".indexOf(primeraLetra) != -1) {
            return "azul";
        } else if ("TUVWXYZ".indexOf(primeraLetra) != -1) {
            return "amarillo";
        }

        return "desconocido";
    }



}

