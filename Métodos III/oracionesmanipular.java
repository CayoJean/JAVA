/*import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class oracionesmanipular {
    private static String oracion = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        while (true) {
            mostrarMenu();
            if (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.next(); // Limpiar el buffer
                continue;
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    manejarCreacionOAccion(scanner);
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
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    return; // Salir del programa
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println();
        System.out.println("\n--- Menú de opciones ---");
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

    private static void manejarCreacionOAccion(Scanner scanner) {
        if (oracion.isEmpty()) {
            System.out.print("Ingrese la oración: ");
            oracion = scanner.nextLine();
        } else {
            oracion = "";
            System.out.println("Oración borrada.");
        }
    }

    private static void mostrarCantidadCaracteres() {
        System.out.println("Cantidad de caracteres en la oración: " + oracion.length());
    }

    private static void mostrarCantidadPalabras() {
        if (oracion.isEmpty()) {
            System.out.println("La oración está vacía.");
            return;
        }
        String[] palabras = oracion.split("\\s+");
        System.out.println("Cantidad de palabras en la oración: " + palabras.length);
    }

    private static void mostrarPalabrasOrdenadas() {
        if (oracion.isEmpty()) {
            System.out.println("La oración está vacía.");
            return;
        }
        String[] palabras = oracion.split("\\s+");
        ArrayList<String> listaPalabras = new ArrayList<>();
        Collections.addAll(listaPalabras, palabras);
        Collections.sort(listaPalabras);
        System.out.println("Palabras ordenadas alfabéticamente: " + String.join(", ", listaPalabras));
    }

    private static void mostrarPalabraPorNumero(Scanner scanner) {
        if (oracion.isEmpty()) {
            System.out.println("La oración está vacía.");
            return;
        }
        String[] palabras = oracion.split("\\s+");
        System.out.print("Ingrese el número de la palabra (1 para la primera palabra): ");
        if (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
            scanner.next(); // Limpiar el buffer
            return;
        }
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        if (numero > 0 && numero <= palabras.length) {
            System.out.println("Palabra en la posición " + numero + ": " + palabras[numero - 1]);
        } else {
            System.out.println("Número inválido. Intente nuevamente.");
        }
    }

    private static void buscarPalabra(Scanner scanner) {
        if (oracion.isEmpty()) {
            System.out.println("La oración está vacía.");
            return;
        }
        System.out.print("Ingrese la palabra a buscar: ");
        String palabraBuscada = scanner.nextLine();
        String[] palabras = oracion.split("\\s+");
        boolean encontrada = false;

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equalsIgnoreCase(palabraBuscada)) {
                System.out.println("Palabra encontrada en la posición " + (i + 1));
                encontrada = true;
                break;
            }
        }
        if (!encontrada) {
            System.out.println("Palabra no encontrada.");
        }
    }

    private static void modificarPalabra(Scanner scanner) {
        if (oracion.isEmpty()) {
            System.out.println("La oración está vacía.");
            return;
        }
        System.out.print("Ingrese la palabra que desea modificar: ");
        String palabraVieja = scanner.nextLine();
        String[] palabras = oracion.split("\\s+");
        ArrayList<String> listaPalabras = new ArrayList<>();
        Collections.addAll(listaPalabras, palabras);
        
        if (!listaPalabras.contains(palabraVieja)) {
            System.out.println("Palabra no encontrada.");
            return;
        }
        
        System.out.print("Ingrese la nueva palabra: ");
        String palabraNueva = scanner.nextLine();

        // Validar que la nueva palabra solo contenga letras y espacios
        if (!palabraNueva.matches("[a-zA-Z\\s]+")) {
            System.out.println("La nueva palabra no es válida. Solo se permiten letras y espacios.");
            return;
        }
        
        // Reemplazar la palabra
        for (int i = 0; i < listaPalabras.size(); i++) {
            if (listaPalabras.get(i).equalsIgnoreCase(palabraVieja)) {
                listaPalabras.set(i, palabraNueva);
                break;
            }
        }
        oracion = String.join(" ", listaPalabras);
        System.out.println("Oración modificada: " + oracion);
    }

    private static void agregarContenido(Scanner scanner) {
        if (oracion.isEmpty()) {
            System.out.println("La oración está vacía. Cree una oración primero.");
            return;
        }
        System.out.print("Ingrese el contenido a agregar: ");
        String contenido = scanner.nextLine();
        // Validar que el contenido solo contenga letras y espacios
        if (!contenido.matches("[a-zA-Z\\s]+")) {
            System.out.println("El contenido no es válido. Solo se permiten letras y espacios.");
            return;
        }
        oracion += " " + contenido;
        System.out.println("Oración actualizada: " + oracion);
    }
}
*/



import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class oracionesmanipular {
    private static String oracion = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mostrarMenu();
            int opcion = leerOpcion(scanner);

            if (opcion == -1) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                continue;
            }

            switch (opcion) {
                case 1:
                    manejarCreacionOAccion(scanner);
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
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println();
        System.out.println("\n--- Menú de opciones ---");
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

    private static int leerOpcion(Scanner scanner) {
        if (!scanner.hasNextInt()) {
            scanner.next(); // Limpiar el buffer
            return -1;
        }
        return scanner.nextInt();
    }

    private static void manejarCreacionOAccion(Scanner scanner) {
        if (oracion.isEmpty()) {
            System.out.print("Ingrese la oración: ");
            oracion = scanner.next();
            scanner.nextLine(); // Consumir el salto de línea
        } else {
            oracion = "";
            System.out.println("Oración borrada.");
        }
    }

    private static void mostrarCantidadCaracteres() {
        System.out.println("Cantidad de caracteres en la oración: " + oracion.length());
    }

    private static void mostrarCantidadPalabras() {
        if (oracion.isEmpty()) {
            System.out.println("La oración está vacía.");
            return;
        }
        String[] palabras = oracion.split("\\s+");
        System.out.println("Cantidad de palabras en la oración: " + palabras.length);
    }

    private static void mostrarPalabrasOrdenadas() {
        if (oracion.isEmpty()) {
            System.out.println("La oración está vacía.");
            return;
        }
        String[] palabras = oracion.split("\\s+");
        ArrayList<String> listaPalabras = new ArrayList<>();
        Collections.addAll(listaPalabras, palabras);
        Collections.sort(listaPalabras);
        System.out.println("Palabras ordenadas alfabéticamente: " + String.join(", ", listaPalabras));
    }

    private static void mostrarPalabraPorNumero(Scanner scanner) {
        if (oracion.isEmpty()) {
            System.out.println("La oración está vacía.");
            return;
        }
        String[] palabras = oracion.split("\\s+");
        System.out.print("Ingrese el número de la palabra (1 para la primera palabra): ");
        int numero = leerNumero(scanner);

        if (numero > 0 && numero <= palabras.length) {
            System.out.println("Palabra en la posición " + numero + ": " + palabras[numero - 1]);
        } else {
            System.out.println("Número inválido. Intente nuevamente.");
        }
    }

    private static void buscarPalabra(Scanner scanner) {
        if (oracion.isEmpty()) {
            System.out.println("La oración está vacía.");
            return;
        }
        System.out.print("Ingrese la palabra a buscar: ");
        String palabraBuscada = scanner.nextLine();
        String[] palabras = oracion.split("\\s+");
        boolean encontrada = false;

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equalsIgnoreCase(palabraBuscada)) {
                System.out.println("Palabra encontrada en la posición " + (i + 1));
                encontrada = true;
                break;
            }
        }
        if (!encontrada) {
            System.out.println("Palabra no encontrada.");
        }
    }

    private static void modificarPalabra(Scanner scanner) {
        if (oracion.isEmpty()) {
            System.out.println("La oración está vacía.");
            return;
        }
        System.out.print("Ingrese la palabra que desea modificar: ");
        String palabraVieja = scanner.nextLine();
        String[] palabras = oracion.split("\\s+");
        ArrayList<String> listaPalabras = new ArrayList<>();
        Collections.addAll(listaPalabras, palabras);
        
        if (!listaPalabras.contains(palabraVieja)) {
            System.out.println("Palabra no encontrada.");
            return;
        }
        
        System.out.print("Ingrese la nueva palabra: ");
        String palabraNueva = scanner.nextLine();

        // Validar que la nueva palabra solo contenga letras y espacios
        if (!palabraNueva.matches("[a-zA-Z\\s]+")) {
            System.out.println("La nueva palabra no es válida. Solo se permiten letras y espacios.");
            return;
        }
        
        // Reemplazar la palabra
        for (int i = 0; i < listaPalabras.size(); i++) {
            if (listaPalabras.get(i).equalsIgnoreCase(palabraVieja)) {
                listaPalabras.set(i, palabraNueva);
                break;
            }
        }
        oracion = String.join(" ", listaPalabras);
        System.out.println("Oración modificada: " + oracion);
    }

    private static void agregarContenido(Scanner scanner) {
        if (oracion.isEmpty()) {
            System.out.println("La oración está vacía. Cree una oración primero.");
            return;
        }
        System.out.print("Ingrese el contenido a agregar: ");
        String contenido = scanner.nextLine();
        // Validar que el contenido solo contenga letras y espacios
        if (!contenido.matches("[a-zA-Z\\s]+")) {
            System.out.println("El contenido no es válido. Solo se permiten letras y espacios.");
            return;
        }
        oracion += " " + contenido;
        System.out.println("Oración actualizada: " + oracion);
    }

    private static int leerNumero(Scanner scanner) {
        if (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
            scanner.next(); // Limpiar el buffer
            return -1;
        }
        return scanner.nextInt();
    }
}
