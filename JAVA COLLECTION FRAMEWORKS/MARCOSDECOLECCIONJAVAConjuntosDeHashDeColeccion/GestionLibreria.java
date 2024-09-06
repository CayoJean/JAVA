import java.util.HashSet;
import java.util.Scanner;
import java.util.Objects;

// Clase Libro
class Libro {
    private String titulo;
    private String autor;
    private String isbn;

    // Constructor
    public Libro(String titulo, String autor, String isbn) {
        this.titulo = formatearTexto(titulo);
        this.autor = formatearTexto(autor);
        this.isbn = isbn;
    }

    // Método para formatear el texto (eliminar espacios extras y poner en minúsculas)
    private String formatearTexto(String texto) {
        return texto.trim().toLowerCase();
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    // Método equals: dos libros son iguales si tienen el mismo ISBN
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return isbn.equals(libro.isbn);
    }

    // Método hashCode: basado en el ISBN
    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    // Método toString para mostrar la información del libro
    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn;
    }
}

// Clase Librería
class Libreria {
    private HashSet<Libro> catalogo;

    // Constructor
    public Libreria() {
        this.catalogo = new HashSet<>();
    }

    // Método para agregar un libro al catálogo
    public void agregarLibro(Libro libro) {
        if (catalogo.add(libro)) {
            System.out.println("Libro agregado con éxito: " + libro.getTitulo());
        } else {
            System.out.println("El libro con ISBN " + libro.getIsbn() + " ya existe en el catálogo.");
        }
    }

    // Método para eliminar un libro del catálogo por ISBN
    public void eliminarLibro(String isbn) {
        boolean eliminado = catalogo.removeIf(libro -> libro.getIsbn().equals(isbn));
        if (eliminado) {
            System.out.println("Libro con ISBN " + isbn + " eliminado.");
        } else {
            System.out.println("No se encontró ningún libro con el ISBN " + isbn + " en el catálogo.");
        }
    }

    // Método para mostrar el catálogo de la librería
    public void mostrarCatalogo() {
        if (catalogo.isEmpty()) {
            System.out.println("El catálogo está vacío.");
        } else {
            System.out.println("Catálogo de libros:");
            for (Libro libro : catalogo) {
                System.out.println(libro);
            }
        }
    }
}

// Clase principal para gestionar el programa
public class GestionLibreria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Libreria libreria = new Libreria();
        String opcion;

        do {
            System.out.println();
            System.out.println("\n---- Actividad: Gestión de Catálogo de Librería ----");
            System.out.println();
            System.out.println("1. Agregar libro");
            System.out.println("2. Eliminar libro");
            System.out.println("3. Mostrar catálogo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                System.out.println();
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingrese el ISBN del libro: ");
                    String isbn = scanner.nextLine();

                    Libro nuevoLibro = new Libro(titulo, autor, isbn);
                    libreria.agregarLibro(nuevoLibro);
                    break;

                case "2":
                System.out.println();
                    System.out.print("Ingrese el ISBN del libro a eliminar: ");
                    String isbnEliminar = scanner.nextLine();
                    libreria.eliminarLibro(isbnEliminar);
                    break;

                case "3":
                System.out.println();
                    libreria.mostrarCatalogo();
                    break;

                case "0":
                    System.out.println("¡VUELVA PRONTO! Saliste Del Programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (!opcion.equals("0"));

        scanner.close();
    }
}
