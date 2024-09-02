// Archivo: Main.java
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        // Crear objetos de tipo Revista con fecha de devolución esperada
        Revista revista1 = new Revista("Revista de Ciencia", 1, 5, LocalDate.of(2024, 8, 20), 1.5);
        System.out.println();
        Revista revista2 = new Revista("Revista de Historia", 2, 0, LocalDate.of(2024, 8, 25), 1.5);
        Revista revista3 = new Revista("Revista de Tecnología", 3, 10, LocalDate.of(2024, 8, 30), 1.5);

        // Probar métodos de la clase Revista
        revista1.prestar();
        revista1.devolver();
        System.out.println(revista1.obtenerInformacion());
        System.out.println("Multa: " + revista1.calcularMultas());

        revista2.prestar(); // Stock agotado
        revista2.devolver();
        System.out.println(revista2.obtenerInformacion());
        System.out.println("Multa: " + revista2.calcularMultas());

        revista3.prestar();
        System.out.println(revista3.obtenerInformacion());
        System.out.println("Multa: " + revista3.calcularMultas());
        
        // Crear y probar otros objetos de Película con fecha de devolución esperada
        Pelicula pelicula = new Pelicula("La Gran Película", "Director Desconocido", 120, LocalDate.of(2024, 8, 22), 2.0);

        pelicula.prestar();
        pelicula.devolver();
        System.out.println(pelicula.obtenerInformacion());
        System.out.println("Multa: " + pelicula.calcularMultas());
    }
}
