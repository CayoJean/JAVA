import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números
        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        // Mostrar las opciones disponibles al usuario
        System.out.println("Elige una operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        // Solicitar al usuario que ingrese el número de la opción deseada
        System.out.print("Ingrese el número de operación: ");
        int opcion = scanner.nextInt();

        // Declarar una variable para almacenar el resultado de la operación
        String mensaje;

        // Utilizar el operador ternario para realizar la operación elegida y manejar la división por cero
        int resultado = (opcion == 1) ? (numero1 + numero2) :
                        (opcion == 2) ? (numero1 - numero2) :
                        (opcion == 3) ? (numero1 * numero2) :
                        (opcion == 4 && numero2 != 0) ? (numero1 / numero2) : 0;

        // Establecer el mensaje de error si se elige la división por cero
        mensaje = (opcion == 4 && numero2 == 0) ? "Error: No se puede dividir por cero." : "El resultado es: " + resultado;

        // Mostrar el resultado de la operación en la consola
        System.out.println(mensaje);

        // Cerrar el scanner
        scanner.close();
    }
}