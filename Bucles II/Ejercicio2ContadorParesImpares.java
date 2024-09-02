import java.util.Scanner;

public class Ejercicio2ContadorParesImpares {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Variables para contar números pares e impares
        int contadorPares = 0;
        int contadorImpares = 0;
        
        // Bucle para solicitar números hasta que el usuario decida terminar
        while (true) {
            // Solicitar al usuario que ingrese un número entero
            System.out.print("\n" +
                                "Ingresa un Número Entero ( o Ingresa | 0 | Para Terminar): ");
            int numero = scanner.nextInt();
            
            // Terminar el bucle si se ingresa cero
            if (numero == 0) {
                break;
            }
            
            // Determinar si el número ingresado es par o impar
            if (numero % 2 == 0) {
                contadorPares++; // Incrementar el contador de números pares
            } else {
                contadorImpares++; // Incrementar el contador de números impares
            }
        }
        
        // Mostrar el resultado al usuario
        System.out.println("Cantidad de Números Pares Ingresados: " + contadorPares);
        System.out.println("Cantidad de Números Impares Ingresados: " + contadorImpares);
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
}
