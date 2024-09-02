import java.util.Scanner;

public class RellenarArray {

    public static void main(String[] args) {
        // Crear el Scanner al principio del programa
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar al usuario el tamaño del arreglo
            System.out.println();
            System.out.print("\n" +
                                "Ingresa el tamaño del arreglo: ");
            int tamañoArray = scanner.nextInt();

            // Validar que el tamaño sea positivo
            if (tamañoArray <= 0) {
                System.out.println("El tamaño del arreglo debe ser un número positivo.");
                return;
            }

            // Crear el arreglo
            int[] array = new int[tamañoArray];

            // Llamar al método para rellenar el arreglo
            rellenarArray(array, scanner);

            // Imprimir el arreglo completo
            System.out.println("Contenido del arreglo:");
            imprimirArray(array);
        } finally {
            // Cerrar el Scanner
            scanner.close();
        }
    }

    // Método para solicitar datos al usuario y rellenar el arreglo
    public static void rellenarArray(int[] array, Scanner scanner) {
        int últimoÍndice = -1;

        while (true) {
            // Solicitar al usuario el número para rellenar el arreglo
            System.out.print("Ingresa el número para rellenar el arreglo: ");
            int numero = scanner.nextInt();

            // Solicitar al usuario el índice hasta el cual quiere rellenar el arreglo
            System.out.print("Ingresa el índice hasta el cual deseas rellenar el arreglo (debe ser mayor que " + últimoÍndice + " y menor que " + (array.length - 1) + "): ");
            int índice = scanner.nextInt();

            // Validar el índice
            if (índice < 0 || índice >= array.length || índice <= últimoÍndice) {
                System.out.println("Índice inválido. Debe ser mayor que el último índice ingresado y menor que el tamaño del arreglo.");
                continue;
            }

            // Rellenar el arreglo con el número proporcionado
            for (int i = últimoÍndice + 1; i <= índice; i++) {
                array[i] = numero;
            }

            // Actualizar el último índice
            últimoÍndice = índice;

            // Verificar si el arreglo está completamente rellenado
            if (últimoÍndice == array.length - 1) {
                break;
            }

            // Preguntar si el usuario desea continuar
            System.out.print("¿Deseas ingresar otro número y rango? (s/n): ");
            String respuesta = scanner.next();
            if (!respuesta.equalsIgnoreCase("s")) {
                break;
            }
        }
    }

    // Método para imprimir el arreglo
    public static void imprimirArray(int[] array) {
        for (int numero : array) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
