import java.util.Arrays;
import java.util.Scanner;

public class ComplementarioRellenarArregloPersonalizado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n" +
                        "Ingrese el tamaño del arreglo: ");
        int tamano = scanner.nextInt();

        while (tamano <= 0) {
            System.out.println("El tamaño del arreglo debe ser mayor que 0.");
            System.out.print("Ingrese el tamaño del arreglo: ");
            tamano = scanner.nextInt();
        }

        int[] arreglo = new int[tamano];
        int ultimoIndice = 0;

        while (ultimoIndice < tamano) {
            System.out.print("Ingrese el número con el que desea rellenar el arreglo: ");
            int numero = scanner.nextInt();

            System.out.print("Ingrese el índice hasta el cual desea rellenar el arreglo (debe ser mayor que " + ultimoIndice + " y menor que " + tamano + "): ");
            int indice = scanner.nextInt();

            while (indice < ultimoIndice || indice > tamano) {
                System.out.println("Índice inválido. Debe ser mayor que " + ultimoIndice + " y menor que " + tamano + ".");
                System.out.print("Ingrese el índice hasta el cual desea rellenar el arreglo: ");
                indice = scanner.nextInt();
            }

            Arrays.fill(arreglo, ultimoIndice, indice , numero);
            ultimoIndice = indice;
        }

        System.out.println("Arreglo resultante:");
        System.out.println(Arrays.toString(arreglo));

        scanner.close();
    }
}
