
/* 
import java.util.Scanner;

public class Par {

    // Variable global para el objeto Scanner
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numero = solicitarNumero(); // Llama al método para solicitar el número
        if (esPar(numero)) { // Llama al método para verificar si el número es par
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " no es par.");
        }
    }

    // Método para solicitar un número al usuario
    public static int solicitarNumero() {
        System.out.print("Ingresa un número: ");
        return scanner.nextInt();
    }

    // Método para verificar si un número es par
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
*/



import java.util.Scanner;

public class Par {

    // Variable global para el objeto Scanner
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numero;
        
        do {
            numero = solicitarNumero(); // Llama al método para solicitar el número
            
            if (numero != 0) {
                if (esPar(numero)) { // Llama al método para verificar si el número es par
                    System.out.println("El Número " + numero + " Es Par.");
                } else {
                    System.out.println("El Número " + numero + " No Es Par.");
                }
            }
        } while (numero != 0); // Repite hasta que el usuario ingrese 0
        
        System.out.println("¡Vuelve Pronto! Has Finalizado.");
    }

    // Método para solicitar un número al usuario
    public static int solicitarNumero() {
        System.out.println();
        System.out.print("\n" +
                        "Ingresa Un Número (0 Salir): ");
        return scanner.nextInt();
    }

    // Método para verificar si un número es par
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}




/*import java.util.Scanner;

public class Par {

    // Variable global para el objeto Scanner
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numero;
        
        do {
            numero = solicitarNumero(); // Llama al método para solicitar el número
            
            if (numero != 0) {
                if (esPar(numero)) { // Llama al método para verificar si el número es par
                    System.out.println("El Número " + numero + " Es Par.");
                } else {
                    System.out.println("El Número " + numero + " No Es Par.");
                }
            }
        } while (numero != 0); // Repite hasta que el usuario ingrese 0
        
        System.out.println("¡Vuelve Pronto! Has Finalizado.");
    }

    // Método para solicitar un número al usuario
    public static int solicitarNumero() {
        int numero = 0;
        boolean esNumeroValido = false;

        while (!esNumeroValido) {
            try {
                System.out.println();
                System.out.print("\n" +
                                        "Ingresa Un Número (0 Salir): ");
                numero = Integer.parseInt(scanner.nextLine()); // Lee la línea completa y convierte a entero
                esNumeroValido = true; // Si la conversión es exitosa, el número es válido
            } catch (NumberFormatException e) {
                System.out.println("Entrada No Válida de Letras. Por Favor, Ingresa Un Número.");
            }
        }
        return numero;
    }

    // Método para verificar si un número es par
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}*/
