package ej1;

public class Main {
    public static void main(String[] args) {

        // Crear objetos de las clases
        Pared pared1 = new Pared("Norte");
        Pared pared2 = new Pared("Sur");
        Pared pared3 = new Pared("Este");
        Pared pared4 = new Pared("Oeste");

        Techo techo = new Techo(3, 5);
        Cama cama = new Cama("Moderno", 2, 50, 1, 1);
        Lampara lampara = new Lampara("Vintage", true, 4);

        Habitacion habitacion = new Habitacion("Dormitorio", pared1, pared2, pared3, pared4, techo, cama, lampara);

        // Probar métodos
        System.out.println("Estilo de la lámpara: " + habitacion.getLampara().getEstilo());
        habitacion.getLampara().encender();
        habitacion.hacerLaCama();
    }
}