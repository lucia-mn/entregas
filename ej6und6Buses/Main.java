package ej6und6Buses;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Map;
import java.util.Arrays;

public class Main {

    static Set<Linea> lineas = new HashSet<>();
    static Set<Parada> paradas = new HashSet<>();
    static Map<String, Integer> tiempo = new HashMap<>();

    public static void main(String[] args) {

        Parada p1 = new Parada(1, "Doctor Caro", "C/ Doctor Caro", new HashSet<>());
        Parada p2 = new Parada(2, "Parada 002", "C/ Ejemplo", new HashSet<>());
        Parada p3 = new Parada(3, "Parada 003", "C/ Ejemplo", new HashSet<>());
        Parada p4 = new Parada(4, "Parada 004", "C/ Ejemplo", new HashSet<>());
        Parada p5 = new Parada(5, "Parada 005", "C/ Ejemplo", new HashSet<>());

        paradas.add(p1);
        paradas.add(p2);
        paradas.add(p3);
        paradas.add(p4);
        paradas.add(p5);

        tiempo.put("1-2", 75);
        //tiempo.put("2-1", 75);

        tiempo.put("2-3", 60);
        //tiempo.put("3-2", 60);

        tiempo.put("3-4", 40);
        //tiempo.put("4-3", 40);

        tiempo.put("4-5", 50);
        //tiempo.put("5-4", 50);

        tiempo.put("5-1", 80);
        //tiempo.put("1-5", 80);


        Set<Parada> paradasLineaA = new HashSet<>(Arrays.asList(p1, p2, p3, p4, p5));
        Linea lineaA = new Linea("A", null, paradasLineaA);
        lineas.add(lineaA);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Solo funciona con las paradas en orden 1 - 5, no hace recorrido circular");
        System.out.print("¿En qué parada quieres iniciar el trayecto? (de la p1 a la p5): ");
        int inicio = scanner.nextInt();
        System.out.print("¿En qué parada quieres finalizar el trayecto? (de la p1 a la p5): ");
        int fin = scanner.nextInt();


        int tiempoTotal = 0;
        if (inicio < fin) {
            for (int i = inicio; i < fin; i++) {
                String ruta = i + "-" + (i + 1);
                if (tiempo.containsKey(ruta)) {
                    tiempoTotal += tiempo.get(ruta);
                }
            }
        } else if (inicio > fin) {
            System.out.println("Error, el recorrido es circular y no lineal");
        }

        int minutos = tiempoTotal/ 60;
        int segundos = tiempoTotal % 60;
        System.out.println("La duración del trayecto es de: " + tiempoTotal + " segundos, un total de: " + minutos + " minutos y " + segundos + " segundos");
    }
}
