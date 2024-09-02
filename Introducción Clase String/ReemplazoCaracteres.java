/*import java.util.Scanner;

public class ReemplazoCaracteres {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        try {
            // Pedir al usuario que ingrese una frase
            System.out.print("\n" +
                                "Ingresa una frase: ");
            String frase = scanner.nextLine();

            // Pedir al usuario que ingrese el primer carácter
            System.out.print("Ingresa el primer carácter (a reemplazar): ");
            char caracter1 = scanner.next().charAt(0);

            // Pedir al usuario que ingrese el segundo carácter
            System.out.print("Ingresa el segundo carácter (reemplazante): ");
            char caracter2 = scanner.next().charAt(0);

            // Reemplazar todas las ocurrencias del primer carácter con el segundo carácter
            String fraseModificada = frase.replace(caracter1, caracter2);

            // Mostrar la frase resultante en pantalla
            System.out.println("La frase modificada es: " + fraseModificada);
        } finally {
            // Cerrar el scanner para evitar la fuga de recursos
            scanner.close();
        }
    }
}
*/

import java.util.Scanner;

public class ReemplazoCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("=== Reemplazo de Caracteres ===");
            System.out.print("Ingresa una frase: ");
            String frase = scanner.nextLine();
            System.out.print("Ingresa el primer carácter (a reemplazar): ");
            char caracter1 = scanner.next().charAt(0);
            System.out.print("Ingresa el segundo carácter (reemplazante): ");
            char caracter2 = scanner.next().charAt(0);
            
            String fraseModificada = frase.replace(caracter1, caracter2);
            System.out.println("La frase modificada es: " + fraseModificada);
        } finally {
            scanner.close();
        }
    }
}
