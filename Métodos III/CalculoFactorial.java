import java.util.Scanner;

public class CalculoFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int numero = solicitarNumero(scanner);

            // Condición para salir del bucle
            if (numero == 0) {
                System.out.println("¡Vuleva Pronto! Saliste del programa.");
                break;
            }

            // Validación para asegurar que el número es no negativo
            if (numero < 0) {
                System.out.println("El número debe ser no negativo. Inténtelo de nuevo.");
            } else {
                String resultadoFactorial = calcularFactorial(numero);
                System.out.println("El factorial de " + numero + " se calcula como: " + resultadoFactorial);
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
                                        "Ingrese un número entero no negativo para calcular su factorial: ");
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                scanner.next(); // Limpiar el buffer del scanner
            }
        }
    }

    // Método para calcular el factorial de un número usando un bucle do-while
    public static String calcularFactorial(int numero) {
        long factorial = 1;
        int i = 1;
        StringBuilder calculo = new StringBuilder();

        do {
            factorial *= i;
            calculo.append(i);
            if (i < numero) {
                calculo.append(" * ");
            }
            i++;
        } while (i <= numero);

        calculo.append(" = ").append(factorial);
        return calculo.toString();
    }
}



/* 
import java.util.Scanner;

public class CalculoFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int numero = solicitarNumero(scanner);
            
            // Condición para salir del bucle
            if (numero == 0) {
                System.out.println("¡Vuleva Pronto! Saliste del programa.");
                break;
            }

            if (numero < 0) {
                System.out.println("El número debe ser no negativo.");
            } else {
                System.out.println("El factorial de " + numero + " es: " + factorialIterativo(numero));
            }
        }

        scanner.close();
    }

    // Método para solicitar un número al usuario y manejar la entrada incorrecta
    public static int solicitarNumero(Scanner scanner) {
        while (true) {
            try {
            System.out.print("");
                System.out.print("Ingrese un número entero no negativo para calcular su factorial (iterativo):");
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                scanner.next(); // Limpiar el buffer del scanner
            }
        }
    }

    // Método iterativo para calcular el factorial
    public static int factorialIterativo(int numero) {
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
}


*/


/*import java.util.Scanner;

public class CalculoFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int numero = solicitarNumero(scanner);
            
            // Condición para salir del bucle
            if (numero == 0) {
                System.out.println("¡Vuleva Pronto! Saliste del programa.");
                break;
            }

            if (numero < 0) {
                System.out.println("El número debe ser no negativo.");
            } else {
                System.out.println("El factorial de " + numero + " es: " + factorialRecursivo(numero));
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
                                        "Ingrese un número entero no negativo para calcular su factorial (recursivo):");
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                scanner.next(); // Limpiar el buffer del scanner
            }
        }
    }

    // Método recursivo para calcular el factorial
    public static int factorialRecursivo(int numero) {
        if (numero == 0) {
            return 1; // Caso base: 0! = 1
        }
        return numero * factorialRecursivo(numero - 1); // Llamada recursiva
    }
}
*/