public class ImprimirArrays {

    public static void main(String[] args) {
        // Ejemplo de uso de los métodos
        int[] arrayInt = {1, 2, 3, 4, 5};
        String[] arrayString = {"Hola", "Mundo", "Java"};
        int[][] arrayIntBidimensional = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        String[][] arrayStringBidimensional = {{"Uno", "Dos"}, {"Tres", "Cuatro"}};

        System.out.println();
        System.out.println("\n" +
                        "Array de enteros:");
        imprimirArray(arrayInt);

        System.out.println("\nArray de cadenas:");
        imprimirArray(arrayString);

        System.out.println("\nArray bidimensional de enteros:");
        imprimirArray(arrayIntBidimensional);

        System.out.println("\nArray bidimensional de cadenas:");
        imprimirArray(arrayStringBidimensional);
    }

    // Método para imprimir un array de enteros
    public static void imprimirArray(int[] array) {
        if (array == null) {
            System.out.println("El array es null.");
            return;
        }
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Sobrecarga del método para imprimir un array de cadenas
    public static void imprimirArray(String[] array) {
        if (array == null) {
            System.out.println("El array es null.");
            return;
        }
        for (String str : array) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    // Sobrecarga del método para imprimir un array bidimensional de enteros
    public static void imprimirArray(int[][] array) {
        if (array == null) {
            System.out.println("El array es null.");
            return;
        }
        for (int[] fila : array) {
            for (int num : fila) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    // Sobrecarga del método para imprimir un array bidimensional de cadenas
    public static void imprimirArray(String[][] array) {
        if (array == null) {
            System.out.println("El array es null.");
            return;
        }
        for (String[] fila : array) {
            for (String str : fila) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }
}
