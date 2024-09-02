import java.util.Scanner;

public class ContarEspaciosBlancos {
    public static void main(String[] args) {
        // Crear una instancia de Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que introduzca una cadena
        System.out.println("\n" +
                        "Por favor, introduce una cadena:");
        String entrada = scanner.nextLine();
        
        // Variable para contar los espacios en blanco
        int contadorEspacios = 0;
        
        // Recorrer cada carácter en la cadena
        for (int i = 0; i < entrada.length(); i++) {
            // Si el carácter es un espacio en blanco, incrementar el contador
            if (Character.isWhitespace(entrada.charAt(i))) {
                contadorEspacios++;
            }
        }
        
        // Mostrar el recuento de espacios en blanco al usuario
        System.out.println("La cadena introducida contiene " + contadorEspacios + " espacios en blanco.");
        
        // Cerrar el Scanner para liberar los recursos
        scanner.close();
    }
}

