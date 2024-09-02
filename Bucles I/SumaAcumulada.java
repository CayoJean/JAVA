public class SumaAcumulada {
    public static void main(String[] args) {
        // Definir un array de enteros
        int[] numeros = {1, 2, 3, 4, 5};

        // Imprimir el array original
        System.out.println("Array original:");
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
