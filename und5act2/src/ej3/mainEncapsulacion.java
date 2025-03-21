package ej3;

public class mainEncapsulacion {

    public static void main(String[] args) {

        Impresora impresora = new Impresora(true, 10, 80);

        System.out.println("Tienes un total de " + impresora.nivelTonerActual(20) + " de tóner");
        System.out.println(impresora.nivelTonerActual(110));
        System.out.println(impresora.nivelTonerActual(30));
        System.out.println("Vas a imprimir " + impresora.imprimirPaginas(53) + " páginas");

        System.out.println("Has impreso un total de " + impresora.getPaginasImpresas() + " páginas");
        
    }
}
