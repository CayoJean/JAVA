import java.util.Scanner;

public class EjerciciosComplementarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // 1. Reemplazo de Caracteres
            System.out.println("=== Reemplazo de Caracteres ===");
            System.out.print("Ingresa una frase: ");
            String frase = scanner.nextLine();
            System.out.print("Ingresa el primer carácter (a reemplazar): ");
            char caracter1 = scanner.next().charAt(0);
            System.out.print("Ingresa el segundo carácter (reemplazante): ");
            char caracter2 = scanner.next().charAt(0);
            scanner.nextLine(); // Consumir el salto de línea restante

            String fraseModificada = frase.replace(caracter1, caracter2);
            System.out.println("La frase modificada es: " + fraseModificada);

            // 2. Eliminación de Espacios en Blanco
            System.out.println("\n=== Eliminación de Espacios en Blanco ===");
            System.out.print("Ingresa una frase con espacios en blanco al principio y al final: ");
            String fraseConEspacios = scanner.nextLine();

            String fraseSinEspacios = fraseConEspacios.trim();
            System.out.println("La frase sin espacios en blanco es: '" + fraseSinEspacios + "'");

            // 3. Comparación de Cadenas
            System.out.println("\n=== Comparación de Cadenas ===");
            System.out.print("Ingresa la primera palabra: ");
            String palabra1 = scanner.nextLine();
            System.out.print("Ingresa la segunda palabra: ");
            String palabra2 = scanner.nextLine();

            if (palabra1.equals(palabra2)) {
                System.out.println("Las palabras son iguales.");
            } else {
                System.out.println("Las palabras son diferentes.");
            }

            // 4. Calculando la Longitud de Cadenas sin Espacios
            System.out.println("\n=== Calculando la Longitud de Cadenas sin Espacios ===");
            System.out.print("Ingresa una cadena de texto: ");
            String cadena = scanner.nextLine();

            String cadenaSinEspacios = cadena.replace(" ", "");
            int longitudSinEspacios = cadenaSinEspacios.length();

            System.out.println("La longitud de la cadena sin contar los espacios en blanco es: " + longitudSinEspacios);
        } finally {
            // Cerrar el scanner para evitar la fuga de recursos
            scanner.close();
        }
    }
}
