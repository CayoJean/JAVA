/*-import java.util.Scanner;

public class ValidacionDeContraseña {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Definir la contraseña correcta
        final String CONTRASENA_CORRECTA = "secreto";
        
        // Declarar una variable para almacenar la contraseña ingresada por el usuario
        String contrasenaIngresada;
        
        // Bucle while para pedir al usuario que ingrese la contraseña
        while (true) {
            // Solicitar al usuario que ingrese la contraseña
            System.out.println("\n");
            System.out.print("Por favor, ingresa la contraseña: ");
            contrasenaIngresada = scanner.nextLine();
            
            // Validar la contraseña ingresada
            if (contrasenaIngresada.equals(CONTRASENA_CORRECTA)) {
                System.out.println("¡Contraseña Correcta!");
                break; // Salir del bucle si la contraseña es correcta
            } else {
                System.out.println("Contraseña incorrecta. Intenta nuevamente.");
            }
        }
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
}
*/

import java.util.Scanner;

public class ValidacionDeContraseña {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Declarar variables para almacenar la contraseña ingresada y su confirmación
        String contrasena;
        String confirmacionContrasena;
        
        // Solicitar al usuario que ingrese la contraseña por primera vez
        System.out.println("\n");
        System.out.print("Por Favor, Ingresa Una Contraseña: ");
        contrasena = scanner.nextLine();
        
        // Bucle while para pedir al usuario que confirme la contraseña
        while (true) {
            // Solicitar al usuario que confirme la contraseña
            System.out.print("Por Favor, Confirma La Contraseña: ");
            confirmacionContrasena = scanner.nextLine();
            
            // Validar la confirmación de la contraseña
            if (!contrasena.equals(confirmacionContrasena)) {
                System.out.println("La Confirmación de la Contraseña no Coincide. Intenta Nuevamente.");
            } else {
                System.out.println("¡Contraseña Correcta y Confirmada!");
                break; // Salir del bucle si la confirmación es correcta
            }
        }
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
}
