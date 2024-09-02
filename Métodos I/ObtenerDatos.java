import java.util.Scanner;

public class ObtenerDatos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre = obtenerNombre(scanner);
        int edad = obtenerEdad(scanner);

        imprimeNombreYEdad(nombre, edad);

        scanner.close();
    }

    // Método que obtiene el nombre del usuario
    public static String obtenerNombre(Scanner scanner) {
        String nombre;
        while (true) {
            System.out.print("Por favor, ingresa tu nombre: ");
            nombre = scanner.nextLine();
            if (nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ\\s]+")) {
                break;
            } else {
                System.out.println("Error: El nombre solo debe contener letras.");
            }
        }
        return nombre;
    }

    // Método que obtiene la edad del usuario
    public static int obtenerEdad(Scanner scanner) {
        int edad;
        while (true) {
            System.out.print("Por favor, ingresa tu edad (2 dígitos): ");
            String edadInput = scanner.nextLine();
            if (edadInput.matches("\\d{2}")) {
                edad = Integer.parseInt(edadInput);
                break;
            } else {
                System.out.println("Error: La edad debe ser un número de 2 dígitos.");
            }
        }
        return edad;
    }

    // Método que imprime el nombre y la edad
    public static void imprimeNombreYEdad(String nombre, int edad) {
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años");
    }
}
