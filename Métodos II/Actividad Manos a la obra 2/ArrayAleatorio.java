import java.util.Random;
import java.util.Scanner;

public class ArrayAleatorio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        // Solicitar al usuario el tamaño del array
        System.out.println();
        System.out.print("\n" +
                        "Ingresa el tamaño del array: ");
        int tamañoArray = scanner.nextInt();

        // Solicitar al usuario el rango mínimo y máximo de los números
        System.out.print("Ingresa el valor mínimo del rango: ");
        int valorMinimo = scanner.nextInt();

        System.out.print("Ingresa el valor máximo del rango: ");
        int valorMaximo = scanner.nextInt();

        // Validar que el tamaño del array y el rango sean válidos
        if (tamañoArray <= 0 || valorMinimo > valorMaximo) {
            System.out.println("Entrada no válida. Asegúrate de que el tamaño del array sea positivo y el valor mínimo sea menor o igual al valor máximo.");
            scanner.close();
            return;
        }

        // Crear el array y llenarlo con números aleatorios
        int[] arrayAleatorio = new int[tamañoArray];
        llenarArrayAleatorio(arrayAleatorio, valorMinimo, valorMaximo);

        // Imprimir el contenido del array
        System.out.println("Contenido del array aleatorio:");
        imprimirArray(arrayAleatorio);

        scanner.close();
    }

    // Método para llenar el array con números aleatorios dentro del rango especificado
    public static void llenarArrayAleatorio(int[] array, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
    }

    // Método para imprimir el array
    public static void imprimirArray(int[] array) {
        for (int numero : array) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
