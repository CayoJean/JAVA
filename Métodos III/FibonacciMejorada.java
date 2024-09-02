/*import java.util.Scanner;

public class FibonacciMejorada {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println();
            System.out.print("\n" +
                                "Ingrese la posición en la serie de Fibonacci: ");
            int posicion = scanner.nextInt();
            
            // Condición para salir del bucle
            if (posicion == 0) {
                System.out.println("¡Vuleva Pronto! Saliste del programa.");
                break;
            }
            
            // Validamos que la posición no sea negativa (excepto -1 para salir)
            if (posicion < 0) {
                System.out.println("La posición no puede ser negativa. Inténtelo de nuevo.");
            } else {
                int valorFibonacci = calcularFibonacci(posicion);
                System.out.println("El valor de Fibonacci en la posición " + posicion + " es: " + valorFibonacci);
            }
        }
        
        scanner.close();
    }
    
    // Método para calcular el valor de Fibonacci en la posición dada
    public static int calcularFibonacci(int posicion) {
        if (posicion == 0) {
            return 0;
        } else if (posicion == 1) {
            return 1;
        }
        
        int a = 0, b = 1;
        for (int i = 2; i <= posicion; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        
        return b;
    }
}
*/



/*Recursivo para la Serie de Fibonacci */

import java.util.Scanner;

public class FibonacciMejorada {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            int posicion = solicitarPosicion(scanner);
            
            // Condición para salir del bucle
            if (posicion == 0) {
                System.out.println("¡Vuleva Pronto! Saliste del programa.");
                break;
            }
            
            // Validamos que la posición no sea negativa
            if (posicion < 0) {
                System.out.println("La posición no puede ser negativa. Inténtelo de nuevo.");
            } else {
                int valorFibonacci = calcularFibonacciRecursivo(posicion);
                mostrarResultado(posicion, valorFibonacci);
            }
        }
        
        scanner.close();
    }
    
    // Método para solicitar la posición al usuario
    public static int solicitarPosicion(Scanner scanner) {
        System.out.println();
        System.out.print("\n" +
                        "Ingrese la posición en la serie de Fibonacci: ");
        return scanner.nextInt();
    }
    
    // Método recursivo para calcular el valor de Fibonacci en la posición dada
    public static int calcularFibonacciRecursivo(int posicion) {
        if (posicion == 0) {
            return 0;
        } else if (posicion == 1) {
            return 1;
        }
        
        return calcularFibonacciRecursivo(posicion - 1) + calcularFibonacciRecursivo(posicion - 2);
    }
    
    // Método para mostrar el resultado
    public static void mostrarResultado(int posicion, int valorFibonacci) {
        System.out.println("El valor de Fibonacci en la posición " + posicion + " es: " + valorFibonacci);
    }
}
