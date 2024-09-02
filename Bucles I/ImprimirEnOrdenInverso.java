public class ImprimirEnOrdenInverso {
    public static void main(String[] args) {
        // Definir un array de enteros
        int[] numeros = {25, 10, 47, 3, 56, 13, 8};
        System.out.println("\n");
        // Recorrer el array en orden inverso y mostrar cada elemento
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
