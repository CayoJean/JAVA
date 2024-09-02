public class EncontrarValorMinimo {
    public static void main(String[] args) {
        // Definir un array de enteros
        int[] numeros = {25, 10, 47, 3, 56, 13, 8};

        // Inicializar el valor mínimo con el primer elemento del array
        int valorMinimo = numeros[0];

        // Recorrer el array para encontrar el valor mínimo
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < valorMinimo) {
                valorMinimo = numeros[i];
            }
        }

        // Imprimir el valor mínimo encontrado
        System.out.println("\n" +
                        "El valor mínimo en el array es: " + valorMinimo);
    }
}
