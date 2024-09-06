package ActividadesPracticasHashMap;

import java.util.HashMap;
import java.util.Scanner;

public class GestionCodigosPostales {

    public static void main(String[] args) {
        // Crear el HashMap para almacenar los códigos postales y ciudades
        HashMap<Integer, String> codigosPostales = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Agregar 10 ciudades con sus códigos postales
        codigosPostales.put(28001, "Madrid");
        codigosPostales.put(8001, "Barcelona");
        codigosPostales.put(41001, "Sevilla");
        codigosPostales.put(29001, "Málaga");
        codigosPostales.put(35001, "Las Palmas");
        codigosPostales.put(50001, "Zaragoza");
        codigosPostales.put(38001, "Santa Cruz de Tenerife");
        codigosPostales.put(24001, "León");
        codigosPostales.put(33001, "Oviedo");
        codigosPostales.put(46001, "Valencia");

        int opcion;

        do {
            System.out.println();
            System.out.println("\n--- Actividad: Gestión de Códigos Postales y Ciudades ---");
            System.out.println();
            System.out.println("1. Mostrar datos existentes");
            System.out.println("2. Ingresar nueva ciudad y código postal");
            System.out.println("3. Buscar ciudad por código postal");
            System.out.println("4. Eliminar tres ciudades");
            System.out.println("5. Actualizar ciudad por código postal");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Mostrar los datos existentes
                    mostrarDatos(codigosPostales);
                    break;

                case 2:
                    // Ingresar una nueva ciudad con su código postal
                    ingresarCiudad(codigosPostales, scanner);
                    break;

                case 3:
                    // Buscar ciudad por código postal
                    buscarCiudad(codigosPostales, scanner);
                    break;

                case 4:
                    // Eliminar tres ciudades por solicitud del usuario
                    eliminarCiudades(codigosPostales, scanner);
                    break;

                case 5:
                    // Actualizar ciudad por código postal
                    actualizarCiudad(codigosPostales, scanner);
                    break;

                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        } while (opcion != 6);

        scanner.close();
    }

    // Método para mostrar los datos existentes en el HashMap
    public static void mostrarDatos(HashMap<Integer, String> codigosPostales) {
        System.out.println("\nCódigos Postales y Ciudades:");
        for (Integer codigo : codigosPostales.keySet()) {
            System.out.println("Código Postal: " + codigo + ", Ciudad: " + codigosPostales.get(codigo));
        }
    }

    // Método para ingresar una nueva ciudad con su código postal
    public static void ingresarCiudad(HashMap<Integer, String> codigosPostales, Scanner scanner) {
        System.out.println();
        System.out.print("Ingresa el código postal: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consumir nueva línea
        System.out.print("Ingresa el nombre de la ciudad: ");
        String ciudad = scanner.nextLine();
        codigosPostales.put(codigo, ciudad);
        System.out.println("Ciudad agregada exitosamente.");
    }

    // Método para buscar una ciudad por código postal
    public static void buscarCiudad(HashMap<Integer, String> codigosPostales, Scanner scanner) {
        System.out.println();
        System.out.print("Ingresa el código postal a buscar: ");
        int codigo = scanner.nextInt();
        if (codigosPostales.containsKey(codigo)) {
            System.out.println("La ciudad con código postal " + codigo + " es: " + codigosPostales.get(codigo));
        } else {
            System.out.println("No se encontró una ciudad con ese código postal.");
        }
    }

    // Método para eliminar tres ciudades
    public static void eliminarCiudades(HashMap<Integer, String> codigosPostales, Scanner scanner) {
        for (int i = 0; i < 3; i++) {
            System.out.println();
            System.out.print("Ingresa el código postal de la ciudad a eliminar: ");
            int codigo = scanner.nextInt();
            if (codigosPostales.containsKey(codigo)) {
                codigosPostales.remove(codigo);
                System.out.println("Ciudad eliminada.");
            } else {
                System.out.println("No se encontró una ciudad con ese código postal.");
            }
        }
    }

    // Método para actualizar una ciudad por su código postal
    public static void actualizarCiudad(HashMap<Integer, String> codigosPostales, Scanner scanner) {
        System.out.println();
        System.out.print("Ingresa el código postal para actualizar la ciudad: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consumir nueva línea
        if (codigosPostales.containsKey(codigo)) {
            System.out.print("Ingresa el nuevo nombre de la ciudad: ");
            String nuevaCiudad = scanner.nextLine();
            codigosPostales.put(codigo, nuevaCiudad);
            System.out.println("Ciudad actualizada.");
        } else {
            System.out.println("No se encontró una ciudad con ese código postal.");
        }
    }
}
