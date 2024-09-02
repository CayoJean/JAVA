/*import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ManipulandoOraciones {
    private static String oracion = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea después de nextInt()

            switch (opcion) {
                case 1:
                    manejarCreacionBorradoOracion(scanner);
                    break;
                case 2:
                    mostrarCantidadCaracteres();
                    break;
                case 3:
                    mostrarCantidadPalabras();
                    break;
                case 4:
                    mostrarPalabrasOrdenadas();
                    break;
                case 5:
                    mostrarPalabraPorNumero(scanner);
                    break;
                case 6:
                    buscarPalabra(scanner);
                    break;
                case 7:
                    modificarPalabra(scanner);
                    break;
                case 8:
                    agregarContenido(scanner);
                    break;
                case 9:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 9);

        scanner.close();
    }

    // Método para mostrar el menú
    private static void mostrarMenu() {
        System.out.println("\n--- Menú de Opciones ---");
        if (oracion.isEmpty()) {
            System.out.println("1. Crear oración");
        } else {
            System.out.println("1. Borrar oración");
        }
        System.out.println("2. Cantidad de caracteres de la oración");
        System.out.println("3. Cantidad de palabras de la oración");
        System.out.println("4. Mostrar palabras ordenadas alfabéticamente");
        System.out.println("5. Ingresar un número y devolver la palabra correspondiente");
        System.out.println("6. Buscar palabra dentro de la oración");
        System.out.println("7. Modificar palabra dentro de la oración");
        System.out.println("8. Agregar contenido a la oración");
        System.out.println("9. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // Manejar la creación o borrado de la oración
    private static void manejarCreacionBorradoOracion(Scanner scanner) {
        if (oracion.isEmpty()) {
            System.out.print("Ingrese una oración para crear: ");
            oracion = scanner.nextLine();
        } else {
            oracion = "";
            System.out.println("La oración ha sido borrada.");
        }
    }

    // Mostrar la cantidad de caracteres de la oración
    private static void mostrarCantidadCaracteres() {
        System.out.println("Cantidad de caracteres: " + oracion.length());
    }

    // Mostrar la cantidad de palabras en la oración
    private static void mostrarCantidadPalabras() {
        String[] palabras = oracion.split("\\s+");
        System.out.println("Cantidad de palabras: " + palabras.length);
    }

    // Mostrar las palabras ordenadas alfabéticamente
    private static void mostrarPalabrasOrdenadas() {
        String[] palabras = oracion.split("\\s+");
        ArrayList<String> listaPalabras = new ArrayList<>();
        Collections.addAll(listaPalabras, palabras);
        Collections.sort(listaPalabras);
        System.out.println("Palabras ordenadas alfabéticamente:");
        for (String palabra : listaPalabras) {
            System.out.println(palabra);
        }
    }

    // Mostrar la palabra correspondiente al número ingresado
    private static void mostrarPalabraPorNumero(Scanner scanner) {
        String[] palabras = oracion.split("\\s+");
        System.out.print("Ingrese el número de la palabra (1 para la primera palabra): ");
        int numero = scanner.nextInt();
        if (numero >= 1 && numero <= palabras.length) {
            System.out.println("Palabra en la posición " + numero + ": " + palabras[numero - 1]);
        } else {
            System.out.println("Número inválido. Intente nuevamente.");
        }
    }

    // Buscar una palabra en la oración
    private static void buscarPalabra(Scanner scanner) {
        System.out.print("Ingrese la palabra a buscar: ");
        String palabraBuscada = scanner.nextLine();
        String[] palabras = oracion.split("\\s+");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equalsIgnoreCase(palabraBuscada)) {
                System.out.println("Palabra encontrada en la posición " + (i + 1));
                return;
            }
        }
        System.out.println("Palabra no encontrada.");
    }

    // Modificar una palabra en la oración
    private static void modificarPalabra(Scanner scanner) {
        System.out.print("Ingrese la palabra a modificar: ");
        String palabraOriginal = scanner.nextLine();
        String[] palabras = oracion.split("\\s+");
        boolean encontrado = false;
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equalsIgnoreCase(palabraOriginal)) {
                encontrado = true;
                System.out.print("Ingrese la nueva palabra: ");
                String nuevaPalabra = scanner.nextLine();
                palabras[i] = nuevaPalabra;
                oracion = String.join(" ", palabras);
                System.out.println("Oración modificada: " + oracion);
                return;
            }
        }
        if (!encontrado) {
            System.out.println("Palabra no encontrada.");
        }
    }

    // Agregar contenido a la oración
    private static void agregarContenido(Scanner scanner) {
        System.out.print("Ingrese el contenido a agregar: ");
        String contenido = scanner.nextLine();
        oracion += " " + contenido;
        System.out.println("Oración actualizada: " + oracion);
    }
}
*/






import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ManipulandoOraciones {
    private static String oracion = "";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea después de nextInt()

            switch (opcion) {
                case 1:
                    manejarCreacionBorradoOracion();
                    break;
                case 2:
                    mostrarCantidadCaracteres();
                    break;
                case 3:
                    mostrarCantidadPalabras();
                    break;
                case 4:
                    mostrarPalabrasOrdenadas();
                    break;
                case 5:
                    mostrarPalabraPorNumero();
                    break;
                case 6:
                    buscarPalabra();
                    break;
                case 7:
                    modificarPalabra();
                    break;
                case 8:
                    agregarContenido();
                    break;
                case 9:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 9);

        scanner.close();
    }

    // Método para mostrar el menú
    private static void mostrarMenu() {
        System.out.println("\n--- Menú de Opciones ---");
        if (oracion.isEmpty()) {
            System.out.println("1. Crear oración");
        } else {
            System.out.println("1. Borrar oración");
        }
        System.out.println("2. Cantidad de caracteres de la oración");
        System.out.println("3. Cantidad de palabras de la oración");
        System.out.println("4. Mostrar palabras ordenadas alfabéticamente");
        System.out.println("5. Ingresar un número y devolver la palabra correspondiente");
        System.out.println("6. Buscar palabra dentro de la oración");
        System.out.println("7. Modificar palabra dentro de la oración");
        System.out.println("8. Agregar contenido a la oración");
        System.out.println("9. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // Manejar la creación o borrado de la oración
    private static void manejarCreacionBorradoOracion() {
        if (oracion.isEmpty()) {
            System.out.print("Ingrese una oración para crear: ");
            oracion = scanner.nextLine();
        } else {
            oracion = "";
            System.out.println("La oración ha sido borrada.");
        }
    }

    // Mostrar la cantidad de caracteres de la oración
    private static void mostrarCantidadCaracteres() {
        System.out.println("Cantidad de caracteres: " + oracion.length());
    }

    // Mostrar la cantidad de palabras en la oración
    private static void mostrarCantidadPalabras() {
        String[] palabras = oracion.split("\\s+");
        System.out.println("Cantidad de palabras: " + palabras.length);
    }

    // Mostrar las palabras ordenadas alfabéticamente
    private static void mostrarPalabrasOrdenadas() {
        String[] palabras = oracion.split("\\s+");
        ArrayList<String> listaPalabras = new ArrayList<>();
        Collections.addAll(listaPalabras, palabras);
        Collections.sort(listaPalabras);
        System.out.println("Palabras ordenadas alfabéticamente:");
        for (String palabra : listaPalabras) {
            System.out.println(palabra);
        }
    }

    // Mostrar la palabra correspondiente al número ingresado
    private static void mostrarPalabraPorNumero() {
        String[] palabras = oracion.split("\\s+");
        System.out.print("Ingrese el número de la palabra (1 para la primera palabra): ");
        int numero = scanner.nextInt();
        if (numero >= 1 && numero <= palabras.length) {
            System.out.println("Palabra en la posición " + numero + ": " + palabras[numero - 1]);
        } else {
            System.out.println("Número inválido. Intente nuevamente.");
        }
    }

    // Buscar una palabra en la oración
    private static void buscarPalabra() {
        System.out.print("Ingrese la palabra a buscar: ");
        String palabraBuscada = scanner.nextLine();
        String[] palabras = oracion.split("\\s+");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equalsIgnoreCase(palabraBuscada)) {
                System.out.println("Palabra encontrada en la posición " + (i + 1));
                return;
            }
        }
        System.out.println("Palabra no encontrada.");
    }

    // Modificar una palabra en la oración
    private static void modificarPalabra() {
        System.out.print("Ingrese la palabra a modificar: ");
        String palabraOriginal = scanner.nextLine();
        String[] palabras = oracion.split("\\s+");
        boolean encontrado = false;
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equalsIgnoreCase(palabraOriginal)) {
                encontrado = true;
                System.out.print("Ingrese la nueva palabra: ");
                String nuevaPalabra = scanner.nextLine();
                palabras[i] = nuevaPalabra;
                oracion = String.join(" ", palabras);
                System.out.println("Oración modificada: " + oracion);
                return;
            }
        }
        if (!encontrado) {
            System.out.println("Palabra no encontrada.");
        }
    }

    // Agregar contenido a la oración
    private static void agregarContenido() {
        System.out.print("Ingrese el contenido a agregar: ");
        String contenido = scanner.nextLine();
        oracion += " " + contenido;
        System.out.println("Oración actualizada: " + oracion);
    }
}
