import java.util.Scanner;

public class VerificarLetras {
    public static void main(String[] args) {
        // Crear una instancia de Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que introduzca una cadena
        System.out.println("\n" +
                        "Por favor, introduce una cadena:");
        String entrada = scanner.nextLine();
        
        // Variable para verificar si todos los caracteres son letras
        boolean soloLetras = true;
        
        // Recorrer cada carácter en la cadena
        for (int i = 0; i < entrada.length(); i++) {
            // Si algún carácter no es una letra, cambiar soloLetras a false y salir del bucle
            if (!Character.isLetter(entrada.charAt(i))) {
                soloLetras = false;
                break;
            }
        }
        
        // Mostrar el resultado al usuario
        if (soloLetras) {
            System.out.println("La cadena introducida contiene solo letras.");
        } else {
            System.out.println("La cadena introducida no contiene solo letras.");
        }
        
        // Cerrar el Scanner para liberar los recursos
        scanner.close();
    }
}
