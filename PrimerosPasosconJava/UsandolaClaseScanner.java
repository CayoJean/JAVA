import java.util.Scanner;

public class UsandolaClaseScanner {
    public static void main(String[] args) {
        // Crear una instancia de Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su nombre
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        // Imprimir el nombre ingresado
        System.out.println("Tu nombre es: " + nombre);

        // Solicitar al usuario que ingrese su edad
        System.out.print("Por favor, ingresa tu edad: ");
        int edad = scanner.nextInt();

        // Imprimir la edad ingresada
        System.out.println("Tu edad es: " +edad+ " años");

        // Imprimir el mensaje final
        System.out.println("Tu nombre es: " + nombre + " y tu edad es: " +edad+ " años");

        // Cerrar el Scanner
        scanner.close();
    }
}