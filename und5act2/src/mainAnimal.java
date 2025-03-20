import java.util.ArrayList;

public class mainAnimal {

    public  static void conversar(ArrayList<Animal> animales) {
        for (Animal animal:animales) {
            //llamará al método correspondiente del tipo de la instancia
            animal.hablar();
        }
    }

    public static void main(String[] args) {

        //creamos la lista de tipo Animal
        ArrayList<Animal> animales=new ArrayList<>();
        //añadimos animales de los tipos descendientes
        animales.add(new Gato("Garfiel"));
        animales.add(new Perro("Laika"));
        animales.add(new Persona("Pirico"));

        conversar(animales);

    }
}
