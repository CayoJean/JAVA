/*import java.util.Scanner;

public class EliminacionEspacios {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        try {
            // Pedir al usuario que ingrese una frase con espacios en blanco al principio y al final
            System.out.print("\n" +
                                "Ingresa una frase con espacios en blanco al principio y al final: ");
            String frase = scanner.nextLine();

            // Eliminar los espacios en blanco al principio y al final
            String fraseSinEspacios = frase.trim();

            // Mostrar la frase resultante en pantalla
            System.out.println("La frase sin espacios en blanco es: '" + fraseSinEspacios + "'");
        } finally {
            // Cerrar el scanner para evitar la fuga de recursos
            scanner.close();
        }
    }
}
*/



import java.util.Scanner;

public class EliminacionEspacios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("=== Eliminación de Espacios en Blanco ===");
            System.out.print("Ingresa una frase con espacios en blanco al principio y al final: ");
            String frase = scanner.nextLine();
            
            String fraseSinEspacios = frase.trim();
            System.out.println("La frase sin espacios en blanco es: '" + fraseSinEspacios + "'");
        } finally {
            scanner.close();
        }
    }
}
