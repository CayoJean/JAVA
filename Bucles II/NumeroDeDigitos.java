import java.util.Scanner;

public class NumeroDeDigitos {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese un número entero
        System.out.print("\n" +
                        "Por Favor, Ingresa Números Enteros: ");
        int numero = scanner.nextInt();
        
        // Inicializar una variabl0e para contar los dígitos
        int numeroDeDigitos = 0;
        
        // Convertir el número a positivo si es negativo
        if (numero == 0) {
            numeroDeDigitos = 1;
        } else {
            // Convertir el número a positivo si es negativo
            int numeroPositivo = Math.abs(numero);
            
            // Utilizar un bucle while para contar los dígitos
            while (numeroPositivo > 0) {
                numeroPositivo /= 10; // Dividir el número por 10
                numeroDeDigitos++; // Incrementar el contador de dígitos
            }
        }
        
        // Mostrar el número de dígitos
        System.out.println("El Número " + numero + " Tiene " + numeroDeDigitos + " Dígito(s).");
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
}
