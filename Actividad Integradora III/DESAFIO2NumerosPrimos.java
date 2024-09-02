import java.util.Scanner;

public class DESAFIO2NumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        
        do {
            // Solicitar al usuario que introduzca un número
            System.out.print("\n" +
                                "Ingrese un número (0 para salir): ");
            numero = scanner.nextInt();
            
            // Verificar si el número es 0 para finalizar el programa
            if (numero == 0) {
                System.out.println("Programa terminado.");
                break;
            }
            
            // Verificar si el número es primo
            if (esPrimo(numero)) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " no es un número primo. Inténtelo de nuevo.");
            }
            
        } while (numero != 0);
        
        // Cerrar el objeto Scanner para liberar recursos
        scanner.close();
    }
    
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        int i = 2;
        boolean primo = true;
        
        // Verificar si el número es divisible por algún número menor que él mismo
        do {
            if (numero % i == 0) {
                primo = false;
                break;
            }
            i++;
        } while (i <= Math.sqrt(numero)); // Solo necesitamos verificar hasta la raíz cuadrada del número
        
        return primo;
    }
}
