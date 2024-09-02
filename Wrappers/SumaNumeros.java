import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        // Crear una instancia de Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que introduzca un número entero
        System.out.println("\n" +
                            "Por favor, introduce un número entero:");
        String enteroCadena = scanner.nextLine();
        
        // Pedir al usuario que introduzca un número decimal
        System.out.println("Por favor, introduce un número decimal:");
        String decimalCadena = scanner.nextLine();
        
        try {
            // Convertir la cadena del número entero a un Integer
            Integer entero = Integer.valueOf(enteroCadena);
            
            // Convertir la cadena del número decimal a un Double
            Double decimal = Double.valueOf(decimalCadena);
            
            // Sumar los valores convertidos
            Double suma = entero + decimal;
            
            // Mostrar el resultado al usuario
            System.out.println("La suma del número entero y el número decimal es: " + suma);
        } catch (NumberFormatException e) {
            // Manejar posibles excepciones de formato de número
            System.out.println("Una de las entradas no es un número válido.");
        }
        
        // Cerrar el Scanner para liberar los recursos
        scanner.close();
    }
}
