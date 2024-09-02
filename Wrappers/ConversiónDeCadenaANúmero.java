import java.util.Scanner;

public class ConversiónDeCadenaANúmero {
    public static void main(String[] args) {
        // Crear una instancia de Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que introduzca una cadena
        System.out.println("\n" +
                        "Por favor, introduce una cadena que represente un número entero:");
        String entrada = scanner.nextLine();
        
        // Intentar convertir la cadena a un número entero
        try {
            // Convertir la cadena a un número entero usando Integer.valueOf()
            Integer numero = Integer.valueOf(entrada);
            // Si la conversión es exitosa, mostrar el número al usuario
            System.out.println("La cadena introducida es un número entero válido: " + numero);
        } catch (NumberFormatException e) {
            // Si se lanza una excepción, indicar que la entrada no es un número entero válido
            System.out.println("La cadena introducida no es un número entero válido.");
        }
        
        // Cerrar el Scanner para liberar los recursos
        scanner.close();
    }
}
