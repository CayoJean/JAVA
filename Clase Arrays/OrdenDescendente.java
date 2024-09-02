import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class OrdenDescendente {
    public static void main(String[] args) {
        // Declarar un array de 10 elementos
        Integer[] array = new Integer[10];
        
        // Inicializar el array con valores aleatorios entre 1 y 100
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100) + 1;
        }
        
        // Imprimir el arreglo inicial
        System.out.println("\n" +
                        "Arreglo inicial: " + Arrays.toString(array));
        
        // Ordenar el arreglo en forma descendente
        Arrays.sort(array, Collections.reverseOrder());
        
        // Imprimir el arreglo ordenado
        System.out.println("Arreglo ordenado en forma descendente: " + Arrays.toString(array));
    }
}
