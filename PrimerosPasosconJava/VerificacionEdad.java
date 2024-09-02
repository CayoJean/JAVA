import java.util.Scanner;

public class VerificacionEdad {
    public static void main(String[] args) {
        // Crear una instancia de Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese su año de nacimiento
        System.out.print("Por favor, ingresa tu año de nacimiento: ");
        int añoNacimiento = scanner.nextInt();

        // Declarar una variable constante para el año actual
        final int ANIOACTUAL = 2024;

        // Calcular la edad actual del usuario
        int calculoEdad = ANIOACTUAL - añoNacimiento;

        // Mostrar la edad calculada
        System.out.println("Tu edad actual es: " + calculoEdad);

        // Determinar si el usuario es mayor de edad y mostrar un mensaje apropiado
        if (calculoEdad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }

        // Cerrar el Scanner
        scanner.close();
    }
}
