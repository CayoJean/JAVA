import java.util.Scanner;

public class NumeroValido {
    public static void main(String[] args) {
        // Crear una instancia de Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que introduzca una cadena
        System.out.println("\n" +
                        "Por favor, introduce una cadena:");
        String entrada = scanner.nextLine();
        
        // Intentar convertir la cadena a un número decimal
        try {
            // Convertir la cadena a un número decimal usando Double.valueOf()
            Double numero = Double.valueOf(entrada);
            // Si la conversión es exitosa, mostrar el número al usuario
            System.out.println("La cadena introducida es un número válido: " + numero);
        } catch (NumberFormatException e) {
            // Si se lanza una excepción, indicar que la entrada no es un número válido
            System.out.println("La cadena introducida no es un número válido.");
        }
        
        // Cerrar el Scanner para liberar los recursos
        scanner.close();
    }
}
