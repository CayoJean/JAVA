import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar al usuario que ingrese dos números enteros
            System.out.print("\n" +
                            "Ingrese el primer número entero: ");
            int num1 = scanner.nextInt();
            System.out.print("Ingrese el segundo número entero: ");
            int num2 = scanner.nextInt();
            
            // Realizar la división
            int resultado = num1 / num2;
            
            // Mostrar el resultado si no hubo excepción
            System.out.println("El resultado de la división es: " + resultado);
            
        } catch (ArithmeticException e) {
            // Manejar la excepción de división por cero
            System.out.println("Error: No se puede dividir entre cero.");
        } catch (java.util.InputMismatchException e) {
            // Manejar la excepción de valores no enteros
            System.out.println("Error: Por favor ingrese números enteros válidos.");
        } finally {
            // Cerrar el scanner
            scanner.close();
        }
    }
}