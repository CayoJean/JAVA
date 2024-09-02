/*import java.util.Scanner;

public class numerosprimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int numero = solicitarNumero(scanner);

            // Condición para salir del bucle
            if (numero == 0) {
                System.out.println("¡Vuleva Pronto! Saliste del programa.");
                break;
            }

            if (esPrimo(numero)) {
                System.out.println(numero + " es un número primo.");
                break; // Salir del bucle si el número es primo
            } else {
                System.out.println(numero + " no es un número primo. Intente con otro número.");
            }
        }

        scanner.close();
    }

    // Método para solicitar un número al usuario y manejar la entrada incorrecta
    public static int solicitarNumero(Scanner scanner) {
        while (true) {
            try {
                System.out.println();
                System.out.print("\n" +
                                        "Ingrese un número entero: ");
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                scanner.next(); // Limpiar el buffer del scanner
            }
        }
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }
        int i = 2;
        do {
            if (numero % i == 0 && i != numero) {
                return false; // Encontró un divisor distinto de 1 y el mismo número
            }
            i++;
        } while (i <= Math.sqrt(numero)); // Optimización: solo comprobar hasta la raíz cuadrada del número
        return true; // Si no encontró divisores, es primo
    }
}
*/



import java.util.Scanner;

public class numerosprimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int numero = solicitarNumero(scanner);

            // Condición para salir del bucle
            if (numero == 0) {
                System.out.println("¡Vuleva Pronto! Saliste del programa.");
                break;
            }

            if (esPrimo(numero, 2)) {
                System.out.println(numero + " es un número primo.");
                break; // Salir del bucle si el número es primo
            } else {
                System.out.println(numero + " no es un número primo. Intente con otro número.");
            }
        }

        scanner.close();
    }

    // Método para solicitar un número al usuario y manejar la entrada incorrecta
    public static int solicitarNumero(Scanner scanner) {
        while (true) {
            try {
                System.out.println();
                System.out.print("\n" +
                                        "Ingrese un número entero: ");
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                scanner.next(); // Limpiar el buffer del scanner
            }
        }
    }

    // Método recursivo para verificar si un número es primo
    public static boolean esPrimo(int numero, int divisor) {
        if (numero <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }
        if (divisor > Math.sqrt(numero)) {
            return true; // Caso base: no se encontraron divisores
        }
        if (numero % divisor == 0) {
            return false; // Encontró un divisor
        }
        return esPrimo(numero, divisor + 1); // Llamada recursiva con el siguiente divisor
    }
}
