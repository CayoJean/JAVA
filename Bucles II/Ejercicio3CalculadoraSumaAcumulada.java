import java.util.Scanner;

public class Ejercicio3CalculadoraSumaAcumulada {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Variable para almacenar la suma acumulada
        int suma = 0;
        
        // Bucle do-while para solicitar números y acumular la suma
        do {
            // Solicitar al usuario que ingrese un número entero positivo
            System.out.print("\n" +
                                "Ingresa un número entero | Positivo | : ");
            int numero = scanner.nextInt();
            
            // Validar si el número ingresado es positivo
            if (numero < 0) {
                System.out.println("Error: Debes ingresar un número entero positivo.");
                continue; // Volver a solicitar otro número si no es positivo
            }
            
            // Sumar el número ingresado a la suma acumulada
            suma += numero;
            
            // Preguntar al usuario si desea ingresar otro número
            System.out.print("¿Deseas ingresar otro número? (Si/No): ");
            String respuesta = scanner.next();
            
            // Convertir la respuesta a minúsculas para comparación
            respuesta = respuesta.toLowerCase();
            
            // Salir del bucle si la respuesta es "no" o cualquier palabra que empiece con "n"
            if (respuesta.equals("no") || respuesta.startsWith("n")) {
                break;
            }
            
        } while (true);
        
        // Mostrar la suma acumulada al usuario
        System.out.println("La suma acumulada de los números ingresados es: " + suma);
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
}

