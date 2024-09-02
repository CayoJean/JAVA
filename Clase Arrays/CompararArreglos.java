import java.util.Arrays;

public class CompararArreglos {
    public static void main(String[] args) {
        // Declarar dos arreglos de enteros
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 4, 6};

        // Comparar los primeros dos arreglos
        boolean sonIguales1 = Arrays.equals(array1, array2);
        
        // Comparar el primer arreglo con el tercero
        boolean sonIguales2 = Arrays.equals(array1, array3);
        
        // Imprimir los resultados de las comparaciones
        System.out.println("\n" + 
                        "¿Array1 es igual a Array2?: " + sonIguales1);
        System.out.println("¿Array1 es igual a Array3?: " + sonIguales2);
    }
}
