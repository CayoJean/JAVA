import java.util.Scanner;
import java.util.Random;

public class AdivinaElNumeros {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Crear un objeto Random para generar un número aleatorio
        Random random = new Random();
        
        // Generar un número aleatorio entre 1 y 20 (ambos inclusive)
        int numeroAleatorio = random.nextInt(20) + 1;
        
        // Declarar una variable para almacenar la suposición del usuario
        int suposicion;
        
        // Imprimir un mensaje inicial
        System.out.println("\n" +
                        "Adivina el número entre 1 y 20:");
        
        // Bucle do-while para pedir al usuario que adivine el número
        do {
            // Leer la suposición del usuario
            suposicion = scanner.nextInt();
            
            // Comparar la suposición con el número aleatorio
            if (suposicion > numeroAleatorio) {
                System.out.println("El número es menor. Intenta nuevamente:");
            } else if (suposicion < numeroAleatorio) {
                System.out.println("El número es mayor. Intenta nuevamente:");
            } else {
                System.out.println("¡Felicidades! Has Adivinado El Número.");
            }
        } while (suposicion != numeroAleatorio);
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
}
