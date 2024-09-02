// Archivo: Main.java


public class Main {
    public static void main(String[] args) {
        System.out.println();
        // Crear objetos de tipo Revista
        Revista revista1 = new Revista("Revista de Ciencia", 1, 5);
        System.out.println();
        Revista revista2 = new Revista("Revista de Historia", 2, 0);
        Revista revista3 = new Revista("Revista de Tecnología", 3, 10);

        // Probar métodos de la clase Revista
        revista1.prestar();
        revista1.devolver();
        System.out.println(revista1.obtenerInformacion());

        revista2.prestar(); // Stock agotado
        revista2.devolver();
        System.out.println(revista2.obtenerInformacion());

        revista3.prestar();
        System.out.println(revista3.obtenerInformacion());
        
        // Crear y probar otros objetos de Libro y Película si es necesario
        Libro libro = new Libro("El Gran Libro", "Autor Desconocido");
        Pelicula pelicula = new Pelicula("La Gran Película", "Director Desconocido", 120);

        libro.prestar();
        libro.devolver();
        System.out.println(libro.obtenerInformacion());

        pelicula.prestar();
        pelicula.devolver();
        System.out.println(pelicula.obtenerInformacion());


        //Comic archivo = new Comic ();




    }
}






