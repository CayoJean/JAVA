/*import java.util.Arrays;
import java.util.Scanner;

public class ManipulandoOraciones {

    private static String oracion = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    crearOBorrarOracion(scanner);
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
                    devolverPalabraPorPosicion(scanner);
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
                    System.out.println("Saliste del Programa.");
                    break;
                default:
                    System.out.println("Opción Inválida. Intente Nuevamente.");
            }
        } while (opcion != 9);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println();
        System.out.println("\nMenú de Opciones:");
        if (oracion.isEmpty()) {
            System.out.println("1. Crear Oración");
        } else {
            System.out.println("1. Borrar Oración");
        }
        System.out.println("2. Cantidad de caracteres de la oración");
        System.out.println("3. Cantidad de palabras de la oración");
        System.out.println("4. Mostrar palabras ordenadas alfabéticamente");
        System.out.println("5. Ingresar un número y devolver la palabra correspondiente");
        System.out.println("6. Buscar palabra dentro de la oración");
        System.out.println("7. Modificar palabra dentro de la oración");
        System.out.println("8. Agregar contenido a la oración");
        System.out.println("9. Salir");
        System.out.print("Seleccione una Opción: ");
    }

    private static void crearOBorrarOracion(Scanner scanner) {
        if (oracion.isEmpty()) {
            System.out.print("Ingrese Una Nueva Oración: ");
            oracion = scanner.nextLine();
            System.out.println("Oración Creada Es: " + oracion);
        } else {
            oracion = "";
            System.out.println("Oración Borrada.");
        }
    }

    private static void mostrarCantidadCaracteres() {
        System.out.println("Cantidad de Caracteres en la Oración: " + oracion.length());
    }

    private static void mostrarCantidadPalabras() {
        String[] palabras = oracion.split("\\s+");
        System.out.println("Cantidad de Palabras en la Oración: " + palabras.length);
    }

    private static void mostrarPalabrasOrdenadas() {
        String[] palabras = oracion.split("\\s+");
        Arrays.sort(palabras);
        System.out.println("Palabras Ordenadas Alfabéticamente: " + String.join(", ", palabras));
    }

    private static void devolverPalabraPorPosicion(Scanner scanner) {
        System.out.print("Ingrese un Número: ");
        int numero = scanner.nextInt();
        scanner.nextLine();  // Consumir la nueva línea

        String[] palabras = oracion.split("\\s+");
        if (numero > 0 && numero <= palabras.length) {
            System.out.println("La Palabra en la Posición " + numero + " es: " + palabras[numero - 1]);
        } else {
            System.out.println("Número Inválido. Intente Nuevamente.");
        }
    }

    private static void buscarPalabra(Scanner scanner) {
        System.out.print("Ingrese la Palabra a Buscar: ");
        String palabra = scanner.nextLine();

        String[] palabras = oracion.split("\\s+");
        int posicion = -1;

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equalsIgnoreCase(palabra)) {
                posicion = i;
                break;
            }
        }

        if (posicion != -1) {
            System.out.println("Palabra Encontrada en la Posición: " + (posicion + 1));
        } else {
            System.out.println("Palabra no Encontrada.");
        }
    }

    private static void modificarPalabra(Scanner scanner) {
        System.out.print("Ingrese la Palabra a Modificar: ");
        String palabraAntigua = scanner.nextLine();

        String[] palabras = oracion.split("\\s+");
        int posicion = -1;

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equalsIgnoreCase(palabraAntigua)) {
                posicion = i;
                break;
            }
        }

        if (posicion != -1) {
            System.out.print("Ingrese la Nueva Palabra: ");
            String palabraNueva = scanner.nextLine();

            palabras[posicion] = palabraNueva;
            oracion = String.join(" ", palabras);
            System.out.println("Oración Modificada: " + oracion);
        } else {
            System.out.println("Palabra no Encontrada. Intente Nuevamente.");
        }
    }

    private static void agregarContenido(Scanner scanner) {
        System.out.print("Ingrese el Contenido a Agregar: ");
        String contenido = scanner.nextLine();

        oracion = oracion + " " + contenido;
        System.out.println("Oración Actualizada: " + oracion);
    }
}

*/





















import java.util.Arrays;
import java.util.Scanner;

public class ManipulandoOracioness {

    private static String oracion = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenuInicial();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    crearOracion(scanner);
                    break;
                case 2:
                    System.out.println("Salisté del Programa.");
                    break;
                default:
                    System.out.println("Opción Inválida. Intente Nuevamente.");
            }
        } while (opcion != 2 && oracion.isEmpty());

        while (!oracion.isEmpty()) {
            mostrarMenuCompleto();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    crearOBorrarOracion(scanner);
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
                    devolverPalabraPorPosicion(scanner);
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
                    System.out.println("Saliste del Programa.");
                    oracion = "";  // Para salir del bucle
                    break;
                default:
                    System.out.println("Opción Inválida. Intente Nuevamente.");
            }
        }

        scanner.close();
    }

    private static void mostrarMenuInicial() {
        System.out.println();
        System.out.println("\nMenú de Opciones:");
        System.out.println("1. Crear Oración");
        System.out.println("2. Salir");
        System.out.print("\n" +
                        "Seleccione una Opción: ");
    }

    private static void mostrarMenuCompleto() {
        System.out.println("\nMenú de Opciones:");
        if (oracion.isEmpty()) {
            System.out.println("1. Crear Oración");
        } else {
            System.out.println("1. Borrar Oración");
        }
        System.out.println("2. Cantidad de caracteres de la oración");
        System.out.println("3. Cantidad de palabras de la oración");
        System.out.println("4. Mostrar palabras ordenadas alfabéticamente");
        System.out.println("5. Ingresar un número y devolver la palabra correspondiente");
        System.out.println("6. Buscar palabra dentro de la oración");
        System.out.println("7. Modificar palabra dentro de la oración");
        System.out.println("8. Agregar contenido a la oración");
        System.out.println("9. Salir");
        System.out.print("\n" +
                        "Seleccione una Opción: ");
    }

    private static void crearOracion(Scanner scanner) {
        System.out.print("Ingrese o Crea Una Oración: ");
        oracion = scanner.nextLine();
        System.out.println("Oración Creada Es: " + oracion);
    }

    private static void crearOBorrarOracion(Scanner scanner) {
        if (oracion.isEmpty()) {
            System.out.print("Ingrese una nueva Oración: ");
            oracion = scanner.nextLine();
            System.out.println("Oración Creada: " + oracion);
        } else {
            oracion = "";
            System.out.println("Oración Borrada.");
        }
    }

    private static void mostrarCantidadCaracteres() {
        System.out.println("Cantidad de Caracteres en la Oración: " + oracion.length());
    }

    private static void mostrarCantidadPalabras() {
        String[] palabras = oracion.split("\\s+");
        System.out.println("Cantidad de Palabras en la Oración: " + palabras.length);
    }

    private static void mostrarPalabrasOrdenadas() {
        String[] palabras = oracion.split("\\s+");
        Arrays.sort(palabras);
        System.out.println("Palabras Ordenadas Alfabéticamente: " + String.join(", ", palabras));
    }

    private static void devolverPalabraPorPosicion(Scanner scanner) {
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        String[] palabras = oracion.split("\\s+");
        if (numero > 0 && numero <= palabras.length) {
            System.out.println("La Palabra en la Posición " + numero + " es: " + palabras[numero - 1]);
        } else {
            System.out.println("Número Inválido. Intente Nuevamente.");
        }
    }

    private static void buscarPalabra(Scanner scanner) {
        System.out.print("Ingrese la Palabra a Buscar: ");
        String palabra = scanner.nextLine();

        String[] palabras = oracion.split("\\s+");
        int posicion = -1;

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equalsIgnoreCase(palabra)) {
                posicion = i;
                break;
            }
        }

        if (posicion != -1) {
            System.out.println("Palabra Encontrada en la Posición: " + (posicion + 1));
        } else {
            System.out.println("Palabra no Encontrada.");
        }
    }

    private static void modificarPalabra(Scanner scanner) {
        System.out.print("Ingrese la Palabra a Modificar: ");
        String palabraAntigua = scanner.nextLine();

        String[] palabras = oracion.split("\\s+");
        int posicion = -1;

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equalsIgnoreCase(palabraAntigua)) {
                posicion = i;
                break;
            }
        }

        if (posicion != -1) {
            System.out.print("Ingrese la Nueva Palabra: ");
            String palabraNueva = scanner.nextLine();

            palabras[posicion] = palabraNueva;
            oracion = String.join(" ", palabras);
            System.out.println("Oración Modificada: " + oracion);
        } else {
            System.out.println("Palabra no Encontrada. Intente Nuevamente.");
        }
    }

    private static void agregarContenido(Scanner scanner) {
        System.out.print("Ingrese el Contenido a Agregar: ");
        String contenido = scanner.nextLine();

        oracion = oracion + " " + contenido;
        System.out.println("Oración Actualizada: " + oracion);
    }
}
