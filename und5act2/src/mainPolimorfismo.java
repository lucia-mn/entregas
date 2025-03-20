public class mainPolimorfismo {

    public static void main(String[] args) {

        Coche cocheDeportivo = new Deportivo(4, "Audi");
        Coche cocheSUV = new SUV(6, "Volswagen");
        Coche cocheElectrico = new Electrico(0, "Tesla");

        cocheDeportivo.arrancar();
        cocheDeportivo.acelerar();
        cocheDeportivo.frenar();

        cocheSUV.arrancar();
        cocheSUV.acelerar();
        cocheSUV.frenar();

        cocheElectrico.arrancar();
        cocheElectrico.acelerar();
        cocheElectrico.frenar();
    }
}
