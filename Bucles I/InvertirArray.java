public class InvertirArray {
    public static void main(String[] args) {
        // Definir un array de enteros
        int[] numeros = {25, 10, 47, 3, 56, 13, 8};

        // Imprimir el array original
        System.out.println("Array original:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        // Invertir el array
        int n = numeros.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[n - i - 1];
            numeros[n - i - 1] = temp;
        }

        // Imprimir el array invertido
        System.out.println("Array invertido:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
