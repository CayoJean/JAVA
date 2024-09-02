public class LosDosEjerciciosComplemtarios {
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
        System.out.println();

        // Calcular la suma acumulada y reemplazar cada elemento
        for (int i = 1; i < numeros.length; i++) {
            numeros[i] += numeros[i - 1];
        }

        // Imprimir el array con la suma acumulada
        System.out.println("Array con suma acumulada:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
