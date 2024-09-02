/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        // Crear una persona para realizar préstamos (esto se puede extender a múltiples personas)
        Persona persona = new Persona("Cayo", "Salas");

        while (!salir) {
            System.out.println();
            System.out.println("\n" + 
                                "--- BIBLIOTECA ---");
            System.out.println("\n" +
                                "1. Agregar libro");
            System.out.println("2. Mostrar catálogo");
            System.out.println("3. Prestar libro");
            System.out.println("4. Devolver libro");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    agregarLibro(biblioteca, scanner);
                    break;
                case 2:
                    if (biblioteca.estaVacio()) {
                        System.out.println("No hay libros agregados para mostrar.");
                        System.out.println("1. Agregar libro");
                        System.out.println("2. Salir");
                        System.out.print("Elige una opción: ");
                        int subopcion = scanner.nextInt();
                        scanner.nextLine();  // Limpiar el buffer
                        if (subopcion == 1) {
                            agregarLibro(biblioteca, scanner);
                        } else if (subopcion == 2) {
                            salir = true;
                            System.out.println("Saliendo...");
                        } else {
                            System.out.println("Opción inválida.");
                        }
                    } else {
                        System.out.println();
                        biblioteca.mostrarCatalogo();
                    }
                    break;
                case 3:
                System.out.println();
                    prestarLibro(biblioteca, persona, scanner);
                    break;
                case 4:
                System.out.println();
                    devolverLibro(biblioteca, persona, scanner);
                    break;
                case 5:
                    salir = true;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
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

    private static void prestarLibro(Biblioteca biblioteca, Persona persona, Scanner scanner) {
        System.out.println();
        System.out.print("Título del libro a prestar: ");
        String titulo = scanner.nextLine();
        if (biblioteca.prestarLibro(titulo, persona)) {
            System.out.println("Libro prestado con éxito a " + persona.getNombre() + " " + persona.getApellido() + ".");
        } else {
            System.out.println("No se pudo prestar el libro. Puede que ya esté prestado o no exista en el catálogo.");
        }
    }

    private static void devolverLibro(Biblioteca biblioteca, Persona persona, Scanner scanner) {
        System.out.println();
        System.out.print("Título del libro a devolver: ");
        String titulo = scanner.nextLine();
        if (biblioteca.devolverLibro(titulo, persona)) {
            System.out.println("Libro devuelto con éxito por " + persona.getNombre() + " " + persona.getApellido() + ".");
        } else {
            System.out.println("No se pudo devolver el libro. Puede que no esté prestado o no exista en el catálogo.");
        }
    }
}
*/








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
            System.out.println("3. Prestar libro");
            System.out.println("4. Devolver libro");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    agregarLibro(biblioteca, scanner);
                    break;
                case 2:
                    if (biblioteca.estaVacio()) {
                        System.out.println("No hay libros agregados para mostrar.");
                        System.out.println("1. Agregar libro");
                        System.out.println("2. Salir");
                        System.out.print("Elige una opción: ");
                        int subopcion = scanner.nextInt();
                        scanner.nextLine();  // Limpiar el buffer
                        if (subopcion == 1) {
                            agregarLibro(biblioteca, scanner);
                        } else if (subopcion == 2) {
                            salir = true;
                            System.out.println("Saliendo...");
                        } else {
                            System.out.println("Opción inválida.");
                        }
                    } else {
                        System.out.println();
                        biblioteca.mostrarCatalogo();
                    }
                    break;
                case 3:
                    System.out.println();
                    prestarLibro(biblioteca, scanner);
                    break;
                case 4:
                    System.out.println();
                    devolverLibro(biblioteca, scanner);
                    break;
                case 5:
                    salir = true;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
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

    private static void prestarLibro(Biblioteca biblioteca, Scanner scanner) {
        System.out.println();
        System.out.print("Nombre de la persona que presta el libro: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido de la persona que presta el libro: ");
        String apellido = scanner.nextLine();
        Persona persona = new Persona(nombre, apellido);  // Crear la persona en el momento

        System.out.print("Título del libro a prestar: ");
        String titulo = scanner.nextLine();
        if (biblioteca.prestarLibro(titulo, persona)) {
            System.out.println("Libro prestado con éxito a " + persona.getNombre() + " " + persona.getApellido() + ".");
        } else {
            System.out.println("No se pudo prestar el libro. Puede que ya esté prestado o no exista en el catálogo.");
        }
    }

    private static void devolverLibro(Biblioteca biblioteca, Scanner scanner) {
        System.out.println();
        System.out.print("Nombre de la persona que devuelve el libro: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido de la persona que devuelve el libro: ");
        String apellido = scanner.nextLine();
        Persona persona = new Persona(nombre, apellido);  // Crear la persona en el momento

        System.out.print("Título del libro a devolver: ");
        String titulo = scanner.nextLine();
        if (biblioteca.devolverLibro(titulo, persona)) {
            System.out.println("Libro devuelto con éxito por " + persona.getNombre() + " " + persona.getApellido() + ".");
        } else {
            System.out.println("No se pudo devolver el libro. Puede que no esté prestado o no exista en el catálogo.");
        }
    }
}
