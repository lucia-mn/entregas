package polimorfismoPintura;

public class mainPintura {

    public static void main(String[] args) {

        Pintura pintura = new Pintura(250);

        Forma esfera = new Esfera("esfera", 15);
        Forma rectangulo = new Rectangulo("rectangulo", 20, 35);
        Forma cilindro = new Cilindro("cilindro", 10, 30);

        System.out.println("La esfera necesita " + pintura.cantidadPintura(esfera) + " l de pintura");
        System.out.println("El rectángulo necesita " + pintura.cantidadPintura(rectangulo) + " l de pintura");
        System.out.println("El cilindro necesita " + pintura.cantidadPintura(cilindro) + " l de pintura");
    }
}