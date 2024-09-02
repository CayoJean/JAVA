import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BusquedaBinaria {
    public static void main(String[] args) {
        // Declarar un array de 10 elementos
        int[] array = new int[10];
        
        // Inicializar el array con valores aleatorios entre 1 y 100
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100) + 1;
        }
        
        // Ordenar el array
        Arrays.sort(array);
        
        // Imprimir el arreglo ordenado
        System.out.println("\n" +
                        "Arreglo ordenado: " + Arrays.toString(array));
        
        // Solicitar al usuario el valor a buscar
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor a buscar: ");
        int valorBuscado = scanner.nextInt();
        
        // Realizar la búsqueda binaria
        int indice = Arrays.binarySearch(array, valorBuscado);
        
        // Imprimir el resultado de la búsqueda
        if (indice >= 0) {
            System.out.println("El valor " + valorBuscado + " se encuentra en el índice: " + indice);
        } else {
            System.out.println("El valor " + valorBuscado + " no está presente en el arreglo.");
        }
        
        scanner.close();
    }
}
