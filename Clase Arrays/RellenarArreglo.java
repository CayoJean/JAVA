import java.util.Arrays;
import java.util.Scanner;

public class RellenarArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el tamaño del arreglo
        System.out.print("\n" +
                        "Ingrese el tamaño del arreglo: ");
        int tamano = scanner.nextInt();

        // Validar que el tamaño sea positivo
        while (tamano <= 0) {
            System.out.println("El tamaño del arreglo debe ser mayor que 0.");
            System.out.print("Ingrese el tamaño del arreglo: ");
            tamano = scanner.nextInt();
        }

        // Solicitar al usuario el número con el que desea rellenar el arreglo
        System.out.print("Ingrese el número con el que desea rellenar el arreglo: ");
        int numero = scanner.nextInt();

        // Crear el arreglo con el tamaño especificado
        int[] arreglo = new int[tamano];

        // Rellenar el arreglo con el número especificado
        Arrays.fill(arreglo, numero);

        // Imprimir el arreglo resultante
        System.out.println("Arreglo resultante:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Índice " + i + ": " + arreglo[i]);
        }

        scanner.close();
    }
}
