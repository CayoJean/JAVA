import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir el rango para el número aleatorio
        int min = 1;
        int max = 20;

        // Generar un número aleatorio dentro del rango definido
        int numeroAleatorio = numeroAleatorio(min, max);
        int numeroIngresado;
        
        System.out.println("¡Adivina el número entre " + min + " y " + max + "!");
        
        do {
            System.out.println();
            System.out.print("\n" +
                                "Ingresa tu adivinanza: ");
            numeroIngresado = scanner.nextInt();
            
            if (numeroIngresado > numeroAleatorio) {
                System.out.println("El número ingresado es mayor que el número aleatorio. Intenta de nuevo.");
            } else if (numeroIngresado < numeroAleatorio) {
                System.out.println("El número ingresado es menor que el número aleatorio. Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número.");
            }
        } while (numeroIngresado != numeroAleatorio);

        scanner.close();
    }

    // Método para generar un número aleatorio dentro de un rango especificado
    public static int numeroAleatorio(int min, int max) {
        Random random = new Random();
        // Asegurarse de que min es menor que max
        if (min > max) {
            throw new IllegalArgumentException("El valor mínimo debe ser menor o igual al valor máximo.");
        }
        return random.nextInt(max - min + 1) + min;
    }
}
