import java.util.ArrayList;
import java.util.List;


public class Instanceof {
    public static void main(String[] args) {
        // Crear una lista de objetos de tipo Animal
        List<Animal> animales = new ArrayList<>();
        
        // Agregar objetos de las clases Perro y Gato a la lista
        animales.add(new Perro("Rex", 5, "Labrador"));
        animales.add(new Perro("Buddy", 3, "Beagle"));
        animales.add(new Perro("Max", 4, "Bulldog"));
        animales.add(new Perro("Bella", 2, "Poodle"));
        animales.add(new Perro("Charlie", 6, "Golden Retriever"));
        animales.add(new Gato("Michi", 3, "Negro"));
        animales.add(new Gato("Luna", 1, "Blanco"));
        animales.add(new Gato("Simba", 4, "Naranja"));
        animales.add(new Gato("Oliver", 5, "Gris"));
        animales.add(new Gato("Salem", 2, "Negro"));

        // Recorrer la lista de animales y usar instanceof para identificar la clase de cada objeto
        for (Animal animal : animales) {
            if (animal instanceof Perro) {
                // Cast a Perro para acceder a los métodos específicos de Perro
                Perro perro = (Perro) animal;
                System.out.println(perro.getNombre() + " es un Perro.");
                perro.comer();   // Llama al método sobrescrito en Perro
                perro.dormir();  // Llama al método sobrescrito en Perro
                perro.ladrar();  // Llama al método específico de Perro
            } else if (animal instanceof Gato) {
                // Cast a Gato para acceder a los métodos específicos de Gato
                Gato gato = (Gato) animal;
                System.out.println(gato.getNombre() + " es un Gato.");
                gato.comer();    // Llama al método sobrescrito en Gato
                gato.dormir();   // Llama al método sobrescrito en Gato
                gato.maullar();  // Llama al método específico de Gato
            }
        }
    }
}