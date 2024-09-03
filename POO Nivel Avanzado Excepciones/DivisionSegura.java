import java.util.Scanner;


public class DivisionSegura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerador = 0;
        int denominador = 0;

        try {
            System.out.println();
            // Obtener el numerador del usuario
            System.out.println("\n--- Actividad: Division Segura ---");
            System.out.print("\nPor favor, ingresa el Dividendo: ");
            numerador = obtenerNumero(scanner);

            // Obtener el denominador del usuario
            System.out.print("Por favor, ingresa el Divisor: ");
            denominador = obtenerNumerador(scanner);

            // Realizar la división
            int resultado = numerador / denominador;
            System.out.println();
            System.out.println("El Cociente de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        } finally {
            // Cerrar el Scanner en el bloque finally para asegurar que se cierre siempre
            scanner.close();
        }
    }

    // Método para obtener el número del usuario utilizando el Scanner pasado como argumento
    private static int obtenerNumero(Scanner scanner) {
        return scanner.nextInt();
    }

    // Método que solicita el denominador y verifica que no sea cero
    private static int obtenerNumerador(Scanner scanner) throws ArithmeticException {
        int denominador = scanner.nextInt();
        if (denominador == 0) {
            throw new ArithmeticException("El denominador no puede ser cero.");
        }
        return denominador;
    }
}










/* 
public class DivisionSegura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // Bucle infinito para continuar hasta que el usuario decida salir
            try {
                System.out.println();
                System.out.println("\n--- Actividad: Division Segura ---");
                // Obtener el numerador del usuario
                System.out.print("\nPor favor, ingresa el Dividendo ( - 0 Salir -): ");
                int numerador = obtenerNumero(scanner);
                if (numerador == 0) { // Verificar si el usuario desea salir
                    System.out.println("Has decidido salir. ¡Hasta luego!");
                    break;
                }

                // Obtener el denominador del usuario
                System.out.print("Por favor, ingresa el Divisor: ");
                int denominador = obtenerNumerador(scanner);

                // Realizar la división
                int resultado = numerador / denominador;
                System.out.println();
                System.out.println("El Cociente de la división es: " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("Error: No se puede dividir por cero.");
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error: " + e.getMessage());
                scanner.nextLine(); // Limpiar la entrada del usuario en caso de error no esperado
            }
        }

        scanner.close(); // Cerrar el Scanner al final
    }

    // Método para obtener el número del usuario utilizando el Scanner pasado como argumento
    private static int obtenerNumero(Scanner scanner) {
        while (!scanner.hasNextInt()) { // Verificar si la entrada es un número entero
            System.out.println("Por favor, ingresa un número válido.");
            scanner.next(); // Descartar entrada no válida
        }
        return scanner.nextInt();
    }

    // Método que solicita el denominador y verifica que no sea cero
    private static int obtenerNumerador(Scanner scanner) throws ArithmeticException {
        while (!scanner.hasNextInt()) { // Verificar si la entrada es un número entero
            System.out.println("Por favor, ingresa un número válido.");
            scanner.next(); // Descartar entrada no válida
        }
        int denominador = scanner.nextInt();
        if (denominador == 0) {
            throw new ArithmeticException("El denominador no puede ser cero.");
        }
        return denominador;
    }
}
*/