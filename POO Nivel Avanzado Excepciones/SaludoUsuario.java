import java.util.Scanner;

public class SaludoUsuario {

    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            String nombre = solicitarNombre(scanner);
            System.out.println("Hola, ¡" + nombre + "! Bienvenido/a.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close(); // Cerrar el Scanner en el bloque finally
            }
        }
    }

    // Método que solicita el nombre del usuario y verifica que sea válido
    private static String solicitarNombre(Scanner scanner) {
        System.out.println();
        System.out.print("\nPor favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine().trim(); // Usar trim() para eliminar espacios en blanco
        if (nombre.length() < 2) {
            throw new IllegalArgumentException("El nombre debe tener al menos 2 caracteres.");
        }
        return nombre;
    }
}
