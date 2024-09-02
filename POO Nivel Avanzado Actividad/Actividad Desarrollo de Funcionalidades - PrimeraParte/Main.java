import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println();
            System.out.println("\n" +
                                "--- BIBLIOTECA ---");
            System.out.println("\n" +
                                "1. Agregar libro");
            System.out.println("2. Mostrar catálogo");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                System.out.println();
                    agregarLibro(biblioteca, scanner);
                    break;
                case 2:
                    if (biblioteca.estaVacio()) {
                        System.out.println();
                        System.out.println("No hay libros agregados para mostrar.");
                        System.out.println();
                        System.out.println("1. Agregar libro");
                        System.out.println("2. Salir");
                        System.out.print("Elige una opción: ");
                        int subopcion = scanner.nextInt();
                        scanner.nextLine();  // Limpiar el buffer
                        if (subopcion == 1) {
                            agregarLibro(biblioteca, scanner);
                        } else if (subopcion == 2) {
                            salir = true;
                            System.out.println("¡Vulve Pronto! Saliste del Programa...");
                        } else {
                            System.out.println("Opción inválida (1 - 2).");
                        }
                    } else {
                        System.out.println();
                        biblioteca.mostrarCatalogo();
                    }
                    break;
                case 3:
                    salir = true;
                    System.out.println("¡Vulve Pronto! Saliste del Programa...");
                    break;
                default:
                    System.out.println("Opción inválida (1 - 3).");
            }
        }

        scanner.close();
    }

    private static void agregarLibro(Biblioteca biblioteca, Scanner scanner) {
        System.out.println();
        System.out.print("Título del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor del libro: ");
        String autor = scanner.nextLine();
        System.out.print("Número de páginas: ");
        int numeroDePaginas = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer

        Libro libro = new Libro(titulo, autor, numeroDePaginas);
        biblioteca.agregarLibro(libro);
        System.out.println("Libro agregado con éxito.");
    }
}
