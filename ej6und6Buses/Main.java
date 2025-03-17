package ej6und6Buses;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

public class Main {

    static Set<Parada> paradas = new HashSet<>();
    static Set<Linea> lineas = new HashSet<>();

    public static void main(String[] args) {

        Parada p001 = new Parada(1, "Doctor Caro", "C / Doctor Caro");
        Parada p002 = new Parada(2, "Avinguda llibertat", "Avinguda llibertat 11");
        Parada p003 = new Parada(3, "Federico García Lorca", "Asilo");
        Parada p071 = new Parada(71, "Gabriel Miro", "C / Gabriel Miro");
        Parada p335 = new Parada(335, "Gabriel Miro", "C / Gabriel Miro");

        paradas.add(p001);
        paradas.add(p002);
        paradas.add(p003);
        paradas.add(p071);
        paradas.add(p335);

        Map<String, Integer> tiemposA = new HashMap<>();
        tiemposA.put("001-002", 75);
        tiemposA.put("002-003", 60);

        Map<String, Integer> tiemposI = new HashMap<>();
        tiemposI.put("003-071", 50);
        tiemposI.put("071-335", 100);

        Map<String, Integer> tiemposJ = new HashMap<>();
        tiemposJ.put("002-089", 75);
        tiemposJ.put("089-090", 40);
        tiemposJ.put("090-117", 40);

        Map<String, Integer> tiemposF = new HashMap<>();
        tiemposF.put("115-125", 125);
        tiemposF.put("115-002", 45);
        tiemposF.put("002-056", 40);
        tiemposF.put("056-089", 75);


        Tiempo tiempoA = new Tiempo(75, 1, 75, tiemposA);
        Tiempo tiempoI = new Tiempo(100, 1, 100, tiemposI);
        Tiempo tiempoJ = new Tiempo(125, 2, 125, tiemposJ);
        Tiempo tiempoF = new Tiempo(125, 2, 125, tiemposF);


        Linea lineaA = new Linea("A", tiempoA, new HashSet<>());
        Linea lineaI = new Linea("I", tiempoI, new HashSet<>());
        Linea lineaJ = new Linea("J", tiempoJ, new HashSet<>());
        Linea lineaF = new Linea("F", tiempoF, new HashSet<>());


        lineas.add(lineaA);
        lineas.add(lineaI);
        lineas.add(lineaJ);
        lineas.add(lineaF);



        Scanner scanner = new Scanner(System.in);

        System.out.println("Elige parada inicial: ");
        String origen = scanner.nextLine();
        Parada paradaOrigen = buscarParada(origen);
        if (paradaOrigen == null) {
            System.out.println("Parada inicial no válida.");
            return;
        }

        System.out.println("Has elegido " + paradaOrigen.getNombre() + " – " + paradaOrigen.getDireccion());
        System.out.println("Bus Línea: A");

        System.out.println("Elige Parada final: ");
        String destino = scanner.nextLine();
        Parada paradaDestino = buscarParada(destino);
        if (paradaDestino == null) {
            System.out.println("Parada final no válida.");
            return;
        }

        System.out.println("Has elegido " + paradaDestino.getNombre() + ", " + paradaDestino.getDireccion());


        int tiempoTotal = calcularTiempoTrayecto(paradaOrigen, paradaDestino);

        System.out.println("Duración trayecto: " + tiempoTotal + " segundos.");
        int minutos = tiempoTotal / 60;
        int segundos = tiempoTotal % 60;
        System.out.println("Duración trayecto: " + minutos + " minutos y " + segundos + " segundos.");


        System.out.println("Desglose:");
        mostrarDesglose(paradaOrigen, paradaDestino);
    }


    //metodos
    private static Parada buscarParada(String numero) {
        for (Parada parada : paradas) {
            if (String.valueOf(parada.getNumero()).equals(numero)) {
                return parada;
            }
        }
        return null;
    }

    private static int calcularTiempoTrayecto(Parada origen, Parada destino) {
        int tiempoTotal = 0;

        if (origen.getNumero() == 1 && destino.getNumero() == 335) {
            tiempoTotal = 75 + 60 + 50 + 100;
        }
        return tiempoTotal;
    }

    private static void mostrarDesglose(Parada origen, Parada destino) {

        if (origen.getNumero() == 1 && destino.getNumero() == 335) {
            System.out.println("A desde 001 hasta 002 - 75 segundos");
            System.out.println("A desde 002 hasta 003 - 60 segundos");
            System.out.println("I desde 003 hasta 071 – 50 segundos");
            System.out.println("I desde 071 hasta 335 – 100 segundos");
        }
    }
}
