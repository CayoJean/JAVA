import java.util.Scanner;

public class EncontrandoMaximo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Crear un array para almacenar cinco elementos enteros
        int[] numeros = new int[5];

        // Pedir al usuario que ingrese los números
        System.out.println("\n" +
                        "Ingrese cinco números enteros:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Encontrar el máximo elemento manualmente
        int maximo = numeros[0];
        for (int i = 1; i < 5; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }

        // Imprimir el resultado por consola
        System.out.println("El máximo de los elementos es: " + maximo);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
