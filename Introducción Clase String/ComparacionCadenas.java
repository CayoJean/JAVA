/*import java.util.Scanner;

public class ComparacionCadenas {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        try {
            // Pedir al usuario que ingrese la primera palabra
            System.out.print("\n" +
                                "Ingresa la primera palabra: ");
            String palabra1 = scanner.nextLine();

            // Pedir al usuario que ingrese la segunda palabra
            System.out.print("Ingresa la segunda palabra: ");
            String palabra2 = scanner.nextLine();

            // Comparar las dos palabras
            if (palabra1.equals(palabra2)) {
                System.out.println("Las palabras son iguales.");
            } else {
                System.out.println("Las palabras son diferentes.");
            }
        } finally {
            // Cerrar el scanner para evitar la fuga de recursos
            scanner.close();
        }
    }
}
*/


import java.util.Scanner;

public class ComparacionCadenas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("=== Comparación de Cadenas ===");
            System.out.print("Ingresa la primera palabra: ");
            String palabra1 = scanner.nextLine();
            System.out.print("Ingresa la segunda palabra: ");
            String palabra2 = scanner.nextLine();
            
            if (palabra1.equals(palabra2)) {
                System.out.println("Las palabras son iguales.");
            } else {
                System.out.println("Las palabras son diferentes.");
            }
        } finally {
            scanner.close();
        }
    }
}
