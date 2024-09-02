import java.util.Scanner;

public class ContarDigitos {
    public static void main(String[] args) {
        // Crear una instancia de Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que introduzca un número
        System.out.println("\n" +
                        "Por favor, introduce un número:");
        String numeroCadena = scanner.nextLine();
        
        // Variable para contar los dígitos
        int contadorDigitos = 0;
        
        // Recorrer cada carácter en la cadena
        for (int i = 0; i < numeroCadena.length(); i++) {
            // Si el carácter es un dígito, incrementar el contador
            if (Character.isDigit(numeroCadena.charAt(i))) {
                contadorDigitos++;
            }
        }
        
        // Mostrar el recuento de dígitos al usuario
        System.out.println("El número introducido contiene " + contadorDigitos + " dígitos.");
        
        // Cerrar el Scanner para liberar los recursos
        scanner.close();
    }
}
