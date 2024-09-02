import java.util.Scanner;

public class Ejercicio1TablaDeMultiplicar {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Variable para almacenar el número ingresado por el usuario
        int numero;
        
        // Bucle para solicitar números hasta que se ingrese cero
        while (true) {
            // Solicitar al usuario que ingrese un número entero
            System.out.print("\n" +
                                "Ingresa Un Número Entero (o Ingresa -0- Para Salir): ");
            numero = scanner.nextInt();
            
            // Salir del bucle si se ingresa cero
            if (numero == 0) {
                System.out.println("Has Ingresado Salir. ¡Vuelve Pronto!...");
                break;
            }
            
            // Mostrar la tabla de multiplicar del número ingresado
            System.out.println("La Tabla de Multiplicar Del " + numero + ":");
            int multiplicador = 1;
            while (multiplicador <= 12) {
                System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
                multiplicador++;
            }
        }
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
}
