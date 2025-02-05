package intermodular;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

//lucia mendiola

public class mainResena {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Resena> resenas = new ArrayList<>();

        boolean fin = false;
        while (!fin) {
            System.out.println(" ");
            System.out.println("*** Introducción de datos de la reseña ***");

            String idResena;
            do {
                System.out.print("ID de la reseña, máximo 64 caracteres: ");
                idResena = scanner.nextLine();
            } while (idResena.length() > 64);


            int idProducto;
            do {
                System.out.print("ID del producto, solo números: ");
                idProducto = obtenerNumero(scanner);
            } while (idProducto <= 0);


            int calificacion;
            do {
                System.out.print("Calificación del 1 al 10, solo números enteros: ");
                calificacion = obtenerNumero(scanner);
            } while (calificacion < 1 || calificacion > 10);


            String contenido;
            do {
                System.out.print("Contenido de la reseña, máximo 100 caracteres: ");
                contenido = scanner.nextLine();
            } while (contenido.length() > 100);


            String fPublicacion;
            do {
                System.out.print("Fecha de publicación de la reseña en formato AAAA-MM-DD: ");
                fPublicacion = scanner.nextLine();
            } while (!esFechaValida(fPublicacion));


            int idUsuario;
            do {
                System.out.print("ID del usuario, solo números: ");
                idUsuario = obtenerNumero(scanner);
            } while (idUsuario <= 0);

            //añadir reseñas
            Resena resena = new Resena(idResena, idProducto, calificacion, contenido, fPublicacion, idUsuario);
            resenas.add(resena);
            System.out.println("Reseña añadida correctamente.");

            mostrarResenas(resenas);

            System.out.println(" ");
            System.out.print("¿Quieres añadir otra reseña más? Pulsa cualquier tecla para continuar o escribe fin para salir: ");
            String respuesta = scanner.nextLine().toLowerCase();
            if (respuesta.equals("fin")) {
                fin = true;
            }
        }

        System.out.println("*** Fin del programa ***");
    }


    //validar fecha
    private static boolean esFechaValida(String fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false);
        try {
            sdf.parse(fecha);
            return true;

        } catch (ParseException e) {
            System.out.println("Formato incorrecto, vuelve a intentarlo: ");
            return false;
        }
    }

    //idproducto, calificaion, idusuario que sean números
    private static int obtenerNumero(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.print("Tiene que ser un número, vuelve a intentarlo: ");
            }
        }
    }

    //imprimir array
    private static void mostrarResenas(ArrayList<Resena> resenas) {
        System.out.println(" ");
        System.out.println("Lista de reseñas: ");
        for (Resena r : resenas) {
            System.out.println(r);
        }
    }
}
