import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Genera un número aleatorio entre 1 y 100
        int numeroSecreto = random.nextInt(100) + 1;
        int numeroUsuario = 0;
        int intentos = 0;
        
        System.out.println("\n" +
                        "¡Bienvenido al juego 'Adivina el Número'!");
        System.out.println("He seleccionado un número entre 1 y 100. ¡Intenta adivinarlo!");
        
        while (numeroUsuario != numeroSecreto) {
            // Solicita al usuario que introduzca un número
            System.out.print("Introduce tu adivinanza: ");
            numeroUsuario = scanner.nextInt();
            intentos++;
            
            if (numeroUsuario < numeroSecreto) {
                System.out.println("El número secreto es mayor. Inténtalo de nuevo.");
            } else if (numeroUsuario > numeroSecreto) {
                System.out.println("El número secreto es menor. Inténtalo de nuevo.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
            }
        }
        
        // Cierra el objeto Scanner para liberar recursos
        scanner.close();
    }
}
