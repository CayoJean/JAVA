import java.util.Scanner;

public class RestaConManejoDeExcepciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar al usuario que ingrese dos números enteros
            System.out.print("\n" +
                            "Ingrese el primer número entero: ");

            //NUMERO DECIMAL
            double num1 = scanner.nextDouble();

            //NUMERO ENTERO
            //int num1 = scanner.nextInt();
            System.out.print("Ingrese el segundo número entero: ");

            //NUMERO DECIMAL
            double num2 = scanner.nextDouble();

            //NUMERO ENTERO
            //int num2 = scanner.nextInt();
            
            // Realizar la resta
            //RESULTADO EN NUMERO ENTERO
            //int resultado = num1 - num2;

            //RESULTADO EN NUMERO DECIMAL
            double resultado = num1 - num2;
            
            // Mostrar el resultado si no hubo excepción
            System.out.println("El resultado de la resta es: " + resultado);
            
        } catch (java.util.InputMismatchException e) {
            // Manejar la excepción de valores no enteros
            System.out.println("Error: Por favor ingrese números enteros válidos.");
        } finally {
            // Cerrar el scanner
            scanner.close();
        }
    }
}
