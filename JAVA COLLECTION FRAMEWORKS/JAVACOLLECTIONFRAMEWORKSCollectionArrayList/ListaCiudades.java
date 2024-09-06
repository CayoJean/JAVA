/*import java.util.ArrayList;
import java.util.Scanner;

public class ListaCiudades {
    public static void main(String[] args) {
        // Inicializa el ArrayList para almacenar los nombres de las ciudades
        ArrayList<String> ciudades = new ArrayList<>();

        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Bucle para solicitar al usuario que ingrese nombres de ciudades
        String continuar = "si";  // Inicializa con "si" para asegurar la primera entrada
        while (continuar.equalsIgnoreCase("si") || continuar.equalsIgnoreCase("si")) {
            System.out.print("Ingresa el nombre de una ciudad: ");
            String ciudad = scanner.nextLine();

            // Agrega la ciudad a la lista
            ciudades.add(ciudad);

            // Pregunta al usuario si desea agregar otra ciudad
            System.out.print("¿Deseas agregar otra ciudad? (si/no): ");
            continuar = scanner.nextLine().trim().toLowerCase();
        }

        // Muestra la lista completa de ciudades ingresadas
        System.out.println("\nLista de ciudades ingresadas:");
        for (String ciudad : ciudades) {
            System.out.println(ciudad);
        }

        // Cierra el objeto Scanner
        scanner.close();
    }
}
*/




import java.util.ArrayList;
import java.util.Scanner;

public class ListaCiudades {
    public static void main(String[] args) {
        // Inicializa el ArrayList para almacenar los nombres de las ciudades
        ArrayList<String> ciudades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String continuar = "si";

        while (continuar.equalsIgnoreCase("si") || continuar.equalsIgnoreCase("si")) {
            System.out.println();
            System.out.println("\n--- Actividad: Lista de ciudades ---");
            System.out.print("\nIngresa el nombre de una ciudad: ");
            String ciudad = scanner.nextLine();

            // Validar que la entrada solo contenga letras y espacios
            if (ciudad.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                // Agrega la ciudad a la lista si es válida
                ciudades.add(ciudad);
            } else {
                // Muestra un mensaje de error si la entrada es inválida
                System.out.println("Error: solo se permiten letras. Intenta de nuevo.");
                continue;  // Vuelve a pedir la ciudad sin preguntar si desea continuar
            }

            // Bucle para validar la entrada del usuario en la pregunta sí/no
            while (true) {
                System.out.print("¿Deseas agregar otra ciudad? (si/no): ");
                continuar = scanner.nextLine().trim().toLowerCase();

                if (continuar.equals("sí") || continuar.equals("si") || continuar.equals("no")) {
                    break;  // Sale del bucle si la respuesta es válida
                } else {
                    System.out.println("Error: por favor responde con 'si' o 'no'.");
                }
            }
        }

        System.out.println("\nLista de ciudades ingresadas:");
        for (String ciudad : ciudades) {
            System.out.println(ciudad);
        }

        scanner.close();
    }
}
