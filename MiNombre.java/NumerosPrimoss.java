/*import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            // Solicitar al usuario que ingrese un número
            System.out.print("Ingresa un número entero (0 para salir): ");
            numero = scanner.nextInt();

            // Verificar si el número es 0 para salir del bucle
            if (numero == 0) {
                System.out.println("Programa finalizado.");
                break; // Sale del bucle si se ingresa 0
            }

            // Verificar si el número es primo
            if (esPrimo(numero)) {
                System.out.println("El número " + numero + " es primo.");
            } else {
                System.out.println("El número " + numero + " no es primo. Intenta nuevamente.");
            }
        } while (!esPrimo(numero)); // Continúa pidiendo números hasta que se ingrese un número primo

        scanner.close();
    }
    
    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; // Números menores o iguales a 1 no son primos
        }
        if (numero == 2) {
            return true; // 2 es el único número primo par
        }
        if (numero % 2 == 0) {
            return false; // Otros números pares no son primos
        }
        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            if (numero % i == 0) {
                return false; // Divisible por un número distinto de 1 y él mismo
            }
        }
        return true; // Número primo
    }
}
*/




import java.util.Scanner;

public class NumerosPrimoss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            // Solicitar al usuario que ingrese un número
            System.out.print("Ingresa un número entero (0 para salir): ");
            numero = scanner.nextInt();

            // Verificar si el número es 0 para salir del bucle
            if (numero == 0) {
                System.out.println("Programa finalizado.");
                break; // Sale del bucle si se ingresa 0
            }

            // Verificar si el número es primo utilizando el método iterativo
            if (esPrimoIterativo(numero)) {
                System.out.println("El número " + numero + " es primo.");
            } else {
                System.out.println("El número " + numero + " no es primo. Intenta nuevamente.");
            }
        } while (numero != 0); // Continúa pidiendo números hasta que se ingrese 0

        scanner.close();
    }
    
    // Método iterativo para verificar si un número es primo
    public static boolean esPrimoIterativo(int numero) {
        if (numero <= 1) {
            return false; // Números menores o iguales a 1 no son primos
        }
        if (numero == 2) {
            return true; // 2 es el único número primo par
        }
        if (numero % 2 == 0) {
            return false; // Otros números pares no son primos
        }
        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            if (numero % i == 0) {
                return false; // Divisible por un número distinto de 1 y él mismo
            }
        }
        return true; // Número primo
    }
    
    // Método recursivo para verificar si un número es primo
    public static boolean esPrimoRecursivo(int numero) {
        if (numero <= 1) {
            return false; // Números menores o iguales a 1 no son primos
        }
        if (numero == 2) {
            return true; // 2 es el único número primo par
        }
        if (numero % 2 == 0) {
            return false; // Otros números pares no son primos
        }
        return esPrimoRecursivoAux(numero, 3); // Llamada recursiva
    }

    // Método auxiliar recursivo para verificar si un número es primo
    private static boolean esPrimoRecursivoAux(int numero, int divisor) {
        if (divisor > Math.sqrt(numero)) {
            return true; // Si se ha probado hasta la raíz cuadrada, el número es primo
        }
        if (numero % divisor == 0) {
            return false; // Divisible por un número distinto de 1 y él mismo
        }
        return esPrimoRecursivoAux(numero, divisor + 2); // Llamada recursiva con el siguiente divisor impar
    }
}

