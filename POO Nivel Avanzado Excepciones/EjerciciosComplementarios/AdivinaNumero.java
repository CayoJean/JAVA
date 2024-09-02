package EjerciciosComplementarios;

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {

    public static void main(String[] args) {
        // Crear una instancia de Random para generar números aleatorios
        Random random = new Random();
        int numeroAleatorio = random.nextInt(50) + 1; // Generar un número entre 1 y 50
        int intentos = 0; // Contador de intentos
        boolean adivinado = false; // Indicador de si el número ha sido adivinado
        Scanner scanner = new Scanner(System.in); // Scanner para leer la entrada del usuario

        System.out.println();
        System.out.println("\n--- Adivinando un número ---");
        System.out.println("\n¡Bienvenido al juego de adivinar el número!");
        System.out.println("He escogido un número entre 1 y 50. ¿Puedes adivinar cuál es?");

        // Bucle hasta que el usuario adivine el número
        while (!adivinado) {
            System.out.println();
            System.out.print("Ingresa tu suposición: ");
            intentos++; // Incrementar el contador de intentos

            try {
                int suposicion = scanner.nextInt(); // Leer la entrada del usuario

                // Comparar la suposición con el número aleatorio
                if (suposicion < numeroAleatorio) {
                    System.out.println("El número a adivinar es mayor que " + suposicion + ".");
                } else if (suposicion > numeroAleatorio) {
                    System.out.println("El número a adivinar es menor que " + suposicion + ".");
                } else {
                    System.out.println("¡Felicidades! Has adivinado el número " + numeroAleatorio + " en " + intentos + " intentos.");
                    adivinado = true; // Cambiar el indicador a verdadero para salir del bucle
                }

            } catch (Exception e) {
                System.out.println("Error: Por favor ingresa un número válido."); // Manejar entradas no numéricas
                scanner.next(); // Limpiar la entrada incorrecta del scanner
            }
        }

        scanner.close(); // Cerrar el scanner al final del programa
    }
}
